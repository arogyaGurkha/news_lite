package gui;

import database.SQLite;

import javax.swing.*;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonColumn extends AbstractCellEditor implements TableCellRenderer, TableCellEditor, ActionListener {
    JTable table;
    JButton renderButton;
    JButton editButton;
    String text;

    public ButtonColumn(JTable table, int column) {
        super();
        this.table = table;
        renderButton = new JButton();

        editButton = new JButton();
        editButton.setFocusPainted(false);
        editButton.addActionListener(this);

        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(column).setCellRenderer(this);
        columnModel.getColumn(column).setCellEditor(this);
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (hasFocus) {
            renderButton.setForeground(table.getForeground());
            renderButton.setBackground(UIManager.getColor("Button.background"));
            renderButton.setIcon(Gui.DELETE_ICO);
        } else if (isSelected) {
            renderButton.setForeground(table.getSelectionForeground());
            //renderButton.setBackground(table.getSelectionBackground());
            renderButton.setIcon(Gui.DELETE_ICO);
        } else {
            renderButton.setForeground(table.getForeground());
            renderButton.setBackground(UIManager.getColor("Button.background"));
            renderButton.setIcon(Gui.DELETE_ICO);
        }
        //renderButton.setText((value == null) ? ";" : value.toString() );
        return renderButton;
    }

    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        //text = (value == null) ? ";" : value.toString();
        //editButton.setText( text );
        return editButton;
    }

    public Object getCellEditorValue() {
        return text;
    }

    public void actionPerformed(ActionEvent e) {
        SQLite sqlite = new SQLite();
        fireEditingStopped();
        int row_with_source = table.getSelectedRow();
        int row_with_exlude_word = Gui.tableForAnalysis.getSelectedRow();
        int del_row_with_exlude_word = 0;

        // определяем активное окно
        Window window = FocusManager.getCurrentManager().getActiveWindow();
        int activeWindow = 0;
        if (window.toString().contains("Avandy")) {
            activeWindow = 1;
        }
        if (window.toString().contains("Sources")) {
            activeWindow = 2;
        }
        if (window.toString().contains("Excluded")) {
            activeWindow = 3;
            del_row_with_exlude_word = Dialogs.table.getSelectedRow();
        }

        // окно таблицы с анализом частоты слов на основной панели (добавляем в базу)
        if (activeWindow == 1 && row_with_exlude_word != -1) {
            row_with_exlude_word = Gui.tableForAnalysis.convertRowIndexToModel(row_with_exlude_word);
            String source = (String) Gui.modelForAnalysis.getValueAt(row_with_exlude_word, 1);
            // удаление из диалогового окна
            Gui.modelForAnalysis.removeRow(row_with_exlude_word);
            // добавление в базу данных и файл excluded.txt
            sqlite.insertNewExcludedWord(source);
        }

        // окно источников RSS
        if (activeWindow == 2 && row_with_source != -1) {
            row_with_source = table.convertRowIndexToModel(row_with_source);
            String source = (String) Dialogs.model.getValueAt(row_with_source, 1);
            // удаление из диалогового окна
            Dialogs.model.removeRow(row_with_source);
            // удаление из файла sources.txt
            //Common.delLine(source, Main.sourcesPath);
            // удаление из базы данных
            sqlite.deleteSource(source);
        }

        // окно с исключенными из анализа слов (удаляем из базы)
        if (activeWindow == 3 && del_row_with_exlude_word != -1) {
            del_row_with_exlude_word = Dialogs.table.convertRowIndexToModel(del_row_with_exlude_word);
            String source = (String) Dialogs.model.getValueAt(del_row_with_exlude_word, 1);
            // удаление из диалогового окна
            Dialogs.model.removeRow(del_row_with_exlude_word);
            // удаление из файла excluded.txt
            //Common.delLine(source, Main.excludedPath);
            // удаление из базы данных
            sqlite.deleteExcluded(source);
        }

    }

}
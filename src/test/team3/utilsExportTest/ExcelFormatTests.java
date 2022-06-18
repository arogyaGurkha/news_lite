package utilsExportTest;

import jxl.format.Border;
import jxl.write.WritableCellFormat;
import jxl.write.WriteException;
import org.junit.Test;
import team3.utils.ExcelFormat;

import static jxl.format.BorderLineStyle.THIN;
import static jxl.format.Colour.*;
import static jxl.format.VerticalAlignment.CENTRE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelFormatTests {

    @Test
    public void hyperlinkCellFormatTest() throws WriteException {
        ExcelFormat excelFormat = new ExcelFormat();

        WritableCellFormat hyperlinkCellFormat = excelFormat.hyperlinkCellFormat();

        assertEquals(hyperlinkCellFormat.getBorderLine(Border.LEFT), THIN);
        assertEquals(hyperlinkCellFormat.getBorderLine(Border.RIGHT), THIN);
        assertEquals(hyperlinkCellFormat.getBorderLine(Border.TOP), THIN);
        assertEquals(hyperlinkCellFormat.getBorderLine(Border.BOTTOM), THIN);
        assertEquals(hyperlinkCellFormat.getBorderColour(Border.LEFT), PALETTE_BLACK);
        assertEquals(hyperlinkCellFormat.getBorderColour(Border.RIGHT), PALETTE_BLACK);
        assertEquals(hyperlinkCellFormat.getBorderColour(Border.TOP), PALETTE_BLACK);
        assertEquals(hyperlinkCellFormat.getBorderColour(Border.BOTTOM), PALETTE_BLACK);
        assertEquals(hyperlinkCellFormat.getVerticalAlignment(), CENTRE);
        assertEquals(hyperlinkCellFormat.getFont().getColour(), DARK_GREEN);
    }

    @Test
    public void titleCellFormatTest() throws WriteException{
        ExcelFormat excelFormat = new ExcelFormat();

        WritableCellFormat titleCellFormat = excelFormat.titleCellFormat();
        
        assertEquals(titleCellFormat.getBorderLine(Border.LEFT), THIN);
        assertEquals(titleCellFormat.getBorderLine(Border.RIGHT), THIN);
        assertEquals(titleCellFormat.getBorderLine(Border.TOP), THIN);
        assertEquals(titleCellFormat.getBorderLine(Border.BOTTOM), THIN);
        assertEquals(titleCellFormat.getBorderColour(Border.LEFT), PALETTE_BLACK);
        assertEquals(titleCellFormat.getBorderColour(Border.RIGHT), PALETTE_BLACK);
        assertEquals(titleCellFormat.getBorderColour(Border.TOP), PALETTE_BLACK);
        assertEquals(titleCellFormat.getBorderColour(Border.BOTTOM), PALETTE_BLACK);
        assertEquals(titleCellFormat.getVerticalAlignment(), CENTRE);
        assertEquals(titleCellFormat.getFont().getColour(), BLACK);
        assertEquals(titleCellFormat.getFont().getBoldWeight(), 400);
    }

    @Test
    public void numberCellFormatTest() throws WriteException {
        ExcelFormat excelFormat = new ExcelFormat();

        WritableCellFormat numberCellFormat = excelFormat.numberCellFormat();

        assertEquals(numberCellFormat.getBorderLine(Border.LEFT), THIN);
        assertEquals(numberCellFormat.getBorderLine(Border.RIGHT), THIN);
        assertEquals(numberCellFormat.getBorderLine(Border.TOP), THIN);
        assertEquals(numberCellFormat.getBorderLine(Border.BOTTOM), THIN);
        assertEquals(numberCellFormat.getBorderColour(Border.LEFT), PALETTE_BLACK);
        assertEquals(numberCellFormat.getBorderColour(Border.RIGHT), PALETTE_BLACK);
        assertEquals(numberCellFormat.getBorderColour(Border.TOP), PALETTE_BLACK);
        assertEquals(numberCellFormat.getBorderColour(Border.BOTTOM), PALETTE_BLACK);
        assertEquals(numberCellFormat.getVerticalAlignment(), CENTRE);
        assertEquals(numberCellFormat.getFont().getColour(), BLACK);
        assertEquals(numberCellFormat.getFont().getBoldWeight(), 400);
    }

    @Test
    public void sourceCellFormatTest() throws WriteException {
        ExcelFormat excelFormat = new ExcelFormat();

        WritableCellFormat sourceCellFormat = excelFormat.sourceCellFormat();

        assertEquals(sourceCellFormat.getBorderLine(Border.LEFT), THIN);
        assertEquals(sourceCellFormat.getBorderLine(Border.RIGHT), THIN);
        assertEquals(sourceCellFormat.getBorderLine(Border.TOP), THIN);
        assertEquals(sourceCellFormat.getBorderLine(Border.BOTTOM), THIN);
        assertEquals(sourceCellFormat.getBorderColour(Border.LEFT), PALETTE_BLACK);
        assertEquals(sourceCellFormat.getBorderColour(Border.RIGHT), PALETTE_BLACK);
        assertEquals(sourceCellFormat.getBorderColour(Border.TOP), PALETTE_BLACK);
        assertEquals(sourceCellFormat.getBorderColour(Border.BOTTOM), PALETTE_BLACK);
        assertEquals(sourceCellFormat.getVerticalAlignment(), CENTRE);
        assertEquals(sourceCellFormat.getFont().getColour(), BLACK);
        assertEquals(sourceCellFormat.getFont().getBoldWeight(), 400);
    }

    @Test
    public void headerCellFormatTest() throws WriteException {
        ExcelFormat excelFormat = new ExcelFormat();

        WritableCellFormat headerCellFormat = excelFormat.headerCellFormat();

        assertEquals(headerCellFormat.getBorderLine(Border.LEFT), THIN);
        assertEquals(headerCellFormat.getBorderLine(Border.RIGHT), THIN);
        assertEquals(headerCellFormat.getBorderLine(Border.TOP), THIN);
        assertEquals(headerCellFormat.getBorderLine(Border.BOTTOM), THIN);
        assertEquals(headerCellFormat.getBorderColour(Border.LEFT), PALETTE_BLACK);
        assertEquals(headerCellFormat.getBorderColour(Border.RIGHT), PALETTE_BLACK);
        assertEquals(headerCellFormat.getBorderColour(Border.TOP), PALETTE_BLACK);
        assertEquals(headerCellFormat.getBorderColour(Border.BOTTOM), PALETTE_BLACK);
        assertEquals(headerCellFormat.getBackgroundColour(), LIGHT_GREEN);
        assertEquals(headerCellFormat.getVerticalAlignment(), CENTRE);
        assertEquals(headerCellFormat.getFont().getColour(), BLACK);
        assertEquals(headerCellFormat.getFont().getBoldWeight(), 700);
    }

    @Test
    public void dateCellFormatTest() throws WriteException {
        ExcelFormat excelFormat = new ExcelFormat();

        WritableCellFormat dataCellFormat = excelFormat.dateCellFormat();

        assertEquals(dataCellFormat.getBorderLine(Border.LEFT), THIN);
        assertEquals(dataCellFormat.getBorderLine(Border.RIGHT), THIN);
        assertEquals(dataCellFormat.getBorderLine(Border.TOP), THIN);
        assertEquals(dataCellFormat.getBorderLine(Border.BOTTOM), THIN);
        assertEquals(dataCellFormat.getBorderColour(Border.LEFT), PALETTE_BLACK);
        assertEquals(dataCellFormat.getBorderColour(Border.RIGHT), PALETTE_BLACK);
        assertEquals(dataCellFormat.getBorderColour(Border.TOP), PALETTE_BLACK);
        assertEquals(dataCellFormat.getBorderColour(Border.BOTTOM), PALETTE_BLACK);
        assertEquals(dataCellFormat.getVerticalAlignment(), CENTRE);
        assertEquals(dataCellFormat.getFont().getColour(), BLACK);
        assertEquals(dataCellFormat.getFont().getBoldWeight(), 400);
    }
    
}

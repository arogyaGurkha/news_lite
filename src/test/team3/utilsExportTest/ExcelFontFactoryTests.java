package utilsExportTest;

import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.write.WritableFont;
import jxl.write.WriteException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import team3.utils.ExcelFontFactory;

import static jxl.format.Colour.DARK_GREEN;
import static jxl.format.UnderlineStyle.NO_UNDERLINE;
import static org.junit.jupiter.api.Assertions.*;

public class ExcelFontFactoryTests {

    @Test
    public void getNoBoldFontTest() throws WriteException {
        ExcelFontFactory excelFontFactory = new ExcelFontFactory();

        WritableFont noBoldFont = excelFontFactory.getNoBoldFont();

        assertEquals(noBoldFont.getBoldWeight(), 400);
        assertEquals(noBoldFont.getPointSize(), 11);
        assertEquals(noBoldFont.getUnderlineStyle(), NO_UNDERLINE);
    }

    @Test
    public void getBoldFontTest() throws WriteException {
        ExcelFontFactory excelFontFactory = new ExcelFontFactory();

        WritableFont boldFont = excelFontFactory.getBoldFont();

        assertEquals(boldFont.getBoldWeight(), 700);
        assertEquals(boldFont.getPointSize(), 11);
        assertEquals(boldFont.getUnderlineStyle(), NO_UNDERLINE);
    }

    @Test
    public void getHyperlinkFontTest() throws WriteException {
        ExcelFontFactory excelFontFactory = new ExcelFontFactory();

        WritableFont boldFont = excelFontFactory.getHyperlinkFont();
        
        assertEquals(boldFont.getColour(), DARK_GREEN);
        assertEquals(boldFont.getPointSize(), 11);
        assertEquals(boldFont.getBoldWeight(), 400);
    }

    @Test
    public void singletonTest() throws WriteException{
        ExcelFontFactory excelFontFactory = new ExcelFontFactory();
        WritableFont noBoldFont1 = excelFontFactory.getNoBoldFont();
        WritableFont noBoldFont2 = excelFontFactory.getNoBoldFont();
        
        assertEquals(noBoldFont1, noBoldFont2);
        assertEquals(System.identityHashCode(noBoldFont1), System.identityHashCode(noBoldFont2));
    }
}

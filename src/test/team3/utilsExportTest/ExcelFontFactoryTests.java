package utilsExportTest;

import jxl.write.WritableFont;
import jxl.write.WriteException;
import org.junit.Test;
import team3.utils.ExcelFontFactory;

import static jxl.format.Colour.DARK_GREEN;
import static jxl.format.UnderlineStyle.NO_UNDERLINE;
import static org.junit.jupiter.api.Assertions.*;

public class ExcelFontFactoryTests {

    /**
     * Purpose : get NoBoldFont from ExcelFontFactory
     * Input : WritableFont noBoldFont = excelFontFactory.getNoBoldFont()
     * Expected : 
     *      noBoldFont.getBoldWeight() = 400
     *      noBoldFont.getPointSize() = 11
     *      noBoldFont.getUnderlineStyle() = NO_UNDERLINE
     */
    @Test
    public void getNoBoldFontTest() throws WriteException {
        ExcelFontFactory excelFontFactory = new ExcelFontFactory();

        WritableFont noBoldFont = excelFontFactory.getNoBoldFont();

        assertEquals(noBoldFont.getBoldWeight(), 400);
        assertEquals(noBoldFont.getPointSize(), 11);
        assertEquals(noBoldFont.getUnderlineStyle(), NO_UNDERLINE);
    }

    /**
     * Purpose : get BoldFont from ExcelFontFactory
     * Input : WritableFont boldFont = excelFontFactory.getBoldFont()
     * Expected : 
     *      boldFont.getBoldWeight() = 700
     *      boldFont.getPointSize() = 11
     *      boldFont.getUnderlineStyle() = NO_UNDERLINE
     */
    @Test
    public void getBoldFontTest() throws WriteException {
        ExcelFontFactory excelFontFactory = new ExcelFontFactory();

        WritableFont boldFont = excelFontFactory.getBoldFont();

        assertEquals(boldFont.getBoldWeight(), 700);
        assertEquals(boldFont.getPointSize(), 11);
        assertEquals(boldFont.getUnderlineStyle(), NO_UNDERLINE);
    }

    /**
     * Purpose : get HyperLinkFont from ExcelFontFactory
     * Input : WritableFont hyperlinkFont = excelFontFactory.getHyperlinkFont()
     * Expected : 
     *      boldFont.getColour() = DARK_GREEN
     *      boldFont.getPointSize() = 11
     *      boldFont.getBoldWeight() = 400
     */
    @Test
    public void getHyperlinkFontTest() throws WriteException {
        ExcelFontFactory excelFontFactory = new ExcelFontFactory();

        WritableFont hyperlinkFont = excelFontFactory.getHyperlinkFont();
        
        assertEquals(hyperlinkFont.getColour(), DARK_GREEN);
        assertEquals(hyperlinkFont.getPointSize(), 11);
        assertEquals(hyperlinkFont.getBoldWeight(), 400);
    }

    /**
     * Purpose : get Fonts from ExcelFontFactory are SingleTon Object 
     * Input : WritableFont noBoldFont1 = excelFontFactory.getNoBoldFont();
     *         WritableFont noBoldFont2 = excelFontFactory.getNoBoldFont();
     *
     * Expected : 
     *      noBoldFont1 == noBoldFont2
     */
    @Test
    public void singletonTest() throws WriteException{
        ExcelFontFactory excelFontFactory = new ExcelFontFactory();
        WritableFont noBoldFont1 = excelFontFactory.getNoBoldFont();
        WritableFont noBoldFont2 = excelFontFactory.getNoBoldFont();
        
        assertEquals(noBoldFont1, noBoldFont2);
        assertEquals(System.identityHashCode(noBoldFont1), System.identityHashCode(noBoldFont2));
    }
}

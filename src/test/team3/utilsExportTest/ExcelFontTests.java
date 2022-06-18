package utilsExportTest;

import jxl.write.WritableFont;
import jxl.write.WriteException;
import org.junit.Test;
import team3.utils.ExcelFont;

import static jxl.format.Colour.BLACK;
import static jxl.format.UnderlineStyle.NO_UNDERLINE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ExcelFontTests {

    /**
     * Purpose : To make sure that WritableFont.Builder is created with the correct values
     * Input : boldFont, noBoldFont
     * Expected : 
     *      boldFont != noBoldFont
     *      boldFont.getBoldWeight != noBoldFont.getBoldWeight
     */
    @Test
    public void createExcelFontTest() throws WriteException {
        WritableFont boldFont = new ExcelFont.Builder()
                .bold()
                .isItalic(true)
                .pointSize(11)
                .color(BLACK)
                .underlineStyle(NO_UNDERLINE)
                .build();

        assertEquals(boldFont.getColour(), BLACK);
        assertEquals(boldFont.getBoldWeight(), 700);
        assertEquals(boldFont.getPointSize(), 11);
        assertEquals(boldFont.getUnderlineStyle(), NO_UNDERLINE);
    
        WritableFont noBoldFont = new ExcelFont.Builder()
                .noBold()
                .build();
        
        assertEquals(noBoldFont.getBoldWeight(), 400);
        
        assertNotEquals(boldFont, noBoldFont);
    }
}

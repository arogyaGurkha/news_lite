package team3.utilsExportTest;

import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.write.WritableFont;
import jxl.write.WriteException;
import org.junit.jupiter.api.Test;
import team3.utils.ExcelFont;

import static jxl.format.UnderlineStyle.NO_UNDERLINE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ExcelFontTest {

    @Test
    public void createExcelFontTest() throws WriteException {
        WritableFont boldFont = new ExcelFont.Builder()
                .bold()
                .isItalic(true)
                .pointSize(11)
                .color(Colour.BLACK)
                .underlineStyle(NO_UNDERLINE)
                .build();

        assertEquals(boldFont.getColour(), Colour.BLACK);
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

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveResultToFileTest {

    @Test
    public void testZapisJson() throws IOException {
        SaveResultToFile saveResultToFile = new SaveResultToFile();

        ResultVat resultVat = new ResultVat();
        resultVat.setCountryName("Moje zeme");
        resultVat.setHighRate(new BigDecimal("12.5"));
        resultVat.setLowRate(new BigDecimal(9.1));

        Path path = Paths.get("test.json");

        saveResultToFile.writeToJsonFile(resultVat, path);
    }

    @Test
    public void testZapisText() throws IOException {
        SaveResultToFile saveResultToFile = new SaveResultToFile();

        ResultVat resultVat = new ResultVat();
        resultVat.setCountryName("Jina zeme");
        resultVat.setHighRate(new BigDecimal("15.5"));
        resultVat.setLowRate(new BigDecimal(19.0));

        Path path = Paths.get("test.txt");

        saveResultToFile.writeToTxt(resultVat, path);
    }
}

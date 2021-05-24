import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SaveResultToFile {

    public void writeToJsonFile(ResultVat resultVat, Path filePath) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.writeValue(filePath.toFile(), resultVat);
    }

    public void writeToTxt(ResultVat resultVat, Path filePath) throws IOException {

        String out = "["+resultVat.getCountryName()+":<"+resultVat.getLowRate()+"---"+resultVat.getHighRate()+">]";

        Files.write(filePath, List.of(out), StandardCharsets.UTF_8);
    }
}

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDataMapper {

    public VatData jsonStringToVatData(String jsonString) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        //TODO nastavit preskoceni neznamych promennych v JSON

        VatData vatData = objectMapper.readValue(jsonString, VatData.class);

        return vatData;

    }

}

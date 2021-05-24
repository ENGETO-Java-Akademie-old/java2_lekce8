import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.math.BigDecimal;

public class CustomDeserializer extends StdDeserializer<BigDecimal> {

    public CustomDeserializer(){
        this(null);
    }

    public CustomDeserializer(Class<BigDecimal> t){
        super(t);
    }

    @Override
    public BigDecimal deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {

        String hodnota = jsonParser.getText();

        System.out.println("CustomDeserializer:"+hodnota);

        if (hodnota == "false"){
            return null;
        }

        return new BigDecimal(hodnota);
    }
}

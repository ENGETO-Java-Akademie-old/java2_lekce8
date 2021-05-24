import java.util.Comparator;

public class DataAnalyzerService {

    public VatValue getLowestVat(VatData vatData){

        return vatData.getRates().values().stream().min(Comparator.comparing(VatValue::getStandardRate)).orElse(null);

    }
}

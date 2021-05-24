import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test");

        DataDownloader dataDownloader = new DataDownloader();
        String result = "";
        try {
            result = dataDownloader.downloadData();
            System.out.println(result);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JsonDataMapper jsonDataMapper = new JsonDataMapper();
        VatData vatData = null;
        try {
            vatData = jsonDataMapper.jsonStringToVatData(result);

            System.out.println(vatData.getLastUpdate());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


        DataAnalyzerService dataAnalyzerService = new DataAnalyzerService();

        VatValue lowestVat = dataAnalyzerService.getLowestVat(vatData);
        System.out.println(lowestVat.getCountry() +" : "+lowestVat.getStandardRate());


    }
}

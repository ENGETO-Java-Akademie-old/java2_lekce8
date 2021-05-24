import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DataDownloader {

    public String downloadData() throws IOException, InterruptedException {

        String url = "https://euvatrates.com/rates.json";

        //1. Definice URL
        //2. Incializce HTTP Clienta
        //3. Vytvoreni HTTP Requestu
        //4. Zpracovani vysledku HTTP Requestu

        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpRequest httpRequest = HttpRequest.newBuilder(URI.create(url)).GET().build();

        HttpResponse response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        return response.body().toString();
    }

}

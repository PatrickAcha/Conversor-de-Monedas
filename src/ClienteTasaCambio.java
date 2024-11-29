import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ClienteTasaCambio {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/debc00603b4449257fd6c6a8/latest/USD";

    public JsonObject obtenerTasasCambio() throws IOException, InterruptedException {
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder().uri(URI.create(API_URL)).build();
        HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());

        if (respuesta.statusCode() == 200) {
            Gson gson = new Gson();
            JsonObject tasas = gson.fromJson(respuesta.body(), JsonObject.class).getAsJsonObject("conversion_rates");
            System.out.println("Tasas de cambio obtenidas: " + tasas);
            return tasas;
        } else {
            throw new IOException("Error en la solicitud: " + respuesta.statusCode());
        }
    }
}


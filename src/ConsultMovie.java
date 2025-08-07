import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ConsultMovie{

    Movie searchMovie(int movieNumber){
        URI address = URI.create("https://swapi.py4e.com/api/films/" + movieNumber);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();
    }
}
//System.out.println("Write in numbers movie do you search");
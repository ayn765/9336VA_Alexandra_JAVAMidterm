package json.parser;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class PracticeConnect2 {

    public static void main(String[] args) {
        System.out.println("### NewsScript! v1.0: Get Daily News ###");
        String API_KEY = "68d25aaee81b4d12808e66817ed4228c";

        HttpClient client = HttpClient.newHttpClient();

        var httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(String.format("https://newsapi.org/v2/top-headlines?sources=techcrunch&apiKey=%s", API_KEY)))
                .GET()
                .build();

        try {
            var response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            //System.out.println(response.body());

            NewsDTO obj = new Gson().fromJson(response.body(), NewsDTO.class);

            //System.out.println(obj.articles);

            for (ArticleDTO art : obj.articles) {
                System.out.println("### " + art.title + " ### \n");

                System.out.println(art.description);
                System.out.println("\nRead more: " + art.url + "\n");


            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}

class NewsDTO {
    String status;
    int totalResults;
    ArrayList<ArticleDTO> articles;
}

class ArticleDTO {
    SourceDTO source;
    String author;
    String title;
    String description;
    String url;
}


class SourceDTO {
    String id;
    String name;
}
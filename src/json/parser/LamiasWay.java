package json.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class LamiasWay {

    public static void main(String[] args) throws Exception {
//getting my key
        String sURL = "https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=68d25aaee81b4d12808e66817ed4228c";
        NewsDataClass news = null;
        List<NewsDataClass> list1 = new ArrayList<>();
        URL url1 = new URL(sURL);
        URLConnection request = url1.openConnection();//establish the connection with the server
        request.connect();
        JsonArray jsonArray = null;
        JsonObject rootObj = null;
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        if (root instanceof JsonObject) {
            rootObj = root.getAsJsonObject();
        } else if (root instanceof JsonArray) {
            jsonArray = root.getAsJsonArray();
        }
        if (jsonArray == null)
            jsonArray = rootObj.getAsJsonArray("articles");//Storing J object in the Array
//Initialize Fields
        String source = null;
        String author = null;
        String title = null;
        String description = null;
        String url = null;
        String urlToImage = null;
        String publishedAt = null;
        String content = null;
        for (int i = 0; i < ((JsonArray) jsonArray).size() - 1; i++) {

            try {
                JsonObject jsonobject = jsonArray.get(i).getAsJsonObject();
                source = jsonobject.get("source").toString();
                System.out.println(source);
                author = jsonobject.get("author").toString();
                System.out.println(author);
                title = jsonobject.get("title").toString();
                System.out.println(title);
                description = jsonobject.get("description").toString();
                System.out.println(description);
                url = jsonobject.get("url").toString();
                System.out.println(url);
                urlToImage = jsonobject.get("urlToImage").toString();
                System.out.println(urlToImage);
                publishedAt = jsonobject.get("publishedAt").toString();
                System.out.println(publishedAt);
                content = jsonobject.get("content").toString();
                System.out.println(content);

//Object of HeadlineNews
                news = new NewsDataClass(author, title, description, url, urlToImage, publishedAt, content);
                list1.add(news);


            } catch (Exception ex) {

            }
        }

    }
}

package main;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class QuoteService {

    private static final String QUOTE_API = "https://type.fit/api/quotes";

    public static String getRandomQuote() {
        try {
            URL url = new URL(QUOTE_API);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            InputStreamReader reader = new InputStreamReader(conn.getInputStream());
            JsonArray jsonArray = JsonParser.parseReader(reader).getAsJsonArray();

            // Choose a random quote
            JsonElement randomQuote = jsonArray.get((int) (Math.random() * jsonArray.size()));
            String quote = randomQuote.getAsJsonObject().get("text").getAsString();
            String author = randomQuote.getAsJsonObject().get("author").getAsString();
            return quote + " - " + (author == null ? "Unknown" : author);

        } catch (Exception e) {
            e.printStackTrace();
            return "Error fetching quote.";
        }
    }
}
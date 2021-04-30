import java.net.*;
public class URLDepthPair {

    private final String currentURL;// текущая ссылуа
    private final int currentDepth;// текущая глубина

    public URLDepthPair(String URL, int depth) {
        currentURL = URL;
        currentDepth = depth;
    }

    public String getURL() {
        return currentURL;
    }

    public int getDepth() {
        return currentDepth;
    }

    public String toString() {
        String stringDepth = Integer.toString(currentDepth);// из числа в строку
        return stringDepth + '\t' + currentURL;
    }

    public String getDocPath() {
        try {
            URL url = new URL(currentURL);
            return url.getPath();
        }
        catch (MalformedURLException e) {
            return null;
        }
    }

    public String getWebHost() {
        try {
            URL url = new URL(currentURL);
            return url.getHost();
        }
        catch (MalformedURLException e) {
            return null;
        }
    }
}
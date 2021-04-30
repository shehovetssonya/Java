import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException // добавлино исключение
    {

        String[] arg = new String[] {"http://mil.ru/","1"};
        int depth = 0;
        try {
            depth = Integer.parseInt(arg[1]);// делает из строки число
        }
        catch (NumberFormatException nfe) {
            System.out.println("usage: java Crawler <URL> <depth>");
            System.exit(1);
        }
        LinkedList<URLDepthPair> pendingURLs = new LinkedList<URLDepthPair>();// рассматриваемые ссылки
        LinkedList<URLDepthPair> processedURLs = new LinkedList<URLDepthPair>();// обработаные ссылки
        URLDepthPair currentDepthPair = new URLDepthPair(arg[0], 0);// текущая глубина
        pendingURLs.add(currentDepthPair);// добовления ссылки в список
        ArrayList<String> seenURLs = new ArrayList<String>();// видемые ссылки
        seenURLs.add(currentDepthPair.getURL());

        while (pendingURLs.size() != 0) {
            URLDepthPair depthPair = pendingURLs.pop();// получение с удалением элемента
            processedURLs.add(depthPair);
            int myDepth = depthPair.getDepth();// узнаем глубину
            LinkedList<String> linksList;
            linksList = Crawler.getAllLinks(depthPair);
            if (myDepth < depth) // текущая глубина меньше основной
            {
                for (int i=0;i<linksList.size();i++) {
                    String newURL = linksList.get(i);// содержатся ли видемая ссылка из списка
                    if (seenURLs.contains(newURL)) {
                        continue;
                    }
                    else // уиличение глубины
                        {
                        URLDepthPair newDepthPair = new URLDepthPair(newURL, myDepth + 1);
                        pendingURLs.add(newDepthPair);
                        seenURLs.add(newURL);
                    }
                }
            }
        }
        Iterator<URLDepthPair> iter = processedURLs.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
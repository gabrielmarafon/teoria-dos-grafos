package WebCrawler;

public class App {
  public static void main(String[] args) {
    WebCrawler crawler = new WebCrawler();
    String rootURL = "https://videira.atende.net/";
    crawler.discoverWeb(rootURL);
  }
}

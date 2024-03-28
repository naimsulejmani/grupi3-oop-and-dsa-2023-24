package oop.enums;

public enum SearchEngine {
    GOOGLE("https://www.google.com"),
    YAHOO("https://www.yahoo.com"),
    BING("https://www.bing.com");

    private final String url;

    private SearchEngine(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void print() {
        System.out.printf("Search engine %s points at this url %s %n",
                this.toString(), this.url);
    }
}








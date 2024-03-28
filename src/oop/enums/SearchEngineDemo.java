package oop.enums;

public class SearchEngineDemo {
    public static void main(String[] args) {
        SearchEngine se1 = SearchEngine.GOOGLE;

        se1.print();

        SearchEngine.YAHOO.print();
    }
}

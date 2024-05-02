package oop.inheritance.example2;

public class RockDemo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Granite granite = new Granite();
        IgneousRock granite1 = new Granite();
        Rock granite2 = new Granite();
        // femija mundet me u ruajt ne reference te prindit
        // mirepo kur ruhet tek prindi i sheh vetem metodat qe i ka prindi
        // mirepo sjellja eshte e femise perseri

        Granite granite3 =
                (Granite) Class.forName("oop.inheritance.example2.Granite").newInstance();
    }
}

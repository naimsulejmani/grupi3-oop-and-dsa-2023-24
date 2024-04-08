package oop.enums.detyrat;

public class RatingDemo {
    public static void main(String[] args) {
        Rating vlersimiProfesGezim = Rating.FIVE_STAR;
        Rating vlersimProfesNaim = Rating.TWO_STAR;
        Rating vlersimiIAdnanit = Rating.ZERO_STAR;

        System.out.println(vlersimiProfesGezim);
        System.out.println(vlersimiProfesGezim.getStars());

        System.out.printf("Gezimi -> %s %n", vlersimiProfesGezim.getStars());
        System.out.printf("Naimi -> %s %n", vlersimProfesNaim.getStars());
        System.out.printf("Adnani -> %s %n", vlersimiIAdnanit.getStars());
    }
}

package oop.inheritance.ushtrime2;

public class Demo {
    public static void main(String[] args) {
        Z z = new Z();
        z.a();
        z.b();
        System.out.println(z.toString());

        // me pyet z a je pasardhes i nje prej klasave

        if (z instanceof Y) {
            //femija mundet me u ruajt te prindi pa casting (upcasting)
            Y y = z;
            y.a();
            // y.b(); // prindi nuk e din se cka ka femija extra, smundemi me thirr b()
            System.out.println(y.toString());
        }

    }
}

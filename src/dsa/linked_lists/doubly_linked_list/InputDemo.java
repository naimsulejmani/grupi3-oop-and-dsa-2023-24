package dsa.linked_lists.doubly_linked_list;

public class InputDemo {
    public static void main(String[] args) {
        Input input1 =
                new Input("emri", "emri", "Naim", "text", null, null);
        Input input2 =
                new Input("mbiemri", "mbiemri", "Sulejmani", "text", null, null);

        Input input3 = new Input("chb1", null, null, "checkbox", null, null);
        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);
    }
}

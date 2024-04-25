package oop.composition_aggregation.html;

public class InputDemo {
    public static void main(String[] args) {
        Input input1 =
                new Input("username", "username"
                        , InputType.TEXT, null, null
                        , null, "Enter username here!");

        Input input2 = new Input("password", "password"
                , InputType.PASSWORD, "Enter password here!"
        );

        Input input3 = new Input("rememberMe", "rememberMe"
                , InputType.CHECKBOX, null);

        System.out.println(input1.toString());
        System.out.println(input2);
        System.out.println(input3);
    }
}

package oop.composition_aggregation.html;

public enum InputType {
    TEXT("text"),
    PASSWORD("password"),
    NUMBER("number"),
    DATE("date"),
    CHECKBOX("checkbox"),
    RADIO("radio");

    private final String value;

    InputType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toHtmlAttribute() {
        return String.format("type=\"%s\"", value);//type="text"
    }
}








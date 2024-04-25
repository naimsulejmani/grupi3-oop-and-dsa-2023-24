package oop.composition_aggregation.html;

public class Input {
    private String id;
    private String name;
    private InputType type = InputType.TEXT; // InputType enum
    private String value;
    private String className;
    private String style;
    private String placeHolder;

    public Input(String id, String name, InputType type, String value, String className, String style, String placeHolder) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.value = value;
        this.className = className;
        this.style = style;
        this.placeHolder = placeHolder;
    }

    public Input(String id, String name, InputType type, String placeHolder) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.placeHolder = placeHolder;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InputType getType() {
        return type;
    }

    public void setType(InputType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("<input ");
        if(id!=null)
            builder.append(String.format("id=\"%s\" ", id));
        if(name!=null)
            builder.append(String.format("name=\"%s\" ", name));
        if(type!=null)
            builder.append(String.format("%s ", type.toHtmlAttribute()));
        if(value!=null)
            builder.append(String.format("value=\"%s\" ", value));
        if(className!=null)
            builder.append(String.format("class=\"%s\" ", className));
        if(style!=null)
            builder.append(String.format("style=\"%s\" ", style));
        if(placeHolder!=null)
            builder.append(String.format("placeholder=\"%s\"", placeHolder));
        builder.append(" />");
        return builder.toString();
    }
}

package dsa.linked_lists.doubly_linked_list;

public class Input {
    private String id;
    private String name;
    private String value;
    private String type; // InputType.RADIO, ...
    private String className;
    private String style;


    public Input(String id, String name, String value, String type, String className, String style) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.type = type;
        this.className = className;
        this.style = style;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append("<input ");
        if (id != null)
            sb.append(String.format("id=\"%s\" ", id));
        if (name != null)
            sb.append(String.format("name=\"%s\" ", name));
        if (type != null)
            sb.append(String.format("type=\"%s\" ", type));
        if (className != null)
            sb.append(String.format("class=\"%s\" ", className));
        if (style != null)
            sb.append(String.format("style=\"%s\" ", style));
        if (value != null)
            sb.append(String.format("value=\"%s\" ", value));
        sb.append("/>");
        return sb.toString();
    }
}












package ch.heigvd.gen2019;

public abstract class OrdersWriter {
    private static StringBuffer sb;

    void start(){
        sb = new StringBuffer();
    }

    void append(Object o){
        sb.append(o.toString());
    }

    void newNode(String s){
        append("\"" + s + "\": ");
    }

    void newNumericNode(String object, Object value){
        newNode(object);
        append(value);
        append(", ");
    }

    void newTextNode(String object, String value){
        newNode(object);
        append("\"");
        append(value);
        append("\", ");
    }

    void newTabNode(String s){
        newNode(s);
        append("[");
    }

    void delete(int n){
        sb.delete(sb.length() - n, sb.length());
    }

    public String toString() {
        return sb.toString();
    }
}

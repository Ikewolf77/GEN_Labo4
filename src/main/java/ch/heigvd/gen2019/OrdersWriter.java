package ch.heigvd.gen2019;

public abstract class OrdersWriter {
    private static StringBuffer sb;

    void start(){
        sb = new StringBuffer();
    }

    void append(Object o){
        sb.append(o.toString());
    }

    void delete(int n){
        sb.delete(sb.length() - n, sb.length());
    }

    public String toString() {
        return sb.toString();
    }
}

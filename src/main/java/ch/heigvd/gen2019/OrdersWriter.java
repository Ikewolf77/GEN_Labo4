/*
  _______    _______  _____  ___       ___            __       _______     ______   ___  ___
 /" _   "|  /"     "|(\"   \|"  \     |"  |          /""\     |   _  "\   /    " \ (: "||_  |
(: ( \___) (: ______)|.\\   \    |    ||  |         /    \    (. |_)  :) // ____  \|  (__) :|
 \/ \       \/    |  |: \.   \\  |    |:  |        /' /\  \   |:     \/ /  /    ) :)\____  ||
 //  \ ___  // ___)_ |.  \    \. |     \  |___    //  __'  \  (|  _  \\(: (____/ //     _\ '|
(:   _(  _|(:      "||    \    \ |    ( \_|:  \  /   /  \\  \ |: |_)  :)\        /     /" \_|\
 \_______)  \_______) \___|\____\)     \_______)(___/    \___)(_______/  \"_____/     (_______)
 Etudiants : Mattei Simon
 */

package ch.heigvd.gen2019;

import java.util.List;

public abstract class OrdersWriter {
    private StringBuffer sb;

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

    void newTabNode(String s, OrdersWriter[] objects){
        newNode(s);
        append("[");

        for (OrdersWriter object : objects) {
            append(object.getContents());
        }

        if (objects.length > 0) {
            delete(2);
        }

        append("]");
    }

    public void delete(int n){
        sb.delete(sb.length() - n, sb.length());
    }

    public String toString() {
        return sb.toString();
    }

    abstract String getContents();
}

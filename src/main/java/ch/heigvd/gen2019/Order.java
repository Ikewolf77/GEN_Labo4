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

import java.util.ArrayList;
import java.util.List;

public class Order extends OrdersWriter {
    private List<Product> products = new ArrayList<Product>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return id;
    }

    public int getProductsCount() {
        return products.size();
    }

    public Product getProduct(int j) {
        return products.get(j);
    }

    public void AddProduct(Product product) {
        products.add(product);
    }

    public String getContents() {

        start();

        append("{");
        newNumericNode("id",getOrderId());
        newTabNode("products", products.toArray(new OrdersWriter[0]));
        append("}, ");

        return toString();
    }
}

/*
  _______    _______  _____  ___       ___            __       _______     ______    _______
 /" _   "|  /"     "|(\"   \|"  \     |"  |          /""\     |   _  "\   /    " \  /" __   )
(: ( \___) (: ______)|.\\   \    |    ||  |         /    \    (. |_)  :) // ____  \(__/ _) ./
 \/ \       \/    |  |: \.   \\  |    |:  |        /' /\  \   |:     \/ /  /    ) :)   /  //
 //  \ ___  // ___)_ |.  \    \. |     \  |___    //  __'  \  (|  _  \\(: (____/ // __ \_ \\
(:   _(  _|(:      "||    \    \ |    ( \_|:  \  /   /  \\  \ |: |_)  :)\        / (: \__) :\
 \_______)  \_______) \___|\____\)     \_______)(___/    \___)(_______/  \"_____/   \_______)

 Etudiants : Mattei Simon
 */

package ch.heigvd.gen2019;

import java.util.ArrayList;
import java.util.List;

public class Order {
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
}

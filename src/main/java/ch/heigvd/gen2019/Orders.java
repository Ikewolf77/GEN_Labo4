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

public class Orders {
    private List<Order> orders = new ArrayList<Order>();

    public void AddOrder(Order order) {
        orders.add(order);
    }

    public int getOrdersCount() {
        return orders.size();
    }

    public Order getOrder(int i) {
        return orders.get(i);
    }
}

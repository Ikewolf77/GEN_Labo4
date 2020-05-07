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

public class OrdersWriter {
    private Orders orders;

    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

    public String getContents() {
        return orders.getOrdersContents();
    }

}
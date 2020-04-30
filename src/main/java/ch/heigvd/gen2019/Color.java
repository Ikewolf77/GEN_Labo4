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

public abstract class Color {
    public abstract String toString();
}

class Red extends Color {
    @Override
    public String toString() {
        return "red";
    }
}

class Blue extends Color {
    @Override
    public String toString() {
        return "blue";
    }
}

class Yellow extends Color {
    @Override
    public String toString() {
        return "yellow";
    }
}

class NullColor extends Color {
    @Override
    public String toString() {
        return "no color";
    }
}

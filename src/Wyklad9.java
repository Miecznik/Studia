public class Wyklad9 {

    /* 01.12 Wykład 9 - Metody

    Pierwszą omawianą metodą powtarzania częśco gkdodu była instrukcja GoTo. Nie sprawdziło się

    inną metodą jest metoda Pythonowa indentacji.

    czym jest metoda - zdefiniowany i nazwany opis czynności definiowany w ciele klasy.

    składa się z nagłówka opisującego jej zewnętrzne właściwości oraz ciała wyszczególniającego czynności.

    Nagłowek opisuje  - kto może z niej korzystać może być:
        Publiczna - wolny dostęp
        Prywatna - może z niej korzystać tylko klasa w której się znajduje.

    Czy jest Stratyczną czy jest Niestatyczną. opisuje czy  musimy stworzyć obiekt tej klasy czy nie.
        Static  -   musi mieć obiekt ?

    Void - Czy i jakiego rezultatu nam dostarcza
        Jeżeli nie dostarcza wyniku to jest void.

    Następnie - nazwa metody. - Musi się zacząc od liter, nie może zaczynać się jako liczba.
    nazwy wszystkich metod zaczynają się małą literą. I kontynoujemy Camel Toe. - Dobra praktyka.

    Potem - w nawiasie umieszczamy parametry - w mainie String[] args

    może też znaleść się linia Throw - oraz except.

    -- Ciało metody --    Blok ujęty w nawiasy klamrowe.
        w deklaracjach zmiennych nie można używać specyfikatorów dostępu.
        odwołania do smiennych definiowanych lokalnie bedą poprzedzone przypisaniem wartości
        nie może zawierać definicji metody. - dotyczy Javy




     */
    public static void fun(){
        int fix1 = 10, fix2;
        System.out.println(fix1);
        System.out.println(fix2); // blad nie zadleklarowana
    }
    public static void main(String[] args) {
    Wyklad9.show();


    }
    public static void show() {
        System.out.println("Hello method");
    }
}

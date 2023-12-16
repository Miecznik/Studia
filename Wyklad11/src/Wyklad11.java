// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Wyklad11 {
    public static void main(String[] args) {


        //na ostatnim wykładzie były metody

        //tłumaczenie na czym polega static.

        //idziemy dalej

        /*
        Paradygmat - przyjęty sposób widzenia w danej dziedzinie, w informatyce jest podobnie

        Paradygmat programowania definiuje sposoób patrzenia programisty na przepływ sterowania i wykonanie programu komputerowego

        Paradygmat Javy - clasy zawirają dane i metody
        zachowanie obiektu - co możemy zrobić z obiektem, czli jakie metory mozęmy wowołać
       ---
       ---

       Czym jest klasa ? opisem rodziny obiektów.

       co zawiera klasa ? Pola, kontreuktora i metody
       po co jest konstruktor ? - celem jest tylko i wyłącznie jedna rzecz - nadanie obiektowy wartości początkowych.


       aby powstał obiekt musimy go stworzyć.

       new Cookie( 10, "raisins"0;)

       proces - Utworzenie obiektu o elementach opisanych przez pola
       - alokowanie w pamięci - sklada się wyłącznie z 2 pól - waga i skłądniki - int i string - alokacja na cały element
       - utworzenie w pamięci zmiennej "this" zainicjowanej odniesieniem do obiektu - zawiera adres naszego obiektu.;
       -  wstępnego zainicjowanie elementów obiektu danymi opisanymi przez inicjatowy zawarte w deklaracjach pól. - poprzez nadanie intowi warość 0 i stringowi wartość NULL
       - Wywołanie konstruktora w celu ostatecznego zainicjowania elementów Obiektu. Zamiast zera nadajemy 10, a Nullowi adres pamięci gdzie raisins został zainicjowany. jeżeli stworzymy dwa obiekty na podstawie jednego literału to będzie odnosić się do tego samego literału
       - Dostarcza w miejsce fabrykacji odniesienia do naszego obiektu - do "new"

       Deklaracja Pół -
       - private jest dostępny tylko dla ciała klasy
       - public - jest dostępny wszędzie, każdy może się do niego odwołać.
       - protected - dostępny tylko z ciała klasy oraz z ciała jego klasy pochodnej.
       + Wartość domyślna

       Zaleca się, aby pola były deklarowane jako prywatne albo chronione, i stworzyć metody dostępowe. Hermetyzatowy.

       Pole klasowym jest pole zadeklarowane ze Static.
       Jest wspólne dla wszystkich obiektów klasy ? Co ?
       Przykład

       Static int val;
        Można się odwołać nie tworząc ani jednego obiektu klasy.
        Jest wspóla dla wszystkich obiektów klasy - tylko daltego że wpisaliśmy static, można zmienić. pewnie zawierają tylko adres lub odnośnik do tej zmiennej.



        klasa Object - klasa domyślna w jawie która jest podstawą WSZYSTKIEGO w javie. Nie zasanawiamy się co tam jest.
        Klasa obiekt jest podstawą do wszystkich klas które mamy.
        możemy ją zmienić na niezmienialną jjeżeli dodamy opis "final"

        Pole klasowym jest pole ze specyfikatorem static
        polem obiektowym jest pole zadeklarowane bez specyfikatrowi static

        w javie mamy 3 rodzaje metod
        -klasowa
        -konstruktorowa - jest metodą, któej nazwa jest identyczna z nazwą klasy i w której definicji nie występuje typ rezultatu
        - obiektową - nie konstruktorową i bez specyfikatora static

        metody klasowe są to opisami czynności które wykonują do wykonania na dostarzonym im obiektach

         */
        new Type(1); // pusta klasa z domyślnym kostruktorem
        new Type();
        // ilość argumentów wskazuje który konstruktora użwyć
        // może być wiele konstruktorów w klasie
        // kostruktory służą temu aby przetworzyć dane wejściowe na takie które będą potrzebne



        }
    }

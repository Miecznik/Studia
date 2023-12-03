public class CwiczeniaPPJ6 {

    public static void main(String[] args) {
        /*
        float arg1 = 3.14f;
        String arg2 = "Hellow World";
        System.out.println(arg1 + "\n" + arg2);
        String arg3 = arg2;
        System.out.println(arg3);

         */


        /* Tablica jako pierwsza struktura danych na naszych zajęciach

        Tablica jest jednorodnym zbiorem uporządkowanych elementów , które są identyfikowanr przy pomocy pozycji (indeksy wyrażonego w relacji do początkowego elementu
        Tablica w JAVA nie może zawierać różnego rodzaju zmiennych pierwotnych np. int i double
        każdy element ma indeks, który jest numerowany w relacji do początku tablicy
        wskaźmnik jest typem jednorodnym
        rodzaje tablic:
            *statyczne - static array. Indeksacja elementów i ich zawartość jest ustalana przed uruchomieniem programu;
            *dynamiczne - domyślna dla javy, na zadanym stosie - indeksacja elementów jest ustalona,
             a miejsce jest alokowane podczass opracowania deklaracji
            *dynamiczne -
            *dynamiczne -
            na czas obecny są to wszystkie rodzaje tablic które są dostępne na chwilę obecną 2023.
            Tablica jest zmienną składająca się z zestawu elementów, każdy element jest zmimenną typu prostego lub odnośnikowego;
            Wszytkie elementy tablicy są tego samego typu.
            granicą wielkości tablicy jest max wieklość Int

         */
        int[] numbers;
        // nie tworzy to tablicy, tworzy to zmenną typu tablicowago, tworzy jedynie zmienną w pamięci która będzie przevhowywałą nasza adress, tworzy pointera
        //new int[5];
        // rezerwoje pamięć na 5 elementów typu int 32 bity każdy, samo allokowanie tablicy nie wiąże nam jej do zmiennej
        numbers = new int[5];
        //dopiero tworzy tablice z zarezerwowanym miejscem na 5 elementó do której możemy się odwołać
        //instrukcja tablicy ma postać
        int val;
        int[] arr = new int[100];

        System.out.println(arr);
        //[I@6acbcfc0
        // to co otrzymaliśmy zwrotnie - znak [ oznacza ze otzrymaliśmy zmienną typu tablicowego znak i oznacza że zawiera inty
        System.out.println(arr[0]);
        // 0
        // domyślnym elementem jest zero dla intów, dla zmiennych liczb rzeczywistych jest to 0.0 a dla złożonych null
        String[] arr1 = new String[100];
        System.out.println(arr1[0]);
        // null
        int[] tablica = {1,2,3,4,5};
        System.out.println( tablica[0]);
        // 1


        //WYPEŁNIENIE TAblicy
        // wypełnienie tablicy o losowe elementy
        int[] arr3 = new int[100];
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i] + " . ");
        }
        for (int i = 0; i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);
        }
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i] + " . ");
        }
        //ponizej jest przyklad foreacha
        for(int val9 : arr){
            val9 = 0;
        }
        //powyzszy kawalek kodu powinien wypełnic tanlice, ale tego nie robi, oże bedzie na egzamienie albo kolokwium

    }
}

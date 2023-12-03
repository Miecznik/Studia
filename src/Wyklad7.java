import java.util.Scanner;

public class Wyklad7 {

    public static void main(String[] args){

        //inkremantacja i postinkrementacja
        int i = 10;
        i = i++;
        System.out.println(i);
        //wynik: 10, ponieważ inkrementacje dokonano po przypisaniu;
        /*for(int n = 1; n<10 ; n = n++/n++) {

            System.out.println(n);
            //wynik 2 ?
        }
        */

        System.out.println(i);
        i = i++ + ++i;
        System.out.println(i);
        //wynik to 22
        i = 11;
        i = i++ + ++i + i++;
        //11 + 13 + 13 = 37
        System.out.println(i);

    // koniec tematu pre i posstinkrementacji


        int[] tab = {10,20,30};
        int searchfor = 20;
        for(int z = 0; z<tab.length; z++)
        {
            if (tab[z] == searchfor){
                System.out.println("found" + searchfor+" na indeksie"+z);
            }
        }
        for(int val : tab){
            System.out.println(val);
        }

        int tmp;
        Scanner scanner = new Scanner(System.in);
        //zgubilem watek wykladu
        /*
        while((tmp - scanner.nextInt()) != -1 && fill <arr.length){
            arr[fill++] = tmp;
        }
        */
        /*
        sortowanie tablic
         */



    }
}

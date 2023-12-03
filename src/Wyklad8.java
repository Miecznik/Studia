public class Wyklad8 {


    public static void main(String[] args){

        //wykład zazyczna się jak każdy pytaniami

        /*
        co możemy robić ? sortować tablice, to jest pierwszy przykłąd.
         */
        int[] tab = new int[25];
        for(int i = 0; i<tab.length; i++)
        {
            tab[i] = (int)(Math.random()*40);
        }

        System.out.print("[");
        for(int val : tab) {
            System.out.print( val + " ");
        }

        System.out.println("]");
        int minvalueindex = 0;
        for(int j = minvalueindex + 1; j < tab.length; j++){
            if(tab[minvalueindex] > tab[j])
                minvalueindex = j;
        }



        int tmp = tab[minvalueindex];
        tab[0] = tmp;



        System.out.print("[");
        for (int val : tab)
        {
            System.out.print(val + " ");
        }
        System.out.print("]");
    }
}

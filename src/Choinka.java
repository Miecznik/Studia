public class Choinka {

    public static void main(String[] args){

        int wysokoscChoinki = 10;
        String znaczek = "*";

        for (int w = 0; w < wysokoscChoinki; w++){
            for (int s = 0; s < wysokoscChoinki * 2; s++){
                if (s < (wysokoscChoinki - w) || s > (wysokoscChoinki + w)){
                    System.out.print(" ");
                }
                else {
                    System.out.print(znaczek);
                }
            }

            System.out.println();
        }

    }
}

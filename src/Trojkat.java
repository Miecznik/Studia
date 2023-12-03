import java.util.Scanner;

public class Trojkat {
    public static void main(String[] args){
        System.out.println("Podaj wysokosc trojkata: ");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();


        for(int w = 0; w<wysokosc; w++){
            for(int s = wysokosc; s>(wysokosc - w);s--){
                if()
                System.out.print("*");
            }

            System.out.println();
        }

    }
}

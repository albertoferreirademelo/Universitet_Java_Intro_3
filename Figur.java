import java.util.Scanner;

public class Figur {
    public static void main (String[] args) {

        String aString = args[0];
        String bString = args[1];

        Scanner aScanner = new Scanner (aString);
        double side_a = aScanner.nextDouble();

        Scanner bScanner = new Scanner (bString);
        double side_b = bScanner.nextDouble();

        double arean = 0;
        double diagonal = 0;
        double omkrets = side_a+side_a+side_b+side_b;

        arean = side_a*side_b;
        diagonal = Math.sqrt(Math.pow(side_a, 2)+Math.pow(side_b, 2));

        if (side_a == side_b){
            System.out.println("Kvadrat med area "+arean+", diagonal "+diagonal+" och omkrets "+omkrets);
        } else{
            System.out.println("Rektangel med area "+arean+", diagonal "+diagonal+" och omkrets "+omkrets);
        }
    }
}

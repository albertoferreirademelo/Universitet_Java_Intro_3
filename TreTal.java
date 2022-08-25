import java.util.Scanner;

public class TreTal {
    public static void main (String[] args) {

        String aString = args[0];
        String bString = args[1];
        String cString = args[2];

        Scanner aScanner = new Scanner (aString);
        int a_value = aScanner.nextInt();

        Scanner bScanner = new Scanner (bString);
        int b_value = bScanner.nextInt();

        Scanner cScanner = new Scanner (cString);
        int c_value = cScanner.nextInt();

        int max_value = 0;
        int min_value = 0;

        max_value = a_value;
        min_value = a_value;

        if (b_value > a_value)
        {
            if (b_value > c_value)
            {
                max_value = b_value;
            } else {
                max_value = c_value;
            }
                
        } else {
            if (c_value > a_value)
            {
                max_value = c_value;
            }            
        }

        if (b_value < a_value)
        {
            if (b_value < c_value)
            {
                min_value = b_value;
            } else{
                min_value = c_value;
            }
                
        } else {
            if (c_value < a_value)
            {
                min_value = c_value;
            }            
        }

        System.out.println("Talen: a = "+a_value+", b = "+b_value+", c = "+c_value+", min = "+min_value+", max = "+max_value);
    }
}
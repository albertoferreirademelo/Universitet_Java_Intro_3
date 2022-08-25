public class Uppgift3_1a {
    public static void main (String[] args){

        int a = 12;
        int b = 25;
        int c = -1;

        c *= ++b * a--; //++b = 25+1 = 26 , a-- = 12-1 = 11, c = 312?

        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);

        if (c % b == a + 2){
            c *= c;
            System.out.println("first");
        } else if (b % a == -c % a){     
            System.out.println("a: " + a + "; b: " + b + "; c: " + c);       
            c /= -1;
            System.out.println("second");
        } else {
            c += a - b;
            System.out.println("third");
        }

        System.out.println("a: " + a + "; b: " + b + "; c: " + c);
    }
    
}

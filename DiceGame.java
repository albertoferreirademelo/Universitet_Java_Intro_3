public class DiceGame {

    public static void main (String[] args) {
        int value = (int) (Math.random () * 6) + 1; //Tärning

        // 1, 2 - borgare; 3, 6 - kung; 4 - adlig; 5 - bonde
        switch (value) 
        {
            case 1:
                System.out.println("Borgare");
                break;
            case 2:
                System.out.println("Borgare");
                break;    
            case 3:
                System.out.println("Kung");
                break;
            case 4:
                System.out.println("Adlig");
                break;
            case 5:
                System.out.println("Bonde");
                break;
            case 6:
                System.out.println("Kung");
                break;
            default:
                break;
        }
    }
}

public class TextMirror {
    public static void main (String[] args) {

        String text = args[0];

        if (text.length() == 6){
            char first_char = text.charAt(0);
            char second_char = text.charAt(1);
            char third_char = text.charAt(2);
            char fourth_char = text.charAt(3);
            char fifth_char = text.charAt(4);
            char sixth_char = text.charAt(5);

            if (first_char == 'h' && second_char == 'e' && third_char == 'j'){
                System.out.println("Text in reverse order: "+String.valueOf(sixth_char)+String.valueOf(fifth_char)+String.valueOf(fourth_char)+String.valueOf(third_char)+String.valueOf(second_char)+String.valueOf(first_char)+". Text starts with 'hej'.");
            } else  {
                System.out.println("Text in reverse order: "+String.valueOf(sixth_char)+String.valueOf(fifth_char)+String.valueOf(fourth_char)+String.valueOf(third_char)+String.valueOf(second_char)+String.valueOf(first_char)+".");                
            }

        } else {
            System.out.println("Your text consists of "+text.length()+" letters - it should be 6!");
        }        
    }
}
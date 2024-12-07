import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestovoeZadanie {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String sc = scanner.nextLine();

        String text = removeSpaces(sc);

        text = minus(text);

        text = replacePlus(text);

        text = delAndSum(text);

        System.out.println("Результат: " + text);

    }

    public static String removeSpaces(String text){
        String result = "";
        boolean doSpace = false;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
                if(symbol == ' '){
                    if (!doSpace){
                        result += symbol;
                    }
                    doSpace = true;
                }else {
                    result += symbol;
                    doSpace = false;
                }
        }
        return result.trim();
    }

    public static String minus(String text){
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
                if(symbol == '-') {
                    if (i > 0 && i < text.length() - 1) {
                        result = result.substring(0, result.length() - 1) + text.charAt(i + 1) + text.charAt(i - 1);
                    }
                    i++;
                } else {
                    result += symbol;
                }

        }
        return result;
    }

    public static String replacePlus(String text){
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
                if(symbol == '+'){
                    result += '!';
                }else {
                    result += symbol;
                }
        }
        return result;
    }

    public static String delAndSum(String text){
        String result = "";
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
                if (Character.isDigit(symbol)){
                    sum += Character.getNumericValue(symbol);
                }else{
                    result += symbol;
                }
        }
        if (sum > 0){
            result += " " + sum;
        }
        return result;
    }




}
import java.util.Scanner;
import java.io.FileWriter;
import java.util.logging.Logger;

public class SecondTask{
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("results.txt")){
        Scanner numScan = new Scanner(System.in);
        System.out.println("Введите операцию\n" + 
        "'+'  - Сложение\n" +
        "'-'  - Вычитание\n" +
        "'*'  - Умножение\n" +
        "'/'  - Деление");
        String operation = numScan.nextLine();
        System.out.println("Введите первое число: ");
        int num1 = numScan.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = numScan.nextInt();
        int result = 0;
        if (operation.equals("+")) {result=num1+num2;}//System.out.println(result=num1+num2);
        else if (operation.equals("-")) {result=num1-num2;} //System.out.println(result=num1-num2);
        else if (operation.equals("*")) {result=num1*num2;}//System.out.println(result=num1*num2);
        else if (operation.equals("/")) {result=num1/num2;}//System.out.println(result=num1/num2);
        String resultstr = String.valueOf(result);
        numScan.close();
        String eq = "=";
        String text = num1 + operation + num2 + eq + resultstr;
        writer.write(text);
        } 
        catch (Exception exception) {
            Logger logger = Logger.getAnonymousLogger();
            logger.info("We wrote a file");
        }
    }
}
package practice;
import javax.swing.JOptionPane;

public class PracticeCalc
{
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String enterNum1 = JOptionPane.showInputDialog("Enter First number: ");
        System.out.println("You entered first number: " + enterNum1);

        String operation = JOptionPane.showInputDialog("Enter Operation: \n + Addition \n - Subtraction \n * Multiplication \n / Division");
        System.out.println("You entered operation: " + operation);

        if(!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/"))
            JOptionPane.showMessageDialog(null, "Invalid Operation!", "ERROR", JOptionPane.ERROR_MESSAGE);
        else {
            String enterNum2 = JOptionPane.showInputDialog("Enter Second number: ");
            System.out.println("You entered second number: " + enterNum2);

            // parsing
            float num1 = Float.parseFloat(enterNum1);
            float num2 = Float.parseFloat(enterNum2);

            float result = 0;
            if (operation.equals("+")){
                float add = num1 + num2;
                result = add;
            }
            else if (operation.equals("-")){
                float sub = num1 - num2;
                result = sub;
            }
            else if (operation.equals("*")){
                float multi = num1 * num2;
                result = multi;
            }
            else if (operation.equals("/")){
                float div = num1 / num2;
                result = div;
            }
            System.out.println("The answer is: " + result);
            JOptionPane.showMessageDialog(null, "The answer is: " + result, "RESULT", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
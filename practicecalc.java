package practicecalc;
import javax.swing.*; // libary
import javax.swing.JOptionPane;
public class practicecalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String enterNum1 = JOptionPane.showInputDialog("Enter First number: ");
        System.out.println("You entered first number: "+enterNum1);
        String operation = JOptionPane.showInputDialog("Enter Operation: \n + Addition \n - Subtraction \n * Multiplication \n / Division");
        System.out.println("You entered operation: "+operation);
        String enterNum2 = JOptionPane.showInputDialog("Enter Second number: ");
        System.out.println("You entered second number: "+enterNum2);
        
        // parsing
        
        float num1 = Float.parseFloat(enterNum1);
        float num2 = Float.parseFloat(enterNum2);
        
        float result = 0;
        if (operation.equals("+")){
            float add = num1+num2;
            result = add;
        }
        else if (operation.equals("-")){
            float sub = num1-num2;
            result = sub;
        }
        else if (operation.equals("*")){
            float multi = num1*num2;
            result = multi;
        }
        else if (operation.equals("/")){
            float div = num1/num2;
            result = div;
        }
        else {
            System.out.println("Invalid Operation");
        }
        System.out.println("The answer is: "+result);
        JOptionPane.showMessageDialog(null, "The answer is: "+result);
        
                

    }
}
    

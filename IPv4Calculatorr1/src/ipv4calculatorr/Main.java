
package ipv4calculatorr;

/**
 *
 * @author simon
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        IPv4CalculatorApp.Controller controller = new IPv4CalculatorApp.Controller(calculator);
        
        calculator.setVisible(true);
    }
}

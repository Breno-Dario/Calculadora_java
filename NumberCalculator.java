
import java.util.Scanner;

public class NumberCalculator{
    
    public static void main(String[] args) {
        Scanner converter = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double firstNumber = converter.nextDouble();

        System.out.print("Digite o segundo número: ");
        double secondNumber = converter.nextDouble();

        System.out.print("Digite a operação(+, -, *, /): ");
        char operator = converter.next().charAt(0);

        converter.close();

        double result;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if(secondNumber == 0){
                    System.out.println("Erro: Não existe divisão por zero");
                    return;
                    
                }
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Operação inválida");
                return;
        }

        System.out.printf("%.2f %c %.2f = %.2f\n", firstNumber, operator, secondNumber, result);
    }
}

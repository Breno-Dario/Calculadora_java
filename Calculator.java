//Fazendo importação do Scanner para podemos imprimir o resultado e inserir dados.
import java.util.Scanner;

//Criando uma classe chamada calculator.
public class Calculator {
    public static void main(String[] args) {
        //Especificando que poderá inserir qualquer tipo de dados no teclado.
        Scanner scanner = new Scanner(System.in);

        //Inserir número que aparecerá no console.
        System.out.print("Digite o primeiro número: ");

        //Especificando que será mostrado com uma casa a mais de decimal 22.0.
        double num1 = scanner.nextDouble();

        //Inserir número que aparecerá no console.
        System.out.print("Digite o segundo número: ");

        //Especificando que será mostrado com uma casa a mais de decimal 22.0.
        double num2 = scanner.nextDouble();

        //Especificando que os caracteres +, _, *, /,terá a função de subtrair, somar, dividir e multiplicar através do char.
        System.out.print("Digite a operação(+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        //Feichando dados de entrada e saida.
        scanner.close();
        double result;

        //Utilizando switch case para da funcionalidade as funções de +, -, * e /, assim podendo fazer o cálulo.
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.print("Operação inválida");
                return;
        }
        //Imprimir os resultados.
        System.out.println(num1+ " " + operator+ " " + num2+ ": "+result);
    }
}
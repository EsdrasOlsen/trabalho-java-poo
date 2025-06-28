import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite o dividendo: ");
                int dividendo = sc.nextInt();

                System.out.print("Digite o divisor: ");
                int divisor = sc.nextInt();

                if (dividendo == 0 && divisor == 0) {
                    System.out.println("Encerrando o programa.");
                    break;
                }

                int resultado = dividendo / divisor;
                System.out.println("Resultado: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Erro: Divisão por zero não é permitida.");
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite apenas números inteiros.");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
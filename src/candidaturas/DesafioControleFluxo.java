package candidaturas;

import java.util.Scanner;

// Exceção personalizada para este exemplo

class ParametroInvalidoException extends Exception {

	public ParametroInvalidoException(String string) {
		// TODO Auto-generated constructor stub
	}
    
    }

public class DesafioControleFluxo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        try {
            for (int x = 0; x <= 2; x++) {
                System.out.println("Imprimindo número " + x + ": " + num1);
                System.out.println("Imprimindo número " + x + ": " + num2);
                
                // Condição para lançar a exceção personalizada
                if (num1 > num2) {
                    throw new ParametroInvalidoException("O primeiro número não pode ser maior que o segundo número.");
                }
            }
        } catch (ParametroInvalidoException e) {
            System.out.println("Erro: O segundo parâmetro deve ser maior do que o primeiro " );
        } 
        
    }
}


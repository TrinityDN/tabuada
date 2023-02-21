//fazer o import necessário para capturar dado do usuário

import java.util.Scanner;

public class TabuadaUsuario {
	
	public static void main(String [] args) {
		
		//queremos exibir tabuada escolhida pelo usuário
		
		
		int numero;
		
		
		
		//criando uma instância de um objeto scanner
		
		Scanner entrada = new Scanner(System.in);
		
		//capturando um valor de console digitado pelo usuário
		
		System.out.println("Digite um número para ver sua tabuada");
		
		numero = entrada.nextInt();
		
		
		System.out.println("Exibindo a tabuada do " + numero);
		
		for(int x = 1; x <=10; x++) {
			
			int resultado;
			resultado = x * numero;
			
			System.out.println(x + " * " + numero + " = " + resultado);
		}
		
	}
}

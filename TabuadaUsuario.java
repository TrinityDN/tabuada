//fazer o import necess�rio para capturar dado do usu�rio

import java.util.Scanner;

public class TabuadaUsuario {
	
	public static void main(String [] args) {
		
		//queremos exibir tabuada escolhida pelo usu�rio
		
		
		int numero;
		
		
		
		//criando uma inst�ncia de um objeto scanner
		
		Scanner entrada = new Scanner(System.in);
		
		//capturando um valor de console digitado pelo usu�rio
		
		System.out.println("Digite um n�mero para ver sua tabuada");
		
		numero = entrada.nextInt();
		
		
		System.out.println("Exibindo a tabuada do " + numero);
		
		for(int x = 1; x <=10; x++) {
			
			int resultado;
			resultado = x * numero;
			
			System.out.println(x + " * " + numero + " = " + resultado);
		}
		
	}
}

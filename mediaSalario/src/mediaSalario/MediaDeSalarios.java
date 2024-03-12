package mediaSalario;

import java.util.Scanner;

public class MediaDeSalarios {
	public static void main(String[] args) {
		System.out.println("Olá, vamos calcular a média de seus últimos salários!");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salário: ");
		String salario1= entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o segundo salário: ");
		String salario2= entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o terceiro salário: ");
		String salario3= entrada.nextLine().replace(",", ".");
		
		double numero1= Double.parseDouble(salario1);
		double numero2= Double.parseDouble(salario2);
		double numero3= Double.parseDouble(salario3);
		
		double media= (numero1 + numero2 + numero3)/ 3;
		System.out.println("A média entre os três salários é de: "+media);
		
		entrada.close();
		
	}
}

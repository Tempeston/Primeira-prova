import java.util.Scanner;

// 7�

public class Circulo {
	Scanner leitor = new Scanner(System.in);
	
	double raio;
	double area;
	double perimetro;
	static double pi = 3.141516;
	
	
	double calcularArea(){
		
		area = pi * raio * raio;
		
		return area;
	}
	
	double calcularPerimetro(){
		
		perimetro = 2 * pi * raio;
		
		return perimetro;
	}
	
	void Imprimir(){
		
		System.out.println("Os valores dos atributos s�o:");
		System.out.println("O valor da �rea �:"+ calcularArea());
		System.out.println("O valor do perimetro �:"+ calcularPerimetro());
	
	}
	
	// 8�
	
	void construtor(){
		
		System.out.println("Informe o valor do Raio:");
		raio = leitor.nextDouble();
		
	
	}
}

import java.util.Scanner;

	// 5�

public class Retangulo {
	Scanner leitor = new Scanner(System.in);

	double comp;
	double larg;
	double area; 
	double perimetro;
	
	
	double calculararea(){
	area = comp*larg;
		return area;
	}
	
	double calcularperimetro(){
	perimetro = (2*comp)+(2*larg);	
		return perimetro;
	}

	void Imprimir(){
		System.out.println("Os valores dos atributos s�o:");
		System.out.println("A �rea �:"+ calculararea());
		System.out.println("O perimetro �:"+ calcularperimetro());
		
	}

	
	// 6�
	
	
	void construtor(){
		System.out.println("Informe o valor do Comprimento do ret�ngulo:");
		comprimento = leitor.nextDouble();
		
		System.out.println("Informe o valor da largura do ret�ngulo:");
		largura = leitor.nextDouble();
		
	}

}


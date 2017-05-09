import java.util.Scanner;
// 3°
public class Quadrado {

	Scanner leitor = new Scanner(System.in);
	
	double lado;
	double area;
	double perimetro;
	
	double CalcArea(){
		area = lado*lado;
		return area;
	}
	
	Double CalcPerimetro(){
		perimetro = 4*lado;
		return perimetro;
	}
	
// 4°

    void imprimir(){
        
        System.out.println("O quadrado de lado: "+lado);
        System.out.println("Área:" + CalcArea());
        System.out.println("Perimetro:"+CalcPerimetro());    
    }
    
    void construtor(){
        
        System.out.println("Informe do valor do lado do quadrado");
        lado = leitor.nextDouble();
    }
    
}


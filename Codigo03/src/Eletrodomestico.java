import java.util.Scanner;

// 17�
public class Eletrodomestico {
	Scanner leitor =  new Scanner(System.in);
	
	boolean ligado;
	String status = "Desligado";
	String ligadesliga;
	
		public void imprima1(){
			System.out.println("Eletrodom�stico  "+ status);
		}
	
		public boolean imprimir(){

			if(ligado == true){
				System.out.println("Eletrodomestico"+ status);
				
			}else{
				System.out.println("Eletrodom�stico Desligado");
			}
			return ligado;
}
		
		public void construtor(){
		System.out.println("Deseja ligar o eletrodom�stico ?");
		ligadesliga = leitor.next();
		}
	
		
		public String ligaDesliga(){
		if(ligadesliga == "sim"){
			ligado = true;
			status = "Ligado";
			
		}else{
			ligado = false;
			
		}
		return ligadesliga;
			
		
		
			
			
		
}				 
			
}	


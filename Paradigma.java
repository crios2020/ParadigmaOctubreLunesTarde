//declaración de clase
class Auto{
	
	//atributos
	String marca;
	String modelo;
	String color;
	int velocidad;		//kms
	
	//métodos
	void acelerar(){
		velocidad=velocidad+10;
		if(velocidad>100){
			velocidad=100;
		}
	}
	
	void frenar(){
		velocidad=velocidad-10;
	}
	
}//end class

class Moto{
	String marca;
	String modelo;
	String color;
	int velocidad;
	int cilidrada;
	
	//métodos
	void acelarar(){
		velocidad=velocidad+12;
	}
	
	void frenar(){
		velocidad=velocidad-10;
	}
}

public class Paradigma{
	public static void main(String[] args){
		//punto de entrada al proyecto
		System.out.println("Hola Mundo!");
		
		System.out.println("-- auto1 --");
		Auto auto1=new Auto();
		auto1.marca="Ford";
		auto1.modelo="Ka";
		auto1.color="Negro";
		
		auto1.acelerar();				// 10		
		auto1.acelerar();				// 20
		auto1.acelerar();				// 30
		auto1.frenar();					// 20
		
		System.out.println(auto1.marca+" "+auto1.modelo+" "
				+auto1.color+" "+auto1.velocidad);
		
		
		System.out.println("-- auto2 --");
		Auto auto2=new Auto();
		auto2.marca="Fiat";
		auto2.modelo="Idea";
		auto2.color="Gris";
		
		for(int a=0;a<=60;a++){
			auto2.acelerar();
		}
		
		System.out.println(auto2.marca+" "+auto2.modelo+" "
				+auto2.color+" "+auto2.velocidad);
		
	}
}//end class

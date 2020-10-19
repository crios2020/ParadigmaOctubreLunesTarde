import javax.swing.JOptionPane;

//declaración de clase
class Auto{
	
	//atributos
	String marca;
	String modelo;
	String color;
	int velocidad;		//kms
	
	//métodos
	void acelerar(){					//acelerar
		velocidad=velocidad+10;
		if(velocidad>100){
			velocidad=100;
		}
	}
	
	//método sobrecargado
	private void acelerar(int kilometros){		//acelerarInt
		//método parametrico
		velocidad=velocidad+kilometros;
	}
	
	void acelerar(int km, boolean tieneNitro){ 	//acelerarIntBoolean
		if(tieneNitro == false){
			acelerar(km);			//llamado de método dentro de la clase
		} else{
			acelerar(km*2);
		}
	}
	
	//void acelerar(int x){}				//acelerarInt //error
	
	void acelerar(int i, int x){}		//acelerarIntInt		
	
	//void acelerar(int h, boolean x){}	//acelerarIntBoolean	//error
	
	void acelerar(boolean x, int h){}	//acelerarBooleanInt
	
	void frenar(){
		velocidad=velocidad-10;
	}
	
	void imprimirVelocidad(){
		System.out.println(velocidad);
	}
	
	int obtenerVelocidad(){
		return velocidad;
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
		//auto1.acelerar(16);				// 36
		//auto1.acelerar(12);				// 48
		auto1.acelerar(10, true);		// 68
		
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
				
		System.out.println("*************************************");
		
		auto2.imprimirVelocidad();
		
		System.out.println(auto2.obtenerVelocidad());
		
		JOptionPane.showMessageDialog(null,
			"velocidad: "+auto2.obtenerVelocidad());
			
		
	}
}//end class

class Cliente{
	long nro;
	String nombre;
	int edad;
	Cuenta cuenta;
	boolean activo=true;
}

class Cuenta{
	long nro;
	double saldo;
}


	/*		
	<script>
		//javascript
		$a=2;
		$a="hola";
		$a=true;
		$a=3.14;
	
	</script>
	*/
	
	/*
	<?php
		//php
		class Auto{
			$marca;
			$velocidad;
			public function acelerar($kilometros){
				$this->velocidad+=$kilometros;
			}
		}
		
		$auto1=new Auto();
		$auto1->acelerar(25);
		$auto1->acelerar("Hola");
		
	?>
	*/



















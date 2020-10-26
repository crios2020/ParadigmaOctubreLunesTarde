class Cliente {
	// Atributos
	String cuit;
	String direccion;
	
	// Constructores
	
	// Métodos
	void saludar(){
		System.out.println("Hola soy un cliente!");
	}
}

class ClientePyme extends Cliente {
	
	// Atributos -Los atributos heredados no se vuelven a codificar!
	String razonSocial;
	
	// Constructores
	
	// Métodos
	void saludar(){
		//método sobreescrito!
		System.out.println("Hola soy un cliente pyme!");
	}

}

class Auto{
	private String marca;
	private String modelo;
	private String color;
	private static int velocidad;
	
	public Auto(String marca, String modelo, String color){
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
	}
	
	public String getEstado(){
		return marca+", "+modelo+", "+color;
	}
	
	public static void acelerar(){
		velocidad=velocidad+10;
	}
	
	public static int getVelocidad(){
		return velocidad;
	}
	
}

public class Paradigma3 extends Consola{
	public static void main(String... args){
		Cliente cliente=new Cliente();
		cliente.cuit="2345";
		cliente.direccion="lavalle 648";
		//cliente.razonSocial="Cafeteria srl";
		cliente.saludar();
		
		ClientePyme cp=new ClientePyme();
		cp.cuit="987654";
		cp.direccion="Lima 222";
		cp.razonSocial="Todo Limpio SRL";
		cp.saludar();
		
		
		Auto.acelerar(); //método static
		
		System.out.println("-- auto1 --");
		Auto auto1=new Auto("Citroen","C4","Bordo");
		Auto.acelerar();
		Auto.acelerar();
		//auto1.acelerar();								//10
		//auto1.acelerar();								//20
		System.out.println(auto1.getEstado());
		//System.out.println(auto1.getVelocidad());
		System.out.println(Auto.getVelocidad());
		
		System.out.println("-- auto2 --");
		Auto auto2=new Auto("Fiat","Uno","Verde");
		//auto2.acelerar();								//30
		Auto.acelerar();
		System.out.println(auto2.getEstado());
		//System.out.println(auto2.getVelocidad());
		//System.out.println(auto1.getVelocidad());
		System.out.println(Auto.getVelocidad());
		
		print("Hola Mundo");
	}
		
}

class Consola{
	public static void print(Object object){
		System.out.println(object);
	}
}






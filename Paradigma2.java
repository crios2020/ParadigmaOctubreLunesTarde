class Cuenta{
	private int nro;
	private String moneda;
	private float saldo;
	
	//método constructor
	public Cuenta(int nro, String moneda){
		this.nro=nro;
		this.moneda=moneda;
	}
	
	public void depositar(float monto){
		this.saldo=this.saldo+monto;
	}
	
	public void debitar(float monto){
		if(this.saldo>=monto){
			this.saldo=this.saldo-monto;
		}else{
			System.out.println("No hay saldo suficiente!!");
		}
	}
	
	public float getSaldo(){
		return saldo;
	}
	
	public String getEstado(){
		return nro+", "+moneda+", "+saldo;
	}
	
}

class Cliente{
	private int nro;
	private String nombre;
	private Cuenta cuenta;
	
	public Cliente(int nro, String nombre,int nroCuenta){
		this.nro=nro;
		this.nombre=nombre;
		this.cuenta=new Cuenta(nroCuenta,"arg$");
	}
	
	public Cuenta getCuenta(){
		return cuenta;
	}
	
	public String getEstado(){
		return nro+", "+nombre+", "+cuenta.getEstado();
	}
	
}

public class Paradigma2{
	public static void main(String[] args){
		System.out.println("Clase 2");
		
		System.out.println("-- cuenta1 --");
		Cuenta cuenta1=new Cuenta(1,"arg$");
		cuenta1.depositar(50000);
		cuenta1.depositar(20000);
		cuenta1.debitar(12000);
		//cuenta1.saldo=200000000; //error
		System.out.println(cuenta1.getEstado());
		
		
		System.out.println("-- cliente1 --");
		Cliente cliente1=new Cliente(1,"Juan Perez",2);
	
		Cuenta cuentaCliente1=cliente1.getCuenta();
		cuentaCliente1.depositar(60000);
		
		cliente1.getCuenta().depositar(20000);
		
		System.out.println(cliente1.getEstado());
		
		
	}
}

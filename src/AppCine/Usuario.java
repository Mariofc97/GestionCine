package AppCine;

public class Usuario {
    private String nombreUsuario;
    private String dni;
    //private int edad;
    
    public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombre) {
		this.nombreUsuario = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	//public int getEdad() {
		//return edad;
	//}

	//public void setEdad(int edad) {
		//this.edad = edad;
	//}

	//public double getSaldo() {
		//return saldo;
	//}

	//public void setSaldo(double saldo) {
		//this.saldo = saldo;
	//}

	private double saldo;
    
    public Usuario(String nombreUsuario, String dni) {
        this.nombreUsuario = nombreUsuario;
        this.dni = dni;
        //this.saldo = saldo;
    }
}

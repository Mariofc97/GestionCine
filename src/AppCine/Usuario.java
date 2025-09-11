package AppCine;

public class Usuario {
    private String nombre;
    private String dni;
    private int edad;
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double saldo;
    
    public Usuario(String nombre, String dni, int edad, double saldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.saldo = saldo;
    }
}

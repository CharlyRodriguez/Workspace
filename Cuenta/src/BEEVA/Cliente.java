package BEEVA;

public class Cliente {
private String Nombre;
private String Apellido;
private Cuenta cuenta;
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getApellido() {
	return Apellido;
}
public void setApellido(String apellido) {
	Apellido = apellido;
}
public Cuenta getCuenta() {
	return cuenta;
}
public void setCuenta(Cuenta cuenta) {
	this.cuenta = cuenta;
} 


}

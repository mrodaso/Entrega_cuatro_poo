public class Inmueble {
protected int identificadorInmobiliario;
protected int área; // 
protected String dirección; 
protected double precioVenta;
Inmueble(int identificadorInmobiliario, int área, String dirección) {
this.identificadorInmobiliario = identificadorInmobiliario;
this.área = área;
this.dirección = dirección;
}
/**
* Método que a partir del valor del área de un inmueble, calcula su
* precio de venta
* @param valorArea El valor unitario por área de un determinado
* inmueble
* @return Precio de venta del inmueble
*/
double calcularPrecioVenta(double valorArea) {
precioVenta = área * valorArea;
return precioVenta;
}
/**
* Método que muestra en pantalla los datos de un inmueble
*/
void imprimir() {
System.out.println("Identificador inmobiliario = " +identificadorInmobiliario);
System.out.println("Area = " + área);
System.out.println("Dirección = " + dirección);
System.out.println("Precio de venta = $" + precioVenta);
}
}
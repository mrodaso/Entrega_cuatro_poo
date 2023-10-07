public class cuentaCorriente extends CuentaBancaria {
    float sobregiro=0;
    
    public cuentaCorriente(float saldo, float tasa){
    super(saldo, tasa); 
    }
    
    public void pendiente(float saldo){
    if (getSaldo()<saldo){
    sobregiro+=saldo-getSaldo();
    retiro(saldo-sobregiro);
    }     
    }
    
    public void consignar(float saldo){
    sobregiro-=saldo;    
    if(sobregiro<0){
    consignacion(saldo-sobregiro);
    sobregiro=0;    
    }
    else{
        System.out.println("Su consignación ha pagado parte del sobregiro.");
        System.out.println("Su sobregiro actual es de: "+sobregiro);
    } 
    }
    
    public void extractomensual(){
    extracto();
    }
    
    public void imprimirCuentaCorriente(){
       System.out.println("El saldo es: "+getSaldo());
       System.out.println("Comisión mensual: "+getComision());
       System.out.println("Número de transacciones: "+(consignaciones+retiros)); 
       System.out.println("Valor de sobregiro: "+sobregiro);
   }

}

public class cuentaAhorro extends CuentaBancaria {
    boolean estado;
   
     public cuentaAhorro(float saldo, float tasa){
    super(saldo, tasa); 
    }

    public void consignar(float saldo){
    if(estado=true){
    consignacion(saldo); 
    consignaciones+=1;
    }
    }
    
    public void retirar(float saldo){
    if(estado=true){
    retiro(saldo);
    retiros+=1;
    if(retiros>4){
    comision+=1000;   
    }
    }
    }
    
    public void extractomensual(){
    extracto();
    if (saldo>10000){
    estado=true;
    }
    else{
    estado=false;    
    }
    }
    
      public void imprimirCuentaAhorro(){
       System.out.println("El saldo es: "+getSaldo());
       System.out.println("Comisión mensual: "+getComision());
       System.out.println("Número de transacciones: "+(consignaciones+retiros));       
   }
}

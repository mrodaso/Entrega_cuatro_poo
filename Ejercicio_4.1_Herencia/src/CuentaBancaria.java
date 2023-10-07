public class CuentaBancaria {
   protected float saldo;
   protected int consignaciones=0;
   protected int retiros=0;
   protected float tasa;
   protected float comision=0;
   

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getConsignaciones() {
        return consignaciones;
    }

    public void setConsignaciones(int consignaciones) {
        this.consignaciones = consignaciones;
    }

    public int getRetiros() {
        return retiros;
    }

    public void setRetiros(int retiros) {
        this.retiros = retiros;
    }

    public float getTasa() {
        return tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }
   
   CuentaBancaria(float saldo, float tasa){
       setSaldo(saldo);
       setTasa(tasa); 
   }
   
   public void consignacion(float saldo){
       setSaldo(getSaldo()+saldo);
       System.out.println("Su saldo actual es de: "+getSaldo());
   }
   public void retiro(float saldo){
       if (getSaldo() >= saldo){
       setSaldo(getSaldo()-saldo); 
       }
       else {
           System.out.println("El saldo es insuficiente");
       }
   
   }
   
   public void interes(){
       float tasamensual = getTasa()/12;
       setSaldo(getSaldo()-tasamensual);
   }
    
   public void extracto(){
       setSaldo(getSaldo()-getComision());
       interes();
       
   }
   public void imprimir(){
       System.out.println("El saldo es:"+getSaldo());
       System.out.println("Número de consignaciones: "+getConsignaciones());
       System.out.println("Número de retiros: "+getRetiros());
       System.out.println("Tasa anual: "+getTasa());
       System.out.println("Comisión mensual: "+getComision());
   }
   
}

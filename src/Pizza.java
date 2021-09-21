public class Pizza {

    protected static final String TAMANO = "Personal";
    protected static final boolean QUESO_EXTRA = false;
    protected static final double PRECIO_BASE = 6000;

    protected String tamano;
    protected boolean quesoExtra;
    protected double precioBase;
    protected String otroIngrediente = "";

    public Pizza(){
   }

   public Pizza(String tamano, boolean quesoExtra) {
       if(tamano != ""){
           this.tamano = tamano;
       }else{
           this.tamano = TAMANO;
       }
       if(quesoExtra == true) {
           this.quesoExtra = quesoExtra;
       } else {
            this.quesoExtra = QUESO_EXTRA;
       }this.precioBase = PRECIO_BASE;
   }

   // METODOS
   public void setTamano(String tamano) {
       this.tamano = tamano;
   }

   public void setCebolla(Boolean quesoExtra) {
    this.quesoExtra = quesoExtra;
}

public void setPrecioBase(double precioBase)  {
    this.precioBase = precioBase;
}

public void setOtroIngrediente(String otroIngrediente)  {
    this.otroIngrediente = otroIngrediente;
}
   
public String getTamano(){
    return this.tamano;
}

public double getPrecioBase(){
    return this.precioBase;
}

public String getOtroIngrediente(){
    return this.otroIngrediente;
}

public boolean isquesoExtra(){
    return quesoExtra;
}

public void agregarOtroIngredieente(String otroIngrediente){
    this.otroIngrediente = otroIngrediente;
}
// METODO PARA CALCULAR PRECIO
public double calcularPrecio () {
    double precioGeneral = 0;
    int proporcionTamano = 0;
    double otroIngrediente = 0;
    if(this.otroIngrediente.equalsIgnoreCase("Champiñones")){
        otroIngrediente = 2000;
    }

    if(this.otroIngrediente.equalsIgnoreCase("Jalapeños")){
        otroIngrediente = 3000;
    }

    if(this.tamano.equalsIgnoreCase("Personal")){
        proporcionTamano = 1;
}
     
    if(this.tamano.equalsIgnoreCase("Familiar")){
         proporcionTamano = 2;
}
    precioGeneral = (this.precioBase * proporcionTamano) + otroIngrediente;
    return precioGeneral;
}

public void agregarOtroIngrediente(String string) {
}  

}

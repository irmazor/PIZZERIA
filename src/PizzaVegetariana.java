public class PizzaVegetariana extends Pizza{
   
    // ATRIBUTOS
    private String vegetal;


    public void setVegetal(String vegetal) {
        this.vegetal = vegetal;
    }

    public String getVegetal() {
        return this.vegetal;
    }

    // CONSTRUCTOR SOBRECARGADO
    public PizzaVegetariana(String tamano, boolean quesoExtra, String vegetariana) {
        if(tamano != "") {
            this.tamano = tamano;
        }  else {
            this.tamano = TAMANO;
        }
        if(quesoExtra == true){
           this.quesoExtra = quesoExtra;    
        }   else {
             this.quesoExtra = QUESO_EXTRA;
        }
        this.precioBase = PRECIO_BASE;
        this.vegetal = Vegetal;

        
    
    //    METODO CALCULAR PRECIO
    public double calcularPrecio () {
        double precioPizza = 0;
        double precioGeneral  = 0;
        int proporcionTamano = 0;
        double otroIngrediente = 0;
        double precioVegetal = 0;
        if(this.otroIngrediente.equalsIgnoreCase("Champiñones")){
            otroIngrediente = 2000;
        }
        if(this.otroIngrediente.equalsIgnoreCase("jalapeños")){
            otroIngrediente = 3000;
        }
        if(this.tamano.equalsIgnoreCase("Personal")) {
            proporcionTamano = 1;
        }
        if(this.tamano.equalsIgnoreCase("Familiar")) {
            proporcionTamano = 2;
        }
        precioGeneral = (this.precioBase * proporcionTamano) + otroIngrediente;
        if(this.vegetal.equalsIgnoreCase("Tomate")) {
            precioVegetal = 5000;
        }
        if(this.vegetal.equalsIgnoreCase("Aceituna")) {
            precioVegetal = 4000;
        }
        precioPizza = precioGeneral + precioVegetal;
        return precioPizza;
    
 }
}
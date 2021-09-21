public class PizzaCarnes extends Pizza{

    //  ATRIBUTOS
    private String Carne;
    

    public void setCarne(String Carne){
        this.Carne = Carne;
    }

    public String getCarne(){
        return this.Carne;
    }

    // CONSTRUCTOR SOBRECARGADO

    public PizzaCarnes(String tamano, boolean quesoExtra, String carne){
        if(tamano != "") {
            this.tamano = tamano;
        } else {
            this.tamano = TAMANO;
        }
        if(quesoExtra ==true){
            this.quesoExtra = quesoExtra;
        } else{
            this.quesoExtra = QUESO_EXTRA;
        }
        this.precioBase = PRECIO_BASE;
        this.Carne = carne;
    }
//    METODO CALCULAR PRECIO 
      public double calcularPrecio (){
          double precioPizza =0;
          double precioGeneral = 0;
          int proporcionTamano =0;
          double otroIngrediente = 0;
          double precioCarne = 0;
          if(this.otroIngrediente.equalsIgnoreCase("Champiñones")){
            otroIngrediente = 2000;
          }
          if(this.otroIngrediente.equalsIgnoreCase("Jalapeños")){
            otroIngrediente = 3000;
          }
          if(this.otroIngrediente.equalsIgnoreCase("Personal")){
            proporcionTamano = 1;
          }
          if(this.otroIngrediente.equalsIgnoreCase("Familiar")){
            proporcionTamano = 2;
          }
          precioGeneral = (this.precioBase * proporcionTamano) + otroIngrediente;
          if(this.Carne.equalsIgnoreCase("Salami")){
              precioCarne = 8000;
          }
          if(this.Carne.equalsIgnoreCase("Jamon")){
            precioCarne = 6000;
        }
        if(this.Carne.equalsIgnoreCase("Pollo")){
            precioCarne = 5000;
        }
        precioPizza = precioGeneral + precioCarne;
        return precioPizza;
    }  
}

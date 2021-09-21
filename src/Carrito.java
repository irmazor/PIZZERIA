public class Carrito {

    // ATRIBUTOS
    private double precioTotalPizzas;
    private double precioTotalPizzasCarne;
    private double precioTotalPizzasVegetariana;
    private Pizza listaPizzas[];

    // CONSTRUCTORES
    public Carrito () {
        precioTotalPizzas = 0;
        precioTotalPizzasCarne = 0;
        precioTotalPizzasVegetariana = 0;
    }

    // METODOS
    public Carrito(Pizza listaPizzas[]) {
        this.listaPizzas = listaPizzas;
    }


    public double getPrecioTotalPizzas(){
        return this.precioTotalPizzas;
    }

    public double getPrecioTotalPizzasCarne(){
        return this.precioTotalPizzasCarne;
    }

    public double getPrecioTotalPizzasVegetariana(){
        return this.precioTotalPizzasVegetariana;
    }

    // METODOS CALCULAR TOTALES
    public void calcularTotales() {
        for (int i= 0; i<listaPizzas.length; i++) {
            if(listaPizzas[i] instanceof Pizza) {
                precioTotalPizzas += listaPizzas[i]. calcularPrecio();
            }
            if(listaPizzas[i] instanceof PizzaCarnes) {
                precioTotalPizzasCarne += listaPizzas[i]. calcularPrecio();
            }
            if(listaPizzas[i] instanceof PizzaVegetariana) {
                precioTotalPizzasVegetariana += listaPizzas[i]. calcularPrecio();
            }
        }    
     }
// METODO MOSTRAR TOTALES
public String mostrarTotales () {
    calcularTotales();
    String cadenaTotales = "El precio total de las pizzas es de" + precioTotalPizzas
                            + "\nla suma del precio de las pizzas de carne es de " + precioTotalPizzasCarne 
                            + "\nla suma del precio de las pizzas vegetariana es de " + precioTotalPizzasVegetariana;
    return cadenaTotales; 
   }

} 
    


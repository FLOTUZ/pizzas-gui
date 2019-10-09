package pizzas;

class Pedido {
    private String nombreCliente;
    private String saborPizza;
    private String tamaño;
    private String extras;
    private double precio;

    public Pedido() {
    }

    public Pedido(String nombreCliente, String saborPizza, String tamaño, String extras, double precio) {
        this.nombreCliente = nombreCliente;
        this.saborPizza = saborPizza;
        this.tamaño = tamaño;
        this.extras = extras;
        this.precio = precio;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getSaborPizza() {
        return saborPizza;
    }

    public void setSaborPizza(String saborPizza) {
        this.saborPizza = saborPizza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}

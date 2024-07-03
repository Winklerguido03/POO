package entidades;

public class Producto {
    //atributos de la clase o variables de instancia
    private int id;
    private String NombreProducto;
    private double Precio;
    private int StockActual;

    //metodo constructor

    public Producto() {

        this.id = -1;
        this.NombreProducto = "No Especificado ";
        this.Precio = 0;
        this.StockActual = 2;
    }

    public Producto (int id,String NombreProducto) {
        this.id=id;
        this.NombreProducto=NombreProducto;
    }

    public Producto (int id,String NombreProducto,double Precio,int StockActual) {
        this.id=id;
        this.NombreProducto=NombreProducto;
        this.Precio=Precio;
        this.StockActual=StockActual;

    }

    //metodos son funciones
    public void mostrarProducto() {
        System.out.println(id + " " + NombreProducto + "Precio:$" + Precio + " Stock:" + StockActual);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public String getNombreProducto() {
        return this.NombreProducto;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public double getPrecio() {
        return this.Precio;
    }

    public void setStockActual(int StockActual) {
        this.StockActual = StockActual;
    }

    public int getStockActual() {
        return this.StockActual;
    }

    //sobrecarga de metodos,se llaman igual se diferencian en parámetros
    public void actualizarStock() {
        this.StockActual = StockActual + 10;
    }

    public void actualizarStock(int cantidad) {
        this.StockActual = this.StockActual = cantidad;
    }
}

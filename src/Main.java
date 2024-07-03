import entidades.Producto;
import entidades.marca;

public class Main {
    public static void main(String[] args) {
        //new crea producto con plantilla vacia,hay que cargar los datos

        //*
        //Producto();
        //p=new Producto();

        Producto producto1 = new Producto();
        producto1.setId(1);
        producto1.setNombreProducto("Honda ");
        producto1.setPrecio(1000000);
        producto1.setStockActual(1000);

        producto1.mostrarProducto();

        Producto producto2 = new Producto();
        producto2.setNombreProducto("Motomel 202 ");
        producto2.setPrecio(1200000);
        producto2.setId(2);
        producto2.mostrarProducto();

        System.out.println(producto2.getNombreProducto());

        producto1.actualizarStock();
        producto1.actualizarStock(5);
        producto1.mostrarProducto();

        Producto producto3 = new Producto();
        producto3.mostrarProducto();

        Producto producto4 = new Producto(4, "zanella 22 ");
        producto4.mostrarProducto();
        Producto producto5 = new Producto(5, "Yamaha YY ", 2100000, 2);
        producto5.mostrarProducto();

        marca marca1 =new marca("Zanella");

        marca1.MostrarMarca();

        marca objMarca= new marca ("Honda");
        objMarca.MostrarMarca();

        producto5.setNombreProducto("Yamaha zz ");
        producto5.mostrarProducto();

        objMarca.setNombre(" Marca 123 ");
        objMarca.setId(1);

        System.out.println(objMarca.toString());
    }
}
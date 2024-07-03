package entidades;

public class marca {

    private int id;

    private String nombre;

    public marca() {
        this.id = -1;
        this.nombre = "No especificado";
    }

    public marca(String Nombre) {
        this.nombre = nombre;
    }

    public void MostrarMarca() {
        System.out.println("Marca:" + this.id + " " + this.nombre);

    }

    public void setId (int id){
        this.id=id;
    }

    public int getId (){
        return this.id;
    }

    public void setNombre (String nombre){
        this.nombre=nombre;
    }

    public String getNombre (){
        return this.nombre;
    }

    public String toString (){
        return "Marca " + this.id + "" + this.nombre;
    }

}

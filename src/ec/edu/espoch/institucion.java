package ec.edu.espoch;

public class institucion {

    //Declaración
    private static institucion instancia;
    private String nombre;

    //Para evitar instancia mediante operador "new"
    private institucion() {

    }

    //Para obtener la instancia unicamente por este metodo
    //Se coloca la palabra reservada "static" hace posible el acceso mediante Clase.metodo
    public static institucion getInstancia() {
        if(instancia == null) {
            instancia = new institucion();
        }
        return instancia;
    }

    //Método get
    public String getNombre(){
        return nombre;
    }

    //Método set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}




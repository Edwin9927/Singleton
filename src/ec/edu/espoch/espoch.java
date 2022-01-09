package ec.edu.espoch;

public class espoch {

    public static void main(String[] args){
        institucion ESPOCH = institucion.getInstancia();
        System.out.println(ESPOCH.getNombre());
        ESPOCH.setNombre("ESPOCH");
        System.out.println(ESPOCH.getNombre());

        institucion ESPOCH2 = institucion.getInstancia();
        System.out.println(ESPOCH2.getNombre());
    }
}





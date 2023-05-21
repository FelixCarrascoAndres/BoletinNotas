public class Alumno {
    //Atributos
    private String nombre;
    private String direccion;
    private String contacto;
    private String grupo;

    //Constructor

    public Alumno(String nombre, String direccion, String contacto, String grupo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
        this.grupo = grupo;
    }


    //toString

    public String toString() {
        return  "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", contacto='" + contacto + '\'' +
                ", grupo='" + grupo + '\'' +
                '}';
    }
}

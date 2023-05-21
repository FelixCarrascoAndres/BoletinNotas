    import java.util.Scanner;
    import java.util.Date;
    import java.text.DateFormat;
    import java.text.SimpleDateFormat;
    public class Notas {

        public static void main(String[] args) {

            // Pedir los datos del alumno por consola
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el nombre completo del alumno:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la dirección del alumno:");
            String direccion = scanner.nextLine();
            System.out.println("Ingrese el contacto del alumno:");
            String contacto = scanner.nextLine();
            System.out.println("Ingrese el grupo del alumno:");
            String grupo = scanner.nextLine();

            // Imprimimos el encabezado del boletín
            System.out.println("Boletín de Calificaciones Trimestral");
            System.out.println("Alumno: " + nombre);
            System.out.println(direccion);
            System.out.println(contacto);
            System.out.println("Grupo: " + grupo);
           //System.out.println("La fecha actual es: " + fechaActual);

            // Pedimos las calificaciones por consola y las almacenamos en un array
            double[] calificaciones = new double[Asignatura.values().length];
            for (Asignatura asignatura : Asignatura.values()) {
                System.out.println("Ingrese la calificación de " + asignatura + ":");
                calificaciones[asignatura.ordinal()] = scanner.nextDouble();
            }

            //nota media
            double suma = 0;
            for (double calificacion : calificaciones) {
                suma += calificacion;
            }
            double notaMedia = suma / calificaciones.length;

            //Tabla de calificaciones
            System.out.println("CALIFICACIONES");
            System.out.println("Cod Asignatura Nota Calificación");
            for (Asignatura asignatura : Asignatura.values()) {
                double calificacion = calificaciones[asignatura.ordinal()];
                System.out.printf("%03d %-12s %.1f ", asignatura.ordinal(), asignatura, calificacion);
                if (calificacion >= 5.0 && calificacion < 6.0) {
                    System.out.println("Aprobado");
                } else if (calificacion >= 6.0 && calificacion < 7.0) {
                    System.out.println("Bien");
                } else if (calificacion >= 7.0 && calificacion < 9.0) {
                    System.out.println("Notable");
                } else if (calificacion >= 9.0) {
                    System.out.println("Sobresaliente");
                } else {
                    System.out.println("Suspenso");
                }
            }

            // Imprimir la nota media y la calificación final
            System.out.printf("Nota media: %.1f\n", notaMedia);
            if (notaMedia >= 5.0 && notaMedia < 6.0) {
                System.out.println("Calificación: Aprobado");
            } else if (notaMedia >= 6.0 && notaMedia < 7.0) {
                System.out.println("Calificación: Bien");
            } else if (notaMedia >= 7.0 && notaMedia < 9.0) {
                System.out.println("Calificación: Notable");
            }

            /*Conseguir la fecha de hoy
            public class FechaActual {
                public static void main(String[] args) {
                    Date fechaActual = new Date();
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaActual2 = dateFormat.format(fechaActual);
                }*/
        }

    }


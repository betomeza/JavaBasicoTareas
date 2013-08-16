package Tarea1.Mediateca;

public class Prestamo {

    public static void main(String[] args) {
        Prestamo.doPrestamo("A", 5);
    }

    public static void doPrestamo(String tipo, int dias) {

        if (dias <= 0) {
            System.out.println("Valor de dias no es valido");
        } else {
            int precio = 0;

            Socio socio = new Socio();
            socio.setApellidos("Albornoz Salinas");
            socio.setNombres("Jaime");
            socio.setDomicilio("Calle El Sol 123 VMT");
            socio.setNumeroDocumento("12345678");
            socio.setTelefono("245-3456");


            if ("L".equals(tipo)) {

                if (dias > 15) {
                    System.out.println("Los libros pueden ser prestados como máximo 15 días");
                } else {
                    Libro libro = new Libro();
                    libro.setTitulo("Clean Code");
                    libro.setAutor("Robert C. Martin");
                    libro.setEstado("Prestado");
                    libro.setNumeroISBN("978-9972-58-118-7");
                    libro.setNumeroPaginas(453);

                    precio = 5 * dias;
                    
                    System.out.println("El precio total a pagar es " + precio);
                }

            } else if ("V".equals(tipo)) {

                if (dias > 3) {
                    System.out.println("Las cintas de video pueden ser prestados como máximo 3 días");
                } else {
                    Video video = new Video();
                    video.setTitulo("Planeta Tierra");
                    video.setAutor("Bouchard, Louise");
                    video.setActores("Jhon Black, Hilary Brown");
                    video.setDuracion("1 hora 45 minutos");
                    video.setEstado("Prestado");

                    precio = 10 * dias;

                    System.out.println("El precio total a pagar es " + precio);
                }
            } else {

                if (dias > 5) {
                    System.out.println("Las cintas de audio pueden ser prestados como máximo 5 días");
                } else {

                    Audio audio = new Audio();
                    audio.setTitulo("Analisis de la Realidad Peruana");
                    audio.setAutor("Jose Carlos Mariátegui");
                    audio.setLugar("Palacio de Gobierno");
                    audio.setDuracion("90 minutos");
                    audio.setEstado("Prestado");

                    precio = 20;

                    System.out.println("El precio total a pagar es " + precio);
                }
            }
        }
    }
}

public class AboutMe {
    public static void main(String[] args) {
        //inicializar una variable (del tipo que veas conveniente) para cada uno de los siguentes datos: nombre, edad, país, lenguaje de programación, horas, pasatiempo, lugar y reemplaza en el texto de impresión, la variable que corresponda.

        //Escribe tu código aquí
        String nombre = "May";
        int edad = 28;
        String pais = "Colombia";
        String lenguajeProgramacion = "Java";
        int horas = 21;
        String pasatiempo = "Video juegos";
        String lugar = "Cama";

        //Reemplaza <name> y <age> concatenando el String con las variables creadas. 
        System.out.println("Mi nombre es " + nombre + ", tengo " + edad + " años y soy de " + pais + ".");

        //Reemplaza <programmingLanguage> y <hours> concatenando el String con las variables creadas. 
        System.out.println("Estoy estudiando " + lenguajeProgramacion + " y practico " + horas + " horas al día.");

        //Reemplaza <hobby> y <place> concatenando el String con las variables creadas.
        System.out.println("Mi pasatiempo favorito son los " + pasatiempo + " y lo practico en la " + lugar);
    }
}

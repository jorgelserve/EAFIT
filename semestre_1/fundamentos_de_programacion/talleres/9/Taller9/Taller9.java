import java.util.Random;

class Taller9 {
    public static String punto3() {
        String[] nombreMujeres = {"Luciana ", "Isabella ", "Mariana ", "Mariángel ", "Gabriela ", "Valentina ", "Valeria ", "Sofía ", "Samantha ", "Victoria ", "Emily ", "Sara ", "Antonella ", "Valery ", "Juliana ", "Elizabeth ", "Guadalupe ", "Celeste ", "Julieta"};
        String[] nombreHombres = {"Samuel ","Jerónimo ","Matías ","Emmanuel ","Sebastián ","Mathías ","Nicolás ","Maximiliano ","Emanuel ","Alejandro ","Emiliano ","Martín ","Thiago ","Mateo ","Isaac ","Dylan ","Thomas ","Daniel ","Gerónimo"};
        String[] apellidos = {"Martínez ", "González ", "Pérez ", "García ", "López ", "Hernandez ", "Gómez ", "Sánchez ", "Diaz ", "Torres ", "Ramírez ", "Rojas ", "Jiménez ", "Moreno"};
        
        Random rand = new Random();
        
        if (rand.nextInt(2) == 1) {
            if (rand.nextInt(2) == 1) {
                String primerNombre;
                String segundoNombre;
                do {
                    primerNombre = nombreMujeres[rand.nextInt(nombreMujeres.length - 1)];
                    segundoNombre = nombreMujeres[rand.nextInt(nombreMujeres.length - 1)];
                } while(primerNombre == segundoNombre);
                return primerNombre + segundoNombre + apellidos[rand.nextInt(apellidos.length - 1)] + apellidos[rand.nextInt(apellidos.length - 1)];
            } else {
                return nombreMujeres[rand.nextInt(nombreMujeres.length - 1)] + apellidos[rand.nextInt(apellidos.length - 1)] + apellidos[rand.nextInt(apellidos.length - 1)];
            }    
        } else {
            if (rand.nextInt(2) == 1) {
                String primerNombre;
                String segundoNombre;
                do {
                    primerNombre = nombreHombres[rand.nextInt(nombreHombres.length - 1)];
                    segundoNombre = nombreHombres[rand.nextInt(nombreHombres.length - 1)];
                } while(primerNombre == segundoNombre);
                return primerNombre + segundoNombre + apellidos[rand.nextInt(apellidos.length - 1)] + apellidos[rand.nextInt(apellidos.length - 1)];
            } else {
                return nombreHombres[rand.nextInt(nombreHombres.length - 1)] + apellidos[rand.nextInt(apellidos.length - 1)] + apellidos[rand.nextInt(apellidos.length - 1)];
            }    
        }
    }
}
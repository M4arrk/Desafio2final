import java.util.ArrayList;

public class Testpersonas {

    public static void main(String[] args) {

        // Lista de personas
        EntregaPersonas persona1 = new EntregaPersonas("Marcos", "Gonzalez");
        EntregaPersonas persona2 = new EntregaPersonas("Julieta", "Gonzalez");
        EntregaPersonas persona3 = new EntregaPersonas("Juani", "Arrana");
        EntregaPersonas persona4 = new EntregaPersonas("Tanque", "Dosdientes");
        EntregaPersonas persona5 = new EntregaPersonas("Pity", "Alvarez");

        // ArrayList
        ArrayList<EntregaPersonas> PersonasArrays = new ArrayList<>();
        PersonasArrays.add(persona1);
        PersonasArrays.add(persona2);
        PersonasArrays.add(persona3);
        PersonasArrays.add(persona4);
        PersonasArrays.add(persona5);

        for (EntregaPersonas persona : PersonasArrays) {
            System.out.println(persona.getApellido() + ", " + persona.getNombre());
        }

        System.out.println("--------------------");

        PersonasArrays.sort((p1, p2) -> p1.getApellido().compareTo(p2.getApellido()));
        PersonasArrays.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        for (EntregaPersonas PersonasArray : PersonasArrays) {

            System.out.println(PersonasArray);
        }

        System.out.println("--------------------");

        PersonasArrays.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        PersonasArrays.sort((p1, p2) -> p1.getApellido().compareTo(p2.getApellido()));
        for (EntregaPersonas PersonasArray : PersonasArrays) {
            System.out.println(PersonasArray);
        }

        System.out.println("--------------------");

        PersonasArrays.sort((p1, p2) -> p2.getNombre().compareTo(p1.getNombre()));
        PersonasArrays.sort((p1, p2) -> p2.getApellido().compareTo(p1.getApellido()));
        for (EntregaPersonas PersonasArray : PersonasArrays) {
            System.out.println(PersonasArray);
        }

    }
}

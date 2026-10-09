import java.util.ArrayList;
import java.util.Scanner;
void main() {
    Scanner mijael=new Scanner(System.in);
    ArrayList<String>cursos=new ArrayList<>();
    int opcion;
    do {
        System.out.println("           Gestion de estudiantes");
        System.out.println("    1: matricula de cursos");
        System.out.println("    2: mostrar cursos");
        System.out.println("    3: actualizar cursos del estudiante");
        System.out.println("    4: curso que dsea eliminar");
        System.out.println("    5: salir");
        System.out.println("                   selecione una opcion");
        opcion= mijael.nextInt();
        mijael.nextLine();
        switch (opcion){
            case 1:
                System.out.println("     LOS CURSOS DISPONIBLES SON");
                System.out.println("  CURSOS             -COSTOS");
                System.out.println("- matematicas         S/800");
                System.out.println("- comunicacion        S/800");
                System.out.println("- leguaje             S/800");
                System.out.println("- historia            S/800 ");
                System.out.println("- programacion        S/800");
                System.out.println("      ingresa los cursos ");
                System.out.println("      ingrese su nombre");
                String nombre=mijael.nextLine();
                cursos.add(nombre);
                System.out.println("curso  registrado");
                System.out.println("nombre registrado");
                System.out.println("                  ");
                mijael.nextLine();
                break;

            case 2:
                System.out.println("   lista de cursos matriculados");
                for (int i=0;i<cursos.size();i++){
                    System.out.println(cursos.get(i));
                }
                mijael.nextLine();
                break;
            case 3:
                System.out.println("ingresa la posicion que actualizara");
                int posicin=mijael.nextInt();
                mijael.nextLine();
                System.out.println("ingresa el nuevo curso ");
                String nuevonombre= mijael.nextLine();
                cursos.set(posicin,nuevonombre);
                System.out.println("se actualizo con exito");
                mijael.nextLine();
                break;
            case 4:
                System.out.println("ingrese la pocision del curso que  desea eliminar ");
                int eliminar= mijael.nextInt();
                cursos.remove(eliminar);
                System.out.println("eliminado correctamente");
                System.out.println("                       ");
                System.out.println("                       ");
                break;
            case 5:
                System.out.println("gracias por su matricula");
                break;
        }

    }while (opcion!=5);
}

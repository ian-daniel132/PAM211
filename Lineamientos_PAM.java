import java.util.Scanner;

public class Lineamientos_PAM {
    
    public void ReglamentoPOO() {
        System.out.println("REGLAMENTO DE PROGRAMACION ORIENTADA A OBJETOS");
        System.out.println("1.- Respeto");
        System.out.println("2.- Participacion activa y en orden");
        System.out.println("3.- No entregar trabajos incompletos");
        System.out.println("4.- No se aplica examen fuera de tiempo");
        System.out.println("5.- Plagio de trabajos = 0 para todos los involucrados");
        System.out.println("6.- 3 faltas = final de parcial");
        System.out.println("7.- La calificacion maxima a obtener en final es de 8");
    }
    
    public void LineamientosDeClasroom() {
        System.out.println("LOS LINEAMIENTOS DE CLASSROOM SON: ");
        System.out.println("Entregar los trabajos para su revision");
        System.out.println("Entregas en PDF");
        System.out.println("Entregas con retraso autorizadas tendran un valor maximo de 5");
    }
    
    public void FechasDeParciales() {
        System.out.println("FECHAS DE INICIO Y FINAL DE CADA PARCIAL");
        System.out.println("Primer parcial del 01/09/2025 hasta  el 04/10/2025");
        System.out.println("Segundo parcial del 06/10/2025 hasta el 08/11/2025 ");
        System.out.println("Tercer parcial del 10/11/2025 hasta el 05/12/2025");
        System.out.println("Examenes finales del 08/12/2025 al 10/12/2025");
    }
    
    public void PorcentajesPorParcial() {
        System.out.println("PORCENTAJES DE EVALUACION POR PARCIAL");
        System.out.println("PORCENTAJES DEL PRIMER PARCIAL:");
        System.out.println("Evidencia de conocimiento: 40%");
        System.out.println("Evidencia de desempeño: 20%");
        System.out.println("Evidencia de producto: 30%");
        System.out.println("Proyecto integrador: 10%");
        System.out.println("XxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXx");
        System.out.println("PORCENTAJES DEL SEGUNDO PARCIAL:");
        System.out.println("Evidencia de conocimiento: 40%");
        System.out.println("Evidencia de desempeño: 20%");
        System.out.println("Evidencia de producto: 20%");
        System.out.println("Proyecto integrador: 20%");
        System.out.println("XxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXx");
        System.out.println("PORCENTAJES DEL TERCER PARCIAL:");
        System.out.println("Evidencia de conocimiento: 20%");
        System.out.println("Evidencia de desempeño: 10%");
        System.out.println("Evidencia de producto: 40%");
        System.out.println("Proyecto integrador: 30%");
    }
    
    public void Menu() {
        Scanner scanner = new Scanner(System.in);
        String opcion;
        
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Reglamento de POO");
            System.out.println("2. Lineamientos de Classroom");
            System.out.println("3. Fechas de parciales");
            System.out.println("4. Porcentajes por parcial");
            System.out.println("5. Salir");
            System.out.print("Elige una opción (1-5): ");
            
            opcion = scanner.nextLine();
            
            switch (opcion) {
                case "1":
                    ReglamentoPOO();
                    break;
                case "2":
                    LineamientosDeClasroom();
                    break;
                case "3":
                    FechasDeParciales();
                    break;
                case "4":
                    PorcentajesPorParcial();
                    break;
                case "5":
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida, por favor elige otra vez");
            }
            
            // Pausa para que el usuario pueda ver la información
            if (!opcion.equals("5")) {
                System.out.println("\nPresiona Enter para continuar...");
                scanner.nextLine();
            }
            
        } while (!opcion.equals("5"));
        
        scanner.close();
    }
    
    public static void main(String[] args) {
        Lineamientos_PAM programa = new Lineamientos_PAM();
        programa.Menu();
    }
}
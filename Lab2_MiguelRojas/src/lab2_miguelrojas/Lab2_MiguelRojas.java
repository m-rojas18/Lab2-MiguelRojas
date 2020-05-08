package lab2_miguelrojas;

import java.util.Scanner;

public class Lab2_MiguelRojas {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char resp = 's';
        boolean login = false;
        while(resp == 's'){
            System.out.print("Menu\n"
                    + "[1] Registro Casas\n"
                    + "[2] Manejo de Estados\n"
                    + "[3] Log In\n"
                    + "[4] Salir\n"
                    + "Seleccione una opcion: ");
            int opcion = sc.nextInt();
            sc = new Scanner(System.in);
            System.out.println();
            switch(opcion){
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    resp = 'n';
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        }
    }
    
}

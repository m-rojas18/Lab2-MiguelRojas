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
                    //Validar el login
                    if (login == false) {
                        System.out.print("Debe ingresar a su cuenta para poder acceder a esta funcion.");
                    } else{
                        //TO DO: Menu Registro de Casas
                    }
                    
                    break;
                case 2:
                    //Validar el login
                    if (login == false) {
                        System.out.print("Debe ingresar a su cuenta para poder acceder a esta funcion.");
                    } else {
                        //TO DO: Menu Manejo de Estados
                    }
                    break;
                case 3:
                    //Verificar el usuario
                    System.out.print("Ingrese su usuario: ");
                    String user  = sc.next();
                    sc = new Scanner(System.in);
                    if (user.equals("leobanegas")) {
                        //Verificar la Contraseña
                        System.out.print("Ingrese su contraseña: ");
                        String pw = sc.next();
                        sc = new Scanner(System.in);
                        if (pw.equals("99")) {
                            System.out.println("Bienvenido Leonardo!!\n"
                                    + "Ya tiene acceso a las funciones del Programa.");
                            login = true;
                        } else {
                            System.out.println("La contraseña es incorrecta.\n");
                        }
                    } else {
                        System.out.println("El usuario es incorrecto.\n");
                    }
                    break;
                case 4:
                    System.out.println("Fin del Programa.");
                    resp = 'n';
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        }
    }
    
}

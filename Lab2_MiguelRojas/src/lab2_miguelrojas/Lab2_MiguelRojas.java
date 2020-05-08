package lab2_miguelrojas;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_MiguelRojas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char resp = 's';
        boolean login = false;

        ArrayList<Casa> lista_casas = new ArrayList();

        Casa c0 = new Casa(1215, 4, "Rojo", 100, 100, "Si", 2, 4, 6, "Miguel Rojas", "Lista", "Ing. Tabora");
        Casa c1 = new Casa(1800, 5, "Blanca", 150, 150, "No", 1, 2, 3, "Sin Dueño", "Construccion", "Ing. Montoya");
        lista_casas.add(c0);
        lista_casas.add(c1);
        while (resp == 's') {
            System.out.print("Menu\n"
                    + "[1] Registro Casas\n"
                    + "[2] Manejo de Estados\n"
                    + "[3] Log In\n"
                    + "[4] Salir\n"
                    + "Seleccione una opcion: ");
            int opcion = sc.nextInt();
            sc = new Scanner(System.in);
            System.out.println();
            switch (opcion) {
                case 1:
                    //Validar el login
                    if (login == false) {
                        System.out.print("Debe ingresar a su cuenta para poder acceder a esta funcion.");
                    } else {
                        //TO DO: Menu Registro de Casas
                        boolean flag_menu2 = true;
                        while (flag_menu2) {
                            System.out.print("Menu---Registro Casas\n"
                                    + "[1] Crear Casas\n"
                                    + "[2] Listar Casas\n"
                                    + "[3] Modificar Casas\n"
                                    + "[4] Borrar Casas\n"
                                    + "[5] Salir\n"
                                    + "Seleccione una opcion: ");
                            int opcion_m2 = sc.nextInt();
                            sc = new Scanner(System.in);
                            System.out.println();
                            switch (opcion_m2) {
                                case 1:
                                    //Ingreso de Datos para una Casa
                                    //Numero de Casa
                                    System.out.print("Crear Casa\n"
                                            + "Ingrese numero de Casa: ");
                                    int num_casa = sc.nextInt();
                                    sc = new Scanner(System.in);
                                    //Numero de Bloque
                                    System.out.print("Ingrese numero de bloque: ");
                                    int num_bloque = sc.nextInt();
                                    sc = new Scanner(System.in);
                                    //Color
                                    System.out.print("Ingrese color de la casa: ");
                                    String color_casa = sc.next();
                                    sc = new Scanner(System.in);
                                    //Ancho
                                    System.out.print("Ingrese ancho de la casa: ");
                                    int ancho = sc.nextInt();
                                    sc = new Scanner(System.in);
                                    //Largo
                                    System.out.print("Ingrese largo de la casa: ");
                                    int largo = sc.nextInt();
                                    sc = new Scanner(System.in);
                                    //Comprada
                                    System.out.print("Casa Comprada\n"
                                            + "[1] Si\n"
                                            + "[2] No\n"
                                            + "Eliga situacion de la casa: ");
                                    int opcion_compra = sc.nextInt();
                                    sc = new Scanner(System.in);
                                    String casa_compra = "";
                                    if (opcion_compra == 1) {
                                        casa_compra = "Si";
                                    } else {
                                        casa_compra = "No";
                                    }
                                    //Numero de Pisos
                                    System.out.print("Ingrese numero de pisos: ");
                                    int num_pisos = sc.nextInt();
                                    sc = new Scanner(System.in);
                                    //Numero de Banos
                                    System.out.print("Ingrese numero de baños: ");
                                    int num_banos = sc.nextInt();
                                    //Numero de Cuartos
                                    System.out.print("Ingrese numero de cuartos: ");
                                    int num_cuartos = sc.nextInt();
                                    //Dueño
                                    String owner_casa = "";
                                    if (casa_compra.equals("Si")) {
                                        System.out.print("Ingrese nombre del dueño de la casa: ");
                                        owner_casa = sc.nextLine();
                                        sc = new Scanner(System.in);
                                    } else {
                                        owner_casa = "Sin dueño";
                                    }
                                    //Estado
                                    boolean flag_estado = true;
                                    String estado_casa = "";
                                    while (flag_estado) {
                                        System.out.print("Estado de la Casa\n"
                                                + "[1] Lista\n"
                                                + "[2] Construcción\n"
                                                + "[3] Construcción en Espera\n"
                                                + "[4] Espera de Demolición\n"
                                                + "Eliga estado de la casa: ");
                                        int op_estado = sc.nextInt();
                                        switch (op_estado) {
                                            case 1:
                                                //Estado Lista //ArrayList Despues
                                                estado_casa = "Lista";
                                                flag_estado = false;
                                                break;
                                            case 2:
                                                //Estado Construccion //ArrayList Despues
                                                estado_casa = "Construccion";
                                                flag_estado = false;
                                                break;
                                            case 3:
                                                //Estado Construccion en Espera //ArrayList Despues
                                                estado_casa = "Construccion en Espera";
                                                flag_estado = false;
                                                break;
                                            case 4:
                                                //Estado Espera de Demolicion //ArrayList Despues
                                                estado_casa = "Espera de Demolicion";
                                                flag_estado = false;
                                                break;
                                            default:
                                                System.out.println("Ingrese una opcion valida.");
                                        }
                                    }

                                    //Nombre del Ingeniero
                                    System.out.print("Ingrese el nombre del ingeniero a cargo de la casa: ");
                                    String nombre_ing = sc.nextLine();
                                    sc = new Scanner(System.in);
                                    //Agregar Casa a Lista
                                    lista_casas.add(new Casa(num_casa, num_bloque, color_casa,
                                            ancho, largo, casa_compra, num_pisos, num_banos,
                                            num_cuartos, owner_casa, estado_casa, nombre_ing));
                                    System.out.println("Se creo la Casa con exito!!");
                                    break;
                                case 2:
                                    String casas = "";
                                    for (int i = 0; i < lista_casas.size(); i++) {
                                        Casa c = lista_casas.get(i);
                                        casas += "[" + i + "] " + "Numero de Casa: " + c.getNumero_casa()
                                                + ", Dueño de Casa: " + c.getNombre_dueno()
                                                + ", Estado: " + c.getEstado() + "\n";
                                    }

                                    System.out.print("Listado de Casas\n"
                                            + casas);
                                    System.out.println();
                                    break;
                                case 3:
                                    //Imprimir Casas para poder Seleccionar
                                    String listar_casas = "";
                                    for (int i = 0; i < lista_casas.size(); i++) {
                                        Casa c = lista_casas.get(i);
                                        listar_casas += "[" + i + "] " + "Numero de Casa: " + c.getNumero_casa()
                                                + ", Dueño de Casa: " + c.getNombre_dueno()
                                                + ", Estado: " + c.getEstado() + "\n";
                                    }

                                    System.out.print("---Modificar Casa---\n"
                                            + listar_casas + "\n"
                                            + "Seleccione casa a modificar: ");
                                    int casa_mod = sc.nextInt();
                                    //Crear Objeto Casa
                                    Casa c_mod = lista_casas.get(casa_mod);
                                    boolean flag_mod = true;
                                    //Menu de Modificacion
                                    while (flag_mod) {
                                        System.out.print("---Menu Modificar Casa---\n"
                                                + "[1] Numero de Casa\n"
                                                + "[2] Numero de Bloque\n"
                                                + "[3] Color\n"
                                                + "[4] Ancho de Casa\n"
                                                + "[5] Largo de Casa\n"
                                                + "[6] Estado de Compra\n"
                                                + "[7] Numero de Pisos\n"
                                                + "[8] Numero de Baños\n"
                                                + "[9] Numero de Cuartos\n"
                                                + "[10] Nombre del dueño\n"
                                                + "[11] Nombre de Ingeniero\n"
                                                + "[12] Salir\n"
                                                + "Seleccione una opcion: ");
                                        int op_mod = sc.nextInt();
                                        sc = new Scanner(System.in);
                                        switch (op_mod) {
                                            case 1:
                                                //Numero de casa
                                                System.out.print("Ingrese nuevo numero de casa: ");
                                                int num_casaMod = sc.nextInt();
                                                sc = new Scanner(System.in);
                                                c_mod.setNumero_casa(num_casaMod);
                                                System.out.println("Se modifico con exito.\n");
                                                break;
                                            case 2:
                                                //Numero de Bloque
                                                System.out.print("Ingrese nuevo numero de bloque:  ");
                                                int num_bloqueMod = sc.nextInt();
                                                sc = new Scanner(System.in);
                                                c_mod.setNumero_bloque(num_bloqueMod);
                                                System.out.println("Se modifico con exito.\n");
                                                break;
                                            case 3:
                                                //Color
                                                System.out.print("Ingrese nuevo color: ");
                                                String color_mod = sc.next();
                                                sc = new Scanner(System.in);
                                                c_mod.setColor(color_mod);
                                                System.out.println("Se modifico con exito.\n");
                                                break;
                                            case 4:
                                                //Ancho
                                                System.out.print("Ingrese nuevo ancho: ");
                                                int ancho_mod = sc.nextInt();
                                                sc = new Scanner(System.in);
                                                c_mod.setAncho(ancho_mod);
                                                System.out.println("Se modifico con exito.\n");
                                                break;
                                            case 5:
                                                //Largo
                                                System.out.print("Ingrese nuevo largo: ");
                                                int largo_mod = sc.nextInt();
                                                sc = new Scanner(System.in);
                                                c_mod.setLargo(largo_mod);
                                                System.out.println("Se modifico con exito.\n");
                                                break;
                                            case 6:
                                                //Comprada
                                                System.out.print("Estado de Compra\n"
                                                        + "[1] Comprada\n"
                                                        + "[2] No Comprada\n"
                                                        + "Seleccione estado de compra: ");
                                                int compra_mod = sc.nextInt();
                                                String comprada_mod = "";
                                                sc = new Scanner(System.in);
                                                if (compra_mod == 1) {
                                                    comprada_mod = "Si";
                                                } else {
                                                    comprada_mod = "No";
                                                    c_mod.setNombre_dueno("Sin Dueño");
                                                }
                                                c_mod.setComprada(comprada_mod);
                                                System.out.println("Se modifico con exito.\n");
                                                break;
                                            case 7:
                                                System.out.print("Ingrese nuevo numero de pisos: ");
                                                int num_pisosMod = sc.nextInt();
                                                sc = new Scanner(System.in);
                                                c_mod.setNumero_pisos(num_pisosMod);
                                                System.out.println("Se modifico con exito.\n");
                                                break;
                                            case 8:
                                                System.out.print("Ingrese nuevo numero de baños: ");
                                                int num_banosMod = sc.nextInt();
                                                sc = new Scanner(System.in);
                                                c_mod.setNum_bathrooms(num_banosMod);
                                                System.out.println("Se modifico con exito.\n");
                                                break;
                                            case 9:
                                                System.out.print("Ingrese nuevo numero de cuartos: ");
                                                int num_cuartosMod = sc.nextInt();
                                                sc = new Scanner(System.in);
                                                c_mod.setNumero_cuartos(num_cuartosMod);
                                                System.out.println("Se modifico con exito.\n");
                                                break;
                                            case 10:
                                                if (c_mod.getComprada().equals("Si")) {
                                                    System.out.print("Ingrese nombre de nuevo dueño: ");
                                                    String nombre_duenoMod = sc.nextLine();
                                                    sc = new Scanner(System.in);
                                                    c_mod.setNombre_dueno(nombre_duenoMod);
                                                } else {
                                                    System.out.println("La casa no esta comprada asi que no hay un dueño.");
                                                }
                                                System.out.println("Se modifico con exito.\n");
                                                break;
                                            case 11:
                                                System.out.print("Ingrese nombre del nuevo ingeniero: ");
                                                String nombre_ingMod = sc.nextLine();
                                                sc = new Scanner(System.in);
                                                c_mod.setNombre_ingeniero(nombre_ingMod);
                                                System.out.println("Se modifico con exito.\n");
                                                break;
                                            case 12:
                                                System.out.println();
                                                flag_mod = false;
                                                break;
                                            default:
                                                System.out.println("Ingrese una opcion valida.");
                                        }
                                    }//Fin While Modificar
                                    break;
                                case 4:
                                    if (lista_casas.isEmpty()) {
                                        System.out.println("No existe ninguna casa.");
                                    } else {
                                        String casas_elim = "";
                                        for (int i = 0; i < lista_casas.size(); i++) {
                                            Casa c = lista_casas.get(i);
                                            casas_elim += "[" + i + "] " + "Numero de Casa: " + c.getNumero_casa()
                                                    + ", Dueño de Casa: " + c.getNombre_dueno()
                                                    + ", Estado: " + c.getEstado() + "\n";
                                        }

                                        System.out.print(casas_elim + "\n"
                                                + "Seleccion casa a eliminar: ");
                                        int op_elim = sc.nextInt();
                                        sc = new Scanner(System.in);
                                        System.out.print("Borrar\n"
                                                + "[1] Si\n"
                                                + "[2] No\n"
                                                + "Seguro? : ");
                                        int elim = sc.nextInt();
                                        if (elim == 1) {
                                            lista_casas.remove(op_elim);
                                            System.out.println("Se borro con exito la casa.\n");
                                        } else {
                                            System.out.println("No se borro la casa.\n");
                                        }
                                    }
                                    break;
                                case 5:
                                    flag_menu2 = false;
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion valida.");
                            }
                        }
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
                    String user = sc.next();
                    sc = new Scanner(System.in);
                    if (user.equals("leobanegas")) {
                        //Verificar la Contraseña
                        System.out.print("Ingrese su contraseña: ");
                        String pw = sc.next();
                        sc = new Scanner(System.in);
                        System.out.println();
                        if (pw.equals("99")) {
                            System.out.println("Bienvenido Leonardo!!\n"
                                    + "Ya tiene acceso a las funciones del Programa.\n");
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

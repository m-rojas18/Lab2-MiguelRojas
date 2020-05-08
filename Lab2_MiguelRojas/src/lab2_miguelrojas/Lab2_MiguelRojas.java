package lab2_miguelrojas;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_MiguelRojas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char resp = 's';
        boolean login = false;

        ArrayList<Casa> lista_general = new ArrayList();//Lista de Casas General
        ArrayList<Casa> casas_listas = new ArrayList();//Lista de Casas Listas
        ArrayList<Casa> casas_construccion = new ArrayList(); //Lista de Casas en Construccion
        ArrayList<Casa> casas_EsperaConst = new ArrayList();//Lista de Casas en Espera de Construccion
        ArrayList<Casa> casas_EsperaDeml = new ArrayList(); //Lista de Casas en Espera de Demolicion

        Casa c0 = new Casa(1215, 4, "Rojo", 100, 100, "Si", 2, 4, 6, "Miguel Rojas", "Lista", "Ing. Tabora");
        Casa c1 = new Casa(1800, 5, "Blanca", 150, 150, "No", 1, 2, 3, "Sin Dueño", "Construccion", "Ing. Montoya");
        lista_general.add(c0);
        lista_general.add(c1);
        casas_listas.add(c0);
        casas_construccion.add(c1);
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
                                                //Estado Lista 
                                                estado_casa = "Lista";
                                                flag_estado = false;
                                                break;
                                            case 2:
                                                //Estado Construccion
                                                estado_casa = "Construccion";
                                                flag_estado = false;
                                                break;
                                            case 3:
                                                //Estado Construccion en Espera
                                                estado_casa = "Construccion en Espera";
                                                flag_estado = false;
                                                break;
                                            case 4:
                                                //Estado Espera de Demolicion
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

                                    //Crear Objeto
                                    Casa casa_creada = new Casa(num_casa, num_bloque, color_casa,
                                            ancho, largo, casa_compra, num_pisos, num_banos,
                                            num_cuartos, owner_casa, estado_casa, nombre_ing);

                                    //Agregar a lista del Estado
                                    if (estado_casa.equals("Lista")) {
                                        //Agregar Casa a Lista General
                                        lista_general.add(casa_creada);
                                        //Agregar a lista de Casas Listas
                                        casas_listas.add(casa_creada);
                                        System.out.println("Se creo la Casa con exito!!");
                                    }
                                    if (estado_casa.equals("Construccion")) {
                                        //Agregar a Lista de Casas en Construccion
                                        if (casas_construccion.size() < 5) {
                                            casas_construccion.add(casa_creada);
                                            lista_general.add(casa_creada);
                                            System.out.println("Se creo la Casa con exito!!");
                                        } else {
                                            System.out.println("Ya no se pueden agregar mas Casas en Construccion.");
                                        }
                                    }

                                    //Agregar a Lista de Casas en Espera de Construccion
                                    if (estado_casa.equals("Construccion en Espera")) {
                                        lista_general.add(casa_creada);
                                        casas_EsperaConst.add(casa_creada);
                                        System.out.println("Se creo la Casa con exito!!");
                                    }

                                    if (estado_casa.equals("Espera de Demolicion")) {
                                        if (casas_EsperaDeml.size() < 3) {
                                            casas_EsperaDeml.add(casa_creada);
                                            lista_general.add(casa_creada);
                                            System.out.println("Se creo la Casa con exito!!");
                                        } else {
                                            System.out.println("Ya no se pueden agregar mas Casas en Espera de Demolicion");
                                        }
                                    }

                                    break;
                                case 2:
                                    String casas = "";
                                    for (int i = 0; i < lista_general.size(); i++) {
                                        Casa c = lista_general.get(i);
                                        casas += "[" + i + "] " + "Numero de Casa: " + c.getNumero_casa() + "\n"
                                                + "Numero de Bloque: " + c.getNumero_bloque() + "\n"
                                                + "Color: " + c.getColor() + "\n"
                                                + "Ancho: " + c.getAncho() + "\n"
                                                + "Largo: " + c.getLargo() + "\n"
                                                + "Comprada: " + c.getComprada() + "\n"
                                                + "Numero de pisos: " + c.getNumero_pisos() + "\n"
                                                + "Numero de banos: " + c.getNum_bathrooms() + "\n"
                                                + "Numero de Cuartos: " + c.getNumero_cuartos() + "\n"
                                                + "Nombre del Dueño: " + c.getNombre_dueno() + "\n"
                                                + "Estado: " + c.getEstado() + "\n"
                                                + "Nombre del Ingeniero: " + c.getNombre_ingeniero() + "\n\n";
                                    }

                                    System.out.print("---Listado de Casas---\n\n"
                                            + casas);
                                    System.out.println();
                                    break;
                                case 3:
                                    //Imprimir Casas para poder Seleccionar
                                    String listar_casas = "";
                                    for (int i = 0; i < lista_general.size(); i++) {
                                        Casa c = lista_general.get(i);
                                        listar_casas += "[" + i + "] " + "Numero de Casa: " + c.getNumero_casa()
                                                + ", Dueño de Casa: " + c.getNombre_dueno()
                                                + ", Estado: " + c.getEstado() + "\n";
                                    }

                                    System.out.print("---Modificar Casa---\n"
                                            + listar_casas + "\n"
                                            + "Seleccione casa a modificar: ");
                                    int casa_mod = sc.nextInt();
                                    sc = new Scanner(System.in);
                                    System.out.println();
                                    //Crear Objeto Casa
                                    Casa c_mod = lista_general.get(casa_mod);
                                    boolean flag_mod = true;
                                    while (flag_mod) {
                                        String casa_modificar = "-----Casa Modificando-----\n\nNumero de Casa: " + c_mod.getNumero_casa() + "\n"
                                                + "Numero de Bloque: " + c_mod.getNumero_bloque() + "\n"
                                                + "Color: " + c_mod.getColor() + "\n"
                                                + "Ancho: " + c_mod.getAncho() + "\n"
                                                + "Largo: " + c_mod.getLargo() + "\n"
                                                + "Comprada: " + c_mod.getComprada() + "\n"
                                                + "Numero de pisos: " + c_mod.getNumero_pisos() + "\n"
                                                + "Numero de banos: " + c_mod.getNum_bathrooms() + "\n"
                                                + "Numero de Cuartos: " + c_mod.getNumero_cuartos() + "\n"
                                                + "Nombre del Dueño: " + c_mod.getNombre_dueno() + "\n"
                                                + "Estado: " + c_mod.getEstado() + "\n"
                                                + "Nombre del Ingeniero: " + c_mod.getNombre_ingeniero() + "\n\n";
                                        System.out.println(casa_modificar);
                                        //Menu de Modificacion
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
                                        System.out.println();
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
                                    if (lista_general.isEmpty()) {
                                        System.out.println("No existe ninguna casa.");
                                    } else {
                                        String casas_elim = "";
                                        for (int i = 0; i < lista_general.size(); i++) {
                                            Casa c = lista_general.get(i);
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
                                            Casa c_elim = lista_general.get(op_elim);
                                            if (c_elim.getEstado().equals("Lista")) {
                                                lista_general.remove(op_elim);
                                                casas_listas.remove(c_elim);
                                                System.out.println("Se borro con exito la casa.\n");
                                            }

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
                        boolean flag_manejoEstado = true;
                        while (flag_manejoEstado) {
                            System.out.print("---Menu Manejo de Estado\n"
                                    + "[1] Cambiar Estados\n"
                                    + "[2] Salir\n"
                                    + "Seleccione una opcion: ");
                            int op_manejo_Estados = sc.nextInt();
                            sc = new Scanner(System.in);
                            System.out.println();
                            switch (op_manejo_Estados) {
                                case 1:
                                    System.out.print("-----Cambiar Estado de Casas-----\n"
                                            + "[1] Listas\n"
                                            + "[2] En Construccion\n"
                                            + "[3] Construccion en Espera\n"
                                            + "[4] En Espera de Demolicion\n"
                                            + "[5] Salir\n"
                                            + "Seleccione una opcion: ");
                                    int op_estado = sc.nextInt();
                                    sc = new Scanner(System.in);
                                    System.out.println();
                                    switch (op_estado) {
                                        case 1:
                                            String salida_casasListas = "";
                                            for (int i = 0; i < casas_listas.size(); i++) {
                                                Casa cs = casas_listas.get(i);
                                                salida_casasListas += "[" + i + "] " + "Numero de Casa: " + cs.getNumero_casa()
                                                        + ", Dueño de Casa: " + cs.getNombre_dueno()
                                                        + ", Estado: " + cs.getEstado() + "\n";
                                            }
                                            if (casas_listas.isEmpty()) {
                                                System.out.println("No existe ninguna Casa Lista\n\n");
                                            } else {
                                                System.out.print("Casas Lista\n"
                                                        + salida_casasListas + "\n"
                                                        + "Seleccione una casa a cambiar el estado:");
                                                int casa_estado = sc.nextInt();
                                                sc = new Scanner(System.in);
                                                boolean flag_cambio_lista = true;
                                                while (flag_cambio_lista) {
                                                    System.out.println("Cambiar estado a:'Espera en Demolicion'\n"
                                                            + "[1] Si\n"
                                                            + "[2] No\n"
                                                            + "Eliga una opcion: ");
                                                    int cambiar_casaLista = sc.nextInt();
                                                    sc = new Scanner(System.in);

                                                    switch (cambiar_casaLista) {
                                                        case 1:
                                                            if (casas_EsperaDeml.size() < 3) {
                                                                //Cambiar estado de Casa
                                                                casas_listas.get(casa_estado).setEstado("Espera en Demolicion");
                                                                //Cambiar a nueva lista
                                                                casas_EsperaDeml.add(casas_listas.get(casa_estado));
                                                                //Borrar de Lista previa
                                                                casas_listas.remove(casa_estado);
                                                                System.out.println("Se realizo el cambio exitosamente!!\n\n");
                                                                flag_cambio_lista = false;
                                                            } else {
                                                                System.out.println("No se realizo el cambio de estado dado q ya existen 3 casas\n"
                                                                        + "en 'Espera en Demolicion'.\n\n");
                                                                flag_cambio_lista = false;
                                                            }
                                                            break;
                                                        case 2:
                                                            flag_cambio_lista = false;
                                                            System.out.println("No se realizo el cambio de estado.\n\n");
                                                            break;
                                                        default:
                                                            System.out.println("Ingrese una opcion valida.\n");
                                                    }
                                                }
                                            }

                                            break;
                                        case 2:
                                            String salida_casasConst = "";
                                            for (int i = 0; i < casas_construccion.size(); i++) {
                                                Casa cc = casas_construccion.get(i);
                                                salida_casasConst += "[" + i + "] " + "Numero de Casa: " + cc.getNumero_casa()
                                                        + ", Dueño de Casa: " + cc.getNombre_dueno()
                                                        + ", Estado: " + cc.getEstado() + "\n";
                                            }

                                            if (casas_construccion.isEmpty()) {
                                                System.out.println("No existe ninguna casa en Construccion\n\n");
                                            } else {
                                                System.out.print("Casas en Construccion\n"
                                                        + salida_casasConst + "\n"
                                                        + "Seleccione una casa a cambiar el estado: ");
                                                int casa_const_i = sc.nextInt();
                                                sc = new Scanner(System.in);
                                                System.out.println("Cambiar estado"
                                                        + "[1] Espera en Construccion\n"
                                                        + "[2] Lista\n"
                                                        + "Eliga una opcion: ");
                                                int cambio_2 = sc.nextInt();
                                                sc = new Scanner(System.in);

                                                if (cambio_2 == 1) {
                                                    System.out.print("Realizar cambio de estado?\n"
                                                            + "[1] Si\n"
                                                            + "[2] No\n"
                                                            + "Eliga una opcion");
                                                    int cambio_construccionR = sc.nextInt();
                                                    sc = new Scanner(System.in);
                                                    if (cambio_construccionR == 1) {
                                                        casas_construccion.get(casa_const_i).setEstado("Construccion en Espera");
                                                        casas_EsperaConst.add(casas_construccion.get(casa_const_i));
                                                        casas_construccion.remove(casa_const_i);
                                                        System.out.println("Se realizo el cambio de estado con exitosamente!!\n\n");
                                                    } else {
                                                        System.out.println("No se realizo el cambio de estado.\n\n");
                                                    }
                                                } else {
                                                    System.out.print("Realizar cambio de estado?\n"
                                                            + "[1] Si\n"
                                                            + "[2] No\n"
                                                            + "Eliga una opcion");
                                                    int cambio_constResp = sc.nextInt();
                                                    sc = new Scanner(System.in);
                                                    if (cambio_constResp == 1) {
                                                        casas_construccion.get(casa_const_i).setEstado("Lista");
                                                        casas_listas.add(casas_construccion.get(casa_const_i));
                                                        casas_construccion.remove(casa_const_i);
                                                        System.out.println("Se realizo el cambio de estado exitosamente!!\n\n");
                                                    } else {
                                                        System.out.println("No se realizo el cambio de estado.\n\n");
                                                    }
                                                }
                                            }
                                            break;
                                        case 3:
                                            String salida_casasEsperaC = "";
                                            for (int i = 0; i < casas_EsperaConst.size(); i++) {
                                                Casa cec = casas_EsperaConst.get(i);
                                                salida_casasEsperaC += "[" + i + "] " + "Numero de Casa: " + cec.getNumero_casa()
                                                        + ", Dueño de Casa: " + cec.getNombre_dueno()
                                                        + ", Estado: " + cec.getEstado() + "\n";
                                            }

                                            if (casas_EsperaConst.isEmpty()) {
                                                System.out.println("No existe ninguna casa en espera de Construccion\n\n");
                                            } else {
                                                System.out.print("Casas en Espera de Construccion\n"
                                                        + salida_casasEsperaC + "\n"
                                                        + "Seleccione una casa a cambiar el estado: ");
                                                int cec_i = sc.nextInt();
                                                sc = new Scanner(System.in);
                                                boolean flag_manejoEDC = true;
                                                while (flag_manejoEDC) {
                                                    System.out.print("Cambiar estado a: En Construccion\n"
                                                            + "[1] Si\n"
                                                            + "[2] No\n"
                                                            + "Eliga una opcion: ");
                                                    int opcion_cec = sc.nextInt();
                                                    sc = new Scanner(System.in);
                                                    switch (opcion_cec) {
                                                        case 1:
                                                            if (casas_construccion.size() < 5) {
                                                                casas_EsperaConst.get(cec_i).setEstado("Construccion");
                                                                casas_construccion.add(casas_EsperaConst.get(cec_i));
                                                                casas_EsperaConst.remove(cec_i);
                                                                System.out.println("Se realizo el cambio de estado con exito!!");
                                                                flag_manejoEDC = false;
                                                            } else {
                                                                System.out.println("No se pudo realizar el cambio de estado dado que\n"
                                                                        + "ya existian 5 casas en construccion.");
                                                                flag_manejoEDC = false;
                                                            }
                                                            break;
                                                        case 2:
                                                            System.out.println("No se realizo el cambio de estado.\n");
                                                            flag_manejoEDC = false;
                                                            break;
                                                        default:
                                                            System.out.println("Ingrese una opcion valida.\n");
                                                    }
                                                }
                                            }
                                            break;
                                        case 4:
                                            String salida_casasEsperaD = "";
                                            for (int i = 0; i < casas_EsperaDeml.size(); i++) {
                                                Casa ced = casas_EsperaDeml.get(i);
                                                salida_casasEsperaD += "[" + i + "] " + "Numero de Casa: " + ced.getNumero_casa()
                                                        + ", Dueño de Casa: " + ced.getNombre_dueno()
                                                        + ", Estado: " + ced.getEstado() + "\n";
                                            }
                                            if (casas_EsperaDeml.isEmpty()) {
                                                System.out.println("No existen casas en Espera de Demolicion\n\n");
                                            } else {
                                                System.out.print("Casas en Espera de Demolicion\n"
                                                        + salida_casasEsperaD + "\n"
                                                        + "Seleccione una casa: ");
                                                int ced_i = sc.nextInt();
                                                sc = new Scanner(System.in);

                                                boolean flag_demoler = true;
                                                while (flag_demoler) {
                                                    System.out.print("Desea demoler esa casa?\n"
                                                            + "[1] Si\n"
                                                            + "[2] No\n"
                                                            + "Eliga una opcion: ");
                                                    int opcion_demoler = sc.nextInt();
                                                    sc = new Scanner(System.in);
                                                    switch (opcion_demoler) {
                                                        case 1:
                                                            casas_EsperaDeml.remove(ced_i);
                                                            lista_general.remove(ced_i);
                                                            System.out.println("La casa fue demolido con exito!!");
                                                            flag_demoler = false;
                                                            break;
                                                        case 2:
                                                            System.out.println("No se demolio la casa.\n");
                                                            flag_demoler = false;
                                                            break;
                                                        default:
                                                            System.out.println("Ingrese una opcion valida.");
                                                    }
                                                }
                                            }
                                            break;
                                        case 5:
                                            System.out.println();
                                            flag_manejoEstado = false;
                                            break;
                                        default:
                                            System.out.println("Ingrese una opcion valida.\n");
                                    }
                                    break;

                                case 2:
                                    System.out.println();
                                    flag_manejoEstado = false;
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion valida.");
                            }
                        }

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

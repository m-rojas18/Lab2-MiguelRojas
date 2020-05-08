package lab2_miguelrojas;

public class Casa {


    private int numero_casa;
    private int numero_bloque;
    private String color;
    private int ancho;
    private int largo;
    private String comprada;
    private int numero_pisos;
    private int num_bathrooms;
    private int numero_cuartos;
    private String nombre_dueno;
    private String estado;
    private String nombre_ingeniero;
    
    
    //Constructores
    public Casa(){
        
    }

    public Casa(int numero_casa, int numero_bloque, String color, int ancho, int largo, String comprada, int numero_pisos, int num_bathrooms, int numero_cuartos, String nombre_dueno, String estado, String nombre_ingeniero) {
        this.numero_casa = numero_casa;
        this.numero_bloque = numero_bloque;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.comprada = comprada;
        this.numero_pisos = numero_pisos;
        this.num_bathrooms = num_bathrooms;
        this.numero_cuartos = numero_cuartos;
        this.nombre_dueno = nombre_dueno;
        this.estado = estado;
        this.nombre_ingeniero = nombre_ingeniero;
    }

    //Mutadores
    //Numero de Casa
    public int getNumero_casa() {
        return numero_casa;
    }
    public void setNumero_casa(int numero_casa) {
        this.numero_casa = numero_casa;
    }

    //Numero de Bloque
    public int getNumero_bloque() {
        return numero_bloque;
    }
    public void setNumero_bloque(int numero_bloque) {
        this.numero_bloque = numero_bloque;
    }

    //Color de Casa
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //Ancho
    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    //Largo
    public int getLargo() {
        return largo;
    }
    public void setLargo(int largo) {
        this.largo = largo;
    }

    //Estado de Compra
    public String getComprada() {
        return comprada;
    }
    public void setComprada(String comprada) {
        this.comprada = comprada;
    }

    //Numero de Pisos
    public int getNumero_pisos() {
        return numero_pisos;
    }
    public void setNumero_pisos(int numero_pisos) {
        this.numero_pisos = numero_pisos;
    }

    //Numero de baños
    public int getNum_bathrooms() {
        return num_bathrooms;
    }
    public void setNum_bathrooms(int num_bathrooms) {
        this.num_bathrooms = num_bathrooms;
    }

    //Numero de Cuartos
    public int getNumero_cuartos() {
        return numero_cuartos;
    }
    public void setNumero_cuartos(int numero_cuartos) {
        this.numero_cuartos = numero_cuartos;
    }

    //Nombre de dueño
    public String getNombre_dueno() {
        return nombre_dueno;
    }
    public void setNombre_dueno(String nombre_dueno) {
        this.nombre_dueno = nombre_dueno;
    }

    //Estado de Casa
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    //Nombre de Ingeniero
    public String getNombre_ingeniero() {
        return nombre_ingeniero;
    }
    public void setNombre_ingeniero(String nombre_ingeniero) {
        this.nombre_ingeniero = nombre_ingeniero;
    }

    @Override
    public String toString() {
        return numero_casa + "," + numero_bloque + "," + nombre_dueno;
    }
 
}

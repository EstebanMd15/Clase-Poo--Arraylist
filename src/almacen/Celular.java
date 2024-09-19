
package almacen;


public class Celular {
    private String serial;
    private String modelo;
    private String marca;
    private String color;
    private int almacenamiento;
    private double duracion;

    public Celular(String serial, String modelo, String color, int almacenamiento, String marca) {
        this.serial = serial;
        this.modelo = modelo;
        this.color = color;
        this.almacenamiento = almacenamiento;
        this.marca = marca;
        this.duracion = 0;
    }

    public Celular() {
    }

    public String getSerial() {
        return serial;
    }
    

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void prender(){
        System.out.println("El celular prendio");
    }
    public void apagar(){
        System.out.println("El celular se apago");
    }
    public double llamar(String receptor){
        System.out.println("Estoy llamando a " + receptor);
        duracion += 1;
        return duracion;
        
    }
    @Override
    public String toString(){
        return "El celular de serial: " + serial + ", de marca: " + marca + ", del modelo: " + modelo +
                ", de color: " + color + ", tiene un almacenamiento de: "+ almacenamiento + " GB";
    }
}

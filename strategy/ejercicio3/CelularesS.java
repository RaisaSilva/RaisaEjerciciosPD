package strategy.ejercicio3;

public class CelularesS {
    private String modelo, marca, gama;
    private int precio;

    public CelularesS(String modelo, String marca, String gama, int precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.gama = gama;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}

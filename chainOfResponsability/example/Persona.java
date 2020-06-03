package chainOfResponsability.example;

public class Persona {
    private String nombre;
    private int ci;
    private int monto;
    private Organizador organizador;

    public Persona(String nombre, int i, int i1, Organizador organizador) {
        this.nombre = nombre;
        this.organizador = organizador;
        this.ci = ci;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

    public void pedirPrestamo(int i) {//pedir prestamo
        organizador.criteriaHandler(i);
        monto = monto + i;
    }
}

package command.ejercicio;
import java.util.Date;

public class Receiver {

    private String usuario;
    private String cerrarSesion = "sesión actual cerrada exitosamente";
    private String reiniciar = "reiniciado...";
    private String suspeder = "Suspendido exitosamente";
    private String apagar = "apagando";

    public Receiver(String usurio) {
        this.usuario = usurio;
    }

    public void cerrarSesion() {
        System.out.println("COMMAND > Cerrrar Sesión\t>\t" + cerrarSesion + "\nHora: " + new Date().toString());
        System.out.println("Usario: " + usuario);
    }
    public void reiniciar() {
        System.out.println("COMMAND > Reiniciar\t>\t" + reiniciar + "\nHora: " + new Date().toString());
        System.out.println("Usario: " + usuario);
    }

    public void suspender() {
        System.out.println("COMMAND > Suspender\t>\t" + suspeder + "\nHora: " + new Date().toString());
        System.out.println("Usario: " + usuario);
    }

    public void apagar() {
        System.out.println("COMMAND > Apagar\t>\t" + apagar + "\nHora: " + new Date().toString());
        System.out.println("Usario: " + usuario);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCerrarSesion() {
        return cerrarSesion;
    }

    public void setCerrarSesion(String cerrarSesion) {
        this.cerrarSesion = cerrarSesion;
    }

    public String getReiniciar() {
        return reiniciar;
    }

    public void setReiniciar(String reiniciar) {
        this.reiniciar = reiniciar;
    }

    public String getSuspeder() {
        return suspeder;
    }

    public void setSuspeder(String suspeder) {
        this.suspeder = suspeder;
    }

    public String getApagar() {
        return apagar;
    }

    public void setApagar(String apagar) {
        this.apagar = apagar;
    }
}

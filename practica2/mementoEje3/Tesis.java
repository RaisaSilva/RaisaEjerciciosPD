package practica2.mementoEje3;

public class Tesis {
    private String estado;
    private String version;

    public Tesis(String estado, String version){
        this.estado=estado;
        this.version =version;
    }

    public void showData(){
        System.out.println("estado : "+this.estado);
        System.out.println("version : "+this.version);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

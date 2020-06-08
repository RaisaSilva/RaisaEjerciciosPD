package practica2.practica2Observer;

public class Videos implements IObserver {
    private String titulo;
    private String tipo;
    private String tiempo;
    private String categoria;

    public Videos(String titulo, String tipo, String tiempo, String categoria) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.tiempo = tiempo;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    private void notifySubscribers() {
    }


    @Override
    public void update() {
        this.titulo = titulo;
        notifySubscribers();

    }

    @Override
    public void subscribeChannel(CanalYT canal) {

    }
}

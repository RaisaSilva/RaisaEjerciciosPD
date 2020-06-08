package practica2.practica2Observer;

import java.util.ArrayList;
import java.util.List;

public class CanalYT implements ISubject {

    private ArrayList<IObserver> subs = new ArrayList<>();
    private List<Videos> videos;
    private String categoria;
    private String tiempo;
    private String tipo;
    String titulo;

    public CanalYT() {
        this.subs = subs;
        this.videos = videos;
        this.categoria = categoria;
        this.tipo = tipo;
        this.tiempo = tiempo;
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
        this.notifyObserver();
    }


    @Override //suscribirse
    public void attach(IObserver observer) {
        this.subs.add(observer);
    }

    @Override //desuscribirse
    public void deAttach(IObserver observer) {
        this.subs.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver sub: subs){
            sub.update();
        }
    }

    public void upload(String title){
        this.titulo = title;
        notifyObserver();
    }
}

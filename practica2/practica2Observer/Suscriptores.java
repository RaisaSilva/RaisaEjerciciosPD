package practica2.practica2Observer;

public class Suscriptores implements IObserver {

    private String name;
    private CanalYT canal = new CanalYT();

    public Suscriptores(String nome, CanalYT canal) {
        this.name = nome;
    }

    @Override
    public void update() {
        System.out.println("Hey " + name + ", se subio un nuevo video" + canal.titulo);
    }

    @Override
    public void subscribeChannel(CanalYT canal)
    {
        canal = canal;
    }
}

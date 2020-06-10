package strategy.ejercicio3;

public class Tienda {

    private IStrategy strategy;
    private CelularesS[] celulares;

    public Tienda(CelularesS[] celulares) {
        this.celulares = celulares;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public CelularesS[] getCelulares() {
        return celulares;
    }

    public void setCelulares(CelularesS[] celulares) {
        this.celulares = celulares;
    }

    public void buscar1 (int precio){
        strategy.buscar(precio, celulares);
    }

    public void buscar2 (String modelo){
        strategy.buscar(modelo, celulares);
    }

    public void buscar3 (int precio, String modelo){
        strategy.buscar(precio,modelo, celulares);
    }


}

package strategy.ejercicio3;

public interface IStrategy {

    CelularesS buscar(int precio, CelularesS[] celulares);

    CelularesS buscar(String modelo, CelularesS[] celulares);

    CelularesS buscar (int precio, String modelo, CelularesS[] celulares);

}

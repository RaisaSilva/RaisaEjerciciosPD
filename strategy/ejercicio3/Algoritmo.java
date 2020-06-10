package strategy.ejercicio3;

public class Algoritmo implements IStrategy{
    @Override
    public CelularesS buscar(int precio, CelularesS[] celarr){
        CelularesS cel = new CelularesS("", "", "", 0);
        int index = 0;
        while (index<celarr.length && celarr[index].getPrecio() != precio){
            index++;
        }
        if (index < celarr.length) {
            cel = celarr[index];
            System.out.println("se encontro el celular con este precio:"+precio);
        }
        return cel;

    }

    @Override
    public CelularesS buscar(String modelo, CelularesS[] celarr){
        CelularesS cel = new CelularesS("", "", "",0 );
        int index = 0;
        while (index<celarr.length && !celarr[index].getModelo().equals(modelo)){
            index++;
        }
        if (index < celarr.length) {
            cel = celarr[index];
            System.out.println("se encontro el celular con este modelo: "+modelo);
        }

        return cel;
    }

    @Override
    public CelularesS buscar(int precio, String modelo, CelularesS[] celarr){
        CelularesS cel = new CelularesS("", "", "",0 );
        int index = 0;
        while (index<celarr.length &&!celarr[index].getModelo().equals(modelo) && celarr[index].getPrecio() != precio ){
            index++;
        }
        if (index < celarr.length) {
            cel = celarr[index];
            System.out.println("se encontro el celular con este modelo: "+modelo+", precio: "+precio);
        }

        return cel;

    }

}

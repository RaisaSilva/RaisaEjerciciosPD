package strategy.ejercicio3;

public class Client {
    public static void main(String []abx){

        CelularesS[] cel = new CelularesS[10];

        CelularesS cel1 = new CelularesS("S10", "Samsung", "Alta", 10000);
        CelularesS cel2 = new CelularesS("A20", "Samsung", "Media", 3000);
        CelularesS cel3 = new CelularesS("S8", "Samsung", "Alta", 5000);
        CelularesS cel4 = new CelularesS("S11", "Samsung", "Alta", 5600);
        CelularesS cel5 = new CelularesS("P3", "Samsung", "Alta", 3010);
        CelularesS cel6 = new CelularesS("5S", "Apple", "Alta", 1600);
        CelularesS cel7 = new CelularesS("XP", "Apple", "Alta", 8000);
        CelularesS cel8 = new CelularesS("X10", "Apple", "Alta", 40000);
        CelularesS cel9 = new CelularesS("sola", "Sony", "Baja", 980);
        CelularesS cel10 = new CelularesS("SonyEricson", "Sony", "Baja", 500);

        cel[0] = cel1;
        cel[1] = cel2;
        cel[2] = cel3;
        cel[3] = cel4;
        cel[4] = cel5;
        cel[5] = cel6;
        cel[6] = cel7;
        cel[7] = cel8;
        cel[8] = cel9;
        cel[9] = cel10;

        Tienda tienda = new Tienda(cel);

        if (cel.length > 5) {
            tienda.setStrategy(new Algoritmo2());
        } else {
            tienda.setStrategy(new Algoritmo());
        }

        tienda.buscar1(5000);
        tienda.buscar2("nokia");
        tienda.buscar3(40000, "X10");




    }

}

package practica2.practica2Observer;

public class Client {

    public static void main (String [] argsss){
        CanalYT enterate = new CanalYT();

        Suscriptores sus1 = new Suscriptores("miguel", enterate);
        Suscriptores sus2 = new Suscriptores("caro", enterate);
        Suscriptores sus3 = new Suscriptores("bruno", enterate);
        Suscriptores sus4 = new Suscriptores("caro", enterate);
        Suscriptores sus5 = new Suscriptores("alw",enterate);

        enterate.attach(sus1);
        enterate.attach(sus2);
        enterate.attach(sus3);
        enterate.attach(sus4);
        enterate.attach(sus5);

        enterate.deAttach(sus5);

        sus1.subscribeChannel(enterate);
        sus2.subscribeChannel(enterate);
        sus3.subscribeChannel(enterate);
        sus4.subscribeChannel(enterate);
        sus5.subscribeChannel(enterate);

        enterate.upload("Datos Curiosos");






    }
}

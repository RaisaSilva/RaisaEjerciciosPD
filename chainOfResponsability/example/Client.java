package chainOfResponsability.example;

public class Client {

    public static void main (String [] args){

        Organizador organizador = new Organizador();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona Juan1 = new Persona("Juan1", 9886, 0, organizador);
                Juan1.pedirPrestamo(7000);
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona Juan2 = new Persona("Juan2", 2567, 0, organizador);
                Juan2.pedirPrestamo(20000);
            }
        });


        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona Juan3 = new Persona("Juan3", 29507, 0, organizador);
                Juan3.pedirPrestamo(30000);
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona Juan4 = new Persona("Juan4", 212227, 0, organizador);
                Juan4.pedirPrestamo(60000);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

    }


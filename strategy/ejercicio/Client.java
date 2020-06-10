package strategy.ejercicio;

public class Client {
    public static void main(String []abx){

        Estudiante[] estudiantes = new Estudiante[10];

        System.out.println("-------Quick Sort-------");
        for (int i = 0; i < 10; i++) {
            estudiantes[i] = new Estudiante("X", (int) (Math.random() * 100) + 1);
        }

        for(int i = 0; i < 10; i++){
            System.out.println(estudiantes[i].getNota());
        }

        ContextColegio colegio = new ContextColegio(estudiantes);

        colegio.setStrategy(new StrategyQuick());
        colegio.order();

        System.out.println("******************");

        for(int i = 0; i < 10; i++){
            System.out.println(estudiantes[i].getNota());
        }

        System.out.println("-------Insertion Sort-------");

        for (int i = 0; i < 10; i++) {
            estudiantes[i] = new Estudiante("X", (int) (Math.random() * 100) + 1);
        }

        for(int i = 0; i < 10; i++){
            System.out.println(estudiantes[i].getNota());
        }

        colegio.setStrategy(new StrategyInsertionSort());
        colegio.order();

        System.out.println("******************");

        for(int i = 0; i < 10; i++){
            System.out.println(estudiantes[i].getNota());
        }

        System.out.println("-------Bubble Sort-------");

        for (int i = 0; i < 10; i++) {
            estudiantes[i] = new Estudiante("X", (int) (Math.random() * 100) + 1);
        }

        for(int i = 0; i < 10; i++){
            System.out.println(estudiantes[i].getNota());
        }

        colegio.setStrategy(new StrategyBubble());
        colegio.order();

        System.out.println("******************");

        for(int i = 0; i < 10; i++){
            System.out.println(estudiantes[i].getNota());
        }
    }

}

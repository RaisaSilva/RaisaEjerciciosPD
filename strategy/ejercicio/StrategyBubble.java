package strategy.ejercicio;

public class StrategyBubble implements IStrategy {

    @Override
    public Estudiante[] ordenar(Estudiante[] estudiantesarr) {
        return bubbleSort(estudiantesarr);
    }

    public Estudiante[] bubbleSort(Estudiante[] estudiantesarr) {
        int n = estudiantesarr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (estudiantesarr[j].getNota() > estudiantesarr[j + 1].getNota()) {
                    // swap temp and arr[i]
                    Estudiante temp = estudiantesarr[j];
                    estudiantesarr[j] = estudiantesarr[j + 1];
                    estudiantesarr[j + 1] = temp;
                }
            }
        }

        return estudiantesarr;
    }
}

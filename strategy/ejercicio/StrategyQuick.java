package strategy.ejercicio;

public class StrategyQuick implements IStrategy {
    @Override
    public Estudiante[] ordenar(Estudiante[] estudiantesarr) {
        return quickSort(estudiantesarr, 0, estudiantesarr.length);
    }

    private Estudiante[]  quickSort(Estudiante[] estudiantesarr, int from, int to) {
            if (from >= to - 1) {
                return estudiantesarr;

            } else {
                int pivot = from;
                boolean rightToLeft = true;
                int i = to - 1;
                while (pivot != i) {
                    if (rightToLeft) {
                        if (estudiantesarr[pivot].getNota() <= (estudiantesarr[i].getNota())) {
                            i--;
                        } else {
                            Estudiante temp = estudiantesarr[pivot];
                            estudiantesarr[pivot] = estudiantesarr[i];
                            estudiantesarr[i] = temp;
                            int temp2 = pivot;
                            pivot = i;
                            i = temp2 + 1;
                            rightToLeft = false;
                        }
                    } else {
                        if (estudiantesarr[pivot].getNota() >= estudiantesarr[i].getNota()) {
                            i++;
                        } else {
                            Estudiante temp = estudiantesarr[pivot];
                            estudiantesarr[pivot] = estudiantesarr[i];
                            estudiantesarr[i] = temp;
                            int temp2 = pivot;
                            pivot = i;
                            i = temp2 - 1;
                            rightToLeft = true;
                        }
                    }
                }
                quickSort(estudiantesarr, from, pivot);
                quickSort(estudiantesarr, pivot + 1, to);
                return estudiantesarr;
            }
        }
    }


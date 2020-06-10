package strategy.ejercicio;

public class StrategyInsertionSort implements IStrategy {
    @Override
    public Estudiante[] ordenar(Estudiante[] estudiantes) {
        return InsertionSort(estudiantes);
    }

    public Estudiante[] InsertionSort (Estudiante[] estudiantes) {
        int i, j;
        for (i = 1; i < estudiantes.length; i++) {
            j = i - 1;
            while (i > 0 && estudiantes[i].getNota() > estudiantes[j
                    ].getNota()) {
                Estudiante temp = estudiantes[i];
                estudiantes[i] = estudiantes[j];
                estudiantes[j]= temp;
            }
        }
        return estudiantes;
    }

    }
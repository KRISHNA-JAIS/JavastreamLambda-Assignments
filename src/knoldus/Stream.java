package knoldus;

import java.util.List;

@FunctionalInterface
public interface Stream {
    List<Integer> filterPrimeNumbers(List<Integer> list);
}

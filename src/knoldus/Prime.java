package knoldus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prime {
    /**
     * @param list
     * @return List<Integer>
     */
    public static List<Integer> filterPrime(final List<Integer> list) {
        return list.stream()
                .filter(number -> IntStream.rangeClosed(
                        2, number / 2).noneMatch(i -> number % i == 0))
                .sorted()
                .collect(Collectors.toList());
    }

    /**
     * @param args
     */
    public static void main(final String[] args) {

        List<Integer> list = new ArrayList<>();
        Random randomNumber = new Random();
        randomNumber.ints(
                100, 1, 100).forEach(i -> list.add(i));
        System.out.println("Given List" + list);
        List<Integer> primeNumber = Prime.filterPrime(list);
        System.out.println(
                "Prime number in the given list are here" + primeNumber);
    }

}

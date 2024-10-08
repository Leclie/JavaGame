package hw2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PuttingIntoPractice {
    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

//        1. Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей
//        к большей).
        transactions.stream()
                .filter(n -> n.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .forEach(System.out::println);

//        2. Вывести список неповторяющихся городов, в которых работают трейдеры.
        transactions.stream()
                .map(e -> e.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

//        3. Найти всех трейдеров из Кембриджа и отсортировать их по именам.
        transactions.stream()
                .map(e -> e.getTrader())
                .distinct()
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

//        4. Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном
//        порядке.
        System.out.println(transactions.stream()
                .map(e -> e.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (str, e) -> str + e + " "));

//        5. Выяснить, существует ли хоть один трейдер из Милана.
        System.out.println(transactions.stream()
                .filter(e -> e.getTrader().getCity().equals("Milan"))
                .findFirst()
                .get());

//        6. Вывести суммы всех транзакций трейдеров из Кембриджа.
        transactions.stream()
                .filter(e -> e.getTrader().getCity().equals("Cambridge"))
                .map(e -> e.getValue())
                .forEach(System.out::println);

//        7. Какова максимальная сумма среди всех транзакций?
        System.out.println(transactions.stream()
                .max(Comparator.comparingInt(Transaction::getValue))
                .get()
                .getValue());

//        8. Найти транзакцию с минимальной суммой.
        System.out.println(transactions.stream()
                .min(Comparator.comparingInt(Transaction::getValue))
                .get());
    }
}
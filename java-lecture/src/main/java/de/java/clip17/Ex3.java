package de.java.clip17;

import org.apache.commons.lang3.tuple.Pair;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex3 {
    static class Sale {
        public Sale(String fruitName, int price, float discount) {
            this.fruitName = fruitName;
            this.price = price;
            this.discount = discount;
        }

        String fruitName;
        int price;
        float discount;
    }
    public static void main(String[] args) {
        List<Sale> saleList = Arrays.asList(
                new Sale("Apple", 5000, 0.05f),
                new Sale("Grape", 3000, 0.1f)
        );

        Stream<Sale> saleStream = saleList.stream();
        saleStream.map(sale -> Pair.of(sale.fruitName, sale.price*(1-sale.discount)))
                .forEach(pair -> System.out.println(pair.getLeft() + " " + pair.getRight()));
    }
}

package javaFeatures.java8.stream;

import java.util.Optional;

public interface SimpleCalculator {
    Integer add(Optional<Integer> number1, Optional<Integer> number2);

    Object divide(Optional<Integer> number1, Optional<Integer> number2);
}

package stream;

import java.util.Optional;

public class SimpleCalculatorImpl implements SimpleCalculator {

    @Override
    public Integer add(Optional<Integer> number1, Optional<Integer> number2) {
        Integer numberOpt = number1.get();
        Integer number2Opt = number2.orElse(0);
        return numberOpt + number2Opt;
    }

    public Integer divide(Optional<Integer> number1, Optional<Integer> number2) {
        Integer numberOpt = number1.get();
        Integer number2Opt = number2.orElse(0);
        if (number2Opt == 0) {
            number2Opt = 1;
        }
        return numberOpt / number2Opt;
    }
}

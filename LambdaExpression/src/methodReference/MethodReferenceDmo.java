package methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceDmo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Stephen Curry", "Lebron James", "Coby Briant");

        //anonymous class
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //lambada expression
        names.forEach(name -> System.out.println(name));

        System.out.println();

        //method reference
        names.forEach(System.out::println);

    }
}

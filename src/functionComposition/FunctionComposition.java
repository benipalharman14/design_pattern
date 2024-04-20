package functionComposition;

import java.util.function.Function;

/**
 *  functions were only part of class but with the introduction of
 *  lambda function now we can assign function to variable
 *  shorthand expressions
 *
 */
public class FunctionComposition {

    public static void main(String[] args) {
        Function<Integer,Integer> doubled = val -> val*2;
        Function<Integer,Integer> inc = doubled.andThen(val -> val+1);
        System.out.println(doubled.apply(5));

        System.out.println(inc.apply(5));
    }
}

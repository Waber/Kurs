package pl.kurs.lambda;

import java.util.function.BiPredicate;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExcercise2 {

    public static void main(String[] args) {

        Supplier<Object> objectSupplier = Object::new;

        Object object = objectSupplier.get();
        System.out.println(object);

        BiPredicate<Object,Object> biPredicate = Object::equals;
        System.out.println(biPredicate.test(object,objectSupplier));

        Predicate<Object> objectPredicate = object::equals;
        System.out.println(objectPredicate.test(new Object()));

    }
}

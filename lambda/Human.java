package pl.kurs.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Human {



        private int age;
        private String name;

        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

    public static void main(String[] args) {

        BiFunction<Integer,String,Human> humanBiFunction = Human::new;
        Human human = humanBiFunction.apply(22,"Zdzichu");
        System.out.println(human.getAge());
        System.out.println(human.getName());

    }

}

package Entry;

import Project.Decorator;
import Project.MathOpers;

public class Main {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int result = MathOpers.add(a, b);
        System.out.println(Decorator.description(a, b, result));
        result = MathOpers.sub(a, b);
        System.out.println(Decorator.description(a, b, result));
        result = MathOpers.mul(a, b);
        System.out.println(Decorator.description(a, b, result));
        result = MathOpers.div(a, b);
        System.out.println(Decorator.description(a, b, result));
        result = MathOpers.rem(a,b);
        System.out.println(Decorator.description(a, b, result));

    }

}

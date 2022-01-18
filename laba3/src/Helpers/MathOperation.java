package Helpers;

public enum MathOperation {
    MULTIPLY {
        public int action(int x, int y) {
            System.out.println(x + " умножить на " + y + " = " + x * y);
            return x * y;
        }
    },
    DIVISION {
        public int action(int x, int y) {
            System.out.println(x + " делить на " + y + " = " + x / y);
            try {
                return x / y;
            } catch (ArithmeticException ignore){
                System.out.println("Деление на ноль запрещено! ");
                return Integer.MAX_VALUE;
            }
        }

    },
    MODULOREMINDER {
        public int action(int x, int y) {
            System.out.println("Остаток от деления " + x + " на " + y + " = " + x % y);
            return x % y;
        }
    };
}
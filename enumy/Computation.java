package pl.kurs.enumy;

public enum Computation {
    ADD{
        public double perform(double x, double y)
        {
            return x + y;
        }
    },
    MULTIPLY{
        public double perform(double x, double y)
        {
            return x * y;
        }
    },
    DIVIDE{
        public double perform(double x , double y)
        {
            return x / y;
        }
    },
    SUBSTRACT{
        public double perform(double x, double y)
        {
            return x - y;
        }
    };

    public abstract double perform(double x, double y);

    public static void main(String[] args) {
        System.out.println(Computation.ADD.perform(1,30));
        System.out.println(Computation.SUBSTRACT.perform(10,91));
    }
}

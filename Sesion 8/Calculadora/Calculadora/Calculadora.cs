namespace Calculadora
{
    public class Calc
    {
        public static int Suma(int a, int b)
        {
            return a + b;
        }
        public static int Resta(int a, int b)
        {
            return a - b;
        }
        public static int Multiplicacion(int a, int b)
        {
            return a * b;
        }
        public static int Division(int a, int b)
        {
            return a / b;
        }
        public static bool IsOdd(int value)
        {
            return value % 2 == 1;
        }
    }
}
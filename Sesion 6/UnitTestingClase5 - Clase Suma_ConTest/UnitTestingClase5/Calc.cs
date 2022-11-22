using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UnitTestingClase5
{
    public class Calc
    {
        public static int Suma(int a, int b)
        {
            return a + b;
        }
        public static int Substract(int a, int b)
        {
            return a - b;
        }
        public static int Multiply(int a, int b)
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

using Calculadora;

namespace CalculadoraTest
{
    public class CalculadoraTest
    {
        [Fact]
        public void Sumar2EnterosPositivos()
        {
            //Arrange
            int a = 4;
            int b = 4;
            int expected = 8;
            //Act
            int actual = Calc.Suma(a, b);
            //Assert
            Assert.Equal(expected, actual);
        }

        [Theory]
        [InlineData(3)]
        [InlineData(5)]
        [InlineData(7)]
        public void esImpar(int value)
        {
            //Arrange
            //Act
            bool actual = Calc.IsOdd(value);
            //Assert
            Assert.True(actual);
        }

    }
}
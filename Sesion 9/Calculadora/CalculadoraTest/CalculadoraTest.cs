using Calculadora;
using Moq;

namespace CalculadoraTest
{
    public class CalculadoraTest
    {

        [Fact]
        public void Sumar2EnterosPositivosCloud()
        {
            var mock = new Mock<ICalculadoraCloud>();
            mock.Setup(x => x.Sumar(1, 1)).Returns(2);
            int result =mock.Object.Sumar(1, 1);
            Assert.Equal(2, result);
                
        }

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



      }
}
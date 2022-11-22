using UnitTestingClase5;

namespace TestProject
{
    public class CalcTest
    {
        [Fact]
        public void Sum_ShouldAddtwoPositiveIntegersReturnPositiveInteger()
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
        [InlineData(6)]
        public void MyFirstTheory(int value)
        {
            //Arrange
            //Act
            bool actual = Calc.IsOdd(value);
            //Assert
            Assert.True(actual);
        }



    }
}
namespace TDDExample
{
    public class StringCalculatorShould
    {
        [Fact]
        public void Return0WhenReceivesEmpty()
        {
            var calculator = new StringCalculator();
            var result = calculator.Add("");
            Assert.Equal(0, result);
        }

        [Fact]
        public void ReturnNumberWhenReceivesThatNumber() 
        {
            var calculator = new StringCalculator();
            var result = calculator.Add("1");
            Assert.Equal(1, result);
        }

        [Fact]
        public void ReturnSumWhenReceivesTwoNumbers()
        {
            var calculator = new StringCalculator();
            var result = calculator.Add("1,2");
            Assert.Equal(3, result);
        }
    }
}
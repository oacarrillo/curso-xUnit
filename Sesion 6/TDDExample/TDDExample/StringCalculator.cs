namespace TDDExample
{
    internal class StringCalculator
    {
        public StringCalculator()
        {
        }

        internal int Add(string numbers)
        {
            if (string.IsNullOrEmpty(numbers))
                return 0; 
            
            var parts = numbers.Split(',');

            var total = 0;
            foreach ( var part in parts)
            {
                total += int.Parse(part);
            }

            return total;
            
        }
    }
}
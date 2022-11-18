namespace TDDExample
{
    internal class StringCalculator
    {
        public StringCalculator()
        {
        }

        internal int Add(string numbers)
        {
            if(string.IsNullOrEmpty(numbers))
                return 0; 

            var parts = numbers.Split(',');
            if (parts.Length == 1)
                return int.Parse(numbers);

            return int.Parse(parts[0]) + int.Parse(parts[1]);

        }
    }
}
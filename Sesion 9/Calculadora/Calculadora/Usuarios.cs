
namespace Calculadora
{
    public class Usuarios
    {
        IDictionary<int, string> Names = new Dictionary<int, string>();

        public Usuarios()
        {
            Names.Add(1, "Rose");
            Names.Add(2, "Mary");
            Names.Add(3, "Lili");
        }

        public string Consultar(int id)
        {
            string valor = "";
            foreach (KeyValuePair<int, string> Bd in Names)
            {
                if (Bd.Key == id)
                {
                    valor = Bd.Value;
                }
            }
            return valor;
        }
    }
}

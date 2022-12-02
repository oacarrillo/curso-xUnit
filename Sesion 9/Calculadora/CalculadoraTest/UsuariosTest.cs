using Calculadora;

using Castle.Components.DictionaryAdapter;
using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Reflection.Metadata;
using System.Text;
using System.Threading.Tasks;

namespace CalculadoraTest
{
    public class UsuariosTest
    {
        [Fact]
        public void test()
        {
            int valor=0;
            var mock = new Moq.Mock<IConsultaExt>();
            mock.Setup(i => i.ConsultaIdCloud(12345)).Returns(1);
            valor=mock.Object.ConsultaIdCloud(12345);
            
            Usuarios user = new Usuarios();
            string result = user.Consultar(valor);
            Assert.Equal("Rosa", result);
        }
    

    }
       
}

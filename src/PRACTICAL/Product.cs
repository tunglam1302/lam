using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace csharp_demo.PRACTICAL
{
     abstract class Product
    {
        public int id;
        public string name;
        public double price;
        public string producer;

        protected Product(int id, string name, double price, string producer)
        {
            this.id = id;
            this.name = name;
            this.price = price;
            this.producer = producer;
        }

        public abstract double computeTax();


    }
}

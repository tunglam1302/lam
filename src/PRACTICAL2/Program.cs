using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace csharp_demo.PRACTICAL
{
    class Program
    {
        public static  void Main(String[] args)
        {
            Product[] products = new Product[6];
            products[0] = new Book(1, "A", 1000, "A1");
            products[1] = new Book(2, "B", 2000, "B1");
            products[2] = new Book(3, "C", 3000, "C1");
            products[3] = new MobilePhone(4, "D", 4000, "D1");
            products[4] = new MobilePhone(5, "E", 5000, "E1");
            products[5] = new MobilePhone(6, "F", 6000, "F1");

            double total = 0;
            for (int i = 0; i < products.Length; i++)
            {
                total += products[i].computeTax();
            }
            Console.WriteLine("total price: "+total);
            Console.ReadKey();
       }
    }
}

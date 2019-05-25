using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace csharp_demo.AS2
{
    public class Cart
    {
        public int id;
        public string customer;
        public double grandTotal;
        public List<Product> productList;
        public string city;
        public string country;

        public void AddProduct(Product product)
        {
            productList.Add(product);
            Console.WriteLine("Them san pham "
                        + product.name + " thanh cong");
        }

        public void RemoveProduct(Product product)
        {
            productList.Remove(product);
            Console.WriteLine("Xoa san pham "
                        + product.name + " khoi gio hang");
        }

        public void CalcMoney()
        {
            foreach (Product product in productList)
            {
                this.grandTotal += (product.qty * product.price);
            }
            if (country.Equals("Vietnam"))
            {
                if (city.Equals("Hanoi") || city.Equals("HCM"))
                {
                    this.grandTotal *= 1.01;
                }
                else
                {
                    this.grandTotal *= 1.02;
                }
            }
            else
            {
                this.grandTotal *= 1.05;
            }
            Console.WriteLine("Tong tien: " + grandTotal);
        }
    }
}

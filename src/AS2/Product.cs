using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace csharp_demo.AS2
{
    public class Product
    {
        public int id;
        public string name;
        public double price;
        public int qty;
        public string image;
        public string desc;
        public List<string> gallery;

        public Product()
        {
        }

        public Product(int id, string name, double price, int qty, string image, string desc, List<string> gallery)
        {
            this.id = id;
            this.name = name;
            this.price = price;
            this.qty = qty;
            this.image = image;
            this.desc = desc;
            this.gallery = gallery;
        }

        public void GetInfo()
        {
            Console.WriteLine("ID: " + id);
            Console.WriteLine("Name: " + name);
            Console.WriteLine("Price: " + price);
            Console.WriteLine("Qty: " + qty);
            Console.WriteLine("Image: " + image);
            Console.WriteLine("Desc: " + desc);
            foreach (string img in gallery)
            {
                Console.WriteLine("Gallery: " + img);
            }
        }

        public bool CheckQty()
        {
            if (this.qty > 0)
            {
                return true;
            }
            return false;
        }

        public void AddImageToGallery(string image)
        {
            if (gallery.Count >= 10)
            {
                Console.WriteLine("Nhieu anh qua roi, xoa bot di");
                return;
            }
            gallery.Add(image);
            Console.WriteLine("them anh thanh cong");
        }

        public void DeleteImageFromGallery(string image)
        {
            if (gallery.Count < 1)
            {
                Console.WriteLine("Khong co anh nao de xoa");
                return;
            }
            Console.WriteLine("Nhap vi tri anh muon xoa");
            int index = Convert.ToInt32(Console.ReadLine());
            gallery.RemoveAt(index);

        }

    }
}

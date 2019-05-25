using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace csharp_demo.AS4
{
    public class Program
    {
        public static void Main(string[] args)
        {
            List<News> listNews = new List<News>();
            bool start = true;
            while (start)
            {
                Console.WriteLine("1. Insert News");
                Console.WriteLine("2. View List News");
                Console.WriteLine("3. Avg News");
                Console.WriteLine("4. Exit");
                Console.WriteLine("Chon chuc nang:");
                int menu = Int16.Parse(Console.ReadLine());
                if (menu > 0 && menu < 5)
                {
                    switch (menu)
                    {
                        case 1: listNews.Add(new News()); break;
                        case 2: ViewAll(listNews); break;
                        case 3: AvgAndViewAll(listNews); break;
                        case 4: start = false; break;
                    }
                }
            }

        }

        public static void ViewAll(List<News> listNews)
        {
            foreach (News x in listNews)
            {
                x.Display();
            }
        }

        public static void AvgAndViewAll(List<News> listNews)
        {
            foreach (News x in listNews)
            {
                x.Calculate();
                x.Display();
            }
        }

    }
}

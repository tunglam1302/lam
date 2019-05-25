using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace csharp_demo.AS6
{
    public class News : INews
    {
        public int id;
        public string title;
        public string publishDate;
        public string author;
        public string content;
        public float averageRate;
        internal int rate;

        public int[] rateList = new int[3];

        public News()
        {
            Console.WriteLine("Nhap id = ");
            Id = Int32.Parse(Console.ReadLine());
            Console.ReadLine();
            Console.WriteLine("Title: ");
            Title = Console.ReadLine();
            Console.WriteLine("publishDate: ");
            PublishDate = Console.ReadLine();
            Console.WriteLine("Author: ");
            Author = Console.ReadLine();
            Console.WriteLine("Content: ");
            Content = Console.ReadLine();
            Console.WriteLine("3 rate:");
            for (int i = 0; i < 3; i++)
            {
                rateList[i] = Int16.Parse(Console.ReadLine());
            }
        }

        public int Id
        {
            get
            {
                return id;
            }
            set
            {
                this.id = value;
            }
        }

        public string Title
        {
            get
            {
                return title;
            }
            set
            {
                title = value;
            }
        }

        public string PublishDate
        {
            get
            {
                return publishDate;
            }
            set
            {
                publishDate = value;
            }
        }

        public string Author
        {
            get
            {
                return author;
            }
            set
            {
                author = value;
            }
        }

        public string Content
        {
            get
            {
                return content;
            }
            set
            {
                content = value;
            }
        }

        public void Display()
        {
            Console.WriteLine("id: " + Id);
            Console.WriteLine("title: " + Title);
            Console.WriteLine("publish Date: " + PublishDate);
            Console.WriteLine("author: " + Author);
            Console.WriteLine("content: " + Content);
            Console.WriteLine("avg: " + averageRate);
        }

        public void Calculate()
        {
            int total = 0;
            foreach (int i in rateList)
            {
                total += i;
            }
            averageRate = (float)total / 3;

        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace csharp_demo.AS9
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Thread t = new Thread(Boom);
            t.Start(10);
        }
        public static void Boom(Object o)
        {
            int m = (int)o;
            while (m > 0)
            {
                m--;
                int s = 59;
                while (s >= 0)
                {
                    Console.WriteLine(m.ToString("D2") + ":" + s.ToString("D2"));
                    s--;
                    Thread.Sleep(1000);
                }

            }
            Console.WriteLine("boom");
        }
        public static void Main2(string[] args)
        {
            Thread t = new Thread(Run);
            t.Start("hpbd");
            Console.ReadKey();
        }
        public static void Run(Object o)
        {
            String s = (String)o;
            while (true)
            {
                for (int i = 10; i >= 1; i--)
                {
                    Console.WriteLine("-" + i);
                    Thread.Sleep(1000);
                }
                Console.WriteLine(s);
            }            
        }
        
    }
}

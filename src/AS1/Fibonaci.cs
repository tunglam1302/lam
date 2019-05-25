using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace csharp_demo.AS1
{
    class Fibonaci
    {
        public void fibonaci()
        {
            int n;
            int f1 = 0, f2 = 1, f3;
            int sum = 1;
            Console.WriteLine("Nhap n= ");
            n = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Tinh tong " + n + " so hang dau tien cua day Fibonacci");
            for (int i = 2; i < n; i++)
            {
                f3 = f1 + f2;
                sum = sum + f3;
                f1 = f2;
                f2 = f3;
            }
            Console.WriteLine("" + sum);
            Console.ReadKey();
        }
    }
}

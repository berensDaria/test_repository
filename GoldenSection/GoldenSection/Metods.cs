using System;
using System.Windows.Forms;

namespace GoldenSection
{
    static class Metods
    {

        static double F(double x)
        {
            double result;
            result = 2 / (x*x) + Math.Pow(x, 0.25) - Math.Sqrt(x) - 2*Math.Cos(x);
            return (result);
        }

        static bool entersDomain(double x)
        {

            if (x < 0) return false;
            if (x == 0) return false;

            return true;
        }

        public static double SearchMin(double a, double b, double l, out int it)
        {

            const double goldConst = 0.38196;

            double y = a + goldConst * (b - a);
            double z = a + b - y;

            it = 0;

            while (Math.Abs(a - b) > l)
            {
                if (!(entersDomain(y)) || !(entersDomain(z)))
                {
                    MessageBox.Show("Ошибка ОДЗ. Измените границы промежутка.");
                    return (0);
                }
                else
                {
                    if (F(y) >= F(z))
                    {
                        b = z;
                        z = y;
                        y = a + b - y;
                    }
                    else
                    {
                        a = y;
                        y = z;
                        z = a + b - z;
                    }

                    if (y > z)
                    {
                        double q = y;
                        y = z;
                        z = q;
                    }

                }
                it++;

            }

            double min = (a + b) / 2;

            return (min);

        }

    }
}

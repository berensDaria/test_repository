using System;
using System.Windows.Forms;

namespace GoldenSection
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void buttonCount_Click(object sender, EventArgs e)
        {
            int it = 0;
            double min = Methods.SearchMin(Convert.ToDouble(textBoxA.Text), Convert.ToDouble(textBoxB.Text), Convert.ToDouble(textBoxL.Text), out it);

            textBoxMin.Text = Convert.ToString(min);
            textBoxIt.Text = Convert.ToString(it);
        }


    }
}

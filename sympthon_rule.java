//Created by Kosuke Sakai

import java.lang.Math;
import javax.swing.JOptionPane;

public class sympthon_rule {
	public static void main(String[] args) {
		double n = Double.parseDouble(
				JOptionPane.showInputDialog("Input N")); //積分区間N等分

		///////適宜以下を変更///////
		double a = 1;
		double b = 2;
		/////////////////////////

		double h = (b-a)/n;

		double tms = fx(a);
		double tmf = fx(b);
		double tm1 = 0;
		double tm2 = 0;

		for (int i = 1; i <= n; i++){
			if(i % 2 != 0){
				tm1 = tm1 + fx(a + h*i);
			}
		}
		for (int i = 1; i <= n-1; i++)	{
			if(i % 2 == 0){
				tm2 = tm2 + fx(a + h*i);
			}
		}

		double ts = h * (tms + 4*tm1 + 2*tm2 + tmf) / 3;

		JOptionPane.showMessageDialog(null, ts);

	}

	public static double fx(double x){
		return 1/(x*x); //適宜ここを変更
	}

}

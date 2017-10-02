//Created by Kosuke Sakai

import java.lang.Math;
import javax.swing.JOptionPane;


public class trapezoidal_rule {

	public static void main(String[] args) {
		double n = Double.parseDouble(
				JOptionPane.showInputDialog("Input n")); //積分区間n等分
		
		///////適宜ここを変更///////
		double a = 0;
		double b = Math.PI;
		/////////////////////////
		
		double h = (b-a)/n;
		
		double tm = 0;
		double tm1 = fx(a)/2;
		double tm2 = fx(b)/2;
		
		for (int i = 0; i < n - 1; i++){
			tm = tm + fx(h * (i+1));
		}
		
		double ts = h * (tm1 + tm2 + tm);
		
		JOptionPane.showMessageDialog(null, ts);

	}
	
	public static double fx(double x){
		return Math.sin(x); //適宜ここを変更
	}

}

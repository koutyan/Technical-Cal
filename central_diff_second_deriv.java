//Created by Kosuke Sakai

import java.lang.Math;
import javax.swing.JOptionPane;

public class central_diff_second_deriv {

	public static void main(String[] args) {
		
		/////////適宜以下を変更/////////
		double x = 10; 
		double y1 = 1/x; //f(x)
		//////////////////////////////
		
		double h = Double.parseDouble(
				JOptionPane.showInputDialog("Input h"));　//刻み幅を入力
		
		double y2 = 1/(x+h);
		double y3 = 1/(x-h);
		double ts = ((y2-y1)-(y1-y3))/(h*h);
		
		JOptionPane.showMessageDialog(null, ts);

	}

}

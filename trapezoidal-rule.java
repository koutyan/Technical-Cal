import java.lang.Math;
import javax.swing.JOptionPane;


public class daikeiformula {

	public static void main(String[] args) {
		double n = Double.parseDouble(
				JOptionPane.showInputDialog("Input n"));
		double a = 0;
		double b = Math.PI;
		
		double h = (b-a)/n;
		
		double tm = 0;
		double tm1 = Math.sin(a)/2;
		double tm2 = Math.sin(b)/2;
		
		for (int i = 0; i < n - 1; i++){
			tm = tm + Math.sin((b/n)*(i+1));
		}
		
		double ts = h * (tm1+tm2+tm);
		
		JOptionPane.showMessageDialog(null, ts);

	}

}

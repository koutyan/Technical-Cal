import java.lang.Math;
import javax.swing.JOptionPane;

public class sympthon {
	public static void main(String[] args) {
		double n = Double.parseDouble(
				JOptionPane.showInputDialog("Input n"));
		double a = 0;
		double b = Math.PI;
		
		double h = (b-a)/n;
		
		double tms = Math.sin(a);
		double tmf = Math.sin(b);
		double tm1 = 0;
		double tm2 = 0;
		
		for (int i = 1; i <= n; i++){
			if(i % 2 != 0){
				tm1 = tm1 + Math.sin((b/n)*i);
			}
		}
		for (int i = 1; i <= n; i++){
			if(i % 2 == 0){
				tm2 = tm2 + Math.sin((b/n)*i);
			}
		}
		double ts = h * (tms + 4*tm1 + 2*tm2 + tmf) / 3;
		
		JOptionPane.showMessageDialog(null, ts);

	}

}

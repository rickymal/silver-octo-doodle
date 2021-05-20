package tests;
import java.util.Arrays;
public class SherlockAndSquares {
	static int squares(int a, int b) {
        int counter = 0;
        int iter = b-a+1;
        for(int i = 0; i  < iter; i++) {    
            double r = Math.pow(a+i, 0.5);
            int rd = (int)r;
            boolean isIntegger = r - rd == 0;
            
            if (isIntegger) {
                counter++;
            }
        }
        return counter; 
	}
	 
	 public static void main(String[] args) {
		 int a = 17;
		 int b = 24;
		 double resultado = Math.pow(23, 0.5);
		 int arred_resul = (int)resultado;
		 System.out.println(resultado);
		 System.out.println(arred_resul);
		 System.out.println(resultado - arred_resul);
		 System.out.println(resultado - arred_resul == 0);
		 System.out.println(resultado % 1);
		 
		 
		 System.out.println(squares(a,b));
		 
		 
	 }
	 
}

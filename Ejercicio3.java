import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args){
		int fac, i, n, a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero para encontrar su valor factorial");
		i = 1;
		fac = 1;
		n = scanner.nextInt();
		if (n<0) {
			System.out.println("El valor debe ser positivo");
		} else {
			i = 1;
			fac = 1;
			while (i<=n) {
				i = i+1;
				fac = fac*i;
				

			}
			System.out.println(" El numero factorial es "+fac);
		}
	}	
}




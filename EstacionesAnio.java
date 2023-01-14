import java.util.Scanner;
public class EstacionesAnio{
	public static void main(String[]  args){
		Scanner lectura = new Scanner(System.in);
		System.out.println("Digite un numero del 1 al 12: ");
		int mes = Integer.parseInt(lectura.nextLine());
		String estacion = "Estacion desconocida";
		
		if(mes == 1 || mes == 2 || mes == 12){
			estacion = "Invierno";
}
		else if(mes == 3 || mes == 4 || mes == 5){
			estacion = "Primavera";
}
		else if(mes == 6 || mes == 7 || mes == 8){
			estacion = "Verano";
}
		else if(mes == 9 || mes == 10 || mes == 1){
			estacion = "Otonio";
}
		System.out.println("La estacion correspondiente es: " +estacion);
}
}
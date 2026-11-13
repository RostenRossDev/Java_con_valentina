package claseValentina;


//public -> modificador de acceso (public, protected, default o defecto)
public class Main {
	
	public static void main(String[] args) { //void significa que el metodo no va a retornar nada
		
		
		//#Tipos de datos
		// ['h', 'o','l','a']
		// char -> representa caracteres 'h'
		// String   -> Representan texto "Hola"
		
		//boolean -> representa verdadero o falso
		
		//Numeros enteros
		//byte -> -128 a 127
		//short -> -32768 A 32767
		//int -> -2.147.483.648 a 2.147.483.647
		//long -9.223.372.036.854.775.808 a 9223372036854775807
		
		//Numeros decimales
		//float 1.4E-45  o 3.4028235E38
		//double  4.9E-324 o 1.7976931348623157E308
		
		String nombreDuenio = "nuñes";
		String aux = nombreDuenio;
		nombreDuenio = "Ramires";
		
		System.out.println(aux);
		System.out.println(nombreDuenio);
				
		
		aux = "3" + "4";
		System.out.println(aux);
		
		aux = aux + "A";
		System.out.println(aux);
				
		byte byte1 = 127;
		byte byte2 = 127;
		
		short sumaByte = (short) (byte1 + byte2);
		
		
		System.out.println("suma: " +  (byte1 + byte2));
		
		int numero = 3;
		
		
		//Operaciones de String
		
		// #Concatenacion
		String saludo = "Hola";
		String nombre = " Valentina";
		String saludar = saludo + nombre;
		
		System.out.println(saludar);
		
		
		String saludo1 = "Hola";
		String nombre1 = saludo1.concat(" Valentina") ;
		
		System.out.println(nombre1);
		
		// Operaciones numericas
		//suma +
		int a = 5;
		int b = 2;
		int resultado = a + b;
		
		//resta -
		int resultadoResta = a - b;
		
		//Multiplicacion *
		int resultadoMultiplicacion = a * b;
		
		//division /
		int resultadoDivision = a / b;
		System.out.println("Division entera 5/2 = " + resultadoDivision);

		float aDecimal = 5.0f;
		float bDecimal = 2.0f;
		float resultadoDivisionDecimal = aDecimal / bDecimal;
		System.out.println("Division decimal 5.0/2.0 = " + resultadoDivisionDecimal);
		
		double bDouble = 2.0;
		double resultadoDivisiondouble = a / bDouble;
		System.out.println("Division decimal 5.0/2.0 = " + resultadoDivisionDecimal);
		
		//modulo % (resto de la division)
		int resultadoModulo = a % b;
		System.out.println("Modulo (resto de la division) 5 % 2 = " + resultadoModulo);

		
		// Estructuras de control / flujo
		int edad = 50;
		int edad2 = 40;
		int edad3 = 18;
		int edad4 = 30;
		
		if (edad > 18) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("No Es mayor de edad");
		}
		
		
		if (edad2 > 18) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("No Es mayor de edad");
		}
		
		
		if (edad3 > 18) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("No Es mayor de edad");
		}
		
		
		
		// else if
		if (edad > 18) {
			System.out.println("1: Es mayor de edad");
		} else if (edad < 18){
			System.out.println("1: No Es mayor de edad");
		} else if (edad2 > 18) {
			System.out.println("2: Es mayor de edad");
		} else if (edad2 < 18) {
			System.out.println("2: No Es mayor de edad");
		}  else if (edad3 > 18) {
			System.out.println("3: Es mayor de edad");
		} else if (edad3 < 18) {
			System.out.println("3: No Es mayor de edad");
		}
		
		
		//switch
		
		switch (edad) {
			case 1:
				System.out.println("No es mayor de edad");
				break;
			case 2:
				System.out.println("No es mayor de edad");
				break;
			case 3:
				System.out.println("No es mayor de edad");
				break;

			
				// ......		
			case 18: 
				System.out.println("No es mayor de edad");
				break;
			default:
				System.out.println("Es mayor de edad");
		}
		// ....
		
		
	}
}

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;



public class Ejercicios {

	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirString(String nombre_archivo, String contenido)
	{
		try //Con el try se intenta grabar el contenido (manejo de excepciones)
		{ PrintWriter datos = new PrintWriter(nombre_archivo); //Asigna 'datos' como nuevo Printwriter 
		datos.println(contenido); //Imprime los datos de contenido
		datos.close(); //Se cierra los datos
		}
		catch (Exception e) //Catch por posibles errores
		{
			e.printStackTrace();
		}

	}
	
	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirInt(String nombre_archivo, int contenido)
	{
		try //Con el try se intenta grabar el contenido (manejo de excepciones)
		{ PrintWriter datos = new PrintWriter(nombre_archivo); //Asigna 'datos' como nuevo Printwriter 
		datos.println(contenido); //Imprime los datos de contenido
		datos.close(); //Se cierra los datos
		}
		catch (Exception e) //Catch por posibles errores
		{
			e.printStackTrace();
		}
		
	}
	
	//Devuelve el primer entero contenido en el archivo con nombre nombre_archivo
	static int leerEntero(String nombre_archivo)
	{
		int entero; //variable para almacenar el entero
		try //Metodo para intentar devolver el entero (manejo de excepciones)
		{
		Scanner in = new Scanner(new File(nombre_archivo)); //Scanner para nuevo_archivo
		entero = in.nextInt();//Lee el archivo y lo almacena en la variable entero
		in.close();//Cierra el scanner
		return entero; //retorna la variable entero
		}
		catch (FileNotFoundException e) //Catch del error si no encuentra el archivo
		{
			e.printStackTrace();
		}	
		return -1;
	}
	
	//Devuelve la primera string contenida en el archivo con nombre nombre_archivo
	static String leerString(String nombre_archivo)
	{
		String texto; //variable para almacenar el string
		try //Metodo para intentar devolver el string (manejo de excepciones)
		{
		Scanner in = new Scanner(new File(nombre_archivo)); //Scanner para nuevo_archivo
		texto = in.next();//Lee el archivo y lo almacena en la variable texto
		in.close();//Cierra el scanner
		return texto; //retorna la variable texto
		}
		catch (FileNotFoundException e) //Catch del error si no encuentra el archivo
		{
			e.printStackTrace();
		}	
		return " ";
	}
	
	//Devuelve el primer double contenido en el archivo con nombre nombre_archivo
	static double leerDouble(String nombre_archivo)
	{
		double num; //variable para almacenar el numero
		try //Metodo para intentar devolver el entero (manejo de excepciones)
		{
		Scanner in = new Scanner(new File(nombre_archivo)); //Scanner para nuevo_archivo
		num = in.nextDouble();//Lee el archivo y lo almacena en la variable num
		in.close();//Cierra el scanner
		return num; //retorna la variable num
		}
		catch (Exception e) //Catch del error si no encuentra el archivo
		{
			e.printStackTrace();
		}	
		return -1;
	}
	
	//Devuelve la cantidad de veces que buscada (dado) existe en el archivo con nombre nombre_archivo (dado)
	static int contar(String nombre_archivo, String buscada)
	{
			int contador=0; //Variable que asiganara el contador del ciclo
			String word; //variable que recibe texto del scanner
			
			try // Intenta de leer y contar un archivo
			{
				Scanner in = new Scanner(new File(nombre_archivo)); //Scanner para el archivo
				while (in.hasNext()) //Ciclo para recorrer el archivo
				{
					word=in.next(); //Asigna el texto del archivo a la variable word
					if(word.equals(buscada)) //variable = al texto del archivo
						contador=contador+1; //suma 1 si se encuentra el texto buscado
				}
				in.close();//Cierre del scanner
				return contador;//Retorna la cantidad de veces que existe el texto buscado
			}
			
			catch (FileNotFoundException e) //Catch del error si no encuentra el archivo
			{
				e.printStackTrace();
			}	
			return -1;
			
			
	}
	
	//Devuelve el promedio de los numeros almacenados en un archivo
	//Nota: el archivo unicamente contiene enteros
	static int getPromedio(String nombre_archivo)
	{
		try
		{
			int suma=0,contador=0; //declaracion de variables para calculo del promedio
			
			Scanner in = new Scanner(new File(nombre_archivo));//Scanner para leer nombre_archivo
			
			while(in.hasNextLine()) //ciclo para busqueda de los numeros
			{
				suma=suma+in.nextInt(); //Suma cada numero
				contador++;//cuenta la cantidad de numeros sumados
			}
			in.close(); //Cierra el scanner
			return (suma/contador); //retorna el promedio de los enteros
		}
		catch(FileNotFoundException e) //inicio de catch por posibles errores
		{
			e.printStackTrace();
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

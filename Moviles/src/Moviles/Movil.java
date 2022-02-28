package Moviles;

public class Movil {

	String marca;
	String modelo;
	String so;
	int ram;
	int pulgadas;
	int almacenamiento;
	
	//constructor
	
	public Movil(String marca, String modelo, String so, int ram, int pulgadas, int almacenamiento) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.so = so;
		this.ram = ram;
		this.pulgadas = pulgadas;
		this.almacenamiento = almacenamiento;
	}
	
	//gets y sets
		
		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getSo() {
			return so;
		}

		public void setSo(String so) {
			this.so = so;
		}

		public int getRam() {
			return ram;
		}

		public void setRam(int ram) {
			this.ram = ram;
		}

		public int getPulgadas() {
			return pulgadas;
		}

		public void setPulgadas(int pulgadas) {
			this.pulgadas = pulgadas;
		}

		public int getAlmacenamiento() {
			return almacenamiento;
		}

		public void setAlmacenamiento(int almacenamiento) {
			this.almacenamiento = almacenamiento;
		}

		
		//m�todo para pasar las may�sculas a min�sculas
			public static String enMinuscula(String mensaje) {
				
				//metodo que pasa las may�sculas a min�sculas
				String mensajeDevolver = mensaje.toLowerCase();
				
				return mensajeDevolver;
				
			}
		
		//m�todo para quitar las tildes
		public static String sinTilde (String mensaje) {
			
			//variables
			String tilde = "����������";
			String sinTilde = "AaEeIiOoUu";
			String mensajeDevolver="";
			
			//separo la cadena y meto caracter a caracter en un array
			char[] cadena = mensaje.toCharArray();
			
			//recorro el array de caracteres
			//si el m�todo indexOf encuentra un caracter con acento nos devolver� la posicion donde est�
			//el m�todo charAt me sustituira el caracter con tilde por otro sin tilde
	        for (int i = 0; i < cadena.length; i++) {
	            int posicion = tilde.indexOf(cadena[i]);
	            if (posicion > -1) {
	                cadena[i] = sinTilde.charAt(posicion);
	            }
	            mensajeDevolver = mensajeDevolver + cadena[i];
	        }
			
			return mensajeDevolver;
			
		}
		
		//m�todo para sustituir el espacio en blanco por coma y punto
		public static String puntoComa (String mensaje) {
			
			//m�todo replace para cambiar un car�cter por otro
			String mensajeDevolver = mensaje.replace(" ", ";");
			
			return mensajeDevolver;
			
		}
		
		//m�todo para reducir los espacios en blanco a uno solo
		public static String soloUnEspacio(String mensaje) {
			
			//variables
			String mensajeDevolver="";
			int tama�o = mensaje.length();
			char caracter;
			
			for (int i = 0; i < tama�o; i++) {
	            
				caracter = mensaje.charAt(i);
	            mensajeDevolver = mensajeDevolver + caracter;
	            
	            //s� encuentra un espacio en blanco entrar� en el "if" y mirar� si hay m�s espcios contiguos
	            if (caracter == ' ') {
	            	++i;
	            	//ira aumentando la variable i para quitar los espacios. El valor de "i" es para la posici�n
	            	while(mensaje.charAt(i) == ' ') {
	            		++i;
	            	}
	                --i;
	            }
	            
	        }
			
			return mensajeDevolver;
			
		}
	
}

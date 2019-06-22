package practica6;


/**
 * Esta es la Clase Coche, en ella estudiaremos las clases
 * metodoCombustible, metodoGasolina, metodoHibrido y combustibleCoche
 *
 * @author José Pérez Rincón
 * 
 * @version 2019
 * 
 *
 */

public class Coche {
	private static final String EL_COCHE_CON_MATRICULA = "El coche con matricula ";
	String matricula;
	String combustible;
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}


	/**
	 * 
	 * @return Nos devolvera información del coche dependiendo del combustible utilizado.
	 * 
	 */
	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	
	
	public String metodoGasolina(String modelo,String fabricante) {
		
		String resultado = "";		
		resultado+="es un "+ modelo +" "+fabricante+" y gasta 1,337 euros por litro";
		return resultado;
		
	}
	
	public String metodoDiesel(String modelo,String fabricante) {
		
		
		String resultado = "";		
		resultado+="es un "+ modelo +" "+fabricante+" gasta 1,052 euros por litro ";
		return resultado;
		
	}
	
	
	public String metodoHibrido(String modelo,String fabricante) {
		
		String resultado = "";
		resultado+="es un "+ modelo +" "+fabricante+" no necesita combustible. ";
		return resultado;
		
	}
	
	/**
	 * 
	 * @param modelo
	 * @param fabricante
	 * @return Nos devolvera un String, el modelo, el fabricante y 
	 * el precio euros/litro dependiendo del combustible
	 */
	
	public String combustibleCoche() {
		String resultado = "";
		if (combustible == "Gasolina") {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " " + metodoGasolina(modelo, fabricante);
		} else if (combustible == "Diesel") {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " " + metodoDiesel(modelo, fabricante);
		} else if (combustible == "Híbrido") {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " " + metodoHibrido(modelo, fabricante);
		} else {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " " + "no dispone de información";
		}
		return resultado;
	}
	/**
	 * 
	 * @param combustible
	 * @param matricula
	 * @param metodoGasolina
	 * @param metodoDiesel
	 * @param metodoHibrido
	 * @return Nos devolvera un String, y dependiendo de a que 
	 * sea combustible nos llamará a un metodo
	 */
	
	
}

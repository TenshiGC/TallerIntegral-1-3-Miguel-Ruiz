package co.edu.unbosque.model;

public class Procesos {
	
	public int limiteinferior;
	public int limitesuperior;
	public int anidadoinferior;
	public int anidadosuperior;
	
	public Procesos() {
		limiteinferior = 0;
		limitesuperior = 0;
		anidadoinferior = 0;
		anidadosuperior = 0;
	}
	
	public String Sumatoria1() {
		String result = "";
		double total = 0;
		String proceso = "";
		for(int i = limiteinferior; i <= limitesuperior; i++) {
			double actualvalue = (((Math.pow(i, (i+1)))-1)/Math.pow(((2*i)+1),i));
			total += (((Math.pow(i, (i+1)))-1)/Math.pow(((2*i)+1),i));
			proceso += "("+i+"^("+i+"+1)-1/(2*"+i+"+1)^"+i+") = "+ Math.round(actualvalue*100d)/100d + "\n";
		}
		result = proceso + " \n El resultado de la sumatoria es: " + Math.round(total*100d)/100d;
		return result;
	}
	
	public String Sumatoria2() {
		String result = "";
		double total = 0;
		String proceso = "";
		for(int i = limiteinferior; i <= limitesuperior; i++) {
			double actualvalue = Math.pow(Math.E, i) * (Math.pow(i, 2) - 1) / (1 - Math.pow(Math.E, i));
			total += Math.pow(Math.E, i) * (Math.pow(i, 2) - 1) / (1 - Math.pow(Math.E, i));
			proceso += "(e^"+i+"*((" +i+"^2)-1)) / (1-e^"+i+") = "+ Math.round(actualvalue*100d)/100d + "\n";
		}
		result = proceso + " \n El resultado de la sumatoria es: " + Math.round(total*100d)/100d;
		return result;
	}
	
	public String Sumatoria3() {
		String result = "";
		double total = 0;
		String proceso = "";
		for(int i = limiteinferior; i <= limitesuperior; i++) {
			double actualvalue = i*Math.pow(i-1,2)/(Math.log(i)*Math.pow(i+1, 2));
			total += i*Math.pow(i-1,2)/(Math.log(i)*Math.pow(i+1, 2));
			proceso += i+"*("+i+"-1)^2/ln("+i+")*("+i+"+1)^2 = "+ Math.round(actualvalue*100d)/100d + "\n";
		}
		result = proceso + " \n El resultado de la sumatoria es: " + Math.round(total*100d)/100d;
		return result;
	}
	
	public String Sumatoria4() {
		String result = "";
		double total = 0;
		String proceso = "";
		for(int i = limiteinferior; i <= limitesuperior; i++) {
			double actualvalue = (i*(i-1)*(i+2))/Math.pow(Math.log10(i+2), 2);
			total += (i*(i-1)*(i+2))/Math.pow(Math.log10(i+2), 2);
			proceso += "("+i+"*("+i+"-1)*("+i+"+2))/(log("+i+"2))^2 = "+ Math.round(actualvalue*100d)/100d + "\n";
		}
		result = proceso + " \n El resultado de la sumatoria es: " + Math.round(total*100d)/100d;
		return result;
	}
	
	public String Sumatoria5() {
		String result = "";
		double total = 0;
		double total2 = 0;
		String proceso = "";
		String proceso2 = "";
		for(int n = limiteinferior; n <= limitesuperior; n++) {
			for (int j = anidadoinferior; j <= anidadosuperior; j++) {
				double actualvalue = (Math.exp(j)+Math.pow(n, 2))/(Math.log10(n)+Math.pow(j, 2));
				total += (Math.exp(j)+Math.pow(n, 2))/(Math.log10(n)+Math.pow(j, 2));
				proceso += "e^"+j+"+"+n+"^2/log("+n+")+"+j+"^2 = "+ Math.round(actualvalue*100d)/100d + "\n";
			}
			total2 = total;
			proceso2 = proceso;
		}
		result = proceso2 + " \n El resultado de la sumatoria es: " + Math.round(total2*100d)/100d;
		return result;
	}

	public int getLimiteinferior() {
		return limiteinferior;
	}

	public void setLimiteinferior(int limiteinferior) {
		this.limiteinferior = limiteinferior;
	}

	public int getLimitesuperior() {
		return limitesuperior;
	}

	public void setLimitesuperior(int limitesuperior) {
		this.limitesuperior = limitesuperior;
	}

	public int getAnidadoinferior() {
		return anidadoinferior;
	}

	public void setAnidadoinferior(int anidadoinferior) {
		this.anidadoinferior = anidadoinferior;
	}

	public int getAnidadosuperior() {
		return anidadosuperior;
	}

	public void setAnidadosuperior(int anidadosuperior) {
		this.anidadosuperior = anidadosuperior;
	}
	
	
}

package co.edu.unbosque.controller;

import co.edu.unbosque.model.Procesos;
import co.edu.unbosque.view.ViewVentana;

public class Controller {
	private Procesos procesos;
	private ViewVentana view;
	
	public Controller() {
		view = new ViewVentana();
		procesos = new Procesos();
		funcionar();
	}
	public void funcionar(){
		int opcion = 0;
		try {
		do {
			opcion = view.leerDato("Seleccione ejercicio: "
					+ "\n\n1. Sumatoria 1"
					+ "\n2. Sumatoria 2"
					+ "\n3. Sumatoria 3"
					+ "\n4. Sumatoria 4"
					+ "\n5. Sumatoria 5"
					+ "\n6. Salir"
					+ "\n\nOpcion:"
					
					);
		switch (opcion) {
		case 1:
			try {
			view.showmessage("Digite un numero entero para el limite inferior de la sumatoria: ","informativo");
			int a = view.leerDato("");
			procesos.setLimiteinferior(a);
			view.showmessage("Digite un numero entero para el limite superior de la sumatoria: ","informativo");
			int b = view.leerDato("");
			procesos.setLimitesuperior(b);
			view.showmessage("El proceso es: \n\n" + procesos.Sumatoria1(), "informativo");
			break;
			}catch (NumberFormatException e) {
				view.showmessage("Digite un numero ENTERO","Alerta");
				break;
			}
		case 2:
			try {
			view.showmessage("Digite un numero entero para el limite inferior de la sumatoria: ","informativo");
			int c = view.leerDato("");
			if(c<=0)
				throw new IllegalArgumentException("");
			procesos.setLimiteinferior(c);
			view.showmessage("Digite un numero entero para el limite superior de la sumatoria: ","informativo");
			int d = view.leerDato("");
			procesos.setLimitesuperior(d);
			view.showmessage("El proceso es: \n\n" + procesos.Sumatoria2(), "informativo");
			break;
			}catch (NumberFormatException e) {
				view.showmessage("Digite un numero ENTERO","Alerta");
				break;
			}catch (IllegalArgumentException e) {
				view.showmessage("No es posible evaluar la expresion en 0,\ndebido a que el resultado es indeterminado\nIngrese un valor mayor a 0","Alerta");
				break;
			}
		case 3:
			try {
			view.showmessage("Digite un numero entero para el limite inferior de la sumatoria: ","informativo");
			int e = view.leerDato("");
			if(e<=0)
				throw new IllegalArgumentException("");
			procesos.setLimiteinferior(e);
			view.showmessage("Digite un numero entero para el limite superior de la sumatoria: ","informativo");
			int f = view.leerDato("");
			procesos.setLimitesuperior(f);
			view.showmessage("El proceso es: \n\n" + procesos.Sumatoria3(), "informativo");
			break;
			}catch (NumberFormatException e) {
				view.showmessage("Digite un numero ENTERO","Alerta");
				break;
			}catch (IllegalArgumentException e) {
				view.showmessage("No es posible evaluar la expresion con valores menores a 0,\ndebido a que el resultado es indeterminado\nIngrese un valor mayor a 0","Alerta");
				break;
			}
		case 4:
			try {
			view.showmessage("Digite un numero entero para el limite inferior de la sumatoria: ","informativo");
			int g = view.leerDato("");
			if(g<0)
				throw new IllegalArgumentException("");
			procesos.setLimiteinferior(g);
			view.showmessage("Digite un numero entero para el limite superior de la sumatoria: ","informativo");
			int h = view.leerDato("");
			procesos.setLimitesuperior(h);
			view.showmessage("El proceso es: \n\n" + procesos.Sumatoria4(), "informativo");
			break;
			}catch (NumberFormatException e) {
				view.showmessage("Digite un numero ENTERO","Alerta");
				break;
			}catch (IllegalArgumentException e) {
				view.showmessage("No es posible evaluar la expresion con valores menores a 0,\ndebido a que el resultado es indeterminado\nIngrese un valor mayor o igual a 0","Alerta");
				break;
			}
		case 5:
			try {
			view.showmessage("Digite un numero entero para el limite inferior de la sumatoria: ","informativo");
			int i = view.leerDato("");
			if(i<=0)
				throw new IllegalArgumentException("");
			procesos.setLimiteinferior(i);
			view.showmessage("Digite un numero entero para el limite superior de la sumatoria: ","informativo");
			int j = view.leerDato("");
			procesos.setLimitesuperior(j);
			view.showmessage("Digite un numero entero para el limite inferior de la sumatoria interna: ","informativo");
			int k = view.leerDato("");
			if(k<=0 && i==1)
				throw new IllegalArgumentException("");
			procesos.setAnidadoinferior(k);
			view.showmessage("Digite un numero entero para el limite superior de la sumatoria interna: ","informativo");
			int l = view.leerDato("");
			procesos.setAnidadosuperior(l);
			view.showmessage("El proceso es: \n\n" + procesos.Sumatoria5(), "informativo");
			break;
			}catch (NumberFormatException e) {
				view.showmessage("Digite un numero ENTERO","Alerta");
				break;
			}catch (IllegalArgumentException e) {
				view.showmessage("No es posible evaluar la expresion con valores menores a 0,\ndebido a que el resultado es indeterminado\nIngrese un valor mayor a 0","Alerta");
				break;
			}
		default:
			view.showmessage("Gracias por usar la aplicacion","informativo");
			break;
			}
		}
		while (opcion<6);
	}catch (NumberFormatException e ) {
		view.showmessage("Gracias por usar la aplicacion","informativo");
	}
	}
}
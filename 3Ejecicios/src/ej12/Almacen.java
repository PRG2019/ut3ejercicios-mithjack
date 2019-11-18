package ej12;
public class Almacen {
public int papas;
public double choco;
public int clientes;

Almacen(int pa, double ch){
	papas=pa;
	choco=ch;
}

public int getClientes() {
	int papa2=papas/3;
	double choco2=(choco/0.5);
	if(papa2<choco2) {
		clientes=papa2;
		//papas-=papa2*3;
		//choco-=papa2*0.5;
	}
	else if(papa2==choco2) {
		clientes=papa2;
	}
	else {
		clientes=(int)choco+1;
		//papas-=choco2*3;
		//choco-=choco2*0.5;
	}
	return clientes;
}

public void addChocos(double ch) {
	choco+=ch;
}
public void addPapas(int x) {
	papas+=x;
}
public void showChocos() {
	System.out.println("Tienes en reserva: "+choco);
}
public void showPapas() {
	System.out.println("Tienes en reserva: "+papas);
}





}




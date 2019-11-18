package ej11;

public class Almacen {
public double papas;
public double choco;
public int clientes;

Almacen(int pa, int ch){
	papas=pa;
	choco=ch;
}

public int getClientes() {
	papas=papas/3;
	choco=choco/0.5;
	if(papas<choco) clientes=(int)papas;
	else clientes=(int)choco;
	return clientes;
}


}

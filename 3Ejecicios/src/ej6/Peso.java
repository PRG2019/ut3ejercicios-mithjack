package ej6;

public class Peso {
private double Peso;
private String Unidad;

Peso(double p, String u){
	Peso=p;
	Unidad=u;
}

//Met
public void getLibras() {
Peso=((Peso*1000)/453);
Unidad="Lb";
}
public void getLingotes() {
Peso=Peso/14.59;
Unidad="Li";
}
public void getPeso(String u) {
	if (u=="Lb") {
		Peso=((Peso*1000)/453);
		Unidad=u;
	}
	else if (u=="Li") {
		Peso=Peso/14.59;
		Unidad=u;
	}
	else if (u=="Oz") {
		Peso=(Peso*1000)/28.35;
		Unidad=u;
	}else if (u=="P") {
		Peso=(Peso*1000)/1.55;
		Unidad=u;
	}else if (u=="K") {
		Peso=Peso;
		Unidad=u;
	}else if (u=="G") {
		Peso=Peso*1000;
		Unidad=u;
	}else if (u=="Q") {
		Peso=Peso/43.3;
		Unidad="Oz";
	}else System.out.println("Opcion incorrecta");
}

public double mPeso() {
	return Peso;
}
public String mUnidad() {
	return Unidad;

}
}

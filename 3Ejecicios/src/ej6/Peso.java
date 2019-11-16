package ej6;

public class Peso {
private double peso;
private String unidad;

//con
Peso(double p, String u){
	peso=p;
	unidad=u;
}

//Met
public void getLibras() {
peso=peso/0.453;
unidad="Lb";
}
public void getLingotes() {
peso=peso/14.59;
unidad="Li";
}

/**
 * @param uni
 * @return
 * 
 */
public double getPeso(String uni) {
	switch (uni) {
	case "Lb":
		if(unidad=="Lb") {System.out.println("Ya tenias Libras");}
		if(unidad=="Li") {
			peso = this.peso*32.17;
			unidad=uni;
			}
		if(unidad=="Oz") {
			peso = this.peso*0.0625;
			unidad=uni;
			}
		if(unidad=="P") {
			peso = (this.peso*0.05)*0.0625;//De Peniques a Onzas y luego a Libras
			unidad=uni;
			}
		if(unidad=="K") {
			peso = this.peso/0.453;
			unidad=uni;
			}
		if(unidad=="G") {
			peso = this.peso/453;
			unidad=uni;
			}
		if(unidad=="Q") {
			peso = this.peso*100;
			unidad=uni;
			}
		break;
		
	case "Li":
		if(unidad=="Lb") {
			peso=this.peso/32.17;
			unidad=uni;
		}
		if(unidad=="Li") {System.out.println("Ya tenias Lingotes");}

		if(unidad=="Oz") {
			peso = (this.peso*0.0625)/32.17; //De Onzas a Libras y luego a Lingotes
			unidad=uni;
			}
		if(unidad=="P") {
			peso = ((this.peso*0.05)*0.0625)/32.17; //P a Oz  a Lb y a Li
			unidad=uni;
			}
		if(unidad=="K") {
			peso = this.peso/14.59;
			unidad=uni;
			}
		if(unidad=="G") {
			peso = this.peso/14590;
			unidad=uni;
			}
		if(unidad=="Q") {
			peso = (this.peso*100)/32.17;//Q a Lb y a Li
			unidad=uni;
			}
		break;
		
	case "Oz":
		if(unidad=="Lb") {
			peso=this.peso*16;
			unidad=uni;
			}
		if(unidad=="Li") {
			peso=(this.peso*32.17)*16;//Li a Lb y a Oz
			unidad=uni;
			}
		if(unidad=="Oz") {System.out.println("Ya tenias Onzas");}
		if(unidad=="P") {
			peso = (this.peso*0.05); 
			unidad=uni;
			}
		if(unidad=="K") {
			peso = this.peso/0.02835;
			unidad=uni;
			}
		if(unidad=="G") {
			peso = this.peso/28.35;
			unidad=uni;
			}
		if(unidad=="Q") {
			peso = (this.peso*43300)/28.35;//Q a G y a Oz
			unidad=uni;
			}
		break;
		
	case "P":
		if(unidad=="Lb") {
			peso=(this.peso*16)/0.05; //Lb a Oz y a P
			unidad=uni;
			}
		if(unidad=="Li") {
			peso=((this.peso*32.17)*16)/0.05;//Li a Lb a Oz y a P
			unidad=uni;
			}
		if(unidad=="Oz") {
			peso=this.peso/0.05;
			unidad=uni;
			}
		if(unidad=="P") {System.out.println("Ya tenias P");}
		if(unidad=="K") {
			peso = this.peso/0.00155;
			unidad=uni;
			}
		if(unidad=="G") {
			peso = this.peso/1.55;
			unidad=uni;
			}
		if(unidad=="Q") {
			peso = (this.peso*43.3)/0.00155;//Q a Kg y a P
			unidad=uni;}
		break;
		
	case "K":
		if(unidad=="Lb") {
			peso=this.peso*0.453;
			unidad=uni;
			}
		if(unidad=="Li") {
			peso=this.peso*14.59;
			unidad=uni;
			}
		if(unidad=="Oz") {
			peso=this.peso*0.02835;
			unidad=uni;
		}
		if(unidad=="P") {
			peso = this.peso*0.00155; 
			unidad=uni;
			}
		if(unidad=="K") {System.out.println("Ya tenias K");}
		if(unidad=="G") {
			peso = this.peso/1000;
			unidad=uni;
			}
		if(unidad=="Q") {
			peso = this.peso*43.3;
			unidad=uni;
			}
		break;
		
	case "G":
		if(unidad=="Lb") {
			peso=this.peso*453;
			unidad=uni;
			}
		if(unidad=="Li") {
			peso=this.peso*14590;
			unidad=uni;
			}
		if(unidad=="Oz") {
			peso=this.peso*28.35;
			unidad=uni;
		}
		if(unidad=="P") {
			peso = (this.peso*1.55); 
			unidad=uni;
			}
		if(unidad=="K") {
			peso = this.peso*1000;
			unidad=uni;
			}
		if(unidad=="G") {System.out.println("Ya tenias G");}
		if(unidad=="Q") {
			peso = this.peso*43300;
			unidad=uni;
			}		
		break;
		
	case "Q":
		if(unidad=="Lb") {
			peso=this.peso/100;
			unidad=uni;
			}
		if(unidad=="Li") {
			peso=(this.peso*32.17)/100;//Li a Lb y a Q
			unidad=uni;
			}
		if(unidad=="Oz") {
			peso=(this.peso*0.0625)/100;// Oz a Lb y a Q
			unidad=uni;
			}
		if(unidad=="P") {
			peso = ((this.peso*0.05)*0.0625)/100; //P a Oz a Lb y a Q
			unidad=uni;
			}
		if(unidad=="K") {
			peso = this.peso/43.3;
			unidad=uni;
			}
		if(unidad=="G") {
			peso = this.peso/43300;
			unidad=uni;
			}
		if(unidad=="Q") {System.out.println("Ya tenias Q");}
		break;
		
	default:
		System.out.println("Peso incorrecto.");
		break;
	}
	return peso;
}

public double mPeso() {
	return peso;
}
public String mUnidad() {
	return unidad;
}
}

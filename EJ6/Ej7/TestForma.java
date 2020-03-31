/*
*@mithjack
*/

class TestForma{

public static void main (String [] args){
Forma f= new Circulo();
f.identidad();

Circulo c=new Circulo();
((Forma)c).identidad(); //((Forma.C).identidad(); La C estaba en mayuscula, y lo declaramos como minuscula.
/*((Circulo)f).identidad(); // El metodo identidad esta en Forma, hacer un downcasting a Circulo no serviria, 
* ya que no está el metodo ahí.
*/
Forma f2 = new Circulo(); //Forma f2 = new Forma(); No se puede instanciar Forma, lo cambiamos a Circulo.
f2.identidad();
/*((Forma)f).identidad(); //(forma)f.identidad(); La f tiene que ser en mayusculas al igual que la Clase que 
*representa, pero aun así f ya es de Forma (Forma f= new Circulo();) no se le puede hacer ni downcasting por 
*lo que habria que eliminar la linea.
*/
}
}

/*
* En pantalla aparecerá el identificador de f, luego de c  de f2.
*/


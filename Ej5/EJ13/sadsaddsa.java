package EJ13;


/* 

import java.util.*;

    public static void main(String [] args)
{
    int[] v={7, 5, 1, 2};
    mostrar(v,v.length);
    intercambioDirecto(v,v.length);
    mostrar(v,v.length);
}

public static void intercambioDirecto(int []v, int n)
{
    int i, aux, iz, de;
    iz = 0;
    de = n-1;
        while (iz < de) {
        pasada de izquierda a derecha 
            for(i = iz; i < de; i++) {
                if (v[i] > v[i+1]) {
                 aux = v[i];
                v[i] = v[i+1];
                v[i+1] = aux;
                }
            }
        de--;
    if (iz != de){ /*pasada de derecha a izquierda 
        for (i = de; i > iz; i--) {
            if (v[i-1] > v[i]) {
            aux = v[i-1];
            v[i-1] = v[i];
            v[i] = aux;
            };
        }
     iz++;
        }
    }
}

public static void mostrar(int[] v, int n){
        int i;
        System.out.print("(");
        for(i=0;i<n-1;i++){
            System.out.print(v[i]+", ");
        }
        if(n>0)
            System.out.print(v[i]);//el último elemento del vector
        
        System.out.println(")");
        
    }
}



public class sadsaddsa{
    public static void main(String [] args)
{
    int[] v={7, 5, 1, 2};
    mostrar(v,v.length);
    intercambioDirecto(v,v.length);
    mostrar(v,v.length);
}
public static void intercambioDirecto(int []v, int n)
{
int i, j, aux;
for(i = 0; i < n - 1; i++) /* Se realizan N_EL-1 pasadas 
 for(j =n - 1; j > i; j--)
if (v[j-1] > v[j]) {
 aux = v[j-1];
 v[j-1] = v[j];
 v[j] = aux;
}
}
    public static void mostrar(int[] v, int n){
        int i;
        System.out.print("(");
        for(i=0;i<n-1;i++){
            System.out.print(v[i]+", ");
        }
        if(n>0)
            System.out.print(v[i]);//el último elemento del vector
        
        System.out.println(")");
        
    }
}


*/






import java.io.*;

public class sadsaddsa {
public static void main(String args[]) throws IOException{
BufferedReader x=new BufferedReader(new InputStreamReader (System.in));
int votos[]=new int [9];
for(int i=0; i<9;i++){
System.out.println("Escribe el n�mero que corresponde al voto de tu preferencia\n 1.Piso1\n 2.Piso2\n 3.Piso3");
votos[i]=Integer.parseInt(x.readLine());

}
int contar=0;
int contar1=0;
int contar2=0;
for(int b=0;b<9;b++){
if(votos[b]==1){
contar=contar+1;

}
else if(votos[b]==2){
contar1=contar1+1;

}
else if(votos[b]==3){
contar2=contar2+1;

}

}
System.out.println("resultado Piso1: "+contar);
System.out.println("resultado Piso2: "+contar1);
System.out.println("resultado Piso3: "+contar2);


}

}







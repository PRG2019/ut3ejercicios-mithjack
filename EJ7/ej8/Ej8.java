package ej8;

import java.io.*;
import java.util.*;

public class Ej8 {
	public static class venta{
		int codigo;
		int venta;
		int mes;
		int dia;
		
		public venta(int co, int ve, int me, int di) {
			this.codigo=co;
			this.venta=ve;
			this.mes=me;
			this.dia=di;
		}
		public int getVenta() {
			return venta;
			
		}
		public int getMes() {
			return mes;
		}
	}
	
	public static Scanner sc=new Scanner(System.in);
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ArrayList<venta> VENTA=new ArrayList <venta>();
		
		boolean sw=false;
		while (!sw) {
		System.out.println("1. Añadir datos");
		System.out.println("2. Hacer medias");
		System.out.println("3. Leer medias");
		int men=sc.nextInt();
		
		switch (men) {
		case 1:
			try {
				System.out.println("Dime codigo vendedor");
				int cod=sc.nextInt();
				System.out.println("Dime importe venta");
				int ven=sc.nextInt();
				System.out.println("Dime mes");
				int mes=sc.nextInt();
				System.out.println("Dime dia");
				int dia=sc.nextInt();
				
				venta v=new venta(cod, ven, mes, dia);
				VENTA.add(v);
			}
			catch(InputMismatchException  e) {
			    sc.nextLine();
				System.out.println("Error, dato de tipo invalido "+e);
			}
			break;
			
		case 2:
			try {
				int m1=0, m2=0, m3=0, m4=0, m5=0, m6=0, m7=0, m8=0, m9=0, m10=0, m11=0, m12=0, mt=0;
				int c1=0, c2=0, c3=0, c4=0, c5=0, c6=0, c7=0, c8=0, c9=0, c10=0, c11=0, c12=0;
				FileOutputStream fs=new FileOutputStream("VENTAS.txt");
				DataOutputStream d=new DataOutputStream(fs);
				
				for(int i=0;i<VENTA.size();i++) {
					if(VENTA.get(i).mes==1) {
						m1+=VENTA.get(i).venta;
						c1++;
					}
					else if(VENTA.get(i).mes==2) {
						m2+=VENTA.get(i).venta;
						c2++;
					}
					else if(VENTA.get(i).mes==3) {
						m3+=VENTA.get(i).venta;
						c3++;
					}
					else if(VENTA.get(i).mes==4) {
						m4+=VENTA.get(i).venta;
						c4++;
					}
					else if(VENTA.get(i).mes==5) {
						m5+=VENTA.get(i).venta;
						c5++;
					}
					else if(VENTA.get(i).mes==6) {
						m6+=VENTA.get(i).venta;
						c6++;
					}
					else if(VENTA.get(i).mes==7) {
						m7+=VENTA.get(i).venta;
						c7++;
					}
					else if(VENTA.get(i).mes==8) {
						m8+=VENTA.get(i).venta;
						c8++;
					}
					else if(VENTA.get(i).mes==9) {
						m9+=VENTA.get(i).venta;
						c9++;
					}
					else if(VENTA.get(i).mes==10) {
						m10+=VENTA.get(i).venta;
						c10++;
					}
					else if(VENTA.get(i).mes==11) {
						m11+=VENTA.get(i).venta;
						c11++;
					}
					else {
						m12+=VENTA.get(i).venta;
						c12++;
					}
				}
				mt=m1+m2+m3+m4+m5+m6+m7+m8+m9+m10+m11+m12;
				
					d.writeChars("TOTAL VENTA ");
					d.writeChars("ENERO "+m1+" "+(m1/c1));
					d.writeChars(" FEBRERO "+m2+" "+(m2/c2));
					d.writeChars(" MARZO "+m3+" "+(m3/c3));
					d.writeChars(" ABRIL "+m4+" "+(m4/c4));
					d.writeChars(" MAYO "+m5+" "+(m5/c5));
					d.writeChars(" JUNIO "+m6+" "+(m6/c6));
					d.writeChars(" JULIO "+m7+" "+(m7/c7));
					d.writeChars(" AGOSTO "+m8+" "+(m8/c8));
					d.writeChars(" SEPTIEMBRE "+m9+" "+(m9/c9));
					d.writeChars(" OCTUBRE "+m10+" "+(m10/c10));
					d.writeChars(" NOVIEMBRE "+m11+" "+(m11/c11));
					d.writeChars(" DICIEMBRE "+m12+" "+(m12/c12));
					d.writeChars(" VENTA MEDIA MEDIAS "+(mt/12));
					d.writeChars("|||");
				
				if(d!=null) {
					d.close();
					fs.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			catch(ArithmeticException e) {
				e.printStackTrace();
			}
			break;
			
		case 3:
			try {
				File f=null;
				FileInputStream fe=null;
				DataInputStream d=null;
				
				try {
					f=new File("VENTAS.txt");
					if(f.exists()) {
						fe=new FileInputStream(f);
						d=new DataInputStream(fe);
						
						String l;
						while((l=d.readLine())!=null)
				            System.out.println(l);
				      }
				}
				catch(EOFException eof) {
					System.out.println("-----------------------------");
				}
				catch(FileNotFoundException fnf) {
					System.err.println("Fichero no encontrado "+fnf);
				}
				catch(IOException e) {
					System.err.println("Se ha producido una IOException");
					e.printStackTrace();
				}
				catch(Throwable e) {
					System.err.println("Error de programa: "+e);
					e.printStackTrace();
				}
				finally {
					if(d!=null) {
						d.close();
						fe.close();
					}
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			break;
			
		case 99:
			sw=true;
		}
		}
	}
}

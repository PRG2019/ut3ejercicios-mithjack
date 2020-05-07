
public class ExcepcionContenedor extends Exception{
	private int pos;
	
	public ExcepcionContenedor(String s, int pos) {
		super(s);
		this.pos= pos;
	}
	
	public ExcepcionContenedor(String s){
		super(s);
	}
	
	public int getPosicion(){
		return pos;
	}
}

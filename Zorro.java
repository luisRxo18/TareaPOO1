package mirefugio.poo;

public class Zorro implements Animal {
	private String raza;
	public Zorro(String raza){
		this.raza=raza;
	}
	public String getRaza(){
		return raza;
	}
	public String hablar(){
		return "MUAJAJA!";
	}
	public String toString(){
		return ""+this.raza;
	}

}

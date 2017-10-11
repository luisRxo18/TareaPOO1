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
		return "voy a conquistar el mundo";
	}

}

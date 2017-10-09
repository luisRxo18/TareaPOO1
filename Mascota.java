public interface Mascota{
	public String getNombre();
	public void setNombre(String nombre);
	public Persona getDuenio();
	public void adoptado (Persona adoptante);
}
package swp.usecase;

//@Local
public interface IWarenkorbManager {
	
	public void kaufen();
	public void addToWarenkorb(int id);
	public void deleteFromWarenkorb(int id);
}

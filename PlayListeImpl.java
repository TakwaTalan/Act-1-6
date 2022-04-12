package MusiqueFolder;
import java.util.ArrayList;
public class PlayListeImpl implements InterfacePlayList{

	public final int Max_Musiques = 5;
	private String titre;
	private String genre;
	private int nombresTitres;
	ArrayList<MusiqueImpl> Musiquelist = new ArrayList<MusiqueImpl>();
	
	public PlayListeImpl(String titre, String genre, int nombresTitres, ArrayList<MusiqueImpl> list) {
		super();
		this.titre = titre;
		this.genre = genre;
		this.nombresTitres = nombresTitres;
		this.Musiquelist = list;
	}




	public String getTitre() {
		return titre;
	}




	public void setTitre(String titre) {
		this.titre = titre;
	}




	public String getGenre() {
		return genre;
	}




	public void setGenre(String genre) {
		this.genre = genre;
	}




	public int getNombresTitres() {
		return nombresTitres;
	}




	public void setNombresTitres(int nombresTitres) {
		this.nombresTitres = nombresTitres;
	}




	public ArrayList<MusiqueImpl> getMusiquelist() {
		return Musiquelist;
	}




	public void setMusiquelist(ArrayList<MusiqueImpl> musiquelist) {
		Musiquelist = musiquelist;
	}




	public int getMax_Musiques() {
		return Max_Musiques;
	}



	@Override
	public String toString() {
		return "PlayListeImpl [Musiquelist=" + Musiquelist + "]";
	}
	@Override
	public void AffichPlayList() {
	System.out.println(Musiquelist.toString());	
	}


	@Override
	public void AjoutMusique(MusiqueImpl music) {
		System.out.println(Musiquelist.size()) ;
		if (Musiquelist.size() < Max_Musiques)
		{
	Musiquelist.add(music);
		}
	else {
	 System.out.println("la playlist est chargée");
	}
	}
		
	}


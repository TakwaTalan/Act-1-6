package MusiqueFolder;

import java.util.ArrayList;

public class PlayListeUI {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MusiqueImpl music1 = new MusiqueImpl("song-1", "Writer", "Interprete", "Hits1");
		MusiqueImpl music2 = new MusiqueImpl("song-2","Writer", "Interprete2", "Hits2");
		
		ArrayList<MusiqueImpl> list = new ArrayList<>() ;
		
		PlayListeImpl PlayListe=new PlayListeImpl("SongsList", "Titles",4,list);
		list.add(music1);
		
		
		 PlayListe.AjoutMusique(music2);
		 PlayListe.AffichPlayList();
	}
   
}


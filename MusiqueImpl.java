package MusiqueFolder;
	public class MusiqueImpl implements Musique{
		private String titre;
		private String auteur;
		private String interprete;
		private String genre;

		public MusiqueImpl(String titre, String auteur, String interprete, String genre) {
			this.titre = titre;
			this.auteur = auteur;
			this.interprete = interprete;
			this.genre = genre;
		}
		public String getTitre() {
			return titre;
		}


		public void setTitre(String titre) {
			this.titre = titre;
		}


		public String getAuteur() {
			return auteur;
		}


		public void setAuteur(String auteur) {
			this.auteur = auteur;
		}


		public String getInterprete() {
			return interprete;
		}


		public void setInterprete(String interprete) {
			this.interprete = interprete;
		}


		public String getGenre() {
			return genre;
		}


		public void setGenre(String genre) {
			this.genre = genre;
		}
	
		@Override
		public String toString() {
			return "MusiqueImpl [titre=" + titre + ", auteur=" + auteur + ", interprete=" + interprete + ", genre="
					+ genre + "]";
		}
		
		@Override
		public void Afficher() {
			// TODO Auto-generated method stub
	
			System.out.println(toString());
		}

		@Override
		public boolean VerifEgaliteInstance(MusiqueImpl M1, MusiqueImpl M2) {
			if (M1.getTitre().equals(M2.getTitre()) & M1.getAuteur().equals(M2.getAuteur()) & M1.getInterprete().equals(M2.getInterprete()) & M1.getGenre().equals(M2.getGenre()) ) {
				return (true);
			}
			else {
			// TODO Auto-generated method stub
			return false;
		}

		
		
		}
		}
	

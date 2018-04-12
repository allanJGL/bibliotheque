import java.io.*;

class Bibliotheque {

	public Livre tabLivres[];
	// private double discrim;
	// private double r1,r2;
	
	public void ajouterLivre(String titre,String genre,int anneeSortie,String nomAuteur) {
}

}
///////////////////////////////////////////////////////
// Fournier,Alain,1886,1914
class Auteur {
	private String nom;
	private String prenom;
	private int anneeNaissance;
	private int anneeDeces;
	
	
	public Auteur(String nomc, String prenomc,int naissance,int deces){
		nom = nomc;
		prenom = prenomc;
		anneeNaissance = naissance;
		anneeDeces = deces;
	}
	
	public int getAnneeDeces() {
		return anneeDeces;
}

	public int getAnneeNaissance() {
		return anneeNaissance;
}

	public void affiche (){
		System.out.println("Nom : " + nom + " - Prenom : " + prenom + " - Naissance : " + anneeNaissance + " - Deces : " + anneeDeces);
	}

}
// Le grand Maulnes,roman,1910,Fournier
class Livre {
	private String titre;
	private String genre;
	private int annee;
	private Auteur auteur;
	
	public Livre(String titrel, String typel, int annéel, Auteur auteurl){
		titre = titrel;
		genre = typel;
		annee = annéel;
		auteur = auteurl;
	}
	
	public int  getAnneeSortie() {
		return annee;
	}

	public Auteur getAuteur() {
		return auteur;
	}
	
	public void afficherl(){
		System.out.println("Titre : " + titre + " - Genre : " + genre + " - Année : " + annee);
		System.out.print("Auteur : ");
		auteur.affiche();
	}
}
	
///////////////////////////////////////////////////////////////

class Biblio {
	public static void main(String[] args) {
			Auteur Fournier = new Auteur("Fournier","Alain",1886,1914);
		    Auteur Aragon = new Auteur("Aragon","Louis",1897,1982);
		    Auteur Balzac = new Auteur("Balzac","Honoré",1799,1850);
		    Auteur Baudelaire = new Auteur("Baudelaire","Charles",1821,1867);
		    Auteur Beaumarchais = new Auteur("Beaumarchais","Pierre",1732,1799);
		    Auteur Beauvoir = new Auteur("Beauvoir","Simone",1908,1986);
		    Auteur Camus = new Auteur("Camus","Albert",1913,1960);
		    Auteur Claudel = new Auteur("Claudel","Paul",1868,1955);
		    Auteur Colette = new Auteur("Colette"," ",1873,1954);
		    Auteur Corneille = new Auteur("Corneille","Pierre",1606,1684);
		    Auteur Daudet = new Auteur("Daudet","Alphonse",1840,1897);
		    Auteur Diderot = new Auteur("Diderot","Denis",1713,1784);
		    Auteur Dumas = new Auteur("Dumas","Alexandre",1802,1870);
		    Auteur Duras = new Auteur("Duras","Marguerite",1914,1996);
		    Auteur Eluard = new Auteur("Eluard","Paul",1895,1952);
		    Auteur Flaubert = new Auteur("Flaubert","Gustave",1821,1880);
		    Auteur Giraudoux = new Auteur("Giraudoux","Jean",1882,1944);
		    Auteur Gide = new Auteur("Gide","André",1821,1880);
		    Auteur Giono = new Auteur("Giono","Jean",1895,1970);
		    Auteur Ionesco = new Auteur("Ionesco","Eugène",1912,1994);
		    Auteur LaFontaine = new Auteur("La Fontaine","Jean",1621,1695);
		    Auteur Lamartine = new Auteur("Lamartine","Alphonse",1790,1869);
		    Auteur Malraux = new Auteur("Malraux","André",1901,1976);
		    Auteur Marivaux = new Auteur("Marivaux","Pierre",1688,1763);
		    Auteur Mauriac = new Auteur("Mauriac","François",1885,1970);
		    Auteur Montaigne = new Auteur("Montaigne","Michel",1533,1592);
		    Auteur Montesquieu = new Auteur("Montesquieu"," ",1689,1755);
		    Auteur Musset = new Auteur("Musset","Alfred",1810,1857);
		    Auteur Pagnol = new Auteur("Pagnol","Marcel",1895,1974);
		    Auteur Pascal = new Auteur("Pascal","Blaise",1623,1662);
		    Auteur Proust = new Auteur("Proust","Marcel",1871,1922);
		    Auteur Rabelais = new Auteur("Rabelais","François",1483,1553);
		    Auteur Rousseau = new Auteur("Rousseau","Jean-Jacques",1712,1778);
		    Auteur Sand = new Auteur("Sand","Georges",1804,1876);
		    Auteur Sartre = new Auteur("Sartre","Jean-Paul",1905,1980);
		    Auteur Stendhal = new Auteur("Stendhal","",1783,1842);
		    Auteur Villon = new Auteur("Villon","François",1431,1463);
		    Auteur Voltaire = new Auteur("Voltaire","François",1694,1778);
		    Auteur Zola = new Auteur("Zola","Emile",1840,1902);
		    
		    Livre livre1 = new Livre("Le grand Maulnes","Roman",1910,Fournier);

		    Livre livre2 = new Livre("Aurélien","Roman",1944,Aragon);
		    Livre livre3 = new Livre("Le crève-coeur","Poème",1941,Aragon);
		    Livre livre4 = new Livre("Les yeux d'Elsa", "Poème",1942,Aragon);
		    Livre livre5 = new Livre("Le paysan de Paris","Essai",1926,Aragon);
		    Livre livre6 = new Livre("Le père Goriot","Roman",1835,Balzac);
		    Livre livre7 = new Livre("Les chouans","Roman",1829,Balzac);
		    Livre livre8 = new Livre("La comédie humaine","Roman",1829,Balzac);
		    Livre livre9 = new Livre("Le colonel Chabert","Roman",1835,Balzac);
		    Livre livre10 = new Livre("L'albatros","Poème",1861,Baudelaire);
		    Livre livre11 = new Livre("Les fleurs du mal","Poème",1861,Baudelaire);
		    Livre livre12 = new Livre("Le farfalo","Nouvelle",1847,Baudelaire);
		    Livre livre13 = new Livre("Le barbier de Séville","Comédie",1775,Beaumarchais);
		    Livre livre14 = new Livre("Le mariage de Figaro","Comédie",1775,Beaumarchais);
		    Livre livre15 = new Livre("La mère coupable","Drame",1792,Beaumarchais);
		    Livre livre16 = new Livre("Le deuxième sexe","Essai",1949,Beauvoir);
		    Livre livre17 = new Livre("La force des choses","Roman",1963,Beauvoir);
		    Livre livre18 = new Livre("Mémoires d'une jeune fille rangée","Roman",1958,Beauvoir);
		    Livre livre19 = new Livre("Caligula","Pièce",1944,Camus);
		    Livre livre20 = new Livre("La chute","Roman",1956,Camus);
		    Livre livre21 = new Livre("L'étranger","Roman",1942,Camus);
		    Livre livre22 = new Livre("La peste","Roman",1947,Camus);
		    Livre livre23 = new Livre("Le mythe de Susyphe","Essai",1942,Camus);
		    Livre livre24 = new Livre("L'annonce faite à Marie","Drame",1911,Claudel);
		    Livre livre25 = new Livre("Le soulier de satin","Drame",1929,Claudel);
		    Livre livre26 = new Livre("L'échange","Pièce",1901,Claudel);
		    Livre livre27 = new Livre("Le blé en herbe","Roman",1923,Colette);
		    Livre livre28 = new Livre("La chatte","Roman",1933,Colette);


			Fournier.affiche();
			livre2.afficherl();
			}
	
	}

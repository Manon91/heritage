package musique;

public class Solo extends Music {

	//méthode pour afficher le nom du groupe et chanteur
    public void showArtiste() {
    	System.out.println("L'artiste " + getName() + "a commencé sa carrière en " + getYearOfCreation() + "et sa musique est de style " + getStyle() + ".");
    }

}
package musique;

public class Bands extends Music {
	
	//méthode pour afficher les membres du groupe
    public void showBand() {
        System.out.println("Le groupe " + getName() + "est composé " + getMembers() + " membres, qui sont " + getDrum() + ", " + getGuitar() + ", " + getBass() + "et " + getSing() + ".");
    }

}
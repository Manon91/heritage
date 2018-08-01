package musique;

public class Application {

    public static void main(String[] args) {
        //creation d'une nouvelle instance
    	Bands bands1 = new Bands();
    	bands1.setBass("Tom Hamilton ");
    	bands1.setDrum("Joey Kramer");
    	bands1.setGuitar("Joe Perry, Brad Whitford");
    	bands1.setMembers(5);
    	bands1.setName("Aerosmith ");
    	bands1.setSing("Steven Tyler");
    	bands1.setStyle("hard rock");
    	bands1.setYearOfCreation(1970);
    	
    	//appel de la methode
    	bands1.showBand();
    }

}
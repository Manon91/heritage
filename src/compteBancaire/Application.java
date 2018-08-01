package compteBancaire;

public class Application {

    public static void main(String[] args) {
        //creation de l'instance PierreCourant
    	CompteCourant pierreCourant = new CompteCourant();
    	pierreCourant.setSolde(500);
    	//creation de l'instance PierreEpargne
    	CompteEpargne pierreEpargne = new CompteEpargne();
    	pierreEpargne.setSolde(1000);
    	//creation de l'instance AureliaCourant
    	CompteCourant aureliaCourant = new CompteCourant();
    	aureliaCourant.setSolde(500);
    	//creation de l'instance AureliaEpargne
    	CompteEpargne aureliaEpargne = new CompteEpargne();
    	aureliaEpargne.setSolde(1000);
    	
    	//appel de la methode pour un retrait
    	aureliaCourant.retrait(21);
    	//appel de la méthode pour un virement
    
    }

}
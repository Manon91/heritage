package compteBancaire;

public class CompteCourant extends CompteBancaire {

	//methode pour faire un retrait
    public void retrait(int montantRetrait) {
    	if (solde > montantRetrait) {
    		System.out.println("Le solde actuel est de " + solde + " €");
    		solde = solde - montantRetrait;
    		System.out.println("Le nouveau solde est de " + solde + " €");
    	}
    	else {
    		System.out.println("Solde insuffisant");
    	}
    }
	
	//methode pour faire un virement
    public void virement(int montantVirement) {
    	System.out.println("Le solde actuel est de " + solde + " €");
    	if (solde > montantVirement) {
    		
    	}
    	else {
    		System.out.println("Solde insuffisant");
    	}
    }

}
package Pres;

import Dao.DaoImpl;
import Metier.MerierImpli;

public class Presentation {
public static void main(String[] args) {
	// l'injection des dependences par une instanciation statique
	DaoImpl dao = new DaoImpl();
	MerierImpli metier = new MerierImpli();	
	metier.setDao(dao);
	System.out.println(metier.calcul());
	// l'injection des dependences par une instanciation dynamique
	
	
}
/* une classe  fermer a la modification & ouvert a l'extension c'est a dire que la classe depend juste de l'interface pas des classes 
 * */
}

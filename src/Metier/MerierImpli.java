package Metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Dao.IDao;

@Component("metier")
public class MerierImpli implements IMetier  {
   //couplage faible
	@Autowired
	private IDao dao = null;;
	@Override
	public double calcul() {
     double data= dao.getData();
     double res = data*Math.PI; 
     return res;
	}
	// pour injecter dans la variable dao un object d'une classe qui implement l'interface IDao
	public void setDao(IDao dao) {
		this.dao = dao;
		System.out.println("Injection de dépendances");
	}
	public void init() {
		System.out.println("Initialisation de Metier Impl");
	}
	public MerierImpli() {
          System.out.println("Instanciation de metier");	
}
	
}

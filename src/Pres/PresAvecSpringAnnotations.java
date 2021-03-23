package Pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Metier.IMetier;

public class PresAvecSpringAnnotations {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier");
		IMetier metier= context.getBean(IMetier.class);
		System.out.println(metier.calcul());
	}
}

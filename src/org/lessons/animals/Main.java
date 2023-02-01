package org.lessons.animals;

public class Main {

	public static void main(String[] args) {
		
			    Animali cane = new Cane();
			    Animali passerotto = new Passerotto();
			    Animali aquila = new Aquila();
			    Animali delfino = new Delfino();
			    
			    cane.dormi();
			    cane.mangia();
			    cane.verso();
			    
			    ((Cane) cane).nuota();
			    
			    passerotto.dormi();
			    passerotto.mangia();
			    passerotto.verso();
			    
			    ((Passerotto) passerotto).vola();
			    
			    aquila.dormi();
			    aquila.mangia();
			    aquila.verso();
			    
			    ((Aquila) aquila).vola();
			    
			    delfino.dormi();
			    delfino.mangia();
			    delfino.verso();
			    
			    ((Delfino) delfino).nuota();
			    
			    
	}
	
	public static void faiVolare(Volare Animali) {
		Animali.vola();
	}
	
	
	public static void faiNuotare(Nuotare Animali) {
		Animali.nuota();
	}

}

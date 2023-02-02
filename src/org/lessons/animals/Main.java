package org.lessons.animals;

public class Main {

	public static void main(String[] args) {
		
			    Cane cane = new Cane();
			    Passerotto passerotto = new Passerotto();
			    Aquila aquila = new Aquila();
			    Delfino delfino = new Delfino();
			    
			    cane.dormi();
			    cane.mangia();
			    cane.verso();
			    
			    cane.nuota();
			    
			    passerotto.dormi();
			    passerotto.mangia();
			    passerotto.verso();
			    
			    passerotto.vola();
			    
			    aquila.dormi();
			    aquila.mangia();
			    aquila.verso();
			    
			    aquila.vola();
			    
			    delfino.dormi();
			    delfino.mangia();
			    delfino.verso();
			    
			    delfino.nuota();
			    
			    
	}
	
	public static void faiVolare(Volare Animali) {
		Animali.vola();
	}
	
	
	public static void faiNuotare(Nuotare Animali) {
		Animali.nuota();
	}

}

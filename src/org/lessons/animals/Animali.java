package org.lessons.animals;

public abstract class Animali {
		  abstract void dormi();
		  abstract void mangia();
		  void verso() {}
		}


		class Cane extends Animali {
		  void dormi() {
		    System.out.println("Il cane dorme" + " " + "Zzz");
		  }
		  
		  void mangia() {
		    System.out.println("il cane " + " " + "Mangia carne");
		  }
		  
		  void verso() {
		    System.out.println("Il cane fa il verso " + " " + "Bau");
		  }
		  
		  void nuota() {
				System.out.println("Cane: Sto nuotando");
			  }
		}

		class Passerotto extends Animali {
		  void dormi() {
		    System.out.println("Il passerotto dorme" + " " + "Zzz");
		  }
		  
		  void mangia() {
		    System.out.println("Il passerotto" + " " +"Mangia semi");
		  }
		  
		  void verso() {
		    System.out.println("Il passerotto fa il verso" + " " + "chip chip");
		  }
		  
		  void vola() {
			  System.out.println("Passerotto : sto volando");
		  }
		}

		class Aquila extends Animali {
		  void dormi() {
		    System.out.println("L'aquila dorme" + " " + "Zzz");
		  }
		  
		  void mangia() {
		    System.out.println("L'aquila" + " " + "Mangia carne");
		  }
		  
		  void verso() {
		    System.out.println("L'aquila fa il verso" + " " + "scretchhh");
		  }
		  
		  void vola() {
			  System.out.println("Aquila : sto volando");
		  }
		}

		class Delfino extends Animali {
		  void dormi() {
		    System.out.println("Il delfino dorme" + " " + "Zzz");
		  }
		  
		  void mangia() {
		    System.out.println("Il delfino dorme" + " " +"Mangia pesce");
		  }
		  
		  void verso() {
		    System.out.println("Il delfino fa il verso" + " " +"hfhdshfsdhfshd");
		  }
		  
		  void nuota() {
			System.out.println("Delfino: Sto nuotando");
		  }
		  
}
		

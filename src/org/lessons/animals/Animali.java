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
}

package org.lessons.animals;

public abstract class Animali {
		  public void dormi() { 
			  System.out.println("zzzzzz");};
		  public abstract void mangia();
		  public abstract void verso();
		}


		class Cane extends Animali implements Nuotare{
		  
		  public void mangia() {
		    System.out.println("il cane " + " " + "Mangia carne");
		  }
		  
		  public void verso() {
		    System.out.println("Il cane fa il verso " + " " + "Bau");
		  }
		  
		  public void nuota() {
				System.out.println("Cane: Sto nuotando");
			  }
		}

		class Passerotto extends Animali implements Volare{
		  
		  public void mangia() {
		    System.out.println("Il passerotto" + " " +"Mangia semi");
		  }
		  
		  public void verso() {
		    System.out.println("Il passerotto fa il verso" + " " + "chip chip");
		  }
		  
		  public void vola() {
			  System.out.println("Passerotto : sto volando");
		  }
		}

		class Aquila extends Animali implements Volare{
		  
		  public void mangia() {
		    System.out.println("L'aquila" + " " + "Mangia carne");
		  }
		  
		  public void verso() {
		    System.out.println("L'aquila fa il verso" + " " + "scretchhh");
		  }
		  
		  public void vola() {
			  System.out.println("Aquila : sto volando");
		  }
		}

		class Delfino extends Animali implements Nuotare{
		  
		  public void mangia() {
		    System.out.println("Il delfino dorme" + " " +"Mangia pesce");
		  }
		  
		  public void verso() {
		    System.out.println("Il delfino fa il verso" + " " +"hfhdshfsdhfshd");
		  }
		  
		  public void nuota() {
			System.out.println("Delfino: Sto nuotando");
		  }
		  
}
		

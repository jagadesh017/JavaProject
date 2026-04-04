package oopsConcepts.abstractconcept;

public class HR extends ITDepart{
	public static void main(String[] args) {
		
		HR h= new HR();
		h.goodies();
		h.work();
		h.salary();
		h.bonus();
		
		ITDepart it= new HR();
		it.goodies();
		it.work();
		it.salary();
		
		
	}
	
	public void bonus() {
		System.out.println("bonus  is 1laksh");
	}

	public void salary() {
		System.out.println("salary is 5LPA");
		
	}
}

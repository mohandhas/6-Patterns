package factory;

public class Main {

	public static void main(String[] args) {
		
		Coffee coffee = CoffeeFactory.getCoffee("A");
		System.out.println(coffee.serve()+" "+coffee);
		
		coffee = CoffeeFactory.getCoffee("B");
		System.out.println(coffee.serve()+" "+coffee);
		
		
	}
}

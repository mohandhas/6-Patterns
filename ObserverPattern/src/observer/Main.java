
package observer;


public class Main {
	
	public static void main(String[] args) throws InterruptedException {
	
		Modal modal = new Modal();
		
		modal.addChangeListener(new Class1("Sathya"));
		modal.addChangeListener(new Class2("Mohan"));
		modal.addChangeListener(new Class3("Tarun"));
		
		int score = 0;
		while(true)
		{
			modal.score.setScore(score);
			score+=(int)Math.ceil(Math.random()*2);
			Thread.sleep(3000);
		}
	}	
}

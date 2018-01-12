package observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Class2 implements PropertyChangeListener{

	String name;
	Class2(String name)
	{
		this.name = name;
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("Score Update to "+name+": "+evt.getNewValue()+" runs\n");
		
	}
}

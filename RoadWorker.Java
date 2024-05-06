
package RoadWorker;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

/**
	* 
	 * Lead Author(s): Thomas Woods
	 * @author 
	 * @author 
	 * <<add additional lead authors here, with a full first and last name>>
	 * 
	 * Other contributors:
	 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
	 * 
	 * References:
	 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
	 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
	 * 
	 * Gaddis, T. (2015). Starting out with Java: From control structures through objects. Addison-Wesley. 
	 * 
	 * <<add more references here>>
	 *  
	 * Version/date: 5/6/2024
	 * 
	 * Responsibilities of class:
	 * 
	 */
public class RoadWork 
{
	private RoadWorkFile kk;
	String File;
	public RoadWork(RoadWorkFile kk)
	{
		System.out.println("Testkk: " + kk);
		System.out.println("TestThis.kk: " + this.kk);
		this.kk = kk;
		getSheet(kk);
	}
	
	public void getSheet(RoadWorkFile kk)
	{
		kk.readTestResults();
	}
}

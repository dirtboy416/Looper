package loop.model;

import java.util.ArrayList;
public class Looper
{
	
	private ArrayList<String> graveNameList;
	
	public Looper()
	{
		graveNameList = new ArrayList<String>();
		
		fillTheNameList();
	}
	
	public ArrayList<String> getGraveNameList()
	{
		return graveNameList;
	}
	
	private void fillTheNameList()
	{
		graveNameList.add("Grace ann vanderhoof");
		graveNameList.add("Samuel J. Rich");
		graveNameList.add("Paulina P. Rich");
		graveNameList.add("Fawn Roper");
		graveNameList.add("Albert J. Cushing");
		graveNameList.add("Olof Nelson");
		graveNameList.add("Anna S. Nelson");
		graveNameList.add("Devvin D. Kraatz");
	}
	public String loopTestOne()
	{
		String loopResult = "";
		int timesLooped = 0;

		for (int loopCounter = 0; loopCounter < 10; loopCounter += 2)
		{
			loopResult += loopCounter + ", ";
			timesLooped++;
		}
		loopResult += "\nThe loop executed " + timesLooped + " times";
		return loopResult;
	}

	public String loopTestTwo()
	{
		String loopResult = "";
		int outerLoopTimes = 0;
		int timesLooped = 0;
		for (int weeks = 0; weeks < 52; weeks++)
		{
			for (int hours = 0; hours < 24; hours++)
			{
				for (int outerLoop = 0; outerLoop < 60; outerLoop++)
				{
					for (int loopCounter = 0; loopCounter < 60; loopCounter++)
					{
						// loopResult += loopCounter + ", ";
						timesLooped++;
					}
					outerLoopTimes++;
				}
			}
		}
		loopResult += "\nThe loop executed " + timesLooped + " times";
		return loopResult;
	}

	public String loopTestThree()
	{
		String loopResult = "";
		int outerLoopTimes = 0;
		int timesLooped = 0;
			for (int quarters = 0; quarters < 4; quarters++)
			{
				for (int nickles = 0; nickles < 5; nickles++)
				{
					for (int pennies = 0; pennies < 5; pennies++)
					{
						timesLooped++;
					}
					outerLoopTimes++;
				}
			}
		loopResult += "\nThe loop executed " + timesLooped + " times";
		return loopResult;
	}
}

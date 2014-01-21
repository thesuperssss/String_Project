package string.view;

import javax.swing.JOptionPane;

public class StringView
{
	String caseTest;
	String firstLetter;
	String afterFirstLetter;
	String fullWord;

	public void displayRunTimeError()
	{
		int tempNumber;

		String tempString;

		JOptionPane.showMessageDialog(null, "Let's crash the program!!!");
		tempString = JOptionPane
				.showInputDialog("type in your favorite number!");
		tempNumber = Integer.parseInt(tempString);
		JOptionPane.showMessageDialog(null, "Your favorite number is "
				+ tempNumber);
	}

	public void usePassedValue(String currentValue)
	{
		JOptionPane.showMessageDialog(null, "you typed in this earlier: "
				+ currentValue);
	}

	public String sendParameterMethod()
	{
		String temp = null;

		JOptionPane.showMessageDialog(null, "let's pass values!!!!!");
		temp = JOptionPane.showInputDialog("type in you favorite words");

		return temp;
	}

	public void moreInteractive(String userName, String funnyPhrase) // parameters
	{
		JOptionPane.showMessageDialog(null,
				"Hi there, we are going to use two parameters");
		JOptionPane.showMessageDialog(null, userName + " thinks that " + "\n "
				+ funnyPhrase + " is funny");
	}

	public void testStringMethods()
	{
		// you will need to call your methods in here

		testSubString();
		testCasing();
		testGetBytes();
	}

	private void testSubString()
	{
		caseTest = JOptionPane.showInputDialog("type in something");
		firstLetter = caseTest.substring(0, 1);
		afterFirstLetter = caseTest.substring(1);
	}

	private void testCasing()
	{
		// this is two methods in one
		// takes to first letter and capitalizes it by using substring

		JOptionPane.showMessageDialog(null, firstLetter.toUpperCase()
				+ afterFirstLetter + " it now all upper case");

		JOptionPane.showMessageDialog(null, firstLetter.toLowerCase()
				+ afterFirstLetter + " is now all lowercase");
		fullWord = firstLetter.toUpperCase() + afterFirstLetter;

	}

	private void testGetBytes()
	{
		JOptionPane.showMessageDialog(null, "lets turn " + fullWord
				+ " into bytes");
		byte[] myBytes;
		myBytes = caseTest.getBytes();
		// myString is turned into bytes then printed out
		String temp = "";

		for (int count = 0; count < myBytes.length; count++)
		{
			temp += myBytes[count];

		}
		JOptionPane.showMessageDialog(null, temp);
		JOptionPane.showMessageDialog(null, "well now you know");
	}

}

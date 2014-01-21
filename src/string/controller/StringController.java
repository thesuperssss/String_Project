package string.controller;

import string.view.StringView;

public class StringController
{

	private StringView myView;

	public StringController()
	{
		myView = new StringView();
	}
	
	public void start()
	{
//		//myView.displayRunTimeError();
//		// make variable temp, send to sendParameterMethod
//		String temp = myView.sendParameterMethod();
//		// make currentValue set to temp then run usPassedValue
//		myView.usePassedValue(temp);
//	
//	
//		// (, = parameter list)
//		//run moreInteractive make name = Jacob and funnyPhrase to the answer in sendParameterMethod
//		myView.moreInteractive("Jacob", myView.sendParameterMethod());
		myView.testStringMethods();
	}
}

package ExecutionEngine;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
//import org.eclipse.jetty.util.log.Log;
import Config.ActionKeywords;
import Config.Constants;
import Utility.ExcelUtils;
import Utility.log;

public class DriverScript {
	public static Properties OR;
	public static ActionKeywords actionkeyword;
	public static String keywords; 
	public static Method Method[];
	public static String sPageObject;
	
	public DriverScript(){
		actionkeyword = new ActionKeywords();
		Method = actionkeyword.getClass().getMethods();
	}
	
	public static void MainDriverScript() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		String FilePath = Constants.Path_TestData;
		
		try {
			ExcelUtils.setExcelFile(FilePath, Constants.Sheet_TestSteps);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	   int LastRowNum = ExcelUtils.getLastRowNumber();
	   InitializeLogs();
	   //Log.startTestCase();
	   for (int iRow=1;iRow<=LastRowNum;iRow++){
	    //Storing the value of excel cell in sActionKeyword string variable
		keywords = ExcelUtils.getCellData(iRow, Constants.Col_ActionKeyword);
		sPageObject = ExcelUtils.getCellData(iRow, Constants.Col_PageObject);
        executeActions();
	   }
	}
		
	private static void executeActions() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		for(int i=0;i< Method.length;i++){
			if(Method[i].getName().equals(keywords)){
				Method[i].invoke(actionkeyword,sPageObject);
				break;
			}
		}
	}
	
	public static void loadOR() throws IOException{
		//Declaring String variable for storing Object Repository path
    	//String Path_OR = Constants.Path_OR;
		
		//Creating file system object for Object Repository text/property file
		FileInputStream fs = new FileInputStream("D:\\EclipseWorkspace\\Just_Arrived\\src\\main\\java\\Config\\OR");
		//Creating an Object of properties
		OR= new Properties(System.getProperties());
		//Loading all the properties from Object Repository property file in to OR object
		OR.load(fs);
	}
	
	public static void InitializeLogs(){
		//This is to start the Log4j logging in the test case
				DOMConfigurator.configure("log4j.xml");
	}
	
	
}

package model;

public class DbConnection {
	private static  String pass="jdbc:h2:file:C:/Users/Zenya/Desktop/Work/SD-2017/H2DB/sd-2017db";

	public static String getPass(){
		return pass;
	}
}

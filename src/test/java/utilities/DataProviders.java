package utilities;

import java.io.IOException;
import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name="LoginData")
	public String[][] getLoginData() throws IOException{
		
		ExcelUtility exc= new ExcelUtility("./testData\\TestData.xlsx", "loginTestData");
		int rowNum =exc.getRowCount();
		int cellNum=exc.getCellCount();
		
		String[][] data = new String[rowNum][cellNum];
		
		for(int i=1;i<=rowNum;i++) {
			for(int j=0;j<cellNum;j++) {
				data[i-1][j]=exc.getCellValue(i, j);
			}
		}
	return data;
	}
	
	@DataProvider(name="ItemData")
	public String[][] getItemData() throws IOException{
		
		ExcelUtility exc= new ExcelUtility("./testData\\TestData.xlsx", "itemData");
		int rowNum =exc.getRowCount();
		int cellNum=exc.getCellCount();
		
		String[][] data = new String[rowNum][cellNum];
		
		for(int i=1;i<=rowNum;i++) {
			for(int j=0;j<cellNum;j++) {
				data[i-1][j]=exc.getCellValue(i, j);
			}
		}
	return data;
	}
}


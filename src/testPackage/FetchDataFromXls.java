package testPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromXls 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		String path = "D:\\Renuka Office\\Renuka Office\\Automation.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("AuditorsStatus");
		
		for(int i=0;i<=7;i++)
		{
			for(int j=0;j<=1;j++)
			{
				String src=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(src);
			}
			System.out.println();
		}
	}

}

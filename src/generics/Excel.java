/*This Class contain two generic methods , one to get rowCount
 * one to read data from excel.
 * 
 */
package generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel
{

	//method which return number of row this returns index (start index is 0)
	public static int getRowCount(String path, String sheet)
	{
		int rc=0;
		
		try
		{
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			rc=wb.getSheet(sheet).getLastRowNum();
			
		}
		
		catch(Exception e)
		{
			
		}
		
		return rc;
	}
	
	
	//method which returns data present in the cell
	
	public static String getCellValue(String path, String sheet, int r, int c)
	{
		String v = "";
	
		try
		{
			FileInputStream fis =new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
			
		}
		
		catch(Exception e)
		{
			
		}
		
		return v;
	}
}

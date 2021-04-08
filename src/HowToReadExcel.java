import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HowToReadExcel {

	public static void main(String[] args) throws IOException  {
		FileInputStream ip = new FileInputStream("D:\\Demo.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		XSSFSheet sh = wb.getSheet("Sheet1");
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sh.getPhysicalNumberOfRows());
		System.out.println(sh.getRow(0).getPhysicalNumberOfCells());
		
		for(int i=0; i<sh.getPhysicalNumberOfRows();i++)
		{
			
			for (int j=0;j<sh.getRow(0).getPhysicalNumberOfCells();j++)
				
			{
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
		
		
		
	}
}
}
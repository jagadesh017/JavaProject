package excelDataReading;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadData {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("/Users/jagadeesh/Documents/basic.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int rowNum = sheet.getPhysicalNumberOfRows();
        int colNum = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rowNum-1][colNum];

        for(int i=0;i<rowNum-1;i++){
            XSSFRow row = sheet.getRow(i+1);
            for(int j=0;j<colNum;j++){
                XSSFCell cell = row.getCell(j);
                data[i][j] = cell.getStringCellValue();
                System.out.println(data[i][j]);
            }
        }
    }
}

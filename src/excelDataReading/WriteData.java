package excelDataReading;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {

    public static void main(String[] args) throws IOException {
        XSSFWorkbook  workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        DataFormatter formatter = new DataFormatter();

        Object[][] data = {
                {"Name", "Age", "City"},
                {"John", 30, "New York"},
                {"Alice", 25, "Los Angeles"},
                {"jagadeesh", 33, "india"}

        };
        int rowCount =0;
        for(Object[] row:data){
            XSSFRow rows = sheet.createRow(rowCount++);
            int colNum = 0;
            for(Object cell:row){
                XSSFCell cells = rows.createCell(colNum++);

                if(cell instanceof String){
                    cells.setCellValue(cell.toString());
                } else if(cell instanceof Integer){
                    cells.setCellValue(cell.toString());

                }

            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/jagadeesh/Documents/basic.xlsx");
        workbook.write(fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("Data written to Excel file successfully");
    }
}

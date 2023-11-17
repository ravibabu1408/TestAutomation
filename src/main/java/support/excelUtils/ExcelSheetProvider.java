package support.excelUtils;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

@Slf4j
public class ExcelSheetProvider {

    public static HashMap<String, String> getExcelDataMap(String excelFilePath, String sheetName) {
        int keyColumn=1;
        int valueColumn=2;
        Workbook workbook;
        HashMap<String, String> dataMap = null;
        {
            try {
                workbook = WorkbookFactory.create(new File(excelFilePath));
                Sheet sheet = workbook.getSheet(sheetName);
                DataFormatter dataFormatter = new DataFormatter();
                Iterator<Row> rowIterator = sheet.iterator();
                dataMap = new HashMap<String, String>();
                String key = null;
                String value = null;
                while (rowIterator.hasNext()) {
                    Row nextRow = rowIterator.next();
                    Iterator<Cell> cellIterator = nextRow.cellIterator();
                    key = dataFormatter.formatCellValue(nextRow.getCell(keyColumn));
                    value = dataFormatter.formatCellValue(nextRow.getCell(valueColumn));
                    dataMap.put(key, value);
                }

                workbook.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } 
        return dataMap;
    }
}

package com.ea.framework.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import com.sun.deploy.cache.CacheEntry;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import static sun.security.krb5.Confounder.intValue;

public class ExcelUtil {
    static Sheet wrksheet;
    static Workbook workbook = null;
    static Hashtable dict = new Hashtable();


    //Create a Constructor
    public ExcelUtil(String ExcelSheetPath) throws BiffException, IOException {
        workbook = Workbook.getWorkbook(new File(ExcelSheetPath));
        wrksheet = workbook.getSheet("Sheet1");
    }

    //Return the no of rows
    public static int RowCount() {
        return wrksheet.getRows();
    }

    //Return the cell value by taking row & column as an argumemnt
    public static String ReadCell(int column, int row) {
        return wrksheet.getCell(column, row).getContents();
    }

    //Create Column Dictionary to hold all the column names
    public static void ColumnDictionary() {
        //Iterate through all teh columns in the Excel Sheet & store the value in Hashtable
        for (int col = 0; col < wrksheet.getColumns(); col++) {
            dict.put(ReadCell(col, 0), col);
        }
    }

    //Read column names
    public static int GetCell(String colName) {
        try {
            int value;
            value = ((Integer) dict.get(colName)).intValue();
            return value;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
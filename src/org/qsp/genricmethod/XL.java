package org.qsp.genricmethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XL {
	public static int getRowCount(String path, String sheet)
			throws EncryptedDocumentException, FileNotFoundException, IOException {
		int rc = -1;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			rc = wb.getSheet(sheet).getLastRowNum();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rc;
	}

	public static int getCellCount(String path, String sheet)
			throws EncryptedDocumentException, FileNotFoundException, IOException {
		int cc = -1;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			cc = wb.getSheet(sheet).getRow(0).getLastCellNum();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cc;
	}

	public static String getdata(String path, String sheet, int r, int c)
			throws EncryptedDocumentException, FileNotFoundException, IOException {
		String v = " ";
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			v = wb.getSheet(sheet).getRow(r).getCell(c).toString();
			System.out.println("Cell Value " + v);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return v;
	}

}

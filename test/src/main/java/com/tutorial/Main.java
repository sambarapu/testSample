package com.tutorial;

import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.SpreadsheetMLPackage;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        System.out.println("In Main");
        File file = new File("/Users/NIS1521m/Downloads/demo 20/src/main/resources/ExcelBook.xlsx");
        SpreadsheetMLPackage excelMLPackage = null;
        try {
            excelMLPackage = SpreadsheetMLPackage.load(file);
            excelMLPackage.save(new File("ExcelBook.xml"));
        } catch (Docx4JException e) {
            e.printStackTrace();
        }
        System.out.println("created XML");
    }
}

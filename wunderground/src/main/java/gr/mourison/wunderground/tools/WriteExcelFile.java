package gr.mourison.wunderground.tools;

import gr.mourison.wunderground.domain.FinalResponse;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;


import java.util.List;


public class WriteExcelFile {

    public static void writeStudentsListToExcel(List<FinalResponse> resultList, String path) {


        Workbook workbook = new XSSFWorkbook();

        Sheet resultsSheet = workbook.createSheet("Students");

        int rowIndex = 0;

        for (FinalResponse response : resultList) {

            Row row = resultsSheet.createRow(rowIndex++);

            int cellIndex = 0;

            row.createCell(cellIndex++).setCellValue(response.getMaxhumidity());

            row.createCell(cellIndex++).setCellValue(response.getMaxtempm());

            row.createCell(cellIndex++).setCellValue(response.getMintempm());

            row.createCell(cellIndex++).setCellValue(response.getPrecipm());
        }

        try {

            FileOutputStream fos = new FileOutputStream(path);

            workbook.write(fos);

            fos.close();


            System.out.println(path + " is successfully written");

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}

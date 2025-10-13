package TestNG;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.Properties;

public class dataProvider_ {

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{{"First-Value"}, {"Second-Value"}};
    }

    @Test(dataProvider = "data-provider")
    public void myTest(String val) {
        System.out.println("Passed Parameter Is : " + val);
    }


    @DataProvider(name = "data-provider-multi")
    public Object[][] dpMMethod() {
        return new Object[][]{
                {2,3,5},
                {6,7,8}
        };
    }

    @Test(dataProvider = "data-provider-multi")
    public void myMTest(int a,int b,int c) {

        System.out.println("Passed Parameter Is : " + a +"" + b + "" + c);
    }


    @DataProvider(name = "data-provider-multi_aa")
    public Object[][] dpMaaMethod() {
        Object [][] twitterdata=new Object[2][2];
        twitterdata[0][0]=1;
        twitterdata[0][1]=2;
        twitterdata[1][0]=3;
        twitterdata[1][1]=4;
        return  twitterdata;
    }

    @Test(dataProvider = "data-provider-multi_aa")
    public void myMaaTest(int a,int b) {

        System.out.println("Passed Parameter Is : " + a +"" + b );
    }


    @Test
    public void geekforgeeks() throws IOException, InterruptedException, FileNotFoundException {
        File file=new File("C:\\Users\\amitg\\SeleniumProjects\\Selenium_Project\\src\\test\\java\\TestNG\\My.properties");

        FileInputStream reader= new FileInputStream(file);
        Properties props=new Properties();

        props.load(reader);
        System.out.println(props.getProperty("url"));

    }

    @Test ///XSSFWorkbook latest HSSFWorkbook----old
    public void xlread() throws IOException, InterruptedException, FileNotFoundException {
        File file = new File("C:\\Users\\amitg\\SeleniumProjects\\Selenium_Project\\src\\test\\java\\TestNG\\My.xls");
        FileInputStream reader = new FileInputStream(file);
        HSSFWorkbook workbook = new HSSFWorkbook(reader);
        HSSFSheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println(sheet.getRow(0).getCell(0));

/////////////
        String path = "D://DemoFile.xlsx";
        File file1 = new File(path);
        Workbook wb = new HSSFWorkbook();
        Sheet sheet1 = (Sheet) wb.createSheet("abc");
        Row headerRow = sheet.createRow(0);
        cell.setCellValue("WriteintoExcel");

        FileOutputStream fos = new FileOutputStream(path);
        wb.write(fos);
        fos.close();
    }
}

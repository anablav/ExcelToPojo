package com.example.exceltopojo.utils;
/*
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.exceltopojo.model.Employee;
//import org.apache.commons.io.IOUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.jxls.reader.ReaderBuilder;
import org.jxls.reader.ReaderConfig;
import org.jxls.reader.XLSReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException; */

public class ExcelProcessor {

    //private static Logger logger = LoggerFactory.getLogger(ExcelProcessor.class);
/*
    public List<Employee> parseExcelFile() throws Exception{
        final List<Employee> employeeList = new ArrayList<Employee>();
        InputStream xmlMapping = new BufferedInputStream(ExcelProcessor.class.getClassLoader().getResourceAsStream("employee.xml"));
        ReaderConfig.getInstance().setUseDefaultValuesForPrimitiveTypes(true);
        ReaderConfig.getInstance().setSkipErrors(true);
        InputStream inputXLS;
        try{
            XLSReader mainReader = ReaderBuilder.buildFromXML(xmlMapping);
            inputXLS = getClass()
                    .getClassLoader().getResourceAsStream("employee.xlsx");
            final Map<String, Object> beans = new HashMap<String, Object>();
            beans.put("employeeList", employeeList);
            mainReader.read(inputXLS, beans);
            System.out.println("Employee data are extracted successfully from the Excel file, number of Employees is: "+employeeList.size());
        } catch(java.lang.OutOfMemoryError ex){
            // Case of a very large file that exceed the capacity of the physical memory
               ex.printStackTrace();
            throw new Exception(ex.getMessage());
        } catch (IOException ex) {
            logger.error(ex.getMessage());
            throw new Exception(ex.getMessage());
        } catch (SAXException ex) {
            logger.error(ex.getMessage());
            throw new Exception(ex.getMessage());
        } catch (InvalidFormatException ex) {
            logger.error(ex.getMessage());
            throw new Exception(ex.getMessage());
        } finally {
            //closeInputStream(inputXLS);
        }
        return employeeList;
    }

    private void closeInputStream(final InputStream inputStream){
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (final IOException e) {
                logger.warn(e.getMessage(), e);
                //IOUtils.closeQuietly(inputStream);
            }
        }
    }*/

}
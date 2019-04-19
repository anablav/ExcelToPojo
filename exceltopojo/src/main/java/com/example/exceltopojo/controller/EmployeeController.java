package com.example.exceltopojo.controller;

import com.example.exceltopojo.model.Employee;
import com.example.exceltopojo.model.PaymentsAccount;
import org.osgl.xls.ExcelReader;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.util.List;

@RestController
public class EmployeeController {

    /*

    @GetMapping("/test")
    public List<Employee> readExcel() throws SpreadsheetReadException {
        InputStream inputStream = getClass()
                .getClassLoader().getResourceAsStream("employee.xlsx");
        final XlsxReader reader = new XlsxReader();
        List<Employee> employees = reader.read(Employee.class, inputStream);
        return employees;
    }

    @GetMapping("/testpa")
    public List<PaymentsAccount> readExcelPa() throws SpreadsheetReadException {
        InputStream inputStream = getClass()
                .getClassLoader().getResourceAsStream("null_scr_manual_fix_sc_040219.xls");
        final XlsReader reader = new XlsReader();
        List<PaymentsAccount> paymentsAccountList = reader.read(PaymentsAccount.class, inputStream);
        return paymentsAccountList;
    }

    @GetMapping("/testJXLS")
    public List<Employee> readExcelJXLS() throws Exception {
        ExcelProcessor ep = new ExcelProcessor();
        return ep.parseExcelFile();
    }*/

    @GetMapping("/testExcelReader")
    public List<Employee> readExcelReader() {
        InputStream inputStream = getClass()
                .getClassLoader().getResourceAsStream("employee.xlsx");
        ExcelReader reader = ExcelReader.builder()
                .map("streetname").to("address.streetname")
                .inputStream(inputStream, true)
                .build();
        List<Employee> employees = reader.read(Employee.class);
        return employees;
    }

    @GetMapping("/testpa")
    public List<PaymentsAccount> readExcelPa() {
        InputStream inputStream = getClass()
                .getClassLoader().getResourceAsStream("null_scr_manual_fix_sc_040219.xls");
        ExcelReader reader = ExcelReader.builder()
                .map("processingThreshold").to("riskProfile.processingThreshold")
                .map("segmentName").to("riskProfile.segmentName")
                .inputStream(inputStream, false)
                .build();
        List<PaymentsAccount> paList = reader.read(PaymentsAccount.class);
        System.out.println("Total Records read : " + paList.size());
        return paList;
    }
}

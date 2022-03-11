package com.company;

import com.company.inner.HDD;
import com.company.interfaces.Bus;
import com.company.interfaces.Car;
import com.company.test.*;

import java.time.LocalDateTime;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Document goodsContract = new GoodsContract("111--111", "type", 12.5, new Date());
        Date finishDate = new Date();
        Document employeeContract = new EmployeeContract("222--222", new Date(), finishDate, "Fasya");
        Document invoice = new Invoice(100.00, new Date(), "333--33", "322");
        Registr registr = new Registr();

        registr.save(goodsContract);
        registr.save(employeeContract);
        registr.save(invoice);
        registr.print();

    }
}

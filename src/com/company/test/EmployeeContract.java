package com.company.test;

import java.util.Date;

public class EmployeeContract extends AbstractDocument implements Document{
    public Date finishDate;
    public String employeeName;

    public EmployeeContract() {
    }

    public EmployeeContract(String number, Date date, Date finishDate, String employeeName) {
        super(number, date);
        this.finishDate = finishDate;
        this.employeeName = employeeName;
    }

    @Override
    public void print() {
        System.out.println("EmployeeContract{" +
                "number='" + number + '\'' +
                ", date=" + date +
                ", finishDate=" + finishDate +
                ", employeeName='" + employeeName + '\'' +
                '}');
    }
}

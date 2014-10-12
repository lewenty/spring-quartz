package com.company.service.impl;

import com.company.service.MailReportService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by levent.yildiz on 12.10.2014.
 */
public class MailReportServiceImpl implements MailReportService {
    @Override
    public void mailSend() {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        String strDate = dateFormat.format(calendar.getTime());

        //TODO : development
        //Mail gönderme işlemi burada yapılacak
        System.out.println("Mail Gonderiliyor.." + strDate);
    }
}

package com.company.service.impl;

import com.company.service.MailReportService;

/**
 * Created by levent.yildiz on 12.10.2014.
 */
public class MailReportServiceImpl implements MailReportService {
    @Override
    public void mailSend() {
        System.out.println("Gonderiliyor..");
    }
}

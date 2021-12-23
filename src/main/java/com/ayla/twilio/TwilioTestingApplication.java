package com.ayla.twilio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwilioTestingApplication {

    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "a41XXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String FROM = "1XXXXXXXXXXXX";
    public static final String TO = "+91XXXXXXXXX";


    public static void main(String[] args) {
        SpringApplication.run(TwilioTestingApplication.class, args);

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber(TO),
                new PhoneNumber(FROM),
                "This is Testing meessage from ayla networks").create();

        System.out.println(message.getSid());

    }

}

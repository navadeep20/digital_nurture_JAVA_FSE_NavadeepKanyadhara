package com.cognizant.decorator;

public class DecoratorTest {

    public static void main(String[] args) {

        System.out.println("Email Notification");
        Notifier email = new EmailNotifier();
        email.send("Payment Successful");

        System.out.println();

        System.out.println("Email + SMS Notification");
        Notifier sms = new SMSNotifierDecorator(new EmailNotifier());
        sms.send("Payment Successful");

        System.out.println();

        System.out.println("Email + SMS + Slack Notification");
        Notifier slack = new SlackNotifierDecorator(
                new SMSNotifierDecorator(new EmailNotifier()));

        slack.send("Payment Successful");
    }

}
package com.design.prototype.mail;

public class Client {
    static int count = 10;

    public static void main(String[] args) {
        Mail mail = new Mail(new AdvTemplate());
        for (int i = 0; i < count; i++) {
            Mail cloneMail;
            try {
                cloneMail = mail.clone();
                cloneMail.setReceiver("уе" + i);
                System.out.println(cloneMail.getReceiver() + ":" + cloneMail.getContext());
            } catch (CloneNotSupportedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

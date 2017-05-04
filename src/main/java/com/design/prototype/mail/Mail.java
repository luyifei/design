package com.design.prototype.mail;

public class Mail implements Cloneable{
    // �ռ���
    private String receiver;
    // �ʼ�����
    private String subject;
    // ��ν
    private String appellation;
    // �ʼ�����
    private String context;
    // �ʼ���β��
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
    
    @Override
    protected Mail clone() throws CloneNotSupportedException {
        Mail mail = null;
        mail = (Mail) super.clone();
        return mail;
    }

}

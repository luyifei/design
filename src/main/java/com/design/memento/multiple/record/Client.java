package com.design.memento.multiple.record;

public class Client {

    public static void main(String[] args) {
        // Î¬»¤¶à¸ö°æ±¾µÄ±¸ÍüÂ¼Ä£Ê½
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("before...");
        System.out.println("Ô­Ê¼×´Ì¬£º" + originator.getState());
        caretaker.setMemento("1", originator.createMemento());
        originator.setState("after");
        System.out.println("version:1×´Ì¬£º" + originator.getState());
        caretaker.setMemento("2", originator.createMemento());
        originator.setState("after2");
        System.out.println("version:2×´Ì¬£º" + originator.getState());
        originator.restoreMemento(caretaker.getMemento("1"));
        System.out.println("»Ö¸´version:1×´Ì¬£º" + originator.getState());
        originator.restoreMemento(caretaker.getMemento("2"));
        System.out.println("»Ö¸´version:2×´Ì¬£º" + originator.getState());
    }

}

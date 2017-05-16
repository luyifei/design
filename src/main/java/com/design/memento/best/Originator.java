package com.design.memento.best;

/**
 * �����˽�ɫ
 * 
 * @author User
 *
 */
public class Originator {
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * ����һ������¼
     * 
     * @return
     */
    public Memento createMemento() {
        return new Memento(this.state);
    }

    /**
     * �ָ�һ������¼
     * 
     * @param memento
     */
    public void restoreMemento(IMemento memento) {
        this.setState(((Memento) memento).getState());
    }

    private class Memento implements IMemento {
        private String state = "";

        public Memento(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }

        private void setState(String state) {
            this.state = state;
        }
    }

}

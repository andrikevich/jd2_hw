package it.academy.module2.entity;

import java.io.Serializable;
import java.util.Objects;

public class Expense implements Serializable {

    private int num;
    private String paydate;
    private float value;
    private int receiverNum;

    public Expense() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate(String paydate) {
        this.paydate = paydate;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getReceiverNum() {
        return receiverNum;
    }

    public void setReceiverNum(int receiverNum) {
        this.receiverNum = receiverNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expense expense = (Expense) o;
        return num == expense.num && Float.compare(expense.value, value) == 0 && receiverNum == expense.receiverNum && Objects.equals(paydate, expense.paydate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, paydate, value, receiverNum);
    }

    @Override
    public String toString() {
        return "Expense{" +
                "num=" + num +
                ", paydate='" + paydate + '\'' +
                ", value=" + value +
                ", receiverNum=" + receiverNum +
                '}';
    }
}

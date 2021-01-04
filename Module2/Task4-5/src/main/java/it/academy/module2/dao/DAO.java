package it.academy.module2.dao;

import it.academy.module2.entity.Expense;
import it.academy.module2.entity.Receiver;

import java.util.ArrayList;

public interface DAO {
Receiver getReceiver (int num);
ArrayList<Receiver> getReceivers();
Expense getExpense (int num);
ArrayList<Expense> getExpenses();
int addReceiver(Receiver receiver);
int addExpense (Expense expense);

}

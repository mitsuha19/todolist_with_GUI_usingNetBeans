package service;

import javax.swing.JFrame;
import javax.swing.JTable;


public interface TodolistService {
     void showTodoList(JTable tblTodo);

     void addTodoList(String todo);

    void removeTodoList(Integer number);

     void changeTodoList(Integer number, String todo);

     void SearchTodoList(String keyword);

     void sortingTodoList(boolean ascending);
}

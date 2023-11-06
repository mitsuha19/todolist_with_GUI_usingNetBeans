package service;

import java.util.ArrayList;

import entity.Todolist;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import repository.TodolistRepository;

public class TodolistServiceImpl implements TodolistService {
    private TodolistRepository todolistRepository;

    public TodolistServiceImpl(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public void showTodoList(JTable tblTodo) {
        ArrayList<Todolist> model = todolistRepository.getAll();
        
        DefaultTableModel tableModel1 = new DefaultTableModel(null, new Object[]{"No", "Todo"}){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        
        if (!model.isEmpty()) {
            for (var i = 0; i < model.size(); i++) {
              var todolist = model.get(i);
              var no = i + 1;

              if (todolist != null) {
                  tableModel1.addRow(new Object[]{no, todolist.getTodo()});
              }
            }
        } 
        
        tblTodo.setModel(tableModel1);
        tblTodo.setCellSelectionEnabled(false);
        tblTodo.setRowSelectionAllowed(true);
        tblTodo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblTodo.setRowHeight(40);
        
        TableColumnModel columnModel = tblTodo.getColumnModel();
        
        TableColumn columnNo = columnModel.getColumn(0);
        columnNo.setPreferredWidth(70);
        
        TableColumn columnTodo = columnModel.getColumn(1);
        columnTodo.setPreferredWidth(371 - 70);
    }

    @Override
    public void addTodoList(String todo) {
        Todolist todolist = new Todolist(todo);

        if (todo.length() < 6 ) {
            System.out.println("GAGAL MENAMBAH TODO : " + todo + ". Panjang karakter minimal 6.");
        } else {
            todolistRepository.add(todolist);
            System.out.println("SUKSES MENAMBAH TODO : " + todolist.getTodo());
        }
        
    }

    @Override
    public void removeTodoList(Integer number) {
        boolean success = todolistRepository.remove(number);
        if (success) {
            System.out.println("SUKSES MENGHAPUS TODO : posisi ke-" + number);
        } else {
            System.out.println("GAGAL MENGHAPUS TODO : " + number);
        }
    }

    @Override
    public void changeTodoList(Integer number, String todo) {
        Todolist todolist = new Todolist(todo);
        boolean success = todolistRepository.change(number, todolist);
        if (success) {
            System.out.println("SUKSES MENGUBAH TODO : posisi ke-" + number + " menjadi " + todolist.getTodo());
        } else if(!success && todo.length() < 6) {
            System.out.println("GAGAL MENGUBAH TODO : posisi ke-" + number + " menjadi " + todolist.getTodo() + ". Panjang karakter minimal 6.");
        } else {
            System.out.println("GAGAL MENGUBAH TODO : posisi ke-" + number + " menjadi " + todolist.getTodo() + ". Todo tidak tersedia.");
        }
    }

    @Override
    public void SearchTodoList(String keyword) {
        todolistRepository.search(keyword);
    }

    @Override
    public void sortingTodoList(boolean ascending) {
        todolistRepository.sorting(ascending);
    }
}

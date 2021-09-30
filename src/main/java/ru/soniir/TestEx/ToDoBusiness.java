/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.soniir.TestEx;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author slava
 */
public class ToDoBusiness {
    private ToDoService toDoService;
    
    ToDoBusiness(ToDoService toDoService){
        this.toDoService = toDoService;
    }
    
    public List<String> retrieveTodosRelatedToString(String user){
        List<String> filteredTodos = new ArrayList<String>();
        List<String> allTodos = toDoService.retrieveTodos(user);
        allTodos.forEach(t->{
            if(t.contains("Spring")){
                filteredTodos.add(t);
            }
        });
        return filteredTodos;
    }
}

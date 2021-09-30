/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.soniir.TestEx;

import java.util.List;

/**
 *
 * @author slava
 */
public interface ToDoService {
    public List<String> retrieveTodos(String user);
    
}

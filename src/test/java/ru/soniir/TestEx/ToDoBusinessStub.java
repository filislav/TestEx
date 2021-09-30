/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.soniir.TestEx;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author slava
 */
public class ToDoBusinessStub implements ToDoService{
    
    public ToDoBusinessStub(){
        System.out.println("ToDoBusinessStab creating");
    }
    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Learn Spring","Spring it is cool","Learn Dance");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.soniir.TestEx;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slava
 */
public class ToDoBusinessTest {
    ToDoService toDoService = new ToDoBusinessStub();
    
    public ToDoBusinessTest() {
    }

    @Test
    public void testRetrieveTodosRelatedToString() {
        ToDoBusiness toDoBusiness = new ToDoBusiness(toDoService);
        List<String> todos = toDoBusiness.retrieveTodosRelatedToString("Spring");
        assertEquals(2, todos.size());
    }
    
}

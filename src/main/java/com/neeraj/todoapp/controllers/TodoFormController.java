package com.neeraj.todoapp.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.neeraj.todoapp.models.TodoTask;
import com.neeraj.todoapp.repositories.TodoTaskRepository;

@Controller
public class TodoFormController {
   
    @Autowired
    private TodoTaskRepository todoTaskRepository;

    @GetMapping("/create-todo")
    public String showCreateForm(TodoTask todoTask){
        return "add-todo-task";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        TodoTask todoTask = todoTaskRepository
        .findById(id)
        .orElseThrow(() -> new IllegalArgumentException("TodoTask id: " + id + " not found"));
   
        model.addAttribute("todo", todoTask);
        return "update-todo-task";
    }

    @GetMapping("/delete/{id}")
    public String deleteTodoItem(@PathVariable("id") long id, Model model) {
        TodoTask todoTask = todoTaskRepository
        .findById(id)
        .orElseThrow(() -> new IllegalArgumentException("TodoTask id: " + id + " not found"));
   
        todoTaskRepository.delete(todoTask);
        return "redirect:/";
    }

   
}
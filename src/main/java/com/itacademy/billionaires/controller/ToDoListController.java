package com.itacademy.billionaires.controller;

import com.itacademy.billionaires.model.entity.Task;
import com.itacademy.billionaires.model.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="todolist")
public class ToDoListController {
    @Autowired
    private ITaskService taskService;

    @GetMapping(value="tasks")
    public List<Task> getTasks() {
        return taskService.getTask();
    }



}

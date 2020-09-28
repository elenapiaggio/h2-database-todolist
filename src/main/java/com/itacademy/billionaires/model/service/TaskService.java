package com.itacademy.billionaires.model.service;

import com.itacademy.billionaires.model.entity.ITaskDao;
import com.itacademy.billionaires.model.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements ITaskService {

    @Autowired
    private ITaskDao taskDao;

    /**
     * Method to get all the task
     * @return
     */
    public List<Task> getTask() {
        return (List<Task>) taskDao.findAll();
    }
}

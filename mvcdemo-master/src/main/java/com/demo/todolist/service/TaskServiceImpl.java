package com.demo.todolist.service;

import com.demo.todolist.bean.Task;
import com.demo.todolist.dao.TaskDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskDao taskDao;

    @Override
    public boolean addTask(Task task) {
        boolean flag = false;
        try {
            taskDao.addTask(task);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateTask(Task task) {
        boolean flag = false;
        try {
            taskDao.updateTask(task);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteTask(Task task) {
        boolean flag = false;
        try {
            taskDao.deleteTask(task);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Task searchTaskById(int taskId) {
        return taskDao.searchTaskById(taskId);
    }

    @Override
    public List<Task> searchAll() {
        return taskDao.searchAll();
    }
}

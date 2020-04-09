package com.demo.todolist.controller;

import com.demo.todolist.bean.Task;
import com.demo.todolist.service.TaskService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/tasks")
public class TaskController {
    public TaskService taskService;

    @RequestMapping(value = "/tasks", method = RequestMethod.POST)
    public boolean addTask(Task task){
        System.out.println("adding...");
        return taskService.addTask(task);
    }

    @RequestMapping(value = "/tasks", method = RequestMethod.PUT)
    public boolean updateTask(Task task){
        System.out.println("updating...");
        return taskService.updateTask(task);
    }

    @RequestMapping(value = "/tasks", method = RequestMethod.DELETE)
    public boolean deleteTask(Task task){
        System.out.println("deleting...");
        return taskService.deleteTask(task);
    }

    @RequestMapping(value = "/tasks/#id", method = RequestMethod.GET)
    public Task searchByTaskId(@RequestParam(value = "taskId",required = true) int taskId){
        System.out.println("searching...");
        return taskService.searchTaskById(taskId);
    }

    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public List<Task> searchAll() {
        System.out.println("searching...");
        return taskService.searchAll();
    }


}

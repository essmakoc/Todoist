package com.vitelco.todoist.controller;

import com.vitelco.todoist.exception.NotFoundException;
import com.vitelco.todoist.model.Task;
import com.vitelco.todoist.model.User;
import com.vitelco.todoist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    @ResponseBody
    public List<Task> findAll(){
        return taskService.findALL();
    }

    @GetMapping("/{id}")
    public Task findById(@PathVariable Long id){
        User user = User.builder().id(1l).age(25).email("esma@gmail.com").firstName("Esma").lastName("Koc").build();
        Task task = Task.builder().id(1l).category(Task.Category.WORK).createdDate(LocalDateTime.now()).assignedUser(user).title("Egitim").build();
        return task;
        //return taskService.findById(id).orElseThrow(NotFoundException::new);
    }


    @PostMapping
    @ResponseBody
    public Task createUser(@RequestBody Task task){
        return taskService.save(task);
    }
}

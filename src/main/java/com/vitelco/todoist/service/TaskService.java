package com.vitelco.todoist.service;

import com.vitelco.todoist.model.Task;
import com.vitelco.todoist.model.User;

import java.util.List;
import java.util.Optional;

public interface TaskService {

    List<Task> findALL();
    Task save(Task task);
    Optional<Task> findById(Long id);
}

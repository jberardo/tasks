package ca.berardo.maja.tasks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.berardo.maja.tasks.model.Task;
import ca.berardo.maja.tasks.service.TaskService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/tasks")
public class TaskController {

  private final TaskService taskService;

  @GetMapping({ "", "/" })
  public Iterable<Task> listTasks() {
    return taskService.list();
  }

  @PostMapping({ "", "/" })
  public Task save(@RequestBody Task task) {
    return taskService.save(task);
  }
}
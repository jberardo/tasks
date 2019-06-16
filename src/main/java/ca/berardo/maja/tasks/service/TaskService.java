package ca.berardo.maja.tasks.service;

import ca.berardo.maja.tasks.model.Task;

public interface TaskService {

  Iterable<Task> list();
  Task save(Task task);
}
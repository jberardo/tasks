package ca.berardo.maja.tasks.service;

import org.springframework.stereotype.Service;

import ca.berardo.maja.tasks.model.Task;
import ca.berardo.maja.tasks.repository.TaskRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

  private final TaskRepository taskRepository;

  @Override
  public Iterable<Task> list() {
    return taskRepository.findAll();
  }

  @Override
  public Task save(Task task) {
    return taskRepository.save(task);
  }
}
package ca.berardo.maja.tasks.repository;

import org.springframework.data.repository.CrudRepository;

import ca.berardo.maja.tasks.model.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
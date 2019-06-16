package ca.berardo.maja.tasks.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class Task {
  
  @Id
  @GeneratedValue
  private Long id;

  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate dueDate;

  private String name;
  private Boolean completed;

}
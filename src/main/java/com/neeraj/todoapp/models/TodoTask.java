package com.neeraj.todoapp.models;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "todo_task")
public class TodoTask {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Setter
private Long id;

@Getter
@Setter
@NotBlank(message = "Description is required")
private String description;

@Getter
@Setter
private boolean complete;

@Getter
@Setter
private Instant createdDate;

@Getter
@Setter
private Instant modifiedDate;

public TodoTask() {
}

public TodoTask(String description) {
this.description = description;
this.complete = false;
this.createdDate = Instant.now();
this.modifiedDate = Instant.now();
}

@Override
public String toString() {
return String.format("TodoTask{id=%d, description='%s', complete='%s', createdDate='%s', modifiedDate='%s'}",
id, description, complete, createdDate, modifiedDate);
}

public void setCreatedDate(Instant now) {
this.createdDate = now;

}

public void setModifiedDate(Instant now) {
this.modifiedDate = now;

}

public void setId(long id) {
this.id = id;

}

}
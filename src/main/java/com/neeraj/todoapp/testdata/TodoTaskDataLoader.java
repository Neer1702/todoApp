package com.neeraj.todoapp.testdata;

import com.neeraj.todoapp.models.TodoTask;
import com.neeraj.todoapp.repositories.TodoTaskRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TodoTaskDataLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(TodoTaskDataLoader.class);

    @Autowired
    TodoTaskRepository todoTaskRepository;

    @Override
    public void run(String... args) throws Exception {
        loadSeedData();
    }

    private void loadSeedData() {
        if (todoTaskRepository.count() == 0) {
            TodoTask todoTask1 = new TodoTask("Schedule the meeting.");
            TodoTask todoTask2 = new TodoTask("Go through pre=requisites.s");

            todoTaskRepository.save(todoTask1);
            todoTaskRepository.save(todoTask2); 
        }

        logger.info("Number of TodoTasks: {}", todoTaskRepository.count());
    }
    
}

package com.eco.todo.repository;

import com.eco.todo.model.todoitem.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem, UUID> {
    TodoItem findByTitle(String title);
    List<TodoItem> findByCompletedFalseAndTitle(String title);
    List<TodoItem> findByTitleContaining(String containiString);
    List<TodoItem> findByCompletedFalse();
}
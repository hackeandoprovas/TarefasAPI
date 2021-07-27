package com.hackeandoprovas.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackeandoprovas.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}

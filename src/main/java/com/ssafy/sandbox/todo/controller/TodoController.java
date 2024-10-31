package com.ssafy.sandbox.todo.controller;

import com.ssafy.sandbox.exception.BadRequestException;
import com.ssafy.sandbox.todo.dto.TodoDto;
import com.ssafy.sandbox.todo.dto.TodoListResponse;
import com.ssafy.sandbox.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @GetMapping()
    public ResponseEntity<TodoListResponse> listAllTodos(){
        return ResponseEntity.ok().body(todoService.getTodos());
    }

    @PostMapping()
    public ResponseEntity<TodoDto> createTodo(@RequestBody TodoDto todoDto){
//      content가 null이거나 비어있는 문자열일 경우 error 발생
        if(todoDto.getContent() == null || todoDto.getContent().isEmpty()){
              throw new BadRequestException("요청이 정상적으로 처리되지 않았습니다.");
        }

        return ResponseEntity.ok().body(todoService.createTodo(todoDto));
    }

    @DeleteMapping("/{todoId}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Long todoId){
        todoService.deleteTodo(todoId);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{todoId}")
    public ResponseEntity<Void> updateTodo(@PathVariable Long todoId){
        todoService.updateTodo(todoId);
        return ResponseEntity.ok().build();
    }
}

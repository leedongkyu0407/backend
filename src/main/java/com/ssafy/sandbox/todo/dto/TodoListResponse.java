package com.ssafy.sandbox.todo.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
public class TodoListResponse {
    private List<TodoDto> todos;

    public static TodoListResponse of(List<TodoDto> todos){
        return TodoListResponse.builder()
                .todos(todos)
                .build();
    }
}

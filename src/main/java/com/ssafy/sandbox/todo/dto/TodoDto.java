package com.ssafy.sandbox.todo.dto;

import com.ssafy.sandbox.todo.domain.Todo;
import lombok.Builder;
import lombok.Getter;

@Getter
public class TodoDto {

    private Long id;
    private String content;
    private boolean completed;

    @Builder
    private TodoDto(Long id, String content, boolean completed) {
        this.id = id;
        this.content = content;
        this.completed = completed;
    }

    public static TodoDto from(Todo todo){
        return TodoDto.builder()
                .id(todo.getId())
                .content(todo.getContent())
                .completed(todo.isCompleted())
                .build();
    }
}

package com.ssafy.sandbox.todo.domain;

import com.ssafy.sandbox.todo.dto.TodoDto;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="todos")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String content;
    @Column(name = "completed")
    private boolean completed;

    public static Todo from(TodoDto todoDto){
        return Todo.builder()
                .id(todoDto.getId())
                .content(todoDto.getContent())
                .completed(todoDto.isCompleted())
                .build();
    }

    public void toggleTodo(){
        this.completed = !this.completed;
    }

}

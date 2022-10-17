package todo.todoList.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ListTodoDto {

    private Long listId;

    private String todo_name;

    private boolean completed;
}

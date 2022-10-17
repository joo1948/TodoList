package todo.todoList.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import todo.todoList.entity.Converter.BooleanToYNConverter;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name="list")
public class Todolist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long listId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="todoId")
    private Todo todo;

    @Convert(converter = BooleanToYNConverter.class)
    private boolean compelted;
}

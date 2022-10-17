package todo.todoList.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import todo.todoList.entity.ListTodo;

public interface ListTodoRepository extends JpaRepository<ListTodo, Long> {

}

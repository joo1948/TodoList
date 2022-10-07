package todo.todoList.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.todoList.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}

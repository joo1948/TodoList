package todo.todoList.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import todo.todoList.entity.Todo;

public interface MemberRepository extends JpaRepository<Todo, Long> {

}

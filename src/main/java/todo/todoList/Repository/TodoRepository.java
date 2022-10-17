package todo.todoList.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import todo.todoList.entity.Member;

public interface TodoRepository extends JpaRepository<Member,Long> {


}

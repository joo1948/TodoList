package todo.todoList.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.todoList.entity.Todolist;

@Repository
public interface TodoListRepository extends JpaRepository<Todolist, Long> {

}

package todo.todoList.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.todoList.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}

package todo_mvc.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo_mvc.entity.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,Integer> {
}

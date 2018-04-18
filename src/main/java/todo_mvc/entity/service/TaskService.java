package todo_mvc.entity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todo_mvc.entity.dao.TaskRepository;
import todo_mvc.entity.model.Task;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll() {
        List<Task> tasks = new ArrayList<>();
        for (Task task : taskRepository.findAll()) {
            tasks.add(task);
        }
        return tasks;
    }

    public Task find(int id){
        return taskRepository.findOne(id);
    }

    public void save(Task task) {
        taskRepository.save(task);
    }

    public void delete(int id) {
        taskRepository.delete(id);
    }
}

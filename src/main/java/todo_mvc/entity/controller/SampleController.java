package todo_mvc.entity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import todo_mvc.entity.service.TaskService;

@RestController
public class SampleController {

	@Autowired
	private TaskService taskService;

	@GetMapping("/hello")
	public String hello(){
		return "Hello World!!!";
	}

//	@GetMapping("/all-tasks")
//	public String allTasks(){
//		return taskService.findAll().toString();
//	}
//
//	@GetMapping("/save-task")
//	public String saveTask(@RequestParam String name, @RequestParam String desc){
//		Task task = new Task(name, desc, new Date(), false);
//		taskService.save(task);
//		return "Task saved!";
//	}
//
//	@GetMapping("/delete-task")
//	public String saveTask(@RequestParam int id){
//		taskService.delete(id);
//		return "Task deleted!";
//	}
}
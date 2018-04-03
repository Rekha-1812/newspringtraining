package bootsample.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import bootsample.dao.TaskRepository;
import bootsample.model.Task;

@Service
@Transactional
public class TaskService {

	private final TaskRepository taskRepository;

	public TaskService(TaskRepository taskRepository) {
		super();
		this.taskRepository = taskRepository;
	}
public List<Task> findAll(){
	List<Task> tasks=new ArrayList<>();
	for(Task t:taskRepository.findAll()) {
		tasks.add(t);
	}
	return tasks;
}
public void save(Task task) {
	taskRepository.save(task);
}
public void delete(int id) {
	taskRepository.deleteById(id);
}
}

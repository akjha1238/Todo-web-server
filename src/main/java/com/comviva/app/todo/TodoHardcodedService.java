package com.comviva.app.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	private static List<Todo> todos=new ArrayList();
	private static int idCounter=0;
	
	
	static {
		todos.add(new Todo(++idCounter," Akhi","Description 1",new Date(),false));
		todos.add(new Todo(++idCounter," Akhi","Description 2",new Date(),true));
		todos.add(new Todo(++idCounter," Akhi","Description 3",new Date(),false));
		todos.add(new Todo(++idCounter," Akhi","Description 4",new Date(),true));
		todos.add(new Todo(++idCounter," Akhi","Description 5",new Date(),false));
		todos.add(new Todo(++idCounter," Akhi","Description 6",new Date(),false));
		todos.add(new Todo(++idCounter," Akhi","Description 7",new Date(),true));
		todos.add(new Todo(++idCounter," Akhi","Description 8",new Date(),false));
		todos.add(new Todo(++idCounter," Akhi","Description 9",new Date(),true));
		todos.add(new Todo(++idCounter," Akhi","Description 10",new Date(),false));
		todos.add(new Todo(++idCounter," Akhi","Description 11",new Date(),false));
		todos.add(new Todo(++idCounter," Akhi","Description 12",new Date(),true));
		todos.add(new Todo(++idCounter," Akhi","Description 13",new Date(),false));
		todos.add(new Todo(++idCounter," Akhi","Description 14",new Date(),true));
		todos.add(new Todo(++idCounter," Akhi","Description 15",new Date(),false));
	}

	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo deleteById(long id)
	{
		Todo todo=findById(id);
		if(todo==null) return null;
		if(todos.remove(todo)) {
			return todo;
		}
		return null;
		
	}

	private Todo findById(long id) {
		// TODO Auto-generated method stub
		for(Todo todo:todos) {
			if(todo.getId()==id)
			{
				return todo;
			}
		}
		
		return null;
	}
}

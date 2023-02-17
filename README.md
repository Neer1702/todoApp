Online ToDo List

This application facilitates the managing ToDo task list online on a web interface. The operations that can be performed on the tasks list are :- 
Adding a new task
Updating existing tasks by marking it done
Deleting an existing task


Tech Stack :  

Spring boot Framework 
	Spring Boot Dev Tools
	Lombok
	Spring Web
	Spring Data JPA
H2 Database
Java 17
Thymleaf
Maven 

Project architecture : 

Brief :  The project architecture is more of a rest webservice architecture with endpoints exposed for various tasks which involves navigation through various html pages templates that are responsible for different visual representations of tasks and their completion.


Controller : 
Here controllers have been separated into 2 parts , one that deals with the forms that will be available for view when we perform view, create , update or delete operation, the other one for being the controller containing the apis for performing various tasks on the operation.
TodoFormController.java
TodoItemController.java

Repository : 
The repository for Todo Tasks that extends the CrudRepositoruy to enable the crud operation on the TodoTask Object.
TodoTaskRepository.java

Model : 
The model and its attribute for a task the we will be persisting in the database .
TodoTask.java

Templates : 
3 different html templates the will work in coordination with the endpoints approach and api calls to provide visual representation of operation done through a web interface.

Properties file:
Contains configuration , here DB related configs.

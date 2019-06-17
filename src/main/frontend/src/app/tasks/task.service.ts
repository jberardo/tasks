import { Http } from "@angular/http";
import {EventEmitter, Injectable} from "@angular/core";
import 'rxjs/Rx';
import { Task } from './task.model';

@Injectable()
export class TaskService {

    // event to emit after a new task is added (task-add component onTaskAdd())
    onTaskAdded = new EventEmitter<Task>();

    constructor(private http: Http) {

    }

    getTasks() {
        return this.http.get('/api/v1/tasks').map(response => response.json());
    }

    saveTask(task: Task, checked: boolean) {
        task.completed = checked;
        return this.http.post('/api/v1/tasks', task).map(response => response.json());
    }

    addTask(task: Task) {
        return this.http.post('/api/v1/tasks', task).map(response => response.json());
    }
}
# Spring Boot with Angular

## Spring Boot

Tasks backend app using Java with Spring Boot.

## Angular

### Creating a new Angular project
Run the following commands from the directory *src/main*: `ng new frontend`. <br>
Test with `ng serve` to check if it works.

### Create Angular Component and Sub-Components
```
ng g c tasks
ng g c /tasks/tasks-add
ng g c /tasks/tasks-list
```
<small>Note: `ng g c` is a shortcut for `ng generate component`</small>

### Adding Bootstrap

```
npm install --save popper.js@^1.14.7
npm install --save jquery@1.9.1
npm install --save bootstrap
```

Add `@import "~bootstrap/dist/css/bootstrap.css"` to *style.css*.


### Creating rest service consumer
```
npm install --install @angular/http
npm install rxjs@6 rxjs-compat@6 --save
```
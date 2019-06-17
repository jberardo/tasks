# Spring Boot with Angular

## Introduction

Backend app to create Tasks using Java with Spring Boot.

Simple task component created with Angular.

## Running

Clone this repository:
```
git clone https://github.com/jberardo/tasks-app
cd tasks-app
```

Run the Spring Boot app followed by the angular app:

```
mvn spring-boot:run
npm start
```

## Steps to recreate from scratch

Those are some personal notes on how to create the angular frontend from scratch.

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

Create `proxy-conf.json` and add:

```json
{
  "/api/v1/tasks": {
    "target": "http://10.0.0.50:8080",
    "secure": false
  }
}
```

Then open `package.json` and edit the following line:
```json
{
  ...
  "scripts:" {
    "start": "ng serve --proxy-config proxy-conf.json",
  }
  ...
}
```

To start the frontend app: `npm start`

<small>Docs: https://github.com/angular/angular-cli/blob/master/docs/documentation/stories/proxy.md</small>

## Spring Boot Integration

### Deploying angular app to spring boot `/resources/static`

Install the following packages:
```
npm install --save-dev rimraf
npm install --save-dev mkdirp
npm install --save-dev copyfiles
```

<small>rimraf is the same as `rm -rf` but for node</small>

Add goals to package.json:
```json
  "scripts": {
    ...
    "postbuild": "npm run deploy",
    "predeploy": "rimraf ../resources/static/ && mkdirp ../resources/static",
    "deploy": "copyfiles -f dist/** ../resources/static"
    ...
  },
```

To build, type:
`npm run build`
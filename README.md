# Factory Design Pattern - Practice

## introduction

As we started in the factory design pattern practice, in some cases we dont want to reveal how objects are created in our system, and we solved this by creating a factory that users could turn to directly for the objects they need. But What happens when we have multiple factories of differnts types of objects ? This is the problem that the Abstract factory design pattern has come to solve.

🔹This program will implement drawing operations on shapes under the Design Factoy pattern.

🔹The purpose of the program is to learn to work under the Abstract Factory Design pattern and to understand how to implement it.


## 👨‍💻 Technologies

👉 Java Programming language

## Implementation Remarks

🔹 The program is divided into 5 main parts: 

* An interface that defines the draw operation.
* Concrete classes implementing the same interface, in other words our shapes/rounded shapes. 
* Factory classes to generate shapes based on given information (which shape) .
* Factory producer to genreate factories based on given information (shape type).
* Main - our demo class, to get object of concrete class by passing an information such as type (Passed in string format).

## for any questions

```
if(haveAnyQuestions === true){
    let yourName = ".......", question = ".......";
    sendEmailToMe(yourName, question, odedatias8115@gmail.com);
}
```


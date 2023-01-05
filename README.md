# Payroll Processing System in Java

`PPC is a Payroll solution provider company who manages the payroll of the various companies from small scale to large scale company.`

`PPC accepts the employees data from the client in either plain text format (.txt) or csv (.csv) format to manage the employee life cycle starting from date of onboarding to date of exit.`

---
## Requirements

> Java 11 or above

---

## IDE 
> IntelliJ Idea || STS || Eclipse

---

## Install
- [x]  [Java 11](https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html)
- [x] [IntelliJ Idea](https://www.jetbrains.com/idea/download/#section=windows)
- [x] [STS ](https://spring.io/tools)
- [x] [Eclipse ](https://www.eclipse.org/downloads/)

---

## Framework

For this Payroll Processing System, we are using Collection framework of Java.

---

## Dependencies

In this project we have used following dependencies :-

- JUnit

---


## Directory Structure

```
.
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── deqode
│   │               └── backend2
│   │                   └── innovationM_assignment
│   │                       ├── controller
│   │                       ├── exception
│   │                       ├── mapper
│   │                       ├── model
│   │                       └── service
│   └── test
│       └── java
│           └── com
│               └── deqode
│                   └── backend2
│                       └── innovationM_assignment
└── target
    ├── classes
    │   ├── com
    │   │   └── deqode
    │   │       └── backend2
    │   │           └── innovationM_assignment
    │   │               ├── controller
    │   │               ├── exception
    │   │               ├── mapper
    │   │               ├── model
    │   │               └── service
    │   └── META-INF
    │       └── maven
    │           └── com.deqode.backend2
    │               └── innovationM-assignment
    ├── generated-sources
    │   └── annotations
    ├── generated-test-sources
    │   └── test-annotations
    ├── maven-archiver
    ├── maven-status
    │   └── maven-compiler-plugin
    │       ├── compile
    │       │   └── default-compile
    │       └── testCompile
    │           └── default-testCompile
    ├── surefire-reports
    └── test-classes
        └── com
            └── deqode
                └── backend2
                    └── innovationM_assignment
```
---

## Steps to run the program

1. Import the zip file into your respective IDE.

2.  Check the Java version (11 or above).

3.  Go to Run configurations --> click on arguements and mention the input file name (txt/csv) --> Click on apply

4.  Click RUN.

----

## <details><summary>Field of records</summary>

| Field of Record        | Description|  
| ------------- |:-------------:| 
|SequenceNo     | Sequence number of records in file starting from 1 | 
| EmpID      | Unique Id of employee  |  
| EmpFName | First Name of employee      |    
|EmpLName | Last Name of employee|
|Designation| Post of employee|
|Event| Any one from below table|
| EventDate | Date when this event happened in DD-MM-YYYY format.|
|Notes|Date when this event happened in DD-MM-YYYY format.|
|Value| Value according to the event. Refer the following table. |

<b>Table for the value of the event</b>
| | |          
| ------------- |:-------------:| 
| ONBOARD     | Date of Joining in MM-DD-YYYY format | 
| SALARY      | Salary Amount in USD     |  
| BONUS  |Bonus Amount in USD|
|EXIT| Date of Leaving in MM-DD-YYYY format|
|REIMBURSEMENT| Reimbursement Amount in USD|

</details>

---

## Output of the solutions to the problems

1. Total number of employees in an organization.

2. Month wise following details

    a. Total number of employees joined the organization with employee details like emp id,
designation, name, surname.

    b. Total number of employees exit organization with employee details like name, surname.

3. Monthly salary report in following format

    a. Month, Total Salary, Total employees

4. Employee wise financial report in the following format

    a. Employee Id, Name, Surname, Total amount paid

5. Monthly amount released in following format

    a. Month, Total Amount (Salary + Bonus + REIMBURSEMENT), Total employees

6. Yearly financial report in the following format

    a. Event, Emp Id, Event Date, Event value
    
![IMG_20230105_172252](https://user-images.githubusercontent.com/117448701/210778670-55791f43-9792-4584-abfc-cb68b2ee3d67.png)

![IMG_20230105_172350](https://user-images.githubusercontent.com/117448701/210778732-775f8c0f-47ec-4421-b7bd-11383eacb7e3.png)

![IMG_20230105_172433](https://user-images.githubusercontent.com/117448701/210778762-79522fa0-d7b7-481e-9fb1-dd336d02aa25.png)

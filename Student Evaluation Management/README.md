# 🧮 Simple Java SBQ – Student Evaluation Program

## 📘 Problem Statement

Create a Java program to manage student records and perform analysis on their total marks and percentages.

---

### 🧩 Class 1: `Student`

#### Attributes:
| Attribute | Type | Description |
|------------|------|-------------|
| `id` | `int` | Unique ID of the student |
| `name` | `String` | Name of the student |
| `totmarksobt` | `int` | Total marks obtained by the student |

> **Note:**  
> - The total marks are considered for **4 subjects**, with each subject having a maximum of **100 marks**.  
> - Therefore, maximum total marks = **400**.

#### Tasks:
1. Define a **parameterized constructor** that initializes all attributes in the order:  
   `(int id, String name, int totmarksobt)`
2. Define **getters and setters** for each attribute.

---

### 🧩 Class 2: `Solution`

This class contains the `main` method and two static methods that perform operations on the student list.

---

### 🔹 Method 1: `findStudentWithhighestTotal`

```java
public static String findStudentWithhighestTotal(Student[] students)

Description:
Takes an array of Student objects.
Finds the student who scored the highest total marks.
Returns the student’s name in UPPERCASE.
If multiple students have the same highest total, return the first one encountered.
```
### 🔹 Method 2: `searchStudentsBypercentage`

```java
public static int[] searchStudentsBypercentage(Student[] students)

Description:
Takes an array of Student objects.
Calculates each student’s percentage as:
percentage = (totmarksobt/400)*100
Returns a sorted array (ascending order) of student IDs who scored 70% or more.
Returns null if no student meets this criterion.
```

🧩 Main Method Responsibilities
```
1.Accept input for the number of students.
```
```
2.For each student, accept:
 --Student ID
 --Student Name
 --Total Marks Obtained
```
```
3.Invoke both static methods and display results as follows:
 --Print topper’s name in uppercase.
 --Print student IDs (ascending) who scored ≥70%.
 --If none found, print: No Student found with mentioned attribute.
```

---

## 🔡 Sample Input 1
```
5
104
Uma
223
102
Cissy
283
105
Eva
295
101
Jenny
241
100
jisha
372
```


### ✅ Sample Output 1
```
JISHA
100
102
105
```

---

## 🔡 Sample Input 2
```
3
101
Ravi
180
102
Neha
160
103
Aman
190
```


### ✅ Sample Output 2
```
AMAN
No Student found with mentioned attribute.
```

## 🔡 Sample Input 3
```
4
101
Riya
280
102
Arjun
400
103
Meena
350
104
Kabir
270
```


### ✅ Sample Output 3
```
ARJUN
101
102
103
```
---

### 🔄 Example Fix for Scanner Input Issue

```java
Scanner sc = new Scanner(System.in);
int id = sc.nextInt();
sc.nextLine(); // Clear newline
String name = sc.nextLine();
```
---

## 📝 Notes

- All String comparisons, if required, should be case-insensitive.
- No hardcoded output or formatting is allowed; print the results exactly as required.
- Return null when no qualifying student is found.

---

## 💡 Technologies Used

- Java 8+
- Standard Input/Output
- Object-Oriented Programming Principles

---

## 🧑‍💻 Author

Developed by Mayank Singh - Feel free to contribute or suggest improvements.

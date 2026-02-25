# 🏋️ Advanced Gym Membership System 

A console-based Gym Management System built using Java that helps manage members, trainers, membership plans, attendance, and fee payments with multithreading and file handling support.

---

## 🚀 Features

* 🆔 Auto ID generation for members
* 👤 Add / Remove gym members
* 🔄 Update membership plan
* 📅 Attendance tracking with date
* 💰 Fee payment & payment history
* 🧵 Multithreaded attendance marking
* 💾 Save & Load data using file handling
* 🔍 Search member by ID
* 📋 View all members

---

## 🛠️ Technologies Used

* Java
* OOP (Object-Oriented Programming)
* Collections (ArrayList)
* Multithreading
* File Handling (Serialization)
* Java Time API (LocalDate)
* Exception Handling

---

## 📁 Project Structure

```
GymManagementSystem
 ├── Main.java
 ├── GymManager.java
 ├── Member.java
 ├── Trainer.java
 ├── Plan.java
 ├── Payment.java
 ├── Attendance.java
 ├── AttendanceThread.java
 └── FileHandler.java
```

---

## ▶️ How to Run

1. Clone the repository

```
git clone https://github.com/yogeshkumarsaini/gym-management-system.git
```

2. Open in any Java IDE (IntelliJ / Eclipse / VS Code)

3. Compile and run:

```
javac Main.java
java Main
```

---

## 📌 Sample Menu

```
🏋️ GYM MENU
1 Add Member
2 Remove Member
3 Update Plan
4 Mark Attendance
5 Pay Fees
6 View Members
7 Save
8 Load
0 Exit
```

---

## 🧠 OOP Concepts Used

* Encapsulation
* Association
* Abstraction
* Class & Objects

---

## 🔐 Data Storage

All member data is stored in:

```
gym.dat
```

using Java Serialization.

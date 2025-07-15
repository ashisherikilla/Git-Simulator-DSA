# 🌀 Git Simulator using Java DSA + OOPs

A command-line Git simulator built in Java using core Data Structures & Object-Oriented Programming. This project mimics real Git operations like `add`, `commit`, `log`, `status`, `checkout`, and `branch` — implemented using in-memory logic and DSA principles.

---

## 🚀 Features

- Initialize a repo, add files, make commits
- View commit history
- Check file status
- Branching, checkout and undo support
- CLI-based simulation

---

## 🔍 Concepts Used

- **Data Structures**: Linked List (commits), Stack (undo), HashMap (staging & branches)
- **OOP**:
  - Encapsulation (modular classes)
  - Abstraction (core logic hidden)
  - Inheritance (extendable commands)
  - Polymorphism (command execution logic)

---

## 🛠️ Tech Stack

Java – core language  
VS Code / IntelliJ – IDE  
No external libraries – just logic  
Terminal input – CLI based  
No database – in-memory only  

---

## 📁 Folder Structure

GitSimulator/
├── src/
│ ├── Main.java
│ ├── GitSimulator.java
│ ├── Repository.java
│ ├── Commit.java
│ ├── FileSnapshot.java
│ ├── StagingArea.java
│ ├── BranchManager.java
│ ├── Command.java
│ └── Utils.java
├── README.md
└── sample_input.txt

---

## 🧪 How to Run

```bash
git clone https://github.com/yourusername/Git-Simulator-DSA.git
cd Git-Simulator-DSA
javac src/*.java
java src/Main
```

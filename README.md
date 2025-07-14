# 🌀 Git Simulator using DSA

A Java-based Git simulator that mimics core Git operations using only Data Structures & Algorithms. No Git libraries, no file storage — just pure in-memory logic using DSA. Perfect for DSA practice and to understand how Git might work under the hood.

---

## 🚀 Features

- `init` – Initialize a new Git repository  
- `add <filename>` – Stage files for commit  
- `commit -m "message"` – Create a commit with a message  
- `status` – Show current file states (tracked/untracked/modified)  
- `log` – Show the commit history  
- `checkout <commit_id>` – Move back to a previous commit  
- `branch <name>` – Create new branches  
- `merge <branch>` – Merge two branches (optional feature)  
- `undo` – Undo the last commit  

---

## 🧠 DSA Used

Linked List (to store commit history), Stack (for undo commit feature), HashMap (to store staged files and branch pointers), Pointer manipulation (for commit navigation), and optionally Graph (for branching & merging logic).

---

## 🛠️ Tech Stack

Java – main language used  
VS Code / IntelliJ – to write and run code  
No database or storage – logic runs in-memory  
No external libraries – only core Java used  
CLI-based interaction – all commands handled via console  

---
## 🖥️ How to Run

1. Clone the repository  
```bash
git clone https://github.com/yourusername/Git-Simulator-DSA.git
```

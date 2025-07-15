# 📊 DSA Visualizer

A fully interactive **Java Swing** application that visualizes how popular **sorting algorithms** work, step by step — designed for both learning and fun!

---

## ✨ Features

- 🎨 Visualizes 5 classic sorting algorithms:
  - Bubble Sort
  - Selection Sort
  - Insertion Sort
  - Merge Sort
  - Quick Sort
- 🧠 Custom array input (comma-separated)
- 📈 Smooth animations using Java `Graphics`
- 🔢 Values shown below each bar for clarity
- 💙 Beautiful blue bars with clean font
- 🧩 Modular folder structure for logic and GUI

---

## 📸 Preview

### 🏠 Homepage
![Homepage](screenshots/Homepage.png)

---

### 🔀 Merge Sort Visualization
![Merge Sort](screenshots/MergeSort.png)

---

## 🛠️ How to Run

> You must have **Java 8 or above** installed.

### 🔹 Step 1: Clone the repo

```bash
git clone https://github.com/KaleShruti27/DSAVisualizer.git
cd DSAVisualizer
```

### 🔹 Step 2: Compile the program

```bash
javac Main.java
```

### 🔹 Step 3: Run the program

```bash
java Main
```

🎉 A GUI will appear. Enter your custom array (like `50, 100, 80, 120`) and choose the sorting algorithm to visualize!

---

## 📁 Project Structure

```
DSAVisualizer/
├── Sorting/
│   ├── BubbleSort.java
│   ├── SelectionSort.java
│   ├── InsertionSort.java
│   ├── MergeSort.java
│   └── QuickSort.java
├── screenshots/
│   ├── Homepage.png
│   └── MergeSort.png
├── DSAVisualizerGUI.java   # Visualization panel
├── Homepage.java           # GUI homepage with input and buttons
├── Main.java               # Entry point
├── README.md               # This file
```

---

## 🧠 Concepts Used

- Java Swing (`JFrame`, `JPanel`, `JLabel`, `JButton`)
- Java AWT (`Graphics`, `Font`, `Color`)
- Custom repaint animation with `Thread.sleep()`
- MVC-style separation (GUI ↔ logic)

---

## 📌 Future Improvements

- 🌀 Add Stack, Queue, and Tree visualizers
- ⏩ Add animation speed slider
- 🟩 Color-coding comparisons and swaps
- ⏸ Pause / resume visualization
- 📽️ Export as GIF

---

## 🤝 Contributing

Feel free to fork and improve the project — new visualizations or UI ideas are always welcome!

---

## 🙋‍♀️ Author

**Shruti Kale**  
👩‍💻 B.Tech CSE Student | Java Dev | DSA Enthusiast  
📌 GitHub: [@KaleShruti27](https://github.com/KaleShruti27)

---

## 📄 License

MIT License — use it freely for learning and building 🚀

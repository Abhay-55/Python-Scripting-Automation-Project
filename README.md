# 🐍 Python Scripting Automation Project

## 📌 Overview

The **Python Scripting Automation Project** is designed to streamline the process of managing game-related directories by:
- 🔍 **Searching** for directories containing "game" in their name.
- 📂 **Copying** identified directories to a specified target location.
- ⚙️ **Compiling** any `.go` files found within those directories.
- 📝 **Generating** a `metadata.json` file with details about the processed game directories.

This automation simplifies file organization and game project management, ensuring efficiency and accuracy in handling multiple directories.

## 🚀 Features

- 🔎 **Automated Directory Search**: Scans for directories with `game` in the name.
- 📁 **Efficient File Organization**: Moves game directories to a target location.
- 🛠️ **Go File Compilation**: Automatically detects and compiles `.go` files using `go build`.
- 📊 **Metadata Generation**: Produces a `metadata.json` file summarizing the processed directories.

## 🖥️ Prerequisites

### 🔧 Required Software
- **Python 3.x** (Verify installation: `python --version`)
- **Go Compiler** (Verify installation: `go version`)

### 📦 Python Dependencies
This script utilizes built-in Python modules, so no additional installations are required:
- `os`
- `json`
- `shutil`
- `subprocess`
- `sys`

## 📥 Installation

1. **Clone the Repository**:
   ```sh
   git clone <repository_url>
   cd <repository_folder>
   ```
2. **Verify Python & Go Installation**:
   ```sh
   python --version
   go version
   ```

## 🏗️ Usage

Execute the script with the following command:
```sh
python Scripting_Automation_Project.py <source_directory> <target_directory>
```

### 📌 Example:
```sh
python Scripting_Automation_Project.py "C:\Python-Scripting-Project-main\data" "C:\Python-Scripting-Project-main\target"
```

### 🔄 Arguments:
- `<source_directory>`: Path to the directory containing game projects.
- `<target_directory>`: Destination folder where processed game directories will be stored.

## 🔍 How the Script Works

1. **Scans for Game Directories**: Searches for directories with "game" in their name.
2. **Copies and Organizes Data**: Moves detected directories to the specified target location.
3. **Compiles `.go` Files**: Identifies and compiles Go files within the copied directories.
4. **Generates Metadata JSON**: Records processed game details in `metadata.json`.

## 📂 Project Structure
```
Python-Scripting-Project/
│── data/                # Source directory containing game projects
│── target/              # Target directory for processed game files
│── Scripting_Automation_Project.py  # Main automation script
│── README.md            # Project documentation
│── metadata.json        # Generated metadata file with game details
```

## 🛠️ Troubleshooting

### ⚠️ Common Issues & Solutions

- **❌ WinError 2: System Cannot Find the File Specified**
  - Ensure `go` is installed and accessible by running `go version`.
  - If needed, add `C:\Go\bin` to your system `PATH` environment variable.

- **📂 No `.go` Files Found in Game Directories**
  - Confirm that the source directory contains valid `.go` files.
  - Modify the script to print available files for debugging.

## 📌 Future Enhancements

- 🔄 **Support for Multiple Programming Languages** (e.g., Python, Java, C++)
- 📊 **Detailed Log Files** for tracking script execution
- ⚡ **Performance Optimization** for handling large datasets
- 🌐 **Cross-Platform Compatibility** for Linux/macOS support

## 🏗️ Contribution

Contributions are welcome! Feel free to **fork** the repository and submit a **pull request** to improve functionality or add new features. 🚀

---

**Automate Your Workflow with Python!** ⚡🐍


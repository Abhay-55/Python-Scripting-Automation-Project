# Python-Scripting-Automation-Project


## Overview 
This project is a Python-based **automation script** designed to: 
- Search for directories containing "game" in their name. 
- Copy them to a specified target location. 
- Compile any `.go` files found in those directories. 
- Generate a `metadata.json` file containing details about the processed game directories. 
## Features 
- **Automatic Directory Search**: Finds all directories that contain `game` in their name. 
- **File Copying & Organization**: Moves game directories to a target location. 
- **Go File Compilation**: Detects and compiles `.go` files using `go build`. 
- **Metadata Generation**: Creates a JSON file with details of processed games. 
## Prerequisites 
### Required Software: 
- **Python 3.x** (Check installation: `python --version`) 
- **Go Compiler** (Check installation: `go version`) 
### Python Dependencies: 
This script relies on built-in Python modules: 
- `os` 
- `json` 
- `shutil` 
- `subprocess` 
- `sys` 
No additional packages are required. 
## Installation 
1. **Clone or Download the Repository**: 
```sh 
git clone <repository_url> 
cd <repository_folder> 
``` 
2. **Ensure Python & Go are Installed**: 
```sh 
python --version 
go version 
``` 
## Usage 
Run the script using: 
```sh 
python Scripting_Automation_Project.py <source_directory> <target_directory> 
``` 
### Example: 
```sh 
python Scripting_Automation_Project.py "C:\Python-Scripting-Project-main\data" "C:\Python-Scripting-Project-main\target" 
``` 
### Arguments: 
- `<source_directory>`: Path to the directory containing game projects. 
- `<target_directory>`: Destination folder where processed game directories will be stored. 
## How the Script Works 
1. **Searches for Game Directories**: Finds directories with `game` in the name. 
2. **Copies & Organizes Data**: Moves the identified directories to the target folder. 
3. **Compiles ******\`\`****** Files**: Detects and compiles Go files inside the copied directories. 
4. **Creates Metadata JSON**: Stores processed game details in `metadata.json`. 
## File Structure 
``` 
Python-Scripting-Project/ 
│── data/ # Source directory with game projects 
│── target/ # Target directory for processed game files 
│── Scripting_Automation_Project.py # Main script 
│── README.md # Documentation 
│── metadata.json # Generated metadata file 
``` 
## Troubleshooting 
### Common Errors & Fixes 
- **WinError 2: System cannot find the file specified** 
- Ensure `go` is installed and accessible (`go version`). 
- Add `C:\Go\bin` to your system PATH if necessary. 
- **No ******\`\`****** file found in game directories** 
- Check if the source directory has valid `.go` files. 
- Modify the script to print available files for debugging. 
## License 
This project is open-source under the MIT License.


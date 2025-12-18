# Employee Registration System

A comprehensive Java Swing-based desktop application for managing employee records and information. Built from scratch, this system provides complete CRUD (Create, Read, Update, Delete) operations for employee data management with an intuitive graphical user interface.

## 🎯 Overview

The Employee Registration System is designed to efficiently manage organizational workforce data, including personal information, departmental assignments, positions, and compensation details. The application supports both manual data entry and file-based operations, making it suitable for small to medium-sized businesses requiring robust employee record management.

## ✨ Features

- **Complete CRUD Operations**: Add, view, update, and delete employee records
- **Employee Data Management**: Comprehensive employee information including personal details, department, position, and salary
- **File I/O Operations**: Import employee data from text files and export records
- **Search & Sort Functionality**: Advanced search capabilities and sorting options
- **Data Validation**: Custom exception handling for invalid data entries
- **Department & Position Management**: Predefined departments and positions with enum-based structure
- **User-Friendly GUI**: Intuitive Swing-based interface for easy navigation
- **Data Persistence**: Save and load employee lists from external files

## 🛠️ Technology Stack

- **Language**: Java (JDK 8+)
- **GUI Framework**: Java Swing
- **IDE**: IntelliJ IDEA (recommended)
- **Build Tool**: N/A (direct compilation)
- **File Format**: Plain text (.txt) for data import/export

## 📋 Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher
- **Integrated Development Environment**: IntelliJ IDEA, Eclipse, or any Java IDE
- **Operating System**: Windows, macOS, or Linux

## 🚀 Installation & Setup

### 1. Clone the Repository
```bash
git clone <repository-url>
cd Employee-Registration-System
```

### 2. Open in IDE
- Launch your preferred Java IDE (IntelliJ IDEA recommended)
- Import the project:
  - **IntelliJ IDEA**: File → Open → Select the project folder
  - **Eclipse**: File → Import → General → Existing Projects into Workspace
- Ensure the `src/` directory is set as the source folder

### 3. Compile and Run
```bash
# Navigate to src directory
cd src

# Compile all Java files
javac *.java

# Run the application
java EmployeeRecordsManager
```

### Alternative: Using IDE
- Open the project in your IDE
- Locate `EmployeeRecordsManager.java`
- Right-click and select "Run" or "Run Main"

## 📖 Usage

### Main Menu Options:

1. **Upload List**: Import employee data from a text file
   - Format: `ID FirstName LastName Gender Year Month Day Salary Department Position`
   - Example: `662 Ali Ahmed m 1994 4 1 122.22 marketing accountant`

2. **Create List**: Manually create a new employee list
   - Add employees one by one through the GUI
   - Specify list size and populate records

### Available Operations:
- **Add Employee**: Insert new employee records at specific positions
- **Delete Employee**: Remove employees by ID or position
- **Update Records**: Modify existing employee information
- **Search Employees**: Find employees by various criteria
- **Sort Employees**: Organize records by different parameters
- **View List**: Display all employee records
- **Save to File**: Export current employee list to text file

## 🏗️ Project Structure

```
Employee-Registration-System/
├── src/
│   ├── Employee.java                 # Employee data model with enums
│   ├── EmployeeList.java             # Collection management for employees
│   ├── EmployeeRecordsManager.java   # Main application entry point
│   ├── MainmenuFrame.java            # Main GUI menu interface
│   ├── EmployeeListFrame.java        # Employee list management GUI
│   ├── AddEmployeeMenu.java          # Add employee interface
│   ├── DeleteEmployeeMenu.java       # Delete employee interface
│   ├── UpdateRecordsMenu.java        # Update employee records
│   ├── SearchEmployeeMenu.java       # Search functionality
│   ├── SortEmployee.java             # Sorting operations
│   ├── PrintListMenu.java            # Display employee lists
│   ├── SaveTextFile.java             # File export functionality
│   ├── CreateTextFile.java           # File creation utilities
│   ├── InvalidIDException.java       # Custom exception handling
│   ├── ExpandListMenu.java           # List expansion utilities
│   └── IsEmptyMenu.java              # Empty list validation
├── Clients.txt                       # Sample employee data file
├── hello.txt                         # Additional data file
├── JavaProject.iml                   # IntelliJ IDEA project file
└── README.md                         # Project documentation
```

## 📊 Data Model

### Employee Attributes:
- **Employee ID**: Unique identifier (CPR number)
- **Personal Information**: First name, last name, gender
- **Date of Birth**: Year, month, day
- **Compensation**: Salary (float)
- **Department**: Production, Marketing, Store & Purchase, Finance, Customer Service
- **Position**: Accountant, Clerk, Engineer, General Manager, Labor, Manager, Mechanic, Secretary, Supervisor, Technician

### Departments:
- Production
- Marketing
- Store and Purchase
- Finance
- Customer Service and Overall Management

### Positions:
- Accountant
- Clerk
- Engineer
- General Manager
- Labor
- Manager
- Mechanic
- Secretary
- Supervisor
- Technician

## 🔧 Key Classes

- **Employee**: Core data model with validation and enum support
- **EmployeeList**: Manages collection of employees with CRUD operations
- **EmployeeRecordsManager**: Application entry point and main controller
- **InvalidIDException**: Custom exception for ID validation
- **GUI Classes**: Various Swing-based interfaces for user interaction

## 📋 File Format Specifications

Employee data files should follow this format:
```
ID FirstName LastName Gender Year Month Day Salary Department Position
```

Example data:
```
662 Ali Ahmed m 1994 4 1 122.22 marketing accountant
422 Mohammed Ali m 1992 5 2 12.2 marketing clerk
```

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is developed as part of an academic assignment. Please refer to your institution's guidelines for usage and distribution.

---

**Built with ❤️ using Java Swing for efficient employee data management**

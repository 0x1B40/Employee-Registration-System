import javax.swing.*;

public class EmployeeList {

    public Employee list[];
    private int size;
    public int maxSize;


    EmployeeList()
    {

        maxSize = 50;
        size = 0;
        list = new Employee[maxSize+1];


    }


    EmployeeList(int max)
    {

        maxSize = max;
        size = 0;
        list = new Employee[maxSize];


    }

    EmployeeList(String fileName)
    {
try {

    CreateTextFile application = new CreateTextFile ();
    application.openFile ( fileName );
    application.addRecords ();
    application.closeFile ();
}
catch(ArrayIndexOutOfBoundsException exp)
{
    EmployeeListMenu.employeeList.expandArray(50);
    JOptionPane.showMessageDialog(null,"Array expanded new list size:"+EmployeeListMenu.employeeList.maxSize);
}


    }

    public void addEmployeeEnd(Employee emp) throws ArrayIndexOutOfBoundsException
    {

        list[size] = emp; // out of bound exception may be thrown.
        size++;


    }

    public void addEmployeeAt(Employee emp,int index)
    {

        Employee temp = list[index];
        list[index] = emp;
        list[size] = temp; // out of bound exception may be thrown.
        size++;



    }

    public void deleteEmployeeAt(int index)
    {
        for(int i = index;i<size;i++) // is it less than or less than or equal? i think it's correct as is.
        {
            list[i] = list[i+1];
        }

        size--;

    }
public void deleteEmployee(long empID)
{
    // delete by employeeID
boolean found = false;
    for(int i =0;i<size;i++)
    {
        if(list[i].getEmpID() == empID)
        {
            found = true;

            for(int j =i;j<size;j++)
            {
                list[j] = list[j+1];
            }


        }
    }

if(found)
    size--;

}

public void updateRecord(Employee emp, long empID)
{
for(int i =0;i<size;i++)
{
    if(list[i].getEmpID() == empID)
    {
        try {
            list[i].setEmpID ( emp.getEmpID () );
            list[i].setFirstName(emp.getFirstName());
            list[i].setLastName(emp.getLastName());
            list[i].setGender(emp.getGender());
            list[i].setDay(emp.getDay());
            list[i].setMonth(emp.getMonth());
            list[i].setYear(emp.getYear());
            list[i].setDepartment ( emp.getDepartment () );
            list[i].setPosition(emp.getPosition());
            list[i].setSalary(emp.getSalary());
        }
        catch(InvalidIDException exp)
        {
            JOptionPane.showMessageDialog(null,"Invalid ID entered");

        }
    }

}

}

public Employee searchByEmpID(long empID)
{
    for(int i =0;i<=size;i++)
    {
        if(list[i].getEmpID() == empID)
            return list[i];
    }

    System.out.println("user not found in list");

return null;
}

public boolean isEmpty()
{
    if(size ==0)
        return true;

    return false;

}

public int getSize()
{
    return size;

}

public void expandArray(int increaseBy) {

    Employee newList[];
    newList = new Employee[increaseBy+maxSize];

    for (int i = 0; i < size; i++)
    {
        newList[i] = list[i];

    }
list = newList;
    maxSize = increaseBy+maxSize;
    // size remain the same no need for size= size;

}

public void printList()
{
System.out.println(size);
    for(int i =0;i<size;i++)
    {
        list[i].printEmployee();

    }


}

    public void sortByEmpID()
    {
        long IDList[] = new long[maxSize+1];
        Employee employeeList[] = new Employee[maxSize+1];



        for(int i =0;i<size;i++)
        {
            IDList[i] =list[i].getEmpID();
        }

        for(int i =0;i<size;i++)
        {
            for(int j =i;j<size;i++)
            {
                if(IDList[i] >IDList[j])
                {
                    long temp =IDList[i];
                    IDList[i] = IDList[j];
                    IDList[j] = temp;
                }

            }

        }

        for(int i =0;i<size;i++)
        {
            employeeList[i] = searchByEmpID(IDList[i]);
        }
        list = employeeList;


    }

}

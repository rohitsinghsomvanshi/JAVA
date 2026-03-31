import java.util.Scanner;
class employee{
    private String emp_name;
    private int emp_id;
    private String emp_dept;
    private String emp_add;

public employee(String emp_name ,int emp_id , String emp_dept , String emp_add){
    this.emp_name= emp_name ;
    this.emp_id = emp_id ;
    this.emp_dept = emp_dept ;
    this.emp_add = emp_add;
    }
    public String getEmp_name(){
        return emp_name;
    }
    public int getEmp_id(){
        return emp_id;
    }
    public String getEmp_dept(){
        return emp_dept;
    }
    public String getEmp_add(){
        return emp_add;
    }

public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Name:");
    String  name = sc.nextLine();
    System.out.print("Enter Emp ID:");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter a Dept Name:");
    String dept = sc.nextLine();
    System.out.print("Enter a Address");
    String add = sc.nextLine();
    employee e1 = new employee(name,id,dept,add);
    System.out.print("Name :"+ e1.getEmp_name());
    System.out.print("ID:"+ e1.getEmp_id());
    System.out.print("Department:"+ e1.getEmp_dept());
    System.out.print("Address:"+ e1.getEmp_add());
    sc.close();
}
}


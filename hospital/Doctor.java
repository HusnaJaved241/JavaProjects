package hospital;
import javax.swing.JOptionPane;

public class Doctor {

    
    private String name;
    private String cnic;
    private String phone_no;
    private String gender;
    private String dept;
    private String spec;
    
    Doctor()
    {
        name = "";
        cnic = "";
        phone_no = "";
        gender = "m";
        dept = "";
        spec = "";
    }
    Doctor(String name, String cnic, String phone_no, String gender, String dept, String spec)
    {
        this.name = name;
        this.cnic=  cnic;
        this.phone_no = phone_no;
        this.gender = gender;
        this.dept = dept;
        this.spec=  spec;
    }
   public void addDoctor()
   {
    name = JOptionPane.showInputDialog("Enter name: ");
    cnic = JOptionPane.showInputDialog("Enter cnic: ");
    phone_no = JOptionPane.showInputDialog("Enter phone no: ");
    gender = JOptionPane.showInputDialog("Enter gender: ");
    dept = JOptionPane.showInputDialog("Enter department: ");
    spec = JOptionPane.showInputDialog("Enter specialization: ");
   }

   public void printDoctor()
   {
       JOptionPane.showMessageDialog(null, "Name is "+name+"/nCnic is "+cnic+"\nGender is "+gender+"\nPhone no is "+phone_no+"\nDepartment is "+dept+"\nSpecialization is "+spec, "Doctors", JOptionPane.INFORMATION_MESSAGE);
   }
   public String getName()
   {
       return name;
   }
   public String getDept()
   {
    return dept;
   }
   public String getCnic()
   {
       return cnic;
   }

  
}

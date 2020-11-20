package hospital;
import javax.swing.JOptionPane;

public class Demo {
    Doctor d [] = new Doctor[5];
    boolean searchDoctorByName(String name){
        int found = 0;
        for(int i=0;i<5;i++){
            if(d[i].getName() == name)
            {
                d[i].printDoctor();
                found = 1;
                return true;
            }
        }
        if(found==0)
        JOptionPane.showMessageDialog(null, "Name not found");
        return false;
    }
    boolean searchDoctorByDept(String dept)
    {
        int found = 0;
        for(int i=0;i<10;i++){
            if(d[i].getDept() == dept)
            {
                d[i].printDoctor();
                found = 1;
                return true;
            }
        }
        if(found==0)
        JOptionPane.showMessageDialog(null, "deparment not found");
        return false;
    }

    
    public static void main(String[] args) {
    Demo d = new Demo();
    Doctor doctor = new Doctor();
    // Patient p = new Patient();
    Indoor_patient ipatient = new Indoor_patient();
    Outdoor_patient opatient = new Outdoor_patient();
    int ch = 0;
    while(ch!=9)
    {
        JOptionPane.showMessageDialog(null, "1.Add an Indoor Patient\n2.Add an Outdoor Patient.\n3.See list of all Doctors\n4.Search a Doctor by name or department.\n5.See list of all indoor patients.\n6.See list of all appointments on a certain day.\n7.See list of appointments of a specific doctors.\n8.Change the date or time of appointment of a certain patient.", "MENU", JOptionPane.INFORMATION_MESSAGE);
        String ch1 = JOptionPane.showInputDialog("Enter you choice: ");
        ch = Integer.parseInt(ch1);
        switch(ch)
        {
            case 1:ipatient.addPatient();
            break;
            case 2:opatient.addPatient();
            break;
            case 3:doctor.printDoctor();
            break;
            case 4:String c = JOptionPane.showInputDialog(null, "To search by name by name press 'n' and to search through department press'd'");
            if(c=="n"){
            String name = JOptionPane.showInputDialog(null, "Enter name you want to search : ");
            d.searchDoctorByName(name);
            }
            else if(c=="d")
            {
            String dept = JOptionPane.showInputDialog(null, "Enter department you want to search : ");
            d.searchDoctorByDept(dept);
            }
            break;
            case 5:ipatient.printPatient();
            break;
            case 6:
            break;
            case 7:
            break;
            // case 8:JOptionPane.showMessageDialog(null, "Enter name of patient", "Modify Time", JOptionPane.);
            case 8:
            break;
        }
        }
    }


}


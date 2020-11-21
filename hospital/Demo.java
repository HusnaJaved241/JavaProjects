package hospital;

import javax.swing.JOptionPane;

import date_time.Date_class;
import date_time.Time;

public class Demo {
    Doctor d [] = new Doctor[5];
    Outdoor_patient op[] = new Outdoor_patient[3];
    Indoor_patient ip[] = new Indoor_patient[3];

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
        JOptionPane.showMessageDialog(null, "department not found");
        return false;
    }
    void appsOnDay(Date_class date)
    {
        int count = 0;
        // Date_class d = new Date_class();
        for(int i=0;i<3;i++)
        {
            if(date == op[i].getDate())
            {
                op[i].printPatient();
                count++;
            }
        }
        JOptionPane.showMessageDialog(null, "No of appointments on this date are "+count);

    }

    void doctorAppointment()
    {
        String cnic = JOptionPane.showInputDialog("Enter cnic of doctor whose schedule you want to view: ");
        int count = 0;
        for ( int i=0;i<3;i++)
        {
            if(cnic == op[i].getDoctor().getCnic())
            {
                count++;
                op[i].printPatient();
            }
            if(cnic == ip[i].getDoctor().getCnic())
            {
                count++;
                op[i].printPatient();
            }
        }
        JOptionPane.showMessageDialog(null, "No. of appointments of this doctor are "+count);
    }

    void modifyAppointment()
    {
        Date_class date = new Date_class();
        Time time = new Time();
        String cnic = JOptionPane.showInputDialog(null, "Enter cnic of patient whose appointment time you want to change: ");
        for(int i=0;i<3;i++)
        {
            if(op[i].getDoctor().getCnic() == cnic)
            {
                date.addDate();
                op[i].setDate(date);
                time.addTime();
                op[i].setTime(time);

            }
        }
    }

    
    public static void main(String[] args) {
    Demo d = new Demo();
    Doctor doctor = new Doctor();
    Date_class date = new Date_class();
    // Patient p = new Patient();
    // Date date = new Date();
    Indoor_patient ipatient = new Indoor_patient();
    Outdoor_patient opatient = new Outdoor_patient();
    int ch = 0;
    while(ch!=9)
    {
        JOptionPane.showMessageDialog(null, "1.Add an Indoor Patient\n2.Add an Outdoor Patient.\n3.See list of all Doctors\n4.Search a Doctor by name or department.\n5.See list of all indoor patients.\n6.See list of all appointments on a certain day.\n7.See list of appointments of a specific doctor.\n8.Change the date or time of appointment of a certain patient.", "MENU", JOptionPane.INFORMATION_MESSAGE);
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
                        else{
                            JOptionPane.showMessageDialog(null, "Invalid choice", "ERROR", JOptionPane.CANCEL_OPTION);
                        }
            break;
            case 5:ipatient.printPatient();
            break;
            case 6:date.addDate();
            d.appsOnDay(date);
            break;
            case 7:d.doctorAppointment();
            break;
            // case 8:JOptionPane.showMessageDialog(null, "Enter name of patient", "Modify Time", JOptionPane.);
            case 8:d.modifyAppointment();
            break;
        }
        }
    }


}


package hospital;
import javax.swing.JOptionPane;

public class Patient{
    private String name;
    private String cnic;
    private String phone_no;
    private String gender;
    private int age;
    private String address;
    Patient()
    {
        name = "";
        cnic = "";
        phone_no = "";
        gender = "m";
        age = 0;
        address = "";
    }
    Patient(String name, String cnic, String phone_no, String gender, int age, String address)
    {
        this.name = name;
        this.cnic=  cnic;
        this.phone_no = phone_no;
        this.gender = gender;
        this.age = age;
        this.address=  address;
    }
    void addPatient()
    {
        name = JOptionPane.showInputDialog("Enter name: ");
        cnic = JOptionPane.showInputDialog("Enter cnic: ");
        phone_no = JOptionPane.showInputDialog("Enter phone no: ");
        gender = JOptionPane.showInputDialog("Enter gender: ");
        String age1 = JOptionPane.showInputDialog("Enter age: ");
        age = Integer.parseInt(age1);
        address = JOptionPane.showInputDialog("Enter address: ");
    }
    void printPatient()
    {
        JOptionPane.showMessageDialog(null, "Name is "+name+"/nCnic is "+cnic+"\nGender is "+gender+"\nPhone no is "+phone_no+"\nAge is "+age+"\nAddress is "+address, "Patient", JOptionPane.INFORMATION_MESSAGE);
    }
}
class Indoor_patient extends Patient{
    private int ward_no;
    private int room_no;
    private int bed_no;
    date_time.Date date;
    Doctor doctor;
    private double fee;

    Indoor_patient()
    {
        ward_no = 0;
        room_no = 0;
        bed_no = 0;
        fee = 0.0;
    }
    Indoor_patient(String name, String cnic, String phone_no, String gender, int age, String address, int ward_no, int room_no, int bed_no, date_time.Date date, Doctor doctor, double fee){
        
        super(name, cnic, phone_no, gender, age, address);
        this.ward_no = ward_no;
        this.room_no = room_no;
        this.bed_no = bed_no;
        this.date = date;
        this.doctor = doctor;
        this.fee = fee;
    }
    public int getWardno()
    {
        return ward_no;
    }
    public int getBedno()
    {
        return bed_no;
    }
    public int getRoomno()
    {
        return room_no;
    }
    public date_time.Date getDate()
    {
        return date;
    }
    public Doctor getDoctor()
    {
        return doctor;
    }
    public double getFee()
    {
        return fee;
    }
    public void setWardno(int ward_no)
    {
        this.ward_no = ward_no;
    }
    public void setBedno(int bed_no)
    {
        this.bed_no = bed_no;
    }
    public void setRoomno(int room_no)
    {
        this.room_no = room_no;
    }
    public void setDate(date_time.Date date)
    {
        this.date = date;
    }
    public void setDoctor(Doctor doctor)
    {
        this.doctor = doctor;
    }
    public void setFee(double fee)
    {
        this.fee = fee;
    }
    public void addPatient()
    {
        super.addPatient();
        String bed = JOptionPane.showInputDialog("Enter bed no: ");
        bed_no = Integer.parseInt(bed);
        String room = JOptionPane.showInputDialog("Enter room no: ");
        room_no = Integer.parseInt(room);
        String ward = JOptionPane.showInputDialog("Enter ward no: ");
        ward_no = Integer.parseInt(ward);
        String fees = JOptionPane.showInputDialog("Enter fee: ");
        fee = Integer.parseInt(fees);
        doctor.addDoctor();
        date.addDate();

    }
    public void printPatient()
    {
        super.printPatient();
        JOptionPane.showMessageDialog(null, "Bed no is "+bed_no+"/nRoom no is "+room_no+"\nWard no is "+ward_no+"\nFee is "+fee, "PATIENTS", JOptionPane.INFORMATION_MESSAGE);
        doctor.printDoctor();
        JOptionPane.showMessageDialog(null, date, "DATE", JOptionPane.INFORMATION_MESSAGE);
    }

 
}
class Outdoor_patient extends Patient{
    date_time.Date date;
    date_time.Time time;
    Doctor doctor;
    private double fee;

    Outdoor_patient(){
        fee = 0.0;
    }
    Outdoor_patient(String name, String cnic, String phone_no, String gender, int age, String address, date_time.Date date, date_time.Time time, Doctor doctor, double fee){
        super(name, cnic, phone_no, gender, age, address);
        this.date = date;
        this.time = time;
        this.doctor = doctor;
        this.fee = fee;
    }
    public date_time.Date getDate()
    {
        return date;
    }
    public date_time.Time getTime()
    {
        return time;
    }
    public Doctor getDoctor()
    {
        return doctor;
    }
    public double getFee()
    {
        return fee;
    }
    public void setDate(date_time.Date date)
    {
        this.date = date;
    }
    public void setTime(date_time.Time time)
    {
        this.time = time;
    }
    public void setDoctor(Doctor doctor)
    {
        this.doctor = doctor;
    }
    public void setFee(double fee)
    {
        this.fee = fee;
    }
    public void addPatient()
    {
        super.addPatient();
        String fees = JOptionPane.showInputDialog("Enter fee: ");
        fee = Integer.parseInt(fees);

    }
    public void printPatient()
    {
        super.printPatient();
        doctor.printDoctor();
        JOptionPane.showMessageDialog(null, date, "DATE", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, time, "TIME", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Fee is "+fee, "PATIENTS", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, date, "DATE", JOptionPane.INFORMATION_MESSAGE);
    }
    public void appsOnDay()
    {
        
    }
}

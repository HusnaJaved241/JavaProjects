package date_time;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;


// import java.util.Date;
public class Date_class {
    // public static void main(String[] args) {
    //     Date date = new Date();
    //     System.out.println(date.toString());
    //     System.out.println(date.getTime());
    //     System.out.println(date.getDate());
    //     System.out.println(date.getSeconds());
    // }
    private int day;
    private int month;
    private int year;

    public Date_class(){
        day = 1;
        month = 1;
        year = 2000;
    }
    Date_class(int day,int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay()
    {
        return day;
    }
    public int getMonth()
    {
        return month;
    }
    public int getYear()
    {
        return year;
    }
    public void setDay(int day)
    {
        this.day = day;
    }
    public void setMonth(int month)
    {
        this.month = month;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public String toString()
    {
        return day+"/"+month+"/"+year;
    }
    public void addDate()
    {
        String dayy = JOptionPane.showInputDialog("Enter day: ");
        day = Integer.parseInt(dayy);
        String monthh = JOptionPane.showInputDialog("Enter month: ");
        month = Integer.parseInt(monthh);
        String yearr = JOptionPane.showInputDialog("Enter year: ");
        year = Integer.parseInt(yearr);
    }
    public void getDate()
    {
        Date date = new Date();
        SimpleDateFormat dt1 = new SimpleDateFormat("dd-mm-yyyy");
        JOptionPane.showMessageDialog(null, "Date is "+dt1.format(date), "Time", JOptionPane.INFORMATION_MESSAGE);
    }


}

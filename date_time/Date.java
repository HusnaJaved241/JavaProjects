package date_time;
import javax.swing.JOptionPane;

// import java.util.Date;
public class Date {
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
// ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIHJbYU6ZP2IM9I3Hh9Nhuvham9cUkTSSAJdauGjtRggs husnajaved.241@gmail.com

    Date(){
        day = 1;
        month = 1;
        year = 2000;
    }
    Date(int day,int month, int year)
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


}

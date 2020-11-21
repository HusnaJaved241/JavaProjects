package date_time;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Time {
    private int hours;
    private int minutes;
    private String daytime;
    public Time(){
        hours = 0;
        minutes = 0;
        daytime = "AM";
    }
    Time(int hours,int minutes, String daytime)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.daytime = daytime;
    }
    public int getHours()
    {
        return hours;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public String getDayTime()
    {
        return daytime;
    }
    public void sethours(int hours)
    {
        this.hours = hours;
    }
    public void setMonth(int minutes)
    {
        this.minutes = minutes;
    }
    public void setYear(String daytime)
    {
        this.daytime = daytime;
    }
    public String toString()
    {
        return hours+":"+minutes+" "+daytime;
    }
    public void addTime()
    {
        String hourr = JOptionPane.showInputDialog("Enter day: ");
        hours = Integer.parseInt(hourr);
        String minute = JOptionPane.showInputDialog("Enter month: ");
        minutes = Integer.parseInt(minute);
        daytime = JOptionPane.showInputDialog("Enter year: ");
        }
    public void getTime()
    {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
        JOptionPane.showMessageDialog(null, "Time is "+sdf.format(date), "Time", JOptionPane.INFORMATION_MESSAGE);
    }

}

package date_time;

public class Time {
    private int hours;
    private int minutes;
    private String daytime;
    Time(){
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

}

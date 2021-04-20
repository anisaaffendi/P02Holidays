package sg.edu.rp.c347.id19030019.p02_holidays;

public class Holiday {
    private String holidayName;
    private String holidayDate;
    private int imageIcon;

    public Holiday(String holidayName, String holidayDate, int imageIcon){
        this.holidayName = holidayName;
        this.holidayDate = holidayDate;
        this.imageIcon = imageIcon;
    }

    public String getHolidayName(){
        return holidayName;
    }

    public String getHolidayDate(){
        return holidayDate;
    }

    public int getImageIcon(){
        return imageIcon;
    }
}

package sg.edu.rp.c346.p02_holidays;

public class Holidays {
    private String holiday;
    private boolean star;
    private String date;

    public Holidays (String holiday, boolean star, String date){
        this.holiday = holiday;
        this.star = star;
        this.date = date;
    }

    public String getHoliday(){
        return holiday;
    }

    public boolean isStar(){
        return star;
    }

    public String getDate(){
        return date;
    }
}


public class Date {
    private int year, month, day;

    public Date(){
        this.day = 3;
        this.month = 11;
        this.year = 2024;
    }

    public Date(int year, int month, int day){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Your birthday is: " + day + "/" + month + "/ " + year;
    }

    public static void main(String[] args) {
        Date birthday = new Date(1983, 7, 14);
        System.out.println(birthday);


    }
}
public class NextDayCalculator {
    private int day = 1;
    private int month = 1;
    private int year = 2021;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public NextDayCalculator(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public NextDayCalculator() {
    }

    public boolean checkLeapYear(int year) {
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;

        if (isDivisibleBy4 == true && isDivisibleBy100 == false)
            return true;

        if (isDivisibleBy400 == true)
            return true;

        return false;
    }

    public int numberOfDaysOfTheMonth(int month, int year) {
        boolean isLeapYear = checkLeapYear(year);
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2:
                if (isLeapYear)
                    return 29;
                else
                    return 28;

            default:
                return 0;
        }
    }

    public NextDayCalculator nextDay() {
        NextDayCalculator theNextDay = new NextDayCalculator();
        if(this.getDay() == this.numberOfDaysOfTheMonth(this.getMonth(), this.getYear())){
            if (this.getMonth() == 12){
                theNextDay.setDay(1);
                theNextDay.setMonth(1);
                theNextDay.setYear(this.getYear() + 1);
            }else {
                theNextDay.setDay(1);
                theNextDay.setMonth(this.getMonth() +1);
                theNextDay.setYear(this.getYear());
            }
        }else{
            theNextDay.setDay(this.getDay() + 1);
            theNextDay.setMonth(this.getMonth());
            theNextDay.setYear(this.getYear());
        }
        return theNextDay;
    }
}

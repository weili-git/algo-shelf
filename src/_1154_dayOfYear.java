public class _1154_dayOfYear {
    public int dayOfYear(String date) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        int res = 0;
        if(year%400==0 || (year%100!=0 && year%4==0)) days[2]++;
        while(month>0){
            month--;
            res += days[month];
        }
        res += day;
        return res;
    }
}

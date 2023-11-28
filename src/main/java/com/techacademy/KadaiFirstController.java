package com.techacademy;






import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {
    
    @GetMapping("/dayofweek/{yyyymmdd}")
    public String dispDayOfWeek(@PathVariable String yyyymmdd) {
        String ymd = yyyymmdd;
        String year = ymd.substring(0,4);
        String month = ymd.substring(4,6);
        String day = ymd.substring(6,8);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
       
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);
        
        System.out.println(y);
        System.out.println(m);
        System.out.println(d);
        
      //年月日の数値から日付を生成
        LocalDate ld2 = LocalDate.of(y, m, d);
        System.out.println(ld2);
      //曜日を取得
        DayOfWeek w = ld2.getDayOfWeek();
        //テキストの表現を取得
        System.out.println(w.getDisplayName(TextStyle.FULL, Locale.US));

        
        
        return w.getDisplayName(TextStyle.FULL, Locale.US);
        
        
    }
    
   
    @GetMapping("/plus/{val1}/{val2}")
    public int calcPlus(@PathVariable int val1,@PathVariable int val2) {
        int plusres = 0;
        plusres = val1+val2;
        return plusres;
    }
    @GetMapping("/minus/{val1}/{val2}")
    public int calcMinus(@PathVariable int val1,@PathVariable int val2) {
        int minusres = 0;
        minusres = val1-val2;
        return minusres;
    }
    @GetMapping("/times/{val1}/{val2}")
    public int calcTimes(@PathVariable int val1,@PathVariable int val2) {
        int timesres = 0;
        timesres = val1*val2;
        return timesres;
    }
    @GetMapping("/divide/{val1}/{val2}")
    public int calcDivide(@PathVariable int val1,@PathVariable int val2) {
        int divideres = 0;
        divideres = val1/val2;
        return divideres;
    }
    
}

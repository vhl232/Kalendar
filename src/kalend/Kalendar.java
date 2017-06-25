package kalend;

import java.util.Date;

/**
 * Created by vladimir on 06.06.17.
 */
public class Kalendar {

    public static final int KOLICHESTVO_MILESEK_V_SUTKAH = 86400000;

    public static DayOfTheWeek getDayOfTheWeek(long miles){

        long days = miles/KOLICHESTVO_MILESEK_V_SUTKAH;
         if (days >= 0){
             switch ((int) (days % 7)){

                 case 0:{
                     return DayOfTheWeek.THURSDAY;

                 }
                 case 1:
                     return DayOfTheWeek.FRIDAY;
                 case 2:
                     return DayOfTheWeek.SATURDAY;
                 case 3:
                     return DayOfTheWeek.SANDAY;
                 case 4:
                     return DayOfTheWeek.MONDAY;
                 case 5:
                     return DayOfTheWeek.TUESDAY;
                 case 6:
                     return DayOfTheWeek.WEDNESDAY;

             }
         }
         else { days*=(-1);
             switch ((int) (days % 7)){
             case 0:{
                 return DayOfTheWeek.THURSDAY;

             }
             case 6:
                 return DayOfTheWeek.FRIDAY;
             case 5:
                 return DayOfTheWeek.SATURDAY;
             case 4:
                 return DayOfTheWeek.SANDAY;
             case 3:
                 return DayOfTheWeek.MONDAY;
             case 2:
                 return DayOfTheWeek.THURSDAY;
             case 1:
                 return DayOfTheWeek.WEDNESDAY;


         }

         }
         return null;//chtob ne rugalsa

    }



    public static int getYear(long melis){
        return new Date(melis).getYear() + 1900;
    }

    public static boolean isVisok(long melis){

        long got = getYear(melis);
        return isVisok2(got);

    }


    public static boolean isVisok2 (long year){
        if (year % 4==0){
            if (year % 100==0){
                if (year % 400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;

    }



    public static void pechataet(int nomerGoda){

        String probeli = "      ";
        String shapka = "pn vt sr ch pt cn vs";
        System.out.println(shapka + probeli + shapka+ probeli + shapka);

        String probPeredNedel = "";

        System.out.println(formWeekToString(getMassiv(new Date(nomerGoda,0,2))));



    }

     public static String formWeekToString(int[] days){

        String s = "";

        for (int i : days){

            s = s + i + " ";
        }

        return s;
     }



    public static  int [] getMassiv( Date data){

        DayOfTheWeek den = getDayOfTheWeek(data.getTime());

        int pervoiiDen = data.getDate()-den.ordinal();

        int posledniiDen = 0;





        if (pervoiiDen < 1){
            pervoiiDen = 1;

        }

        if (pervoiiDen == 1 ){
            posledniiDen = 6 - (den.ordinal() - data.getDate());
        }

        else if(pervoiiDen + 7 > dni_V_mesyaze(data) ){
            //proveryaem esli poslednay nedelya
            posledniiDen = dni_V_mesyaze(data);

        }
        else {
            posledniiDen = pervoiiDen + 6;
        }
        //kolichestvo dnei megdu pervim i poslednim
        int d = posledniiDen - pervoiiDen + 1;


        int [] dni = new int[d];
        for (int i = 0; i <dni.length ; i++) {

            dni[i] = pervoiiDen++;


        }


        return dni;
    }

    public static void main(String[] args) {

        Date a = new Date(2016,1,1);

        //getMassiv(a);
        pechataet(2017);

    }


    public static int dni_V_mesyaze(Date date ){

        int q = date.getMonth()+1;

        if (q == 1||q==3 || q==5 ||q==7||q==8||q==10||q==12){
            return 31;

        }



          if(q == 2){
            if(isVisok(date.getTime())){
                return 29;

            }
            else {
                return 28;
            }
          }

          return 30;
    }





}

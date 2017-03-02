package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA","Ukraine");
        countries.put("RU","Russia");
        countries.put("CA","Canada");
    }
    public static void main(String[] args) {
        String number = "501234567";
        String s = "+"+"38"+"(0"+number.substring(0,2)+")"+number.substring(2,5)+"-"+number.substring(5,7)+"-"+number.substring(7,9);
        System.out.println(s);
    }

    public static class IncomeDataAdapter implements Customer, Contact{
        private IncomeData data;

        public IncomeDataAdapter(IncomeData incomeData) {
            this.data = incomeData;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName()+", "+data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String phone = String.valueOf(data.getPhoneNumber());
            StringBuilder allNumber = new StringBuilder(data.getCountryPhoneCode());
            if (phone.length()< 10){
                for (int i = 0; i < 10 - phone.length(); i++) {
                    allNumber.insert(0,'0');
                }
            }
            allNumber.append(phone);
            return  String.format( "+" + data.getCountryPhoneCode() + "("+ allNumber.substring(0,3) + ")"
                    + allNumber.substring(3,6) + "-" + allNumber.substring(6,8) + "-" + allNumber.substring(8,10));
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}
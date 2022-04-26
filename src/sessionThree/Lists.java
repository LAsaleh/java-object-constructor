package sessionThree;

import java.util.*;

public class Lists {
    public static void main(String[] args) {

    List list = new ArrayList();

    list.add(12);
    list.add(13);
    list.add(14);
    list.add(15);
    list.add(16);
    list.add(17);

    System.out.println(list);
        System.out.println(list.size());

        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());

        list.remove(Integer.valueOf( 12));
        System.out.println(list);
        System.out.println(list.size());


        List<String> names = new ArrayList<>();

        names.add("Lila");
        names.add("AYLA");
        names.add("Malak");

        System.out.println(names);
        System.out.println(names.size());
        names.remove("Lila");
        System.out.println(names);
        System.out.println(names.size());

        //String firstName = names.get(0);
       // System.out.println(firstName);
        String lastLetter = names.get(names.size() - 1);
        System.out.println(lastLetter);



        List<Double> prices = new ArrayList<>();
        prices.add(87.88);
        prices.add(88.09);
        prices.add(56.23);
        prices.add(23.11);//
        prices.add(11.00);
        prices.add(43.21);
        System.out.println(prices);
        System.out.println(prices.size());
        prices.remove(3);
        Double aDouble = prices.get(3);
        System.out.println(aDouble);
        System.out.println(prices.size());

        List<String> cities = new ArrayList<>();

        cities.add("Sanaa");
        cities.add("NYC");
        cities.add("California");
        cities.add("Italy");
        cities.add("Spain");
        cities.add("Koria");
        cities.add("Los Angelose");

//        int index = 0;
//        while(index < cities.size() ){
//            System.out.println(cities.get(index));
//            index++;
//

        for (int i = 0; i < cities.size(); i++) {
          if(cities.get(i).startsWith("N")){
              System.out.println(cities.get(i));

          }else {
              System.out.println(cities);
          }

        }

        cities.clear();
        System.out.println(cities);
        }
    }



    class Least{
        public static void main(String[] args) {

            int[] nums1 = {1,2,3,4,5};
            int[] nums2 = {4,5,6,7};

            List<Integer> list = new ArrayList<>();

            int times = nums1.length + nums2.length;

            int i = 0;     int j= 0;

            while (i < nums1.length || j < nums2.length ){
                if(i < nums1.length){
                    list.add(nums1[i]);
                    i++;
                } if(j < nums2.length){
                    list.add(nums2[j]);
                    j++;

                }

                }
            System.out.println(list);
            }






//            for (int i = 0; i < times; i++) {
//
//
//            }



        }



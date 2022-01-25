package esgi.bdd.gr19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PriceService {

    public static double getPrice(List<Book> listBook){
        double price = 0;
        double initialPrice = 8;

         Set<Book> distinctIds = new HashSet<>();

         while (!listBook.isEmpty()){

             distinctIds.addAll(listBook);

             if (distinctIds.size() == 2){
                 price += (initialPrice * 0.95 * distinctIds.size());
             }else if  (distinctIds.size() == 3){
                 price += (initialPrice * 0.90 * distinctIds.size());
             }else if  (distinctIds.size() == 4){
                 price += (initialPrice * 0.80 * distinctIds.size());
             }else if  (distinctIds.size() == 5){
                 price += (initialPrice * 0.75 * distinctIds.size());
             }else{
                 price += listBook.size() * initialPrice;
                 listBook.clear();
             }

             while(!distinctIds.isEmpty()){
                 listBook.remove(distinctIds.stream().iterator().next());
                 distinctIds.remove(distinctIds.stream().iterator().next());
             }
         }

        return price;
    }
}

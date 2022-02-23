package esgi.bdd.gr19;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * Unit test for simple App.
 */
public class BookByWithReductionTest
{
    HashMap<String, Book> allBook = new HashMap<String, Book>();
    ArrayList<Book> listBook = new ArrayList<>();
    double priceList = 0.0;

    @Before
    public void init(){
        allBook.put("Harry_potter", new Book(1));
        allBook.put("Guerre_et_paix", new Book(2));
        allBook.put("Narnia", new Book(3));
        allBook.put("Seigneur_des_anneaux", new Book(4));
        allBook.put("BDD_pour_les_nuls", new Book(5));
    }

    @ParameterType("numberBook")
    public int numberBook(String numberBook){
        return parseInt(numberBook);
    }


    @ParameterType(".*")
    public String typeOfBook(String typeOfBook){
        return typeOfBook;
    }

    @ParameterType("price")
    public double price(String price){
        return parseDouble(price);
    }


    @Given("{int} livre de type {typeOfBook}")
    public void livredetype(int numberBook,  String typeOfBook) {
        for(int i =0;i<numberBook;i++){
            listBook.add(allBook.get(typeOfBook));
        }
    }

    @When("On achete la liste de livre")
    public void onAcheteLaListeDeLivre() {
       priceList =  PriceService.getPrice(listBook);
    }

    @Then("la liste doit nous couter {double} euros")
    public void laListeDoitNousCouterEuros(double price) {
        Assertions.assertThat(priceList).isEqualTo(price);
    }


}

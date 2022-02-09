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

/**
 * Unit test for simple App.
 */
public class BookByWithReductionTest
{
    ArrayList<Book> allBook = new ArrayList<>();
    ArrayList<Book> listBook = new ArrayList<>();
    double priceList = 0.0;

    @Before
    public void init(){
        allBook.add(new Book(1));
        allBook.add(new Book(2));
        allBook.add(new Book(3));
        allBook.add(new Book(4));
        allBook.add(new Book(5));
    }

    @ParameterType("numberBook")
    public int numberBook(String numberBook){
        return parseInt(numberBook);
    }


    @ParameterType("typeOfBook")
    public int typeOfBook(String typeOfBook){
        return parseInt(typeOfBook);
    }

    @ParameterType("price")
    public double price(String price){
        return parseDouble(price);
    }


    @Given("{int} livre de type {int}")
    public void LivreDeType(int numberBook, int typeOfBook) {
        for(int i =0;i<numberBook;i++){
            listBook.add(allBook.get(typeOfBook-1));
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

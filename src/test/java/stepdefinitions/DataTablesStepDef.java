package stepdefinitions;

import io.cucumber.java.en.*;

import java.util.List;
import java.util.Map;

public class DataTablesStepDef {
    @When("I search for String on google")
    public void i_search_for_string_on_google(io.cucumber.datatable.DataTable dataTable) {

        //List<List<String>> dataTable up inside condtion
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.

        List<String> listData = dataTable.row(2);
        listData.get(0);
        listData.get(1); //sulyman ex to list

        List<Map<String,String>> maplist= dataTable.asMaps();
        maplist.get(0).get("name"); //sulyman ex to map

        //
        // For other transformations you can register a DataTableType. //eimer ex

//        for (int i = 0 ; i<dataTable.size(); i++) {
//            System.out.println(dataTable.get(i));
//        }

    }
    @Then("I should see String on the result")
    public void i_should_see_string_on_the_result() {
        // Write code here that turns the phrase above into concrete actions

    }
}

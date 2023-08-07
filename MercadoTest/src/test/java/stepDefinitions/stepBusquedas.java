package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pom.HomePag;
import pom.OfertasPag;

public class stepBusquedas {
	
	private WebDriver driver;
	HomePag home;
	
	//ID 2
	@Given("usuario entra a la página")
	public void usuario_entra_a_la_página() {
	    // Write code here that turns the phrase above into concrete actions
		home= new HomePag(driver);
		driver = home.chromeDriverConnection();
		home.visit("https://www.mercadolibre.com.mx/");
	}

	@When("escribe un producto en el buscador")
	public void escribe_un_producto_en_el_buscador() {
	    // Write code here that turns the phrase above into concrete actions
	    home.buscarProducto("Silla de escritorio");
	}

	@When("click en buscar producto")
	public void click_en_buscar_producto() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    home.clickBuscar();
	}

	@When("filtra por mas relevantes")
	public void filtra_por_mas_relevantes() {
	    // Write code here that turns the phrase above into concrete actions
	    home.filtroRelevantes();
	}

	@Then("productos ordenados por relevancia")
	public void productos_ordenados_por_relevancia() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    home.validacionResultadosFiltros();
	}
	
	//ID 3
	
	@When("filtra por menor precio")
	public void filtra_por_menor_precio() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    home.filtroMenorPrecio();
	}

	@Then("productos ordenados por menor precio")
	public void productos_ordenados_por_menor_precio() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    home.validacionResultadosFiltros();
	}
	
	//ID 4
	
	@When("filtra por mayor precio")
	public void filtra_por_mayor_precio() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    home.filtroMayorPrecio();
	}

	@Then("productos ordenados por mayor precio")
	public void productos_ordenados_por_mayor_precio() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    home.validacionResultadosFiltros();
	}
	
}

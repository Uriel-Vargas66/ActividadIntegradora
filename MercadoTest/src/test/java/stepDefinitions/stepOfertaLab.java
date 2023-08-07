package stepDefinitions;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.OfertasLabPage;
import pom.OfertasPag;

public class stepOfertaLab {
	private WebDriver driver;
	OfertasLabPage oLaborales;
	
	//ID 10
	@Given("Usuario entra a mercado libre")
	public void usuario_entra_a_mercado_libre() {
	    // Write code here that turns the phrase above into concrete actions
		oLaborales = new OfertasLabPage(driver);
		driver = oLaborales.chromeDriverConnection();
		oLaborales.visit("https://www.mercadolibre.com.mx/");
	}

	@When("click en trabaja con nosotros")
	public void click_en_trabaja_con_nosotros() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    oLaborales.clickTrabaja();
	}

	@Then("se muestra la pagina de ofertas laborales")
	public void se_muestra_la_pagina_de_ofertas_laborales() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    oLaborales.verificarPagOfertas();
	}
	
	//ID 9
	@When("click en ver oportunidades")
	public void click_en_ver_oportunidades() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    oLaborales.clickVerOportunidades();
	}

	@When("click postularse")
	public void click_postularse() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    oLaborales.clickPostularse();
	}

	@When("rellenar formulario")
	public void rellenar_formulario() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    oLaborales.ingresarNombre("Uriel");
	    oLaborales.ingresarApellido("Vargas");
	    oLaborales.ingresarNumTel("5546654610");
	    oLaborales.ingresarCorreo("urielprueba909@gmail.com");
	    oLaborales.ingresarLinkd("12345");
	    oLaborales.ingresarNombre("Uriel");
	}
	

	@When("click continuar")
	public void click_continuar() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    oLaborales.clickContinuar();
	}

	@Then("postulacion exitosa")
	public void postulacion_exitosa() {
	    // Write code here that turns the phrase above into concrete actions
	    oLaborales.confPostulacion();
	}
}

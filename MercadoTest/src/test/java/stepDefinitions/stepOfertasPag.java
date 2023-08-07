package stepDefinitions;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pom.HomePag;
import pom.OfertasPag;



public class stepOfertasPag {

	private WebDriver driver;
	HomePag home;
	OfertasPag ofertas;
	
	
	// ID 1  
	@Given("Usuario entra a la pagina")
	public void usuario_entra_a_la_pagina() {
	    // Write code here that turns the phrase above into concrete actions
		
		ofertas = new OfertasPag(driver);
		driver = ofertas.chromeDriverConnection();
		ofertas.visit("https://www.mercadolibre.com.mx/");
	}

	@When("click ofertas")
	public void click_ofertas() {
	    // Write code here that turns the phrase above into concrete actions
	    ofertas.clickOfertas();
	}

	@When("establece un rango de precios")
	public void establece_un_rango_de_precios() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    ofertas.ajustarRangoPrecios("500", "500");
	}

	@When("aplica el filtro rango de precios")
	public void aplica_el_filtro_rango_de_precios() {
	    // Write code here that turns the phrase above into concrete actions
	    ofertas.clickAplicarRango();
	}

	@Then("ver mesaje de advertencia, rango invalido")
	public void ver_mesaje_de_advertencia_rango_invalido() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    ofertas.validacionResultados();
	    System.out.println("Se muestran resultados por lo que hay un bug");
	}
	
	// ID 5
	
	@When("click filtro envio gratis")
	public void click_filtro_envio_gratis() {
	    // Write code here that turns the phrase above into concrete actions
	    ofertas.clickCostoEnvioGratis();
	}

	@Then("productos se muestran de acuerdo a si su envio es gratis")
	public void productos_se_muestran_de_acuerdo_a_si_su_envio_es_gratis() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    ofertas.validacionResultados();
	}
	
	//ID 6
	
	@When("click filtro meses sin intereses")
	public void click_filtro_meses_sin_intereses() {
	    // Write code here that turns the phrase above into concrete actions
	    ofertas.clickMesesSinInt();
	}

	@Then("productos se muestran de acuerdo a meses sin intereses")
	public void productos_se_muestran_de_acuerdo_a_meses_sin_intereses() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    ofertas.validacionResultados();
	}
	
	//ID 7
	@When("click filtro oferta del dia")
	public void click_filtro_oferta_del_dia() {
	    // Write code here that turns the phrase above into concrete actions
	    ofertas.clickOfertaDia();
	}

	@Then("productos se muestran de acuerdo a oferta del dia")
	public void productos_se_muestran_de_acuerdo_a_oferta_del_dia() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    ofertas.validacionResultados();
	}
	
	//ID 10
	
	@When("click en liquidacion")
	public void click_en_liquidacion() {
	    // Write code here that turns the phrase above into concrete actions
	    ofertas.clickSeccLiquidacion();
	}

	@Then("productos en liquidacion se muestran")
	public void productos_en_liquidacion_se_muestran() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   ofertas.validacionResultados();
	}
}

package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfertasPag extends Base{

	public OfertasPag(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//Identificando elementos
	
	//Filtros
	By BtnOfertas = By.xpath("(//a[@class='nav-menu-item-link'])[1]");
	
	By InputPrecioMin = By.xpath("//input[@id='min_input']");
	By InputPrecioMax = By.xpath("//input[@id='max_input']");
	By BtnAplicarRango = By.xpath("//button[@class='price-filter__action-link active']");
	By LblValidacionNumRes = By.xpath("//span[@class='ui-search-search-result__quantity-results shops-custom-secondary-font']");
	
	By BtnOfertaDia = By.xpath("(//a[@class='list_element '])[1]");
	By BtnCostoEnvioGratis = By.xpath("(//a[@class='list_element '])[29]");
	By BtnMesesSinInt = By.xpath("(//a[@class='list_element '])[30]");
	
	By BtnSeccLiquidacion = By.xpath("(//div[@class='carousel_item '])[4]");
	
	public void clickOfertas() {
		click(BtnOfertas);
	}
	public void ajustarRangoPrecios(String min, String max) throws InterruptedException {
		Thread.sleep(100);
		scrollHacia(InputPrecioMin);
		type(min, InputPrecioMin);
		type(max, InputPrecioMax);
		
	}
	
	public void clickAplicarRango() {
		click(BtnAplicarRango);
	}
	
	public void clickOfertaDia() {
		scrollHacia(BtnOfertaDia);
		click(BtnOfertaDia);
	}
	
	public void clickCostoEnvioGratis() {
		scrollHacia(BtnCostoEnvioGratis);
		click(BtnCostoEnvioGratis);
	}
	public void clickMesesSinInt() {
		scrollHacia(BtnMesesSinInt);
		click(BtnMesesSinInt);
	}
	public void clickSeccLiquidacion() {
		click(BtnSeccLiquidacion);
	}
	
	public Boolean validacionResultados() throws InterruptedException {
		Thread.sleep(100);
		return isDisplayed(LblValidacionNumRes);
	}
}

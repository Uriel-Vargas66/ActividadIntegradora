package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePag extends Base{

	public HomePag(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Identificando los elementos
	By BtnOfertas = By.xpath("(//a[@class='nav-menu-item-link'])[1]");
	By BtnBuscar = By.xpath("//button[@class='nav-search-btn']");
	By InputBuscador = By.xpath("//input[@class='nav-search-input']");
	By BtnMasInfo = By.xpath("//button[@id='nav-footer-access-switch']");
	By BtnOfertasTrabajo = By.xpath("//a[text()='Trabaja con nosotros']");
	
	By BtnFiltroGen = By.xpath("//button[@class='andes-dropdown__trigger']");
	By BtnFiltroMenorPrecio = By.xpath("(//li[@class='andes-list__item andes-list__item--size-medium'])[1]");
	By BtnFiltroMayorPrecio = By.xpath("(//li[@class='andes-list__item andes-list__item--size-medium'])[2]");
	By LblValidacionNumRes = By.xpath("//span[@class='ui-search-search-result__quantity-results shops-custom-secondary-font']");
	
	public void clickOfertas() {
		click(BtnOfertas);
	}
	
	public void buscarProducto(String producto) {
		type(producto, InputBuscador);
		
	}
	
	public void clickBuscar() throws InterruptedException {
		Thread.sleep(100);
		click(BtnBuscar);
	}
	
	public void filtroRelevantes() {
		click(BtnFiltroGen);
	}
	
	public void filtroMenorPrecio() throws InterruptedException {
		click(BtnFiltroGen);
		Thread.sleep(1000);
		click(BtnFiltroMenorPrecio);
		Thread.sleep(1000);
	}
	
	public void filtroMayorPrecio() throws InterruptedException {
		click(BtnFiltroGen);
		Thread.sleep(1000);
		click(BtnFiltroMayorPrecio);
		Thread.sleep(1000);
	}
	
	public void clickOfertasTrabajo() {
		click(BtnOfertasTrabajo);
	}
	
	public Boolean validacionResultadosFiltros() throws InterruptedException {
		Thread.sleep(100);
		return isDisplayed(LblValidacionNumRes);
	}
}

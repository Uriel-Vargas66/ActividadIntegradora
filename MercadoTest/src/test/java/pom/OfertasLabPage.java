package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfertasLabPage extends Base{

	public OfertasLabPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//identificando elementos
	By BtnOfertasTrabajo = By.xpath("//a[text()='Trabaja con nosotros']");
	By LblVerificacionOfertasLab = By.xpath("//p[text()='únete A MELI']");
	By BtnVerOportunidades = By.xpath("(//span[@class='styles__Wrapper-sc-g49ob4-0 bpAbpc button button'])[1]");
	By BtnOferta = By.xpath("//div[@class='card position-card pointer card-selected']");
	By BtnPostularse = By.xpath("//button[@class='btn position-apply-button  ']");
	By InputNombre = By.xpath("(//input[@class='form-control apply-form-text-input'])[1]");
	By InputApellido = By.xpath("(//input[@class='form-control apply-form-text-input'])[2]");
	By InputNumTel = By.xpath("(//input[@class='form-control apply-form-text-input'])[3]");
	By InputConfirmacion = By.xpath("(//input[@class='select-input_wGbAi59 input-medium_vB9cAJb pill-shape_VI1Qnyg pill-shape-with-icon-button_Spo8nfv input-stretch_VZcUk0E right-icon_fyfzLub clear-not-visible_i3H98Bv'])[1]");
	By InputCorreo = By.xpath("(//input[@class='form-control apply-form-text-input'])[4]");
	By InputLinkd = By.xpath("(//input[@class='form-control apply-form-text-input'])[5]");
	By BtnContinuarPost = By.xpath("//button[@class='btn-sm btn-primary pointer position-apply-button']");
	By LblVerificacionPostulacion = By.xpath("//p[@class='sub-title']");
	By BtnCookies = By.xpath("//button[@class='cookie-consent-banner-opt-out__action cookie-consent-banner-opt-out__action--primary cookie-consent-banner-opt-out__action--key-accept']");
	By BtnPrivacidad = By.xpath("(//button[@class='icon-button_n6jMJ_3 right-icon_fyfzLub button_ir66sw5 button-system-ui_u0RC0pq transparent_QpLDg_Y button-medium_wvT76RU round-shape_Xnr0CB8 icon-left_jwxTZMU'])[1]");
	By BtnPrivacidadSi = By.xpath("(//button[@class='menu-item-button_G1RYpSC'])[1]");
	public void clickTrabaja() throws InterruptedException {
		click(BtnCookies);
		scrollHacia(BtnOfertasTrabajo);
		Thread.sleep(100);
		click(BtnOfertasTrabajo);
	}
	
	public Boolean verificarPagOfertas() throws InterruptedException {
		Thread.sleep(100);
		return isDisplayed(LblVerificacionOfertasLab);
	}
	
	public void clickVerOportunidades() throws InterruptedException {
		Thread.sleep(100);
		
		click(BtnVerOportunidades);
	}
	
	public void clickPostularse() throws InterruptedException {
		Thread.sleep(5000);
		cambiaVentana();
		click(BtnPostularse);
		
	}
	
	public void ingresarNombre(String nombre) throws InterruptedException {
		Thread.sleep(1000);
		type(nombre, InputNombre);
	}
	
	public void ingresarApellido(String apellido) throws InterruptedException {
		Thread.sleep(100);
		type(apellido, InputApellido);
	}
	
	public void ingresarNumTel(String num) throws InterruptedException {
		Thread.sleep(100);
		type(num, InputNumTel);
	}
	
	public void ingresarCorreo(String correo) throws InterruptedException {
		Thread.sleep(10);
		type(correo, InputCorreo);
	}
	
	public void ingresarLinkd(String linkd) throws InterruptedException {
		Thread.sleep(10);
		type(linkd, InputLinkd);
	}
	
	
	public void clickContinuar() throws InterruptedException {
		click(BtnPrivacidad);
		Thread.sleep(1000);
		click(BtnPrivacidadSi);
		click(BtnContinuarPost);
	}
	
	public Boolean confPostulacion() {
		return isDisplayed(LblVerificacionPostulacion);
	}
}

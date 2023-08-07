package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
	features = {"src/test/resources/ID1_ValInvalidos.feature",
			    "src/test/resources/ID2_FiltroMasRelev.feature", 
			    "src/test/resources/ID3_FiltroMenorPrecio.feature", 
			    "src/test/resources/ID4_FiltroMayorPrecio.feature",
				"src/test/resources/ID5_FiltroEnvioGratis.feature",
				"src/test/resources/ID6_FiltroMesesSinInt.feature",
				"src/test/resources/ID7_FiltroOfertaDia.feature",
				"src/test/resources/ID8_OfertasLab.feature",
				"src/test/resources/ID9_PostOfertaLab.feature",
				"src/test/resources/ID10_SeccionLiquidacion.feature"},
	
	glue = {"stepDefinitions"},
	plugin = {"pretty", "html:target/cucumberReporte/reporte.html"}		
	)

public class run extends AbstractTestNGCucumberTests{

}
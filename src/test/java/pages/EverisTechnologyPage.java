package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.DriverFactory;

public class EverisTechnologyPage extends DriverFactory {

	WebDriverWait wait;
	WebElement tituloTechnology;
	String elementoTitulo = "//*[@id=\"header_bgmedia\"]/div/div/hgroup/div/div[2]/div/h1";
	String tituloCapturado = "";

	public void capturaTituloTechnology() {
		wait = new WebDriverWait(pegaDriver(), 15);
		tituloTechnology = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementoTitulo)));
		tituloCapturado = tituloTechnology.getText();
		System.out.println("Titulo da pagina: " + tituloCapturado);
	}

	public void validarTextoTechnology() {
		assertTrue("Titulo está errado", tituloCapturado.contains("technology"));
	}
}

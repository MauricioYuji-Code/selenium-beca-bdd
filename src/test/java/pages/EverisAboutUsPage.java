package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.DriverFactory;

public class EverisAboutUsPage extends DriverFactory {

	WebDriverWait wait;
	WebElement tituloAboutUs;
	String elementoTitulo = "//*[@id=\"block-system-main\"]/div/div[1]/div/div[1]/div/div/hgroup/div/div[2]/div/h1";
	String tituloCapturado = "";

	public void validaUrlAboutUs() {
		// wait = new WebDriverWait(pegaDriver(), 15);
		assertTrue("A URL não carregou", pegaDriver().getCurrentUrl().contains("about-us-brazil"));
	}

	public void capturaTituloAboutUs() {
		wait = new WebDriverWait(pegaDriver(), 15);
		tituloAboutUs = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementoTitulo)));
		tituloCapturado = tituloAboutUs.getText();
		System.out.println("Titulo da pagina: " + tituloCapturado);
	}

	public void validaTituloAboutUs() {
		assertTrue("Titulo está errado", tituloCapturado.contains("about us"));
	}

}

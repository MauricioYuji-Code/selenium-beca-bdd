package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.DriverFactory;

public class EverisPrincipalPage extends DriverFactory {

	Actions actions;
	WebDriverWait wait;
	WebElement botaoAboutUs;
	WebElement hoverWhatWeDo;
	WebElement botaoTechnology;
	String elementoBotaoAboutUs = "about us";
	String elementoBotaoTechnology = "technology";
	String elementoWhatsWeDo = "//*[@id=\"block-system-main-menu\"]/ul/li[1]/span";

	public void validaUrlEveris() {
		wait = new WebDriverWait(pegaDriver(), 15);
		assertTrue("A URL não carregou", pegaDriver().getCurrentUrl().contains("everis"));
	}

	public void validaPaginaEveris() {
		assertTrue("A palavra 'Consulting' não apareceu", pegaDriver().getPageSource().contains("Consulting"));
	}

	public void clicarBotaoAboutUs() {
		wait = new WebDriverWait(pegaDriver(), 15);
		botaoAboutUs = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(elementoBotaoAboutUs)));
		botaoAboutUs.click();
	}

	public void hoverMenuWhatWeDo() {
		actions = new Actions(pegaDriver());
		hoverWhatWeDo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementoWhatsWeDo)));
		actions.moveToElement(hoverWhatWeDo).build().perform();
	}
	
	public void clicarOpcaoTechnology() {
		wait = new WebDriverWait(pegaDriver(), 15);
		botaoTechnology = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(elementoBotaoTechnology)));
		botaoTechnology.click();

	}

}

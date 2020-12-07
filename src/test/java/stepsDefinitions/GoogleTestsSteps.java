package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.EverisAboutUsPage;
import pages.EverisPrincipalPage;
import pages.EverisTechnologyPage;
import pages.GooglePesquisaPage;
import pages.GoogleResultadosPage;

public class GoogleTestsSteps {

	GooglePesquisaPage googlePesquisaPage = new GooglePesquisaPage();
	GoogleResultadosPage googleResultadosPage = new GoogleResultadosPage();
	EverisPrincipalPage everisPrincipalPage = new EverisPrincipalPage();
	EverisAboutUsPage everisAboutUsPage = new EverisAboutUsPage();
	EverisTechnologyPage everisTechnologyPage = new EverisTechnologyPage();

	@Dado("que eu navego ate a url do google")
	public void que_eu_navego_ate_a_url_do_google() {
		googlePesquisaPage.navegaGoogle();
	}

	@Quando("a pagina e carregada")
	public void a_página_e_carregada() {
		googlePesquisaPage.validaUrlGoogle();
	}

	@Entao("eu consigo validar que e a pagina do google")
	public void eu_consigo_validar_que_e_a_pagina_do_google() {
		googlePesquisaPage.validaPaginaGoogle();
	}

	@Quando("eu pesquiso por everis no campo de pesquisa")
	public void eu_pesquiso_por_everis_no_campos_de_pesquisa() {
		googlePesquisaPage.pesquisaEveris();
	}

	@E("clico no botao pesquisar")
	public void clico_no_botao_pesquisar() {
		googlePesquisaPage.realizaScrollBotao();
		googlePesquisaPage.clicarBotaoPesquisa();
	}

	@Entao("o texto de destaque aparece no lado direito da pagina")
	public void o_texto_de_destaque_aparece_no_lado_direito_da_pagina() {
		googleResultadosPage.capturaTextoDestaque();
		googleResultadosPage.validaTextoDestaqueEveris();
	}

	@Quando("eu clico no link da Everis")
	public void eu_clico_no_link_da_everis() {
		googleResultadosPage.clicarLinkEveris();
	}

	@Quando("a pagina da Everis e carregada")
	public void a_pagina_da_everis_e_carregada() {
		everisPrincipalPage.validaUrlEveris();
	}

	@Entao("eu consigo validar que e a pagina da Everis")
	public void eu_consigo_validar_que_e_a_pagina_da_everis() {
		everisPrincipalPage.validaPaginaEveris();
	}

	@Quando("eu clico no botao about us")
	public void eu_clico_no_botao_about_us() {
		everisPrincipalPage.clicarBotaoAboutUs();
	}

	@Quando("a pagina de about us e carregada")
	public void a_pagina_de_about_us_e_carregada() {
		everisAboutUsPage.validaUrlAboutUs();
	}

	@Entao("eu consigo validar o titulo principal")
	public void eu_consigo_validar_o_titulo_principal() {
		everisAboutUsPage.capturaTituloAboutUs();
		everisAboutUsPage.validaTituloAboutUs();
	}

	@Quando("eu realizar o hover no menu what we do")
	public void eu_realizar_o_hover_no_menu_what_we_do() {
		everisPrincipalPage.hoverMenuWhatWeDo();
	}

	@Quando("clicar na opcao technology")
	public void clicar_na_opcao_technology() {
		everisPrincipalPage.clicarOpcaoTechnology();
	}

	@Entao("eu consigo validar o texto principal technology")
	public void eu_consigo_validar_o_texto_principal_technology() {
		everisTechnologyPage.capturaTituloTechnology();
		everisTechnologyPage.validarTextoTechnology();
	}

}

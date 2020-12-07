# language: pt
Funcionalidade: Realizar uma pesquisa no google
  
  Eu, como Automatizador
  Quero poder realizar uma pesquisa no google
  Para que eu treine a minha automação

  Cenario: Validar pagina do google carregada
    Dado que eu navego ate a url do google
    Quando a pagina e carregada
    Entao eu consigo validar que e a pagina do google

  Cenario: Pesquisar por Everis no google
    Dado que eu navego ate a url do google
    E a pagina e carregada
    E eu consigo validar que e a pagina do google
    Quando eu pesquiso por everis no campo de pesquisa
    E clico no botao pesquisar
    Entao o texto de destaque aparece no lado direito da pagina

  Cenario: Validar a url da home do site da everis
    Dado que eu navego ate a url do google
    E a pagina e carregada
    E eu consigo validar que e a pagina do google
    E eu pesquiso por everis no campo de pesquisa
    E clico no botao pesquisar
    Quando eu clico no link da Everis
    E a pagina da Everis e carregada
    Entao eu consigo validar que e a pagina da Everis

  Cenario: Clicar no link de about us no site da everis e validar o titulo principal
    Dado que eu navego ate a url do google
    E a pagina e carregada
    E eu consigo validar que e a pagina do google
    E eu pesquiso por everis no campo de pesquisa
    E clico no botao pesquisar
    E eu clico no link da Everis
    E a pagina da Everis e carregada
    Quando eu clico no botao about us
    E a pagina de about us e carregada
    Entao eu consigo validar o titulo principal


  Cenario: Realizar hover no menu what we do, clicar na opçao technology e validar texto principal technology no site da everis
  	Dado que eu navego ate a url do google
    E a pagina e carregada
    E eu consigo validar que e a pagina do google
    E eu pesquiso por everis no campo de pesquisa
    E clico no botao pesquisar
    E eu clico no link da Everis
    E a pagina da Everis e carregada
    Quando eu realizar o hover no menu what we do 
    E clicar na opcao technology
    Entao eu consigo validar o texto principal technology

package Tests;

import Elementos.elementos;
import Pages.metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class steps {
	elementos El = new elementos();
	metodos Met = new metodos();
	
	
	
	@Given("^que eu entre no site \"([^\"]*)\"$")
	public void que_eu_entre_no_site(String site) throws Throwable {
		Met.abrirSite(site,"CHROME");
		Met.prencher(El.getCampoDepesquisa(), "olx");
		Met.pausa(6000);
		Met.clicar(El.getBtnPesquisar());
		Met.pausa(8000);
		Met.clicar(El.getSiteSelecionado());
		Met.pausa(4000);
		Met.clicar(El.getBtnEntrar());
		Met.prencher(El.getCampoEmail(), "guilhermevargascarmo@gmail.com");
		Met.prencher(El.getCampoSenha(), "fc230978");
		Met.pausa(4000);
		Met.clicar(El.getBtnLogar());
		Met.pausa(4000);
		Met.clicar(El.getBtnOlx());
		Met.pausa(3000);
		Met.prencher(El.getCampoPesquisaOlx(), "bateria roland");
		Met.pausa(3000);
		Met.clicar(El.getBtnLupa());
		Met.pausa(4000);
		Met.clicar(El.getIntrumentoSelecionado());
		Met.pausa(8000);
		Met.clicar(El.getBtnChat());
		
	}

	@When("^eu pesquisar o intrumento$")
	public void eu_pesquisar_o_intrumento() throws Throwable {
	   
	}

	@Then("^envie uma msg para o vendedor$")
	public void envie_uma_msg_para_o_vendedor() throws Throwable {
	  
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

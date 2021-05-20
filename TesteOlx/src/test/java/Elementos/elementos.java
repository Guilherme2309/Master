package Elementos;

import org.openqa.selenium.By;

public class elementos {
	
	private By campoDepesquisa = By.name("q");
	
	private By btnPesquisar = By.xpath("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[3]/center/input[1]");
	
	private	By siteSelecionado = By.cssSelector("#rso > div:nth-child(1) > div > div > div > div.yuRUbf > a > h3 > span");
	
	private By btnEntrar = By.xpath("/html/body/div/div[1]/div[1]/header/div[3]/a[4]");
	
	private By campoEmail = By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/form/div[1]/div[2]/input");
	
	private By campoSenha = By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/form/div[2]/div[2]/div/div/input");
	
	private By btnLogar = By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/form/button");
	
    private By btnOlx = By.cssSelector("#main-page-content > div:nth-child(1) > div.sc-iNovjJ.jHNyQQ > header > div.sc-fEVUGC.hbuahQ > a > svg");
    
    private By campoPesquisaOlx = By.id("searchtext");
	
	private By btnLupa = By.cssSelector("#___gatsby > div.bigger-grid-style > div.iza-top > div.iza-container.container > div:nth-child(1) > div > div > div > div.searchButtonBox > button > svg");
	
	private By intrumentoSelecionado = By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div[9]/div[2]/div/div/div/div/div[3]/div/div/div[1]/div/span");
	
	private By btnChat = By.cssSelector("#miniprofile > div > div > div.sc-eAudoH.fasAcL.sc-jTzLTM.iwtnNi > div > div > div.sc-hmzhuo.sc-12hn837-0.jBhsYi.sc-jTzLTM.iwtnNi > div");
	
	private By campoDeConversa = By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div[9]/div[2]/div/div/div/div/div[4]/div/div/div/div/div/div/div[3]/div[1]/div[4]/textarea");
	
	private By btnEnviarMsg = By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div[9]/div[2]/div/div/div/div/div[4]/div/div/div/div/div/div/div[3]/div[1]/div[4]/div[2]/div/svg");
	
	private By fotosDaBateria = By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[3]/div/div/div[3]/ul/li[2]/div/img");
	
	private By btnConversas = By.xpath("/html/body/div/div[1]/div[1]/header/div[3]/a[3]");
	
    private By btnYoutube = By.xpath("/html/body/div[1]/div/div[3]/footer/div/div[1]/div[2]/a[2]/svg/path");
    
    private By btnCampoPesquisaYoutube = By.name("search_query");
    
    private By btnLupaYout = By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/button/yt-icon");
    
    private By videoIssoETudo = By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a/yt-formatted-string");

	public By getCampoDepesquisa() {
		return campoDepesquisa;
	}

	public void setCampoDepesquisa(By campoDepesquisa) {
		this.campoDepesquisa = campoDepesquisa;
	}

	public By getBtnPesquisar() {
		return btnPesquisar;
	}

	public void setBtnPesquisar(By btnPesquisar) {
		this.btnPesquisar = btnPesquisar;
	}

	public By getSiteSelecionado() {
		return siteSelecionado;
	}

	public void setSiteSelecionado(By siteSelecionado) {
		this.siteSelecionado = siteSelecionado;
	}

	public By getBtnEntrar() {
		return btnEntrar;
	}

	public void setBtnEntrar(By btnEntrar) {
		this.btnEntrar = btnEntrar;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public void setCampoEmail(By campoEmail) {
		this.campoEmail = campoEmail;
	}

	public By getCampoSenha() {
		return campoSenha;
	}

	public void setCampoSenha(By campoSenha) {
		this.campoSenha = campoSenha;
	}

	public By getBtnLogar() {
		return btnLogar;
	}

	public void setBtnLogar(By btnLogar) {
		this.btnLogar = btnLogar;
	}

	public By getBtnOlx() {
		return btnOlx;
	}

	public void setBtnOlx(By btnOlx) {
		this.btnOlx = btnOlx;
	}

	public By getCampoPesquisaOlx() {
		return campoPesquisaOlx;
	}

	public void setCampoPesquisaOlx(By campoPesquisaOlx) {
		this.campoPesquisaOlx = campoPesquisaOlx;
	}

	public By getBtnLupa() {
		return btnLupa;
	}

	public void setBtnLupa(By btnLupa) {
		this.btnLupa = btnLupa;
	}

	public By getIntrumentoSelecionado() {
		return intrumentoSelecionado;
	}

	public void setIntrumentoSelecionado(By intrumentoSelecionado) {
		this.intrumentoSelecionado = intrumentoSelecionado;
	}

	public By getBtnChat() {
		return btnChat;
	}

	public void setBtnChat(By btnChat) {
		this.btnChat = btnChat;
	}

	public By getCampoDeConversa() {
		return campoDeConversa;
	}

	public void setCampoDeConversa(By campoDeConversa) {
		this.campoDeConversa = campoDeConversa;
	}

	public By getBtnEnviarMsg() {
		return btnEnviarMsg;
	}

	public void setBtnEnviarMsg(By btnEnviarMsg) {
		this.btnEnviarMsg = btnEnviarMsg;
	}

	public By getFotosDaBateria() {
		return fotosDaBateria;
	}

	public void setFotosDaBateria(By fotosDaBateria) {
		this.fotosDaBateria = fotosDaBateria;
	}

	public By getBtnConversas() {
		return btnConversas;
	}

	public void setBtnConversas(By btnConversas) {
		this.btnConversas = btnConversas;
	}

	public By getBtnYoutube() {
		return btnYoutube;
	}

	public void setBtnYoutube(By btnYoutube) {
		this.btnYoutube = btnYoutube;
	}

	public By getBtnCampoPesquisaYoutube() {
		return btnCampoPesquisaYoutube;
	}

	public void setBtnCampoPesquisaYoutube(By btnCampoPesquisaYoutube) {
		this.btnCampoPesquisaYoutube = btnCampoPesquisaYoutube;
	}

	public By getBtnLupaYout() {
		return btnLupaYout;
	}

	public void setBtnLupaYout(By btnLupaYout) {
		this.btnLupaYout = btnLupaYout;
	}

	public By getVideoIssoETudo() {
		return videoIssoETudo;
	}

	public void setVideoIssoETudo(By videoIssoETudo) {
		this.videoIssoETudo = videoIssoETudo;
	}
    
    
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

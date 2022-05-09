package registro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagina {
    private WebDriver navegador;
    public void FormularioDeCadastro(WebDriver navegador){
        this.navegador = navegador;
    }

    public LoginPagina informarNomeDoUsuario(String Nome) {
        navegador.findElement(By.id("nome")).sendKeys(Nome);
        return this;
    }
    public LoginPagina informarSobrenomeDoUsuario(String Sobrenome) {
        navegador.findElement(By.id("sobrenome")).sendKeys(Sobrenome);
        return this;}
    public LoginPagina informarEnderecoDoUsuario(String Endereco) {
        navegador.findElement(By.id("endereco")).sendKeys(Endereco);
        return this;}
    public LoginPagina informarEmailDoUsuario(String Email) {
        navegador.findElement(By.id("email")).sendKeys(Email);
        return this;}
    public LoginPagina informarTelefoneDoUsuario(String Telefone) {
        navegador.findElement(By.id("telefone")).sendKeys(Telefone);
        return this;}

}

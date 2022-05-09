package registro;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
public class RegistroTest<DSL> {
    public WebDriver navegador;
    private DSL dsl;
    @Before
    public void acesso() {
        FirefoxDriver driver = new FirefoxDriver();
        //Abrir um navegador
        this.navegador = new ChromeDriver();
        //Vou maximizar a tela
        this.navegador.manage().window().maximize();
        //Vou definir um tempo de espera padrão de 5 segundos
        this.navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Vou navegar para a a pagina da lojinha web
        this.navegador.get("http://demo.automationtesting.in/Register.html");
    }
        @Test
        public void cadastroSiteAutomation(){
//            dsl.preenche("elementosForm:nome", "Teste de escrita");
//            Assert.assertEquals("Teste de escrita", dsl.cobterValorCampo("elementosForm:nome"));
//

        }

}

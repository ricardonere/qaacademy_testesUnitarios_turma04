import org.openqa.selenium.WebDriver;

public class TreinamentoCadastroPagina {
    private DSL dsl;

    public void CampoTreinamentoPage(WebDriver driver) {
        dsl = new DSL(driver);
    }

    public void setNome(String nome) {
        dsl.preenche("elementosForm:nome", nome);

    }

    public void setSobrenome(String sobrenome) {
        dsl.preenche("elementosForm:sobrenome", sobrenome);
    }

    public void setEndereco(String endereco) {
        dsl.preenche("elementosForm:endereco", endereco);
    }

    public void setEmail(String email) {
        dsl.preenche("elementosForm:email", email);
    }

    public void setTelefone(String telefone) {
        dsl.preenche("elementosForm:telefone", telefone);
    }

    public void setSexo(String... valores) {
        for (String valor : valores)
            dsl.selecionarCombo("elementosForm:sexo", valor);
    }

    public void setHobbies(String... valores) {
        for (String valor : valores)
            dsl.selecionarCombo("elementosForm:hobbies", valor);
    }

    public void setIdioma(String idioma) {
        dsl.preenche("elementosForm:idioma", idioma);
    }

    public void setFerramentas(String... valores) {
        for (String valor : valores)
            dsl.selecionarCombo("elementosForm:ferramentas", valor);
    }

    public void setPais(String... valores) {
        for (String valor : valores)
            dsl.selecionarCombo("elementosForm:pais", valor);
    }
}
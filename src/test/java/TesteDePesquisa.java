import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteDePesquisa {

    @Test
    public void pesquisaGeladeira(){

        // Escolhe qual será o navegador usado nos testes
        System.setProperty(
                "webdriver.chrome.driver", // Nevegador Chrome
                "C:\\webdriver6\\chromedriver.exe"); // Onde está o navegador Chrome

        WebDriver robozinho = new ChromeDriver(); // Da o nome ao executador

        robozinho.get("https://www.google.com.br/");

        // Ache o elemento pelo name "q" e quando achar ele, escreva "geladeira"
        robozinho.findElement(By.name("q")).sendKeys("geladeira");

        // Ache o elemento pelo name "q" e quando achar ele, de um enter
        robozinho.findElement(By.name("q")).sendKeys(Keys.ENTER);

        // Verifique se o resultado esperado é igual ao resulto obtido
        Assertions.assertEquals("geladeira - Pesquisa Google",
                robozinho.getTitle());

    }

    // DESAFIO: IMPLEMENTAR SOFÁ, ARMARIO E CAMA COMO PESQUISA

    @Test
    public void pesquisaSofa(){

        // Escolhe qual será o navegador usado nos testes
        System.setProperty(
                "webdriver.chrome.driver", // Nevegador Chrome
                "C:\\webdriver6\\chromedriver.exe"); // Onde está o navegador Chrome

        WebDriver robozinho = new ChromeDriver(); // Da o nome ao executador

        robozinho.get("https://www.google.com.br/");

        // Ache o elemento pelo name "q" e quando achar ele, escreva "geladeira"
        robozinho.findElement(By.name("q")).sendKeys("geladeira");

        // Ache o elemento pelo name "q" e quando achar ele, de um enter
        robozinho.findElement(By.name("q")).sendKeys(Keys.ENTER);

        // Verifique se o resultado esperado é igual ao resulto obtido
        Assertions.assertEquals("geladeira - Pesquisa Google",
                robozinho.getTitle());

    }

    @Test
    public void pesquisaArmario(){

        // Escolhe qual será o navegador usado nos testes
        System.setProperty(
                "webdriver.chrome.driver", // Nevegador Chrome
                "C:\\webdriver6\\chromedriver.exe"); // Onde está o navegador Chrome

        WebDriver robozinho = new ChromeDriver(); // Da o nome ao executador

        robozinho.get("https://www.google.com.br/");

        // Ache o elemento pelo name "q" e quando achar ele, escreva "geladeira"
        robozinho.findElement(By.name("q")).sendKeys("geladeira");

        // Ache o elemento pelo name "q" e quando achar ele, de um enter
        robozinho.findElement(By.name("q")).sendKeys(Keys.ENTER);

        // Verifique se o resultado esperado é igual ao resulto obtido
        Assertions.assertEquals("geladeira - Pesquisa Google",
                robozinho.getTitle());

    }

}

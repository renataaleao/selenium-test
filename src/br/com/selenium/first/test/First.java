package br.com.selenium.first.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
  
public class First {  
  
    public static void main(String[] args) {  
          
    // declaração e instanciação do chromedriver
    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");  
    WebDriver driver = new ChromeDriver();  
    
    // navegar para google
    driver.navigate().to("http://www.google.com/"); 
    // Maximiza o navegador  
    driver.manage().window().maximize();
    // clicar na caixa de texto e digitar o valor
    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Selenium"); 
    // clicar em enter
    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
    
    
    // fechar navegador
    driver.close();
           
    }  
  
} 
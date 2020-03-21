Go to SeleniumHQ.org
Selenium CLient & WebDriver Language Bindings
Launch eclipse->file->New->Java Project
Project Name: selProject
//now we have to add selenium api to this project
Right click on the project name
Properties
Java Build Path
Add external Jars(provide the path where ypu have download and extract the files//two jar files should be there client combined and client combined sources)
Again add external jar->go to the libs folder and add the jars available.
Apply and close
Right click on SRC and create a new class: VerifyTitle
choose->public static void main(String[] args)
finish
Go to seleniumhq.org download
downlod third-party driver, specifically for the browser you are using.
//for example chromedriver.exe
copy and paste in the project :selProj

############### Task 1 ###########################
package selProject;
public class Verifytitle
{
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver","chromedriver.exe")
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.facebook.com");
}
}
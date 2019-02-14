package pajeObject;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.plivo.Base;

public class DragDrop extends Base {

	public WebDriver driver;

	public DragDrop() {
		driver = initalizeDriver();
	}

	// xpath of create app button
	public By createApp = By.id("link-create");
	// xpath of sort dropdown

	public WebElement clickCreateApp() {
		return driver.findElement(createApp);
		
	}

}

package omniengage;

import java.awt.AWTException;

import org.testng.annotations.Test;

@Test
public class Nodes {

	
	public void controller() throws InterruptedException, AWTException {
	Botsolver obj = new Botsolver();

        obj.livebotopener();
        obj.botsolver();
	}
}
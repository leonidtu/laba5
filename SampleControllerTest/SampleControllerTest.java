package application;

import static org.junit.Assert.*;
import org.junit.Test;


import javafx.scene.web.WebEngine;

public class SampleControllerTest {

	private WebEngine engine;
	private boolean run;
	private boolean hist;
	int go;
	@Test
	public void test() {
		SampleController sampleController = new SampleController();
		String home = "google.com";
		assertEquals("google.com", home);
		if (sampleController.equals(engine) == true) {
			run = true;
			System.out.print("OK!");
		}
		if (run = true) {
			sampleController.refreshpage();
			engine.reload();
		}
		int Zoom = 1;
		assertEquals(Zoom, 1);
		if (hist = true) {
			sampleController.ShowHistory();
		}
		if (go == 1) {
			sampleController.nextPage();
			System.out.print("next");
		}
		else {
			System.out.print("////");
		}
		if (go == -1) {
			sampleController.previousPage();
			System.out.print("previous");
		}
		else {
			System.out.print("Error");
		}
		
	}
	
	

}

package uk.org.kij13;

import android.os.Bundle;
import org.apache.cordova.*;;

public class App extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html");
	}

}

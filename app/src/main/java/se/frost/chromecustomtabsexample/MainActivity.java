package se.frost.chromecustomtabsexample;

import android.net.Uri;
import android.support.annotation.ColorRes;
import android.support.customtabs.CustomTabsIntent;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void openFrostTab(View view) {
		openTab("http://frostdigital.se", R.color.frostBlue);
	}

	public void openRebtelTab(View view) {
		openTab("http://rebtel.com", R.color.rebtelRed);
	}

	private void openTab(String url, @ColorRes int color) {
		CustomTabsIntent customTabsIntent = new CustomTabsIntent.Builder()
				.enableUrlBarHiding()
				.setShowTitle(true)
				.setToolbarColor(ResourcesCompat.getColor(getResources(), color, null))
				.build();
		customTabsIntent.launchUrl(this, Uri.parse(url));
	}
}

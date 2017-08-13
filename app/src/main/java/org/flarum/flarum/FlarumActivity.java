package org.flarum.flarum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.thefinestartist.finestwebview.FinestWebView;

public class FlarumActivity extends AppCompatActivity {
  private final String URL = "http://discuss.flarum.org";

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_flarum);
    new FinestWebView.Builder(this).titleDefault("Flarum")
        .webViewBuiltInZoomControls(true)
        .webViewDisplayZoomControls(true)
        .webViewJavaScriptEnabled(true)
        .webViewAllowFileAccess(true)
        .webViewJavaScriptCanOpenWindowsAutomatically(true)

        .showIconClose(false)
        .showProgressBar(true)
        .progressBarColorRes(R.color.colorPrimary)
        .titleColorRes(R.color.colorPrimary)
        .backPressToClose(true)

        .show(URL);
  }
}

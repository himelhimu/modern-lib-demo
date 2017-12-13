package android.sabbir.com.modernlibrarys.test.material.components.activity.progressactivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import com.material.components.p089f.C2754e;

public class ProgressLinearTop extends C0818e {
    private WebView f6615m;
    private ProgressBar f6616n;

    class C25801 extends WebChromeClient {
        final /* synthetic */ ProgressLinearTop f6614a;

        C25801(ProgressLinearTop progressLinearTop) {
            this.f6614a = progressLinearTop;
        }

        public void onProgressChanged(WebView webView, int i) {
            this.f6614a.f6616n.setProgress(i);
            if (i == 100) {
                C2754e.m12271c(this.f6614a.f6616n);
            }
        }
    }

    private void m11747j() {
        m4362a((Toolbar) findViewById(C1142R.id.toolbar));
        m4370f().mo760a(null);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_20);
    }

    private void m11748k() {
        this.f6616n = (ProgressBar) findViewById(C1142R.id.progress_bar);
        this.f6615m = (WebView) findViewById(C1142R.id.webView);
        this.f6616n.setProgress(0);
        this.f6616n.setVisibility(0);
        this.f6616n.setAlpha(1.0f);
        this.f6615m.loadUrl("https://material.io/guidelines/");
        this.f6615m.setWebChromeClient(new C25801(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_progress_linear_top);
        m11747j();
        m11748k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_refresh_setting, menu);
        C2746d.m12257a(menu, getResources().getColor(C1142R.color.grey_60));
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        } else if (menuItem.getItemId() == C1142R.id.action_refresh) {
            m11748k();
        } else {
            Toast.makeText(getApplicationContext(), menuItem.getTitle(), 0).show();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

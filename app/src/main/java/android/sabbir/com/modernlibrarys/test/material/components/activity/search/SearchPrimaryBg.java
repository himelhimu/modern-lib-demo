package android.sabbir.com.modernlibrarys.test.material.components.activity.search;

import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import butterknife.C1142R;

public class SearchPrimaryBg extends C0818e {
    private ProgressBar f6657m;
    private FloatingActionButton f6658n;
    private EditText f6659o;

    class C25971 implements OnEditorActionListener {
        final /* synthetic */ SearchPrimaryBg f6654a;

        C25971(SearchPrimaryBg searchPrimaryBg) {
            this.f6654a = searchPrimaryBg;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            this.f6654a.m11799m();
            this.f6654a.m11798l();
            return true;
        }
    }

    class C25982 implements OnClickListener {
        final /* synthetic */ SearchPrimaryBg f6655a;

        C25982(SearchPrimaryBg searchPrimaryBg) {
            this.f6655a = searchPrimaryBg;
        }

        public void onClick(View view) {
            this.f6655a.m11798l();
        }
    }

    class C25993 implements Runnable {
        final /* synthetic */ SearchPrimaryBg f6656a;

        C25993(SearchPrimaryBg searchPrimaryBg) {
            this.f6656a = searchPrimaryBg;
        }

        public void run() {
            this.f6656a.f6657m.setVisibility(8);
            this.f6656a.f6658n.setAlpha(1.0f);
            Toast.makeText(this.f6656a.getApplicationContext(), "Search Submit", 0).show();
        }
    }

    private void m11796j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a(null);
        m4370f().mo761a(true);
    }

    private void m11797k() {
        this.f6659o = (EditText) findViewById(C1142R.id.et_search);
        this.f6657m = (ProgressBar) findViewById(C1142R.id.progress_bar);
        this.f6657m.getIndeterminateDrawable().setColorFilter(-1, Mode.SRC_IN);
        this.f6658n = (FloatingActionButton) findViewById(C1142R.id.fab);
        this.f6659o.setOnEditorActionListener(new C25971(this));
        this.f6658n.setOnClickListener(new C25982(this));
    }

    private void m11798l() {
        this.f6657m.setVisibility(0);
        this.f6658n.setAlpha(0.0f);
        new Handler().postDelayed(new C25993(this), 1000);
    }

    private void m11799m() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_search_primary_bg);
        m11796j();
        m11797k();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), menuItem.getTitle(), 0).show();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

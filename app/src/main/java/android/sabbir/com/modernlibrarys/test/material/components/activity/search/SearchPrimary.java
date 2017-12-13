package android.sabbir.com.modernlibrarys.test.material.components.activity.search;

import android.app.Activity;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
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
import com.material.components.p089f.C2746d;

public class SearchPrimary extends C0818e {
    private ProgressBar f6651m;
    private FloatingActionButton f6652n;
    private EditText f6653o;

    class C25941 implements OnEditorActionListener {
        final /* synthetic */ SearchPrimary f6648a;

        C25941(SearchPrimary searchPrimary) {
            this.f6648a = searchPrimary;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            this.f6648a.m11791m();
            this.f6648a.m11790l();
            return true;
        }
    }

    class C25952 implements OnClickListener {
        final /* synthetic */ SearchPrimary f6649a;

        C25952(SearchPrimary searchPrimary) {
            this.f6649a = searchPrimary;
        }

        public void onClick(View view) {
            this.f6649a.m11790l();
        }
    }

    class C25963 implements Runnable {
        final /* synthetic */ SearchPrimary f6650a;

        C25963(SearchPrimary searchPrimary) {
            this.f6650a = searchPrimary;
        }

        public void run() {
            this.f6650a.f6651m.setVisibility(8);
            this.f6650a.f6652n.setAlpha(1.0f);
            Toast.makeText(this.f6650a.getApplicationContext(), "Search Submit", 0).show();
        }
    }

    private void m11788j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(C1142R.color.grey_60), Mode.SRC_ATOP);
        m4362a(toolbar);
        m4370f().mo760a(null);
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_20);
    }

    private void m11789k() {
        this.f6653o = (EditText) findViewById(C1142R.id.et_search);
        this.f6651m = (ProgressBar) findViewById(C1142R.id.progress_bar);
        this.f6652n = (FloatingActionButton) findViewById(C1142R.id.fab);
        this.f6651m.setVisibility(8);
        this.f6653o.setOnEditorActionListener(new C25941(this));
        this.f6652n.setOnClickListener(new C25952(this));
    }

    private void m11790l() {
        this.f6651m.setVisibility(0);
        this.f6652n.setAlpha(0.0f);
        new Handler().postDelayed(new C25963(this), 1000);
    }

    private void m11791m() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_search_primary);
        m11788j();
        m11789k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_setting, menu);
        C2746d.m12257a(menu, getResources().getColor(C1142R.color.grey_60));
        return true;
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

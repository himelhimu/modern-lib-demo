package android.sabbir.com.modernlibrarys.test.material.components.activity.search;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.C0818e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.aa;
import com.material.components.p086a.aa.C2209a;
import com.material.components.p089f.C2746d;
import com.material.components.p089f.C2754e;

public class SearchToolbarDark extends C0818e {
    TextWatcher f6677m = new C26085(this);
    private Toolbar f6678n;
    private EditText f6679o;
    private ImageButton f6680p;
    private ProgressBar f6681q;
    private LinearLayout f6682r;
    private RecyclerView f6683s;
    private aa f6684t;
    private LinearLayout f6685u;

    class C26041 implements C2209a {
        final /* synthetic */ SearchToolbarDark f6671a;

        C26041(SearchToolbarDark searchToolbarDark) {
            this.f6671a = searchToolbarDark;
        }

        public void mo1969a(View view, String str, int i) {
            this.f6671a.f6679o.setText(str);
            C2754e.m12269b(this.f6671a.f6685u);
            this.f6671a.m11825m();
            this.f6671a.m11826n();
        }
    }

    class C26052 implements OnClickListener {
        final /* synthetic */ SearchToolbarDark f6672a;

        C26052(SearchToolbarDark searchToolbarDark) {
            this.f6672a = searchToolbarDark;
        }

        public void onClick(View view) {
            this.f6672a.f6679o.setText("");
        }
    }

    class C26063 implements OnEditorActionListener {
        final /* synthetic */ SearchToolbarDark f6673a;

        C26063(SearchToolbarDark searchToolbarDark) {
            this.f6673a = searchToolbarDark;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            this.f6673a.m11825m();
            this.f6673a.m11826n();
            return true;
        }
    }

    class C26074 implements OnTouchListener {
        final /* synthetic */ SearchToolbarDark f6674a;

        C26074(SearchToolbarDark searchToolbarDark) {
            this.f6674a = searchToolbarDark;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.f6674a.m11824l();
            this.f6674a.getWindow().setSoftInputMode(5);
            return false;
        }
    }

    class C26085 implements TextWatcher {
        final /* synthetic */ SearchToolbarDark f6675a;

        C26085(SearchToolbarDark searchToolbarDark) {
            this.f6675a = searchToolbarDark;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.toString().trim().length() == 0) {
                this.f6675a.f6680p.setVisibility(8);
            } else {
                this.f6675a.f6680p.setVisibility(0);
            }
        }
    }

    class C26096 implements Runnable {
        final /* synthetic */ SearchToolbarDark f6676a;

        C26096(SearchToolbarDark searchToolbarDark) {
            this.f6676a = searchToolbarDark;
        }

        public void run() {
            this.f6676a.f6681q.setVisibility(8);
            this.f6676a.f6682r.setVisibility(0);
        }
    }

    private void m11822j() {
        this.f6678n = (Toolbar) findViewById(C1142R.id.toolbar);
        m4362a(this.f6678n);
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_1000);
    }

    private void m11823k() {
        this.f6681q = (ProgressBar) findViewById(C1142R.id.progress_bar);
        this.f6682r = (LinearLayout) findViewById(C1142R.id.lyt_no_result);
        this.f6685u = (LinearLayout) findViewById(C1142R.id.lyt_suggestion);
        this.f6679o = (EditText) findViewById(C1142R.id.et_search);
        this.f6679o.addTextChangedListener(this.f6677m);
        this.f6680p = (ImageButton) findViewById(C1142R.id.bt_clear);
        this.f6680p.setVisibility(8);
        this.f6683s = (RecyclerView) findViewById(C1142R.id.recyclerSuggestion);
        this.f6683s.setLayoutManager(new LinearLayoutManager(this));
        this.f6683s.setHasFixedSize(true);
        this.f6684t = new aa(this);
        this.f6683s.setAdapter(this.f6684t);
        m11824l();
        this.f6684t.m10863a(new C26041(this));
        this.f6680p.setOnClickListener(new C26052(this));
        this.f6679o.setOnEditorActionListener(new C26063(this));
        this.f6679o.setOnTouchListener(new C26074(this));
    }

    private void m11824l() {
        this.f6684t.m10867b();
        C2754e.m12266a(this.f6685u);
    }

    private void m11825m() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    private void m11826n() {
        this.f6681q.setVisibility(0);
        C2754e.m12269b(this.f6685u);
        this.f6682r.setVisibility(8);
        String trim = this.f6679o.getText().toString().trim();
        if (trim.equals("")) {
            Toast.makeText(this, "Please fill search input", 0).show();
            return;
        }
        new Handler().postDelayed(new C26096(this), 2000);
        this.f6684t.m10865a(trim);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_search_toolbar_dark);
        m11822j();
        m11823k();
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

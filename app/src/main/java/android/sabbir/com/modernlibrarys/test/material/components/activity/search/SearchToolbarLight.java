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

public class SearchToolbarLight extends C0818e {
    TextWatcher f6692m = new C26145(this);
    private Toolbar f6693n;
    private EditText f6694o;
    private ImageButton f6695p;
    private ProgressBar f6696q;
    private LinearLayout f6697r;
    private RecyclerView f6698s;
    private aa f6699t;
    private LinearLayout f6700u;

    class C26101 implements C2209a {
        final /* synthetic */ SearchToolbarLight f6686a;

        C26101(SearchToolbarLight searchToolbarLight) {
            this.f6686a = searchToolbarLight;
        }

        public void mo1969a(View view, String str, int i) {
            this.f6686a.f6694o.setText(str);
            C2754e.m12269b(this.f6686a.f6700u);
            this.f6686a.m11839m();
            this.f6686a.m11840n();
        }
    }

    class C26112 implements OnClickListener {
        final /* synthetic */ SearchToolbarLight f6687a;

        C26112(SearchToolbarLight searchToolbarLight) {
            this.f6687a = searchToolbarLight;
        }

        public void onClick(View view) {
            this.f6687a.f6694o.setText("");
        }
    }

    class C26123 implements OnEditorActionListener {
        final /* synthetic */ SearchToolbarLight f6688a;

        C26123(SearchToolbarLight searchToolbarLight) {
            this.f6688a = searchToolbarLight;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            this.f6688a.m11839m();
            this.f6688a.m11840n();
            return true;
        }
    }

    class C26134 implements OnTouchListener {
        final /* synthetic */ SearchToolbarLight f6689a;

        C26134(SearchToolbarLight searchToolbarLight) {
            this.f6689a = searchToolbarLight;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.f6689a.m11838l();
            this.f6689a.getWindow().setSoftInputMode(5);
            return false;
        }
    }

    class C26145 implements TextWatcher {
        final /* synthetic */ SearchToolbarLight f6690a;

        C26145(SearchToolbarLight searchToolbarLight) {
            this.f6690a = searchToolbarLight;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.toString().trim().length() == 0) {
                this.f6690a.f6695p.setVisibility(8);
            } else {
                this.f6690a.f6695p.setVisibility(0);
            }
        }
    }

    class C26156 implements Runnable {
        final /* synthetic */ SearchToolbarLight f6691a;

        C26156(SearchToolbarLight searchToolbarLight) {
            this.f6691a = searchToolbarLight;
        }

        public void run() {
            this.f6691a.f6696q.setVisibility(8);
            this.f6691a.f6697r.setVisibility(0);
        }
    }

    private void m11836j() {
        this.f6693n = (Toolbar) findViewById(C1142R.id.toolbar);
        m4362a(this.f6693n);
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_20);
    }

    private void m11837k() {
        this.f6696q = (ProgressBar) findViewById(C1142R.id.progress_bar);
        this.f6697r = (LinearLayout) findViewById(C1142R.id.lyt_no_result);
        this.f6700u = (LinearLayout) findViewById(C1142R.id.lyt_suggestion);
        this.f6694o = (EditText) findViewById(C1142R.id.et_search);
        this.f6694o.addTextChangedListener(this.f6692m);
        this.f6695p = (ImageButton) findViewById(C1142R.id.bt_clear);
        this.f6695p.setVisibility(8);
        this.f6698s = (RecyclerView) findViewById(C1142R.id.recyclerSuggestion);
        this.f6698s.setLayoutManager(new LinearLayoutManager(this));
        this.f6698s.setHasFixedSize(true);
        this.f6699t = new aa(this);
        this.f6698s.setAdapter(this.f6699t);
        m11838l();
        this.f6699t.m10863a(new C26101(this));
        this.f6695p.setOnClickListener(new C26112(this));
        this.f6694o.setOnEditorActionListener(new C26123(this));
        this.f6694o.setOnTouchListener(new C26134(this));
    }

    private void m11838l() {
        this.f6699t.m10867b();
        C2754e.m12266a(this.f6700u);
    }

    private void m11839m() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    private void m11840n() {
        this.f6696q.setVisibility(0);
        C2754e.m12269b(this.f6700u);
        this.f6697r.setVisibility(8);
        String trim = this.f6694o.getText().toString().trim();
        if (trim.equals("")) {
            Toast.makeText(this, "Please fill search input", 0).show();
            return;
        }
        new Handler().postDelayed(new C26156(this), 2000);
        this.f6699t.m10865a(trim);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_search_toolbar_light);
        m11836j();
        m11837k();
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

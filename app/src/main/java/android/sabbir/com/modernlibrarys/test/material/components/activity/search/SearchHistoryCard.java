package android.sabbir.com.modernlibrarys.test.material.components.activity.search;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.C0818e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
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
import com.material.components.p089f.C2754e;

public class SearchHistoryCard extends C0818e {
    TextWatcher f6639m = new C25926(this);
    private EditText f6640n;
    private ImageButton f6641o;
    private ImageButton f6642p;
    private ProgressBar f6643q;
    private LinearLayout f6644r;
    private RecyclerView f6645s;
    private aa f6646t;
    private LinearLayout f6647u;

    class C25871 implements C2209a {
        final /* synthetic */ SearchHistoryCard f6632a;

        C25871(SearchHistoryCard searchHistoryCard) {
            this.f6632a = searchHistoryCard;
        }

        public void mo1969a(View view, String str, int i) {
            this.f6632a.f6640n.setText(str);
            C2754e.m12269b(this.f6632a.f6647u);
            this.f6632a.m11782m();
            this.f6632a.m11783n();
        }
    }

    class C25882 implements OnClickListener {
        final /* synthetic */ SearchHistoryCard f6633a;

        C25882(SearchHistoryCard searchHistoryCard) {
            this.f6633a = searchHistoryCard;
        }

        public void onClick(View view) {
            this.f6633a.f6640n.setText("");
        }
    }

    class C25893 implements OnClickListener {
        final /* synthetic */ SearchHistoryCard f6634a;

        C25893(SearchHistoryCard searchHistoryCard) {
            this.f6634a = searchHistoryCard;
        }

        public void onClick(View view) {
            this.f6634a.finish();
        }
    }

    class C25904 implements OnEditorActionListener {
        final /* synthetic */ SearchHistoryCard f6635a;

        C25904(SearchHistoryCard searchHistoryCard) {
            this.f6635a = searchHistoryCard;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            this.f6635a.m11782m();
            this.f6635a.m11783n();
            return true;
        }
    }

    class C25915 implements OnTouchListener {
        final /* synthetic */ SearchHistoryCard f6636a;

        C25915(SearchHistoryCard searchHistoryCard) {
            this.f6636a = searchHistoryCard;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.f6636a.m11781l();
            this.f6636a.getWindow().setSoftInputMode(5);
            return false;
        }
    }

    class C25926 implements TextWatcher {
        final /* synthetic */ SearchHistoryCard f6637a;

        C25926(SearchHistoryCard searchHistoryCard) {
            this.f6637a = searchHistoryCard;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.toString().trim().length() == 0) {
                this.f6637a.f6641o.setVisibility(8);
            } else {
                this.f6637a.f6641o.setVisibility(0);
            }
        }
    }

    class C25937 implements Runnable {
        final /* synthetic */ SearchHistoryCard f6638a;

        C25937(SearchHistoryCard searchHistoryCard) {
            this.f6638a = searchHistoryCard;
        }

        public void run() {
            this.f6638a.f6643q.setVisibility(8);
            this.f6638a.f6644r.setVisibility(0);
        }
    }

    private void m11779j() {
    }

    private void m11780k() {
        this.f6643q = (ProgressBar) findViewById(C1142R.id.progress_bar);
        this.f6644r = (LinearLayout) findViewById(C1142R.id.lyt_no_result);
        this.f6647u = (LinearLayout) findViewById(C1142R.id.lyt_suggestion);
        this.f6640n = (EditText) findViewById(C1142R.id.et_search);
        this.f6640n.addTextChangedListener(this.f6639m);
        this.f6641o = (ImageButton) findViewById(C1142R.id.bt_clear);
        this.f6642p = (ImageButton) findViewById(C1142R.id.bt_back);
        this.f6641o.setVisibility(8);
        this.f6645s = (RecyclerView) findViewById(C1142R.id.recyclerSuggestion);
        this.f6645s.setLayoutManager(new LinearLayoutManager(this));
        this.f6645s.setHasFixedSize(true);
        this.f6646t = new aa(this);
        this.f6645s.setAdapter(this.f6646t);
        m11781l();
        this.f6646t.m10863a(new C25871(this));
        this.f6641o.setOnClickListener(new C25882(this));
        this.f6642p.setOnClickListener(new C25893(this));
        this.f6640n.setOnEditorActionListener(new C25904(this));
        this.f6640n.setOnTouchListener(new C25915(this));
    }

    private void m11781l() {
        this.f6646t.m10867b();
        C2754e.m12266a(this.f6647u);
    }

    private void m11782m() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    private void m11783n() {
        this.f6643q.setVisibility(0);
        C2754e.m12269b(this.f6647u);
        this.f6644r.setVisibility(8);
        String trim = this.f6640n.getText().toString().trim();
        if (trim.equals("")) {
            Toast.makeText(this, "Please fill search input", 0).show();
            return;
        }
        new Handler().postDelayed(new C25937(this), 2000);
        this.f6646t.m10865a(trim);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_search_history_card);
        m11779j();
        m11780k();
    }
}

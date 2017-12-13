package android.sabbir.com.modernlibrarys.test.material.components.activity.search;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v4.p008b.C0227l;
import android.support.v4.p008b.C0365q;
import android.support.v4.p008b.C0378u;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ab;
import android.support.v7.app.C0818e;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p088c.C2723g;
import com.material.components.p089f.C2746d;
import java.util.ArrayList;
import java.util.List;

public class SearchStore extends C0818e {
    private ViewPager f6666m;
    private TabLayout f6667n;
    private EditText f6668o;
    private ImageButton f6669p;
    private ProgressBar f6670q;

    class C26001 implements OnClickListener {
        final /* synthetic */ SearchStore f6660a;

        C26001(SearchStore searchStore) {
            this.f6660a = searchStore;
        }

        public void onClick(View view) {
            this.f6660a.f6668o.setText("");
        }
    }

    class C26012 implements OnEditorActionListener {
        final /* synthetic */ SearchStore f6661a;

        C26012(SearchStore searchStore) {
            this.f6661a = searchStore;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            this.f6661a.m11811k();
            this.f6661a.m11812l();
            return true;
        }
    }

    class C26023 implements Runnable {
        final /* synthetic */ SearchStore f6662a;

        C26023(SearchStore searchStore) {
            this.f6662a = searchStore;
        }

        public void run() {
            this.f6662a.f6670q.setVisibility(8);
            this.f6662a.f6666m.setVisibility(0);
        }
    }

    private class C2603a extends C0378u {
        final /* synthetic */ SearchStore f6663a;
        private final List<C0227l> f6664b = new ArrayList();
        private final List<String> f6665c = new ArrayList();

        public C2603a(SearchStore searchStore, C0365q c0365q) {
            this.f6663a = searchStore;
            super(c0365q);
        }

        public C0227l mo1958a(int i) {
            return (C0227l) this.f6664b.get(i);
        }

        public void m11801a(C0227l c0227l, String str) {
            this.f6664b.add(c0227l);
            this.f6665c.add(str);
        }

        public int mo1933b() {
            return this.f6664b.size();
        }

        public CharSequence mo1959c(int i) {
            return (CharSequence) this.f6665c.get(i);
        }
    }

    private void m11805a(ViewPager viewPager) {
        ab c2603a = new C2603a(this, m1917e());
        c2603a.m11801a(C2723g.m12206a(), "MUSIC");
        c2603a.m11801a(C2723g.m12206a(), "MOVIES");
        c2603a.m11801a(C2723g.m12206a(), "BOOKS");
        c2603a.m11801a(C2723g.m12206a(), "GAMES");
        viewPager.setAdapter(c2603a);
    }

    private void m11810j() {
        this.f6670q = (ProgressBar) findViewById(C1142R.id.progress_bar);
        this.f6666m = (ViewPager) findViewById(C1142R.id.view_pager);
        m11805a(this.f6666m);
        this.f6667n = (TabLayout) findViewById(C1142R.id.tab_layout);
        this.f6667n.setupWithViewPager(this.f6666m);
        this.f6668o = (EditText) findViewById(C1142R.id.et_search);
        this.f6669p = (ImageButton) findViewById(C1142R.id.bt_clear);
        this.f6669p.setOnClickListener(new C26001(this));
        this.f6668o.setOnEditorActionListener(new C26012(this));
    }

    private void m11811k() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    private void m11812l() {
        this.f6670q.setVisibility(0);
        this.f6666m.setVisibility(8);
        if (this.f6668o.getText().toString().trim().equals("")) {
            Toast.makeText(this, "Please fill search input", 0).show();
        } else {
            new Handler().postDelayed(new C26023(this), 2000);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_search_store);
        m11810j();
        C2746d.m12253a((Activity) this, (int) C1142R.color.blue_grey_600);
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

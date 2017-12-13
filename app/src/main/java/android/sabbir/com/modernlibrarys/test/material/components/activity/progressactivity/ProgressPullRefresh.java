package android.sabbir.com.modernlibrarys.test.material.components.activity.progressactivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.C0714b;
import android.support.v7.app.C0818e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2320t;
import com.material.components.p086a.C2320t.C2317a;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2733h;
import java.util.List;

public class ProgressPullRefresh extends C0818e {
    private View f6628m;
    private SwipeRefreshLayout f6629n;
    private RecyclerView f6630o;
    private C2320t f6631p;

    class C25831 implements C2317a {
        final /* synthetic */ ProgressPullRefresh f6623a;

        C25831(ProgressPullRefresh progressPullRefresh) {
            this.f6623a = progressPullRefresh;
        }

        public void mo1932a(View view, C2733h c2733h, int i) {
            Snackbar.m1021a(this.f6623a.f6628m, "Item " + c2733h.f7027c + " clicked", -1).m1012a();
        }
    }

    class C25842 implements C0714b {
        final /* synthetic */ ProgressPullRefresh f6624a;

        C25842(ProgressPullRefresh progressPullRefresh) {
            this.f6624a = progressPullRefresh;
        }

        public void mo1968a() {
            this.f6624a.m11768l();
        }
    }

    class C25853 implements Runnable {
        final /* synthetic */ ProgressPullRefresh f6625a;

        C25853(ProgressPullRefresh progressPullRefresh) {
            this.f6625a = progressPullRefresh;
        }

        public void run() {
            this.f6625a.f6631p.m11082a(1, (C2733h) C2700a.m12159c(this.f6625a.getApplicationContext()).get(0));
            this.f6625a.m11763b(false);
        }
    }

    private void m11763b(final boolean z) {
        if (z) {
            this.f6629n.post(new Runnable(this) {
                final /* synthetic */ ProgressPullRefresh f6627b;

                public void run() {
                    this.f6627b.f6629n.setRefreshing(z);
                }
            });
        } else {
            this.f6629n.setRefreshing(z);
        }
    }

    private void m11766j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Pull Refresh");
        m4370f().mo761a(true);
    }

    private void m11767k() {
        int i = 0;
        this.f6629n = (SwipeRefreshLayout) findViewById(C1142R.id.swipe_refresh_layout);
        this.f6630o = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6630o.setLayoutManager(new LinearLayoutManager(this));
        this.f6630o.setHasFixedSize(true);
        List c = C2700a.m12159c(this);
        c.addAll(C2700a.m12159c(this));
        List b = C2700a.m12158b((Context) this);
        int i2 = 0;
        int i3 = 0;
        while (i < c.size() / 6) {
            c.add(i3, new C2733h((String) b.get(i2), true));
            i3 += 5;
            i2++;
            i++;
        }
        this.f6631p = new C2320t(this, c);
        this.f6630o.setAdapter(this.f6631p);
        this.f6631p.m11084a(new C25831(this));
        this.f6629n.setOnRefreshListener(new C25842(this));
    }

    private void m11768l() {
        m11763b(true);
        new Handler().postDelayed(new C25853(this), 3000);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_progress_pull_refresh);
        this.f6628m = findViewById(16908290);
        m11766j();
        m11767k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_search_setting, menu);
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

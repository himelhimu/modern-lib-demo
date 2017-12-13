package android.sabbir.com.modernlibrarys.test.material.components.activity.progressactivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.C0818e;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2247f;
import com.material.components.p086a.C2247f.C2244b;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2736j;
import java.util.ArrayList;
import java.util.List;

public class ProgressOnScroll extends C0818e {
    private View f6619m;
    private int f6620n = 6;
    private RecyclerView f6621o;
    private C2247f f6622p;

    class C25811 implements C2244b {
        final /* synthetic */ ProgressOnScroll f6617a;

        C25811(ProgressOnScroll progressOnScroll) {
            this.f6617a = progressOnScroll;
        }

        public void mo1967a(int i) {
            this.f6617a.m11757l();
        }
    }

    class C25822 implements Runnable {
        final /* synthetic */ ProgressOnScroll f6618a;

        C25822(ProgressOnScroll progressOnScroll) {
            this.f6618a = progressOnScroll;
        }

        public void run() {
            this.f6618a.f6622p.m10937a(this.f6618a.m11753b(this.f6618a.f6620n));
        }
    }

    private List<C2736j> m11753b(int i) {
        List<Integer> a = C2700a.m12156a((Context) this);
        a.addAll(C2700a.m12156a((Context) this));
        List arrayList = new ArrayList();
        for (Integer num : a) {
            arrayList.add(new C2736j(num.intValue(), "IMG_" + num + ".jpg", false));
        }
        return arrayList.subList(0, i);
    }

    private void m11755j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a(null);
        m4370f().mo761a(true);
    }

    private void m11756k() {
        this.f6621o = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6621o.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        this.f6621o.setHasFixedSize(true);
        this.f6622p = new C2247f(this, this.f6620n, m11753b(this.f6620n));
        this.f6621o.setAdapter(this.f6622p);
        this.f6622p.m10936a(new C25811(this));
    }

    private void m11757l() {
        this.f6622p.m10941c();
        new Handler().postDelayed(new C25822(this), 1500);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_progress_on_scroll);
        this.f6619m = findViewById(16908290);
        m11755j();
        m11756k();
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

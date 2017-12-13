package android.sabbir.com.modernlibrarys.test.material.components.activity.button;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.C0818e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0105a;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2320t;
import com.material.components.p086a.C2320t.C2317a;
import com.material.components.p089f.C2754e;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2733h;
import java.util.List;

public class FabMore extends C0818e {
    private View f6098m;
    private boolean f6099n = false;

    class C23882 implements OnClickListener {
        final /* synthetic */ FabMore f6095a;

        C23882(FabMore fabMore) {
            this.f6095a = fabMore;
        }

        public void onClick(View view) {
            Toast.makeText(this.f6095a.getApplicationContext(), "Voice clicked", 0).show();
        }
    }

    class C23893 implements OnClickListener {
        final /* synthetic */ FabMore f6096a;

        C23893(FabMore fabMore) {
            this.f6096a = fabMore;
        }

        public void onClick(View view) {
            Toast.makeText(this.f6096a.getApplicationContext(), "Call clicked", 0).show();
        }
    }

    class C23904 implements C2317a {
        final /* synthetic */ FabMore f6097a;

        C23904(FabMore fabMore) {
            this.f6097a = fabMore;
        }

        public void mo1932a(View view, C2733h c2733h, int i) {
            Toast.makeText(this.f6097a.getApplicationContext(), "Item " + c2733h.f7027c + " clicked", 0).show();
        }
    }

    private void m11234j() {
        RecyclerView recyclerView = (RecyclerView) findViewById(C1142R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        List c = C2700a.m12159c(this);
        c.addAll(C2700a.m12159c(this));
        c.addAll(C2700a.m12159c(this));
        List b = C2700a.m12158b((Context) this);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < c.size() / 6; i3++) {
            c.add(i2, new C2733h((String) b.get(i), true));
            i2 += 5;
            i++;
        }
        C0105a c2320t = new C2320t(this, c);
        recyclerView.setAdapter(c2320t);
        c2320t.m11084a(new C23904(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_button_fab_more);
        this.f6098m = findViewById(C1142R.id.coordinator_lyt);
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Fab More");
        m4370f().mo761a(true);
        final FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(C1142R.id.fab_mic);
        final FloatingActionButton floatingActionButton2 = (FloatingActionButton) findViewById(C1142R.id.fab_call);
        C2754e.m12273e(floatingActionButton);
        C2754e.m12273e(floatingActionButton2);
        ((FloatingActionButton) findViewById(C1142R.id.fab_add)).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ FabMore f6094c;

            public void onClick(View view) {
                this.f6094c.f6099n = C2754e.m12268a(view, !this.f6094c.f6099n);
                if (this.f6094c.f6099n) {
                    C2754e.m12272d(floatingActionButton);
                    C2754e.m12272d(floatingActionButton2);
                    return;
                }
                C2754e.m12274f(floatingActionButton);
                C2754e.m12274f(floatingActionButton2);
            }
        });
        floatingActionButton.setOnClickListener(new C23882(this));
        floatingActionButton2.setOnClickListener(new C23893(this));
        m11234j();
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

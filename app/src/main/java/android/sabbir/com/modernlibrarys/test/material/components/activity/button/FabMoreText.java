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

public class FabMoreText extends C0818e {
    private View f6106m;
    private View f6107n;
    private boolean f6108o = false;
    private View f6109p;
    private View f6110q;

    class C23911 implements OnClickListener {
        final /* synthetic */ FabMoreText f6100a;

        C23911(FabMoreText fabMoreText) {
            this.f6100a = fabMoreText;
        }

        public void onClick(View view) {
            this.f6100a.m11236a(view);
        }
    }

    class C23933 implements OnClickListener {
        final /* synthetic */ FabMoreText f6103a;

        C23933(FabMoreText fabMoreText) {
            this.f6103a = fabMoreText;
        }

        public void onClick(View view) {
            Toast.makeText(this.f6103a.getApplicationContext(), "Voice clicked", 0).show();
        }
    }

    class C23944 implements OnClickListener {
        final /* synthetic */ FabMoreText f6104a;

        C23944(FabMoreText fabMoreText) {
            this.f6104a = fabMoreText;
        }

        public void onClick(View view) {
            Toast.makeText(this.f6104a.getApplicationContext(), "Call clicked", 0).show();
        }
    }

    class C23955 implements C2317a {
        final /* synthetic */ FabMoreText f6105a;

        C23955(FabMoreText fabMoreText) {
            this.f6105a = fabMoreText;
        }

        public void mo1932a(View view, C2733h c2733h, int i) {
            Toast.makeText(this.f6105a.getApplicationContext(), "Item " + c2733h.f7027c + " clicked", 1).show();
        }
    }

    private void m11236a(View view) {
        this.f6108o = C2754e.m12268a(view, !this.f6108o);
        if (this.f6108o) {
            C2754e.m12272d(this.f6109p);
            C2754e.m12272d(this.f6110q);
            this.f6107n.setVisibility(0);
            return;
        }
        C2754e.m12274f(this.f6109p);
        C2754e.m12274f(this.f6110q);
        this.f6107n.setVisibility(8);
    }

    private void m11238j() {
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
        c2320t.m11084a(new C23955(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_button_fab_more_text);
        this.f6106m = findViewById(16908290);
        this.f6107n = findViewById(C1142R.id.back_drop);
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Fab More Text");
        m4370f().mo761a(true);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(C1142R.id.fab_mic);
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) findViewById(C1142R.id.fab_call);
        final FloatingActionButton floatingActionButton3 = (FloatingActionButton) findViewById(C1142R.id.fab_add);
        this.f6109p = findViewById(C1142R.id.lyt_mic);
        this.f6110q = findViewById(C1142R.id.lyt_call);
        C2754e.m12273e(this.f6109p);
        C2754e.m12273e(this.f6110q);
        this.f6107n.setVisibility(8);
        floatingActionButton3.setOnClickListener(new C23911(this));
        this.f6107n.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ FabMoreText f6102b;

            public void onClick(View view) {
                this.f6102b.m11236a(floatingActionButton3);
            }
        });
        floatingActionButton.setOnClickListener(new C23933(this));
        floatingActionButton2.setOnClickListener(new C23944(this));
        m11238j();
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

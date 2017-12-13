package android.sabbir.com.modernlibrarys.test.material.components.activity.snackbartoast;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0818e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0105a;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import butterknife.C1142R;
import com.material.components.p086a.C2320t;
import com.material.components.p086a.C2320t.C2317a;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2733h;
import java.util.List;

public class SnackbarAndFab extends C0818e {
    private View f6840m;

    class C26551 implements C2317a {
        final /* synthetic */ SnackbarAndFab f6838a;

        C26551(SnackbarAndFab snackbarAndFab) {
            this.f6838a = snackbarAndFab;
        }

        public void mo1932a(View view, C2733h c2733h, int i) {
            Snackbar.m1021a(this.f6838a.f6840m, "Item " + c2733h.f7027c + " clicked", 0).m1012a();
        }
    }

    class C26562 implements OnClickListener {
        final /* synthetic */ SnackbarAndFab f6839a;

        C26562(SnackbarAndFab snackbarAndFab) {
            this.f6839a = snackbarAndFab;
        }

        public void onClick(View view) {
            Snackbar.m1021a(this.f6839a.f6840m, "FAB Add clicked", 0).m1012a();
        }
    }

    private void m11971j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Snackbar & FAB");
        m4370f().mo761a(true);
    }

    private void m11972k() {
        this.f6840m = findViewById(C1142R.id.coordinator_lyt);
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
        c2320t.m11084a(new C26551(this));
        ((FloatingActionButton) findViewById(C1142R.id.fab_add)).setOnClickListener(new C26562(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_snackbar_and_fab);
        m11971j();
        m11972k();
    }
}

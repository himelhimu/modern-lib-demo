package android.sabbir.com.modernlibrarys.test.material.components.activity.expansionpanel;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import com.material.components.p089f.C2754e;
import com.material.components.p089f.C2754e.C2447a;

public class ExpansionPanelBasic extends C0818e {
    private View f6228m;
    private NestedScrollView f6229n;
    private ImageButton f6230o;
    private ImageButton f6231p;
    private Button f6232q;
    private Button f6233r;
    private Button f6234s;
    private View f6235t;
    private View f6236u;

    class C24421 implements OnClickListener {
        final /* synthetic */ ExpansionPanelBasic f6221a;

        C24421(ExpansionPanelBasic expansionPanelBasic) {
            this.f6221a = expansionPanelBasic;
        }

        public void onClick(View view) {
            this.f6221a.m11357b(this.f6221a.f6230o);
        }
    }

    class C24432 implements OnClickListener {
        final /* synthetic */ ExpansionPanelBasic f6222a;

        C24432(ExpansionPanelBasic expansionPanelBasic) {
            this.f6222a = expansionPanelBasic;
        }

        public void onClick(View view) {
            this.f6222a.m11357b(this.f6222a.f6230o);
        }
    }

    class C24443 implements OnClickListener {
        final /* synthetic */ ExpansionPanelBasic f6223a;

        C24443(ExpansionPanelBasic expansionPanelBasic) {
            this.f6223a = expansionPanelBasic;
        }

        public void onClick(View view) {
            this.f6223a.m11360c(this.f6223a.f6231p);
        }
    }

    class C24454 implements OnClickListener {
        final /* synthetic */ ExpansionPanelBasic f6224a;

        C24454(ExpansionPanelBasic expansionPanelBasic) {
            this.f6224a = expansionPanelBasic;
        }

        public void onClick(View view) {
            this.f6224a.m11360c(this.f6224a.f6231p);
        }
    }

    class C24465 implements OnClickListener {
        final /* synthetic */ ExpansionPanelBasic f6225a;

        C24465(ExpansionPanelBasic expansionPanelBasic) {
            this.f6225a = expansionPanelBasic;
        }

        public void onClick(View view) {
            Snackbar.m1021a(this.f6225a.f6228m, "Data saved", -1).m1012a();
            this.f6225a.m11360c(this.f6225a.f6231p);
        }
    }

    class C24486 implements C2447a {
        final /* synthetic */ ExpansionPanelBasic f6226a;

        C24486(ExpansionPanelBasic expansionPanelBasic) {
            this.f6226a = expansionPanelBasic;
        }

        public void mo1940a() {
            C2746d.m12256a(this.f6226a.f6229n, this.f6226a.f6235t);
        }
    }

    class C24497 implements C2447a {
        final /* synthetic */ ExpansionPanelBasic f6227a;

        C24497(ExpansionPanelBasic expansionPanelBasic) {
            this.f6227a = expansionPanelBasic;
        }

        public void mo1940a() {
            C2746d.m12256a(this.f6227a.f6229n, this.f6227a.f6236u);
        }
    }

    private void m11357b(View view) {
        if (mo1941a(view)) {
            C2754e.m12267a(this.f6235t, new C24486(this));
        } else {
            C2754e.m12269b(this.f6235t);
        }
    }

    private void m11360c(View view) {
        if (mo1941a(view)) {
            C2754e.m12267a(this.f6236u, new C24497(this));
        } else {
            C2754e.m12269b(this.f6236u);
        }
    }

    private void m11364j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Basic");
        m4370f().mo761a(true);
    }

    private void m11365k() {
        this.f6230o = (ImageButton) findViewById(C1142R.id.bt_toggle_text);
        this.f6232q = (Button) findViewById(C1142R.id.bt_hide_text);
        this.f6235t = findViewById(C1142R.id.lyt_expand_text);
        this.f6235t.setVisibility(8);
        this.f6230o.setOnClickListener(new C24421(this));
        this.f6232q.setOnClickListener(new C24432(this));
        this.f6231p = (ImageButton) findViewById(C1142R.id.bt_toggle_input);
        this.f6234s = (Button) findViewById(C1142R.id.bt_hide_input);
        this.f6233r = (Button) findViewById(C1142R.id.bt_save_input);
        this.f6236u = findViewById(C1142R.id.lyt_expand_input);
        this.f6236u.setVisibility(8);
        this.f6231p.setOnClickListener(new C24443(this));
        this.f6234s.setOnClickListener(new C24454(this));
        this.f6233r.setOnClickListener(new C24465(this));
        this.f6229n = (NestedScrollView) findViewById(C1142R.id.nested_scroll_view);
    }

    public boolean mo1941a(View view) {
        if (view.getRotation() == 0.0f) {
            view.animate().setDuration(200).rotation(180.0f);
            return true;
        }
        view.animate().setDuration(200).rotation(0.0f);
        return false;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_expansion_panel_basic);
        this.f6228m = findViewById(16908290);
        m11364j();
        m11365k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_setting, menu);
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

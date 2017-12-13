package android.sabbir.com.modernlibrarys.test.material.components.activity.expansionpanel;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import com.material.components.p089f.C2754e;
import com.material.components.p089f.C2754e.C2447a;

public class ExpansionPanelInvoice extends C0818e {
    private ImageButton f6244m;
    private ImageButton f6245n;
    private ImageButton f6246o;
    private View f6247p;
    private View f6248q;
    private View f6249r;
    private NestedScrollView f6250s;

    class C24501 implements OnClickListener {
        final /* synthetic */ ExpansionPanelInvoice f6237a;

        C24501(ExpansionPanelInvoice expansionPanelInvoice) {
            this.f6237a = expansionPanelInvoice;
        }

        public void onClick(View view) {
            this.f6237a.m11369a(view, this.f6237a.f6247p);
        }
    }

    class C24512 implements OnClickListener {
        final /* synthetic */ ExpansionPanelInvoice f6238a;

        C24512(ExpansionPanelInvoice expansionPanelInvoice) {
            this.f6238a = expansionPanelInvoice;
        }

        public void onClick(View view) {
            this.f6238a.m11369a(view, this.f6238a.f6248q);
        }
    }

    class C24523 implements OnClickListener {
        final /* synthetic */ ExpansionPanelInvoice f6239a;

        C24523(ExpansionPanelInvoice expansionPanelInvoice) {
            this.f6239a = expansionPanelInvoice;
        }

        public void onClick(View view) {
            this.f6239a.m11369a(view, this.f6239a.f6249r);
        }
    }

    private void m11369a(View view, final View view2) {
        if (mo1941a(view)) {
            C2754e.m12267a(view2, new C2447a(this) {
                final /* synthetic */ ExpansionPanelInvoice f6243b;

                public void mo1940a() {
                    C2746d.m12256a(this.f6243b.f6250s, view2);
                }
            });
        } else {
            C2754e.m12269b(view2);
        }
    }

    private void m11374j() {
        m4362a((Toolbar) findViewById(C1142R.id.toolbar));
        m4370f().mo760a(null);
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.teal_700);
    }

    private void m11375k() {
        this.f6250s = (NestedScrollView) findViewById(C1142R.id.nested_scroll_view);
        this.f6244m = (ImageButton) findViewById(C1142R.id.bt_toggle_items);
        this.f6247p = findViewById(C1142R.id.lyt_expand_items);
        this.f6244m.setOnClickListener(new C24501(this));
        this.f6245n = (ImageButton) findViewById(C1142R.id.bt_toggle_address);
        this.f6248q = findViewById(C1142R.id.lyt_expand_address);
        this.f6245n.setOnClickListener(new C24512(this));
        this.f6246o = (ImageButton) findViewById(C1142R.id.bt_toggle_description);
        this.f6249r = findViewById(C1142R.id.lyt_expand_description);
        this.f6246o.setOnClickListener(new C24523(this));
        final TextView textView = (TextView) findViewById(C1142R.id.tv_invoice_code);
        ((ImageButton) findViewById(C1142R.id.bt_copy_code)).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ ExpansionPanelInvoice f6241b;

            public void onClick(View view) {
                C2746d.m12255a(this.f6241b.getApplicationContext(), textView.getText().toString());
            }
        });
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
        setContentView((int) C1142R.layout.activity_expansion_panel_invoice);
        m11374j();
        m11375k();
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

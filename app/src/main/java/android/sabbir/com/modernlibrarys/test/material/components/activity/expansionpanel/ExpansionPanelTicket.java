package android.sabbir.com.modernlibrarys.test.material.components.activity.expansionpanel;

import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import com.material.components.p089f.C2754e;
import com.material.components.p089f.C2754e.C2447a;

public class ExpansionPanelTicket extends C0818e {
    private View f6257m;
    private NestedScrollView f6258n;
    private TextView f6259o;
    private ImageButton f6260p;
    private ImageButton f6261q;
    private ImageButton f6262r;
    private Button f6263s;
    private View f6264t;
    private View f6265u;

    class C24551 implements OnClickListener {
        final /* synthetic */ ExpansionPanelTicket f6251a;

        C24551(ExpansionPanelTicket expansionPanelTicket) {
            this.f6251a = expansionPanelTicket;
        }

        public void onClick(View view) {
            this.f6251a.m11382b(this.f6251a.f6260p);
        }
    }

    class C24562 implements OnClickListener {
        final /* synthetic */ ExpansionPanelTicket f6252a;

        C24562(ExpansionPanelTicket expansionPanelTicket) {
            this.f6252a = expansionPanelTicket;
        }

        public void onClick(View view) {
            this.f6252a.m11382b(this.f6252a.f6260p);
        }
    }

    class C24573 implements OnClickListener {
        final /* synthetic */ ExpansionPanelTicket f6253a;

        C24573(ExpansionPanelTicket expansionPanelTicket) {
            this.f6253a = expansionPanelTicket;
        }

        public void onClick(View view) {
            this.f6253a.m11385c(this.f6253a.f6261q);
        }
    }

    class C24584 implements OnClickListener {
        final /* synthetic */ ExpansionPanelTicket f6254a;

        C24584(ExpansionPanelTicket expansionPanelTicket) {
            this.f6254a = expansionPanelTicket;
        }

        public void onClick(View view) {
            C2746d.m12255a(this.f6254a.getApplicationContext(), this.f6254a.f6259o.getText().toString());
        }
    }

    class C24595 implements C2447a {
        final /* synthetic */ ExpansionPanelTicket f6255a;

        C24595(ExpansionPanelTicket expansionPanelTicket) {
            this.f6255a = expansionPanelTicket;
        }

        public void mo1940a() {
            C2746d.m12256a(this.f6255a.f6258n, this.f6255a.f6264t);
        }
    }

    class C24606 implements C2447a {
        final /* synthetic */ ExpansionPanelTicket f6256a;

        C24606(ExpansionPanelTicket expansionPanelTicket) {
            this.f6256a = expansionPanelTicket;
        }

        public void mo1940a() {
            C2746d.m12256a(this.f6256a.f6258n, this.f6256a.f6265u);
        }
    }

    private void m11382b(View view) {
        if (mo1941a(view)) {
            C2754e.m12267a(this.f6264t, new C24595(this));
        } else {
            C2754e.m12269b(this.f6264t);
        }
    }

    private void m11385c(View view) {
        if (mo1941a(view)) {
            C2754e.m12267a(this.f6265u, new C24606(this));
        } else {
            C2754e.m12269b(this.f6265u);
        }
    }

    private void m11389j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Flight Ticket");
        m4370f().mo761a(true);
    }

    private void m11390k() {
        this.f6260p = (ImageButton) findViewById(C1142R.id.bt_toggle_info);
        this.f6263s = (Button) findViewById(C1142R.id.bt_hide_info);
        this.f6264t = findViewById(C1142R.id.lyt_expand_info);
        this.f6260p.setOnClickListener(new C24551(this));
        this.f6263s.setOnClickListener(new C24562(this));
        this.f6261q = (ImageButton) findViewById(C1142R.id.bt_toggle_passenger);
        this.f6265u = findViewById(C1142R.id.lyt_expand_passenger);
        this.f6261q.setOnClickListener(new C24573(this));
        this.f6259o = (TextView) findViewById(C1142R.id.tv_booking_code);
        this.f6262r = (ImageButton) findViewById(C1142R.id.bt_copy_code);
        this.f6262r.setOnClickListener(new C24584(this));
        this.f6258n = (NestedScrollView) findViewById(C1142R.id.nested_scroll_view);
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
        setContentView((int) C1142R.layout.activity_expansion_panel_ticket);
        this.f6257m = findViewById(16908290);
        m11389j();
        m11390k();
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

package android.sabbir.com.modernlibrarys.test.material.components.activity.list;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0817d.C0816a;
import android.support.v7.app.C0818e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import butterknife.C1142R;
import com.material.components.p086a.C2280m;
import com.material.components.p086a.C2280m.C2278a;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2733h;
import java.util.ArrayList;
import java.util.List;

public class ListAnimation extends C0818e {
    private static final String[] f6307r = new String[]{"Bottom Up", "Fade In", "Left to Right", "Right to Left"};
    private View f6308m;
    private RecyclerView f6309n;
    private C2280m f6310o;
    private List<C2733h> f6311p = new ArrayList();
    private int f6312q = 1;

    class C24721 implements C2278a {
        final /* synthetic */ ListAnimation f6305a;

        C24721(ListAnimation listAnimation) {
            this.f6305a = listAnimation;
        }

        public void mo1948a(View view, C2733h c2733h, int i) {
            Snackbar.m1021a(this.f6305a.f6308m, "Item " + c2733h.f7027c + " clicked", -1).m1012a();
        }
    }

    class C24732 implements OnClickListener {
        final /* synthetic */ ListAnimation f6306a;

        C24732(ListAnimation listAnimation) {
            this.f6306a = listAnimation;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            CharSequence charSequence = ListAnimation.f6307r[i];
            if (charSequence.equalsIgnoreCase("Bottom Up")) {
                this.f6306a.f6312q = 1;
            } else if (charSequence.equalsIgnoreCase("Fade In")) {
                this.f6306a.f6312q = 2;
            } else if (charSequence.equalsIgnoreCase("Left to Right")) {
                this.f6306a.f6312q = 3;
            } else if (charSequence.equalsIgnoreCase("Right to Left")) {
                this.f6306a.f6312q = 4;
            }
            this.f6306a.m4370f().mo760a(charSequence);
            this.f6306a.m11441m();
            dialogInterface.dismiss();
        }
    }

    private void m11439k() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Animation");
        m4370f().mo761a(true);
    }

    private void m11440l() {
        this.f6309n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6309n.setLayoutManager(new LinearLayoutManager(this));
        this.f6309n.setHasFixedSize(true);
        this.f6311p = C2700a.m12159c(this);
        this.f6311p.addAll(C2700a.m12159c(this));
        this.f6311p.addAll(C2700a.m12159c(this));
        this.f6311p.addAll(C2700a.m12159c(this));
        this.f6311p.addAll(C2700a.m12159c(this));
        m11442n();
    }

    private void m11441m() {
        this.f6310o = new C2280m(this, this.f6311p, this.f6312q);
        this.f6309n.setAdapter(this.f6310o);
        this.f6310o.m11000a(new C24721(this));
    }

    private void m11442n() {
        C0816a c0816a = new C0816a(this);
        c0816a.m4350a((CharSequence) "Animation Type");
        c0816a.m4351a(false);
        c0816a.m4352a(f6307r, -1, new C24732(this));
        c0816a.m4356c();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_list_animation);
        this.f6308m = findViewById(16908290);
        m11439k();
        m11440l();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_list_animation, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                break;
            case C1142R.id.action_refresh:
                m11441m();
                break;
            case C1142R.id.action_mode:
                m11442n();
                break;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

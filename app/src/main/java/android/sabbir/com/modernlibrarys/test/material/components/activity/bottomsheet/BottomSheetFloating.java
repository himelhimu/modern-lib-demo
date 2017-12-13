package android.sabbir.com.modernlibrarys.test.material.components.activity.bottomsheet;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.C0226c;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0818e;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2275l;
import com.material.components.p086a.C2275l.C2273a;
import com.material.components.p089f.C2746d;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2728c;
import com.material.components.p093g.C2757c;
import java.util.List;

public class BottomSheetFloating extends C0818e {
    private View f6060m;
    private RecyclerView f6061n;
    private C2275l f6062o;
    private BottomSheetBehavior f6063p;
    private C0226c f6064q;
    private View f6065r;

    class C23711 implements C2273a {
        final /* synthetic */ BottomSheetFloating f6056a;

        C23711(BottomSheetFloating bottomSheetFloating) {
            this.f6056a = bottomSheetFloating;
        }

        public void mo1928a(View view, C2728c c2728c, int i) {
            Snackbar.m1021a(this.f6056a.f6060m, c2728c.f7000c + " clicked", -1).m1012a();
            this.f6056a.m11203a(c2728c);
        }
    }

    class C23722 implements OnClickListener {
        final /* synthetic */ BottomSheetFloating f6057a;

        C23722(BottomSheetFloating bottomSheetFloating) {
            this.f6057a = bottomSheetFloating;
        }

        public void onClick(View view) {
            this.f6057a.f6064q.hide();
        }
    }

    class C23733 implements OnClickListener {
        final /* synthetic */ BottomSheetFloating f6058a;

        C23733(BottomSheetFloating bottomSheetFloating) {
            this.f6058a = bottomSheetFloating;
        }

        public void onClick(View view) {
            Toast.makeText(this.f6058a.getApplicationContext(), "Submit Rating", 0).show();
        }
    }

    class C23744 implements OnDismissListener {
        final /* synthetic */ BottomSheetFloating f6059a;

        C23744(BottomSheetFloating bottomSheetFloating) {
            this.f6059a = bottomSheetFloating;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            this.f6059a.f6064q = null;
        }
    }

    private void m11203a(C2728c c2728c) {
        if (this.f6063p.m850a() == 3) {
            this.f6063p.m864b(4);
        }
        View inflate = getLayoutInflater().inflate(C1142R.layout.sheet_floating, null);
        ((TextView) inflate.findViewById(C1142R.id.name)).setText(c2728c.f7000c);
        ((TextView) inflate.findViewById(C1142R.id.brief)).setText(c2728c.f7001d);
        ((TextView) inflate.findViewById(C1142R.id.description)).setText(C1142R.string.middle_lorem_ipsum);
        inflate.findViewById(C1142R.id.bt_close).setOnClickListener(new C23722(this));
        inflate.findViewById(C1142R.id.submit_rating).setOnClickListener(new C23733(this));
        this.f6064q = new C0226c(this);
        this.f6064q.setContentView(inflate);
        if (VERSION.SDK_INT >= 21) {
            this.f6064q.getWindow().addFlags(67108864);
        }
        ((View) inflate.getParent()).setBackgroundColor(getResources().getColor(17170445));
        this.f6064q.show();
        this.f6064q.setOnDismissListener(new C23744(this));
    }

    private void m11205j() {
        this.f6061n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6061n.setLayoutManager(new GridLayoutManager(this, 2));
        this.f6061n.m358a(new C2757c(2, C2746d.m12248a((Context) this, 4), true));
        this.f6061n.setHasFixedSize(true);
        List f = C2700a.m12162f(this);
        f.addAll(C2700a.m12162f(this));
        f.addAll(C2700a.m12162f(this));
        f.addAll(C2700a.m12162f(this));
        this.f6062o = new C2275l(this, f);
        this.f6061n.setAdapter(this.f6062o);
        this.f6062o.m10988a(new C23711(this));
        this.f6065r = findViewById(C1142R.id.bottom_sheet);
        this.f6063p = BottomSheetBehavior.m846a(this.f6065r);
    }

    private void m11206k() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Places");
        m4370f().mo761a(true);
        C2746d.m12252a((Activity) this);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_bottom_sheet_floating);
        this.f6060m = findViewById(16908290);
        m11205j();
        m11206k();
        m11203a(this.f6062o.m10990f(0));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_basic, menu);
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

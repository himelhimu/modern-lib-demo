package android.sabbir.com.modernlibrarys.test.material.components.activity.bottomsheet;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.C0226c;
import android.support.v7.app.C0818e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2340x;
import com.material.components.p086a.C2340x.C2338a;
import com.material.components.p089f.C2746d;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2733h;

public class BottomSheetBasic extends C0818e {
    private RecyclerView f6051m;
    private C2340x f6052n;
    private BottomSheetBehavior f6053o;
    private C0226c f6054p;
    private View f6055q;

    class C23671 implements C2338a {
        final /* synthetic */ BottomSheetBasic f6047a;

        C23671(BottomSheetBasic bottomSheetBasic) {
            this.f6047a = bottomSheetBasic;
        }

        public void mo1927a(View view, C2733h c2733h, int i) {
            this.f6047a.m11196a(c2733h);
        }
    }

    class C23682 implements OnClickListener {
        final /* synthetic */ BottomSheetBasic f6048a;

        C23682(BottomSheetBasic bottomSheetBasic) {
            this.f6048a = bottomSheetBasic;
        }

        public void onClick(View view) {
            this.f6048a.f6054p.dismiss();
        }
    }

    class C23693 implements OnClickListener {
        final /* synthetic */ BottomSheetBasic f6049a;

        C23693(BottomSheetBasic bottomSheetBasic) {
            this.f6049a = bottomSheetBasic;
        }

        public void onClick(View view) {
            Toast.makeText(this.f6049a.getApplicationContext(), "Details clicked", 0).show();
        }
    }

    class C23704 implements OnDismissListener {
        final /* synthetic */ BottomSheetBasic f6050a;

        C23704(BottomSheetBasic bottomSheetBasic) {
            this.f6050a = bottomSheetBasic;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            this.f6050a.f6054p = null;
        }
    }

    private void m11196a(C2733h c2733h) {
        if (this.f6053o.m850a() == 3) {
            this.f6053o.m864b(4);
        }
        View inflate = getLayoutInflater().inflate(C1142R.layout.sheet_basic, null);
        ((TextView) inflate.findViewById(C1142R.id.name)).setText(c2733h.f7027c);
        ((TextView) inflate.findViewById(C1142R.id.address)).setText(C1142R.string.middle_lorem_ipsum);
        inflate.findViewById(C1142R.id.bt_close).setOnClickListener(new C23682(this));
        inflate.findViewById(C1142R.id.bt_details).setOnClickListener(new C23693(this));
        this.f6054p = new C0226c(this);
        this.f6054p.setContentView(inflate);
        if (VERSION.SDK_INT >= 21) {
            this.f6054p.getWindow().addFlags(67108864);
        }
        this.f6054p.show();
        this.f6054p.setOnDismissListener(new C23704(this));
    }

    private void m11197j() {
        this.f6051m = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6051m.setLayoutManager(new LinearLayoutManager(this));
        this.f6052n = new C2340x(this, C2700a.m12159c(this));
        this.f6051m.setAdapter(this.f6052n);
        this.f6052n.m11122a(new C23671(this));
        this.f6055q = findViewById(C1142R.id.bottom_sheet);
        this.f6053o = BottomSheetBehavior.m846a(this.f6055q);
    }

    private void m11198k() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Basic");
        m4370f().mo761a(true);
        C2746d.m12252a((Activity) this);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_bottom_sheet_basic);
        m11197j();
        m11198k();
        m11196a(this.f6052n.m11124f(0));
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

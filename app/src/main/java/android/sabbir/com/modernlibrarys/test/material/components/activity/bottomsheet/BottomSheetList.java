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
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2340x;
import com.material.components.p086a.C2340x.C2338a;
import com.material.components.p089f.C2746d;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2733h;

public class BottomSheetList extends C0818e {
    private RecyclerView f6079m;
    private C2340x f6080n;
    private BottomSheetBehavior f6081o;
    private C0226c f6082p;
    private View f6083q;

    class C23761 implements C2338a {
        final /* synthetic */ BottomSheetList f6069a;

        C23761(BottomSheetList bottomSheetList) {
            this.f6069a = bottomSheetList;
        }

        public void mo1927a(View view, C2733h c2733h, int i) {
            this.f6069a.m11213a(c2733h);
        }
    }

    class C23816 implements OnDismissListener {
        final /* synthetic */ BottomSheetList f6078a;

        C23816(BottomSheetList bottomSheetList) {
            this.f6078a = bottomSheetList;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            this.f6078a.f6082p = null;
        }
    }

    private void m11213a(final C2733h c2733h) {
        if (this.f6081o.m850a() == 3) {
            this.f6081o.m864b(4);
        }
        View inflate = getLayoutInflater().inflate(C1142R.layout.sheet_list, null);
        inflate.findViewById(C1142R.id.lyt_preview).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ BottomSheetList f6071b;

            public void onClick(View view) {
                Toast.makeText(this.f6071b.getApplicationContext(), "Preview '" + c2733h.f7027c + "' clicked", 0).show();
            }
        });
        inflate.findViewById(C1142R.id.lyt_share).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ BottomSheetList f6073b;

            public void onClick(View view) {
                Toast.makeText(this.f6073b.getApplicationContext(), "Share '" + c2733h.f7027c + "' clicked", 0).show();
            }
        });
        inflate.findViewById(C1142R.id.lyt_get_link).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ BottomSheetList f6075b;

            public void onClick(View view) {
                Toast.makeText(this.f6075b.getApplicationContext(), "Get link '" + c2733h.f7027c + "' clicked", 0).show();
            }
        });
        inflate.findViewById(C1142R.id.lyt_make_copy).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ BottomSheetList f6077b;

            public void onClick(View view) {
                Toast.makeText(this.f6077b.getApplicationContext(), "Make a copy '" + c2733h.f7027c + "' clicked", 0).show();
            }
        });
        this.f6082p = new C0226c(this);
        this.f6082p.setContentView(inflate);
        if (VERSION.SDK_INT >= 21) {
            this.f6082p.getWindow().addFlags(67108864);
        }
        this.f6082p.show();
        this.f6082p.setOnDismissListener(new C23816(this));
    }

    private void m11214j() {
        this.f6079m = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6079m.setLayoutManager(new LinearLayoutManager(this));
        this.f6080n = new C2340x(this, C2700a.m12159c(this));
        this.f6079m.setAdapter(this.f6080n);
        this.f6080n.m11122a(new C23761(this));
        this.f6083q = findViewById(C1142R.id.bottom_sheet);
        this.f6081o = BottomSheetBehavior.m846a(this.f6083q);
    }

    private void m11215k() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "List");
        m4370f().mo761a(true);
        C2746d.m12252a((Activity) this);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_bottom_sheet_list);
        m11214j();
        m11215k();
        m11213a(this.f6080n.m11124f(0));
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

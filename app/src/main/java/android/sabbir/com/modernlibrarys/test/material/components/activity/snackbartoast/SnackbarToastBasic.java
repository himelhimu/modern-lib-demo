package android.sabbir.com.modernlibrarys.test.material.components.activity.snackbartoast;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0818e;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;

public class SnackbarToastBasic extends C0818e {
    private View f6849m;

    class C26571 implements OnClickListener {
        final /* synthetic */ SnackbarToastBasic f6841a;

        C26571(SnackbarToastBasic snackbarToastBasic) {
            this.f6841a = snackbarToastBasic;
        }

        public void onClick(View view) {
            Toast.makeText(this.f6841a.getApplicationContext(), "Simple Toast", 0).show();
        }
    }

    class C26582 implements OnClickListener {
        final /* synthetic */ SnackbarToastBasic f6842a;

        C26582(SnackbarToastBasic snackbarToastBasic) {
            this.f6842a = snackbarToastBasic;
        }

        public void onClick(View view) {
            View inflate = this.f6842a.getLayoutInflater().inflate(C1142R.layout.toast_custom, (ViewGroup) this.f6842a.findViewById(C1142R.id.custom_toast_layout_id));
            ((TextView) inflate.findViewById(C1142R.id.text)).setText("Custom Toast!");
            Toast toast = new Toast(this.f6842a.getApplicationContext());
            toast.setDuration(1);
            toast.setView(inflate);
            toast.show();
        }
    }

    class C26593 implements OnClickListener {
        final /* synthetic */ SnackbarToastBasic f6843a;

        C26593(SnackbarToastBasic snackbarToastBasic) {
            this.f6843a = snackbarToastBasic;
        }

        public void onClick(View view) {
            View inflate = this.f6843a.getLayoutInflater().inflate(C1142R.layout.toast_custom, (ViewGroup) this.f6843a.findViewById(C1142R.id.custom_toast_layout_id));
            TextView textView = (TextView) inflate.findViewById(C1142R.id.text);
            textView.setTextColor(-1);
            textView.setText("Custom Toast!");
            ((CardView) inflate.findViewById(C1142R.id.lyt_card)).setCardBackgroundColor(this.f6843a.getResources().getColor(C1142R.color.yellow_800));
            Toast toast = new Toast(this.f6843a.getApplicationContext());
            toast.setDuration(1);
            toast.setView(inflate);
            toast.show();
        }
    }

    class C26604 implements OnClickListener {
        final /* synthetic */ SnackbarToastBasic f6844a;

        C26604(SnackbarToastBasic snackbarToastBasic) {
            this.f6844a = snackbarToastBasic;
        }

        public void onClick(View view) {
            Snackbar.m1021a(this.f6844a.f6849m, "Simple Snackbar", -1).m1012a();
        }
    }

    class C26615 implements OnClickListener {
        final /* synthetic */ SnackbarToastBasic f6845a;

        C26615(SnackbarToastBasic snackbarToastBasic) {
            this.f6845a = snackbarToastBasic;
        }

        public void onClick(View view) {
            this.f6845a.m11978l();
        }
    }

    class C26626 implements OnClickListener {
        final /* synthetic */ SnackbarToastBasic f6846a;

        C26626(SnackbarToastBasic snackbarToastBasic) {
            this.f6846a = snackbarToastBasic;
        }

        public void onClick(View view) {
            this.f6846a.m11979m();
        }
    }

    class C26637 implements OnClickListener {
        final /* synthetic */ SnackbarToastBasic f6847a;

        C26637(SnackbarToastBasic snackbarToastBasic) {
            this.f6847a = snackbarToastBasic;
        }

        public void onClick(View view) {
            Snackbar.m1021a(this.f6847a.f6849m, "UNDO CLICKED!", -1).m1012a();
        }
    }

    class C26648 implements OnClickListener {
        final /* synthetic */ SnackbarToastBasic f6848a;

        C26648(SnackbarToastBasic snackbarToastBasic) {
            this.f6848a = snackbarToastBasic;
        }

        public void onClick(View view) {
            Snackbar.m1021a(this.f6848a.f6849m, "UNDO CLICKED!", -1).m1012a();
        }
    }

    private void m11976j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Snackbar & Toast");
        m4370f().mo761a(true);
    }

    private void m11977k() {
        ((AppCompatButton) findViewById(C1142R.id.toast_simple)).setOnClickListener(new C26571(this));
        ((AppCompatButton) findViewById(C1142R.id.toast_custom)).setOnClickListener(new C26582(this));
        ((AppCompatButton) findViewById(C1142R.id.toast_custom_colored)).setOnClickListener(new C26593(this));
        ((AppCompatButton) findViewById(C1142R.id.snackbar_simple)).setOnClickListener(new C26604(this));
        ((AppCompatButton) findViewById(C1142R.id.snackbar_with_action)).setOnClickListener(new C26615(this));
        ((AppCompatButton) findViewById(C1142R.id.snackbar_with_action_indefinite)).setOnClickListener(new C26626(this));
    }

    private void m11978l() {
        Snackbar.m1021a(this.f6849m, "Snackbar With Action", 0).m1024a("UNDO", new C26637(this)).m1012a();
    }

    private void m11979m() {
        Snackbar.m1021a(this.f6849m, "Snackbar With Action INDEFINITE", -2).m1024a("UNDO", new C26648(this)).m1012a();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_snackbar_toast_basic);
        this.f6849m = findViewById(16908290);
        m11976j();
        m11977k();
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

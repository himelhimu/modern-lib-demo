package android.sabbir.com.modernlibrarys.test.material.components.activity.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.C0818e;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import java.util.ArrayList;
import java.util.List;

public class DialogAddReview extends C0818e {
    private ListView f6170m;
    private TextView f6171n;
    private List<String> f6172o = new ArrayList();
    private ArrayAdapter f6173p;

    class C24171 implements OnClickListener {
        final /* synthetic */ DialogAddReview f6163a;

        C24171(DialogAddReview dialogAddReview) {
            this.f6163a = dialogAddReview;
        }

        public void onClick(View view) {
            this.f6163a.m11312l();
        }
    }

    private void m11310j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Add Review");
        m4370f().mo761a(true);
    }

    private void m11311k() {
        ((FloatingActionButton) findViewById(C1142R.id.fab_add)).setOnClickListener(new C24171(this));
        this.f6170m = (ListView) findViewById(C1142R.id.listView);
        this.f6171n = (TextView) findViewById(C1142R.id.txt_no_item);
        this.f6173p = new ArrayAdapter(this, 17367043, this.f6172o);
        this.f6170m.setAdapter(this.f6173p);
    }

    private void m11312l() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C1142R.layout.dialog_add_review);
        dialog.setCancelable(true);
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -2;
        layoutParams.height = -2;
        final EditText editText = (EditText) dialog.findViewById(C1142R.id.et_post);
        final AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) dialog.findViewById(C1142R.id.rating_bar);
        ((AppCompatButton) dialog.findViewById(C1142R.id.bt_cancel)).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DialogAddReview f6165b;

            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        ((AppCompatButton) dialog.findViewById(C1142R.id.bt_submit)).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DialogAddReview f6169d;

            public void onClick(View view) {
                String trim = editText.getText().toString().trim();
                if (trim.isEmpty()) {
                    Toast.makeText(this.f6169d.getApplicationContext(), "Please fill review text", 0).show();
                } else {
                    this.f6169d.f6172o.add("(" + appCompatRatingBar.getRating() + ") " + trim);
                    this.f6169d.f6173p.notifyDataSetChanged();
                }
                if (!this.f6169d.f6173p.isEmpty()) {
                    this.f6169d.f6171n.setVisibility(8);
                }
                dialog.dismiss();
                Toast.makeText(this.f6169d.getApplicationContext(), "Submitted", 0).show();
            }
        });
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_dialog_add_review);
        m11310j();
        m11311k();
        m11312l();
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

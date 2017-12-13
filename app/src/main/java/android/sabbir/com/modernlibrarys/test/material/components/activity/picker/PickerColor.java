package android.sabbir.com.modernlibrarys.test.material.components.activity.picker;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatSeekBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;

public class PickerColor extends C0818e {
    private TextView f6437m;
    private int f6438n = 127;
    private int f6439o = 127;
    private int f6440p = 210;

    class C25081 implements OnClickListener {
        final /* synthetic */ PickerColor f6411a;

        C25081(PickerColor pickerColor) {
            this.f6411a = pickerColor;
        }

        public void onClick(View view) {
            this.f6411a.m11560l();
        }
    }

    private void m11558j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Color");
        m4370f().mo761a(true);
    }

    private void m11559k() {
        ((AppCompatButton) findViewById(C1142R.id.bt_pick_color)).setOnClickListener(new C25081(this));
        this.f6437m = (TextView) findViewById(C1142R.id.tv_result);
        this.f6437m.setTextColor(Color.rgb(this.f6438n, this.f6439o, this.f6440p));
    }

    private void m11560l() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C1142R.layout.dialog_color_picker);
        dialog.setCancelable(true);
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -2;
        layoutParams.height = -2;
        final View findViewById = dialog.findViewById(C1142R.id.view_result);
        final AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) dialog.findViewById(C1142R.id.seekbar_red);
        final AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar) dialog.findViewById(C1142R.id.seekbar_green);
        final AppCompatSeekBar appCompatSeekBar3 = (AppCompatSeekBar) dialog.findViewById(C1142R.id.seekbar_blue);
        final TextView textView = (TextView) dialog.findViewById(C1142R.id.tv_red);
        TextView textView2 = (TextView) dialog.findViewById(C1142R.id.tv_green);
        TextView textView3 = (TextView) dialog.findViewById(C1142R.id.tv_blue);
        textView.setText(this.f6438n + "");
        textView2.setText(this.f6439o + "");
        textView3.setText(this.f6440p + "");
        appCompatSeekBar.setProgress(this.f6438n);
        appCompatSeekBar2.setProgress(this.f6439o);
        appCompatSeekBar3.setProgress(this.f6440p);
        findViewById.setBackgroundColor(Color.rgb(this.f6438n, this.f6439o, this.f6440p));
        appCompatSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener(this) {
            final /* synthetic */ PickerColor f6417f;

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                textView.setText(i + "");
                findViewById.setBackgroundColor(Color.rgb(appCompatSeekBar.getProgress(), appCompatSeekBar2.getProgress(), appCompatSeekBar3.getProgress()));
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        textView = textView2;
        appCompatSeekBar2.setOnSeekBarChangeListener(new OnSeekBarChangeListener(this) {
            final /* synthetic */ PickerColor f6423f;

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                textView.setText(i + "");
                findViewById.setBackgroundColor(Color.rgb(appCompatSeekBar.getProgress(), appCompatSeekBar2.getProgress(), appCompatSeekBar3.getProgress()));
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        textView = textView3;
        appCompatSeekBar3.setOnSeekBarChangeListener(new OnSeekBarChangeListener(this) {
            final /* synthetic */ PickerColor f6429f;

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                textView.setText(i + "");
                findViewById.setBackgroundColor(Color.rgb(appCompatSeekBar.getProgress(), appCompatSeekBar2.getProgress(), appCompatSeekBar3.getProgress()));
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        final Dialog dialog2 = dialog;
        ((Button) dialog.findViewById(C1142R.id.bt_ok)).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ PickerColor f6434e;

            public void onClick(View view) {
                dialog2.dismiss();
                this.f6434e.f6438n = appCompatSeekBar.getProgress();
                this.f6434e.f6439o = appCompatSeekBar2.getProgress();
                this.f6434e.f6440p = appCompatSeekBar3.getProgress();
                this.f6434e.f6437m.setText("RGB(" + this.f6434e.f6438n + ", " + this.f6434e.f6439o + ", " + this.f6434e.f6440p + ")");
                this.f6434e.f6437m.setTextColor(Color.rgb(this.f6434e.f6438n, this.f6434e.f6439o, this.f6434e.f6440p));
            }
        });
        ((Button) dialog.findViewById(C1142R.id.bt_cancel)).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ PickerColor f6436b;

            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_picker_color);
        m11558j();
        m11559k();
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

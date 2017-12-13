package android.sabbir.com.modernlibrarys.test.material.components.activity.slider;

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

public class SliderColorPicker extends C0818e {
    private TextView f6772m;
    private int f6773n = 127;
    private int f6774o = 127;
    private int f6775p = 210;

    class C26311 implements OnClickListener {
        final /* synthetic */ SliderColorPicker f6746a;

        C26311(SliderColorPicker sliderColorPicker) {
            this.f6746a = sliderColorPicker;
        }

        public void onClick(View view) {
            this.f6746a.m11892l();
        }
    }

    private void m11890j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Color Picker");
        m4370f().mo761a(true);
    }

    private void m11891k() {
        ((AppCompatButton) findViewById(C1142R.id.bt_pick_color)).setOnClickListener(new C26311(this));
        this.f6772m = (TextView) findViewById(C1142R.id.tv_result);
        this.f6772m.setTextColor(Color.rgb(this.f6773n, this.f6774o, this.f6775p));
    }

    private void m11892l() {
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
        textView.setText(this.f6773n + "");
        textView2.setText(this.f6774o + "");
        textView3.setText(this.f6775p + "");
        appCompatSeekBar.setProgress(this.f6773n);
        appCompatSeekBar2.setProgress(this.f6774o);
        appCompatSeekBar3.setProgress(this.f6775p);
        findViewById.setBackgroundColor(Color.rgb(this.f6773n, this.f6774o, this.f6775p));
        appCompatSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener(this) {
            final /* synthetic */ SliderColorPicker f6752f;

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
            final /* synthetic */ SliderColorPicker f6758f;

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
            final /* synthetic */ SliderColorPicker f6764f;

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
            final /* synthetic */ SliderColorPicker f6769e;

            public void onClick(View view) {
                dialog2.dismiss();
                this.f6769e.f6773n = appCompatSeekBar.getProgress();
                this.f6769e.f6774o = appCompatSeekBar2.getProgress();
                this.f6769e.f6775p = appCompatSeekBar3.getProgress();
                this.f6769e.f6772m.setText("RGB(" + this.f6769e.f6773n + ", " + this.f6769e.f6774o + ", " + this.f6769e.f6775p + ")");
                this.f6769e.f6772m.setTextColor(Color.rgb(this.f6769e.f6773n, this.f6769e.f6774o, this.f6769e.f6775p));
            }
        });
        ((Button) dialog.findViewById(C1142R.id.bt_cancel)).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ SliderColorPicker f6771b;

            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_slider_color_picker);
        m11890j();
        m11891k();
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

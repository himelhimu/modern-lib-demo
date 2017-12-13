package android.sabbir.com.modernlibrarys.test.material.components.activity.player;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.graphics.PorterDuff.Mode;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0818e;
import android.support.v7.widget.AppCompatSeekBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p089f.C2743c;
import com.material.components.p089f.C2746d;

public class PlayerMusicLight extends C0818e {
    private View f6518m;
    private AppCompatSeekBar f6519n;
    private FloatingActionButton f6520o;
    private TextView f6521p;
    private TextView f6522q;
    private MediaPlayer f6523r;
    private Handler f6524s = new Handler();
    private C2743c f6525t;
    private Runnable f6526u = new C25494(this);

    class C25461 implements OnCompletionListener {
        final /* synthetic */ PlayerMusicLight f6514a;

        C25461(PlayerMusicLight playerMusicLight) {
            this.f6514a = playerMusicLight;
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            this.f6514a.f6520o.setImageResource(C1142R.drawable.ic_play_arrow);
        }
    }

    class C25472 implements OnSeekBarChangeListener {
        final /* synthetic */ PlayerMusicLight f6515a;

        C25472(PlayerMusicLight playerMusicLight) {
            this.f6515a = playerMusicLight;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            this.f6515a.f6524s.removeCallbacks(this.f6515a.f6526u);
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            this.f6515a.f6524s.removeCallbacks(this.f6515a.f6526u);
            this.f6515a.f6523r.seekTo(this.f6515a.f6525t.m12242a(seekBar.getProgress(), this.f6515a.f6523r.getDuration()));
            this.f6515a.f6524s.post(this.f6515a.f6526u);
        }
    }

    class C25483 implements OnClickListener {
        final /* synthetic */ PlayerMusicLight f6516a;

        C25483(PlayerMusicLight playerMusicLight) {
            this.f6516a = playerMusicLight;
        }

        public void onClick(View view) {
            if (this.f6516a.f6523r.isPlaying()) {
                this.f6516a.f6523r.pause();
                this.f6516a.f6520o.setImageResource(C1142R.drawable.ic_play_arrow);
                return;
            }
            this.f6516a.f6523r.start();
            this.f6516a.f6520o.setImageResource(C1142R.drawable.ic_pause);
            this.f6516a.f6524s.post(this.f6516a.f6526u);
        }
    }

    class C25494 implements Runnable {
        final /* synthetic */ PlayerMusicLight f6517a;

        C25494(PlayerMusicLight playerMusicLight) {
            this.f6517a = playerMusicLight;
        }

        public void run() {
            this.f6517a.m11652m();
            if (this.f6517a.f6523r.isPlaying()) {
                this.f6517a.f6524s.postDelayed(this, 100);
            }
        }
    }

    private boolean m11643a(ImageButton imageButton) {
        if (((String) imageButton.getTag(imageButton.getId())) != null) {
            imageButton.setColorFilter(getResources().getColor(C1142R.color.red_500), Mode.SRC_ATOP);
            imageButton.setTag(imageButton.getId(), null);
            return false;
        }
        imageButton.setTag(imageButton.getId(), "selected");
        imageButton.setColorFilter(getResources().getColor(C1142R.color.red_500), Mode.SRC_ATOP);
        return true;
    }

    private void m11649j() {
        m4362a((Toolbar) findViewById(C1142R.id.toolbar));
        m4370f().mo761a(false);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_20);
    }

    private void m11650k() {
        this.f6518m = findViewById(C1142R.id.parent_view);
        this.f6519n = (AppCompatSeekBar) findViewById(C1142R.id.seek_song_progressbar);
        this.f6520o = (FloatingActionButton) findViewById(C1142R.id.bt_play);
        this.f6519n.setProgress(0);
        this.f6519n.setMax(10000);
        this.f6521p = (TextView) findViewById(C1142R.id.tv_song_current_duration);
        this.f6522q = (TextView) findViewById(C1142R.id.tv_song_total_duration);
        this.f6523r = new MediaPlayer();
        this.f6523r.setOnCompletionListener(new C25461(this));
        try {
            this.f6523r.setAudioStreamType(3);
            AssetFileDescriptor openFd = getAssets().openFd("short_music.mp3");
            this.f6523r.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
            this.f6523r.prepare();
        } catch (Exception e) {
            Snackbar.m1021a(this.f6518m, "Cannot load audio file", -1).m1012a();
        }
        this.f6525t = new C2743c();
        this.f6519n.setOnSeekBarChangeListener(new C25472(this));
        m11651l();
        m11652m();
    }

    private void m11651l() {
        this.f6520o.setOnClickListener(new C25483(this));
    }

    private void m11652m() {
        long duration = (long) this.f6523r.getDuration();
        long currentPosition = (long) this.f6523r.getCurrentPosition();
        this.f6522q.setText(this.f6525t.m12244a(duration));
        this.f6521p.setText(this.f6525t.m12244a(currentPosition));
        this.f6519n.setProgress(this.f6525t.m12243a(currentPosition, duration));
    }

    public void controlClick(View view) {
        switch (view.getId()) {
            case C1142R.id.bt_prev:
                m11643a((ImageButton) view);
                Snackbar.m1021a(this.f6518m, "Previous", -1).m1012a();
                return;
            case C1142R.id.bt_next:
                m11643a((ImageButton) view);
                Snackbar.m1021a(this.f6518m, "Next", -1).m1012a();
                return;
            case C1142R.id.bt_repeat:
                m11643a((ImageButton) view);
                Snackbar.m1021a(this.f6518m, "Repeat", -1).m1012a();
                return;
            case C1142R.id.bt_shuffle:
                m11643a((ImageButton) view);
                Snackbar.m1021a(this.f6518m, "Shuffle", -1).m1012a();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_player_music_light);
        m11649j();
        m11650k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_music_setting, menu);
        C2746d.m12257a(menu, getResources().getColor(C1142R.color.grey_60));
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f6524s.removeCallbacks(this.f6526u);
        this.f6523r.release();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        } else {
            Snackbar.m1021a(this.f6518m, menuItem.getTitle(), -1).m1012a();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

package android.sabbir.com.modernlibrarys.test.material.components.activity.player;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.graphics.PorterDuff.Mode;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
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
import butterknife.C1142R;
import com.material.components.p089f.C2743c;
import com.material.components.p089f.C2746d;

public class PlayerMusicBasic extends C0818e {
    private View f6507m;
    private AppCompatSeekBar f6508n;
    private ImageButton f6509o;
    private MediaPlayer f6510p;
    private Handler f6511q = new Handler();
    private C2743c f6512r;
    private Runnable f6513s = new C25454(this);

    class C25421 implements OnCompletionListener {
        final /* synthetic */ PlayerMusicBasic f6503a;

        C25421(PlayerMusicBasic playerMusicBasic) {
            this.f6503a = playerMusicBasic;
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            this.f6503a.f6509o.setImageResource(C1142R.drawable.ic_play_arrow);
        }
    }

    class C25432 implements OnSeekBarChangeListener {
        final /* synthetic */ PlayerMusicBasic f6504a;

        C25432(PlayerMusicBasic playerMusicBasic) {
            this.f6504a = playerMusicBasic;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            this.f6504a.f6511q.removeCallbacks(this.f6504a.f6513s);
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            this.f6504a.f6511q.removeCallbacks(this.f6504a.f6513s);
            this.f6504a.f6510p.seekTo(this.f6504a.f6512r.m12242a(seekBar.getProgress(), this.f6504a.f6510p.getDuration()));
            this.f6504a.f6511q.post(this.f6504a.f6513s);
        }
    }

    class C25443 implements OnClickListener {
        final /* synthetic */ PlayerMusicBasic f6505a;

        C25443(PlayerMusicBasic playerMusicBasic) {
            this.f6505a = playerMusicBasic;
        }

        public void onClick(View view) {
            if (this.f6505a.f6510p.isPlaying()) {
                this.f6505a.f6510p.pause();
                this.f6505a.f6509o.setImageResource(C1142R.drawable.ic_play_arrow);
                return;
            }
            this.f6505a.f6510p.start();
            this.f6505a.f6509o.setImageResource(C1142R.drawable.ic_pause);
            this.f6505a.f6511q.post(this.f6505a.f6513s);
        }
    }

    class C25454 implements Runnable {
        final /* synthetic */ PlayerMusicBasic f6506a;

        C25454(PlayerMusicBasic playerMusicBasic) {
            this.f6506a = playerMusicBasic;
        }

        public void run() {
            long currentPosition = (long) this.f6506a.f6510p.getCurrentPosition();
            this.f6506a.f6508n.setProgress(this.f6506a.f6512r.m12243a(currentPosition, (long) this.f6506a.f6510p.getDuration()));
            if (this.f6506a.f6510p.isPlaying()) {
                this.f6506a.f6511q.postDelayed(this, 100);
            }
        }
    }

    private boolean m11633a(ImageButton imageButton) {
        if (((String) imageButton.getTag(imageButton.getId())) != null) {
            imageButton.setColorFilter(-1, Mode.SRC_ATOP);
            imageButton.setTag(imageButton.getId(), null);
            return false;
        }
        imageButton.setTag(imageButton.getId(), "selected");
        imageButton.setColorFilter(getResources().getColor(C1142R.color.red_500), Mode.SRC_ATOP);
        return true;
    }

    private void m11639j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_1000);
    }

    private void m11640k() {
        this.f6507m = findViewById(C1142R.id.parent_view);
        this.f6508n = (AppCompatSeekBar) findViewById(C1142R.id.seek_song_progressbar);
        this.f6509o = (ImageButton) findViewById(C1142R.id.bt_play);
        this.f6508n.setProgress(0);
        this.f6508n.setMax(10000);
        this.f6510p = new MediaPlayer();
        this.f6510p.setOnCompletionListener(new C25421(this));
        try {
            this.f6510p.setAudioStreamType(3);
            AssetFileDescriptor openFd = getAssets().openFd("short_music.mp3");
            this.f6510p.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
            this.f6510p.prepare();
        } catch (Exception e) {
            Snackbar.m1021a(this.f6507m, "Cannot load audio file", -1).m1012a();
        }
        this.f6512r = new C2743c();
        this.f6508n.setOnSeekBarChangeListener(new C25432(this));
        m11641l();
    }

    private void m11641l() {
        this.f6509o.setOnClickListener(new C25443(this));
    }

    public void controlClick(View view) {
        switch (view.getId()) {
            case C1142R.id.bt_prev:
                m11633a((ImageButton) view);
                Snackbar.m1021a(this.f6507m, "Previous", -1).m1012a();
                return;
            case C1142R.id.bt_next:
                m11633a((ImageButton) view);
                Snackbar.m1021a(this.f6507m, "Next", -1).m1012a();
                return;
            case C1142R.id.bt_repeat:
                m11633a((ImageButton) view);
                Snackbar.m1021a(this.f6507m, "Repeat", -1).m1012a();
                return;
            case C1142R.id.bt_shuffle:
                m11633a((ImageButton) view);
                Snackbar.m1021a(this.f6507m, "Shuffle", -1).m1012a();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_player_music_basic);
        m11639j();
        m11640k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_music_setting, menu);
        C2746d.m12257a(menu, -1);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f6511q.removeCallbacks(this.f6513s);
        this.f6510p.release();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        } else {
            Snackbar.m1021a(this.f6507m, menuItem.getTitle(), -1).m1012a();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

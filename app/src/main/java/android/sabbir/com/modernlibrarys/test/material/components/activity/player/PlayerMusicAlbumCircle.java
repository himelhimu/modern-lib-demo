package android.sabbir.com.modernlibrarys.test.material.components.activity.player;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import com.mikhaellopez.circularimageview.CircularImageView;

public class PlayerMusicAlbumCircle extends C0818e {
    private View f6457m;
    private AppCompatSeekBar f6458n;
    private FloatingActionButton f6459o;
    private TextView f6460p;
    private TextView f6461q;
    private CircularImageView f6462r;
    private MediaPlayer f6463s;
    private Handler f6464t = new Handler();
    private C2743c f6465u;
    private Runnable f6466v = new C25294(this);

    class C25261 implements OnCompletionListener {
        final /* synthetic */ PlayerMusicAlbumCircle f6452a;

        C25261(PlayerMusicAlbumCircle playerMusicAlbumCircle) {
            this.f6452a = playerMusicAlbumCircle;
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            this.f6452a.f6459o.setImageResource(C1142R.drawable.ic_play_arrow);
        }
    }

    class C25272 implements OnSeekBarChangeListener {
        final /* synthetic */ PlayerMusicAlbumCircle f6453a;

        C25272(PlayerMusicAlbumCircle playerMusicAlbumCircle) {
            this.f6453a = playerMusicAlbumCircle;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            this.f6453a.f6464t.removeCallbacks(this.f6453a.f6466v);
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            this.f6453a.f6464t.removeCallbacks(this.f6453a.f6466v);
            this.f6453a.f6463s.seekTo(this.f6453a.f6465u.m12242a(seekBar.getProgress(), this.f6453a.f6463s.getDuration()));
            this.f6453a.f6464t.post(this.f6453a.f6466v);
        }
    }

    class C25283 implements OnClickListener {
        final /* synthetic */ PlayerMusicAlbumCircle f6454a;

        C25283(PlayerMusicAlbumCircle playerMusicAlbumCircle) {
            this.f6454a = playerMusicAlbumCircle;
        }

        public void onClick(View view) {
            if (this.f6454a.f6463s.isPlaying()) {
                this.f6454a.f6463s.pause();
                this.f6454a.f6459o.setImageResource(C1142R.drawable.ic_play_arrow);
            } else {
                this.f6454a.f6463s.start();
                this.f6454a.f6459o.setImageResource(C1142R.drawable.ic_pause);
                this.f6454a.f6464t.post(this.f6454a.f6466v);
            }
            this.f6454a.m11599n();
        }
    }

    class C25294 implements Runnable {
        final /* synthetic */ PlayerMusicAlbumCircle f6455a;

        C25294(PlayerMusicAlbumCircle playerMusicAlbumCircle) {
            this.f6455a = playerMusicAlbumCircle;
        }

        public void run() {
            this.f6455a.m11598m();
            if (this.f6455a.f6463s.isPlaying()) {
                this.f6455a.f6464t.postDelayed(this, 100);
            }
        }
    }

    class C25305 extends AnimatorListenerAdapter {
        final /* synthetic */ PlayerMusicAlbumCircle f6456a;

        C25305(PlayerMusicAlbumCircle playerMusicAlbumCircle) {
            this.f6456a = playerMusicAlbumCircle;
        }

        public void onAnimationEnd(Animator animator) {
            this.f6456a.m11599n();
            super.onAnimationEnd(animator);
        }
    }

    private boolean m11588a(ImageButton imageButton) {
        if (((String) imageButton.getTag(imageButton.getId())) != null) {
            imageButton.setColorFilter(getResources().getColor(C1142R.color.grey_90), Mode.SRC_ATOP);
            imageButton.setTag(imageButton.getId(), null);
            return false;
        }
        imageButton.setTag(imageButton.getId(), "selected");
        imageButton.setColorFilter(getResources().getColor(C1142R.color.red_500), Mode.SRC_ATOP);
        return true;
    }

    private void m11595j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_1000);
    }

    private void m11596k() {
        this.f6457m = findViewById(C1142R.id.parent_view);
        this.f6458n = (AppCompatSeekBar) findViewById(C1142R.id.seek_song_progressbar);
        this.f6459o = (FloatingActionButton) findViewById(C1142R.id.bt_play);
        this.f6458n.setProgress(0);
        this.f6458n.setMax(10000);
        this.f6460p = (TextView) findViewById(C1142R.id.tv_song_current_duration);
        this.f6461q = (TextView) findViewById(C1142R.id.tv_song_total_duration);
        this.f6462r = (CircularImageView) findViewById(C1142R.id.image);
        this.f6463s = new MediaPlayer();
        this.f6463s.setOnCompletionListener(new C25261(this));
        try {
            this.f6463s.setAudioStreamType(3);
            AssetFileDescriptor openFd = getAssets().openFd("short_music.mp3");
            this.f6463s.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
            this.f6463s.prepare();
        } catch (Exception e) {
            Snackbar.m1021a(this.f6457m, "Cannot load audio file", -1).m1012a();
        }
        this.f6465u = new C2743c();
        this.f6458n.setOnSeekBarChangeListener(new C25272(this));
        m11597l();
        m11598m();
    }

    private void m11597l() {
        this.f6459o.setOnClickListener(new C25283(this));
    }

    private void m11598m() {
        long duration = (long) this.f6463s.getDuration();
        long currentPosition = (long) this.f6463s.getCurrentPosition();
        this.f6461q.setText(this.f6465u.m12244a(duration));
        this.f6460p.setText(this.f6465u.m12244a(currentPosition));
        this.f6458n.setProgress(this.f6465u.m12243a(currentPosition, duration));
    }

    private void m11599n() {
        if (this.f6463s.isPlaying()) {
            this.f6462r.animate().setDuration(100).rotation(this.f6462r.getRotation() + 2.0f).setListener(new C25305(this));
        }
    }

    public void controlClick(View view) {
        switch (view.getId()) {
            case C1142R.id.bt_prev:
                m11588a((ImageButton) view);
                Snackbar.m1021a(this.f6457m, "Previous", -1).m1012a();
                return;
            case C1142R.id.bt_next:
                m11588a((ImageButton) view);
                Snackbar.m1021a(this.f6457m, "Next", -1).m1012a();
                return;
            case C1142R.id.bt_repeat:
                m11588a((ImageButton) view);
                Snackbar.m1021a(this.f6457m, "Repeat", -1).m1012a();
                return;
            case C1142R.id.bt_shuffle:
                m11588a((ImageButton) view);
                Snackbar.m1021a(this.f6457m, "Shuffle", -1).m1012a();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_player_music_album_circle);
        m11595j();
        m11596k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_search, menu);
        C2746d.m12257a(menu, -1);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f6464t.removeCallbacks(this.f6466v);
        this.f6463s.release();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        } else {
            Snackbar.m1021a(this.f6457m, menuItem.getTitle(), -1).m1012a();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

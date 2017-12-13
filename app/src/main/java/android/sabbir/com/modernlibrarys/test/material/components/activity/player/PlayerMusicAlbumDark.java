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

public class PlayerMusicAlbumDark extends C0818e {
    private View f6471m;
    private AppCompatSeekBar f6472n;
    private FloatingActionButton f6473o;
    private TextView f6474p;
    private TextView f6475q;
    private MediaPlayer f6476r;
    private Handler f6477s = new Handler();
    private C2743c f6478t;
    private Runnable f6479u = new C25344(this);

    class C25311 implements OnCompletionListener {
        final /* synthetic */ PlayerMusicAlbumDark f6467a;

        C25311(PlayerMusicAlbumDark playerMusicAlbumDark) {
            this.f6467a = playerMusicAlbumDark;
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            this.f6467a.f6473o.setImageResource(C1142R.drawable.ic_play_arrow);
        }
    }

    class C25322 implements OnSeekBarChangeListener {
        final /* synthetic */ PlayerMusicAlbumDark f6468a;

        C25322(PlayerMusicAlbumDark playerMusicAlbumDark) {
            this.f6468a = playerMusicAlbumDark;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            this.f6468a.f6477s.removeCallbacks(this.f6468a.f6479u);
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            this.f6468a.f6477s.removeCallbacks(this.f6468a.f6479u);
            this.f6468a.f6476r.seekTo(this.f6468a.f6478t.m12242a(seekBar.getProgress(), this.f6468a.f6476r.getDuration()));
            this.f6468a.f6477s.post(this.f6468a.f6479u);
        }
    }

    class C25333 implements OnClickListener {
        final /* synthetic */ PlayerMusicAlbumDark f6469a;

        C25333(PlayerMusicAlbumDark playerMusicAlbumDark) {
            this.f6469a = playerMusicAlbumDark;
        }

        public void onClick(View view) {
            if (this.f6469a.f6476r.isPlaying()) {
                this.f6469a.f6476r.pause();
                this.f6469a.f6473o.setImageResource(C1142R.drawable.ic_play_arrow);
                return;
            }
            this.f6469a.f6476r.start();
            this.f6469a.f6473o.setImageResource(C1142R.drawable.ic_pause);
            this.f6469a.f6477s.post(this.f6469a.f6479u);
        }
    }

    class C25344 implements Runnable {
        final /* synthetic */ PlayerMusicAlbumDark f6470a;

        C25344(PlayerMusicAlbumDark playerMusicAlbumDark) {
            this.f6470a = playerMusicAlbumDark;
        }

        public void run() {
            this.f6470a.m11610m();
        }
    }

    private boolean m11601a(ImageButton imageButton) {
        if (((String) imageButton.getTag(imageButton.getId())) != null) {
            imageButton.setColorFilter(getResources().getColor(C1142R.color.grey_90), Mode.SRC_ATOP);
            imageButton.setTag(imageButton.getId(), null);
            return false;
        }
        imageButton.setTag(imageButton.getId(), "selected");
        imageButton.setColorFilter(getResources().getColor(C1142R.color.red_500), Mode.SRC_ATOP);
        return true;
    }

    private void m11607j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_1000);
    }

    private void m11608k() {
        this.f6471m = findViewById(C1142R.id.parent_view);
        this.f6472n = (AppCompatSeekBar) findViewById(C1142R.id.seek_song_progressbar);
        this.f6473o = (FloatingActionButton) findViewById(C1142R.id.bt_play);
        this.f6472n.setProgress(0);
        this.f6472n.setMax(10000);
        this.f6474p = (TextView) findViewById(C1142R.id.tv_song_current_duration);
        this.f6475q = (TextView) findViewById(C1142R.id.tv_song_total_duration);
        this.f6476r = new MediaPlayer();
        this.f6476r.setOnCompletionListener(new C25311(this));
        try {
            this.f6476r.setAudioStreamType(3);
            AssetFileDescriptor openFd = getAssets().openFd("short_music.mp3");
            this.f6476r.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
            this.f6476r.prepare();
        } catch (Exception e) {
            Snackbar.m1021a(this.f6471m, "Cannot load audio file", -1).m1012a();
        }
        this.f6478t = new C2743c();
        this.f6472n.setOnSeekBarChangeListener(new C25322(this));
        m11609l();
        m11610m();
    }

    private void m11609l() {
        this.f6473o.setOnClickListener(new C25333(this));
    }

    private void m11610m() {
        long duration = (long) this.f6476r.getDuration();
        long currentPosition = (long) this.f6476r.getCurrentPosition();
        this.f6475q.setText(this.f6478t.m12244a(duration));
        this.f6474p.setText(this.f6478t.m12244a(currentPosition));
        this.f6472n.setProgress(this.f6478t.m12243a(currentPosition, duration));
    }

    public void controlClick(View view) {
        switch (view.getId()) {
            case C1142R.id.bt_prev:
                m11601a((ImageButton) view);
                Snackbar.m1021a(this.f6471m, "Previous", -1).m1012a();
                return;
            case C1142R.id.bt_next:
                m11601a((ImageButton) view);
                Snackbar.m1021a(this.f6471m, "Next", -1).m1012a();
                return;
            case C1142R.id.bt_repeat:
                m11601a((ImageButton) view);
                Snackbar.m1021a(this.f6471m, "Repeat", -1).m1012a();
                return;
            case C1142R.id.bt_shuffle:
                m11601a((ImageButton) view);
                Snackbar.m1021a(this.f6471m, "Shuffle", -1).m1012a();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_player_music_album_dark);
        m11607j();
        m11608k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_search, menu);
        C2746d.m12257a(menu, -1);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f6477s.removeCallbacks(this.f6479u);
        this.f6476r.release();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        } else {
            Snackbar.m1021a(this.f6471m, menuItem.getTitle(), -1).m1012a();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.io.IOException;

/* renamed from: cg1  reason: default package */
public final class cg1 {
    public static final long[] h = {500, 535, 458, 535, 825};
    public final Context a;
    public final bg1 b;
    public final xzc c;
    public final r7e d = new r7e(new ag1(this, 0));
    public final r7e e = new r7e(new ag1(this, 1));
    public final r7e f = new r7e(new ag1(this, 2));
    public MediaPlayer g;

    public cg1(Context context, bg1 bg1, xzc xzc) {
        this.a = context;
        this.b = bg1;
        this.c = xzc;
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [java.lang.Object, android.media.MediaPlayer$OnPreparedListener] */
    public final void a(za6 za6, boolean z) {
        udd.p("RingtoneManagerTag", " start ringtone", new Object[0]);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            udd.p("RingtoneManagerTag", " stop ringtone", new Object[0]);
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                MediaPlayer mediaPlayer = this.g;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                this.g = null;
                try {
                    c();
                    MediaPlayer mediaPlayer2 = new MediaPlayer();
                    Context context = this.a;
                    Integer num = (Integer) za6.a;
                    if (num != null) {
                        try {
                            mediaPlayer2.setDataSource(context.getResources().openRawResourceFd(num.intValue()));
                        } catch (IOException e2) {
                            udd.u("RingtoneManagerTag", e2, e2.getMessage(), new Object[0]);
                        }
                    }
                    mediaPlayer2.setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(0).build());
                    mediaPlayer2.setLooping(z);
                    mediaPlayer2.setOnPreparedListener(new Object());
                    mediaPlayer2.setOnCompletionListener(new zf1(z, this));
                    mediaPlayer2.prepareAsync();
                    this.g = mediaPlayer2;
                } catch (IOException e3) {
                    udd.s("RingtoneManagerTag", "Got error during init player", e3);
                }
            } else {
                throw new IllegalStateException("Main (UI) thread expected".toString());
            }
        } else {
            throw new IllegalStateException("Main (UI) thread expected".toString());
        }
    }

    public final void b() {
        udd.p("RingtoneManagerTag", " startVibrate", new Object[0]);
        r7e r7e = this.e;
        if (((Vibrator) r7e.getValue()).hasVibrator()) {
            ((Vibrator) r7e.getValue()).cancel();
            ((Vibrator) r7e.getValue()).vibrate(VibrationEffect.createWaveform(h, 0), new AudioAttributes.Builder().setContentType(4).setUsage(6).build());
        }
    }

    public final void c() {
        udd.p("RingtoneManagerTag", " stop all", new Object[0]);
        udd.p("RingtoneManagerTag", " stop ringtone", new Object[0]);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            MediaPlayer mediaPlayer = this.g;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
            this.g = null;
            udd.p("RingtoneManagerTag", " stopVibrate", new Object[0]);
            ((Vibrator) this.e.getValue()).cancel();
            return;
        }
        throw new IllegalStateException("Main (UI) thread expected".toString());
    }
}

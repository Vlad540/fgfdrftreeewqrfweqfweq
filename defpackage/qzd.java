package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: qzd  reason: default package */
public final class qzd {
    public final Handler a;
    public final g45 b;
    public final AudioManager c;
    public int d = 3;
    public int e;
    public boolean f;

    public qzd(Context context, Handler handler, g45 g45) {
        Context applicationContext = context.getApplicationContext();
        this.a = handler;
        this.b = g45;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        swb.i(audioManager);
        this.c = audioManager;
        this.e = a(audioManager, 3);
        int i = this.d;
        this.f = mze.a >= 23 ? audioManager.isStreamMute(i) : a(audioManager, i) == 0;
        try {
            applicationContext.registerReceiver(new an(12, this), new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        } catch (RuntimeException e2) {
            oyb.b("Error registering stream volume receiver", e2);
        }
    }

    public static int a(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e2) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i);
            oyb.b(sb.toString(), e2);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public final void b() {
        int i = this.d;
        AudioManager audioManager = this.c;
        int a2 = a(audioManager, i);
        int i2 = this.d;
        boolean isStreamMute = mze.a >= 23 ? audioManager.isStreamMute(i2) : a(audioManager, i2) == 0;
        if (this.e != a2 || this.f != isStreamMute) {
            this.e = a2;
            this.f = isStreamMute;
            this.b.a.B0.m(30, new bi3(a2, isStreamMute));
        }
    }
}

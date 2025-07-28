package defpackage;

import android.media.MediaPlayer;

/* renamed from: zf1  reason: default package */
public final /* synthetic */ class zf1 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ cg1 b;

    public /* synthetic */ zf1(boolean z, cg1 cg1) {
        this.a = z;
        this.b = cg1;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (!this.a) {
            this.b.c();
        }
    }
}

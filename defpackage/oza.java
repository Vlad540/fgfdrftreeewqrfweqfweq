package defpackage;

import android.media.VolumeProvider;
import android.os.Build;
import android.os.Handler;

/* renamed from: oza  reason: default package */
public final class oza {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public VolumeProvider e;
    public final /* synthetic */ Handler f;
    public final /* synthetic */ qza g;

    public oza(qza qza, int i, int i2, int i3, String str, Handler handler) {
        this.g = qza;
        this.f = handler;
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = str;
    }

    public final VolumeProvider a() {
        if (this.e == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.e = new qdf(this, this.a, this.b, this.d, this.c);
            } else {
                this.e = new fj1(this, this.a, this.b, this.d);
            }
        }
        return this.e;
    }
}

package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: zy5  reason: default package */
public final class zy5 extends wy5 {
    public final fr6 f;
    public final tf4 g;
    public kk7 h;
    public q8c i;

    public zy5(mbe mbe, g15 g15, fr6 fr6, tf4 tf4) {
        super(mbe, g15);
        this.f = fr6;
        this.g = tf4;
    }

    public final void a(u2f u2f, int i2, int i3) {
        super.a(u2f, i2, i3);
        Uri l = ((jj0) u2f).l();
        int i4 = mze.a;
        String scheme = l.getScheme();
        boolean z = TextUtils.isEmpty(scheme) || "file".equals(scheme);
        g15 g15 = this.b;
        mbe mbe = this.a;
        if (z) {
            if (this.h == null) {
                this.h = new kk7(mbe, g15, this.g);
            }
            this.h.a(u2f, i2, i3);
            return;
        }
        if (this.i == null) {
            this.i = new q8c(mbe, g15, this.f);
        }
        this.i.a(u2f, i2, i3);
    }

    public final boolean b() {
        u2f u2f = this.e;
        if (u2f == null) {
            udd.s("zy5", "You should call setVideoContent before prepare!", (Throwable) null);
            return false;
        }
        Uri l = ((jj0) u2f).l();
        int i2 = mze.a;
        String scheme = l.getScheme();
        return (TextUtils.isEmpty(scheme) || "file".equals(scheme)) ? this.h.b() : this.i.b();
    }
}

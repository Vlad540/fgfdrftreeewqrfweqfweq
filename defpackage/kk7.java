package defpackage;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: kk7  reason: default package */
public final class kk7 extends wy5 {
    public final jk0 f = new jk0((Object) null);
    public c97 g;
    public final MediaMetadataRetriever h = new MediaMetadataRetriever();
    public final int i;
    public volatile long j;

    public kk7(mbe mbe, g15 g15, tf4 tf4) {
        super(mbe, g15);
        vf4 b = tf4.b();
        int ordinal = b.ordinal();
        if (ordinal == 0) {
            this.i = 5;
        } else if (ordinal == 1) {
            this.i = 10;
        } else if (ordinal == 2) {
            this.i = 20;
        } else {
            throw new IllegalStateException("unknown performance class " + b);
        }
    }

    public final boolean b() {
        u2f u2f = this.e;
        if (u2f != null) {
            Uri l = ((jj0) u2f).l();
            int i2 = mze.a;
            String scheme = l.getScheme();
            if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                return true;
            }
        }
        return false;
    }
}

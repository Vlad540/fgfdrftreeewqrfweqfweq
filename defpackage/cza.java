package defpackage;

import android.media.metrics.LogSessionId;
import java.util.Objects;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: cza  reason: default package */
public final class cza {
    public final String a;
    public final aza b;
    public final Object c;

    static {
        if (oze.a < 31) {
            new cza(BuildConfig.FLAVOR);
        } else {
            new cza(aza.b, BuildConfig.FLAVOR);
        }
    }

    public cza(String str) {
        oyb.k(oze.a < 31);
        this.a = str;
        this.b = null;
        this.c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cza)) {
            return false;
        }
        cza cza = (cza) obj;
        return Objects.equals(this.a, cza.a) && Objects.equals(this.b, cza.b) && Objects.equals(this.c, cza.c);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }

    public cza(LogSessionId logSessionId, String str) {
        this(new aza(logSessionId), str);
    }

    public cza(aza aza, String str) {
        this.b = aza;
        this.a = str;
        this.c = new Object();
    }
}

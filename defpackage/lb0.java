package defpackage;

import android.util.Range;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: lb0  reason: default package */
public final class lb0 {
    public v2b a;
    public Range b;
    public Range c;
    public Integer d;

    public final mb0 a() {
        String str = this.a == null ? " qualitySelector" : BuildConfig.FLAVOR;
        if (this.b == null) {
            str = str.concat(" frameRate");
        }
        if (this.c == null) {
            str = hr1.g(str, " bitrate");
        }
        if (this.d == null) {
            str = hr1.g(str, " aspectRatio");
        }
        if (str.isEmpty()) {
            return new mb0(this.a, this.b, this.c, this.d.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final void b(v2b v2b) {
        if (v2b != null) {
            this.a = v2b;
            return;
        }
        throw new NullPointerException("Null qualitySelector");
    }
}

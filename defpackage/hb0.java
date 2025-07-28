package defpackage;

import android.util.Base64;
import java.util.Arrays;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: hb0  reason: default package */
public final class hb0 {
    public final String a;
    public final byte[] b;
    public final t3b c;

    public hb0(String str, byte[] bArr, t3b t3b) {
        this.a = str;
        this.b = bArr;
        this.c = t3b;
    }

    public static ydc a() {
        ydc ydc = new ydc(2, false);
        ydc.o = t3b.a;
        return ydc;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hb0)) {
            return false;
        }
        hb0 hb0 = (hb0) obj;
        return this.a.equals(hb0.a) && Arrays.equals(this.b, hb0.b) && this.c.equals(hb0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String encodeToString = bArr == null ? BuildConfig.FLAVOR : Base64.encodeToString(bArr, 2);
        return "TransportContext(" + this.a + ", " + this.c + ", " + encodeToString + ")";
    }
}

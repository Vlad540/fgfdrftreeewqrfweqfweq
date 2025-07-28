package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.common.time.RealtimeSinceBootClock;

/* renamed from: zm0  reason: default package */
public final class zm0 implements ov0 {
    public final String a;
    public final hbc b;
    public final rfc c;
    public final gq6 d;
    public final ov0 e;
    public final String f;
    public Object g;
    public final int h;

    public zm0(String str, hbc hbc, rfc rfc, gq6 gq6, ov0 ov0, String str2) {
        this.a = str;
        this.b = hbc;
        this.c = rfc;
        this.d = gq6;
        this.e = ov0;
        this.f = str2;
        this.h = ((((gq6.hashCode() + ((rfc.hashCode() + (((str.hashCode() * 31) + (hbc != null ? hbc.hashCode() : 0)) * 31)) * 31)) * 31) + (ov0 != null ? ov0.hashCode() : 0)) * 31) + (str2 != null ? str2.hashCode() : 0);
        RealtimeSinceBootClock.get().getClass();
        SystemClock.elapsedRealtime();
    }

    public final boolean a(Uri uri) {
        return h0e.R(this.a, uri.toString(), false);
    }

    public final boolean b() {
        return false;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zm0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        zm0 zm0 = (zm0) obj;
        return hhd.f(this.a, zm0.a) && hhd.f(this.b, zm0.b) && hhd.f(this.c, zm0.c) && hhd.f(this.d, zm0.d) && hhd.f(this.e, zm0.e) && hhd.f(this.f, zm0.f);
    }

    public final int hashCode() {
        return this.h;
    }

    public final String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.a + ", resizeOptions=" + this.b + ", rotationOptions=" + this.c + ", imageDecodeOptions=" + this.d + ", postprocessorCacheKey=" + this.e + ", postprocessorName=" + this.f + ")";
    }
}

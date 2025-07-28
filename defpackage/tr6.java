package defpackage;

import android.net.Uri;
import java.io.File;

/* renamed from: tr6  reason: default package */
public final class tr6 {
    public final rr6 a;
    public final Uri b;
    public final int c;
    public File d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final gq6 h;
    public final hbc i;
    public final rfc j;
    public final u3b k;
    public final sr6 l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final Boolean p;
    public final k1b q;
    public final tac r;
    public final Boolean s;
    public final vl4 t;
    public final String u;
    public final int v;

    public tr6(ur6 ur6) {
        this.a = ur6.g;
        Uri uri = ur6.a;
        this.b = uri;
        boolean z = false;
        int i2 = -1;
        if (uri != null) {
            if (fye.e(uri)) {
                i2 = 0;
            } else if (uri.getPath() != null && "file".equals(fye.b(uri))) {
                String a2 = sh8.a(uri.getPath());
                i2 = a2 != null ? p0e.Q(a2, "video/", false) : false ? 2 : 3;
            } else if ("content".equals(fye.b(uri))) {
                i2 = 4;
            } else if ("asset".equals(fye.b(uri))) {
                i2 = 5;
            } else if ("res".equals(fye.b(uri))) {
                i2 = 6;
            } else if ("data".equals(uri.getScheme())) {
                i2 = 7;
            } else if ("android.resource".equals(fye.b(uri))) {
                i2 = 8;
            }
        }
        this.c = i2;
        this.e = ur6.h;
        this.f = ur6.i;
        this.g = ur6.j;
        this.h = ur6.f;
        this.i = ur6.d;
        rfc rfc = ur6.e;
        this.j = rfc == null ? rfc.b : rfc;
        ur6.getClass();
        this.k = ur6.k;
        this.l = ur6.b;
        boolean z2 = (ur6.c & 48) == 0 && (fye.e(ur6.a) || ur6.c(ur6.a));
        this.n = z2;
        int i3 = ur6.c;
        this.m = !z2 ? i3 | 48 : i3;
        this.o = (i3 & 15) == 0 ? true : z;
        this.p = ur6.m;
        this.q = ur6.l;
        this.r = ur6.n;
        this.s = ur6.o;
        this.t = ur6.p;
        this.v = ur6.q;
        this.u = ur6.r;
    }

    public static tr6 a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return ur6.d(uri).a();
    }

    public static tr6 b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return a(Uri.parse(str));
    }

    public final synchronized File c() {
        try {
            if (this.d == null) {
                this.b.getPath().getClass();
                this.d = new File(this.b.getPath());
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.d;
    }

    public final boolean d(int i2) {
        return (this.m & i2) == 0;
    }

    public final boolean equals(Object obj) {
        tr6 tr6;
        if (!(obj instanceof tr6) || this.f != (tr6 = (tr6) obj).f || this.n != tr6.n || this.o != tr6.o || !at7.o(this.b, tr6.b) || !at7.o(this.a, tr6.a) || !at7.o(this.u, tr6.u) || !at7.o(this.d, tr6.d)) {
            return false;
        }
        tr6.getClass();
        if (!at7.o((Object) null, (Object) null) || !at7.o(this.h, tr6.h) || !at7.o(this.i, tr6.i) || !at7.o(this.k, tr6.k) || !at7.o(this.l, tr6.l) || !at7.o(Integer.valueOf(this.m), Integer.valueOf(tr6.m)) || !at7.o(this.p, tr6.p) || !at7.o(this.s, tr6.s) || !at7.o(this.t, tr6.t) || !at7.o(this.j, tr6.j) || this.g != tr6.g) {
            return false;
        }
        ov0 ov0 = null;
        k1b k1b = this.q;
        ov0 b2 = k1b != null ? k1b.b() : null;
        k1b k1b2 = tr6.q;
        if (k1b2 != null) {
            ov0 = k1b2.b();
        }
        return at7.o(b2, ov0) && this.v == tr6.v;
    }

    public final int hashCode() {
        k1b k1b = this.q;
        return js.i(js.i(js.i(js.i(js.i(js.i(js.i(js.i(js.i(js.i(js.i(js.i(js.i(js.i(js.i(js.i(js.i(js.i(0, this.a), this.b), Boolean.valueOf(this.f)), (Object) null), this.k), this.l), Integer.valueOf(this.m)), Boolean.valueOf(this.n)), Boolean.valueOf(this.o)), this.h), this.p), this.i), this.j), k1b != null ? k1b.b() : null), this.s), this.t), Integer.valueOf(this.v)), Boolean.valueOf(this.g));
    }

    public final String toString() {
        jg8 X = at7.X(this);
        X.h(this.b, "uri");
        X.h(this.a, "cacheChoice");
        X.h(this.h, "decodeOptions");
        X.h(this.q, "postprocessor");
        X.h(this.k, "priority");
        X.h(this.i, "resizeOptions");
        X.h(this.j, "rotationOptions");
        X.h((Object) null, "bytesRange");
        X.h(this.s, "resizingAllowedOverride");
        X.h(this.t, "downsampleOverride");
        X.g("progressiveRenderingEnabled", this.e);
        X.g("localThumbnailPreviewsEnabled", this.f);
        X.g("loadThumbnailOnly", this.g);
        X.h(this.l, "lowestPermittedRequestLevel");
        X.f(this.m, "cachesDisabled");
        X.g("isDiskCacheEnabled", this.n);
        X.g("isMemoryCacheEnabled", this.o);
        X.h(this.p, "decodePrefetches");
        X.f(this.v, "delayMs");
        return X.toString();
    }
}

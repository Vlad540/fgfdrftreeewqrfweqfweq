package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: w58  reason: default package */
public final class w58 {
    public static final String i = Integer.toString(0, 36);
    public static final String j = Integer.toString(1, 36);
    public static final String k = Integer.toString(2, 36);
    public static final String l = Integer.toString(3, 36);
    public static final String m = Integer.toString(4, 36);
    public static final String n = Integer.toString(5, 36);
    public static final String o = Integer.toString(6, 36);
    public static final String p = Integer.toString(7, 36);
    public final UUID a;
    public final Uri b;
    public final zs6 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final ws6 g;
    public final byte[] h;

    static {
        int i2 = oze.a;
    }

    public w58(q44 q44) {
        oyb.k(!q44.c || ((Uri) q44.e) != null);
        UUID uuid = (UUID) q44.d;
        uuid.getClass();
        this.a = uuid;
        this.b = (Uri) q44.e;
        this.c = (zs6) q44.f;
        this.d = q44.a;
        this.f = q44.c;
        this.e = q44.b;
        this.g = (ws6) q44.g;
        byte[] bArr = (byte[]) q44.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w58)) {
            return false;
        }
        w58 w58 = (w58) obj;
        return this.a.equals(w58.a) && oze.a(this.b, w58.b) && oze.a(this.c, w58.c) && this.d == w58.d && this.f == w58.f && this.e == w58.e && this.g.equals(w58.g) && Arrays.equals(this.h, w58.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int hashCode2 = uri != null ? uri.hashCode() : 0;
        int hashCode3 = this.c.hashCode();
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((hashCode3 + ((hashCode + hashCode2) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}

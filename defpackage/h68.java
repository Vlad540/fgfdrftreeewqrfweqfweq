package defpackage;

import android.net.Uri;

/* renamed from: h68  reason: default package */
public class h68 {
    public static final String h = Integer.toString(0, 36);
    public static final String i = Integer.toString(1, 36);
    public static final String j = Integer.toString(2, 36);
    public static final String k = Integer.toString(3, 36);
    public static final String l = Integer.toString(4, 36);
    public static final String m = Integer.toString(5, 36);
    public static final String n = Integer.toString(6, 36);
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    static {
        int i2 = oze.a;
    }

    public h68(g68 g68) {
        this.a = (Uri) g68.a;
        this.b = g68.b;
        this.c = (String) g68.c;
        this.d = g68.d;
        this.e = g68.e;
        this.f = (String) g68.f;
        this.g = (String) g68.g;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [g68, java.lang.Object] */
    public final g68 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h68)) {
            return false;
        }
        h68 h68 = (h68) obj;
        return this.a.equals(h68.a) && oze.a(this.b, h68.b) && oze.a(this.c, h68.c) && this.d == h68.d && this.e == h68.e && oze.a(this.f, h68.f) && oze.a(this.g, h68.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i2 = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode4 + i2;
    }
}

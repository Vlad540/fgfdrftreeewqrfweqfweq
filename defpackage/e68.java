package defpackage;

import android.net.Uri;

/* renamed from: e68  reason: default package */
public final class e68 {
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    public e68(g68 g68) {
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
        if (!(obj instanceof e68)) {
            return false;
        }
        e68 e68 = (e68) obj;
        return this.a.equals(e68.a) && mze.a(this.b, e68.b) && mze.a(this.c, e68.c) && this.d == e68.d && this.e == e68.e && mze.a(this.f, e68.f) && mze.a(this.g, e68.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }
}

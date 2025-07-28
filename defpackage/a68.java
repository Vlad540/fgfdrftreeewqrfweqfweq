package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: a68  reason: default package */
public final class a68 {
    public static final String j = Integer.toString(0, 36);
    public static final String k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);
    public static final String n = Integer.toString(4, 36);
    public static final String o = Integer.toString(5, 36);
    public static final String p = Integer.toString(6, 36);
    public static final String q = Integer.toString(7, 36);
    public final Uri a;
    public final String b;
    public final w58 c;
    public final p58 d;
    public final List e;
    public final String f;
    public final ws6 g;
    public final Object h;
    public final long i;

    static {
        int i2 = oze.a;
    }

    public a68(Uri uri, String str, w58 w58, p58 p58, List list, String str2, ws6 ws6, Object obj, long j2) {
        this.a = uri;
        this.b = c49.l(str);
        this.c = w58;
        this.d = p58;
        this.e = list;
        this.f = str2;
        this.g = ws6;
        ts6 i2 = ws6.i();
        for (int i3 = 0; i3 < ws6.size(); i3++) {
            i2.d(new h68(((h68) ws6.get(i3)).a()));
        }
        i2.j();
        this.h = obj;
        this.i = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a68)) {
            return false;
        }
        a68 a68 = (a68) obj;
        return this.a.equals(a68.a) && oze.a(this.b, a68.b) && oze.a(this.c, a68.c) && oze.a(this.d, a68.d) && this.e.equals(a68.e) && oze.a(this.f, a68.f) && this.g.equals(a68.g) && oze.a(this.h, a68.h) && Long.valueOf(this.i).equals(Long.valueOf(a68.i));
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i2 = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        w58 w58 = this.c;
        int hashCode3 = (hashCode2 + (w58 == null ? 0 : w58.hashCode())) * 31;
        p58 p58 = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (p58 == null ? 0 : p58.hashCode())) * 31)) * 31;
        String str2 = this.f;
        int hashCode5 = (this.g.hashCode() + ((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.h;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return (int) ((((long) (hashCode5 + i2)) * 31) + this.i);
    }
}

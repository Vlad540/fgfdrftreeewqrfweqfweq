package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: d68  reason: default package */
public final class d68 {
    public static final d68 d = new d68(new Object());
    public static final String e = Integer.toString(0, 36);
    public static final String f = Integer.toString(1, 36);
    public static final String g = Integer.toString(2, 36);
    public final Uri a;
    public final String b;
    public final Bundle c;

    /* JADX WARNING: type inference failed for: r0v0, types: [it4, java.lang.Object] */
    static {
        int i = oze.a;
    }

    public d68(it4 it4) {
        this.a = (Uri) it4.a;
        this.b = (String) it4.b;
        this.c = (Bundle) it4.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d68)) {
            return false;
        }
        d68 d68 = (d68) obj;
        if (oze.a(this.a, d68.a) && oze.a(this.b, d68.b)) {
            if ((this.c == null) == (d68.c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        Uri uri = this.a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        if (this.c != null) {
            i = 1;
        }
        return hashCode2 + i;
    }
}

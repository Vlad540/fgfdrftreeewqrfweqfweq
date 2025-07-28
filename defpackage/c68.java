package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: c68  reason: default package */
public final class c68 {
    public final Uri a;
    public final String b = null;
    public final List c;
    public final String d;
    public final ws6 e;
    public final Object f;

    public c68(Uri uri, jjd jjd, List list, e8c e8c) {
        this.a = uri;
        this.c = list;
        this.d = null;
        this.e = e8c;
        ts6 i = ws6.i();
        for (int i2 = 0; i2 < e8c.size(); i2++) {
            i.d(new e68(((e68) e8c.get(i2)).a()));
        }
        i.j();
        this.f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c68)) {
            return false;
        }
        c68 c68 = (c68) obj;
        if (this.a.equals(c68.a) && mze.a(this.b, c68.b)) {
            c68.getClass();
            if (mze.a((Object) null, (Object) null) && mze.a((Object) null, (Object) null) && this.c.equals(c68.c) && mze.a(this.d, c68.d) && this.e.equals(c68.e) && mze.a(this.f, c68.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + 0) * 961)) * 31;
        String str2 = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.f;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode3 + i;
    }
}

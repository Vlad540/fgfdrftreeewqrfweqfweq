package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ytf  reason: default package */
public final class ytf {
    public final String a;
    public final ctf b;
    public final zy3 c;
    public final int d;
    public final int e;
    public final List f;
    public final List g;

    public ytf(String str, ctf ctf, zy3 zy3, int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = ctf;
        this.c = zy3;
        this.d = i;
        this.e = i2;
        this.f = arrayList;
        this.g = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytf)) {
            return false;
        }
        ytf ytf = (ytf) obj;
        return hhd.f(this.a, ytf.a) && this.b == ytf.b && hhd.f(this.c, ytf.c) && this.d == ytf.d && this.e == ytf.e && hhd.f(this.f, ytf.f) && hhd.f(this.g, ytf.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.g.hashCode() + c3d.f(this.f, c3d.d(this.e, c3d.d(this.d, (hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", runAttemptCount=" + this.d + ", generation=" + this.e + ", tags=" + this.f + ", progress=" + this.g + ')';
    }
}

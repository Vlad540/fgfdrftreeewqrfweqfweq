package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: s72  reason: default package */
public final class s72 implements Serializable {
    public final Set A0;
    public final Set X;
    public final Set Y;
    public final boolean Z;
    public final String a;
    public final String b;
    public final String c;
    public final Set o;
    public final List w0;
    public final long x0;
    public final Map y0;
    public final List z0;

    public s72(String str, String str2, String str3, Set set, Set set2, Set set3, boolean z, List list, long j, Map map, List list2, Set set4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.o = set;
        this.X = set2;
        this.Y = set3;
        this.Z = z;
        this.w0 = list;
        this.x0 = j;
        this.y0 = map;
        this.z0 = list2;
        this.A0 = set4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s72)) {
            return false;
        }
        s72 s72 = (s72) obj;
        return hhd.f(this.a, s72.a) && hhd.f(this.b, s72.b) && hhd.f(this.c, s72.c) && hhd.f(this.o, s72.o) && hhd.f(this.X, s72.X) && hhd.f(this.Y, s72.Y) && this.Z == s72.Z && hhd.f(this.w0, s72.w0) && this.x0 == s72.x0 && hhd.f(this.y0, s72.y0) && hhd.f(this.z0, s72.z0) && hhd.f(this.A0, s72.A0);
    }

    public final int hashCode() {
        int d = me4.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.o.hashCode();
        return this.A0.hashCode() + c3d.f(this.z0, (this.y0.hashCode() + sxe.m(c3d.f(this.w0, th2.f((this.Y.hashCode() + ((this.X.hashCode() + ((hashCode2 + ((d + hashCode) * 31)) * 31)) * 31)) * 31, 31, this.Z), 31), 31, this.x0)) * 31, 31);
    }

    public final String toString() {
        return "ChatFolder(id=" + this.a + ", title=" + this.b + ", emoji=" + this.c + ", include=" + this.o + ", favorites=" + this.X + ", filters=" + this.Y + ", hideEmpty=" + this.Z + ", elements=" + this.w0 + ", creatorId=" + this.x0 + ", filterSubjects=" + this.y0 + ", widgets=" + this.z0 + ", options=" + this.A0 + ")";
    }
}

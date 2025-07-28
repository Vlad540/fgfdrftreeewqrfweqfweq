package defpackage;

import java.util.List;

/* renamed from: bud  reason: default package */
public final class bud {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final List h;
    public final boolean i;

    public bud(vtd vtd) {
        this.a = vtd.a;
        this.b = vtd.b;
        this.c = vtd.c;
        this.d = vtd.d;
        this.e = vtd.e;
        this.f = vtd.f;
        this.g = vtd.g;
        this.h = vtd.h;
        this.i = vtd.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bud.class != obj.getClass()) {
            return false;
        }
        bud bud = (bud) obj;
        if (this.a != bud.a || this.d != bud.d || this.e != bud.e || this.f != bud.f || this.i != bud.i) {
            return false;
        }
        String str = bud.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = bud.c;
        String str4 = this.c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.g.equals(bud.g)) {
            return false;
        }
        return this.h.equals(bud.h);
    }

    public final int hashCode() {
        long j = this.a;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        int i3 = 0;
        String str = this.b;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        long j2 = this.d;
        long j3 = this.e;
        long j4 = this.f;
        return ((this.h.hashCode() + me4.d((((((((hashCode + i3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.g)) * 31) + (this.i ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerSetData{id=");
        sb.append(this.a);
        sb.append(", name='");
        sb.append(this.b);
        sb.append("', iconUrl='");
        sb.append(this.c);
        sb.append("', authorId=");
        sb.append(this.d);
        sb.append(", createTime=");
        sb.append(this.e);
        sb.append(", updateTime=");
        sb.append(this.f);
        sb.append(", link='");
        sb.append(this.g);
        sb.append("', stickers=");
        sb.append(this.h);
        sb.append(", draft=");
        return hr1.j(sb, this.i, "}");
    }
}

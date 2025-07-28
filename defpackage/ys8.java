package defpackage;

import java.util.Objects;

/* renamed from: ys8  reason: default package */
public final class ys8 {
    public final dr8 a;
    public final String b;
    public final long c;
    public final int d;
    public final f3f e;
    public final String f;

    public ys8(xs8 xs8) {
        this.a = xs8.a;
        this.b = xs8.b;
        this.c = xs8.c;
        this.d = xs8.d;
        this.e = xs8.e;
        this.f = xs8.f;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, xs8] */
    public final xs8 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.f = this.f;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ys8.class != obj.getClass()) {
            return false;
        }
        ys8 ys8 = (ys8) obj;
        if (this.c != ys8.c) {
            return false;
        }
        dr8 dr8 = ys8.a;
        dr8 dr82 = this.a;
        if (dr82 == null ? dr8 != null : !dr82.equals(dr8)) {
            return false;
        }
        String str = ys8.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        if (this.d != ys8.d || !Objects.equals(this.f, ys8.f)) {
            return false;
        }
        f3f f3f = ys8.e;
        f3f f3f2 = this.e;
        return f3f2 != null ? f3f2.equals(f3f) : f3f == null;
    }

    public final int hashCode() {
        int i = 0;
        dr8 dr8 = this.a;
        int hashCode = (dr8 != null ? dr8.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.c;
        int i2 = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        int i3 = this.d;
        int t = (i2 + (i3 != 0 ? hr1.t(i3) : 0)) * 31;
        f3f f3f = this.e;
        int hashCode3 = (t + (f3f != null ? f3f.hashCode() : 0)) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "MessageUpload{messageMediaUploadKey=" + this.a + ", path='" + this.b + "', attachLocalId='" + this.f + "', lastModified=" + this.c + ", uploadType=" + sxe.s(this.d) + ", videoConvertOptions=" + this.e + '}';
    }
}

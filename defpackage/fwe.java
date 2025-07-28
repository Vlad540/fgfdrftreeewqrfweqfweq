package defpackage;

import java.util.Objects;

/* renamed from: fwe  reason: default package */
public final class fwe {
    public final String a;
    public final long b;
    public final int c;
    public final String d;

    public fwe(af8 af8) {
        this.a = (String) af8.c;
        this.b = af8.a;
        this.c = af8.b;
        this.d = (String) af8.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fwe.class != obj.getClass()) {
            return false;
        }
        fwe fwe = (fwe) obj;
        if (this.b != fwe.b) {
            return false;
        }
        String str = fwe.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        if (!Objects.equals(this.d, fwe.d)) {
            return false;
        }
        return this.c == fwe.c;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.b;
        int i2 = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        int i3 = this.c;
        int t = (i2 + (i3 != 0 ? hr1.t(i3) : 0)) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return t + i;
    }

    public final String toString() {
        return "UploadData{path='" + this.a + "'attachLocalId='" + this.d + "', lastModified=" + this.b + ", uploadType=" + sxe.s(this.c) + '}';
    }
}

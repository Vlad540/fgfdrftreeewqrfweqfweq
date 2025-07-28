package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

/* renamed from: dtf  reason: default package */
public final class dtf {
    public final UUID a;
    public final ctf b;
    public final zy3 c;
    public final HashSet d;
    public final zy3 e;
    public final int f;
    public final int g;

    public dtf(UUID uuid, ctf ctf, zy3 zy3, ArrayList arrayList, zy3 zy32, int i, int i2) {
        this.a = uuid;
        this.b = ctf;
        this.c = zy3;
        this.d = new HashSet(arrayList);
        this.e = zy32;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dtf.class != obj.getClass()) {
            return false;
        }
        dtf dtf = (dtf) obj;
        if (this.f == dtf.f && this.g == dtf.g && this.a.equals(dtf.a) && this.b == dtf.b && this.c.equals(dtf.c) && this.d.equals(dtf.d)) {
            return this.e.equals(dtf.e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        return ((((this.e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.a + "', mState=" + this.b + ", mOutputData=" + this.c + ", mTags=" + this.d + ", mProgress=" + this.e + '}';
    }
}

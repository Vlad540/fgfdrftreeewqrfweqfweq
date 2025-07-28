package defpackage;

import android.text.Layout;

/* renamed from: pc5  reason: default package */
public final class pc5 implements rz {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final Layout e;
    public final kc5 f;
    public final mge g;
    public final String h;
    public final oc5 i;
    public final int j;
    public final tp6 k;
    public final q1f l;
    public final boolean m;
    public final zqd n;

    public pc5(long j2, long j3, String str, String str2, Layout layout, kc5 kc5, mge mge, String str3, oc5 oc5, int i2, tp6 tp6, q1f q1f, boolean z, grd grd) {
        this.a = j2;
        this.b = j3;
        this.c = str;
        this.d = str2;
        this.e = layout;
        this.f = kc5;
        this.g = mge;
        this.h = str3;
        this.i = oc5;
        this.j = i2;
        this.k = tp6;
        this.l = q1f;
        this.m = z;
        this.n = grd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc5)) {
            return false;
        }
        pc5 pc5 = (pc5) obj;
        return this.b == pc5.b && this.a == pc5.a && hhd.f(this.c, pc5.c) && hhd.f(this.d, pc5.d) && hhd.f(this.e, pc5.e) && this.f == pc5.f && hhd.f(this.g, pc5.g) && hhd.f(this.h, pc5.h) && this.j == pc5.j && hhd.f(this.k, pc5.k) && hhd.f(this.l, pc5.l) && this.m == pc5.m && hhd.f(this.i, pc5.i);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + me4.d(me4.d(sxe.m(Long.hashCode(this.b) * 31, 31, this.a), 31, this.c), 31, this.d)) * 31)) * 31;
        int i2 = 0;
        mge mge = this.g;
        int hashCode2 = (hashCode + (mge != null ? mge.hashCode() : 0)) * 31;
        String str = this.h;
        int h2 = us8.h(this.j, (hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31);
        tp6 tp6 = this.k;
        int hashCode3 = (h2 + (tp6 != null ? tp6.hashCode() : 0)) * 31;
        q1f q1f = this.l;
        int f2 = th2.f((hashCode3 + (q1f != null ? q1f.hashCode() : 0)) * 31, 31, this.m);
        oc5 oc5 = this.i;
        if (oc5 != null) {
            i2 = oc5.hashCode();
        }
        return f2 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileAttachModel(fileId=");
        sb.append(this.a);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", attachLocalId=");
        sb.append(this.c);
        sb.append(", fileName=");
        sb.append(this.d);
        sb.append(", fileNameLayout=");
        sb.append(this.e);
        sb.append(", extension=");
        sb.append(this.f);
        sb.append(", size=");
        sb.append(this.g);
        sb.append(", localPath=");
        sb.append(this.h);
        sb.append(", state=");
        sb.append(this.i);
        sb.append(", type=");
        int i2 = this.j;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "UNKNOWN" : "GIF" : "VIDEO" : "PHOTO");
        sb.append(", imageAttachConfig=");
        sb.append(this.k);
        sb.append(", videoAttachConfig=");
        sb.append(this.l);
        sb.append(", hasText=");
        sb.append(this.m);
        sb.append(", stateFlow=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}

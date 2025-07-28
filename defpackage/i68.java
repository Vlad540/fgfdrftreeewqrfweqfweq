package defpackage;

/* renamed from: i68  reason: default package */
public final class i68 implements k68 {
    public final String X;
    public final long Y;
    public final int Z;
    public final long a;
    public final long b;
    public final rz c;
    public final q1f o;

    public i68(long j, long j2, rz rzVar, q1f q1f, String str) {
        this.a = j;
        this.b = j2;
        this.c = rzVar;
        this.o = q1f;
        this.X = str;
        String str2 = q1f.g;
        this.Y = str2 != null ? (long) str2.hashCode() : 0;
        this.Z = a2a.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i68)) {
            return false;
        }
        i68 i68 = (i68) obj;
        return this.a == i68.a && this.b == i68.b && hhd.f(this.c, i68.c) && hhd.f(this.o, i68.o) && hhd.f(this.X, i68.X);
    }

    public final long getItemId() {
        return this.Y;
    }

    public final long h() {
        return this.b;
    }

    public final int hashCode() {
        int m = sxe.m(Long.hashCode(this.a) * 31, 31, this.b);
        rz rzVar = this.c;
        int hashCode = rzVar == null ? 0 : rzVar.hashCode();
        return this.X.hashCode() + ((this.o.hashCode() + ((m + hashCode) * 31)) * 31);
    }

    public final long j() {
        return this.a;
    }

    public final int l() {
        return this.Z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Video(messageId=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", attachModel=");
        sb.append(this.c);
        sb.append(", videoAttachConfig=");
        sb.append(this.o);
        sb.append(", localId=");
        return wn6.l(sb, this.X, ")");
    }

    public final String x() {
        return this.X;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i68(long r10, long r12, rz r14, q1f r15) {
        /*
            r9 = this;
            java.lang.String r0 = r15.g
            if (r0 != 0) goto L_0x0006
            java.lang.String r0 = ""
        L_0x0006:
            r8 = r0
            r1 = r9
            r2 = r10
            r4 = r12
            r6 = r14
            r7 = r15
            r1.<init>(r2, r4, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i68.<init>(long, long, rz, q1f):void");
    }
}

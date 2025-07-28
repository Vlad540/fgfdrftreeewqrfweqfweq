package defpackage;

import android.net.Uri;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: mxb  reason: default package */
public final class mxb {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public mxb(long j, String str, long j2) {
        this.c = str == null ? BuildConfig.FLAVOR : str;
        this.a = j;
        this.b = j2;
    }

    public final mxb a(mxb mxb, String str) {
        long j;
        mxb mxb2 = mxb;
        String str2 = str;
        String D = mt0.D(str2, this.c);
        if (mxb2 == null || !D.equals(mt0.D(str2, mxb2.c))) {
            return null;
        }
        long j2 = this.b;
        long j3 = -1;
        int i = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        long j4 = mxb2.b;
        if (i != 0) {
            long j5 = this.a;
            j = j2;
            if (j5 + j2 == mxb2.a) {
                if (j4 != -1) {
                    j3 = j + j4;
                }
                return new mxb(j5, D, j3);
            }
        } else {
            j = j2;
        }
        if (j4 != -1) {
            long j6 = mxb2.a;
            if (j6 + j4 == this.a) {
                if (j != -1) {
                    j3 = j4 + j;
                }
                return new mxb(j6, D, j3);
            }
        }
        return null;
    }

    public final Uri b(String str) {
        return mt0.E(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mxb.class != obj.getClass()) {
            return false;
        }
        mxb mxb = (mxb) obj;
        return this.a == mxb.a && this.b == mxb.b && this.c.equals(mxb.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        String str = this.c;
        StringBuilder sb = new StringBuilder(me4.e(81, str));
        sb.append("RangedUri(referenceUri=");
        sb.append(str);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return wn6.k(sb, this.b, ")");
    }
}

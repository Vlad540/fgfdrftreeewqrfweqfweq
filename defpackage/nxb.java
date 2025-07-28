package defpackage;

import android.net.Uri;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: nxb  reason: default package */
public final class nxb {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public nxb(long j, String str, long j2) {
        this.c = str == null ? BuildConfig.FLAVOR : str;
        this.a = j;
        this.b = j2;
    }

    public final nxb a(nxb nxb, String str) {
        long j;
        nxb nxb2 = nxb;
        String str2 = str;
        String I = pa2.I(str2, this.c);
        if (nxb2 == null || !I.equals(pa2.I(str2, nxb2.c))) {
            return null;
        }
        long j2 = this.b;
        long j3 = -1;
        int i = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        long j4 = nxb2.b;
        if (i != 0) {
            long j5 = this.a;
            j = j2;
            if (j5 + j2 == nxb2.a) {
                if (j4 != -1) {
                    j3 = j + j4;
                }
                return new nxb(j5, I, j3);
            }
        } else {
            j = j2;
        }
        if (j4 != -1) {
            long j6 = nxb2.a;
            if (j6 + j4 == this.a) {
                if (j != -1) {
                    j3 = j4 + j;
                }
                return new nxb(j6, I, j3);
            }
        }
        return null;
    }

    public final Uri b(String str) {
        return pa2.J(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nxb.class != obj.getClass()) {
            return false;
        }
        nxb nxb = (nxb) obj;
        return this.a == nxb.a && this.b == nxb.b && this.c.equals(nxb.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return wn6.k(sb, this.b, ")");
    }
}

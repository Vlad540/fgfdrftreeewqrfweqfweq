package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: sje  reason: default package */
public final class sje implements lt0 {
    public static final Object G0 = new Object();
    public static final Object H0 = new Object();
    public static final j68 I0;
    public boolean A0;
    public long B0;
    public long C0;
    public int D0;
    public int E0;
    public long F0;
    public long X;
    public long Y;
    public long Z;
    public Object a = G0;
    public Object b;
    public j68 c = I0;
    public Object o;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public y58 z0;

    /* JADX WARNING: type inference failed for: r8v0, types: [s58, u58] */
    static {
        r58 r58 = new r58();
        po5 po5 = ws6.b;
        e8c e8c = e8c.X;
        List emptyList = Collections.emptyList();
        e8c e8c2 = e8c.X;
        Uri uri = Uri.EMPTY;
        I0 = new j68("com.google.android.exoplayer2.Timeline", new s58(r58), uri != null ? new c68(uri, (jjd) null, emptyList, e8c2) : null, new y58(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), y78.W0);
    }

    public final boolean a() {
        swb.h(this.y0 == (this.z0 != null));
        return this.z0 != null;
    }

    public final void b(Object obj, j68 j68, Object obj2, long j, long j2, long j3, boolean z, boolean z2, y58 y58, long j4, long j5, int i, int i2, long j6) {
        c68 c68;
        j68 j682 = j68;
        y58 y582 = y58;
        this.a = obj;
        this.c = j682 != null ? j682 : I0;
        this.b = (j682 == null || (c68 = j682.b) == null) ? null : c68.f;
        this.o = obj2;
        this.X = j;
        this.Y = j2;
        this.Z = j3;
        this.w0 = z;
        this.x0 = z2;
        this.y0 = y582 != null;
        this.z0 = y582;
        this.B0 = j4;
        this.C0 = j5;
        this.D0 = i;
        this.E0 = i2;
        this.F0 = j6;
        this.A0 = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (sje.class.equals(obj.getClass())) {
                sje sje = (sje) obj;
                return mze.a(this.a, sje.a) && mze.a(this.c, sje.c) && mze.a(this.o, sje.o) && mze.a(this.z0, sje.z0) && this.X == sje.X && this.Y == sje.Y && this.Z == sje.Z && this.w0 == sje.w0 && this.x0 == sje.x0 && this.A0 == sje.A0 && this.B0 == sje.B0 && this.C0 == sje.C0 && this.D0 == sje.D0 && this.E0 == sje.E0 && this.F0 == sje.F0;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.o;
        int i = 0;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        y58 y58 = this.z0;
        if (y58 != null) {
            i = y58.hashCode();
        }
        long j = this.X;
        long j2 = this.Y;
        long j3 = this.Z;
        long j4 = this.B0;
        long j5 = this.C0;
        long j6 = this.F0;
        return ((((((((((((((((((((((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.w0 ? 1 : 0)) * 31) + (this.x0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.D0) * 31) + this.E0) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }
}

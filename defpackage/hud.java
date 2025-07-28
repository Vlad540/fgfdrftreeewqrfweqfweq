package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: hud  reason: default package */
public final class hud implements pg7 {
    public final List X;
    public final int Y;
    public final boolean Z;
    public final long a;
    public final mge b;
    public final String c;
    public final Integer o;
    public final boolean w0;
    public final int x0;
    public final long y0;

    public hud(long j, mge mge, String str, Integer num, List list, int i, boolean z, boolean z2) {
        int i2;
        this.a = j;
        this.b = mge;
        this.c = str;
        this.o = num;
        this.X = list;
        this.Y = i;
        this.Z = z;
        this.w0 = z2;
        if (i == 5) {
            i2 = gaa.l;
        } else {
            i2 = gaa.k;
        }
        this.x0 = i2;
        this.y0 = j >= 0 ? -j : j;
    }

    public static hud k(hud hud, ArrayList arrayList, boolean z, boolean z2, int i) {
        long j = hud.a;
        mge mge = hud.b;
        String str = hud.c;
        Integer num = hud.o;
        List list = arrayList;
        if ((i & 16) != 0) {
            list = hud.X;
        }
        List list2 = list;
        int i2 = hud.Y;
        if ((i & 64) != 0) {
            z = hud.Z;
        }
        boolean z3 = z;
        if ((i & 128) != 0) {
            z2 = hud.w0;
        }
        hud.getClass();
        return new hud(j, mge, str, num, list2, i2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hud)) {
            return false;
        }
        hud hud = (hud) obj;
        return this.a == hud.a && hhd.f(this.b, hud.b) && hhd.f(this.c, hud.c) && hhd.f(this.o, hud.o) && hhd.f(this.X, hud.X) && this.Y == hud.Y && this.Z == hud.Z && this.w0 == hud.w0;
    }

    public final boolean g(pg7 pg7) {
        return this.y0 == pg7.getItemId();
    }

    public final long getItemId() {
        return this.y0;
    }

    public final int hashCode() {
        int e = c3d.e(Long.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.o;
        if (num != null) {
            i = num.hashCode();
        }
        return Boolean.hashCode(this.w0) + th2.f(us8.h(this.Y, c3d.f(this.X, (hashCode + i) * 31, 31), 31), 31, this.Z);
    }

    public final int l() {
        return this.x0;
    }

    public final Object n(Object obj) {
        pg7 pg7 = (pg7) obj;
        if (!(pg7 instanceof hud)) {
            return null;
        }
        hud hud = (hud) pg7;
        boolean z = this.Z;
        boolean z2 = hud.Z;
        if (z != z2) {
            return new eud(z2);
        }
        int i = this.Y;
        int i2 = hud.Y;
        if (i != i2) {
            return new fud(i2);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerSetModel(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        sb.append(this.c);
        sb.append(", iconRes=");
        sb.append(this.o);
        sb.append(", stickers=");
        sb.append(this.X);
        sb.append(", type=");
        sb.append(c3d.r(this.Y));
        sb.append(", selected=");
        sb.append(this.Z);
        sb.append(", favorite=");
        return hr1.j(sb, this.w0, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ hud(long r14, defpackage.mge r16, java.lang.String r17, java.lang.Integer r18, java.util.List r19, int r20, boolean r21, boolean r22, int r23) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r17
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r18
        L_0x0013:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x001a
            r11 = r2
            goto L_0x001c
        L_0x001a:
            r11 = r21
        L_0x001c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0022
            r12 = r2
            goto L_0x0024
        L_0x0022:
            r12 = r22
        L_0x0024:
            r3 = r13
            r4 = r14
            r6 = r16
            r9 = r19
            r10 = r20
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hud.<init>(long, mge, java.lang.String, java.lang.Integer, java.util.List, int, boolean, boolean, int):void");
    }
}

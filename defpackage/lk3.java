package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: lk3  reason: default package */
public final class lk3 implements pg7 {
    public final boa A0;
    public final Boolean B0;
    public final boolean C0;
    public final int D0;
    public final boolean E0;
    public final int F0;
    public final CharSequence X;
    public final CharSequence Y;
    public final Uri Z;
    public final long a;
    public final CharSequence b;
    public final CharSequence c;
    public final List o;
    public final boolean w0;
    public final boolean x0;
    public final CharSequence y0;
    public final boolean z0;

    public lk3(long j, CharSequence charSequence, CharSequence charSequence2, List list, CharSequence charSequence3, CharSequence charSequence4, Uri uri, boolean z, boolean z2, CharSequence charSequence5, boolean z3, boa boa, Boolean bool, boolean z4, int i, boolean z5) {
        int i2;
        CharSequence charSequence6 = charSequence4;
        this.a = j;
        this.b = charSequence;
        this.c = charSequence2;
        this.o = list;
        this.X = charSequence3;
        this.Y = charSequence6;
        this.Z = uri;
        this.w0 = z;
        this.x0 = z2;
        this.y0 = charSequence5;
        this.z0 = z3;
        this.A0 = boa;
        this.B0 = bool;
        this.C0 = z4;
        this.D0 = i;
        this.E0 = z5;
        if (charSequence6 == null) {
            i2 = p2a.m;
        } else {
            i2 = p2a.s;
        }
        this.F0 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk3)) {
            return false;
        }
        lk3 lk3 = (lk3) obj;
        return this.a == lk3.a && hhd.f(this.b, lk3.b) && hhd.f(this.c, lk3.c) && hhd.f(this.o, lk3.o) && hhd.f(this.X, lk3.X) && hhd.f(this.Y, lk3.Y) && hhd.f(this.Z, lk3.Z) && this.w0 == lk3.w0 && this.x0 == lk3.x0 && hhd.f(this.y0, lk3.y0) && this.z0 == lk3.z0 && hhd.f(this.A0, lk3.A0) && hhd.f(this.B0, lk3.B0) && this.C0 == lk3.C0 && this.D0 == lk3.D0 && this.E0 == lk3.E0;
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int f = me4.f(this.b, Long.hashCode(this.a) * 31, 31);
        int i = 0;
        CharSequence charSequence = this.c;
        int hashCode = (f + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        List list = this.o;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        CharSequence charSequence2 = this.X;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.Y;
        int hashCode4 = (hashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        Uri uri = this.Z;
        int f2 = th2.f(me4.f(this.y0, th2.f(th2.f((hashCode4 + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.w0), 31, this.x0), 31), 31, this.z0);
        boa boa = this.A0;
        int hashCode5 = (f2 + (boa == null ? 0 : boa.hashCode())) * 31;
        Boolean bool = this.B0;
        if (bool != null) {
            i = bool.hashCode();
        }
        return Boolean.hashCode(this.E0) + c3d.d(this.D0, th2.f((hashCode5 + i) * 31, 31, this.C0), 31);
    }

    public final int l() {
        return this.F0;
    }

    public final Object n(Object obj) {
        lk3 lk3 = (pg7) obj;
        lk3 lk32 = lk3 instanceof lk3 ? lk3 : null;
        if (lk32 == null) {
            return null;
        }
        Boolean bool = this.B0;
        Boolean bool2 = lk32.B0;
        if (!hhd.f(bool, bool2)) {
            return new kk3(bool2);
        }
        return null;
    }

    public final String toString() {
        return "ContactListItem(id=" + this.a + ", name=" + this.b + ", shortName=" + this.c + ", phones=" + this.o + ", subtitle=" + this.X + ", button=" + this.Y + ", avatar=" + this.Z + ", isOnline=" + this.w0 + ", isVerified=" + this.x0 + ", abbreviation=" + this.y0 + ", isSelf=" + this.z0 + ", availablePhone=" + this.A0 + ", isSelected=" + this.B0 + ", hasCallActions=" + this.C0 + ", presence=" + this.D0 + ", isBot=" + this.E0 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ lk3(long r22, java.lang.CharSequence r24, java.lang.String r25, java.util.List r26, java.lang.CharSequence r27, java.lang.CharSequence r28, android.net.Uri r29, boolean r30, boolean r31, java.lang.CharSequence r32, boolean r33, boa r34, int r35, boolean r36, int r37) {
        /*
            r21 = this;
            r0 = r37
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r15 = r2
            goto L_0x000b
        L_0x0009:
            r15 = r33
        L_0x000b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0013
            r1 = 0
            r16 = r1
            goto L_0x0015
        L_0x0013:
            r16 = r34
        L_0x0015:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x001c
            r19 = r2
            goto L_0x001e
        L_0x001c:
            r19 = r35
        L_0x001e:
            r17 = 0
            r18 = 0
            r3 = r21
            r4 = r22
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r14 = r32
            r20 = r36
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk3.<init>(long, java.lang.CharSequence, java.lang.String, java.util.List, java.lang.CharSequence, java.lang.CharSequence, android.net.Uri, boolean, boolean, java.lang.CharSequence, boolean, boa, int, boolean, int):void");
    }
}

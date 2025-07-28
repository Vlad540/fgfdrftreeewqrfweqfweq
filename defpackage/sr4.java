package defpackage;

/* renamed from: sr4  reason: default package */
public final class sr4 implements es4 {
    public final String a;
    public final long b;
    public final String c;
    public final CharSequence d;
    public final r33 e;
    public final String f;
    public final r33 g;
    public final String h;
    public final mge i;
    public final String j;
    public final fze k;
    public final boolean l;
    public final Long m;

    public sr4(String str, long j2, String str2, CharSequence charSequence, r33 r33, String str3, r33 r332, String str4, mge mge, String str5, fze fze, boolean z, Long l2) {
        this.a = str;
        this.b = j2;
        this.c = str2;
        this.d = charSequence;
        this.e = r33;
        this.f = str3;
        this.g = r332;
        this.h = str4;
        this.i = mge;
        this.j = str5;
        this.k = fze;
        this.l = z;
        this.m = l2;
    }

    public static sr4 c(sr4 sr4, String str, r33 r33, String str2, r33 r332, String str3, mge mge, fze fze, boolean z, Long l2, int i2) {
        sr4 sr42 = sr4;
        int i3 = i2;
        return new sr4(sr42.a, sr42.b, (i3 & 4) != 0 ? sr42.c : str, sr42.d, (i3 & 16) != 0 ? sr42.e : r33, (i3 & 32) != 0 ? sr42.f : str2, (i3 & 64) != 0 ? sr42.g : r332, (i3 & 128) != 0 ? sr42.h : str3, (i3 & 256) != 0 ? sr42.i : mge, sr42.j, (i3 & 1024) != 0 ? sr42.k : fze, (i3 & 2048) != 0 ? sr42.l : z, (i3 & 4096) != 0 ? sr42.m : l2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r1 = r4.k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.es4 r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x0034
            boolean r1 = r5 instanceof defpackage.sr4
            if (r1 != 0) goto L_0x0008
            goto L_0x0034
        L_0x0008:
            sr4 r5 = (defpackage.sr4) r5
            java.lang.String r1 = r4.h
            java.lang.String r2 = r5.h
            boolean r1 = hhd.f(r2, r1)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 != 0) goto L_0x0033
            fze r1 = r4.k
            fze r3 = r5.k
            if (r3 == r1) goto L_0x001d
            goto L_0x0033
        L_0x001d:
            java.lang.String r1 = r5.c
            java.lang.String r3 = r4.c
            boolean r1 = hhd.f(r1, r3)
            r1 = r1 ^ r2
            if (r1 != 0) goto L_0x0033
            java.lang.String r5 = r5.f
            java.lang.String r4 = r4.f
            boolean r4 = hhd.f(r5, r4)
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x0034
        L_0x0033:
            r0 = r2
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sr4.a(es4):boolean");
    }

    public final boolean b(es4 es4) {
        if (es4 == null || !(es4 instanceof sr4)) {
            return false;
        }
        sr4 sr4 = (sr4) es4;
        return (sr4.k != this.k) || (hhd.f(sr4.e, this.e) ^ true) || (hhd.f(sr4.g, this.g) ^ true) || !hhd.f(this.i, sr4.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr4)) {
            return false;
        }
        sr4 sr4 = (sr4) obj;
        return hhd.f(this.a, sr4.a) && this.b == sr4.b && hhd.f(this.c, sr4.c) && hhd.f(this.d, sr4.d) && hhd.f(this.e, sr4.e) && hhd.f(this.f, sr4.f) && hhd.f(this.g, sr4.g) && hhd.f(this.h, sr4.h) && hhd.f(this.i, sr4.i) && hhd.f(this.j, sr4.j) && this.k == sr4.k && this.l == sr4.l && hhd.f(this.m, sr4.m);
    }

    public final int hashCode() {
        int i2 = 0;
        String str = this.a;
        int m2 = sxe.m((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int hashCode = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence = this.d;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        r33 r33 = this.e;
        int hashCode3 = (hashCode2 + (r33 == null ? 0 : r33.a.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        r33 r332 = this.g;
        int hashCode5 = (hashCode4 + (r332 == null ? 0 : r332.a.hashCode())) * 31;
        String str4 = this.h;
        int e2 = c3d.e((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.i);
        String str5 = this.j;
        int hashCode6 = (e2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        fze fze = this.k;
        int f2 = th2.f((hashCode6 + (fze == null ? 0 : fze.hashCode())) * 31, 31, this.l);
        Long l2 = this.m;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return f2 + i2;
    }

    public final String toString() {
        return "EditContactProfileUiModel(avatarUrl=" + this.a + ", contactId=" + this.b + ", firstName=" + this.c + ", abbreviation=" + this.d + ", firstNameError=" + this.e + ", lastName=" + this.f + ", lastNameError=" + this.g + ", description=" + this.h + ", shortLink=" + this.i + ", phoneNumber=" + this.j + ", inactiveTtl=" + this.k + ", isInDeleteState=" + this.l + ", removeProfileTimestamp=" + this.m + ")";
    }
}

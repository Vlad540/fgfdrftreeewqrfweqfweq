package defpackage;

/* renamed from: u81  reason: default package */
public final class u81 {
    public final String a;
    public final ete b;
    public final ete c;
    public final boolean d;
    public final b65 e;
    public final y11 f;
    public final boolean g;
    public final qja h;
    public final ai1 i;
    public final yh1 j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final le1 p;
    public final hy7 q;
    public final hy7 r;
    public final boolean s;
    public final boolean t;

    public u81(String str, ete ete, ete ete2, boolean z, b65 b65, y11 y11, boolean z2, qja qja, ai1 ai1, yh1 yh1, String str2, boolean z3, boolean z4, boolean z5, boolean z6, le1 le1, hy7 hy7, hy7 hy72, boolean z7, boolean z8) {
        this.a = str;
        this.b = ete;
        this.c = ete2;
        this.d = z;
        this.e = b65;
        this.f = y11;
        this.g = z2;
        this.h = qja;
        this.i = ai1;
        this.j = yh1;
        this.k = str2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = le1;
        this.q = hy7;
        this.r = hy72;
        this.s = z7;
        this.t = z8;
    }

    public static u81 a(u81 u81, ete ete, b65 b65, y11 y11, boolean z, hy7 hy7, hy7 hy72, boolean z2, int i2) {
        hy7 hy73;
        le1 le1;
        boolean z3;
        boolean z4;
        u81 u812 = u81;
        String str = u812.a;
        ete ete2 = u812.b;
        ete ete3 = (i2 & 4) != 0 ? u812.c : ete;
        boolean z5 = u812.d;
        b65 b652 = (i2 & 16) != 0 ? u812.e : b65;
        y11 y112 = (i2 & 32) != 0 ? u812.f : y11;
        boolean z6 = (i2 & 64) != 0 ? u812.g : z;
        qja qja = u812.h;
        ai1 ai1 = u812.i;
        yh1 yh1 = u812.j;
        String str2 = u812.k;
        boolean z7 = u812.l;
        boolean z8 = u812.m;
        boolean z9 = u812.n;
        boolean z10 = u812.o;
        le1 le12 = u812.p;
        if ((i2 & 65536) != 0) {
            le1 = le12;
            hy73 = u812.q;
        } else {
            le1 = le12;
            hy73 = hy7;
        }
        hy7 hy74 = (i2 & 131072) != 0 ? u812.r : hy72;
        boolean z11 = u812.s;
        if ((i2 & 524288) != 0) {
            z4 = z11;
            z3 = u812.t;
        } else {
            z4 = z11;
            z3 = z2;
        }
        u81.getClass();
        return new u81(str, ete2, ete3, z5, b652, y112, z6, qja, ai1, yh1, str2, z7, z8, z9, z10, le1, hy73, hy74, z4, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u81)) {
            return false;
        }
        u81 u81 = (u81) obj;
        return hhd.f(this.a, u81.a) && hhd.f(this.b, u81.b) && hhd.f(this.c, u81.c) && this.d == u81.d && hhd.f(this.e, u81.e) && hhd.f(this.f, u81.f) && this.g == u81.g && hhd.f(this.h, u81.h) && hhd.f(this.i, u81.i) && hhd.f(this.j, u81.j) && hhd.f(this.k, u81.k) && this.l == u81.l && this.m == u81.m && this.n == u81.n && this.o == u81.o && hhd.f(this.p, u81.p) && this.q == u81.q && this.r == u81.r && this.s == u81.s && this.t == u81.t;
    }

    public final int hashCode() {
        int i2 = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ete ete = this.b;
        int hashCode2 = (hashCode + (ete == null ? 0 : ete.hashCode())) * 31;
        ete ete2 = this.c;
        int hashCode3 = (this.e.hashCode() + th2.f((hashCode2 + (ete2 == null ? 0 : ete2.hashCode())) * 31, 31, this.d)) * 31;
        y11 y11 = this.f;
        int f2 = th2.f((hashCode3 + (y11 == null ? 0 : y11.hashCode())) * 31, 31, this.g);
        qja qja = this.h;
        int hashCode4 = (this.j.hashCode() + ((this.i.hashCode() + ((f2 + (qja == null ? 0 : qja.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.k;
        int f3 = th2.f(th2.f(th2.f(th2.f((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        le1 le1 = this.p;
        if (le1 != null) {
            i2 = le1.hashCode();
        }
        return Boolean.hashCode(this.t) + th2.f((this.r.hashCode() + ((this.q.hashCode() + ((f3 + i2) * 31)) * 31)) * 31, 31, this.s);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallInfoState(conversationId=");
        sb.append(this.a);
        sb.append(", target=");
        sb.append(this.b);
        sb.append(", recallTarget=");
        sb.append(this.c);
        sb.append(", isIncoming=");
        sb.append(this.d);
        sb.append(", callState=");
        sb.append(this.e);
        sb.append(", chatInfo=");
        sb.append(this.f);
        sb.append(", isGroupCall=");
        sb.append(this.g);
        sb.append(", me=");
        sb.append(this.h);
        sb.append(", screenSharingState=");
        sb.append(this.i);
        sb.append(", recordSharingState=");
        sb.append(this.j);
        sb.append(", joinLink=");
        sb.append(this.k);
        sb.append(", hasOpponentsOnce=");
        sb.append(this.l);
        sb.append(", isConnectedOnce=");
        sb.append(this.m);
        sb.append(", isMeCallAdmin=");
        sb.append(this.n);
        sb.append(", isInCallMeOnly=");
        sb.append(this.o);
        sb.append(", primarySpeaker=");
        sb.append(this.p);
        sb.append(", isVideoEnabled=");
        sb.append(this.q);
        sb.append(", isMicrophoneEnabled=");
        sb.append(this.r);
        sb.append(", isCallUnavailable=");
        sb.append(this.s);
        sb.append(", hasAnyCameraEnabled=");
        return hr1.j(sb, this.t, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ u81() {
        /*
            r21 = this;
            w55 r5 = defpackage.w55.b
            ai1 r9 = defpackage.ai1.g
            yh1 r10 = defpackage.yh1.g
            hy7 r18 = defpackage.hy7.X
            r20 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 1
            r16 = 0
            r19 = 0
            r0 = r21
            r17 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u81.<init>():void");
    }
}

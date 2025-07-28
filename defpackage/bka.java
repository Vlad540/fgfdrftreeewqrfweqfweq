package defpackage;

import java.util.Map;

/* renamed from: bka  reason: default package */
public final class bka {
    public final qja a;
    public final Map b;
    public final Map c;
    public final le1 d;
    public final le1 e;
    public final Map f;
    public final Map g;
    public final boolean h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ bka(defpackage.qja r10) {
        /*
            r9 = this;
            iw4 r7 = defpackage.iw4.a
            r8 = 0
            r4 = 0
            r5 = 0
            r0 = r9
            r1 = r10
            r2 = r7
            r3 = r7
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bka.<init>(qja):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = r1.a.getId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.le1 a() {
        /*
            r3 = this;
            java.util.Map r3 = r3.f
            java.util.Collection r0 = r3.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r0.next()
            r2 = r1
            qja r2 = (defpackage.qja) r2
            ne1 r2 = r2.a
            boolean r2 = r2.m()
            if (r2 == 0) goto L_0x000a
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            qja r1 = (defpackage.qja) r1
            if (r1 == 0) goto L_0x002e
            ne1 r0 = r1.a
            le1 r0 = r0.getId()
            if (r0 == 0) goto L_0x002e
            goto L_0x0039
        L_0x002e:
            java.util.Set r3 = r3.keySet()
            java.lang.Object r3 = defpackage.o23.W(r3)
            r0 = r3
            le1 r0 = (defpackage.le1) r0
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bka.a():le1");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bka)) {
            return false;
        }
        bka bka = (bka) obj;
        return hhd.f(this.a, bka.a) && hhd.f(this.b, bka.b) && hhd.f(this.c, bka.c) && hhd.f(this.d, bka.d) && hhd.f(this.e, bka.e) && hhd.f(this.f, bka.f) && hhd.f(this.g, bka.g) && this.h == bka.h;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i = 0;
        le1 le1 = this.d;
        int hashCode2 = (hashCode + (le1 == null ? 0 : le1.hashCode())) * 31;
        le1 le12 = this.e;
        if (le12 != null) {
            i = le12.hashCode();
        }
        int hashCode3 = this.f.hashCode();
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((hashCode3 + ((hashCode2 + i) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ParticipantsState(me=" + this.a + ", usersInCall=" + this.b + ", participants=" + this.c + ", primarySpeaker=" + this.d + ", opponentSpeaker=" + this.e + ", screenShareSpeakers=" + this.f + ", raisedHands=" + this.g + ", hasAnyEnabledCamera=" + this.h + ")";
    }

    public bka(qja qja, Map map, Map map2, le1 le1, le1 le12, Map map3, Map map4, boolean z) {
        this.a = qja;
        this.b = map;
        this.c = map2;
        this.d = le1;
        this.e = le12;
        this.f = map3;
        this.g = map4;
        this.h = z;
    }
}

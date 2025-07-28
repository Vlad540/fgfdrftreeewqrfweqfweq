package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: pxc  reason: default package */
public final class pxc extends l5e implements i26 {
    public final /* synthetic */ Long A0;
    public final /* synthetic */ jv5 B0;
    public Object X;
    public int Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ boolean w0;
    public final /* synthetic */ CharSequence x0;
    public final /* synthetic */ qxc y0;
    public final /* synthetic */ long z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pxc(List list, boolean z, CharSequence charSequence, qxc qxc, long j, Long l, jv5 jv5, Continuation continuation) {
        super(2, continuation);
        this.Z = list;
        this.w0 = z;
        this.x0 = charSequence;
        this.y0 = qxc;
        this.z0 = j;
        this.A0 = l;
        this.B0 = jv5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pxc) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pxc(this.Z, this.w0, this.x0, this.y0, this.z0, this.A0, this.B0, continuation);
    }

    /* JADX WARNING: type inference failed for: r0v44, types: [java.util.Queue] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = 2
            pu3 r3 = defpackage.pu3.a
            int r0 = r1.Y
            r4 = 0
            java.lang.String r5 = "SendMessageWithMediaUseCase"
            java.lang.CharSequence r6 = r1.x0
            long r7 = r1.z0
            qxc r10 = r1.y0
            r11 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 == r11) goto L_0x002b
            if (r0 != r2) goto L_0x0023
            java.lang.Object r0 = r1.X
            java.util.Queue r0 = (java.util.Queue) r0
            defpackage.wx3.H(r19)
            r15 = r0
            r0 = r19
            goto L_0x012a
        L_0x0023:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002b:
            java.lang.Object r0 = r1.X
            k2b r0 = (k2b) r0
            defpackage.wx3.H(r19)
            r13 = r0
            r0 = r19
            goto L_0x0077
        L_0x0036:
            defpackage.wx3.H(r19)
            java.util.List r0 = r1.Z
            int r12 = r0.size()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Sending messages with media. Media count "
            r13.<init>(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            defpackage.udd.H(r5, r12, r4)
            boolean r12 = r1.w0
            if (r12 != 0) goto L_0x005c
            int r12 = r0.size()
            if (r12 <= r11) goto L_0x005c
            r12 = r11
            goto L_0x005d
        L_0x005c:
            r12 = 0
        L_0x005d:
            k2b r13 = new k2b
            r13.<init>(r0, r12, r6)
            t97 r0 = r10.e
            java.lang.Object r0 = r0.getValue()
            gw8 r0 = (gw8) r0
            r1.X = r13
            r1.Y = r11
            java.lang.Long r12 = r1.A0
            java.lang.Object r0 = r0.a(r7, r12, r1)
            if (r0 != r3) goto L_0x0077
            return r3
        L_0x0077:
            r12 = r0
            sq8 r12 = (sq8) r12
            t97 r0 = r10.f
            java.lang.Object r0 = r0.getValue()
            m86 r0 = (m86) r0
            java.util.List r14 = r0.b(r6, r7)
            java.util.LinkedList r15 = new java.util.LinkedList
            r15.<init>()
            t97 r0 = r10.c
            java.lang.Object r0 = r0.getValue()
            th8 r0 = (th8) r0
            r0.getClass()
            boolean r9 = r13.b
            if (r9 == 0) goto L_0x00af
            xzc r0 = r0.a
            vqc r0 = (vqc) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r9 = ru.ok.tamtam.android.prefs.PmsKey.max-attach-count
            r11 = 12
            r17 = r3
            long r2 = (long) r11
            long r2 = r0.o(r9, r2)
            int r0 = (int) r2
            r2 = r0
            goto L_0x00b2
        L_0x00af:
            r17 = r3
            r2 = 1
        L_0x00b2:
            java.util.List r3 = r13.a
            if (r3 == 0) goto L_0x00bc
            int r0 = r3.size()
            r9 = r0
            goto L_0x00bd
        L_0x00bc:
            r9 = 0
        L_0x00bd:
            if (r9 != 0) goto L_0x00cd
            java.lang.CharSequence r0 = r13.c
            boolean r0 = defpackage.r1g.p(r0)
            if (r0 != 0) goto L_0x00cd
            java.lang.String r0 = "Unexpected empty media list"
            defpackage.udd.s(r5, r0, r4)
            goto L_0x0112
        L_0x00cd:
            if (r9 <= 0) goto L_0x0112
            r0 = 0
            r16 = 0
        L_0x00d2:
            if (r0 >= r9) goto L_0x0112
            java.util.ArrayList r5 = new java.util.ArrayList
            int r11 = r0 + r2
            int r13 = java.lang.Math.min(r9, r11)
            java.util.List r0 = r3.subList(r0, r13)
            r5.<init>(r0)
            c1d r0 = new c1d     // Catch:{ all -> 0x0108 }
            r0.<init>(r7, r5)     // Catch:{ all -> 0x0108 }
            if (r16 != 0) goto L_0x00ff
            if (r6 == 0) goto L_0x00f1
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x00fb }
            goto L_0x00f2
        L_0x00f1:
            r5 = r4
        L_0x00f2:
            r0.m = r5     // Catch:{ all -> 0x00fb }
            r0.n = r14     // Catch:{ all -> 0x00fb }
            r0.b = r12     // Catch:{ all -> 0x00fb }
            r16 = 1
            goto L_0x00ff
        L_0x00fb:
            r0 = move-exception
            r16 = 1
            goto L_0x0109
        L_0x00ff:
            d1d r5 = new d1d     // Catch:{ all -> 0x0108 }
            r5.<init>(r0)     // Catch:{ all -> 0x0108 }
            r15.add(r5)     // Catch:{ all -> 0x0108 }
            goto L_0x0110
        L_0x0108:
            r0 = move-exception
        L_0x0109:
            java.lang.String r5 = "th8"
            java.lang.String r13 = "splitMedias: Exception after split medias for send"
            defpackage.udd.s(r5, r13, r0)
        L_0x0110:
            r0 = r11
            goto L_0x00d2
        L_0x0112:
            t97 r0 = r10.d
            java.lang.Object r0 = r0.getValue()
            g86 r0 = (g86) r0
            r1.X = r15
            r2 = 2
            r1.Y = r2
            jv5 r3 = r1.B0
            java.lang.Object r0 = r0.b(r3, r1)
            r1 = r17
            if (r0 != r1) goto L_0x012a
            return r1
        L_0x012a:
            java.util.List r0 = (java.util.List) r0
            r15.addAll(r0)
            g0d r0 = new g0d
            r0.<init>(r7, r15, r2)
            g1d r1 = new g1d
            r1.<init>(r0)
            t97 r0 = r10.b
            java.lang.Object r0 = r0.getValue()
            luf r0 = (luf) r0
            r0.a(r1)
            jue r0 = defpackage.jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxc.o(java.lang.Object):java.lang.Object");
    }
}

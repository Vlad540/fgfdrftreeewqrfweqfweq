package defpackage;

import java.util.ArrayList;

/* renamed from: s89  reason: default package */
public final class s89 extends lbe {
    public tr8 X;
    public Long Y;
    public ArrayList c;
    public vr8 o;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: tr8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.ws8 r8, java.lang.String r9) {
        /*
            r7 = this;
            if (r9 == 0) goto L_0x00fd
            int r0 = r9.hashCode()
            r1 = 1
            r2 = 0
            java.lang.String r3 = "payloadCatching catch error"
            java.lang.String r4 = "ServerPayload/PayloadCatching"
            switch(r0) {
                case -1716357513: goto L_0x00ed;
                case -1370485892: goto L_0x00ae;
                case -1122997398: goto L_0x0058;
                case -1081306054: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x00fd
        L_0x0011:
            java.lang.String r0 = "marker"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x001b
            goto L_0x00fd
        L_0x001b:
            r5 = 0
            long r8 = jjd.J(r8, r5)     // Catch:{ all -> 0x0026 }
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0026 }
            goto L_0x0054
        L_0x0026:
            r8 = move-exception
            udd.S(r4, r3, r8)
            java.util.concurrent.CopyOnWriteArraySet r9 = defpackage.uzc.a
            java.util.Iterator r9 = r9.iterator()
        L_0x0030:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r9.next()
            ny9 r0 = (ny9) r0
            r0.getClass()
            ny9.a(r8)
            goto L_0x0030
        L_0x0043:
            int r9 = defpackage.m4b.a
            int r9 = hr1.t(r9)
            if (r9 == 0) goto L_0x0054
            if (r9 == r1) goto L_0x0053
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x0053:
            throw r8
        L_0x0054:
            r7.Y = r2
            goto L_0x0100
        L_0x0058:
            java.lang.String r0 = "reactions"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0062
            goto L_0x00fd
        L_0x0062:
            r9 = 0
            int r0 = jjd.D(r8)     // Catch:{ all -> 0x0068 }
            goto L_0x0097
        L_0x0068:
            r0 = move-exception
            udd.S(r4, r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r2 = defpackage.uzc.a
            java.util.Iterator r2 = r2.iterator()
        L_0x0072:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0085
            java.lang.Object r3 = r2.next()
            ny9 r3 = (ny9) r3
            r3.getClass()
            ny9.a(r0)
            goto L_0x0072
        L_0x0085:
            int r2 = defpackage.m4b.a
            int r2 = hr1.t(r2)
            if (r2 == 0) goto L_0x0096
            if (r2 == r1) goto L_0x0095
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x0095:
            throw r0
        L_0x0096:
            r0 = r9
        L_0x0097:
            if (r0 != 0) goto L_0x009a
            return
        L_0x009a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x009f:
            if (r9 >= r0) goto L_0x00ab
            tr8 r2 = hwf.m(r8)
            r1.add(r2)
            int r9 = r9 + 1
            goto L_0x009f
        L_0x00ab:
            r7.c = r1
            goto L_0x0100
        L_0x00ae:
            java.lang.String r0 = "yourReaction"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00b7
            goto L_0x00fd
        L_0x00b7:
            tr8 r2 = hwf.m(r8)     // Catch:{ all -> 0x00bc }
            goto L_0x00ea
        L_0x00bc:
            r8 = move-exception
            udd.S(r4, r3, r8)
            java.util.concurrent.CopyOnWriteArraySet r9 = defpackage.uzc.a
            java.util.Iterator r9 = r9.iterator()
        L_0x00c6:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r0 = r9.next()
            ny9 r0 = (ny9) r0
            r0.getClass()
            ny9.a(r8)
            goto L_0x00c6
        L_0x00d9:
            int r9 = defpackage.m4b.a
            int r9 = hr1.t(r9)
            if (r9 == 0) goto L_0x00ea
            if (r9 == r1) goto L_0x00e9
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x00e9:
            throw r8
        L_0x00ea:
            r7.X = r2
            goto L_0x0100
        L_0x00ed:
            java.lang.String r0 = "reactionInfo"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00f6
            goto L_0x00fd
        L_0x00f6:
            vr8 r8 = n1g.G(r8)
            r7.o = r8
            goto L_0x0100
        L_0x00fd:
            r8.z()
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s89.b(ws8, java.lang.String):void");
    }

    public final String toString() {
        ArrayList arrayList = this.c;
        String c0 = arrayList != null ? o23.c0(arrayList, (String) null, (String) null, (String) null, new xz6(28), 31) : null;
        vr8 vr8 = this.o;
        tr8 tr8 = this.X;
        Long l = this.Y;
        return "MsgGetDetailedReactionsCmd, reactions = " + c0 + " + " + vr8 + " + " + tr8 + " + " + l;
    }
}

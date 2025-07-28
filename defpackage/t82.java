package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: t82  reason: default package */
public final class t82 extends l5e implements i26 {
    public final /* synthetic */ boolean A0;
    public final /* synthetic */ s16 B0;
    public ArrayList X;
    public ArrayList Y;
    public b92 Z;
    public int w0;
    public /* synthetic */ Object x0;
    public final /* synthetic */ b92 y0;
    public final /* synthetic */ List z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t82(b92 b92, List list, boolean z, s16 s16, Continuation continuation) {
        super(2, continuation);
        this.y0 = b92;
        this.z0 = list;
        this.A0 = z;
        this.B0 = s16;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        t82 t82 = new t82(this.y0, this.z0, this.A0, this.B0, continuation);
        t82.x0 = obj;
        return t82;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: ou3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r37) {
        /*
            r36 = this;
            r0 = r36
            pu3 r1 = pu3.a
            int r2 = r0.w0
            jue r3 = jue.a
            r4 = 0
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0028
            if (r2 != r5) goto L_0x0020
            b92 r1 = r0.Z
            java.util.ArrayList r2 = r0.Y
            java.util.ArrayList r7 = r0.X
            java.lang.Object r8 = r0.x0
            ou3 r8 = (ou3) r8
            wx3.H(r37)
            r4 = r37
            goto L_0x0193
        L_0x0020:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0028:
            wx3.H(r37)
            java.lang.Object r2 = r0.x0
            r8 = r2
            ou3 r8 = (ou3) r8
            boolean r2 = n1g.A(r8)
            if (r2 != 0) goto L_0x0037
            return r3
        L_0x0037:
            b92 r2 = r0.y0
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.I0
            r2.set(r5)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r2 = r0.z0
            b92 r9 = r0.y0
            java.util.Iterator r2 = r2.iterator()
        L_0x004b:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x0156
            java.lang.Object r10 = r2.next()
            hdc r10 = (defpackage.hdc) r10
            boolean r11 = n1g.A(r8)
            if (r11 != 0) goto L_0x0063
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.I0
            r0.set(r4)
            return r3
        L_0x0063:
            udc r11 = r9.e()
            java.lang.String r12 = r10.a
            r11.getClass()
            java.lang.String r13 = "SELECT * FROM folder_and_chats WHERE folderId = ?"
            pec r13 = pec.a(r5, r13)
            if (r12 != 0) goto L_0x0078
            r13.W(r5)
            goto L_0x007b
        L_0x0078:
            r13.f(r5, r12)
        L_0x007b:
            aec r11 = r11.a
            r11.b()
            android.database.Cursor r11 = r11.o(r13, r6)
            java.lang.String r12 = "chatId"
            int r12 = defpackage.gp0.o(r11, r12)     // Catch:{ all -> 0x00c2 }
            java.lang.String r14 = "folderId"
            int r14 = defpackage.gp0.o(r11, r14)     // Catch:{ all -> 0x00c2 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x00c2 }
            int r6 = r11.getCount()     // Catch:{ all -> 0x00c2 }
            r15.<init>(r6)     // Catch:{ all -> 0x00c2 }
        L_0x0099:
            boolean r6 = r11.moveToNext()     // Catch:{ all -> 0x00c2 }
            if (r6 == 0) goto L_0x00c5
            long r5 = r11.getLong(r12)     // Catch:{ all -> 0x00c2 }
            boolean r16 = r11.isNull(r14)     // Catch:{ all -> 0x00c2 }
            if (r16 == 0) goto L_0x00ad
            r37 = r2
            r4 = 0
            goto L_0x00b5
        L_0x00ad:
            java.lang.String r16 = r11.getString(r14)     // Catch:{ all -> 0x00c2 }
            r37 = r2
            r4 = r16
        L_0x00b5:
            z22 r2 = new z22     // Catch:{ all -> 0x00c2 }
            r2.<init>(r5, r4)     // Catch:{ all -> 0x00c2 }
            r15.add(r2)     // Catch:{ all -> 0x00c2 }
            r2 = r37
            r4 = 0
            r5 = 1
            goto L_0x0099
        L_0x00c2:
            r0 = move-exception
            goto L_0x014f
        L_0x00c5:
            r37 = r2
            r11.close()
            r13.m()
            udc r2 = r9.e()
            java.lang.String r4 = r10.a
            java.util.ArrayList r2 = r2.e(r4)
            ep5 r4 = new ep5
            t97 r5 = r9.o
            java.lang.Object r5 = r5.getValue()
            v6a r5 = (v6a) r5
            java.lang.String r6 = r10.b
            java.util.List r11 = r10.h
            java.lang.CharSequence r19 = v6a.b(r5, r6, r11)
            hw4 r22 = hw4.a
            bs r5 = new bs
            r5.<init>(r2)
            qw4 r30 = qw4.a
            java.util.List r6 = r10.h
            if (r6 != 0) goto L_0x00f9
            r31 = r22
            goto L_0x00fb
        L_0x00f9:
            r31 = r6
        L_0x00fb:
            java.util.Map r6 = r10.j
            if (r6 != 0) goto L_0x0101
            iw4 r6 = iw4.a
        L_0x0101:
            r33 = r6
            java.util.List r6 = r10.k
            if (r6 != 0) goto L_0x010a
            r34 = r22
            goto L_0x010c
        L_0x010a:
            r34 = r6
        L_0x010c:
            java.util.Set r6 = r10.l
            if (r6 != 0) goto L_0x0113
            r35 = r30
            goto L_0x0115
        L_0x0113:
            r35 = r6
        L_0x0115:
            boolean r6 = r10.g
            r27 = r6
            java.lang.Long r6 = r10.i
            r32 = r6
            java.lang.String r6 = r10.a
            r18 = r6
            java.lang.String r6 = r10.c
            r20 = r6
            int r6 = r10.d
            r21 = r6
            java.util.Set r6 = r10.e
            r23 = r6
            r24 = 1
            boolean r6 = r10.f
            r25 = r6
            r17 = r4
            r26 = r2
            r28 = r5
            r29 = r30
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r7.add(r4)
            java.util.HashMap r2 = r9.y0
            java.lang.String r4 = r10.a
            r2.put(r4, r15)
            r2 = r37
            r4 = 0
            r5 = 1
            r6 = 0
            goto L_0x004b
        L_0x014f:
            r11.close()
            r13.m()
            throw r0
        L_0x0156:
            boolean r2 = n1g.A(r8)
            if (r2 != 0) goto L_0x0165
            b92 r0 = r0.y0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.I0
            r1 = 0
            r0.set(r1)
            return r3
        L_0x0165:
            int r2 = r7.size()
            r4 = 1
            if (r2 <= r4) goto L_0x016f
            java.util.Collections.sort(r7)
        L_0x016f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r7)
            b92 r5 = r0.y0
            r0.x0 = r8
            r0.X = r7
            r0.Y = r2
            r0.Z = r5
            r0.w0 = r4
            r5.getClass()
            f82 r4 = new f82
            r6 = 0
            r4.<init>(r5, r6)
            hu3 r6 = r5.Y
            java.lang.Object r4 = xs7.U(r6, r4, r0)
            if (r4 != r1) goto L_0x0192
            return r1
        L_0x0192:
            r1 = r5
        L_0x0193:
            ep5 r4 = (defpackage.ep5) r4
            r1.H0 = r4
            yr r1 = new yr
            r4 = 0
            r1.<init>(r4)
            b92 r4 = r0.y0
            java.util.Iterator r5 = r7.iterator()
        L_0x01a3:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01c2
            java.lang.Object r6 = r5.next()
            ep5 r6 = (defpackage.ep5) r6
            boolean r9 = n1g.A(r8)
            if (r9 != 0) goto L_0x01bc
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.I0
            r1 = 0
            r0.set(r1)
            return r3
        L_0x01bc:
            java.lang.String r9 = r6.a
            r1.put(r9, r6)
            goto L_0x01a3
        L_0x01c2:
            b92 r4 = r0.y0
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap
            r5.<init>(r1)
            r4.x0 = r5
            boolean r1 = n1g.A(r8)
            if (r1 != 0) goto L_0x01da
            b92 r0 = r0.y0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.I0
            r1 = 0
            r0.set(r1)
            return r3
        L_0x01da:
            b92 r1 = r0.y0
            ep5 r1 = r1.H0
            if (r1 == 0) goto L_0x01f7
            b92 r4 = r0.y0
            java.util.concurrent.ConcurrentHashMap r4 = r4.x0
            java.lang.String r5 = "all.chat.folder"
            r4.put(r5, r1)
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L_0x01f3
            r7.add(r1)
            goto L_0x01f7
        L_0x01f3:
            r4 = 0
            r7.add(r4, r1)
        L_0x01f7:
            b92 r1 = r0.y0
            grd r1 = r1.X
            r4 = 0
            r1.m(r4, r7)
            boolean r1 = r0.A0
            if (r1 == 0) goto L_0x020a
            b92 r1 = r0.y0
            ajb r1 = r1.B0
            r1.c(r2)
        L_0x020a:
            s16 r1 = r0.B0
            if (r1 == 0) goto L_0x0211
            r1.invoke()
        L_0x0211:
            b92 r1 = r0.y0
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.I0
            r2 = 0
            r1.set(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            b92 r2 = r0.y0
            java.util.concurrent.ConcurrentHashMap r2 = r2.J0
            java.util.Collection r2 = r2.values()
            r1.<init>(r2)
            b92 r0 = r0.y0
            java.util.concurrent.ConcurrentHashMap r0 = r0.J0
            r0.clear()
            boolean r0 = r1.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0249
            java.util.Iterator r0 = r1.iterator()
        L_0x0239:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0249
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L_0x0239
        L_0x0249:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t82.o(java.lang.Object):java.lang.Object");
    }
}

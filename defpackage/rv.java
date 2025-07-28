package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: rv  reason: default package */
public final class rv extends l5e implements i26 {
    public /* synthetic */ Object A0;
    public final /* synthetic */ fw B0;
    public i22 X;
    public fw Y;
    public Iterator Z;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rv(fw fwVar, Continuation continuation) {
        super(2, continuation);
        this.B0 = fwVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((List) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rv rvVar = new rv(this.B0, continuation);
        rvVar.A0 = obj;
        return rvVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: jue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: jue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: jue} */
    /* JADX WARNING: type inference failed for: r10v7, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x017c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x017d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = 1
            pu3 r2 = pu3.a
            int r3 = r0.z0
            jue r4 = jue.a
            r5 = 3
            r6 = 2
            fw r8 = r0.B0
            if (r3 == 0) goto L_0x004a
            if (r3 == r1) goto L_0x003a
            if (r3 == r6) goto L_0x0022
            if (r3 != r5) goto L_0x001a
            wx3.H(r23)
            goto L_0x017d
        L_0x001a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0022:
            int r3 = r0.y0
            int r9 = r0.x0
            int r10 = r0.w0
            java.util.Iterator r11 = r0.Z
            fw r12 = r0.Y
            i22 r13 = r0.X
            java.lang.Object r14 = r0.A0
            java.util.List r14 = (java.util.List) r14
            wx3.H(r23)
            r15 = r14
            r14 = r3
            r3 = r13
            goto L_0x012a
        L_0x003a:
            int r3 = r0.x0
            int r9 = r0.w0
            java.lang.Object r10 = r0.A0
            java.util.List r10 = (java.util.List) r10
            wx3.H(r23)
            r11 = r10
            r10 = r3
            r3 = r23
            goto L_0x0093
        L_0x004a:
            wx3.H(r23)
            java.lang.Object r3 = r0.A0
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r9 = o23.X(r3)
            boolean r9 = r9 instanceof defpackage.qg6
            java.lang.Object r10 = o23.f0(r3)
            boolean r10 = r10 instanceof defpackage.qg6
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0066:
            boolean r12 = r3.hasNext()
            if (r12 == 0) goto L_0x0078
            java.lang.Object r12 = r3.next()
            boolean r13 = r12 instanceof one.me.messages.list.loader.MessageModel
            if (r13 == 0) goto L_0x0066
            r11.add(r12)
            goto L_0x0066
        L_0x0078:
            k77[] r3 = defpackage.fw.F
            t97 r3 = r8.p
            java.lang.Object r3 = r3.getValue()
            bv2 r3 = (defpackage.bv2) r3
            r0.A0 = r11
            r0.w0 = r9
            r0.x0 = r10
            r0.z0 = r1
            long r12 = r8.a
            java.lang.Object r3 = r3.d(r12, r0)
            if (r3 != r2) goto L_0x0093
            return r2
        L_0x0093:
            i22 r3 = (defpackage.i22) r3
            java.util.Iterator r12 = r11.iterator()
            r15 = r11
            r11 = r12
            r14 = 0
            r12 = r8
            r21 = r10
            r10 = r9
            r9 = r21
        L_0x00a2:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x0156
            java.lang.Object r13 = r11.next()
            int r5 = r14 + 1
            if (r14 < 0) goto L_0x0151
            one.me.messages.list.loader.MessageModel r13 = (one.me.messages.list.loader.MessageModel) r13
            d3a r13 = r12.h
            r0.A0 = r15
            r0.X = r3
            r0.Y = r12
            r0.Z = r11
            r0.w0 = r10
            r0.x0 = r9
            r0.y0 = r5
            r0.z0 = r6
            r13.getClass()
            java.lang.Object r16 = o23.Y(r14, r15)
            r1 = r16
            one.me.messages.list.loader.MessageModel r1 = (one.me.messages.list.loader.MessageModel) r1
            java.lang.String r6 = r13.a
            if (r1 == 0) goto L_0x012f
            fr8 r7 = r1.C0
            if (r7 == 0) goto L_0x00de
            r19 = r11
            r20 = r12
        L_0x00db:
            r23 = r15
            goto L_0x0120
        L_0x00de:
            t97 r7 = r13.d
            java.lang.Object r7 = r7.getValue()
            n1b r7 = (defpackage.n1b) r7
            java.util.concurrent.ConcurrentHashMap r7 = r7.c
            r19 = r11
            r20 = r12
            long r11 = r1.a
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.lang.Object r7 = r7.get(r11)
            r18 = r7
            o1b r18 = (defpackage.o1b) r18
            if (r18 != 0) goto L_0x0103
            java.lang.String r7 = "Trying to update message with non-existed preProcessedData!"
            r11 = 0
            udd.s(r6, r7, r11)
            goto L_0x00db
        L_0x0103:
            vt7 r6 = new vt7
            r6.<init>()
            y2a r7 = new y2a
            r11 = r13
            r13 = r7
            r12 = r14
            r14 = r3
            r23 = r15
            r15 = r12
            r16 = r1
            r17 = r23
            r13.<init>(r14, r15, r16, r17, r18)
            wt7 r1 = r6.a(r7)
            java.lang.Object r1 = r11.e(r1, r0)
        L_0x0120:
            if (r1 != r2) goto L_0x0123
            return r2
        L_0x0123:
            r15 = r23
            r14 = r5
            r11 = r19
            r12 = r20
        L_0x012a:
            r1 = 1
            r5 = 3
            r6 = 2
            goto L_0x00a2
        L_0x012f:
            r12 = r14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Trying to update message with index="
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r1 = " which not exists!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            udd.s(r6, r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0151:
            r1 = 0
            p23.G()
            throw r1
        L_0x0156:
            r23 = r15
            r1 = 0
            grd r3 = r8.A
            tw8 r5 = new tw8
            if (r9 == 0) goto L_0x0161
            r6 = 1
            goto L_0x0162
        L_0x0161:
            r6 = 0
        L_0x0162:
            r15 = r23
            if (r10 == 0) goto L_0x0168
            r7 = 1
            goto L_0x0169
        L_0x0168:
            r7 = 0
        L_0x0169:
            r5.<init>(r15, r6, r7)
            r0.A0 = r1
            r0.X = r1
            r0.Y = r1
            r0.Z = r1
            r6 = 3
            r0.z0 = r6
            r3.m(r1, r5)
            if (r4 != r2) goto L_0x017d
            return r2
        L_0x017d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv.o(java.lang.Object):java.lang.Object");
    }
}

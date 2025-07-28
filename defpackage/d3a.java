package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import one.me.messages.list.loader.MessageModel;

/* renamed from: d3a  reason: default package */
public final class d3a {
    public final String a = d3a.class.getName();
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;

    public d3a(r7e r7e, r7e r7e2, t97 t97, t97 t972) {
        this.b = r7e;
        this.c = r7e2;
        this.d = t97;
        this.e = t972;
    }

    public static boolean d(wt7 wt7, MessageModel messageModel, o1b o1b) {
        if (messageModel.H0 == bp8.ERROR) {
            return true;
        }
        wy wyVar = messageModel.y0;
        if (wyVar.c || wyVar.b) {
            return true;
        }
        CharSequence b2 = o1b.b(wt7.a);
        return (b2 == null || b2.length() == 0) ^ true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.xt7 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.a3a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            a3a r0 = (defpackage.a3a) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            a3a r0 = new a3a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            wt7 r4 = r0.o
            wx3.H(r6)
            goto L_0x0065
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            wx3.H(r6)
            wt7 r5 = (defpackage.wt7) r5
            one.me.messages.list.loader.MessageModel r6 = r5.b()
            er8 r6 = r6.K0
            er8 r2 = defpackage.er8.d
            boolean r6 = hhd.f(r6, r2)
            if (r6 != 0) goto L_0x004b
            one.me.messages.list.loader.MessageModel r4 = r5.b()
            er8 r4 = r4.K0
            return r4
        L_0x004b:
            t97 r4 = r4.e
            java.lang.Object r4 = r4.getValue()
            ap3 r4 = (defpackage.ap3) r4
            one.me.messages.list.loader.MessageModel r6 = r5.b()
            r0.o = r5
            r0.Z = r3
            long r2 = r6.F0
            java.lang.Comparable r6 = r4.b(r2, r0)
            if (r6 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r4 = r5
        L_0x0065:
            tf3 r6 = (defpackage.tf3) r6
            one.me.messages.list.loader.MessageModel r4 = r4.b()
            r5 = 0
            if (r6 == 0) goto L_0x0073
            java.lang.CharSequence r0 = r6.m()
            goto L_0x0074
        L_0x0073:
            r0 = r5
        L_0x0074:
            if (r6 == 0) goto L_0x007c
            fj0 r5 = defpackage.fj0.b
            java.lang.String r5 = r6.p(r5)
        L_0x007c:
            er8 r6 = new er8
            long r1 = r4.F0
            r6.<init>(r1, r0, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d3a.a(xt7, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.wt7 r7, int r8, int r9, int r10, kotlin.coroutines.Continuation r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof defpackage.b3a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            b3a r0 = (defpackage.b3a) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x0018
        L_0x0013:
            b3a r0 = new b3a
            r0.<init>(r6, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            int r10 = r0.Y
            xt7 r7 = r0.X
            d3a r6 = r0.o
            wx3.H(r11)
            goto L_0x009c
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            wx3.H(r11)
            i22 r11 = r7.a
            boolean r11 = r11.J()
            r2 = 0
            if (r11 == 0) goto L_0x0043
            goto L_0x00c4
        L_0x0043:
            i22 r11 = r7.a
            boolean r4 = r11.G()
            if (r4 == 0) goto L_0x0067
            boolean r4 = defpackage.ht8.d(r9)
            if (r4 != 0) goto L_0x0067
            boolean r7 = r11.U()
            t97 r6 = r6.b
            java.lang.Object r6 = r6.getValue()
            wxc r6 = (defpackage.wxc) r6
            java.lang.String r8 = r11.p()
            r9 = 4
            android.text.Layout r2 = defpackage.wxc.b(r6, r8, r7, r9)
            goto L_0x00c4
        L_0x0067:
            boolean r11 = defpackage.ir0.b(r8)
            if (r11 == 0) goto L_0x00c4
            boolean r11 = defpackage.ir0.c(r8)
            if (r11 != 0) goto L_0x0079
            boolean r8 = defpackage.ir0.a(r8)
            if (r8 == 0) goto L_0x00c4
        L_0x0079:
            boolean r8 = defpackage.ht8.d(r9)
            if (r8 != 0) goto L_0x00c4
            t97 r8 = r6.e
            java.lang.Object r8 = r8.getValue()
            ap3 r8 = (defpackage.ap3) r8
            one.me.messages.list.loader.MessageModel r9 = r7.b()
            r0.o = r6
            r0.X = r7
            r0.Y = r10
            r0.x0 = r3
            long r4 = r9.F0
            java.lang.Comparable r11 = r8.b(r4, r0)
            if (r11 != r1) goto L_0x009c
            return r1
        L_0x009c:
            tf3 r11 = (defpackage.tf3) r11
            r8 = 0
            if (r11 == 0) goto L_0x00a8
            boolean r9 = r11.u()
            if (r9 != r3) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r3 = r8
        L_0x00a9:
            t97 r6 = r6.b
            java.lang.Object r6 = r6.getValue()
            wxc r6 = (defpackage.wxc) r6
            wt7 r7 = (defpackage.wt7) r7
            o1b r7 = r7.b
            w6a r8 = r7.a
            int r8 = r8.g()
            r7.c(r8)
            java.lang.CharSequence r7 = r7.h
            android.text.Layout r2 = r6.a(r10, r7, r3)
        L_0x00c4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d3a.b(wt7, int, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean c(wt7 wt7, MessageModel messageModel, MessageModel messageModel2) {
        if (messageModel2 == null || messageModel2.C0 != null) {
            return false;
        }
        int i = (messageModel.c > 0 ? 1 : (messageModel.c == 0 ? 0 : -1));
        long j = messageModel2.c;
        if ((i < 0 && j > 0) || (i > 0 && j < 0)) {
            return false;
        }
        ConcurrentHashMap concurrentHashMap = ((n1b) this.d.getValue()).c;
        long j2 = messageModel2.a;
        o1b o1b = (o1b) concurrentHashMap.get(Long.valueOf(j2));
        if (o1b == null) {
            udd.U(this.a, us8.j(j2, "PreProcessedData for message=MessageModel(", ") is null"));
            return false;
        }
        o1b o1b2 = wt7.b;
        o1b2.d();
        l04 l04 = o1b2.n;
        o1b.d();
        return !(xs7.C(l04, o1b.n) ^ true) && messageModel.F0 == messageModel2.F0 && !d(wt7, messageModel, wt7.b) && !d(wt7, messageModel2, o1b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x036b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.wt7 r20, kotlin.coroutines.Continuation r21) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            r0 = r21
            boolean r1 = r0 instanceof defpackage.c3a
            if (r1 == 0) goto L_0x001a
            r1 = r0
            c3a r1 = (defpackage.c3a) r1
            int r2 = r1.A0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001a
            int r2 = r2 - r3
            r1.A0 = r2
        L_0x0018:
            r8 = r1
            goto L_0x0020
        L_0x001a:
            c3a r1 = new c3a
            r1.<init>(r6, r0)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r0 = r8.y0
            pu3 r9 = pu3.a
            int r1 = r8.A0
            r2 = 1
            r12 = 2
            if (r1 == 0) goto L_0x005b
            if (r1 == r2) goto L_0x0043
            if (r1 != r12) goto L_0x003b
            java.lang.Object r1 = r8.X
            one.me.messages.list.loader.MessageModel r1 = (one.me.messages.list.loader.MessageModel) r1
            java.lang.Object r2 = r8.o
            one.me.messages.list.loader.MessageModel r2 = (one.me.messages.list.loader.MessageModel) r2
            wx3.H(r0)
            goto L_0x03b8
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            int r1 = r8.x0
            one.me.messages.list.loader.MessageModel r2 = r8.w0
            one.me.messages.list.loader.MessageModel r3 = r8.Z
            one.me.messages.list.loader.MessageModel r4 = r8.Y
            java.lang.Object r5 = r8.X
            xt7 r5 = (defpackage.xt7) r5
            java.lang.Object r6 = r8.o
            d3a r6 = (defpackage.d3a) r6
            wx3.H(r0)
            r10 = r1
            r1 = r3
            r14 = r4
            goto L_0x036f
        L_0x005b:
            wx3.H(r0)
            one.me.messages.list.loader.MessageModel r0 = r20.b()
            z2a r1 = new z2a
            r3 = 0
            r1.<init>(r6, r7, r3)
            r3 = 3
            t97 r1 = ez3.O(r3, r1)
            z2a r4 = new z2a
            r5 = 1
            r4.<init>(r6, r7, r5)
            t97 r3 = ez3.O(r3, r4)
            i22 r4 = r7.a
            boolean r5 = r4.G()
            r13 = 0
            if (r5 == 0) goto L_0x0085
            r0 = 201326592(0xc000000, float:9.8607613E-32)
        L_0x0082:
            r10 = r0
            goto L_0x0153
        L_0x0085:
            java.util.List r5 = r20.c()
            int r5 = r5.size()
            boolean r0 = r0.G0
            r14 = 134217728(0x8000000, float:3.85186E-34)
            if (r5 > r2) goto L_0x009b
            if (r0 == 0) goto L_0x0098
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0099
        L_0x0098:
            r0 = r13
        L_0x0099:
            r0 = r0 | r14
            goto L_0x0082
        L_0x009b:
            int r5 = r7.c
            r15 = 268435456(0x10000000, float:2.5243549E-29)
            if (r5 != 0) goto L_0x00ca
            java.util.List r1 = r20.c()
            java.lang.Object r1 = r1.get(r13)
            one.me.messages.list.loader.MessageModel r1 = (one.me.messages.list.loader.MessageModel) r1
            java.util.List r3 = r20.c()
            java.lang.Object r3 = r3.get(r2)
            one.me.messages.list.loader.MessageModel r3 = (one.me.messages.list.loader.MessageModel) r3
            boolean r1 = r6.c(r7, r1, r3)
            if (r1 == 0) goto L_0x00c3
            if (r0 == 0) goto L_0x00c0
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00c1
        L_0x00c0:
            r0 = r13
        L_0x00c1:
            r0 = r0 | r15
            goto L_0x0082
        L_0x00c3:
            if (r0 == 0) goto L_0x00c8
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0099
        L_0x00c8:
            r0 = r13
            goto L_0x0099
        L_0x00ca:
            java.util.List r16 = r20.c()
            int r10 = p23.A(r16)
            r16 = 1073741824(0x40000000, float:2.0)
            if (r5 != r10) goto L_0x0101
            java.util.List r1 = r20.c()
            java.lang.Object r1 = r1.get(r5)
            one.me.messages.list.loader.MessageModel r1 = (one.me.messages.list.loader.MessageModel) r1
            java.util.List r3 = r20.c()
            int r5 = r5 - r2
            java.lang.Object r3 = r3.get(r5)
            one.me.messages.list.loader.MessageModel r3 = (one.me.messages.list.loader.MessageModel) r3
            boolean r1 = r6.c(r7, r1, r3)
            if (r1 == 0) goto L_0x00fa
            if (r0 == 0) goto L_0x00f6
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00f7
        L_0x00f6:
            r0 = r13
        L_0x00f7:
            r0 = r0 | r16
            goto L_0x0082
        L_0x00fa:
            if (r0 == 0) goto L_0x00ff
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0099
        L_0x00ff:
            r0 = r13
            goto L_0x0099
        L_0x0101:
            java.lang.Object r5 = r1.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0122
            java.lang.Object r5 = r3.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0122
            if (r0 == 0) goto L_0x011f
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0099
        L_0x011f:
            r0 = r13
            goto L_0x0099
        L_0x0122:
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0135
            if (r0 == 0) goto L_0x0133
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00c1
        L_0x0133:
            r0 = r13
            goto L_0x00c1
        L_0x0135:
            java.lang.Object r1 = r3.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x014c
            if (r0 == 0) goto L_0x0146
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0147
        L_0x0146:
            r0 = r13
        L_0x0147:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 | r1
            goto L_0x0082
        L_0x014c:
            if (r0 == 0) goto L_0x0151
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00f7
        L_0x0151:
            r0 = r13
            goto L_0x00f7
        L_0x0153:
            one.me.messages.list.loader.MessageModel r14 = r20.b()
            one.me.messages.list.loader.MessageModel r0 = r20.b()
            wy r0 = r0.y0
            rz r0 = r0.d
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            fr8 r1 = r1.C0
            if (r1 == 0) goto L_0x0169
            r1 = r2
            goto L_0x016a
        L_0x0169:
            r1 = r13
        L_0x016a:
            r3 = 4
            o1b r5 = r7.b
            if (r1 == 0) goto L_0x0172
            r0 = r13
            goto L_0x0285
        L_0x0172:
            java.lang.CharSequence r1 = r5.b(r4)
            if (r1 == 0) goto L_0x0181
            int r1 = r1.length()
            if (r1 != 0) goto L_0x017f
            goto L_0x0181
        L_0x017f:
            r1 = r13
            goto L_0x0182
        L_0x0181:
            r1 = r2
        L_0x0182:
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x019a
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            wy r1 = r1.y0
            rz r1 = r1.d
            if (r1 == 0) goto L_0x0191
            r1 = r2
            goto L_0x0192
        L_0x0191:
            r1 = r13
        L_0x0192:
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x019a
            r0 = 4096(0x1000, float:5.74E-42)
        L_0x0197:
            r0 = r0 | r10
            goto L_0x0285
        L_0x019a:
            boolean r1 = r0 instanceof defpackage.pz0
            if (r1 == 0) goto L_0x01a1
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x0197
        L_0x01a1:
            boolean r1 = r0 instanceof defpackage.b76
            if (r1 == 0) goto L_0x01a8
            r0 = 64
            goto L_0x0197
        L_0x01a8:
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            java.lang.CharSequence r1 = r1.o
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x01c8
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            wy r1 = r1.y0
            rz r1 = r1.d
            if (r1 == 0) goto L_0x01c0
            r1 = r2
            goto L_0x01c1
        L_0x01c0:
            r1 = r13
        L_0x01c1:
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x01c8
            r0 = r2 | r10
            goto L_0x0285
        L_0x01c8:
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            wy r1 = r1.y0
            boolean r1 = r1.a
            if (r1 == 0) goto L_0x01f0
            boolean r1 = r0 instanceof defpackage.qhd
            if (r1 == 0) goto L_0x01f0
            r0 = r12 | r10
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            java.lang.CharSequence r1 = r1.o
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x028f
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            qs8 r1 = r1.A0
            if (r1 == 0) goto L_0x028f
            r0 = r10 | 3
            goto L_0x028f
        L_0x01f0:
            boolean r1 = r0 instanceof defpackage.wid
            if (r1 == 0) goto L_0x020e
            r0 = r3 | r10
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            java.lang.CharSequence r1 = r1.o
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x028f
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            qs8 r1 = r1.A0
            if (r1 == 0) goto L_0x028f
            r0 = r10 | 5
            goto L_0x028f
        L_0x020e:
            boolean r1 = r0 instanceof defpackage.w13
            if (r1 == 0) goto L_0x022c
            r0 = 8192(0x2000, float:1.14794E-41)
            r0 = r0 | r10
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            java.lang.CharSequence r1 = r1.o
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x028f
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            qs8 r1 = r1.A0
            if (r1 == 0) goto L_0x028f
            r0 = r10 | 8193(0x2001, float:1.1481E-41)
            goto L_0x028f
        L_0x022c:
            boolean r1 = r0 instanceof defpackage.gtd
            if (r1 == 0) goto L_0x0259
            gtd r0 = (defpackage.gtd) r0
            ktd r1 = r0.a
            java.lang.String r1 = r1.Y
            if (r1 == 0) goto L_0x0244
            int r1 = r1.length()
            if (r1 != 0) goto L_0x023f
            goto L_0x0244
        L_0x023f:
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0197
        L_0x0244:
            ktd r0 = r0.a
            java.lang.String r0 = r0.X
            if (r0 == 0) goto L_0x0255
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0251
            goto L_0x0255
        L_0x0251:
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0197
        L_0x0255:
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x0197
        L_0x0259:
            boolean r1 = r0 instanceof defpackage.ag3
            if (r1 == 0) goto L_0x0261
            r0 = 16
            goto L_0x0197
        L_0x0261:
            boolean r1 = r0 instanceof defpackage.rad
            if (r1 == 0) goto L_0x0269
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x0197
        L_0x0269:
            boolean r1 = r0 instanceof defpackage.m40
            if (r1 == 0) goto L_0x0271
            r0 = 8
            goto L_0x0197
        L_0x0271:
            boolean r1 = r0 instanceof defpackage.pc5
            if (r1 == 0) goto L_0x0279
            r0 = 32
            goto L_0x0197
        L_0x0279:
            boolean r0 = r0 instanceof defpackage.h5f
            if (r0 == 0) goto L_0x0281
            r0 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0197
        L_0x0281:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0197
        L_0x0285:
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            tq8 r1 = r1.B0
            if (r1 == 0) goto L_0x028f
            r0 = r0 | 1024(0x400, float:1.435E-42)
        L_0x028f:
            r14.L0 = r0
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            boolean r15 = r4.A()
            long r11 = r1.F0
            if (r15 != 0) goto L_0x029f
        L_0x029d:
            r1 = 0
            goto L_0x02b6
        L_0x029f:
            boolean r1 = r4.C(r11)
            if (r1 != 0) goto L_0x02a6
            goto L_0x029d
        L_0x02a6:
            o62 r1 = r4.b
            java.util.Map r1 = r1.R
            java.lang.Long r15 = java.lang.Long.valueOf(r11)
            java.lang.Object r1 = r1.get(r15)
            x52 r1 = (defpackage.x52) r1
            java.lang.String r1 = r1.d
        L_0x02b6:
            int r15 = r14.D0
            if (r15 == r2) goto L_0x0334
            one.me.messages.list.loader.MessageModel r15 = r20.b()
            boolean r15 = r15.G0
            if (r15 == 0) goto L_0x0334
            r17 = 0
            int r15 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r15 == 0) goto L_0x0334
            boolean r15 = r4.G()
            if (r15 != 0) goto L_0x0334
            boolean r15 = defpackage.ir0.b(r10)
            if (r15 == 0) goto L_0x0334
            boolean r15 = defpackage.ir0.c(r10)
            if (r15 != 0) goto L_0x02e0
            boolean r15 = defpackage.ir0.a(r10)
            if (r15 == 0) goto L_0x0334
        L_0x02e0:
            boolean r0 = defpackage.ht8.d(r0)
            if (r0 == 0) goto L_0x02e7
            goto L_0x0334
        L_0x02e7:
            r0 = 6
            t97 r15 = r6.c
            if (r1 == 0) goto L_0x02fe
            boolean r17 = h0e.c0(r1)
            if (r17 == 0) goto L_0x02f3
            goto L_0x02fe
        L_0x02f3:
            java.lang.Object r4 = r15.getValue()
            wxc r4 = (defpackage.wxc) r4
            android.text.Layout r0 = defpackage.wxc.b(r4, r1, r13, r0)
            goto L_0x0335
        L_0x02fe:
            boolean r1 = r4.V(r11)
            if (r1 == 0) goto L_0x0319
            java.lang.Object r1 = r15.getValue()
            wxc r1 = (defpackage.wxc) r1
            w6a r4 = r5.a
            android.content.Context r4 = r4.a
            int r5 = defpackage.l8a.o2
            java.lang.String r4 = r4.getString(r5)
            android.text.Layout r0 = defpackage.wxc.b(r1, r4, r13, r0)
            goto L_0x0335
        L_0x0319:
            boolean r1 = r4.C(r11)
            if (r1 == 0) goto L_0x0334
            java.lang.Object r1 = r15.getValue()
            wxc r1 = (defpackage.wxc) r1
            w6a r4 = r5.a
            android.content.Context r4 = r4.a
            int r5 = defpackage.l8a.a2
            java.lang.String r4 = r4.getString(r5)
            android.text.Layout r0 = defpackage.wxc.b(r1, r4, r13, r0)
            goto L_0x0335
        L_0x0334:
            r0 = 0
        L_0x0335:
            if (r0 == 0) goto L_0x034c
            int r1 = r0.getWidth()
            float r3 = (float) r3
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            int r1 = defpackage.me4.c(r3, r4, r1)
            r4 = r1
            goto L_0x034d
        L_0x034c:
            r4 = r13
        L_0x034d:
            r14.J0 = r0
            int r3 = r14.L0
            r8.o = r6
            r8.X = r7
            r8.Y = r14
            r8.Z = r14
            r8.w0 = r14
            r8.x0 = r10
            r8.A0 = r2
            r0 = r19
            r1 = r20
            r2 = r10
            r5 = r8
            java.lang.Object r0 = r0.b(r1, r2, r3, r4, r5)
            if (r0 != r9) goto L_0x036c
            return r9
        L_0x036c:
            r5 = r7
            r1 = r14
            r2 = r1
        L_0x036f:
            android.text.Layout r0 = (android.text.Layout) r0
            r2.I0 = r0
            r8.o = r14
            r8.X = r1
            r0 = 0
            r8.Y = r0
            r8.Z = r0
            r8.w0 = r0
            r2 = 2
            r8.A0 = r2
            r6.getClass()
            r2 = r5
            wt7 r2 = (defpackage.wt7) r2
            i22 r3 = r2.a
            boolean r3 = r3.J()
            if (r3 != 0) goto L_0x03b2
            i22 r2 = r2.a
            boolean r2 = r2.G()
            if (r2 != 0) goto L_0x03b2
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 & r10
            if (r2 != 0) goto L_0x039d
            goto L_0x03b2
        L_0x039d:
            boolean r0 = defpackage.ir0.a(r10)
            if (r0 != 0) goto L_0x03ad
            boolean r0 = defpackage.ir0.c(r10)
            if (r0 == 0) goto L_0x03aa
            goto L_0x03ad
        L_0x03aa:
            er8 r11 = defpackage.er8.d
            goto L_0x03b3
        L_0x03ad:
            java.lang.Object r0 = r6.a(r5, r8)
            goto L_0x03b4
        L_0x03b2:
            r11 = r0
        L_0x03b3:
            r0 = r11
        L_0x03b4:
            if (r0 != r9) goto L_0x03b7
            return r9
        L_0x03b7:
            r2 = r14
        L_0x03b8:
            er8 r0 = (defpackage.er8) r0
            r1.K0 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d3a.e(wt7, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

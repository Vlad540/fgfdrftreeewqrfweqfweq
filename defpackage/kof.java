package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: kof  reason: default package */
public final class kof implements q57 {
    public final r57 a;
    public final t97 b;
    public final t97 c;
    public final Set d;
    public final us0 e;
    public jff f;

    public kof(r57 r57, t97 t97, t97 t972) {
        this.a = r57;
        this.b = t97;
        this.c = t972;
        pz4 pz4 = aof.z0;
        ArrayList arrayList = new ArrayList(q23.H(pz4, 10));
        u1 u1Var = new u1(0, pz4);
        while (u1Var.hasNext()) {
            arrayList.add(((aof) u1Var.next()).a);
        }
        this.d = o23.w0(arrayList);
        this.e = xs7.a(0, 0, 7);
    }

    public static final void e(kof kof, String str) {
        jff jff = kof.f;
        if (jff != null) {
            tif.a((tif) kof.b.getValue(), str, jff.a, jff.b, true, 0, (Integer) null, (Integer) null, 240);
        }
    }

    public static o57 f(Throwable th) {
        tnf tnf = th instanceof tnf ? (tnf) th : null;
        int i = 1;
        int i2 = 3;
        if (tnf instanceof snf) {
            if (((snf) tnf).a) {
                i = 3;
            }
            return new m57(new p57("too_many_keys", i));
        }
        int i3 = 4;
        if (tnf instanceof pnf) {
            if (((pnf) tnf).a) {
                i3 = 6;
            }
            return new m57(new p57("not_found", i3));
        } else if (tnf instanceof onf) {
            return new m57(new p57("not_found", 1));
        } else {
            if (tnf == null) {
                return n57.d;
            }
            if (tnf instanceof qnf) {
                if (((qnf) tnf).a) {
                    i2 = 5;
                }
                return new m57(new p57("too_large_key", i2));
            } else if (tnf instanceof rnf) {
                if (!((rnf) tnf).a) {
                    i3 = 2;
                }
                return new m57(new p57("too_large_value", i3));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final Object a(String str, String str2, Continuation continuation) {
        Object h;
        boolean contains = this.d.contains(str);
        jue jue = jue.a;
        if (!contains) {
            String name = kof.class.getName();
            udd.s(name, "Unknown method with name = " + str + " in JsDelegate: " + this, (Throwable) null);
            return jue;
        }
        aof aof = aof.SECURE_SAVE_KEY;
        boolean f2 = hhd.f(str, "WebAppSecureStorageSaveKey");
        pu3 pu3 = pu3.a;
        if (f2) {
            Object j = j(str2, true, continuation);
            return j == pu3 ? j : jue;
        } else if (hhd.f(str, "WebAppSecureStorageGetKey")) {
            Object i = i(str2, true, continuation);
            return i == pu3 ? i : jue;
        } else if (hhd.f(str, "WebAppSecureStorageClear")) {
            Object h2 = h(str2, true, continuation);
            return h2 == pu3 ? h2 : jue;
        } else if (hhd.f(str, "WebAppDeviceStorageSaveKey")) {
            Object j2 = j(str2, false, continuation);
            return j2 == pu3 ? j2 : jue;
        } else if (!hhd.f(str, "WebAppDeviceStorageGetKey")) {
            return (!hhd.f(str, "WebAppDeviceStorageClear") || (h = h(str2, false, continuation)) != pu3) ? jue : h;
        } else {
            Object i2 = i(str2, false, continuation);
            return i2 == pu3 ? i2 : jue;
        }
    }

    public final us0 b() {
        return this.e;
    }

    public final Set c() {
        return this.d;
    }

    public final void d(jff jff) {
        this.f = jff;
    }

    public final m53 g() {
        return (m53) this.c.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.String r10, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.bof
            if (r0 == 0) goto L_0x0013
            r0 = r12
            bof r0 = (defpackage.bof) r0
            int r1 = r0.y0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y0 = r1
            goto L_0x0018
        L_0x0013:
            bof r0 = new bof
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.w0
            pu3 r1 = pu3.a
            int r2 = r0.y0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x004d
            if (r2 == r5) goto L_0x0041
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            wx3.H(r12)
            goto L_0x00b6
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            aof r9 = r0.Y
            nnf r10 = r0.X
            kof r11 = r0.o
            wx3.H(r12)
            goto L_0x00a0
        L_0x0041:
            wyd r9 = r0.Z
            aof r10 = r0.Y
            nnf r11 = r0.X
            kof r2 = r0.o
            wx3.H(r12)
            goto L_0x0087
        L_0x004d:
            wx3.H(r12)
            r57 r12 = r57.d
            r12.getClass()
            mnf r2 = defpackage.nnf.Companion
            l77 r2 = r2.serializer()
            java.lang.Object r10 = r12.a(r2, r10)
            nnf r10 = (defpackage.nnf) r10
            if (r11 == 0) goto L_0x0066
            aof r12 = defpackage.aof.SECURE_CLEAR_KEYS
            goto L_0x0068
        L_0x0066:
            aof r12 = defpackage.aof.CLEAR_KEYS
        L_0x0068:
            wyd r2 = new wyd
            java.lang.String r7 = r10.a
            r2.<init>(r7, r11)
            r0.o = r9
            r0.X = r10
            r0.Y = r12
            r0.Z = r2
            r0.y0 = r5
            us0 r11 = r9.e
            java.lang.Object r11 = r11.o(r2, r0)
            if (r11 != r1) goto L_0x0082
            return r1
        L_0x0082:
            r11 = r10
            r10 = r12
            r8 = r2
            r2 = r9
            r9 = r8
        L_0x0087:
            cof r12 = new cof
            r12.<init>(r11, r10, r2, r6)
            r0.o = r2
            r0.X = r11
            r0.Y = r10
            r0.Z = r6
            r0.y0 = r4
            java.lang.Object r12 = r9.c(r12, r0)
            if (r12 != r1) goto L_0x009d
            return r1
        L_0x009d:
            r9 = r10
            r10 = r11
            r11 = r2
        L_0x00a0:
            e57 r12 = (defpackage.e57) r12
            dof r2 = new dof
            r2.<init>(r10, r9, r11, r6)
            r0.o = r6
            r0.X = r6
            r0.Y = r6
            r0.y0 = r3
            java.lang.Object r9 = r12.d(r2, r0)
            if (r9 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            jue r9 = jue.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kof.h(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.String r11, boolean r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.eof
            if (r0 == 0) goto L_0x0013
            r0 = r13
            eof r0 = (defpackage.eof) r0
            int r1 = r0.y0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y0 = r1
            goto L_0x0018
        L_0x0013:
            eof r0 = new eof
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.w0
            pu3 r1 = pu3.a
            int r2 = r0.y0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x004d
            if (r2 == r5) goto L_0x0041
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            wx3.H(r13)
            goto L_0x00b8
        L_0x002f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0037:
            aof r10 = r0.Y
            wnf r11 = r0.X
            kof r12 = r0.o
            wx3.H(r13)
            goto L_0x00a2
        L_0x0041:
            xyd r10 = r0.Z
            aof r11 = r0.Y
            wnf r12 = r0.X
            kof r2 = r0.o
            wx3.H(r13)
            goto L_0x0089
        L_0x004d:
            wx3.H(r13)
            r57 r13 = r57.d
            r13.getClass()
            vnf r2 = defpackage.wnf.Companion
            l77 r2 = r2.serializer()
            java.lang.Object r11 = r13.a(r2, r11)
            wnf r11 = (defpackage.wnf) r11
            if (r12 == 0) goto L_0x0066
            aof r13 = defpackage.aof.SECURE_GET_KEY
            goto L_0x0068
        L_0x0066:
            aof r13 = defpackage.aof.GET_KEY
        L_0x0068:
            xyd r2 = new xyd
            java.lang.String r7 = r11.a
            java.lang.String r8 = r11.c
            r2.<init>(r7, r8, r12)
            r0.o = r10
            r0.X = r11
            r0.Y = r13
            r0.Z = r2
            r0.y0 = r5
            us0 r12 = r10.e
            java.lang.Object r12 = r12.o(r2, r0)
            if (r12 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r12 = r11
            r11 = r13
            r9 = r2
            r2 = r10
            r10 = r9
        L_0x0089:
            fof r13 = new fof
            r13.<init>(r12, r11, r2, r6)
            r0.o = r2
            r0.X = r12
            r0.Y = r11
            r0.Z = r6
            r0.y0 = r4
            java.lang.Object r13 = r10.c(r13, r0)
            if (r13 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r10 = r11
            r11 = r12
            r12 = r2
        L_0x00a2:
            e57 r13 = (defpackage.e57) r13
            gof r2 = new gof
            r2.<init>(r11, r10, r12, r6)
            r0.o = r6
            r0.X = r6
            r0.Y = r6
            r0.y0 = r3
            java.lang.Object r10 = r13.d(r2, r0)
            if (r10 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            jue r10 = jue.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kof.i(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0115 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.String r17, boolean r18, kotlin.coroutines.Continuation r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof defpackage.hof
            if (r3 == 0) goto L_0x001a
            r3 = r2
            hof r3 = (defpackage.hof) r3
            int r4 = r3.y0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r3.y0 = r4
        L_0x0018:
            r9 = r3
            goto L_0x0020
        L_0x001a:
            hof r3 = new hof
            r3.<init>(r0, r2)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r2 = r9.w0
            pu3 r3 = pu3.a
            int r4 = r9.y0
            jue r10 = jue.a
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r11 = 1
            r12 = 0
            if (r4 == 0) goto L_0x006c
            if (r4 == r11) goto L_0x0067
            if (r4 == r8) goto L_0x0063
            if (r4 == r7) goto L_0x0052
            if (r4 == r6) goto L_0x0047
            if (r4 != r5) goto L_0x003f
            wx3.H(r2)
            goto L_0x0115
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0047:
            aof r0 = r9.Y
            nof r1 = r9.X
            kof r4 = r9.o
            wx3.H(r2)
            goto L_0x00ff
        L_0x0052:
            e57 r0 = r9.Z
            aof r1 = r9.Y
            nof r4 = r9.X
            kof r7 = r9.o
            wx3.H(r2)
            r15 = r0
            r13 = r1
            r1 = r4
            r0 = r7
            goto L_0x00e7
        L_0x0063:
            wx3.H(r2)
            goto L_0x00c2
        L_0x0067:
            wx3.H(r2)
            goto L_0x0131
        L_0x006c:
            wx3.H(r2)
            r57 r2 = r57.d
            r2.getClass()
            mof r4 = defpackage.nof.Companion
            l77 r4 = r4.serializer()
            r13 = r17
            java.lang.Object r2 = r2.a(r4, r13)
            nof r2 = (defpackage.nof) r2
            if (r1 == 0) goto L_0x0088
            aof r4 = defpackage.aof.SECURE_SAVE_KEY
        L_0x0086:
            r13 = r4
            goto L_0x008b
        L_0x0088:
            aof r4 = defpackage.aof.SAVE_KEY
            goto L_0x0086
        L_0x008b:
            java.lang.String r4 = r2.c
            java.nio.charset.Charset r14 = e22.a
            byte[] r4 = r4.getBytes(r14)
            int r4 = r4.length
            r15 = 128(0x80, float:1.794E-43)
            us0 r11 = r0.e
            if (r4 > r15) goto L_0x0116
            java.lang.String r4 = r2.d
            if (r4 == 0) goto L_0x00c3
            byte[] r14 = r4.getBytes(r14)
            int r14 = r14.length
            r15 = 4000(0xfa0, float:5.605E-42)
            if (r14 > r15) goto L_0x00a8
            goto L_0x00c3
        L_0x00a8:
            rnf r4 = new rnf
            r4.<init>(r1)
            o57 r6 = f(r4)
            m53 r4 = r16.g()
            r9.y0 = r8
            java.lang.String r8 = r2.b
            r5 = r11
            r7 = r13
            java.lang.Object r0 = r4.a(r5, r6, r7, r8, r9)
            if (r0 != r3) goto L_0x00c2
            return r3
        L_0x00c2:
            return r10
        L_0x00c3:
            java.lang.String r8 = r2.c
            java.lang.String r14 = r2.a
            if (r4 != 0) goto L_0x00d0
            yyd r4 = new yyd
            r4.<init>(r14, r8, r1)
            r15 = r4
            goto L_0x00d5
        L_0x00d0:
            zyd r15 = new zyd
            r15.<init>(r14, r8, r4, r1)
        L_0x00d5:
            r9.o = r0
            r9.X = r2
            r9.Y = r13
            r9.Z = r15
            r9.y0 = r7
            java.lang.Object r1 = r11.o(r15, r9)
            if (r1 != r3) goto L_0x00e6
            return r3
        L_0x00e6:
            r1 = r2
        L_0x00e7:
            iof r2 = new iof
            r2.<init>(r13, r0, r1, r12)
            r9.o = r0
            r9.X = r1
            r9.Y = r13
            r9.Z = r12
            r9.y0 = r6
            java.lang.Object r2 = r15.c(r2, r9)
            if (r2 != r3) goto L_0x00fd
            return r3
        L_0x00fd:
            r4 = r0
            r0 = r13
        L_0x00ff:
            e57 r2 = (defpackage.e57) r2
            jof r6 = new jof
            r6.<init>(r0, r4, r1, r12)
            r9.o = r12
            r9.X = r12
            r9.Y = r12
            r9.y0 = r5
            java.lang.Object r0 = r2.d(r6, r9)
            if (r0 != r3) goto L_0x0115
            return r3
        L_0x0115:
            return r10
        L_0x0116:
            qnf r4 = new qnf
            r4.<init>(r1)
            o57 r6 = f(r4)
            m53 r4 = r16.g()
            r0 = 1
            r9.y0 = r0
            java.lang.String r8 = r2.b
            r5 = r11
            r7 = r13
            java.lang.Object r0 = r4.a(r5, r6, r7, r8, r9)
            if (r0 != r3) goto L_0x0131
            return r3
        L_0x0131:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kof.j(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

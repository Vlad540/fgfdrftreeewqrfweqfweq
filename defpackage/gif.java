package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: gif  reason: default package */
public final class gif implements q57 {
    public static final List i = Collections.singletonList("unknown");
    public final r57 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final Set f;
    public final us0 g;
    public jff h;

    public gif(r57 r57, t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = r57;
        this.b = t97;
        this.c = t972;
        this.d = t973;
        this.e = t974;
        pz4 pz4 = phf.y0;
        ArrayList arrayList = new ArrayList(q23.H(pz4, 10));
        u1 u1Var = new u1(0, pz4);
        while (u1Var.hasNext()) {
            arrayList.add(((phf) u1Var.next()).a);
        }
        this.f = o23.w0(arrayList);
        this.g = xs7.a(0, 0, 7);
    }

    public static final void e(gif gif, String str) {
        jff jff = gif.h;
        if (jff != null) {
            tif.a((tif) gif.b.getValue(), str, jff.a, jff.b, true, 0, (Integer) null, (Integer) null, 240);
        }
    }

    public static o57 f(Throwable th) {
        ihf ihf = th instanceof ihf ? (ihf) th : null;
        int i2 = 3;
        if (ihf instanceof bhf) {
            return new m57(new p57("access_denied", 3));
        }
        int i3 = 0;
        if (ihf instanceof chf) {
            int i4 = qhf.$EnumSwitchMapping$0[((chf) ihf).a.ordinal()];
            if (i4 == 1) {
                i3 = 4;
            } else if (i4 != 2) {
                if (i4 == 3 || i4 == 4) {
                    i3 = 6;
                } else if (i4 == 5) {
                    i3 = 5;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return new m57(new p57("not_found", i3));
        } else if (ihf instanceof dhf) {
            if (!((dhf) ihf).a) {
                i2 = 1;
            }
            return new m57(new p57("not_supported", i2));
        } else if (ihf instanceof ehf) {
            int i5 = qhf.$EnumSwitchMapping$0[((ehf) ihf).a.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (!(i5 == 3 || i5 == 4)) {
                        if (i5 == 5) {
                            i3 = 4;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                return new m57(new p57("permission_denied", i3));
            }
            i3 = 2;
            return new m57(new p57("permission_denied", i3));
        } else if (ihf instanceof ghf) {
            return new m57(new p57("token_not_found", 4));
        } else {
            if (ihf instanceof hhf) {
                return new m57(new p57("too_large", 3));
            }
            if (ihf instanceof fhf) {
                return new m57(new p57("refused", 1));
            }
            if (ihf == null) {
                return n57.d;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final Object a(String str, String str2, Continuation continuation) {
        Object j;
        boolean contains = this.f.contains(str);
        jue jue = jue.a;
        Class<gif> cls = gif.class;
        if (!contains) {
            String name = cls.getName();
            udd.s(name, "Unknown method with name = " + str + " in JsDelegate: " + this, (Throwable) null);
            return jue;
        }
        kb5 kb5 = (kb5) ((jb5) this.e.getValue());
        kb5.getClass();
        if (!kb5.m(PmsKey.f122webappbiometryenabled, false)) {
            udd.U(cls.getName(), "Processing is disable");
            return jue;
        }
        phf phf = phf.GET_INFO;
        boolean f2 = hhd.f(str, "WebAppBiometryGetInfo");
        pu3 pu3 = pu3.a;
        if (f2) {
            Object i2 = i(str2, continuation);
            return i2 == pu3 ? i2 : jue;
        } else if (hhd.f(str, "WebAppBiometryRequestAccess")) {
            Object k = k(str2, continuation);
            return k == pu3 ? k : jue;
        } else if (hhd.f(str, "WebAppBiometryUpdateToken")) {
            Object l = l(str2, continuation);
            return l == pu3 ? l : jue;
        } else if (!hhd.f(str, "WebAppBiometryRequestAuth")) {
            return (!hhd.f(str, "WebAppBiometryOpenSettings") || (j = j(str2, continuation)) != pu3) ? jue : j;
        } else {
            Object h2 = h(str2, continuation);
            return h2 == pu3 ? h2 : jue;
        }
    }

    public final us0 b() {
        return this.g;
    }

    public final Set c() {
        return this.f;
    }

    public final void d(jff jff) {
        this.h = jff;
    }

    public final m53 g() {
        return (m53) this.c.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.rhf
            if (r0 == 0) goto L_0x0013
            r0 = r11
            rhf r0 = (defpackage.rhf) r0
            int r1 = r0.y0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y0 = r1
            goto L_0x0018
        L_0x0013:
            rhf r0 = new rhf
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.w0
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
            wx3.H(r11)
            goto L_0x00b2
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            phf r9 = r0.Y
            qff r10 = r0.X
            gif r2 = r0.o
            wx3.H(r11)
            goto L_0x009c
        L_0x0041:
            em0 r9 = r0.Z
            phf r10 = r0.Y
            qff r2 = r0.X
            gif r5 = r0.o
            wx3.H(r11)
            goto L_0x0083
        L_0x004d:
            wx3.H(r11)
            r57 r11 = r57.d
            r11.getClass()
            pff r2 = defpackage.qff.Companion
            l77 r2 = r2.serializer()
            java.lang.Object r10 = r11.a(r2, r10)
            qff r10 = (defpackage.qff) r10
            phf r11 = defpackage.phf.REQUEST_AUTH
            em0 r2 = new em0
            java.lang.String r7 = r10.a
            java.lang.String r8 = r10.c
            r2.<init>(r7, r8)
            r0.o = r9
            r0.X = r10
            r0.Y = r11
            r0.Z = r2
            r0.y0 = r5
            us0 r5 = r9.g
            java.lang.Object r5 = r5.o(r2, r0)
            if (r5 != r1) goto L_0x007f
            return r1
        L_0x007f:
            r5 = r9
            r9 = r2
            r2 = r10
            r10 = r11
        L_0x0083:
            shf r11 = new shf
            r11.<init>(r2, r10, r5, r6)
            r0.o = r5
            r0.X = r2
            r0.Y = r10
            r0.Z = r6
            r0.y0 = r4
            java.lang.Object r11 = r9.c(r11, r0)
            if (r11 != r1) goto L_0x0099
            return r1
        L_0x0099:
            r9 = r10
            r10 = r2
            r2 = r5
        L_0x009c:
            e57 r11 = (defpackage.e57) r11
            thf r4 = new thf
            r4.<init>(r10, r9, r2, r6)
            r0.o = r6
            r0.X = r6
            r0.Y = r6
            r0.y0 = r3
            java.lang.Object r9 = r11.d(r4, r0)
            if (r9 != r1) goto L_0x00b2
            return r1
        L_0x00b2:
            jue r9 = jue.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gif.h(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0096 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00af A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.uhf
            if (r0 == 0) goto L_0x0013
            r0 = r10
            uhf r0 = (defpackage.uhf) r0
            int r1 = r0.y0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y0 = r1
            goto L_0x0018
        L_0x0013:
            uhf r0 = new uhf
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.w0
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
            wx3.H(r10)
            goto L_0x00b0
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            phf r8 = r0.Y
            lhf r9 = r0.X
            gif r2 = r0.o
            wx3.H(r10)
            goto L_0x009a
        L_0x0041:
            fm0 r8 = r0.Z
            phf r9 = r0.Y
            lhf r2 = r0.X
            gif r5 = r0.o
            wx3.H(r10)
            goto L_0x0081
        L_0x004d:
            wx3.H(r10)
            r57 r10 = r57.d
            r10.getClass()
            khf r2 = defpackage.lhf.Companion
            l77 r2 = r2.serializer()
            java.lang.Object r9 = r10.a(r2, r9)
            lhf r9 = (defpackage.lhf) r9
            phf r10 = defpackage.phf.GET_INFO
            fm0 r2 = new fm0
            java.lang.String r7 = r9.a
            r2.<init>(r7)
            r0.o = r8
            r0.X = r9
            r0.Y = r10
            r0.Z = r2
            r0.y0 = r5
            us0 r5 = r8.g
            java.lang.Object r5 = r5.o(r2, r0)
            if (r5 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L_0x0081:
            vhf r10 = new vhf
            r10.<init>(r2, r9, r5, r6)
            r0.o = r5
            r0.X = r2
            r0.Y = r9
            r0.Z = r6
            r0.y0 = r4
            java.lang.Object r10 = r8.c(r10, r0)
            if (r10 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r8 = r9
            r9 = r2
            r2 = r5
        L_0x009a:
            e57 r10 = (defpackage.e57) r10
            whf r4 = new whf
            r4.<init>(r9, r8, r2, r6)
            r0.o = r6
            r0.X = r6
            r0.Y = r6
            r0.y0 = r3
            java.lang.Object r8 = r10.d(r4, r0)
            if (r8 != r1) goto L_0x00b0
            return r1
        L_0x00b0:
            jue r8 = jue.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gif.i(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0096 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00af A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.xhf
            if (r0 == 0) goto L_0x0013
            r0 = r10
            xhf r0 = (defpackage.xhf) r0
            int r1 = r0.y0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y0 = r1
            goto L_0x0018
        L_0x0013:
            xhf r0 = new xhf
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.w0
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
            wx3.H(r10)
            goto L_0x00b0
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            phf r8 = r0.Y
            jif r9 = r0.X
            gif r2 = r0.o
            wx3.H(r10)
            goto L_0x009a
        L_0x0041:
            gm0 r8 = r0.Z
            phf r9 = r0.Y
            jif r2 = r0.X
            gif r5 = r0.o
            wx3.H(r10)
            goto L_0x0081
        L_0x004d:
            wx3.H(r10)
            r57 r10 = r57.d
            r10.getClass()
            iif r2 = defpackage.jif.Companion
            l77 r2 = r2.serializer()
            java.lang.Object r9 = r10.a(r2, r9)
            jif r9 = (defpackage.jif) r9
            phf r10 = defpackage.phf.OPEN_SETTINGS
            gm0 r2 = new gm0
            java.lang.String r7 = r9.a
            r2.<init>(r7)
            r0.o = r8
            r0.X = r9
            r0.Y = r10
            r0.Z = r2
            r0.y0 = r5
            us0 r5 = r8.g
            java.lang.Object r5 = r5.o(r2, r0)
            if (r5 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L_0x0081:
            yhf r10 = new yhf
            r10.<init>(r9, r5, r2, r6)
            r0.o = r5
            r0.X = r2
            r0.Y = r9
            r0.Z = r6
            r0.y0 = r4
            java.lang.Object r10 = r8.c(r10, r0)
            if (r10 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r8 = r9
            r9 = r2
            r2 = r5
        L_0x009a:
            e57 r10 = (defpackage.e57) r10
            zhf r4 = new zhf
            r4.<init>(r8, r2, r9, r6)
            r0.o = r6
            r0.X = r6
            r0.Y = r6
            r0.y0 = r3
            java.lang.Object r8 = r10.d(r4, r0)
            if (r8 != r1) goto L_0x00b0
            return r1
        L_0x00b0:
            jue r8 = jue.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gif.j(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.aif
            if (r0 == 0) goto L_0x0013
            r0 = r11
            aif r0 = (defpackage.aif) r0
            int r1 = r0.y0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y0 = r1
            goto L_0x0018
        L_0x0013:
            aif r0 = new aif
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.w0
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
            wx3.H(r11)
            goto L_0x00b2
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            phf r9 = r0.Y
            nff r10 = r0.X
            gif r2 = r0.o
            wx3.H(r11)
            goto L_0x009c
        L_0x0041:
            dm0 r9 = r0.Z
            phf r10 = r0.Y
            nff r2 = r0.X
            gif r5 = r0.o
            wx3.H(r11)
            goto L_0x0083
        L_0x004d:
            wx3.H(r11)
            r57 r11 = r57.d
            r11.getClass()
            mff r2 = defpackage.nff.Companion
            l77 r2 = r2.serializer()
            java.lang.Object r10 = r11.a(r2, r10)
            nff r10 = (defpackage.nff) r10
            phf r11 = defpackage.phf.REQUEST_ACCESS
            dm0 r2 = new dm0
            java.lang.String r7 = r10.a
            java.lang.String r8 = r10.c
            r2.<init>(r7, r8)
            r0.o = r9
            r0.X = r10
            r0.Y = r11
            r0.Z = r2
            r0.y0 = r5
            us0 r5 = r9.g
            java.lang.Object r5 = r5.o(r2, r0)
            if (r5 != r1) goto L_0x007f
            return r1
        L_0x007f:
            r5 = r9
            r9 = r2
            r2 = r10
            r10 = r11
        L_0x0083:
            bif r11 = new bif
            r11.<init>(r2, r10, r5, r6)
            r0.o = r5
            r0.X = r2
            r0.Y = r10
            r0.Z = r6
            r0.y0 = r4
            java.lang.Object r11 = r9.c(r11, r0)
            if (r11 != r1) goto L_0x0099
            return r1
        L_0x0099:
            r9 = r10
            r10 = r2
            r2 = r5
        L_0x009c:
            e57 r11 = (defpackage.e57) r11
            cif r4 = new cif
            r4.<init>(r10, r9, r2, r6)
            r0.o = r6
            r0.X = r6
            r0.Y = r6
            r0.y0 = r3
            java.lang.Object r9 = r11.d(r4, r0)
            if (r9 != r1) goto L_0x00b2
            return r1
        L_0x00b2:
            jue r9 = jue.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gif.k(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ea A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0102 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0103 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.String r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof defpackage.dif
            if (r2 == 0) goto L_0x0018
            r2 = r1
            dif r2 = (defpackage.dif) r2
            int r3 = r2.z0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.z0 = r3
        L_0x0016:
            r8 = r2
            goto L_0x001e
        L_0x0018:
            dif r2 = new dif
            r2.<init>(r0, r1)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r1 = r8.x0
            pu3 r2 = pu3.a
            int r3 = r8.z0
            jue r9 = jue.a
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r10 = 0
            if (r3 == 0) goto L_0x0064
            if (r3 == r7) goto L_0x0060
            if (r3 == r6) goto L_0x004d
            if (r3 == r5) goto L_0x0042
            if (r3 != r4) goto L_0x003a
            wx3.H(r1)
            goto L_0x0103
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0042:
            phf r0 = r8.Y
            sif r3 = r8.X
            gif r5 = r8.o
            wx3.H(r1)
            goto L_0x00ed
        L_0x004d:
            hm0 r0 = r8.w0
            java.lang.String r3 = r8.Z
            phf r6 = r8.Y
            sif r7 = r8.X
            gif r11 = r8.o
            wx3.H(r1)
            r13 = r3
            r3 = r7
            r7 = r0
            r0 = r11
            goto L_0x00cc
        L_0x0060:
            wx3.H(r1)
            goto L_0x00ac
        L_0x0064:
            wx3.H(r1)
            r57 r1 = r57.d
            r1.getClass()
            rif r3 = defpackage.sif.Companion
            l77 r3 = r3.serializer()
            r11 = r19
            java.lang.Object r1 = r1.a(r3, r11)
            sif r1 = (defpackage.sif) r1
            phf r11 = defpackage.phf.UPDATE_TOKEN
            java.lang.String r3 = r1.d
            us0 r12 = r0.g
            if (r3 == 0) goto L_0x00ad
            int r13 = r3.length()
            if (r13 != 0) goto L_0x0089
            goto L_0x00ad
        L_0x0089:
            int r13 = r3.length()
            r14 = 1024(0x400, float:1.435E-42)
            if (r13 > r14) goto L_0x0092
            goto L_0x00ad
        L_0x0092:
            hhf r3 = new hhf
            r3.<init>()
            o57 r5 = f(r3)
            m53 r3 = r18.g()
            r8.z0 = r7
            java.lang.String r7 = r1.b
            r4 = r12
            r6 = r11
            java.lang.Object r0 = r3.a(r4, r5, r6, r7, r8)
            if (r0 != r2) goto L_0x00ac
            return r2
        L_0x00ac:
            return r9
        L_0x00ad:
            hm0 r7 = new hm0
            java.lang.String r13 = r1.a
            java.lang.String r14 = r1.c
            r7.<init>(r13, r3, r14)
            r8.o = r0
            r8.X = r1
            r8.Y = r11
            r8.Z = r3
            r8.w0 = r7
            r8.z0 = r6
            java.lang.Object r6 = r12.o(r7, r8)
            if (r6 != r2) goto L_0x00c9
            return r2
        L_0x00c9:
            r13 = r3
            r6 = r11
            r3 = r1
        L_0x00cc:
            eif r1 = new eif
            r17 = 0
            r12 = r1
            r14 = r3
            r15 = r0
            r16 = r6
            r12.<init>(r13, r14, r15, r16, r17)
            r8.o = r0
            r8.X = r3
            r8.Y = r6
            r8.Z = r10
            r8.w0 = r10
            r8.z0 = r5
            java.lang.Object r1 = r7.c(r1, r8)
            if (r1 != r2) goto L_0x00eb
            return r2
        L_0x00eb:
            r5 = r0
            r0 = r6
        L_0x00ed:
            e57 r1 = (defpackage.e57) r1
            fif r6 = new fif
            r6.<init>(r5, r0, r3, r10)
            r8.o = r10
            r8.X = r10
            r8.Y = r10
            r8.z0 = r4
            java.lang.Object r0 = r1.d(r6, r8)
            if (r0 != r2) goto L_0x0103
            return r2
        L_0x0103:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gif.l(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

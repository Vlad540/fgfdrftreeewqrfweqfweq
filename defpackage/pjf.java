package defpackage;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: pjf  reason: default package */
public final class pjf implements q57 {
    public final r57 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final bs e;
    public final us0 f;
    public jff g;

    public pjf(r57 r57, t97 t97, t97 t972, t97 t973) {
        this.a = r57;
        this.b = t97;
        this.c = t972;
        this.d = t973;
        pz4 pz4 = fjf.o;
        bs bsVar = new bs(0);
        pz4.getClass();
        u1 u1Var = new u1(0, pz4);
        while (u1Var.hasNext()) {
            ((fjf) u1Var.next()).getClass();
            bsVar.add("WebAppDownloadFile");
        }
        this.e = bsVar;
        this.f = xs7.a(0, 0, 7);
    }

    public static final o57 e(pjf pjf, Throwable th) {
        pjf.getClass();
        ejf ejf = th instanceof ejf ? (ejf) th : null;
        if (ejf instanceof cjf) {
            return new m57(new p57("download_failed", 1));
        }
        if (ejf instanceof djf) {
            return new m57(new p57("invalid_params", 2));
        }
        if (ejf instanceof bjf) {
            return new m57(new p57("denied_download_request", 3));
        }
        if (ejf == null) {
            return n57.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object f(defpackage.pjf r9, defpackage.sjf r10, kotlin.coroutines.Continuation r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof defpackage.hjf
            if (r0 == 0) goto L_0x0016
            r0 = r11
            hjf r0 = (defpackage.hjf) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x001b
        L_0x0016:
            hjf r0 = new hjf
            r0.<init>(r9, r11)
        L_0x001b:
            java.lang.Object r11 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0057
            if (r2 == r6) goto L_0x004d
            if (r2 == r5) goto L_0x0045
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            wx3.H(r11)
            goto L_0x00b4
        L_0x0035:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003d:
            sjf r9 = r0.X
            pjf r10 = r0.o
            wx3.H(r11)
            goto L_0x00a0
        L_0x0045:
            sjf r9 = r0.X
            pjf r10 = r0.o
            wx3.H(r11)
            goto L_0x008c
        L_0x004d:
            zif r9 = r0.Y
            sjf r10 = r0.X
            pjf r2 = r0.o
            wx3.H(r11)
            goto L_0x0076
        L_0x0057:
            wx3.H(r11)
            zif r11 = new zif
            java.lang.String r2 = r10.b
            java.lang.String r8 = r10.c
            r11.<init>(r2, r8)
            r0.o = r9
            r0.X = r10
            r0.Y = r11
            r0.x0 = r6
            us0 r2 = r9.f
            java.lang.Object r2 = r2.o(r11, r0)
            if (r2 != r1) goto L_0x0074
            goto L_0x00b6
        L_0x0074:
            r2 = r9
            r9 = r11
        L_0x0076:
            jjf r11 = new jjf
            r11.<init>(r2, r10, r7)
            r0.o = r2
            r0.X = r10
            r0.Y = r7
            r0.x0 = r5
            java.lang.Object r11 = r9.e(r11, r0)
            if (r11 != r1) goto L_0x008a
            goto L_0x00b6
        L_0x008a:
            r9 = r10
            r10 = r2
        L_0x008c:
            e57 r11 = (defpackage.e57) r11
            kjf r2 = new kjf
            r2.<init>(r10, r9, r7)
            r0.o = r10
            r0.X = r9
            r0.x0 = r4
            java.lang.Object r11 = r11.c(r2, r0)
            if (r11 != r1) goto L_0x00a0
            goto L_0x00b6
        L_0x00a0:
            e57 r11 = (defpackage.e57) r11
            ljf r2 = new ljf
            r2.<init>(r10, r9, r7)
            r0.o = r7
            r0.X = r7
            r0.x0 = r3
            java.lang.Object r9 = r11.d(r2, r0)
            if (r9 != r1) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            jue r1 = jue.a
        L_0x00b6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjf.f(pjf, sjf, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object a(String str, String str2, Continuation continuation) {
        Object obj;
        fjf.a.getClass();
        u1 it = fjf.o.iterator();
        while (true) {
            u1 u1Var = it;
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            ((fjf) obj).getClass();
            if ("WebAppDownloadFile".equals(str)) {
                break;
            }
        }
        fjf fjf = (fjf) obj;
        jue jue = jue.a;
        if (fjf == null) {
            udd.s(pjf.class.getName(), "Unknown method with name = " + str + " in JsDelegate: " + this, (Throwable) null);
            return jue;
        }
        vqc vqc = (vqc) ((xzc) this.d.getValue());
        vqc.getClass();
        if (!vqc.m(PmsKey.f50jsdownloaddelegate, false)) {
            return jue;
        }
        if (gjf.$EnumSwitchMapping$0[fjf.ordinal()] == 1) {
            Object g2 = g(str2, continuation);
            return g2 == pu3.a ? g2 : jue;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final us0 b() {
        return this.f;
    }

    public final Set c() {
        return this.e;
    }

    public final void d(jff jff) {
        this.g = jff;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.mjf
            if (r0 == 0) goto L_0x0013
            r0 = r9
            mjf r0 = (defpackage.mjf) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x0018
        L_0x0013:
            mjf r0 = new mjf
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            wx3.H(r9)
            goto L_0x00a1
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            sjf r7 = r0.X
            pjf r8 = r0.o
            wx3.H(r9)
            goto L_0x008d
        L_0x003f:
            ajf r7 = r0.Y
            sjf r8 = r0.X
            pjf r2 = r0.o
            wx3.H(r9)
            goto L_0x0077
        L_0x0049:
            wx3.H(r9)
            r57 r9 = r57.d
            r9.getClass()
            rjf r2 = defpackage.sjf.Companion
            l77 r2 = r2.serializer()
            java.lang.Object r8 = r9.a(r2, r8)
            sjf r8 = (defpackage.sjf) r8
            ajf r9 = new ajf
            java.lang.String r2 = r8.c
            r9.<init>(r2)
            r0.o = r7
            r0.X = r8
            r0.Y = r9
            r0.x0 = r5
            us0 r2 = r7.f
            java.lang.Object r2 = r2.o(r9, r0)
            if (r2 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r2 = r7
            r7 = r9
        L_0x0077:
            njf r9 = new njf
            r9.<init>(r2, r8, r6)
            r0.o = r2
            r0.X = r8
            r0.Y = r6
            r0.x0 = r4
            java.lang.Object r9 = r7.c(r9, r0)
            if (r9 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r7 = r8
            r8 = r2
        L_0x008d:
            e57 r9 = (defpackage.e57) r9
            ojf r2 = new ojf
            r2.<init>(r8, r7, r6)
            r0.o = r6
            r0.X = r6
            r0.x0 = r3
            java.lang.Object r7 = r9.d(r2, r0)
            if (r7 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            jue r7 = jue.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjf.g(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

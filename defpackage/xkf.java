package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: xkf  reason: default package */
public final class xkf implements q57 {
    public final r57 a;
    public final t97 b;
    public final t97 c;
    public final Set d;
    public final us0 e;
    public jff f;

    public xkf(r57 r57, t97 t97, t97 t972) {
        this.a = r57;
        this.b = t97;
        this.c = t972;
        pz4 pz4 = tkf.o;
        ArrayList arrayList = new ArrayList(q23.H(pz4, 10));
        u1 u1Var = new u1(0, pz4);
        while (u1Var.hasNext()) {
            ((tkf) u1Var.next()).getClass();
            arrayList.add("WebAppRequestPhone");
        }
        this.d = o23.w0(arrayList);
        this.e = xs7.a(0, 0, 7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        r2 = e(r4, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r3, java.lang.String r4, kotlin.coroutines.Continuation r5) {
        /*
            r2 = this;
            java.util.Set r0 = r2.d
            boolean r0 = r0.contains(r3)
            jue r1 = jue.a
            if (r0 != 0) goto L_0x002b
            java.lang.Class<xkf> r4 = defpackage.xkf.class
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown method with name = "
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r3 = " in JsDelegate: "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r3 = 0
            udd.s(r4, r2, r3)
            return r1
        L_0x002b:
            tkf r0 = defpackage.tkf.b
            java.lang.String r0 = "WebAppRequestPhone"
            boolean r3 = hhd.f(r3, r0)
            if (r3 == 0) goto L_0x003e
            java.lang.Object r2 = r2.e(r4, r5)
            pu3 r3 = pu3.a
            if (r2 != r3) goto L_0x003e
            return r2
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkf.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final us0 b() {
        return this.e;
    }

    public final Set c() {
        return this.d;
    }

    public final void d(jff jff) {
        ((m53) this.c.getValue()).c = jff;
        this.f = jff;
    }

    /* JADX WARNING: type inference failed for: r9v8, types: [e57, vac, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ukf
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ukf r0 = (defpackage.ukf) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x0018
        L_0x0013:
            ukf r0 = new ukf
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
            alf r7 = r0.X
            xkf r8 = r0.o
            wx3.H(r9)
            goto L_0x008d
        L_0x003f:
            vac r7 = r0.Y
            alf r8 = r0.X
            xkf r2 = r0.o
            wx3.H(r9)
            goto L_0x0075
        L_0x0049:
            wx3.H(r9)
            r57 r9 = r57.d
            r9.getClass()
            zkf r2 = defpackage.alf.Companion
            l77 r2 = r2.serializer()
            java.lang.Object r8 = r9.a(r2, r8)
            alf r8 = (defpackage.alf) r8
            vac r9 = new vac
            r9.<init>()
            r0.o = r7
            r0.X = r8
            r0.Y = r9
            r0.x0 = r5
            us0 r2 = r7.e
            java.lang.Object r2 = r2.o(r9, r0)
            if (r2 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r2 = r7
            r7 = r9
        L_0x0075:
            tkf r9 = defpackage.tkf.b
            vkf r9 = new vkf
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
            wkf r2 = new wkf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkf.e(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

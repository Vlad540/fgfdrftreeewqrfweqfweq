package defpackage;

/* renamed from: pna  reason: default package */
public final class pna implements zqd {
    public final String[] a;
    public final t97 b = rna.a.b();
    public final t97 c;
    public final mc9 o;

    public pna(String[] strArr) {
        this.a = strArr;
        t97 O = ez3.O(3, new qk8(22, this));
        this.c = O;
        mc9 mc9 = (mc9) O.getValue();
        this.o = (mc9) O.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(rj5 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ona
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ona r0 = (defpackage.ona) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            ona r0 = new ona
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 == r3) goto L_0x002b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002b:
            wx3.H(r6)
            goto L_0x0043
        L_0x002f:
            wx3.H(r6)
            t97 r4 = r4.c
            java.lang.Object r4 = r4.getValue()
            mc9 r4 = (mc9) r4
            r0.Y = r3
            java.lang.Object r4 = r4.c(r5, r0)
            if (r4 != r1) goto L_0x0043
            return r1
        L_0x0043:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pna.c(rj5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e() {
        ((mc9) this.c.getValue()).setValue(((qna) this.b.getValue()).b(this.a) ? nna.a : nna.b);
    }

    public final Object getValue() {
        return (nna) this.o.getValue();
    }

    public final boolean h() {
        return ((nna) this.o.getValue()) == nna.a;
    }
}

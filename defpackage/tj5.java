package defpackage;

/* renamed from: tj5  reason: default package */
public final class tj5 implements pj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tj5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.rj5 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L_0x00d2;
                case 1: goto L_0x007a;
                case 2: goto L_0x0013;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r6.b
            java.lang.Object r6 = r7.a(r6, r8)
            pu3 r7 = defpackage.pu3.a
            if (r6 != r7) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            jue r6 = defpackage.jue.a
        L_0x0012:
            return r6
        L_0x0013:
            boolean r0 = r8 instanceof defpackage.uk5
            if (r0 == 0) goto L_0x0026
            r0 = r8
            uk5 r0 = (defpackage.uk5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0026
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x002b
        L_0x0026:
            uk5 r0 = new uk5
            r0.<init>(r6, r8)
        L_0x002b:
            java.lang.Object r8 = r0.o
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 != r3) goto L_0x0043
            int r6 = r0.y0
            int r7 = r0.x0
            rj5 r2 = r0.w0
            tj5 r4 = r0.Z
            defpackage.wx3.H(r8)
            r8 = r2
            goto L_0x0073
        L_0x0043:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x004b:
            defpackage.wx3.H(r8)
            java.lang.Object r8 = r6.b
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            int r8 = r8.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L_0x0058:
            if (r2 >= r6) goto L_0x0077
            java.lang.Object r4 = r7.b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r4 = r4[r2]
            r0.Z = r7
            r0.w0 = r8
            r0.x0 = r2
            r0.y0 = r6
            r0.X = r3
            java.lang.Object r4 = r8.a(r4, r0)
            if (r4 != r1) goto L_0x0071
            goto L_0x0079
        L_0x0071:
            r4 = r7
            r7 = r2
        L_0x0073:
            int r2 = r7 + 1
            r7 = r4
            goto L_0x0058
        L_0x0077:
            jue r1 = defpackage.jue.a
        L_0x0079:
            return r1
        L_0x007a:
            boolean r0 = r8 instanceof defpackage.tk5
            if (r0 == 0) goto L_0x008d
            r0 = r8
            tk5 r0 = (defpackage.tk5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x008d
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x0092
        L_0x008d:
            tk5 r0 = new tk5
            r0.<init>(r6, r8)
        L_0x0092:
            java.lang.Object r8 = r0.o
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x00ad
            if (r2 != r3) goto L_0x00a5
            java.util.Iterator r6 = r0.w0
            rj5 r7 = r0.Z
            defpackage.wx3.H(r8)
            goto L_0x00b8
        L_0x00a5:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x00ad:
            defpackage.wx3.H(r8)
            java.lang.Object r6 = r6.b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x00b8:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00cf
            java.lang.Object r8 = r6.next()
            r0.Z = r7
            r0.w0 = r6
            r0.X = r3
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L_0x00b8
            goto L_0x00d1
        L_0x00cf:
            jue r1 = defpackage.jue.a
        L_0x00d1:
            return r1
        L_0x00d2:
            uj5 r0 = new uj5
            java.lang.Object r6 = r6.b
            k26 r6 = (defpackage.k26) r6
            r1 = 0
            r0.<init>(r6, r7, r1)
            sj5 r6 = new sj5
            hu3 r7 = r8.getContext()
            r6.<init>(r7, r8)
            java.lang.Object r6 = defpackage.h2g.D(r6, r6, r0)
            pu3 r7 = defpackage.pu3.a
            if (r6 != r7) goto L_0x00ee
            goto L_0x00f0
        L_0x00ee:
            jue r6 = defpackage.jue.a
        L_0x00f0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj5.c(rj5, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

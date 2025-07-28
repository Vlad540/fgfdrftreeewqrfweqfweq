package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: e2b  reason: default package */
public final class e2b extends l5e implements i26 {
    public f2b X;
    public Context Y;
    public Iterator Z;
    public Map.Entry w0;
    public int x0;
    public final /* synthetic */ f2b y0;
    public final /* synthetic */ Context z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e2b(f2b f2b, Context context, Continuation continuation) {
        super(2, continuation);
        this.y0 = f2b;
        this.z0 = context;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new e2b(this.y0, this.z0, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            pu3 r0 = pu3.a
            int r1 = r9.x0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 != r3) goto L_0x0016
            java.util.Map$Entry r1 = r9.w0
            java.util.Iterator r4 = r9.Z
            android.content.Context r5 = r9.Y
            f2b r6 = r9.X
            wx3.H(r10)
            goto L_0x0079
        L_0x0016:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x001e:
            wx3.H(r10)
            java.lang.String r10 = "Prefetch chat themes."
            java.lang.String r1 = "PrefetchThemeBackgroundUseCase"
            udd.q(r1, r10)
            f2b r10 = r9.y0
            java.lang.Object r1 = r10.b
            r7e r1 = (r7e) r1
            java.lang.Object r1 = r1.getValue()
            pd0 r1 = (defpackage.pd0) r1
            r1.getClass()
            android.content.Context r1 = r9.z0
            java.util.LinkedHashMap r4 = defpackage.pd0.b(r1, r2)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r6 = r10
            r5 = r1
        L_0x0047:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0098
            java.lang.Object r10 = r4.next()
            r1 = r10
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r10 = r1.getValue()
            e0f r10 = (defpackage.e0f) r10
            d0f r10 = r10.a
            if (r10 == 0) goto L_0x007c
            java.lang.Object r7 = r6.b
            r7e r7 = (r7e) r7
            java.lang.Object r7 = r7.getValue()
            pd0 r7 = (defpackage.pd0) r7
            r9.X = r6
            r9.Y = r5
            r9.Z = r4
            r9.w0 = r1
            r9.x0 = r3
            java.lang.Object r10 = r7.c(r5, r10, r9)
            if (r10 != r0) goto L_0x0079
            return r0
        L_0x0079:
            p6e r10 = (defpackage.p6e) r10
            goto L_0x007d
        L_0x007c:
            r10 = r2
        L_0x007d:
            rhe r7 = new rhe
            java.lang.Object r8 = r1.getValue()
            e0f r8 = (defpackage.e0f) r8
            qhe r10 = ez3.g0(r8, r10)
            r7.<init>(r10)
            android.util.LruCache r10 = defpackage.nhe.a
            java.lang.Object r10 = r1.getKey()
            ud0 r10 = (defpackage.ud0) r10
            defpackage.nhe.a(r10, r7)
            goto L_0x0047
        L_0x0098:
            jue r9 = jue.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e2b.o(java.lang.Object):java.lang.Object");
    }
}

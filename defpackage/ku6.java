package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: ku6  reason: default package */
public final class ku6 extends l5e implements i26 {
    public final /* synthetic */ bv6 A0;
    public final /* synthetic */ int B0;
    public final /* synthetic */ int C0;
    public final /* synthetic */ boolean D0;
    public ArrayList X;
    public ArrayList Y;
    public ArrayList Z;
    public int w0;
    public /* synthetic */ Object x0;
    public final /* synthetic */ n46 y0;
    public final /* synthetic */ dde z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ku6(n46 n46, dde dde, bv6 bv6, int i, int i2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.y0 = n46;
        this.z0 = dde;
        this.A0 = bv6;
        this.B0 = i;
        this.C0 = i2;
        this.D0 = z;
    }

    public static final void r(ou3 ou3, bv6 bv6, dde dde, boolean z) {
        qod qod;
        lp.m(ou3.getCoroutineContext());
        if (z && (qod = bv6.G0) != null && qod.isActive()) {
            throw new o83("content change", 3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = r1.G0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean s(ou3 r0, defpackage.bv6 r1, defpackage.dde r2, boolean r3) {
        /*
            r(r0, r1, r2, r3)
            if (r3 == 0) goto L_0x0019
            boolean r0 = n1g.A(r0)
            if (r0 == 0) goto L_0x0017
            qod r0 = r1.G0
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.isActive()
            if (r0 != 0) goto L_0x0017
        L_0x0015:
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            return r0
        L_0x0019:
            boolean r0 = n1g.A(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku6.s(ou3, bv6, dde, boolean):boolean");
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ku6 ku6 = new ku6(this.y0, this.z0, this.A0, this.B0, this.C0, this.D0, continuation);
        ku6.x0 = obj;
        return ku6;
    }

    public final Object o(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z;
        ou3 ou3;
        Throwable th;
        pu3 pu3 = pu3.a;
        int i = this.w0;
        boolean z2 = this.D0;
        bv6 bv6 = this.A0;
        dde dde = this.z0;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou32 = (ou3) this.x0;
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            n46 n46 = this.y0;
            for (h46 h46 : n46.d()) {
                ContentResolver contentResolver = bv6.o;
                fu6 fu6 = r6;
                pu3 pu32 = pu3;
                ContentResolver contentResolver2 = contentResolver;
                h46 h462 = h46;
                boolean z3 = z2;
                n46 n462 = n46;
                ArrayList arrayList6 = arrayList5;
                ArrayList arrayList7 = arrayList4;
                fu6 fu62 = new fu6(h46, arrayList4, arrayList5, this.D0, ou32, bv6, this.z0);
                Uri i2 = h462.i();
                h46 h463 = h462;
                String e = n462.e(h463);
                String[] a = n462.a(h463);
                String g = hr1.g(h463.d(), " DESC");
                Bundle bundle = new Bundle();
                int i3 = this.B0;
                if (i3 != -1) {
                    bundle.putInt("android:query-arg-limit", i3);
                }
                int i4 = this.C0;
                if (i4 != -1) {
                    bundle.putInt("android:query-arg-offset", i4);
                }
                if (g != null) {
                    bundle.putStringArray("android:query-arg-sort-columns", new String[]{g});
                }
                if (e != null) {
                    bundle.putString("android:query-arg-sql-selection", e);
                }
                if (a != null) {
                    bundle.putStringArray("android:query-arg-sql-selection-args", a);
                }
                Cursor query = contentResolver2.query(i2, h463.d, bundle, (CancellationSignal) null);
                if (query != null) {
                    try {
                        fu6.invoke(query);
                        urd.l(query, (Throwable) null);
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        urd.l(query, th);
                        throw th3;
                    }
                }
                n46 = n462;
                pu3 = pu32;
                z2 = z3;
                arrayList5 = arrayList6;
                arrayList4 = arrayList7;
            }
            pu3 pu33 = pu3;
            boolean z4 = z2;
            ArrayList arrayList8 = arrayList5;
            ArrayList arrayList9 = arrayList4;
            if (!arrayList8.isEmpty() || !arrayList9.isEmpty()) {
                z = z4;
                if (s(ou32, bv6, dde, z)) {
                    arrayList8.size();
                    arrayList9.size();
                    arrayList3 = new ArrayList(arrayList9.size() + arrayList8.size());
                    arrayList2 = arrayList8;
                    arrayList3.addAll(arrayList2);
                    arrayList = arrayList9;
                    arrayList3.addAll(arrayList);
                    g37 E = xs7.E(ou32, bv6.c.b(), (ru3) null, new hu6(arrayList3, (Continuation) null), 2);
                    n3a n3a = bv6.c;
                    g37[] g37Arr = {E, xs7.E(ou32, n3a.b(), (ru3) null, new iu6(arrayList2, (Continuation) null), 2), xs7.E(ou32, n3a.b(), (ru3) null, new ju6(arrayList, (Continuation) null), 2)};
                    this.x0 = ou32;
                    this.X = arrayList;
                    this.Y = arrayList2;
                    this.Z = arrayList3;
                    this.w0 = 1;
                    pu3 pu34 = pu33;
                    if (lp.w(g37Arr, this) == pu34) {
                        return pu34;
                    }
                    ou3 = ou32;
                }
            }
            dde.getClass();
            hw4 hw4 = hw4.a;
            return new cu6(hw4, hw4, hw4);
        } else if (i == 1) {
            ArrayList arrayList10 = this.Z;
            ArrayList arrayList11 = this.Y;
            ArrayList arrayList12 = this.X;
            ou3 = (ou3) this.x0;
            wx3.H(obj);
            ArrayList arrayList13 = arrayList11;
            arrayList3 = arrayList10;
            z = z2;
            arrayList = arrayList12;
            arrayList2 = arrayList13;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dde.getClass();
        r(ou3, bv6, dde, z);
        return new cu6(arrayList3, arrayList, arrayList2);
    }
}

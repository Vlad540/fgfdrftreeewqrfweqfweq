package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: wta  reason: default package */
public final class wta extends taf {
    public static final /* synthetic */ k77[] Y;
    public final e3 X = hwf.t();
    public final t0c b;
    public final fp3 c;
    public final grd o = hrd.a((Object) null);

    static {
        hc9 hc9 = new hc9(wta.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        Y = new k77[]{hc9};
    }

    public wta(ok3 ok3, t97 t97, t97 t972) {
        w09 w09 = new w09(ok3.a(), this, 4);
        hw4 hw4 = hw4.a;
        this.b = ez3.d0(w09, this.a, ucd.a, hw4);
        fp3 fp3 = new fp3(this.a, ok3.a(), (ud) null, t97, t972);
        this.c = fp3;
        ok3.b();
        ez3.N(new ck5(fp3.i, new tta(this, (Continuation) null), 5), this.a);
    }

    public static final List q(wta wta, bk3 bk3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        bk3 bk32 = bk3;
        wta.getClass();
        if (bk3.b()) {
            return hw4.a;
        }
        lg7 c2 = hwf.c();
        List<lk3> list = bk32.a;
        if (list != null) {
            arrayList = new ArrayList(q23.H(list, 10));
            for (lk3 lk3 : list) {
                long j = lk3.a;
                CharSequence charSequence = lk3.X;
                mge lge = charSequence != null ? new lge(charSequence) : null;
                ira ira = r7;
                ira ira2 = new ira(j, j, lk3.b, lge, lk3.Z, false, lk3.x0, new zta(j, yta.b), lk3.y0, true);
                arrayList.add(ira);
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            c2.addAll(arrayList);
        }
        List<lk3> list2 = bk32.c;
        if (list2 != null) {
            arrayList2 = new ArrayList(q23.H(list2, 10));
            for (lk3 lk32 : list2) {
                long j2 = lk32.a;
                CharSequence charSequence2 = lk32.X;
                ira ira3 = r4;
                ira ira4 = new ira(j2, j2, lk32.b, charSequence2 != null ? new lge(charSequence2) : null, lk32.Z, false, lk32.x0, new zta(j2, yta.c), lk32.y0, true);
                arrayList2.add(ira3);
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            c2.addAll(arrayList2);
        }
        return hwf.a(c2);
    }
}

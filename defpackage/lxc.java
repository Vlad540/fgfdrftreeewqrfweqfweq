package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: lxc  reason: default package */
public final /* synthetic */ class lxc implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lxc(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                eu0 eu0 = (eu0) this.c;
                urd.J((uw6) obj, (String) this.b, eu0.a, eu0.b, true);
                return jue.a;
            case 1:
                b1d b1d = (b1d) this.b;
                j7c j7c = (j7c) this.c;
                List list = (List) obj;
                if (!list.isEmpty()) {
                    pk a2 = b1d.a();
                    boolean z2 = b1d.b;
                    gy9 gy9 = (gy9) a2;
                    gy9.getClass();
                    if (!list.isEmpty()) {
                        ArrayList x0 = o23.x0(list, 100, 100);
                        int size = x0.size();
                        long[] jArr = new long[size];
                        for (int i = 0; i < size; i++) {
                            jArr[i] = gy9.v(gy9, new an7(((j2b) gy9.z()).a.n(), (List) x0.get(i), false, z2));
                        }
                    }
                    j7c.a = list.size() + j7c.a;
                    String str = b1d.o;
                    fn6 fn6 = udd.e;
                    if (fn6 != null && fn6.c()) {
                        fn6.d(tn7.X, str, wn6.h(list.size(), "sending events entries count="), (Throwable) null);
                    }
                }
                return jue.a;
            case 2:
                String str2 = (String) obj;
                ve5 ve5 = new ve5((String) this.b);
                qcd qcd = (qcd) this.c;
                return new x97(qcd.a, ve5, qcd.c, (e3) null);
            case 3:
                tf3 tf3 = (tf3) obj;
                int ordinal = ((fkd) this.b).b.ordinal();
                boolean z3 = true;
                if (ordinal != 0 && ordinal == 1) {
                    z3 = ((i22) this.c).C(tf3.n());
                }
                return Boolean.valueOf(z3);
            case 4:
                tf3 tf32 = (tf3) obj;
                if (((Set) this.b).contains(Long.valueOf(tf32.n()))) {
                    if (!tf32.t()) {
                        ((pb5) this.c).getClass();
                    }
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                bh2 bh2 = (bh2) obj;
                uj3 uj3 = bh2.a;
                String c2 = ehe.c(uj3.A0);
                ArrayList arrayList = new ArrayList();
                List list2 = bh2.a.X;
                kd8 kd8 = (kd8) this.c;
                kd8.getClass();
                kd8.n(arrayList, list2);
                return ((f2b) kd8.b).f(uj3.a, arrayList, c2, (String) this.b, uj3.d(fj0.c), fu7.l(bh2.b), ((ywc) ((t97) kd8.X).getValue()).a(uj3.a));
            case 6:
                String str3 = (String) obj;
                if (((SharedPreferences) ((t97) ((ul7) this.c).b).getValue()).getString((String) this.b, (String) null) == null) {
                    return null;
                }
                throw new Error("An operation is not implemented: Указать тут задачу  с кастомными темами");
            case 7:
                return new ase(obj, (u16) this.b, (u16) this.c);
            default:
                urd.O((m00) obj, (g10) this.b, ((lqc) ((f03) ((nve) this.c).c.getValue())).m());
                return jue.a;
        }
    }

    public /* synthetic */ lxc(Object obj, String str, int i) {
        this.a = i;
        this.c = obj;
        this.b = str;
    }
}

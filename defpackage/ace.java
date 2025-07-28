package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* renamed from: ace  reason: default package */
public final /* synthetic */ class ace implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ace(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                vl9 vl9 = (vl9) ((szc) ((bce) obj2).i.getValue()).l.get();
                tl9 tl9 = (tl9) obj;
                ((j2b) vl9.a()).a.k("user.draftsLastSync", Long.valueOf(tl9.X));
                if (!((j2b) vl9.a()).b.s()) {
                    udd.q(vl9.e, "onNotifDraft: Drafts sync disabled");
                    return;
                }
                k77 k77 = vl9.d[2];
                ((ck4) vl9.c.get()).a(Long.valueOf(tl9.c), Long.valueOf(tl9.o), tl9.Y);
                return;
            case 1:
                sl9 sl9 = (sl9) ((szc) ((bce) obj2).i.getValue()).a.get();
                sl9.getClass();
                StringBuilder sb = new StringBuilder("onNotifDebug, response = ");
                q14 q14 = (q14) obj;
                sb.append(q14);
                udd.q(sl9.e, sb.toString());
                ii5 ii5 = q14.c;
                if (hhd.f(ii5, ii5.f)) {
                    sl9.a.c(new Exception("onNotifDebug"), true);
                    return;
                } else if (hhd.f(ii5, ii5.g)) {
                    k77[] k77Arr = sl9.d;
                    k77 k772 = k77Arr[0];
                    ((hz3) ((a04) sl9.b.get())).e.a();
                    k77 k773 = k77Arr[1];
                    ((voa) ((noa) sl9.c.get())).c();
                    return;
                } else {
                    return;
                }
            case 2:
                ep1 ep1 = (so1) ((bce) obj2).n.getValue();
                xs7.E(ep1.a, ((pae) ep1.r.getValue()).c().getImmediate(), (ru3) null, new ap1((df1) obj, ep1, (Continuation) null), 2);
                return;
            case 3:
                om9 om9 = (om9) ((szc) ((bce) obj2).i.getValue()).g.get();
                om9.getClass();
                nm9 nm9 = (nm9) obj;
                udd.p(om9.d, "onNotifMsgDeleteRange: %s", new Object[]{nm9});
                k77[] k77Arr2 = om9.c;
                k77 k774 = k77Arr2[0];
                nj4 nj4 = om9.a;
                ((t52) nj4.get()).c0(Collections.singletonList(nm9.c));
                k77 k775 = k77Arr2[0];
                i22 y = ((t52) nj4.get()).y(nm9.c.a);
                if (y != null) {
                    k77 k776 = k77Arr2[1];
                    ((to8) om9.b.get()).b(y.a, nm9.o, nm9.X);
                    k77 k777 = k77Arr2[0];
                    ((t52) nj4.get()).v(y.a);
                    return;
                }
                return;
            case 4:
                km9 km9 = (km9) ((szc) ((bce) obj2).i.getValue()).n.get();
                km9.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder("got ");
                fm9 fm9 = (fm9) obj;
                sb2.append(fm9);
                udd.q("km9", sb2.toString());
                xs7.E(km9.g, (hu3) null, (ru3) null, new im9(currentTimeMillis, fm9, km9, (Continuation) null), 3);
                return;
            case 5:
                ewe ewe = (ewe) obj2;
                ewe.getClass();
                StringBuilder sb3 = new StringBuilder("onDisposeUpload: data=");
                fwe fwe = (fwe) obj;
                sb3.append(fwe);
                udd.n("ewe", sb3.toString());
                ewe.c(fwe);
                return;
            default:
                j3f j3f = (j3f) obj2;
                j3f.getClass();
                a3f a3f = (a3f) obj;
                udd.p("j3f", "onDispose: conversionData = %s", new Object[]{a3f});
                j3f.a(a3f);
                return;
        }
    }
}

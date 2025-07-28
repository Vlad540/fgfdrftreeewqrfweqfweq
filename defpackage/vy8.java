package defpackage;

import java.util.EnumSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: vy8  reason: default package */
public final class vy8 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ zz8 Z;
    public final /* synthetic */ List w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vy8(zz8 zz8, List list, Continuation continuation) {
        super(2, continuation);
        this.Z = zz8;
        this.w0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vy8 vy8 = new vy8(this.Z, this.w0, continuation);
        vy8.Y = obj;
        return vy8;
    }

    public final Object o(Object obj) {
        String[] strArr;
        j63 j63;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Y;
            EnumSet<E> noneOf = EnumSet.noneOf(j63.class);
            k77[] k77Arr = zz8.I1;
            zz8 zz8 = this.Z;
            vqc vqc = (vqc) ((xzc) zz8.I0.getValue());
            vqc.getClass();
            List g = vqc.g(PmsKey.f6availablecomplaints.name(), (List) null);
            if (g == null || (strArr = (String[]) g.toArray(new String[0])) == null) {
                strArr = new String[0];
            }
            for (String a : strArr) {
                try {
                    j63 = j63.a(a);
                } catch (Throwable th) {
                    j63 = new kcc(th);
                }
                if (j63 instanceof kcc) {
                    j63 = null;
                }
                j63 j632 = j63;
                if (j632 != null) {
                    noneOf.add(j632);
                }
            }
            if (!noneOf.isEmpty()) {
                kc3 kc3 = an8.a;
                hge hge = new hge(c7a.x);
                hge hge2 = new hge(c7a.w);
                lg7 c = hwf.c();
                if (noneOf.contains(j63.SPAM)) {
                    c.add(new kc3(a7a.k, new hge(c7a.C), 3, false));
                }
                if (noneOf.contains(j63.PORNO)) {
                    c.add(new kc3(a7a.j, new hge(c7a.B), 3, false));
                }
                if (noneOf.contains(j63.FAKE)) {
                    c.add(new kc3(a7a.h, new hge(c7a.z), 3, false));
                }
                if (noneOf.contains(j63.EXTREMISM)) {
                    c.add(new kc3(a7a.g, new hge(c7a.y), 3, false));
                }
                if (noneOf.contains(j63.THREAT)) {
                    c.add(new kc3(a7a.l, new hge(c7a.D), 3, false));
                }
                if (noneOf.contains(j63.OTHER)) {
                    c.add(new kc3(a7a.i, new hge(c7a.A), 3, false));
                }
                c.add(an8.a);
                taf.o(zz8.y1, new ded(this.w0, hge, hge2, hwf.a(c)));
            } else {
                zr7 c2 = zz8.Y.c();
                uy8 uy8 = new uy8(zz8, (Continuation) null);
                this.X = 1;
                if (xs7.U(c2, uy8, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}

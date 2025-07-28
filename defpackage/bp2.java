package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: bp2  reason: default package */
public final class bp2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ gp2 Y;
    public final /* synthetic */ t97 Z;
    public final /* synthetic */ t97 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bp2(gp2 gp2, t97 t97, t97 t972, Continuation continuation) {
        super(2, continuation);
        this.Y = gp2;
        this.Z = t97;
        this.w0 = t972;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((vv3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bp2 bp2 = new bp2(this.Y, this.Z, this.w0, continuation);
        bp2.X = obj;
        return bp2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        vv3 vv3 = (vv3) this.X;
        boolean z = vv3 instanceof tv3;
        jue jue = jue.a;
        gp2 gp2 = this.Y;
        if (z) {
            if (((tv3) vv3).a != gp2.G0.get()) {
                return jue;
            }
            taf.o(gp2.F0, yo2.a);
        } else if (vv3 instanceof uv3) {
            uv3 uv3 = (uv3) vv3;
            if (uv3.a != gp2.G0.get()) {
                return jue;
            }
            qod n = taf.n(gp2, ((pae) this.Z.getValue()).b(), (ru3) null, new ap2(gp2, vv3, (Continuation) null), 2);
            gp2.I0.o1(gp2, gp2.M0[1], n);
            kb5 kb5 = (kb5) ((jb5) this.w0.getValue());
            kb5.getClass();
            boolean m = kb5.m(PmsKey.f30editchanneltypescreenenabled, false);
            long j = uv3.b;
            l05 l05 = gp2.E0;
            if (m) {
                taf.o(l05, new mo2(j));
            } else {
                taf.o(l05, new lo2(j));
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue;
    }
}

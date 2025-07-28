package defpackage;

import java.util.Collections;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: yz8  reason: default package */
public final class yz8 extends l5e implements i26 {
    public ryb X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ i22 w0;
    public final /* synthetic */ zz8 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yz8(i22 i22, zz8 zz8, Continuation continuation) {
        super(2, continuation);
        this.w0 = i22;
        this.x0 = zz8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yz8 yz8 = new yz8(this.w0, this.x0, continuation);
        yz8.Z = obj;
        return yz8;
    }

    public final Object o(Object obj) {
        ryb ryb;
        Object obj2;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Z;
            i22 i22 = this.w0;
            if (i22.C0 == null) {
                go2 go2 = i22.F0;
                String str = i22.b.m0;
                go2.getClass();
                i22.C0 = r1g.p(str) ? null : ((zr8) go2.f.get()).b(str);
            }
            ryb ryb2 = i22.C0;
            if (ryb2 == null) {
                return jue;
            }
            s86 s86 = this.x0.y0;
            i22 i222 = this.w0;
            long j = i222.a;
            long j2 = i222.b.l0;
            this.Z = ou3;
            this.X = ryb2;
            this.Y = 1;
            obj2 = xs7.U(((pae) s86.a).b(), new r86(s86, j, j2, (Continuation) null), this);
            if (obj2 == pu3) {
                return pu3;
            }
            ryb = ryb2;
        } else if (i == 1) {
            ryb ryb3 = this.X;
            ou3 ou32 = (ou3) this.Z;
            wx3.H(obj);
            obj2 = obj;
            ryb = ryb3;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vo8 vo8 = (vo8) obj2;
        if (vo8 == null) {
            String str2 = this.x0.F0;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.w0, str2, "Chat model has reaction info, but can't find message for this reaction", (Throwable) null);
            }
            return jue;
        }
        Set singleton = Collections.singleton(ryb);
        zz8 zz8 = this.x0;
        long j3 = vo8.b;
        k77[] k77Arr = zz8.I1;
        zz8.getClass();
        if (!singleton.isEmpty()) {
            ryb ryb4 = (ryb) o23.U(singleton);
            ph g = ((gj) zz8.c1.getValue()).g(ryb4.a.toString());
            String str3 = g != null ? g.d : null;
            if (str3 != null) {
                taf.o(zz8.y1, new ba(j3, ryb4, str3));
            }
        }
        grd grd = this.x0.v1;
        grd.m((Object) null, jpc.a((jpc) grd.getValue(), 0, false, false, new ipc(this.w0.b.l0, vo8.k(), ryb), 7));
        return jue;
    }
}

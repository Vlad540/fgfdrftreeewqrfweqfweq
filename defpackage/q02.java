package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: q02  reason: default package */
public class q02 extends p02 {
    public final Object X;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q02(Object obj, hu3 hu3, int i, int i2, int i3) {
        super(hu3, i, i2);
        this.o = i3;
        this.X = obj;
    }

    public Object h(d5b d5b, Continuation continuation) {
        switch (this.o) {
            case 0:
                Object invoke = ((i26) this.X).invoke(d5b, continuation);
                return invoke == pu3.a ? invoke : jue.a;
            default:
                ayc ayc = new ayc(d5b);
                for (pj5 c12 : (Iterable) this.X) {
                    xs7.E(d5b, (hu3) null, (ru3) null, new c12(c12, ayc, (Continuation) null), 3);
                }
                return jue.a;
        }
    }

    public p02 j(hu3 hu3, int i, int i2) {
        switch (this.o) {
            case 0:
                return new q02((i26) this.X, hu3, i, i2, 0);
            default:
                return new q02((Iterable) this.X, hu3, i, i2, 1);
        }
    }

    public n1c l(ou3 ou3) {
        switch (this.o) {
            case 1:
                o02 o02 = new o02(this, (Continuation) null);
                ru3 ru3 = ru3.a;
                a5b a5b = new a5b(xie.x(ou3, this.a), xs7.a(this.b, 1, 4));
                a5b.start(ru3, a5b, o02);
                return a5b;
            default:
                return super.l(ou3);
        }
    }

    public String toString() {
        switch (this.o) {
            case 0:
                return "block[" + ((i26) this.X) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }
}

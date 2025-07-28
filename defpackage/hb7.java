package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hb7  reason: default package */
public final /* synthetic */ class hb7 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ga0 b;

    public /* synthetic */ hb7(ga0 ga0, int i) {
        this.a = i;
        this.b = ga0;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((iz2) ((t97) this.b.d).getValue()).a();
                return jue.a;
            case 1:
                ((iz2) ((t97) this.b.d).getValue()).a();
                return jue.a;
            case 2:
                xs7.E(ha6.a, ((pae) y93.i.getValue()).b(), (ru3) null, new jb7(this.b, (Continuation) null), 2);
                return jue.a;
            default:
                xs7.E(ha6.a, ((pae) y93.i.getValue()).b(), (ru3) null, new kb7(this.b, (Continuation) null), 2);
                return jue.a;
        }
    }
}

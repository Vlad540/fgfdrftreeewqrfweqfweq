package defpackage;

import java.io.File;
import java.io.Serializable;

/* renamed from: u95  reason: default package */
public final /* synthetic */ class u95 implements q3e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u95(Object obj, Serializable serializable, int i) {
        this.a = i;
        this.c = obj;
        this.b = serializable;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                w95 w95 = (w95) this.c;
                w95.getClass();
                return w95.a(new rz3(w95, 3, (long[]) this.b));
            case 1:
                aa5 aa5 = (aa5) this.c;
                aa5.getClass();
                sid sid = new sid();
                aa5.f.put(Long.valueOf(((gy9) aa5.a).f(4, (long[]) this.b)), sid);
                return sid;
            default:
                tae tae = (tae) this.c;
                fce fce = (fce) tae.b.getValue();
                ((j2b) ((g2b) tae.c.getValue())).b.getClass();
                qmc b2 = ((nbe) ((mbe) tae.X.getValue())).b();
                fce.getClass();
                return new zl6(fce.a, (File) this.b, b2);
        }
    }
}

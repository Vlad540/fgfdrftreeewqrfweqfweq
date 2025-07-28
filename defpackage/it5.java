package defpackage;

import java.util.List;

/* renamed from: it5  reason: default package */
public final /* synthetic */ class it5 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a30 b;
    public final /* synthetic */ hda c;

    public /* synthetic */ it5(a30 a30, hda hda, int i) {
        this.a = i;
        this.b = a30;
        this.c = hda;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                a30 a30 = this.b;
                List list = (List) a30.w0;
                if (list != null) {
                    this.c.k();
                    ((mu) a30.x0).b(list, (Runnable) null);
                }
                a30.w0 = null;
                return jue.a;
            default:
                a30 a302 = this.b;
                jt5 jt5 = (jt5) a302.c;
                if (jt5 != null) {
                    this.c.l(jt5);
                }
                a302.c = null;
                a302.o = null;
                mu muVar = (mu) a302.x0;
                a302.w0 = muVar.f;
                muVar.b((List) null, (Runnable) null);
                return jue.a;
        }
    }
}

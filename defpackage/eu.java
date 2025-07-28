package defpackage;

import ru.ok.tamtam.util.HandledException;

/* renamed from: eu  reason: default package */
public final /* synthetic */ class eu implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc2 b;

    public /* synthetic */ eu(vc2 vc2, int i) {
        this.a = i;
        this.b = vc2;
    }

    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                this.b.x0.c();
                return;
            case 1:
                vc2 vc2 = this.b;
                udd.s(vc2.a, "loadPrev: exception", th);
                vc2.Y.a(new HandledException(th));
                return;
            case 2:
                this.b.w0.c();
                return;
            default:
                vc2 vc22 = this.b;
                udd.s(vc22.a, "load: exception", th);
                vc22.Y.a(new HandledException(th));
                return;
        }
    }
}

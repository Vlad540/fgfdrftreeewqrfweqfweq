package defpackage;

import java.util.concurrent.Callable;

/* renamed from: wff  reason: default package */
public final class wff implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ahf b;
    public final /* synthetic */ xff c;

    public /* synthetic */ wff(xff xff, ahf ahf, int i) {
        this.a = i;
        this.c = xff;
        this.b = ahf;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                xff xff = this.c;
                aec aec = xff.a;
                aec.c();
                try {
                    xff.b.C(this.b);
                    aec.r();
                    aec.l();
                    return jue.a;
                } catch (Throwable th) {
                    aec.l();
                    throw th;
                }
            default:
                xff xff2 = this.c;
                aec aec2 = xff2.a;
                aec2.c();
                try {
                    xff2.c.B(this.b);
                    aec2.r();
                    aec2.l();
                    return jue.a;
                } catch (Throwable th2) {
                    aec2.l();
                    throw th2;
                }
        }
    }
}

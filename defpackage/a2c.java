package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: a2c  reason: default package */
public final class a2c implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ b2c c;

    public /* synthetic */ a2c(b2c b2c, List list, int i) {
        this.a = i;
        this.c = b2c;
        this.b = list;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                b2c b2c = this.c;
                aec aec = b2c.a;
                aec.c();
                try {
                    b2c.b.B(this.b);
                    aec.r();
                    aec.l();
                    return null;
                } catch (Throwable th) {
                    aec.l();
                    throw th;
                }
            default:
                b2c b2c2 = this.c;
                aec aec2 = b2c2.a;
                aec2.c();
                try {
                    b2c2.c.C(this.b);
                    aec2.r();
                    aec2.l();
                    return null;
                } catch (Throwable th2) {
                    aec2.l();
                    throw th2;
                }
        }
    }
}

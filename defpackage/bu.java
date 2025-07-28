package defpackage;

import ru.ok.tamtam.util.HandledException;

/* renamed from: bu  reason: default package */
public final /* synthetic */ class bu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc2 b;
    public final /* synthetic */ rg6 c;

    public /* synthetic */ bu(vc2 vc2, xm8 xm8, int i) {
        this.a = i;
        this.b = vc2;
        this.c = xm8;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                rg6 rg6 = this.c;
                vc2 vc2 = this.b;
                vc2.getClass();
                try {
                    vc2.b.b(rg6);
                    return;
                } catch (Throwable th) {
                    udd.s(vc2.a, "addHistoryItem: exception", th);
                    vc2.Y.a(new HandledException(th));
                    return;
                }
            default:
                rg6 rg62 = this.c;
                vc2 vc22 = this.b;
                vc22.getClass();
                try {
                    vc22.b.r(rg62);
                    return;
                } catch (Throwable th2) {
                    udd.s(vc22.a, "updateHistoryItemSync: exception", th2);
                    vc22.Y.a(new HandledException(th2));
                    return;
                }
        }
    }
}

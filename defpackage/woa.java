package defpackage;

import ru.ok.tamtam.util.HandledException;

/* renamed from: woa  reason: default package */
public final /* synthetic */ class woa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xoa b;

    public /* synthetic */ woa(xoa xoa, int i) {
        this.a = i;
        this.b = xoa;
    }

    public final void run() {
        xoa xoa = this.b;
        switch (this.a) {
            case 0:
                xoa.d();
                return;
            default:
                xoa.getClass();
                try {
                    xoa.d();
                    return;
                } catch (Exception e) {
                    udd.s("xoa", "syncInternal: exception", e);
                    xoa.h.c(new HandledException(e), true);
                    return;
                }
        }
    }
}

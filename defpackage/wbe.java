package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: wbe  reason: default package */
public final class wbe implements qce {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wbe(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void c(lbe lbe) {
        switch (this.a) {
            case 0:
                ihd ihd = (nhd) this.b;
                if (!ihd.h()) {
                    ihd.a(lbe);
                    return;
                }
                return;
            default:
                yv1 yv1 = (yv1) this.b;
                if (yv1.isActive()) {
                    yv1.resumeWith(lbe);
                    return;
                }
                return;
        }
    }

    public final void d(uae uae) {
        switch (this.a) {
            case 0:
                ihd ihd = (nhd) this.b;
                if (!ihd.h()) {
                    ihd.onError(new TamErrorException(uae));
                    return;
                }
                return;
            default:
                yv1 yv1 = (yv1) this.b;
                if (yv1.isActive()) {
                    yv1.resumeWith(new kcc(new TamErrorException(uae)));
                    return;
                }
                return;
        }
    }
}

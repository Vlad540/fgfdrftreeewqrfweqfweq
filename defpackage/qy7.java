package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: qy7  reason: default package */
public final class qy7 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ry7 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy7(ry7 ry7, int i) {
        super(9, (Object) null);
        this.c = i;
        this.o = ry7;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [ry7, android.view.View, java.lang.Object] */
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                oq6 oq6 = (oq6) obj2;
                oq6 oq62 = (oq6) obj;
                Integer num = null;
                if (hhd.f(oq62 != null ? Integer.valueOf(oq62.getWidth()) : null, oq6 != null ? Integer.valueOf(oq6.getWidth()) : null)) {
                    Integer valueOf = oq62 != null ? Integer.valueOf(oq62.getHeight()) : null;
                    if (oq6 != null) {
                        num = Integer.valueOf(oq6.getHeight());
                    }
                    if (hhd.f(valueOf, num)) {
                        return;
                    }
                }
                ? r3 = this.o;
                r3.post(new vp6(9, r3));
                return;
            case 1:
                if (!hhd.f(obj, obj2)) {
                    tp6 tp6 = (tp6) obj;
                    this.o.setup((tp6) obj2);
                    return;
                }
                return;
            default:
                if (!hhd.f(obj, obj2)) {
                    Drawable drawable = (Drawable) obj2;
                    Drawable drawable2 = (Drawable) obj;
                    ry7 ry7 = this.o;
                    ry7.getHierarchy().k(ry7.getOverlayDrawable());
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qy7(Object obj, ry7 ry7) {
        super(9, obj);
        this.c = 1;
        this.o = ry7;
    }
}

package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: wp6  reason: default package */
public final class wp6 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ xp6 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp6(xp6 xp6, int i) {
        super(9, (Object) null);
        this.c = i;
        this.o = xp6;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.view.View, java.lang.Object, xp6] */
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
                r3.post(new vp6(0, r3));
                return;
            case 1:
                if (!hhd.f(obj, obj2)) {
                    Drawable drawable = (Drawable) obj2;
                    Drawable drawable2 = (Drawable) obj;
                    xp6 xp6 = this.o;
                    xp6.getHierarchy().k(xp6.getOverlayDrawable());
                    return;
                }
                return;
            default:
                if (!hhd.f(obj, obj2)) {
                    tp6 tp6 = (tp6) obj;
                    this.o.setup((tp6) obj2);
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wp6(Object obj, xp6 xp6) {
        super(9, obj);
        this.c = 2;
        this.o = xp6;
    }
}

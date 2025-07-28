package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: zw6  reason: default package */
public final class zw6 extends u2 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ ax6 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zw6(ax6 ax6) {
        super(9, (Object) null);
        this.o = ax6;
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!hhd.f(obj, obj2)) {
                    Drawable drawable = (Drawable) obj2;
                    Drawable drawable2 = (Drawable) obj;
                    if (drawable != null) {
                        drawable.setBounds(this.o.getBounds());
                        return;
                    }
                    return;
                }
                return;
            default:
                if (!hhd.f(obj, obj2)) {
                    int intValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    ax6 ax6 = this.o;
                    ax6.d.setColor(intValue);
                    ax6.invalidateSelf();
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zw6(Integer num, ax6 ax6) {
        super(9, (Object) num);
        this.o = ax6;
    }
}

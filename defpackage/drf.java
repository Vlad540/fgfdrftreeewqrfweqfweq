package defpackage;

import android.view.View;
import one.me.sdk.arch.Widget;

/* renamed from: drf  reason: default package */
public final /* synthetic */ class drf implements i26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ drf(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Widget.viewBinding$lambda$6(this.b, (View) obj, (bz2) obj2);
            default:
                return Widget.binding$lambda$9(this.b, obj, (bz2) obj2);
        }
    }
}

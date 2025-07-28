package defpackage;

import android.graphics.drawable.Animatable;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: m4a  reason: default package */
public final class m4a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OneMeDraweeView b;
    public final /* synthetic */ oq6 c;
    public final /* synthetic */ Animatable o;

    public /* synthetic */ m4a(OneMeDraweeView oneMeDraweeView, String str, oq6 oq6, Animatable animatable, int i) {
        this.a = i;
        this.b = oneMeDraweeView;
        this.c = oq6;
        this.o = animatable;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v2, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final void run() {
        switch (this.a) {
            case 0:
                ? r0 = this.b;
                r0.p(this.c, this.o);
                r0.requestLayout();
                r0.invalidate();
                return;
            default:
                ? r02 = this.b;
                r02.p(this.c, this.o);
                r02.requestLayout();
                r02.invalidate();
                return;
        }
    }
}

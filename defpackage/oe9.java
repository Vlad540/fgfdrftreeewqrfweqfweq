package defpackage;

import android.content.Context;
import android.view.View;
import ru.ok.messages.video.widgets.doubleTap.DoubleTapVideoViewWrapper;

/* renamed from: oe9  reason: default package */
public final class oe9 extends v2 implements wj4 {
    public rj4 X;
    public rj4 Y;
    public final tg o;

    public oe9(Context context, DoubleTapVideoViewWrapper doubleTapVideoViewWrapper, tg tgVar) {
        super(context);
        this.o = tgVar;
        this.c = doubleTapVideoViewWrapper;
        n();
        doubleTapVideoViewWrapper.setTouchEventListener(this);
    }

    public final void A(ne9 ne9) {
        if (!ne9.c) {
            this.X.a();
            this.Y.a();
            return;
        }
        boolean z = ne9.b;
        int i = ne9.a;
        if (z) {
            this.X.a();
            this.Y.b();
            this.Y.c(i);
            return;
        }
        this.X.b();
        this.X.c(i);
        this.Y.a();
    }

    public final void n() {
        this.X = (rj4) ((View) this.c).findViewById(yqb.double_tap_video_view_wrapper__arrows_view_left);
        this.Y = (rj4) ((View) this.c).findViewById(yqb.double_tap_video_view_wrapper__arrows_view_right);
        rj4 rj4 = this.X;
        tg tgVar = this.o;
        rj4.setAnimations(tgVar);
        this.Y.setAnimations(tgVar);
    }
}

package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: l08  reason: default package */
public final /* synthetic */ class l08 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarWidget b;

    public /* synthetic */ l08(MediaBarWidget mediaBarWidget, int i) {
        this.a = i;
        this.b = mediaBarWidget;
    }

    public final Object invoke(Object obj) {
        Object value;
        qz qzVar;
        jue jue = jue.a;
        MediaBarWidget mediaBarWidget = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                k77[] k77Arr = MediaBarWidget.h1;
                grd grd = mediaBarWidget.A0().w0;
                do {
                    value = grd.getValue();
                    int ordinal = ((qz) value).ordinal();
                    if (ordinal == 0) {
                        qzVar = qz.b;
                    } else if (ordinal == 1) {
                        qzVar = qz.a;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } while (!grd.b(value, qzVar));
                return jue;
            case 1:
                mediaBarWidget.X.f.k = (CharSequence) obj;
                return jue;
            default:
                View view2 = (View) obj;
                k77[] k77Arr2 = MediaBarWidget.h1;
                mediaBarWidget.w0().j(true);
                return jue;
        }
    }
}

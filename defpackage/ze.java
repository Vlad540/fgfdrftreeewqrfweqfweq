package defpackage;

import android.view.View;
import java.util.ArrayList;
import one.me.sdk.media.ffmpeg.AnimatedFileDrawable;

/* renamed from: ze  reason: default package */
public final /* synthetic */ class ze implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnimatedFileDrawable b;

    public /* synthetic */ ze(AnimatedFileDrawable animatedFileDrawable, int i) {
        this.a = i;
        this.b = animatedFileDrawable;
    }

    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                AnimatedFileDrawable animatedFileDrawable = this.b;
                if (!animatedFileDrawable.c1) {
                    animatedFileDrawable.start();
                }
                animatedFileDrawable.invalidateInternal();
                return;
            case 1:
                AnimatedFileDrawable animatedFileDrawable2 = this.b;
                ArrayList arrayList = animatedFileDrawable2.q1;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((View) arrayList.get(i)).invalidate();
                    }
                }
                if ((arrayList.isEmpty() || animatedFileDrawable2.N0) && (view = animatedFileDrawable2.p1) != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                rn0 rn0 = this.b.v1;
                return;
        }
    }
}

package defpackage;

import android.animation.ValueAnimator;

/* renamed from: t10  reason: default package */
public final class t10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u10 b;

    public /* synthetic */ t10(u10 u10, int i) {
        this.a = i;
        this.b = u10;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ValueAnimator valueAnimator = this.b.p;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    return;
                }
                return;
            default:
                ValueAnimator valueAnimator2 = this.b.p;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                    return;
                }
                return;
        }
    }
}

package defpackage;

import android.os.SystemClock;

/* renamed from: li0  reason: default package */
public final class li0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ni0 b;

    public /* synthetic */ li0(ni0 ni0, int i) {
        this.a = i;
        this.b = ni0;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ni0 ni0 = this.b;
                if (ni0.o > 0) {
                    SystemClock.uptimeMillis();
                }
                ni0.setVisibility(0);
                return;
            default:
                ni0 ni02 = this.b;
                ((dn4) ni02.getCurrentDrawable()).d(false, false, true);
                if ((ni02.getProgressDrawable() == null || !ni02.getProgressDrawable().isVisible()) && (ni02.getIndeterminateDrawable() == null || !ni02.getIndeterminateDrawable().isVisible())) {
                    ni02.setVisibility(4);
                }
                ni02.getClass();
                return;
        }
    }
}

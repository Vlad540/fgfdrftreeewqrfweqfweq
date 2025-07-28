package defpackage;

/* renamed from: vg7  reason: default package */
public final class vg7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xg7 b;

    public /* synthetic */ vg7(xg7 xg7, int i) {
        this.a = i;
        this.b = xg7;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                yo4 yo4 = this.b.c;
                if (yo4 != null) {
                    yo4.setListSelectionHidden(true);
                    yo4.requestLayout();
                    return;
                }
                return;
            default:
                xg7 xg7 = this.b;
                yo4 yo42 = xg7.c;
                if (yo42 != null && yo42.isAttachedToWindow() && xg7.c.getCount() > xg7.c.getChildCount() && xg7.c.getChildCount() <= xg7.B0) {
                    xg7.O0.setInputMethodMode(2);
                    xg7.g();
                    return;
                }
                return;
        }
    }
}

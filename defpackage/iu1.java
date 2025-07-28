package defpackage;

import one.me.sdk.arch.Widget;

/* renamed from: iu1  reason: default package */
public final class iu1 implements nc7 {
    public final /* synthetic */ int a;
    public final pc7 b;

    public iu1() {
        this.a = 0;
        pc7 pc7 = new pc7(this);
        this.b = pc7;
        pc7.d(nb7.ON_CREATE);
    }

    public final pc7 R() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public iu1(Widget widget) {
        this.a = 1;
        this.b = new pc7(this);
        widget.addLifecycleListener(new o63(1, this));
    }
}

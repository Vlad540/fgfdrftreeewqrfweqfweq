package ru.ok.android.externcalls.sdk;

public final /* synthetic */ class i implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pf3 b;

    public /* synthetic */ i(pf3 pf3, int i) {
        this.a = i;
        this.b = pf3;
    }

    public final void accept(Object obj) {
        int i = this.a;
        pf3 pf3 = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                pf3.accept(th);
                return;
            case 1:
                pf3.accept(th);
                return;
            case 2:
                pf3.accept(th);
                return;
            default:
                pf3.accept(th);
                return;
        }
    }
}

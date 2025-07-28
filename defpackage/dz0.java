package defpackage;

import javax.inject.Provider;

/* renamed from: dz0  reason: default package */
public final /* synthetic */ class dz0 implements Provider, r3e {
    public final /* synthetic */ int a;
    public final /* synthetic */ t97 b;

    public /* synthetic */ dz0(int i, t97 t97) {
        this.a = i;
        this.b = t97;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return ((rf4) this.b.getValue()).a();
            case 1:
                return (ua6) this.b.getValue();
            default:
                return (wa6) this.b.getValue();
        }
    }
}

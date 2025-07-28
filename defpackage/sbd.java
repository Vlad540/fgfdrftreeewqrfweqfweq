package defpackage;

/* renamed from: sbd  reason: default package */
public final /* synthetic */ class sbd implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ubd b;

    public /* synthetic */ sbd(ubd ubd, int i) {
        this.a = i;
        this.b = ubd;
    }

    public final Object invoke() {
        int i = this.a;
        ubd ubd = this.b;
        switch (i) {
            case 0:
                return ubd.b(ubd);
            default:
                return ubd.i(ubd);
        }
    }
}

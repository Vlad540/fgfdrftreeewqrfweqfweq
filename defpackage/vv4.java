package defpackage;

/* renamed from: vv4  reason: default package */
public final /* synthetic */ class vv4 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wv4 b;

    public /* synthetic */ vv4(wv4 wv4, int i) {
        this.a = i;
        this.b = wv4;
    }

    public final Object invoke() {
        mv4 mv4;
        switch (this.a) {
            case 0:
                try {
                    mv4 = new mv4(this.b.a.getResources());
                } catch (Exception unused) {
                    mv4 = null;
                }
                return new ou4(mv4);
            default:
                wv4 wv4 = this.b;
                return new xu4((ou4) wv4.b.getValue(), wv4.d, wv4.c, wv4.e);
        }
    }
}

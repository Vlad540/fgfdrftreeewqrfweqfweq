package defpackage;

/* renamed from: kqc  reason: default package */
public final /* synthetic */ class kqc implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lqc b;

    public /* synthetic */ kqc(lqc lqc, int i) {
        this.a = i;
        this.b = lqc;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Long.valueOf(this.b.s());
            default:
                return Integer.valueOf(this.b.d("request_id", 10));
        }
    }
}

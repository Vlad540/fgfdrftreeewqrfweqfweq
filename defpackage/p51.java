package defpackage;

/* renamed from: p51  reason: default package */
public final /* synthetic */ class p51 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r51 b;

    public /* synthetic */ p51(r51 r51, int i) {
        this.a = i;
        this.b = r51;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                r51 r51 = this.b;
                return new jc6(r51.N0, r51.O0);
            case 1:
                return this.b.T0;
            default:
                return this.b.R0;
        }
    }
}

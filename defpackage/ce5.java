package defpackage;

/* renamed from: ce5  reason: default package */
public final /* synthetic */ class ce5 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s16 b;

    public /* synthetic */ ce5(int i, s16 s16) {
        this.a = i;
        this.b = s16;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (String) this.b.invoke();
            case 1:
                return Integer.valueOf(((pda) this.b.invoke()).b().c);
            default:
                return Integer.valueOf(((pda) this.b.invoke()).getIcon().f);
        }
    }
}

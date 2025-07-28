package defpackage;

/* renamed from: u35  reason: default package */
public final /* synthetic */ class u35 implements kh7, lh7, nf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ u35(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public void accept(Object obj) {
        qza qza = (qza) obj;
        switch (this.a) {
            case 3:
                qza.setPlaybackSpeed(this.b);
                return;
            default:
                qza.g(this.b);
                return;
        }
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((gya) obj).f(this.b);
                return;
            case 1:
                ((hya) obj).f(this.b);
                return;
            default:
                ((hya) obj).f(this.b);
                return;
        }
    }
}

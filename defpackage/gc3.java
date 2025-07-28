package defpackage;

/* renamed from: gc3  reason: default package */
public final class gc3 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc3 b;
    public final /* synthetic */ ec3 c;

    public /* synthetic */ gc3(hc3 hc3, ec3 ec3, int i) {
        this.a = i;
        this.b = hc3;
        this.c = ec3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                u16 onAnimationEnded = this.b.getOnAnimationEnded();
                if (onAnimationEnded != null) {
                    onAnimationEnded.invoke(this.c);
                }
                return jue.a;
            case 1:
                u16 onAnimationEnded2 = this.b.getOnAnimationEnded();
                if (onAnimationEnded2 != null) {
                    onAnimationEnded2.invoke(this.c);
                }
                return jue.a;
            default:
                hc3 hc3 = this.b;
                hc3.L0();
                u16 onAnimationEnded3 = hc3.getOnAnimationEnded();
                if (onAnimationEnded3 != null) {
                    onAnimationEnded3.invoke(this.c);
                }
                return jue.a;
        }
    }
}

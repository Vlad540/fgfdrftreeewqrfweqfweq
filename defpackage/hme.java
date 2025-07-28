package defpackage;

/* renamed from: hme  reason: default package */
public final /* synthetic */ class hme implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jme b;

    public /* synthetic */ hme(jme jme, int i) {
        this.a = i;
        this.b = jme;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                return jue.a;
            default:
                jme jme = this.b;
                return new eme(jme.X, jme.Y, jme.c);
        }
    }
}

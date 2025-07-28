package defpackage;

/* renamed from: we8  reason: default package */
public final /* synthetic */ class we8 implements Runnable {
    public final /* synthetic */ i78 X;
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;
    public final /* synthetic */ cf8 c;
    public final /* synthetic */ yi7 o;

    public /* synthetic */ we8(jn jnVar, cf8 cf8, yi7 yi7, i78 i78, int i) {
        this.a = i;
        this.b = jnVar;
        this.c = cf8;
        this.o = yi7;
        this.X = i78;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                jn jnVar = this.b;
                this.c.x(jnVar.b, (se8) jnVar.c, this.o, this.X);
                return;
            case 1:
                jn jnVar2 = this.b;
                this.c.t(jnVar2.b, (se8) jnVar2.c, this.o, this.X);
                return;
            default:
                jn jnVar3 = this.b;
                this.c.r(jnVar3.b, (se8) jnVar3.c, this.o, this.X);
                return;
        }
    }
}

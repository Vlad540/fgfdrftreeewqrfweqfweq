package defpackage;

/* renamed from: xl6  reason: default package */
public final /* synthetic */ class xl6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ xi4 o;

    public /* synthetic */ xl6(xi4 xi4, float f, long j, int i) {
        this.a = i;
        this.o = xi4;
        this.b = f;
        this.c = j;
    }

    public final void run() {
        qm6 qm6 = this.o;
        switch (this.a) {
            case 0:
                yl6 yl6 = (yl6) qm6;
                if (!yl6.Y.get()) {
                    long nanoTime = System.nanoTime();
                    long j = yl6.Z;
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    float f = this.b;
                    if (i == 0 || Math.abs(nanoTime - j) > 1000000000) {
                        yl6.Z = nanoTime;
                        udd.p("zl6", "onFileUploadProgress: progress=%f, total %d", new Object[]{Float.valueOf(f), Long.valueOf(this.c)});
                    }
                    yl6.X.c(new vl6(f, false));
                    return;
                }
                return;
            default:
                qm6 qm62 = qm6;
                if (!qm62.w0.get()) {
                    long nanoTime2 = System.nanoTime();
                    long j2 = qm62.x0;
                    int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                    float f2 = this.b;
                    long j3 = this.c;
                    if (i2 == 0 || Math.abs(nanoTime2 - j2) > 1000000000) {
                        qm62.x0 = nanoTime2;
                        udd.p("rm6", "onFileUploadProgress: progress=%f, total %d", new Object[]{Float.valueOf(f2), Long.valueOf(j3)});
                    }
                    qm62.Z.c(new pm6(false, (String) null, f2, j3));
                    return;
                }
                return;
        }
    }
}

package defpackage;

import android.util.Pair;

/* renamed from: jf8  reason: default package */
public final /* synthetic */ class jf8 implements Runnable {
    public final /* synthetic */ i78 X;
    public final /* synthetic */ int a;
    public final /* synthetic */ otf b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ yi7 o;

    public /* synthetic */ jf8(otf otf, Pair pair, yi7 yi7, i78 i78, int i) {
        this.a = i;
        this.b = otf;
        this.c = pair;
        this.o = yi7;
        this.X = i78;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Pair pair = this.c;
                ((g44) ((pf8) this.b.b).j).r(((Integer) pair.first).intValue(), (se8) pair.second, this.o, this.X);
                return;
            case 1:
                Pair pair2 = this.c;
                ((g44) ((pf8) this.b.b).j).x(((Integer) pair2.first).intValue(), (se8) pair2.second, this.o, this.X);
                return;
            default:
                Pair pair3 = this.c;
                ((g44) ((pf8) this.b.b).j).t(((Integer) pair3.first).intValue(), (se8) pair3.second, this.o, this.X);
                return;
        }
    }
}

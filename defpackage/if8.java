package defpackage;

import android.util.Pair;

/* renamed from: if8  reason: default package */
public final /* synthetic */ class if8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ otf b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ if8(otf otf, Pair pair, int i) {
        this.a = i;
        this.b = otf;
        this.c = pair;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Pair pair = this.c;
                ((g44) ((pf8) this.b.b).j).y(((Integer) pair.first).intValue(), (se8) pair.second);
                return;
            case 1:
                Pair pair2 = this.c;
                ((g44) ((pf8) this.b.b).j).C(((Integer) pair2.first).intValue(), (se8) pair2.second);
                return;
            case 2:
                Pair pair3 = this.c;
                ((g44) ((pf8) this.b.b).j).D(((Integer) pair3.first).intValue(), (se8) pair3.second);
                return;
            default:
                Pair pair4 = this.c;
                ((g44) ((pf8) this.b.b).j).B(((Integer) pair4.first).intValue(), (se8) pair4.second);
                return;
        }
    }
}

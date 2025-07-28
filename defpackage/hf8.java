package defpackage;

import android.util.Pair;

/* renamed from: hf8  reason: default package */
public final /* synthetic */ class hf8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ otf b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ i78 o;

    public /* synthetic */ hf8(otf otf, Pair pair, i78 i78, int i) {
        this.a = i;
        this.b = otf;
        this.c = pair;
        this.o = i78;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Pair pair = this.c;
                int intValue = ((Integer) pair.first).intValue();
                se8 se8 = (se8) pair.second;
                se8.getClass();
                ((g44) ((pf8) this.b.b).j).A(intValue, se8, this.o);
                return;
            default:
                Pair pair2 = this.c;
                ((g44) ((pf8) this.b.b).j).E(((Integer) pair2.first).intValue(), (se8) pair2.second, this.o);
                return;
        }
    }
}

package defpackage;

import android.util.SparseBooleanArray;

/* renamed from: se5  reason: default package */
public final /* synthetic */ class se5 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ se5(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = z;
        this.X = obj3;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((ue5) this.c).a((kc9) this.o, this.b, (ec9) this.X);
                return;
            case 1:
                ((sn1) this.c).b(this.o);
                if (this.b) {
                    ((ch7) this.X).cancel(true);
                    return;
                }
                return;
            case 2:
                ((ue) this.c).j((kc8) this.o, (og0) this.X, this.b);
                return;
            default:
                md8 md8 = (md8) ((ud) this.c).o;
                qza qza = md8.f.s;
                am7.B(qza, (jc8) this.o);
                int playbackState = qza.getPlaybackState();
                if (playbackState == 1) {
                    if (qza.t1(2)) {
                        qza.prepare();
                    }
                } else if (playbackState == 4 && qza.t1(4)) {
                    qza.E();
                }
                boolean z = this.b;
                if (z && qza.t1(1)) {
                    qza.play();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int append : new int[]{31, 2}) {
                    oyb.k(!false);
                    sparseBooleanArray.append(append, true);
                }
                if (z) {
                    oyb.k(!false);
                    sparseBooleanArray.append(1, true);
                }
                oyb.k(!false);
                md8.f.p((ic8) this.X);
                return;
        }
    }

    public /* synthetic */ se5(ue ueVar, kc8 kc8, og0 og0, boolean z) {
        this.a = 2;
        this.c = ueVar;
        this.o = kc8;
        this.X = og0;
        this.b = z;
    }

    public /* synthetic */ se5(sn1 sn1, vn1 vn1) {
        this.a = 1;
        this.c = sn1;
        this.o = null;
        this.b = true;
        this.X = vn1;
    }
}

package defpackage;

/* renamed from: nza  reason: default package */
public final /* synthetic */ class nza implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oza b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public /* synthetic */ nza(oza oza, int i, int i2, int i3) {
        this.a = i3;
        this.b = oza;
        this.c = i;
        this.o = i2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                qza qza = this.b.g;
                if (qza.t1(25) || qza.t1(33)) {
                    boolean t1 = qza.t1(33);
                    int i = this.c;
                    if (t1) {
                        qza.L(i, this.o);
                        return;
                    } else {
                        qza.I0(i);
                        return;
                    }
                } else {
                    return;
                }
            default:
                qza qza2 = this.b.g;
                if (qza2.t1(26) || qza2.t1(34)) {
                    int i2 = this.c;
                    int i3 = this.o;
                    if (i2 != -100) {
                        if (i2 != -1) {
                            if (i2 != 1) {
                                if (i2 != 100) {
                                    if (i2 != 101) {
                                        us8.l(i2, "onAdjustVolume: Ignoring unknown direction: ");
                                        return;
                                    } else if (qza2.t1(34)) {
                                        qza2.H(i3, !qza2.T0());
                                        return;
                                    } else {
                                        qza2.q0(!qza2.T0());
                                        return;
                                    }
                                } else if (qza2.t1(34)) {
                                    qza2.H(i3, false);
                                    return;
                                } else {
                                    qza2.q0(false);
                                    return;
                                }
                            } else if (qza2.t1(34)) {
                                qza2.N(i3);
                                return;
                            } else {
                                qza2.D0();
                                return;
                            }
                        } else if (qza2.t1(34)) {
                            qza2.g0(i3);
                            return;
                        } else {
                            qza2.J();
                            return;
                        }
                    } else if (qza2.t1(34)) {
                        qza2.H(i3, true);
                        return;
                    } else {
                        qza2.q0(true);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}

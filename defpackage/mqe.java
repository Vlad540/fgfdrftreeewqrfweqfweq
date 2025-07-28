package defpackage;

/* renamed from: mqe  reason: default package */
public final /* synthetic */ class mqe implements mx9 {
    public final /* synthetic */ nqe a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ob6 c;

    public /* synthetic */ mqe(nqe nqe, int i, ob6 ob6) {
        this.a = nqe;
        this.b = i;
        this.c = ob6;
    }

    public final void b(gs4 gs4, long j, xu5 xu5, boolean z) {
        int i = this.b;
        ob6 ob6 = this.c;
        nqe nqe = this.a;
        if (nqe.j.c) {
            synchronized (nqe.j.l) {
                try {
                    if (!nqe.j.m.J(nqe.a) || i != 2) {
                        if (!((hs4) nqe.c.a.get(nqe.a)).b) {
                            boolean z2 = true;
                            oyb.j("MediaItem duration required for sequence looping could not be extracted.", j != -9223372036854775807L);
                            nqe.i += j;
                            synchronized (nqe.j.q) {
                                if (z) {
                                    try {
                                        oqe oqe = nqe.j;
                                        oqe.v--;
                                    } catch (Throwable th) {
                                        while (true) {
                                            throw th;
                                        }
                                    }
                                }
                                if (nqe.j.v != 0) {
                                    z2 = false;
                                }
                                if (nqe.i > nqe.j.u || z2) {
                                    oqe oqe2 = nqe.j;
                                    oqe2.u = Math.max(nqe.i, oqe2.u);
                                    for (int i2 = 0; i2 < nqe.j.k.size(); i2++) {
                                        ((fyc) nqe.j.k.get(i2)).j(nqe.j.u, z2);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    while (true) {
                    }
                }
            }
        }
        ob6.b(gs4, j, xu5, z);
    }
}

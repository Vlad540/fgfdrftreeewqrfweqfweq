package defpackage;

/* renamed from: bx4  reason: default package */
public final class bx4 extends rd4 {
    public final /* synthetic */ int c = 0;
    public final ov0 d;
    public final Object e;
    public final boolean f;

    public bx4(ah0 ah0, zm0 zm0, el8 el8, boolean z) {
        super(ah0);
        this.d = zm0;
        this.e = el8;
        this.f = z;
    }

    public final void h(int i, Object obj) {
        e13 o;
        e13 d2;
        ax4 ax4;
        e13 e13;
        e13 e132;
        switch (this.c) {
            case 0:
                ax4 ax42 = (ax4) obj;
                try {
                    n06.s();
                    boolean b = ah0.b(i);
                    ah0 ah0 = this.b;
                    if (!b && ax42 != null) {
                        if (!((i & 10) != 0)) {
                            ax42.n0();
                            if (ax42.c != lq6.c) {
                                o = e13.o(ax42.a);
                                if (o != null) {
                                    d2 = this.f ? ((el8) this.e).d(this.d, o) : null;
                                    e13.S(o);
                                    if (d2 != null) {
                                        ax4 = new ax4(d2);
                                        ax4.g(ax42);
                                        e13.S(d2);
                                        ah0.i(1.0f);
                                        ah0.g(i, ax4);
                                        ax4.d(ax4);
                                        n06.s();
                                        return;
                                    }
                                }
                                ah0.g(i, ax42);
                                n06.s();
                                return;
                            }
                        }
                    }
                    ah0.g(i, ax42);
                    n06.s();
                    return;
                } catch (Throwable th) {
                    n06.s();
                    throw th;
                }
            case 1:
                e13 e133 = (e13) obj;
                e13 e134 = null;
                ah0 ah02 = this.b;
                if (e133 == null) {
                    if (ah0.a(i)) {
                        ah02.g(i, e134);
                        return;
                    }
                    return;
                } else if (!ah0.b(i)) {
                    if (this.f) {
                        e134 = ((el8) this.e).d(this.d, e133);
                    }
                    try {
                        ah02.i(1.0f);
                        if (e134 != null) {
                            e133 = e134;
                        }
                        ah02.g(i, e133);
                        return;
                    } finally {
                        e13.S(e134);
                    }
                } else {
                    return;
                }
            default:
                e13 e135 = (e13) obj;
                try {
                    if (n06.w()) {
                        n06.g("BitmapMemoryCacheProducer#onNewResultImpl");
                    }
                    boolean a = ah0.a(i);
                    e13 = null;
                    ah0 ah03 = this.b;
                    if (e135 == null) {
                        if (a) {
                            ah03.g(i, (Object) null);
                        }
                        if (!n06.w()) {
                            return;
                        }
                    } else if (((b13) e135.e0()).isStateful() || ah0.l(i, 8)) {
                        ah03.g(i, e135);
                        if (!n06.w()) {
                            return;
                        }
                    } else {
                        ov0 ov0 = this.d;
                        bn0 bn0 = (bn0) this.e;
                        if (!a) {
                            e132 = bn0.b.get(ov0);
                            if (e132 != null) {
                                tjb qualityInfo = ((b13) e135.e0()).getQualityInfo();
                                tjb qualityInfo2 = ((b13) e132.e0()).getQualityInfo();
                                if (((et6) qualityInfo2).c || ((et6) qualityInfo2).a >= ((et6) qualityInfo).a) {
                                    ah03.g(i, e132);
                                    e13.S(e132);
                                    if (!n06.w()) {
                                        return;
                                    }
                                } else {
                                    e13.S(e132);
                                }
                            }
                        }
                        if (this.f) {
                            e13 = bn0.b.d(ov0, e135);
                        }
                        if (a) {
                            ah03.i(1.0f);
                        }
                        if (e13 != null) {
                            e135 = e13;
                        }
                        ah03.g(i, e135);
                        e13.S(e13);
                        if (!n06.w()) {
                            return;
                        }
                    }
                    n06.m();
                    return;
                } catch (Throwable th2) {
                    if (n06.w()) {
                        n06.m();
                    }
                    throw th2;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bx4(bn0 bn0, ah0 ah0, zm0 zm0, boolean z) {
        super(ah0);
        this.e = bn0;
        this.d = zm0;
        this.f = z;
    }

    public bx4(ah0 ah0, el8 el8, ngd ngd, boolean z) {
        super(ah0);
        this.e = el8;
        this.d = ngd;
        this.f = z;
    }
}

package defpackage;

/* renamed from: bib  reason: default package */
public final class bib extends gr8 {
    public String a;
    public String b;
    public String c;
    public xhb d;
    public String e;
    public zhb f;

    public final int computeSerializedSize() {
        int l = !this.a.equals("") ? o13.l(1, this.a) : 0;
        if (!this.b.equals("")) {
            l += o13.l(2, this.b);
        }
        if (!this.c.equals("")) {
            l += o13.l(3, this.c);
        }
        xhb xhb = this.d;
        if (xhb != null) {
            l += o13.i(4, xhb);
        }
        if (!this.e.equals("")) {
            l += o13.l(5, this.e);
        }
        zhb zhb = this.f;
        return zhb != null ? l + o13.i(6, zhb) : l;
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s = n13.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                this.a = n13.r();
            } else if (s == 18) {
                this.b = n13.r();
            } else if (s == 26) {
                this.c = n13.r();
            } else if (s == 34) {
                if (this.d == null) {
                    gr8 gr8 = new gr8();
                    gr8.a = null;
                    gr8.b = 0.0f;
                    gr8.c = iu7.m;
                    gr8.cachedSize = -1;
                    this.d = gr8;
                }
                n13.j(this.d);
            } else if (s == 42) {
                this.e = n13.r();
            } else if (s == 50) {
                if (this.f == null) {
                    gr8 gr82 = new gr8();
                    if (aib.f == null) {
                        synchronized (tz6.b) {
                            try {
                                if (aib.f == null) {
                                    aib.f = new aib[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    gr82.a = aib.f;
                    if (whb.c == null) {
                        synchronized (tz6.b) {
                            try {
                                if (whb.c == null) {
                                    whb.c = new whb[0];
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    gr82.b = whb.c;
                    gr82.c = null;
                    gr82.d = false;
                    gr82.cachedSize = -1;
                    this.f = gr82;
                }
                n13.j(this.f);
            } else if (!n13.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(o13 o13) {
        if (!this.a.equals("")) {
            o13.E(1, this.a);
        }
        if (!this.b.equals("")) {
            o13.E(2, this.b);
        }
        if (!this.c.equals("")) {
            o13.E(3, this.c);
        }
        xhb xhb = this.d;
        if (xhb != null) {
            o13.y(4, xhb);
        }
        if (!this.e.equals("")) {
            o13.E(5, this.e);
        }
        zhb zhb = this.f;
        if (zhb != null) {
            o13.y(6, zhb);
        }
    }
}

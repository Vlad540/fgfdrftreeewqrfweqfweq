package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: uq4  reason: default package */
public final class uq4 implements xs4, ys4 {
    public final /* synthetic */ int a;
    public final Object b;
    public boolean c;
    public int d;
    public int e;
    public long f;
    public Object g;

    public uq4(int i, List list) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = list;
                this.g = new bpe[list.size()];
                this.f = -9223372036854775807L;
                return;
            default:
                this.b = list;
                this.g = new ape[list.size()];
                this.f = -9223372036854775807L;
                return;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                this.c = false;
                this.f = -9223372036854775807L;
                return;
            case 1:
                this.c = false;
                this.f = -9223372036854775807L;
                return;
            case 2:
                this.c = false;
                this.f = -9223372036854775807L;
                return;
            default:
                this.c = false;
                this.f = -9223372036854775807L;
                return;
        }
    }

    public void f(ija ija) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 1:
                if (this.c) {
                    if (this.d == 2) {
                        if (ija.a() == 0) {
                            z2 = false;
                        } else {
                            if (ija.u() != 32) {
                                this.c = false;
                            }
                            this.d--;
                            z2 = this.c;
                        }
                        if (!z2) {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (ija.a() == 0) {
                            z = false;
                        } else {
                            if (ija.u() != 0) {
                                this.c = false;
                            }
                            this.d--;
                            z = this.c;
                        }
                        if (!z) {
                            return;
                        }
                    }
                    int i = ija.b;
                    int a2 = ija.a();
                    for (bpe b2 : (bpe[]) this.g) {
                        ija.G(i);
                        b2.b(ija, a2, 0);
                    }
                    this.e += a2;
                    return;
                }
                return;
            default:
                oyb.l((bpe) this.g);
                if (this.c) {
                    int a3 = ija.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int min = Math.min(a3, 10 - i2);
                        byte[] bArr = ija.a;
                        int i3 = ija.b;
                        ija ija2 = (ija) this.b;
                        System.arraycopy(bArr, i3, ija2.a, this.e, min);
                        if (this.e + min == 10) {
                            ija2.G(0);
                            if (73 == ija2.u() && 68 == ija2.u() && 51 == ija2.u()) {
                                ija2.H(3);
                                this.d = ija2.t() + 10;
                            } else {
                                ez3.j0("Discarding invalid ID3 tag");
                                this.c = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a3, this.d - this.e);
                    ((bpe) this.g).b(ija, min2, 0);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    public void g(yze yze) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.c) {
                    if (this.d == 2) {
                        if (yze.c() == 0) {
                            z2 = false;
                        } else {
                            if (yze.v() != 32) {
                                this.c = false;
                            }
                            this.d--;
                            z2 = this.c;
                        }
                        if (!z2) {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (yze.c() == 0) {
                            z = false;
                        } else {
                            if (yze.v() != 0) {
                                this.c = false;
                            }
                            this.d--;
                            z = this.c;
                        }
                        if (!z) {
                            return;
                        }
                    }
                    int i = yze.b;
                    int c2 = yze.c();
                    for (ape c3 : (ape[]) this.g) {
                        yze.H(i);
                        c3.c(c2, yze);
                    }
                    this.e += c2;
                    return;
                }
                return;
            default:
                swb.i((ape) this.g);
                if (this.c) {
                    int c4 = yze.c();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int min = Math.min(c4, 10 - i2);
                        byte[] bArr = yze.a;
                        int i3 = yze.b;
                        yze yze2 = (yze) this.b;
                        System.arraycopy(bArr, i3, yze2.a, this.e, min);
                        if (this.e + min == 10) {
                            yze2.H(0);
                            if (73 == yze2.v() && 68 == yze2.v() && 51 == yze2.v()) {
                                yze2.I(3);
                                this.d = yze2.u() + 10;
                            } else {
                                this.c = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(c4, this.d - this.e);
                    ((ape) this.g).c(min2, yze);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    public final void h(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.c = true;
                    if (j != -9223372036854775807L) {
                        this.f = j;
                    }
                    this.e = 0;
                    this.d = 2;
                    return;
                }
                return;
            case 1:
                if ((i & 4) != 0) {
                    this.c = true;
                    this.f = j;
                    this.e = 0;
                    this.d = 2;
                    return;
                }
                return;
            case 2:
                if ((i & 4) != 0) {
                    this.c = true;
                    if (j != -9223372036854775807L) {
                        this.f = j;
                    }
                    this.d = 0;
                    this.e = 0;
                    return;
                }
                return;
            default:
                if ((i & 4) != 0) {
                    this.c = true;
                    this.f = j;
                    this.d = 0;
                    this.e = 0;
                    return;
                }
                return;
        }
    }

    public void i() {
        int i;
        switch (this.a) {
            case 0:
                if (this.c) {
                    if (this.f != -9223372036854775807L) {
                        for (ape b2 : (ape[]) this.g) {
                            b2.b(this.f, 1, this.e, 0, (yoe) null);
                        }
                    }
                    this.c = false;
                    return;
                }
                return;
            default:
                swb.i((ape) this.g);
                if (this.c && (i = this.d) != 0 && this.e == i) {
                    long j = this.f;
                    if (j != -9223372036854775807L) {
                        ((ape) this.g).b(j, 1, i, 0, (yoe) null);
                    }
                    this.c = false;
                    return;
                }
                return;
        }
    }

    public void j(boolean z) {
        int i;
        switch (this.a) {
            case 1:
                if (this.c) {
                    oyb.k(this.f != -9223372036854775807L);
                    for (bpe a2 : (bpe[]) this.g) {
                        a2.a(this.f, 1, this.e, 0, (zoe) null);
                    }
                    this.c = false;
                    return;
                }
                return;
            default:
                oyb.l((bpe) this.g);
                if (this.c && (i = this.d) != 0 && this.e == i) {
                    oyb.k(this.f != -9223372036854775807L);
                    ((bpe) this.g).a(this.f, 1, this.d, 0, (zoe) null);
                    this.c = false;
                    return;
                }
                return;
        }
    }

    public void k(i75 i75, pse pse) {
        switch (this.a) {
            case 1:
                int i = 0;
                while (true) {
                    bpe[] bpeArr = (bpe[]) this.g;
                    if (i < bpeArr.length) {
                        ose ose = (ose) ((List) this.b).get(i);
                        pse.a();
                        pse.b();
                        bpe B = i75.B(pse.e, 3);
                        uu5 uu5 = new uu5();
                        pse.b();
                        uu5.a = pse.f;
                        uu5.m = c49.l("application/dvbsubs");
                        uu5.p = Collections.singletonList(ose.b);
                        uu5.d = ose.a;
                        B.e(new xu5(uu5));
                        bpeArr[i] = B;
                        i++;
                    } else {
                        return;
                    }
                }
            default:
                pse.a();
                pse.b();
                bpe B2 = i75.B(pse.e, 5);
                this.g = B2;
                uu5 uu52 = new uu5();
                pse.b();
                uu52.a = pse.f;
                uu52.m = c49.l("application/id3");
                B2.e(new xu5(uu52));
                return;
        }
    }

    public void l(h75 h75, pse pse) {
        switch (this.a) {
            case 0:
                int i = 0;
                while (true) {
                    ape[] apeArr = (ape[]) this.g;
                    if (i < apeArr.length) {
                        nse nse = (nse) ((List) this.b).get(i);
                        pse.a();
                        pse.b();
                        ape B = h75.B(pse.e, 3);
                        tu5 tu5 = new tu5();
                        pse.b();
                        tu5.a = pse.f;
                        tu5.k = "application/dvbsubs";
                        tu5.m = Collections.singletonList(nse.b);
                        tu5.c = nse.a;
                        B.d(new vu5(tu5));
                        apeArr[i] = B;
                        i++;
                    } else {
                        return;
                    }
                }
            default:
                pse.a();
                pse.b();
                ape B2 = h75.B(pse.e, 5);
                this.g = B2;
                tu5 tu52 = new tu5();
                pse.b();
                tu52.a = pse.f;
                tu52.k = "application/id3";
                B2.d(new vu5(tu52));
                return;
        }
    }

    public uq4(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new ija(10);
                this.f = -9223372036854775807L;
                return;
            default:
                this.b = new yze(10);
                this.f = -9223372036854775807L;
                return;
        }
    }
}

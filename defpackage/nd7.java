package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: nd7  reason: default package */
public final class nd7 extends ol implements qce {
    public final String X;
    public final boolean Y;
    public final String Z;
    public final /* synthetic */ int o = 1;

    public nd7(long j, String str) {
        super(j);
        this.X = str;
        this.Y = false;
        this.Z = null;
    }

    public final void c(lbe lbe) {
        String str;
        jue jue;
        long j;
        switch (this.o) {
            case 0:
                pd7 pd7 = (pd7) lbe;
                String str2 = pd7.Y;
                j22 j22 = pd7.c;
                if (j22 != null) {
                    try {
                        q().k(j22);
                    } catch (TamErrorException unused) {
                    }
                    zb9 c0 = m().c0(Collections.singletonList(j22));
                    if (c0.d > 0) {
                        long[] jArr = c0.b;
                        long[] jArr2 = c0.a;
                        int length = jArr2.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j2 = jArr2[i];
                                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j2) < 128) {
                                            long j3 = jArr[(i << 3) + i3];
                                            if (pd7.X != null) {
                                                j = p().f(j3, ((j2b) r()).a.s(), pd7.X);
                                            } else {
                                                j = -1;
                                            }
                                            l().c(new qd7(this.a, Long.valueOf(j3), j, (gn3) null, (zc6) null, (s2f) null, (Long) null, str2));
                                            return;
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i2 != 8) {
                                    }
                                }
                                if (i != length) {
                                    i++;
                                }
                            }
                        }
                        throw new NoSuchElementException("The LongSet is empty");
                    }
                    return;
                }
                s2f s2f = pd7.w0;
                if (s2f != null) {
                    try {
                        q().u(s2f);
                        jue = jue.a;
                    } catch (Throwable th) {
                        jue = new kcc(th);
                    }
                    Throwable a = mcc.a(jue);
                    if (a != null) {
                        udd.s(nd7.class.getName(), "fail to fetch video conference missed ids", a);
                    }
                    l().c(new qd7(this.a, (Long) null, -1, (gn3) null, (zc6) null, s2f, (Long) null, str2));
                    return;
                }
                ytd ytd = pd7.x0;
                if (ytd != null) {
                    pl plVar = this.c;
                    if (plVar == null) {
                        plVar = null;
                    }
                    lud lud = (lud) plVar.o.getValue();
                    List singletonList = Collections.singletonList(ytd);
                    lud.getClass();
                    udd.p("lud", "storeStickerSetsFromServer: sticker sets: %s", new Object[]{singletonList});
                    rs9 v = new au9(ms9.j(singletonList), new iud(lud, 0), 3).v();
                    nud nud = lud.a;
                    Objects.requireNonNull(nud);
                    iu7.a0(new w63(v, 2, new kud(nud, 0)).f(new f5(15, singletonList)).g(new sic(14, singletonList)).k(lud.X).l(), z3d.j, new lv1(20, (Object) this), z3d.i);
                    l().c(new qd7(this.a, (Long) null, -1, (gn3) null, (zc6) null, (s2f) null, Long.valueOf(ytd.a), str2));
                    return;
                }
                gn3 gn3 = pd7.o;
                if (gn3 != null) {
                    di3 n = n();
                    uj3 uj3 = gn3.a;
                    if (n.g(uj3.a)) {
                        n().u(Collections.singletonList(uj3));
                    } else {
                        di3 n2 = n();
                        mi3 mi3 = mi3.b;
                        n2.getClass();
                        n2.t(Collections.singletonList(uj3), mi3);
                        q2b q2b = (q2b) n2.k.get();
                        l2b l = fu7.l(gn3.o);
                        q2b.getClass();
                        q2b.k(Collections.singletonMap(Long.valueOf(uj3.a), l));
                    }
                    str = str2;
                    l().c(new qd7(this.a, (Long) null, -1, gn3, (zc6) null, (s2f) null, (Long) null, str2));
                } else {
                    str = str2;
                }
                zc6 zc6 = pd7.Z;
                if (zc6 != null) {
                    l().c(new qd7(this.a, (Long) null, -1, (gn3) null, zc6, (s2f) null, (Long) null, str));
                    return;
                }
                return;
            default:
                lk1 lk1 = (lk1) lbe;
                l().c(new m21(lk1.c, lk1.Y, this.a, lk1.o));
                return;
        }
    }

    public final void d(uae uae) {
        switch (this.o) {
            case 0:
                l().c(new jh0(this.a, uae));
                return;
            default:
                l().c(new jh0(this.a, uae));
                return;
        }
    }

    public final ibe i() {
        switch (this.o) {
            case 0:
                return new od7(this.X, this.Y);
            default:
                dt dtVar = new dt((dfa) null, 10);
                dtVar.d("withJoinLink", true);
                dtVar.s(ApiProtocol.PARAM_CONVERSATION_ID, this.X);
                dtVar.s("type", this.Y ? "VIDEO" : "AUDIO");
                String str = this.Z;
                if (!r1g.p(str)) {
                    dtVar.s("sdpOffer", str);
                }
                return dtVar;
        }
    }

    public nd7(long j, String str, boolean z) {
        super(j);
        this.X = str;
        this.Y = z;
        this.Z = nd7.class.getName();
    }
}

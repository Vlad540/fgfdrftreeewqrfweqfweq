package defpackage;

import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: tn3  reason: default package */
public final class tn3 extends ig7 {
    public final /* synthetic */ int X = 0;
    public final Object Y;

    public tn3(sn3 sn3) {
        super((urd) new w04(5));
        this.Y = sn3;
        A(true);
    }

    public long k(int i) {
        switch (this.X) {
            case 0:
                return (long) hr1.t(((un3) C(i)).a);
            default:
                return super.k(i);
        }
    }

    public final int l(int i) {
        switch (this.X) {
            case 0:
                int t = hr1.t(((un3) C(i)).a);
                if (t != 0) {
                    return (t == 2 || t == 3) ? 2 : 1;
                }
                return 0;
            case 1:
                return f2a.t;
            default:
                return ((nrc) C(i)).l();
        }
    }

    public final void r(b7c b7c, int i) {
        CharSequence charSequence;
        i22 i22;
        tf3 k;
        String str;
        String str2;
        boolean z = false;
        switch (this.X) {
            case 0:
                un3 un3 = (un3) C(i);
                if (!(b7c instanceof vn3)) {
                    if (b7c instanceof po3) {
                        po3 po3 = (po3) b7c;
                        boolean z2 = j() > 1;
                        m7a m7a = po3.a;
                        int t = hr1.t(un3.a);
                        if (t == 2) {
                            m7a.setTitle(d8.u(m7a.getContext(), oz9.h));
                            m7a.setSubtitle(d8.u(m7a.getContext(), oz9.g));
                            float f = (float) 56;
                            m7a.x(gq3.b(m7a.getContext(), phc.b), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                            m7a.V0.setColors(po3.L0, new float[]{0.0f, 1.0f});
                        } else if (t == 3) {
                            m7a.setTitle(d8.u(m7a.getContext(), oz9.f));
                            m7a.setSubtitle(d8.u(m7a.getContext(), oz9.i));
                            float f2 = (float) 56;
                            m7a.x(gq3.b(m7a.getContext(), phc.v1), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density));
                            m7a.V0.setColors(po3.M0, new float[]{0.0f, 1.0f});
                        }
                        m7a.setCloseButtonVisibility(false);
                        m7a.setBannerClickListener(new ao3(po3, un3, z2, 1));
                        m7a.setCloseButtonClickListener(new ub(po3, 20, un3));
                        return;
                    } else if (b7c instanceof bo3) {
                        bo3 bo3 = (bo3) b7c;
                        boolean z3 = j() > 1;
                        n2a n2a = bo3.a;
                        int t2 = hr1.t(un3.a);
                        if (t2 != 1) {
                            int[] iArr = bo3.M0;
                            if (t2 == 4) {
                                n2a.setTitle(d8.u(n2a.getContext(), oz9.c));
                                n2a.setSubtitle(d8.u(n2a.getContext(), oz9.i));
                                float f3 = (float) 24;
                                n2a.x(gq3.b(n2a.getContext(), phc.v1), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density));
                                n2a.V0.setColors(iArr, new float[]{0.0f, 1.0f});
                            } else if (t2 == 6) {
                                n2a.setTitle(d8.u(n2a.getContext(), oz9.b));
                                n2a.setSubtitle(d8.u(n2a.getContext(), oz9.a));
                                float f4 = (float) 24;
                                n2a.x(gq3.b(n2a.getContext(), phc.W0), a24.X(dh4.c().getDisplayMetrics().density * f4), a24.X(f4 * dh4.c().getDisplayMetrics().density));
                                n2a.V0.setColors(iArr, new float[]{0.0f, 1.0f});
                            }
                        } else {
                            n2a.setTitle(d8.u(n2a.getContext(), oz9.e));
                            n2a.setSubtitle(d8.u(n2a.getContext(), oz9.d));
                            float f5 = (float) 24;
                            n2a.x(gq3.b(n2a.getContext(), phc.b), a24.X(dh4.c().getDisplayMetrics().density * f5), a24.X(f5 * dh4.c().getDisplayMetrics().density));
                            n2a.V0.setColors(bo3.L0, new float[]{0.0f, 1.0f});
                        }
                        n2a.setCloseButtonVisibility(false);
                        n2a.setBannerClickListener(new ao3(bo3, un3, z3, 0));
                        n2a.setCloseButtonClickListener(new ub(bo3, 19, un3));
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                ((x1c) ((y1c) b7c).a).setContacts((List) C(i));
                return;
            default:
                nrc nrc = (nrc) C(i);
                if (nrc instanceof rn2) {
                    rn2 rn2 = (rn2) nrc;
                    wqc wqc = new wqc(this, 0);
                    xqc xqc = new xqc(this, 0);
                    p32 p32 = ((sn2) b7c).a;
                    a24.Z(p32, 300, new ub(wqc, 13, rn2));
                    p32.setOnLongClickListener(new d32(xqc, rn2, p32, 3));
                    int id = p32.getId();
                    p32.setId(Long.hashCode(rn2.c));
                    q1b q1b = rn2.B0;
                    p32.setTitle(p32.b(q1b.a.toString()) ? udd.O(q1b.a, rn2.b, q1b.b) : q1b.a);
                    p32.setSubtitle(rn2.C0);
                    Uri uri = rn2.z0;
                    if (uri == null) {
                        p32.d(rn2.I0, Long.valueOf(rn2.A0));
                    } else {
                        p32.setAvatar(uri);
                    }
                    p32.setPinned(rn2.o);
                    p32.setMuted(rn2.X);
                    p32.setMention(rn2.Y);
                    p32.setReaction(rn2.Z);
                    p32.setTime(rn2.w0);
                    if (id == p32.getId()) {
                        z = true;
                    }
                    p32.f(rn2.x0, z);
                    p32.setStatus(rn2.y0);
                    p32.setVerified(rn2.J0);
                    return;
                } else if (nrc instanceof w96) {
                    w96 w96 = (w96) nrc;
                    ka kaVar = new ka(this, 28, (w96) nrc);
                    vg0 vg0 = new vg0(24);
                    p32 p322 = ((x96) b7c).a;
                    a24.Z(p322, 300, new xv5(kaVar, 1, w96));
                    p322.setOnLongClickListener(new d32(vg0, w96, p322, 9));
                    long j = w96.c;
                    p322.setId(Long.hashCode(j));
                    q1b q1b2 = w96.Y;
                    boolean b = p322.b(q1b2.a.toString());
                    List list = w96.b;
                    p322.setTitle(b ? udd.O(q1b2.a, list, q1b2.b) : q1b2.a);
                    q1b q1b3 = w96.Z;
                    CharSequence charSequence2 = q1b3.a;
                    if (p322.a(charSequence2.toString())) {
                        charSequence2 = udd.O(charSequence2, list, q1b3.b);
                    }
                    p322.setSubtitle(charSequence2);
                    Uri uri2 = w96.X;
                    if (uri2 == null) {
                        p322.d(w96.y0, Long.valueOf(j));
                    } else {
                        p322.setAvatar(uri2);
                    }
                    p322.setTime(w96.o);
                    p322.setVerified(w96.z0);
                    return;
                } else if (nrc instanceof fn3) {
                    fn3 fn3 = (fn3) nrc;
                    wqc wqc2 = new wqc(this, 1);
                    xqc xqc2 = new xqc(this, 1);
                    kh3 kh3 = (kh3) ((hn3) b7c).a;
                    a24.Z(kh3, 300, new ub(wqc2, 18, fn3));
                    kh3.setOnLongClickListener(new d32(xqc2, fn3, kh3, 5));
                    Uri uri3 = fn3.x0;
                    if (uri3 == null || (str2 = uri3.toString()) == null) {
                        str2 = Uri.EMPTY.toString();
                    }
                    kh3.O(fn3.c, fn3.y0, str2);
                    kh3.setName(fn3.o);
                    kh3.setMessage(fn3.X);
                    kh3.setVerified(fn3.Z);
                    return;
                } else if (nrc instanceof ba6) {
                    ba6 ba6 = (ba6) nrc;
                    wqc wqc3 = new wqc(this, 2);
                    kh3 kh32 = (kh3) ((ca6) b7c).a;
                    a24.Z(kh32, 300, new xv5(wqc3, 3, ba6));
                    q1b q1b4 = ba6.X;
                    boolean M = kh32.M(q1b4.a.toString());
                    List list2 = ba6.b;
                    kh32.setName(M ? udd.O(q1b4.a, list2, q1b4.b) : q1b4.a);
                    q1b q1b5 = ba6.Y;
                    kh32.setMessage(kh32.L(q1b5.a.toString()) ? udd.O(q1b5.a, list2, q1b5.b) : q1b5.a);
                    Uri uri4 = ba6.x0;
                    if (uri4 == null || (str = uri4.toString()) == null) {
                        str = Uri.EMPTY.toString();
                    }
                    kh32.O(ba6.c, ba6.o, str);
                    kh32.setVerified(ba6.w0);
                    return;
                } else if (nrc instanceof cs8) {
                    cs8 cs8 = (cs8) nrc;
                    wqc wqc4 = new wqc(this, 3);
                    p32 p323 = ((es8) b7c).a;
                    a24.Z(p323, 300, new xv5(wqc4, 15, cs8));
                    if (cs8.Y != null) {
                        p323.setTitle(cs8.x0);
                        Uri uri5 = cs8.c;
                        if (uri5 == null) {
                            i22 i222 = cs8.Y;
                            i222.i0();
                            p323.d(i222.B0, Long.valueOf(cs8.Y.e()));
                        } else {
                            p323.setAvatar(uri5);
                        }
                    }
                    if (p323.a(cs8.w0.a.toString())) {
                        q1b q1b6 = cs8.w0;
                        charSequence = udd.O(q1b6.a, cs8.b, q1b6.b);
                    } else {
                        charSequence = cs8.w0.a;
                    }
                    p323.setSubtitle(charSequence);
                    w6a o = nqc.a.o();
                    long j2 = cs8.X.b;
                    i03 i03 = o.c;
                    p323.setTime(xs7.o(o.a, i03.u(), j2, i03.m(), true));
                    i22 i223 = cs8.Y;
                    if ((i223 != null && i223.U()) || !((i22 = cs8.Y) == null || (k = i22.k()) == null || !k.u())) {
                        z = true;
                    }
                    p323.setVerified(z);
                    return;
                } else {
                    return;
                }
        }
    }

    public void s(b7c b7c, int i, List list) {
        switch (this.X) {
            case 2:
                r(b7c, i);
                return;
            default:
                super.s(b7c, i, list);
                return;
        }
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                sn3 sn3 = (sn3) this.Y;
                return i != 0 ? (i == 2 || i == 3) ? new po3(viewGroup.getContext(), sn3) : new bo3(viewGroup.getContext(), sn3) : new vn3(viewGroup.getContext(), sn3);
            case 1:
                return new b7c(new x1c(viewGroup.getContext(), (ur2) this.Y));
            default:
                if (i == f2a.l) {
                    return new b7c(new p32(viewGroup.getContext()));
                }
                if (i == f2a.o) {
                    return new b7c(new p32(viewGroup.getContext()));
                }
                if (i == f2a.m) {
                    return new b7c(new kh3(viewGroup.getContext(), (AttributeSet) null));
                }
                if (i == f2a.p) {
                    return new b7c(new kh3(viewGroup.getContext(), (AttributeSet) null));
                }
                if (i == f2a.r) {
                    return new b7c(new p32(viewGroup.getContext()));
                }
                throw new IllegalArgumentException(wn6.h(i, "Unsupported view type: "));
        }
    }

    public tn3(ur2 ur2, ExecutorService executorService) {
        super(new qe4((Object) executorService, 4, (Object) new w04(7)));
        this.Y = ur2;
    }

    public tn3(yqc yqc, ExecutorService executorService) {
        super(new qe4((Object) executorService, 4, (Object) new w04(8)));
        this.Y = yqc;
    }
}

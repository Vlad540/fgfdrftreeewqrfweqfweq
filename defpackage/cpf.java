package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.tamtam.nano.Protos;

/* renamed from: cpf  reason: default package */
public final class cpf extends jgd {
    public final /* synthetic */ int X;
    public final Object Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cpf(Object obj, ExecutorService executorService, int i) {
        super(executorService);
        this.X = i;
        this.Y = obj;
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [android.view.View, n7d] */
    public void H(chd chd, int i) {
        chd chd2 = chd;
        int i2 = i;
        switch (this.X) {
            case 0:
                if (chd2 instanceof apf) {
                    apf apf = (apf) chd2;
                    apf.A((pg7) C(i2));
                    zof zof = (zof) this.Y;
                    p7d p7d = new p7d(apf, 13, zof);
                    View view = apf.a;
                    a24.a0(view, p7d);
                    ((n7d) view).setOnSwitchCheckedListener(new ck3(apf, 3, zof));
                    return;
                } else if (chd2 instanceof bpf) {
                    bpf bpf = (bpf) chd2;
                    h87 h87 = new h87(1, (zof) this.Y, zof.class, "onItemClick", "onItemClick(Lone/me/webapp/model/WebAppsSectionItem;)V", 0, 18);
                    bpf.A((pg7) C(i2));
                    a24.a0(bpf.a, new p7d(bpf, 14, h87));
                    return;
                } else {
                    return;
                }
            case 1:
                mu muVar = this.o;
                int l = ((pg7) muVar.f.get(i2)).l();
                int i3 = o1a.K0;
                ma maVar = (ma) this.Y;
                if (l == i3) {
                    la laVar = (la) chd2;
                    aze aze = (pg7) C(i2);
                    if (aze instanceof aze) {
                        laVar.F(aze);
                        kh3 kh3 = laVar.a;
                        kh3.N();
                        kh3.Q(laVar.J0, laVar.K0, new ka(maVar, 0, aze));
                        return;
                    }
                    return;
                } else if (((pg7) muVar.f.get(i2)).l() == o1a.H0) {
                    ja jaVar = (ja) chd2;
                    bze bze = (pg7) C(i2);
                    if (bze instanceof bze) {
                        View view2 = jaVar.a;
                        ((n7d) view2).setModelItem(bze);
                        a24.a0(view2, new d5(7, (Object) maVar));
                        return;
                    }
                    return;
                } else {
                    chd2.A((pg7) C(i2));
                    return;
                }
            case 2:
                J((gq) chd2, i2);
                return;
            case 3:
                if (chd2 instanceof n81) {
                    n81 n81 = (n81) chd2;
                    ua1 ua1 = (pg7) C(i2);
                    if (ua1 instanceof ua1) {
                        n81.A(ua1);
                        a24.a0((n7d) n81.a, new ub((Object) (c9) this.Y, 3, (Object) ua1));
                        return;
                    }
                    return;
                }
                chd2.A((pg7) C(i2));
                return;
            case 4:
                K((xk3) chd2, i2);
                return;
            case 5:
                rv3 rv3 = (rv3) chd2;
                qv3 qv3 = (qv3) ((pg7) C(i2));
                gw2 gw2 = new gw2(6, this);
                rv3.A(qv3);
                ((LinearLayout) rv3.a).setOnClickListener(new ub((Object) gw2, 25, (Object) qv3));
                return;
            case 6:
                int l2 = ((pg7) C(i2)).l();
                int i4 = f2a.u;
                mu muVar2 = this.o;
                if (l2 == i4) {
                    w75 w75 = (w75) chd2;
                    y75 y75 = (y75) muVar2.f.get(i2);
                    f fVar = new f(1, (b85) this.Y, b85.class, "onFakeChatItemClick", "onFakeChatItemClick(J)V", 0, 19);
                    zv zvVar = new zv(2, (b85) this.Y, b85.class, "onFakeChatItemLongTap", "onFakeChatItemLongTap(JLandroid/view/View;)V", 0, 18);
                    f fVar2 = new f(1, (b85) this.Y, b85.class, "onFakeChatItemButtonClick", "onFakeChatItemButtonClick(J)V", 0, 20);
                    w75.F(y75);
                    p32 p32 = (p32) w75.a;
                    a24.a0(p32, new sx0(y75, fVar, fVar2, 1));
                    p32.setOnLongClickListener(new d32(zvVar, y75, w75, 6));
                    return;
                } else if (l2 == f2a.v) {
                    a85 a85 = (a85) chd2;
                    y75 y752 = (y75) muVar2.f.get(i2);
                    f fVar3 = new f(1, (b85) this.Y, b85.class, "onFakeChatItemClick", "onFakeChatItemClick(J)V", 0, 21);
                    zv zvVar2 = new zv(2, (b85) this.Y, b85.class, "onFakeChatItemLongTap", "onFakeChatItemLongTap(JLandroid/view/View;)V", 0, 19);
                    f fVar4 = new f(1, (b85) this.Y, b85.class, "onFakeChatItemButtonClick", "onFakeChatItemButtonClick(J)V", 0, 22);
                    a85.F(y752);
                    kh3 kh32 = a85.a;
                    a85.J0 = fVar3;
                    a85.K0 = fVar4;
                    if (y752.Z) {
                        a24.a0(kh32, new z75(a85, y752, 0));
                        kh32.N();
                    } else {
                        a24.a0(kh32, new z75(a85, y752, 1));
                        CharSequence charSequence = y752.Y;
                        if (charSequence != null) {
                            kh32.P(charSequence, new zu4((Object) fVar4, 4, (Object) y752));
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    kh32.setOnLongClickListener(new d32(zvVar2, y752, a85, 7));
                    return;
                } else {
                    return;
                }
            case 7:
                L((aa6) chd2, i2);
                return;
            case 8:
                M((v07) chd2, i2);
                return;
            case 9:
                N((fi8) chd2, i2);
                return;
            case 10:
                O((w9b) chd2, i2);
                return;
            case 11:
                O((w9b) chd2, i2);
                return;
            default:
                super.r(chd, i);
                return;
        }
    }

    public void J(gq gqVar, int i) {
        dq dqVar = (dq) this.o.f.get(i);
        f fVar = new f(1, (mq) this.Y, mq.class, "onAppearanceModeSelected", "onAppearanceModeSelected(Lone/me/appearancesettings/model/AppearanceMode;)V", 0, 1);
        gqVar.F(dqVar);
        a24.a0(gqVar.a, new fq(fVar, 0, dqVar));
    }

    public void K(xk3 xk3, int i) {
        lk3 lk3 = (pg7) C(i);
        gw2 gw2 = new gw2(2, this);
        ck3 ck3 = new ck3(lk3, 0, this);
        ka kaVar = new ka(lk3, 9, this);
        bk bkVar = new bk(6, this);
        xk3.F(lk3);
        ub ubVar = new ub((Object) kaVar, 17, (Object) lk3);
        kh3 kh3 = xk3.a;
        a24.a0(kh3, ubVar);
        kh3 kh32 = kh3;
        kh32.setOnLongClickListener(new eb1(ck3, 2, lk3));
        if (!lk3.C0 || lk3.z0) {
            CharSequence charSequence = lk3.Y;
            if (charSequence != null) {
                kh32.P(charSequence, new x2(gw2, 28, lk3));
            } else {
                kh32.N();
            }
        } else {
            kh32.setCallButtons(new ka(bkVar, 11, lk3));
        }
        kh3 kh33 = kh3;
        Boolean bool = lk3.B0;
        boolean z = false;
        kh33.setSelectionEnabled(bool != null);
        if (bool != null) {
            z = bool.booleanValue();
        }
        kh33.setContactSelected(z);
    }

    public void L(aa6 aa6, int i) {
        aa6 aa62 = aa6;
        z96 z96 = (pg7) C(i);
        f fVar = new f(1, (y96) this.Y, y96.class, "onGlobalContactClick", "onGlobalContactClick(Lone/me/contactlist/recyclerview/adapter/search/GlobalContactListItem;)V", 0, 25);
        zv zvVar = new zv(2, (y96) this.Y, y96.class, "onGlobalContactCallClick", "onGlobalContactCallClick(Lone/me/contactlist/recyclerview/adapter/search/GlobalContactListItem;Z)V", 0, 20);
        aa62.F(z96);
        kh3 kh3 = aa62.a;
        a24.a0(kh3, new xv5(fVar, 2, z96));
        if (z96.w0) {
            kh3.setCallButtons(new ka(zvVar, 15, z96));
        } else {
            kh3.N();
        }
    }

    public void M(v07 v07, int i) {
        t07 t07 = (pg7) C(i);
        f fVar = new f(1, (w07) this.Y, w07.class, "onInviteActionClick", "onInviteActionClick(Lone/me/inviteactions/list/InviteActionListItem$Type;)V", 0, 27);
        v07.F(t07);
        a24.a0(v07.a, new xv5(fVar, 5, t07));
    }

    public void N(fi8 fi8, int i) {
        zv zvVar;
        ei8 ei8 = (ei8) ((pg7) C(i));
        if (ei8.w0 || ei8.x0) {
            zvVar = null;
        } else {
            zvVar = new zv(2, (zi8) this.Y, zi8.class, "onMemberLongClick", "onMemberLongClick(JLandroid/view/View;)V", 0, 25);
        }
        ka kaVar = new ka(ei8, 18, this);
        fi8.A(ei8);
        kh3 kh3 = fi8.a;
        a24.a0(kh3, new xv5(kaVar, 13, ei8));
        if (zvVar != null) {
            kh3.setOnLongClickListener(new eb1(zvVar, 4, ei8));
        } else {
            kh3.setOnLongClickListener((View.OnLongClickListener) null);
            kh3.setLongClickable(false);
        }
        kh3.N();
    }

    public void O(w9b w9b, int i) {
        switch (this.X) {
            case 10:
                q8b q8b = (q8b) ((pg7) C(i));
                w9b.A(q8b);
                b7c b7c = null;
                if (q8b instanceof cwc) {
                    if (w9b instanceof dwc) {
                        b7c = (dwc) w9b;
                    }
                    if (b7c != null) {
                        a24.a0(b7c.a, new xv5(b7c, 27, new r5b(this, 0)));
                        return;
                    }
                    return;
                } else if (q8b instanceof odd) {
                    if (w9b instanceof rdd) {
                        b7c = (rdd) w9b;
                    }
                    if (b7c != null) {
                        b7c.L0.addTextChangedListener(new ae1(b7c, 9, new r5b(this, 1)));
                        a24.a0(b7c.P0, new q6(24, new s5b(this, 0)));
                        a24.a0(b7c.M0, new q6(25, new s5b(this, 1)));
                        a24.a0(b7c.N0, new p7d(b7c, 3, new s5b(this, 2)));
                        return;
                    }
                    return;
                } else if (q8b instanceof b7) {
                    if (w9b instanceof r6) {
                        b7c = (r6) w9b;
                    }
                    if (b7c != null) {
                        a24.a0(b7c.a, new q6(0, new nya(this, 1, q8b)));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                q8b q8b2 = (q8b) ((pg7) C(i));
                w9b.A(q8b2);
                b7c b7c2 = null;
                if (q8b2 instanceof th5) {
                    if (w9b instanceof uh5) {
                        b7c2 = (uh5) w9b;
                    }
                    if (b7c2 != null) {
                        b7c2.J0.addTextChangedListener(new ae1(new s9b(this, 0), 3, b7c2));
                        return;
                    }
                    return;
                } else if (q8b2 instanceof j97) {
                    if (w9b instanceof k97) {
                        b7c2 = (k97) w9b;
                    }
                    if (b7c2 != null) {
                        b7c2.J0.addTextChangedListener(new ae1(new s9b(this, 1), 6, b7c2));
                        return;
                    }
                    return;
                } else if (q8b2 instanceof qi2) {
                    if (w9b instanceof ri2) {
                        b7c2 = (ri2) w9b;
                    }
                    if (b7c2 != null) {
                        b7c2.J0.b(new ka(new s9b(this, 2), 4, b7c2));
                        return;
                    }
                    return;
                } else if (q8b2 instanceof ve4) {
                    if (w9b instanceof ye4) {
                        b7c2 = (ye4) w9b;
                    }
                    if (b7c2 != null) {
                        s9b s9b = new s9b(this, 3);
                        xe4 xe4 = (xe4) b7c2.a;
                        e12 e12 = new e12(1, s9b);
                        xe4.getClass();
                        xe4.x0.addTextChangedListener(new ae1(e12, 2, xe4));
                        return;
                    }
                    return;
                } else if (q8b2 instanceof dv6) {
                    if (w9b instanceof ev6) {
                        b7c2 = (ev6) w9b;
                    }
                    if (b7c2 != null) {
                        a24.a0(b7c2.a, new q6(12, new t9b(this, 0)));
                        return;
                    }
                    return;
                } else if (q8b2 instanceof ge4) {
                    if (w9b instanceof fe4) {
                        b7c2 = (fe4) w9b;
                    }
                    if (b7c2 != null) {
                        a24.a0(b7c2.a, new q6(8, new t9b(this, 1)));
                        return;
                    }
                    return;
                } else if (q8b2 instanceof mv1) {
                    if (w9b instanceof nv1) {
                        b7c2 = (nv1) w9b;
                    }
                    if (b7c2 != null) {
                        a24.a0(b7c2.J0, new q6(2, new t9b(this, 2)));
                        return;
                    }
                    return;
                } else if (q8b2 instanceof b7) {
                    if (w9b instanceof r6) {
                        b7c2 = (r6) w9b;
                    }
                    if (b7c2 != null) {
                        a24.a0(b7c2.a, new q6(0, new nya(this, 5, q8b2)));
                        return;
                    }
                    return;
                } else if (q8b2 instanceof op7) {
                    if (w9b instanceof qp7) {
                        b7c2 = (qp7) w9b;
                    }
                    if (b7c2 != null) {
                        a24.a0(b7c2.a, new q6(14, new t9b(this, 3)));
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }

    public int l(int i) {
        switch (this.X) {
            case 5:
                qv3 qv3 = (qv3) ((pg7) C(i));
                return kca.n;
            case 6:
                return ((pg7) C(i)).l();
            case 7:
                return ((pg7) C(i)).x0;
            case 8:
                return ((pg7) C(i)).o;
            case 9:
                ei8 ei8 = (ei8) ((pg7) C(i));
                return 1;
            case 10:
                return ((q8b) ((pg7) C(i))).l();
            case 11:
                return ((q8b) ((pg7) C(i))).l();
            case Protos.Attaches.Attach.PRESENT /*12*/:
                p2c p2c = (pg7) C(i);
                return p2c.b;
            case 13:
                return ((pg7) C(i)).l();
            default:
                return super.l(i);
        }
    }

    public void r(b7c b7c, int i) {
        switch (this.X) {
            case 0:
                H((chd) b7c, i);
                return;
            case 1:
                H((chd) b7c, i);
                return;
            case 2:
                J((gq) b7c, i);
                return;
            case 3:
                H((chd) b7c, i);
                return;
            case 4:
                K((xk3) b7c, i);
                return;
            case 5:
                rv3 rv3 = (rv3) b7c;
                qv3 qv3 = (qv3) ((pg7) C(i));
                gw2 gw2 = new gw2(6, this);
                rv3.A(qv3);
                ((LinearLayout) rv3.a).setOnClickListener(new ub((Object) gw2, 25, (Object) qv3));
                return;
            case 6:
                H((chd) b7c, i);
                return;
            case 7:
                L((aa6) b7c, i);
                return;
            case 8:
                M((v07) b7c, i);
                return;
            case 9:
                N((fi8) b7c, i);
                return;
            case 10:
                O((w9b) b7c, i);
                return;
            case 11:
                O((w9b) b7c, i);
                return;
            default:
                super.r(b7c, i);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: ri2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: k97} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: uh5} */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(b7c r4, int r5, java.util.List r6) {
        /*
            r3 = this;
            int r0 = r3.X
            switch(r0) {
                case 2: goto L_0x013c;
                case 4: goto L_0x0111;
                case 6: goto L_0x00d3;
                case 10: goto L_0x009b;
                case 11: goto L_0x003a;
                case 13: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            defpackage.cpf.super.s(r4, r5, r6)
            return
        L_0x0009:
            chd r4 = (defpackage.chd) r4
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0012
            goto L_0x0036
        L_0x0012:
            java.util.Iterator r0 = r6.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            boolean r1 = r1 instanceof defpackage.jtd
            if (r1 == 0) goto L_0x0016
            mu r3 = r3.o
            java.util.List r3 = r3.f
            java.lang.Object r3 = r3.get(r5)
            pg7 r3 = (defpackage.pg7) r3
            java.lang.Object r5 = o23.V(r6)
            r4.B(r3, r5)
            goto L_0x0039
        L_0x0036:
            r3.r(r4, r5)
        L_0x0039:
            return
        L_0x003a:
            w9b r4 = (defpackage.w9b) r4
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0045
            r3.O(r4, r5)
        L_0x0045:
            java.util.Iterator r3 = r6.iterator()
        L_0x0049:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x009a
            java.lang.Object r5 = r3.next()
            boolean r6 = r5 instanceof defpackage.j9b
            if (r6 == 0) goto L_0x0049
            r6 = r5
            j9b r6 = (defpackage.j9b) r6
            boolean r0 = r6 instanceof defpackage.g9b
            r1 = 0
            if (r0 == 0) goto L_0x0070
            boolean r6 = r4 instanceof defpackage.uh5
            if (r6 == 0) goto L_0x0066
            r1 = r4
            uh5 r1 = (defpackage.uh5) r1
        L_0x0066:
            if (r1 == 0) goto L_0x0049
            g9b r5 = (defpackage.g9b) r5
            r33 r5 = r5.a
            r1.F(r5)
            goto L_0x0049
        L_0x0070:
            boolean r0 = r6 instanceof defpackage.h9b
            if (r0 == 0) goto L_0x0085
            boolean r6 = r4 instanceof defpackage.k97
            if (r6 == 0) goto L_0x007b
            r1 = r4
            k97 r1 = (defpackage.k97) r1
        L_0x007b:
            if (r1 == 0) goto L_0x0049
            h9b r5 = (defpackage.h9b) r5
            r33 r5 = r5.a
            r1.F(r5)
            goto L_0x0049
        L_0x0085:
            boolean r6 = r6 instanceof defpackage.f9b
            if (r6 == 0) goto L_0x0049
            boolean r6 = r4 instanceof defpackage.ri2
            if (r6 == 0) goto L_0x0090
            r1 = r4
            ri2 r1 = (defpackage.ri2) r1
        L_0x0090:
            if (r1 == 0) goto L_0x0049
            f9b r5 = (defpackage.f9b) r5
            r33 r5 = r5.a
            r1.F(r5)
            goto L_0x0049
        L_0x009a:
            return
        L_0x009b:
            w9b r4 = (defpackage.w9b) r4
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x00a6
            r3.O(r4, r5)
        L_0x00a6:
            java.util.Iterator r3 = r6.iterator()
        L_0x00aa:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00d2
            java.lang.Object r5 = r3.next()
            boolean r6 = r5 instanceof defpackage.j9b
            if (r6 == 0) goto L_0x00aa
            r6 = r5
            j9b r6 = (defpackage.j9b) r6
            boolean r6 = r6 instanceof defpackage.i9b
            if (r6 == 0) goto L_0x00aa
            boolean r6 = r4 instanceof defpackage.rdd
            if (r6 == 0) goto L_0x00c7
            r6 = r4
            rdd r6 = (defpackage.rdd) r6
            goto L_0x00c8
        L_0x00c7:
            r6 = 0
        L_0x00c8:
            if (r6 == 0) goto L_0x00aa
            i9b r5 = (defpackage.i9b) r5
            n06 r5 = r5.a
            r6.F(r5)
            goto L_0x00aa
        L_0x00d2:
            return
        L_0x00d3:
            chd r4 = (defpackage.chd) r4
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x010d
            x75 r0 = new x75
            r1 = 7
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x00e7:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x00ff
            java.lang.Object r1 = r6.next()
            boolean r2 = r1 instanceof x75
            if (r2 == 0) goto L_0x00f8
            x75 r1 = (x75) r1
            goto L_0x00f9
        L_0x00f8:
            r1 = 0
        L_0x00f9:
            if (r1 == 0) goto L_0x00e7
            r0.M1(r1)
            goto L_0x00e7
        L_0x00ff:
            mu r3 = r3.o
            java.util.List r3 = r3.f
            java.lang.Object r3 = r3.get(r5)
            pg7 r3 = (defpackage.pg7) r3
            r4.B(r3, r0)
            goto L_0x0110
        L_0x010d:
            r3.H(r4, r5)
        L_0x0110:
            return
        L_0x0111:
            xk3 r4 = (xk3) r4
            java.lang.Object r6 = o23.f0(r6)
            if (r6 == 0) goto L_0x0138
            boolean r3 = r6 instanceof kk3
            if (r3 == 0) goto L_0x013b
            kk3 r6 = (kk3) r6
            android.view.View r3 = r4.a
            kh3 r3 = (kh3) r3
            java.lang.Boolean r4 = r6.a
            r5 = 0
            if (r4 == 0) goto L_0x012a
            r6 = 1
            goto L_0x012b
        L_0x012a:
            r6 = r5
        L_0x012b:
            r3.setSelectionEnabled(r6)
            if (r4 == 0) goto L_0x0134
            boolean r5 = r4.booleanValue()
        L_0x0134:
            r3.setContactSelected(r5)
            goto L_0x013b
        L_0x0138:
            r3.K(r4, r5)
        L_0x013b:
            return
        L_0x013c:
            gq r4 = (gq) r4
            java.lang.Object r6 = o23.f0(r6)
            if (r6 == 0) goto L_0x015c
            boolean r3 = r6 instanceof cq
            if (r3 == 0) goto L_0x015f
            cq r6 = (cq) r6
            android.view.View r3 = r4.a
            eq r3 = (eq) r3
            java.lang.Boolean r4 = r6.a
            if (r4 == 0) goto L_0x0157
            boolean r4 = r4.booleanValue()
            goto L_0x0158
        L_0x0157:
            r4 = 0
        L_0x0158:
            r3.setSelected(r4)
            goto L_0x015f
        L_0x015c:
            r3.J(r4, r5)
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpf.s(b7c, int, java.util.List):void");
    }

    /* JADX WARNING: type inference failed for: r13v3, types: [android.view.View, n7d] */
    /* JADX WARNING: type inference failed for: r13v4, types: [android.view.View, n7d] */
    /* JADX WARNING: type inference failed for: r13v8, types: [android.view.View, n7d] */
    /* JADX WARNING: type inference failed for: r13v10, types: [android.view.View, n7d] */
    public final b7c t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                if (i == vea.e) {
                    Context context = viewGroup.getContext();
                    n6c n6c = new n6c(-1, -2);
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setLayoutParams(n6c);
                    linearLayout.setOrientation(1);
                    ImageView imageView = new ImageView(context);
                    imageView.setBackground(new ShapeDrawable(new OvalShape()));
                    float f = (float) 54;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                    float f2 = (float) 20;
                    layoutParams.topMargin = a24.X(dh4.c().getDisplayMetrics().density * f2);
                    layoutParams.bottomMargin = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                    layoutParams.gravity = 1;
                    imageView.setLayoutParams(layoutParams);
                    me4.o((float) 15, dh4.c().getDisplayMetrics().density, imageView);
                    imageView.setImageResource(phc.U1);
                    urd.B(new ac2(3, (Continuation) null, 10), imageView);
                    linearLayout.addView(imageView);
                    int X2 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                    TextView textView = new TextView(context);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.leftMargin = X2;
                    layoutParams2.rightMargin = X2;
                    layoutParams2.bottomMargin = X2;
                    layoutParams2.gravity = 1;
                    textView.setLayoutParams(layoutParams2);
                    textView.setGravity(17);
                    textView.setText(xea.k);
                    nte.i.b(textView, yq4.b);
                    urd.B(new y9(3, (Continuation) null, 27), textView);
                    linearLayout.addView(textView);
                    TextView textView2 = new TextView(context);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams3.leftMargin = X2;
                    layoutParams3.rightMargin = X2;
                    layoutParams3.bottomMargin = a24.X(f2 * dh4.c().getDisplayMetrics().density);
                    layoutParams3.gravity = 1;
                    textView2.setLayoutParams(layoutParams3);
                    textView2.setGravity(17);
                    textView2.setText(xea.j);
                    nte.f.b(textView2, yq4.b);
                    urd.B(new y9(3, (Continuation) null, 28), textView2);
                    linearLayout.addView(textView2);
                    return new rx0(linearLayout, 19);
                } else if (i == vea.h) {
                    return new b7c(new n7d(viewGroup.getContext(), (AttributeSet) null));
                } else {
                    if (i == vea.g) {
                        return new b7c(new n7d(viewGroup.getContext(), (AttributeSet) null));
                    }
                    String name = cpf.class.getName();
                    fn6 fn6 = udd.e;
                    if (fn6 != null && fn6.c()) {
                        fn6.d(tn7.Z, name, wn6.h(i, "unknown item viewType: "), (Throwable) null);
                    }
                    return new rx0(new View(viewGroup.getContext()), 20);
                }
            case 1:
                if (i == o1a.K0) {
                    return new la(viewGroup.getContext());
                }
                if (i == o1a.H0) {
                    ? n7d = new n7d(viewGroup.getContext(), (AttributeSet) null);
                    b7c b7c = new b7c(n7d);
                    n7d.setThemeDepended(j7d.b);
                    return b7c;
                }
                throw new IllegalStateException(("unknown item viewType " + i).toString());
            case 2:
                return new b7c(new eq(viewGroup.getContext(), (AttributeSet) null));
            case 3:
                return new b7c(new n7d(viewGroup.getContext(), (AttributeSet) null));
            case 4:
                return new b7c(new kh3(viewGroup.getContext(), (AttributeSet) null));
            case 5:
                return new rv3(viewGroup);
            case 6:
                if (i == f2a.u) {
                    return new b7c(new p32(viewGroup.getContext()));
                }
                if (i == f2a.v) {
                    return new b7c(new kh3(viewGroup.getContext(), (AttributeSet) null));
                }
                throw new IllegalArgumentException(rf0.f(i, "Unknown viewType '", "'"));
            case 7:
                return new b7c(new kh3(viewGroup.getContext(), (AttributeSet) null));
            case 8:
                return new b7c(new u07(viewGroup.getContext()));
            case 9:
                return new b7c(new kh3(viewGroup.getContext(), (AttributeSet) null));
            case 10:
                int i2 = 536870911 & i;
                if (jjd.m(i2, 8192)) {
                    return new dwc(viewGroup.getContext());
                }
                if (jjd.m(i2, 8)) {
                    return new axa(viewGroup.getContext(), 2);
                }
                if (jjd.m(i2, 16)) {
                    return new rdd(viewGroup.getContext());
                }
                if (jjd.m(i2, 2048)) {
                    return new axa(viewGroup.getContext(), 1);
                }
                if (jjd.m(i2, 65536)) {
                    TextView textView3 = new TextView(viewGroup.getContext());
                    axa axa = new axa(textView3);
                    textView3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    textView3.setGravity(17);
                    float f3 = (float) 12;
                    float f4 = (float) 28;
                    textView3.setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f4), a24.X(f3 * dh4.c().getDisplayMetrics().density), a24.X(f4 * dh4.c().getDisplayMetrics().density));
                    nte.m.b(textView3, yq4.b);
                    return axa;
                } else if (jjd.m(i2, 1024)) {
                    return new r6(viewGroup.getContext());
                } else {
                    throw new IllegalStateException(("unknown item viewType: " + i).toString());
                }
            case 11:
                int i3 = 536870911 & i;
                if (jjd.m(i3, 1)) {
                    return new uh5(viewGroup.getContext());
                }
                if (jjd.m(i3, 2)) {
                    return new k97(viewGroup.getContext());
                }
                if (jjd.m(i3, 131072)) {
                    return new ri2(viewGroup.getContext());
                }
                if (jjd.m(i3, 4)) {
                    xe4 xe4 = new xe4(viewGroup.getContext());
                    b7c b7c2 = new b7c(xe4);
                    xe4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    return b7c2;
                } else if (jjd.m(i3, 64)) {
                    return new ev6(viewGroup.getContext());
                } else {
                    if (jjd.m(i3, 128)) {
                        return new fe4(viewGroup.getContext());
                    }
                    if (jjd.m(i3, 256)) {
                        return new nv1(viewGroup.getContext());
                    }
                    if (jjd.m(i3, 512)) {
                        OneMeButton oneMeButton = new OneMeButton(viewGroup.getContext(), (AttributeSet) null);
                        b7c b7c3 = new b7c(oneMeButton);
                        oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        oneMeButton.setGravity(17);
                        oneMeButton.setSize(v0a.c);
                        oneMeButton.setMode(u0a.b);
                        oneMeButton.setAppearance(s0a.c);
                        oneMeButton.setText(i8a.v0);
                        return b7c3;
                    } else if (jjd.m(i3, 1024)) {
                        return new r6(viewGroup.getContext());
                    } else {
                        if (jjd.m(i3, 2048)) {
                            return new axa(viewGroup.getContext(), 1);
                        }
                        throw new IllegalStateException(("unknown item viewType: " + i).toString());
                    }
                }
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new rx0(new q2c(new e78(0, (es2) this.Y, es2.class, "onClearClick", "onClearClick()V", 0, 8), viewGroup.getContext()), 11);
            default:
                return lhd.o((lhd) this.Y, viewGroup.getContext(), i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cpf(ExecutorService executorService, Object obj, int i) {
        super(executorService);
        this.X = i;
        this.Y = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cpf(ExecutorService executorService, htd htd) {
        super(executorService);
        this.X = 13;
        this.Y = new lhd(29, (Object) htd);
    }
}

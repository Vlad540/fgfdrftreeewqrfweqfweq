package defpackage;

import android.view.View;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;

/* renamed from: mr5  reason: default package */
public final class mr5 extends jgd {
    public final /* synthetic */ int X;
    public Object Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mr5(Object obj, ExecutorService executorService, int i) {
        super(executorService);
        this.X = i;
        this.Y = obj;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [mr5, jgd, ig7, java.lang.Object] */
    public void H(chd chd, int i) {
        switch (this.X) {
            case 0:
                chd.A((pg7) C(i));
                return;
            case 2:
                vb vbVar = (vb) chd;
                fa faVar = (pg7) C(i);
                l lVar = new l(5, this);
                vbVar.F(faVar);
                ((kh3) vbVar.a).setOnClickListener(new ub(lVar, 0, faVar));
                return;
            case 3:
                ((ig0) chd).A((pg7) C(i));
                return;
            case 4:
                K((k32) chd, i);
                return;
            case 5:
                L((mo3) chd, i);
                return;
            case 7:
                M((jr5) chd, i);
                return;
            case 8:
                N((ek6) chd, i);
                return;
            case 9:
                O((zh8) chd, i);
                return;
            case 10:
                jj9 jj9 = (pg7) this.o.f.get(i);
                if (jj9.l() == 2 && (jj9 instanceof jj9)) {
                    jj9 jj92 = jj9;
                    ((kj9) chd).a.b.c();
                    return;
                } else if (jj9.l() == 1 && (jj9 instanceof mi9)) {
                    oi9 oi9 = (oi9) chd;
                    mi9 mi9 = (mi9) jj9;
                    h87 h87 = new h87(1, (bj9) this.Y, bj9.class, "selectAvatar", "selectAvatar(Lone/me/login/common/avatars/NeuroAvatarModel;)V", 0, 8);
                    oi9.F(mi9);
                    a24.Z(oi9.a, 300, new xv5(h87, 18, mi9));
                    return;
                } else {
                    return;
                }
            case 11:
                P((w9b) chd, i);
                return;
            case 12:
                Q((w1c) chd, i);
                return;
            case 13:
                if (chd instanceof c6d) {
                    c6d c6d = (c6d) chd;
                    sn0 sn0 = (pg7) C(i);
                    if (sn0 instanceof sn0) {
                        c6d.A(sn0);
                        kh3 kh3 = (kh3) c6d.a;
                        Integer valueOf = Integer.valueOf(uaa.a);
                        u0a u0a = u0a.o;
                        sn0 sn02 = sn0;
                        x3a x3a = (x3a) this.Y;
                        kh3.S(kh3, valueOf, u0a, new nya(x3a, 15, sn02), 4);
                        a24.Z(kh3, 300, new xv5(x3a, 29, sn02));
                        return;
                    }
                    return;
                }
                chd.A((pg7) C(i));
                return;
            default:
                mr5.super.H(chd, i);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [mr5, ig7] */
    public mi9 J(int i) {
        mi9 mi9 = (pg7) C(i);
        if (mi9 instanceof mi9) {
            return mi9;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [mr5, ig7] */
    /* JADX WARNING: type inference failed for: r10v0, types: [k32, b7c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void K(defpackage.k32 r10, int r11) {
        /*
            r9 = this;
            mu r0 = r9.o
            java.util.List r0 = r0.f
            java.lang.Object r11 = r0.get(r11)
            g32 r11 = (defpackage.g32) r11
            f r8 = new f
            java.lang.Class<a32> r3 = defpackage.a32.class
            java.lang.String r4 = "onBackgroundSelected"
            r1 = 1
            java.lang.Object r9 = r9.Y
            r2 = r9
            a32 r2 = (defpackage.a32) r2
            java.lang.String r5 = "onBackgroundSelected(Lone/me/appearancesettings/model/ChatBackground;)V"
            r6 = 0
            r7 = 7
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            android.view.View r9 = r10.a
            r10 = r9
            j32 r10 = (defpackage.j32) r10
            android.graphics.drawable.Drawable r0 = r11.o
            r10.setBackgroundPreview(r0)
            java.lang.Boolean r0 = r11.a
            if (r0 == 0) goto L_0x0031
            boolean r0 = r0.booleanValue()
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            r10.setSelected(r0)
            j32 r9 = (defpackage.j32) r9
            ub r10 = new ub
            r0 = 10
            r10.<init>(r8, r0, r11)
            defpackage.a24.Z(r9, 300, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr5.K(k32, int):void");
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [mr5, ig7] */
    public void L(mo3 mo3, int i) {
        lo3 lo3 = (pg7) C(i);
        vz0 vz0 = new vz0(0, (jo3) this.Y, jo3.class, "onButtonClick", "onButtonClick()V", 0, 20);
        mo3.A(lo3);
        mo3.G(lo3.b, vz0);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [mr5, ig7] */
    /* JADX WARNING: type inference failed for: r4v0, types: [jr5, b7c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void M(defpackage.jr5 r4, int r5) {
        /*
            r3 = this;
            java.lang.Object r5 = r3.C(r5)
            pg7 r5 = (pg7) r5
            xye r5 = (defpackage.xye) r5
            wye r0 = defpackage.wye.a
            wye r1 = r5.b
            android.view.View r4 = r4.a
            if (r1 != r0) goto L_0x0018
            r3 = r4
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1 = 0
            r3.setOnClickListener(r1)
            goto L_0x0025
        L_0x0018:
            hr5 r1 = new hr5
            java.lang.Object r3 = r3.Y
            u16 r3 = (defpackage.u16) r3
            r2 = 0
            r1.<init>(r3, r5, r2)
            defpackage.a24.Z(r4, 300, r1)
        L_0x0025:
            wye r3 = r5.b
            if (r3 != r0) goto L_0x0030
            r3 = r4
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 0
            r3.setEnabled(r0)
        L_0x0030:
            r3 = r4
            android.widget.TextView r3 = (android.widget.TextView) r3
            mge r5 = r5.c
            r5.getClass()
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            java.lang.CharSequence r4 = r5.b(r4)
            r3.setText(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr5.M(jr5, int):void");
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [mr5, ig7] */
    /* JADX WARNING: type inference failed for: r10v0, types: [ek6, b7c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void N(defpackage.ek6 r10, int r11) {
        /*
            r9 = this;
            mu r0 = r9.o
            java.util.List r0 = r0.f
            java.lang.Object r11 = r0.get(r11)
            ck6 r11 = (defpackage.ck6) r11
            f r8 = new f
            java.lang.Class<ozc> r3 = defpackage.ozc.class
            java.lang.String r4 = "onSelected"
            r1 = 1
            java.lang.Object r9 = r9.Y
            r2 = r9
            ozc r2 = (defpackage.ozc) r2
            java.lang.String r5 = "onSelected(Ljava/lang/String;)V"
            r6 = 0
            r7 = 26
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            android.view.View r9 = r10.a
            r10 = r9
            dk6 r10 = (defpackage.dk6) r10
            androidx.appcompat.widget.AppCompatTextView r0 = r10.K0
            java.lang.String r1 = r11.a
            r0.setText(r1)
            java.lang.Boolean r0 = r11.b
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.booleanValue()
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r10.setSelected(r0)
            dk6 r9 = (defpackage.dk6) r9
            xv5 r10 = new xv5
            r0 = 4
            r10.<init>(r8, r0, r11)
            defpackage.a24.Z(r9, 300, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr5.N(ek6, int):void");
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [mr5, ig7] */
    public void O(zh8 zh8, int i) {
        yh8 yh8 = (pg7) C(i);
        h87 h87 = new h87(1, (ai8) this.Y, ai8.class, "onMemberListActionClick", "onMemberListActionClick(I)V", 0, 2);
        zh8.F(yh8);
        a24.Z(zh8.a, 300, new xv5(h87, 12, yh8));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [mr5, ig7, java.lang.Object] */
    public void P(w9b w9b, int i) {
        w9b w9b2 = w9b;
        q8b q8b = (pg7) C(i);
        w9b2.A(q8b);
        bn3 bn3 = null;
        if (q8b instanceof xj3) {
            if (w9b2 instanceof bn3) {
                bn3 = (bn3) w9b2;
            }
            if (bn3 != null) {
                a24.Z(bn3.a, 300, new eu5(27, this));
            }
        } else if (q8b instanceof b7) {
            if (w9b2 instanceof r6) {
                bn3 = (r6) w9b2;
            }
            if (bn3 != null) {
                tg9 tg9 = new tg9(2, (w6b) this.Y, w6b.class, "onChecked", "onChecked(JZ)V", 0, 11);
                h87 h87 = new h87(1, (w6b) this.Y, w6b.class, "onDisabledClick", "onDisabledClick(J)V", 0, 11);
                n7d n7d = bn3.a;
                n7d.setOnSwitchListener(new qe4((Object) tg9, 2, (Object) h87));
                a24.Z(n7d, 300, new q6(0, new nya(this, 3, q8b)));
            }
        } else if (q8b instanceof ge4) {
            if (w9b2 instanceof fe4) {
                bn3 = (fe4) w9b2;
            }
            if (bn3 != null) {
                a24.Z(bn3.a, 300, new q6(8, new u5b(1, this)));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [mr5, ig7] */
    /* JADX WARNING: type inference failed for: r10v0, types: [w1c, b7c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Q(defpackage.w1c r10, int r11) {
        /*
            r9 = this;
            java.lang.Object r11 = r9.C(r11)
            pg7 r11 = (pg7) r11
            t1c r11 = (defpackage.t1c) r11
            h87 r8 = new h87
            java.lang.Class<ur2> r3 = defpackage.ur2.class
            java.lang.String r4 = "onRecentContactClick"
            r1 = 1
            java.lang.Object r9 = r9.Y
            r2 = r9
            ur2 r2 = (defpackage.ur2) r2
            java.lang.String r5 = "onRecentContactClick(Lone/me/chats/search/models/RecentContactModel;)V"
            r6 = 0
            r7 = 13
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.A(r11)
            xv5 r9 = new xv5
            r0 = 25
            r9.<init>(r8, r0, r11)
            android.view.View r10 = r10.a
            defpackage.a24.Z(r10, 300, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr5.Q(w1c, int):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [mr5, ig7] */
    public int j() {
        switch (this.X) {
            case 4:
                return this.o.f.size();
            default:
                return mr5.super.j();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [mr5, jgd, ig7] */
    public int l(int i) {
        switch (this.X) {
            case 1:
                return ((pg7) C(i)).l();
            case 5:
                return ((pg7) C(i)).c;
            case 6:
                return ((pg7) C(i)).l();
            case 7:
                return rs5.$EnumSwitchMapping$0[((pg7) C(i)).b.ordinal()] == 1 ? d5a.h : d5a.p;
            case 10:
                return ((pg7) this.o.f.get(i)).l();
            case 11:
                return ((pg7) C(i)).l();
            default:
                return mr5.super.l(i);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [mr5, jgd, ig7, java.lang.Object] */
    public void r(b7c b7c, int i) {
        switch (this.X) {
            case 0:
                H((chd) b7c, i);
                return;
            case 2:
                vb vbVar = (vb) b7c;
                fa faVar = (pg7) C(i);
                l lVar = new l(5, this);
                vbVar.F(faVar);
                ((kh3) vbVar.a).setOnClickListener(new ub(lVar, 0, faVar));
                return;
            case 3:
                ((ig0) b7c).A((pg7) C(i));
                return;
            case 4:
                K((k32) b7c, i);
                return;
            case 5:
                L((mo3) b7c, i);
                return;
            case 7:
                M((jr5) b7c, i);
                return;
            case 8:
                N((ek6) b7c, i);
                return;
            case 9:
                O((zh8) b7c, i);
                return;
            case 10:
                H((chd) b7c, i);
                return;
            case 11:
                P((w9b) b7c, i);
                return;
            case 12:
                Q((w1c) b7c, i);
                return;
            case 13:
                H((chd) b7c, i);
                return;
            default:
                mr5.super.r(b7c, i);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [k32, b7c] */
    /* JADX WARNING: type inference failed for: r9v7, types: [ek6, b7c] */
    /* JADX WARNING: type inference failed for: r9v12, types: [w1c, b7c] */
    public void s(b7c b7c, int i, List list) {
        switch (this.X) {
            case 4:
                ? r9 = (k32) b7c;
                Object f0 = o23.f0(list);
                if (f0 == null) {
                    K(r9, i);
                    return;
                } else if (f0 instanceof f32) {
                    j32 j32 = (j32) r9.a;
                    Boolean bool = ((f32) f0).a;
                    j32.setSelected(bool != null ? bool.booleanValue() : false);
                    return;
                } else {
                    return;
                }
            case 5:
                mo3 mo3 = (mo3) b7c;
                Object X2 = o23.X(list);
                if (X2 == null) {
                    L(mo3, i);
                    return;
                } else if (X2 instanceof ko3) {
                    mo3.G(((ko3) X2).a, new vz0(0, (jo3) this.Y, jo3.class, "onButtonClick", "onButtonClick()V", 0, 21));
                    return;
                } else {
                    return;
                }
            case 8:
                ? r92 = (ek6) b7c;
                Object f02 = o23.f0(list);
                if (f02 == null) {
                    N(r92, i);
                    return;
                } else if (f02 instanceof bk6) {
                    dk6 dk6 = (dk6) r92.a;
                    Boolean bool2 = ((bk6) f02).a;
                    dk6.setSelected(bool2 != null ? bool2.booleanValue() : false);
                    return;
                } else {
                    return;
                }
            case 12:
                ? r93 = (w1c) b7c;
                if (!list.isEmpty()) {
                    for (Object next : list) {
                        boolean z = next instanceof p1c;
                        View view = r93.a;
                        if (z) {
                            ((v1c) view).setAvatar(((p1c) next).f);
                        } else if (next instanceof o1c) {
                            ((v1c) view).setAbbreviation(new ub0(((o1c) next).f, r93.X));
                        } else if (next instanceof q1c) {
                            ((v1c) view).setName(((q1c) next).f);
                        } else if (next instanceof s1c) {
                            ((v1c) view).setVerified(((s1c) next).f);
                        } else if (next instanceof r1c) {
                            ((v1c) view).setOnline(((r1c) next).f);
                        }
                    }
                    return;
                }
                Q(r93, i);
                return;
            default:
                mr5.super.s(b7c, i, list);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [zk0, b7c] */
    /* JADX WARNING: type inference failed for: r12v4, types: [zk0, b7c] */
    /* JADX WARNING: type inference failed for: r12v5, types: [zk0, b7c] */
    /* JADX WARNING: type inference failed for: r12v6, types: [bd1, b7c] */
    /* JADX WARNING: type inference failed for: r12v8, types: [ig0, b7c] */
    /* JADX WARNING: type inference failed for: r10v27, types: [b7c] */
    /* JADX WARNING: type inference failed for: r10v28, types: [fx1, b7c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.b7c t(android.view.ViewGroup r11, int r12) {
        /*
            r10 = this;
            r0 = 12
            r1 = -1
            s59 r2 = defpackage.km4.y0
            r3 = 128(0x80, float:1.794E-43)
            r4 = 3
            r5 = 0
            r6 = 2
            r7 = 1
            r8 = 0
            int r9 = r10.X
            switch(r9) {
                case 0: goto L_0x0289;
                case 1: goto L_0x025a;
                case 2: goto L_0x024b;
                case 3: goto L_0x023d;
                case 4: goto L_0x022e;
                case 5: goto L_0x0217;
                case 6: goto L_0x01f4;
                case 7: goto L_0x0172;
                case 8: goto L_0x0163;
                case 9: goto L_0x0154;
                case 10: goto L_0x00b6;
                case 11: goto L_0x003d;
                case 12: goto L_0x002e;
                case 13: goto L_0x001f;
                default: goto L_0x0011;
            }
        L_0x0011:
            rq3 r11 = new rq3
            java.lang.Object r10 = r10.Y
            one.me.devmenu.threadsviewer.ThreadsStateViewerScreen r10 = (one.me.devmenu.threadsviewer.ThreadsStateViewerScreen) r10
            android.content.Context r10 = r10.getContext()
            r11.<init>(r10)
            return r11
        L_0x001f:
            c6d r10 = new c6d
            android.content.Context r11 = r11.getContext()
            kh3 r12 = new kh3
            r12.<init>(r11, r8)
            r10.<init>(r12)
            return r10
        L_0x002e:
            w1c r10 = new w1c
            android.content.Context r11 = r11.getContext()
            v1c r12 = new v1c
            r12.<init>(r11)
            r10.<init>(r12)
            return r10
        L_0x003d:
            r10 = 536870911(0x1fffffff, float:1.0842021E-19)
            r10 = r10 & r12
            r0 = 1024(0x400, float:1.435E-42)
            boolean r0 = defpackage.jjd.m(r10, r0)
            if (r0 == 0) goto L_0x0053
            r6 r10 = new r6
            android.content.Context r11 = r11.getContext()
            r10.<init>(r11)
            goto L_0x00b5
        L_0x0053:
            r0 = 2048(0x800, float:2.87E-42)
            boolean r0 = defpackage.jjd.m(r10, r0)
            if (r0 != 0) goto L_0x00ac
            r0 = 4096(0x1000, float:5.74E-42)
            boolean r0 = defpackage.jjd.m(r10, r0)
            if (r0 == 0) goto L_0x0064
            goto L_0x00ac
        L_0x0064:
            r0 = 32768(0x8000, float:4.5918E-41)
            boolean r0 = defpackage.jjd.m(r10, r0)
            if (r0 == 0) goto L_0x0084
            bn3 r10 = new bn3
            android.content.Context r11 = r11.getContext()
            kh3 r12 = new kh3
            r12.<init>(r11, r8)
            r10.<init>(r12)
            o53 r11 = new o53
            r11.<init>(r4, r8, r7)
            defpackage.urd.B(r11, r12)
            goto L_0x00b5
        L_0x0084:
            boolean r10 = defpackage.jjd.m(r10, r3)
            if (r10 == 0) goto L_0x0094
            fe4 r10 = new fe4
            android.content.Context r11 = r11.getContext()
            r10.<init>(r11)
            goto L_0x00b5
        L_0x0094:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "unknown item viewType: "
            r11.<init>(r0)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00ac:
            axa r10 = new axa
            android.content.Context r11 = r11.getContext()
            r10.<init>(r11, r7)
        L_0x00b5:
            return r10
        L_0x00b6:
            r10 = 64
            if (r12 == r7) goto L_0x011e
            if (r12 != r6) goto L_0x0101
            add r12 = new add
            android.content.Context r0 = r11.getContext()
            r12.<init>(r0)
            float r10 = (float) r10
            android.content.res.Resources r0 = dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r10 = r10 * r0
            int r10 = defpackage.a24.X(r10)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r10, r10)
            r12.setLayoutParams(r0)
            eu3 r0 = new eu3
            float r1 = (float) r10
            r0.<init>(r1)
            r12.setOutlineProvider(r0)
            pda r11 = r2.r(r11)
            nd0 r11 = r11.b()
            int r11 = r11.i
            r12.setBackgroundColor(r11)
            ox2 r11 = new ox2
            r11.<init>(r10, r8)
            defpackage.urd.B(r11, r12)
            kj9 r10 = new kj9
            r10.<init>(r12)
            goto L_0x0153
        L_0x0101:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Such viewType "
            r11.<init>(r0)
            r11.append(r12)
            java.lang.String r12 = " is not supported in NeuroAvatarsAdapter"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x011e:
            ki9 r12 = new ki9
            android.content.Context r11 = r11.getContext()
            r12.<init>(r11)
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            float r10 = (float) r10
            android.content.res.Resources r0 = dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r0 = r0 * r10
            int r0 = defpackage.a24.X(r0)
            android.content.res.Resources r1 = dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r10 = r10 * r1
            int r10 = defpackage.a24.X(r10)
            r11.<init>(r0, r10)
            r12.setLayoutParams(r11)
            oi9 r10 = new oi9
            r10.<init>(r12)
        L_0x0153:
            return r10
        L_0x0154:
            zh8 r10 = new zh8
            n7d r12 = new n7d
            android.content.Context r11 = r11.getContext()
            r12.<init>(r11, r8)
            r10.<init>(r12)
            return r10
        L_0x0163:
            ek6 r10 = new ek6
            android.content.Context r11 = r11.getContext()
            dk6 r12 = new dk6
            r12.<init>(r11)
            r10.<init>(r12)
            return r10
        L_0x0172:
            int r10 = defpackage.d5a.h
            wye r3 = defpackage.wye.a
            if (r12 != r10) goto L_0x017a
            r10 = r3
            goto L_0x017c
        L_0x017a:
            wye r10 = defpackage.wye.b
        L_0x017c:
            jr5 r12 = new jr5
            android.content.Context r11 = r11.getContext()
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r11)
            n6c r7 = new n6c
            r9 = -2
            r7.<init>((int) r1, (int) r9)
            r6.setLayoutParams(r7)
            nge r1 = nte.i
            nge.d(r1, r6)
            ir5 r1 = new ir5
            r1.<init>(r4, r8, r5)
            defpackage.urd.B(r1, r6)
            float r0 = (float) r0
            android.content.res.Resources r1 = dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = defpackage.a24.X(r0)
            if (r10 != r3) goto L_0x01d6
            r10 = 1051931443(0x3eb33333, float:0.35)
            r6.setAlpha(r10)
            r6.setEnabled(r5)
            one.me.sdk.richvector.EnhancedVectorDrawable r10 = new one.me.sdk.richvector.EnhancedVectorDrawable
            int r1 = mnb.ic_check_filled_24
            r10.<init>(r11, r1)
            km4 r11 = r2.n(r11)
            r11.g()
            r11 = -16745729(0xffffffffff007aff, float:-1.7077982E38)
            java.lang.String r1 = "circle_background"
            defpackage.xs7.P(r10, r1, r11)
            r6.setCompoundDrawablePadding(r0)
            java.util.ArrayList r11 = tge.a
            r6.setCompoundDrawablesRelativeWithIntrinsicBounds(r10, r8, r8, r8)
        L_0x01d6:
            r10 = 16
            r6.setGravity(r10)
            r10 = 18
            float r10 = (float) r10
            android.content.res.Resources r11 = dh4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r10 = r10 * r11
            int r10 = defpackage.a24.X(r10)
            r6.setPadding(r0, r10, r0, r10)
            r12.<init>(r6)
            return r12
        L_0x01f4:
            int r0 = defpackage.x5a.q
            if (r12 != r0) goto L_0x0208
            fx1 r10 = new fx1
            android.content.Context r11 = r11.getContext()
            fs5 r12 = new fs5
            r0 = 6
            r12.<init>(r0)
            r10.<init>(r11, r12)
            goto L_0x0216
        L_0x0208:
            ht4 r12 = new ht4
            android.content.Context r11 = r11.getContext()
            java.lang.Object r10 = r10.Y
            u5g r10 = (defpackage.u5g) r10
            r12.<init>(r11, r10)
            r10 = r12
        L_0x0216:
            return r10
        L_0x0217:
            mo3 r10 = new mo3
            android.content.Context r11 = r11.getContext()
            p4a r12 = new p4a
            r12.<init>(r11, r8)
            r10.<init>(r12)
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r11.<init>(r1, r1)
            r12.setLayoutParams(r11)
            return r10
        L_0x022e:
            k32 r10 = new k32
            android.content.Context r11 = r11.getContext()
            j32 r12 = new j32
            r12.<init>(r11)
            r10.<init>(r12)
            return r10
        L_0x023d:
            ig0 r12 = new ig0
            android.content.Context r11 = r11.getContext()
            java.lang.Object r10 = r10.Y
            sn3 r10 = (defpackage.sn3) r10
            r12.<init>(r11, r10)
            return r12
        L_0x024b:
            vb r10 = new vb
            android.content.Context r11 = r11.getContext()
            kh3 r12 = new kh3
            r12.<init>(r11, r8)
            r10.<init>(r12)
            return r10
        L_0x025a:
            int r0 = defpackage.by9.a
            if (r12 != r0) goto L_0x0281
            bd1 r12 = new bd1
            s1a r0 = new s1a
            android.content.Context r11 = r11.getContext()
            r0.<init>(r11)
            f r11 = new f
            java.lang.String r6 = "onVersionClick(Ljava/lang/String;)V"
            r7 = 0
            r2 = 1
            java.lang.Object r10 = r10.Y
            r3 = r10
            n r3 = (defpackage.n) r3
            java.lang.Class<n> r4 = defpackage.n.class
            java.lang.String r5 = "onVersionClick"
            r8 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12.<init>((s1a) r0, (defpackage.f) r11)
            return r12
        L_0x0281:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Not supported viewType for AboutAppAdapter"
            r10.<init>(r11)
            throw r10
        L_0x0289:
            android.content.Context r1 = r11.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            int r2 = defpackage.xob.oneme_folder_widget_view_type
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            if (r12 != r2) goto L_0x02e1
            zk0 r12 = new zk0
            android.content.Context r11 = r11.getContext()
            lr5 r0 = new lr5
            r0.<init>(r10, r5)
            r12.<init>((android.content.Context) r11, (defpackage.u16) r0)
            android.view.View r10 = r12.a
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            if (r11 == 0) goto L_0x02db
            float r0 = (float) r3
            android.content.res.Resources r1 = dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r0
            int r1 = defpackage.a24.X(r1)
            r11.width = r1
            android.content.res.Resources r1 = dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = defpackage.a24.X(r0)
            r11.height = r0
            r10.setLayoutParams(r11)
            goto L_0x037c
        L_0x02db:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r4)
            throw r10
        L_0x02e1:
            int r2 = defpackage.xob.oneme_big_folder_widget_view_type
            if (r12 != r2) goto L_0x0328
            zk0 r12 = new zk0
            android.content.Context r11 = r11.getContext()
            lr5 r2 = new lr5
            r2.<init>(r10, r7)
            r12.<init>((android.content.Context) r11, (defpackage.lr5) r2)
            float r10 = (float) r0
            android.content.res.Resources r11 = dh4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            int r10 = rf0.l(r10, r11, r6, r1)
            android.view.View r11 = r12.a
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            if (r0 == 0) goto L_0x0322
            r0.width = r10
            float r10 = (float) r3
            android.content.res.Resources r1 = dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r10 = r10 * r1
            int r10 = defpackage.a24.X(r10)
            r0.height = r10
            r11.setLayoutParams(r0)
            goto L_0x037c
        L_0x0322:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r4)
            throw r10
        L_0x0328:
            int r2 = defpackage.xob.oneme_half_folder_widget_view_type
            if (r12 != r2) goto L_0x0383
            zk0 r12 = new zk0
            android.content.Context r11 = r11.getContext()
            lr5 r2 = new lr5
            r2.<init>(r10, r6)
            r12.<init>((android.content.Context) r11, (defpackage.u16) r2)
            float r10 = (float) r0
            android.content.res.Resources r11 = dh4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            int r10 = rf0.l(r10, r11, r6, r1)
            r11 = 8
            float r11 = (float) r11
            android.content.res.Resources r0 = dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r11 = r11 * r0
            int r11 = defpackage.a24.X(r11)
            int r10 = r10 - r11
            int r10 = r10 / r6
            android.view.View r11 = r12.a
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            if (r0 == 0) goto L_0x037d
            r0.width = r10
            float r10 = (float) r3
            android.content.res.Resources r1 = dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r10 = r10 * r1
            int r10 = defpackage.a24.X(r10)
            r0.height = r10
            r11.setLayoutParams(r0)
        L_0x037c:
            return r12
        L_0x037d:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r4)
            throw r10
        L_0x0383:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.Class<mr5> r11 = defpackage.mr5.class
            java.lang.String r11 = r11.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Not supported viewType "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = " for "
            r0.append(r12)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr5.t(android.view.ViewGroup, int):b7c");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mr5(Executor executor) {
        super(executor);
        this.X = 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mr5(ExecutorService executorService, Object obj, int i) {
        super(executorService);
        this.X = i;
        this.Y = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mr5(ThreadsStateViewerScreen threadsStateViewerScreen, ExecutorService executorService) {
        super(executorService);
        this.X = 14;
        this.Y = threadsStateViewerScreen;
    }
}

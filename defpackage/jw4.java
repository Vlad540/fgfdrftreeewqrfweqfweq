package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.sdk.lists.widgets.EmptyRecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.tamtam.stickers.view.RecyclerAutofitGridView;

/* renamed from: jw4  reason: default package */
public final class jw4 extends h6c {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ jw4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a() {
        switch (this.a) {
            case 0:
                ((EmptyRecyclerView) this.b).F0();
                return;
            case 2:
                ((mu7) this.b).b(true);
                return;
            case 3:
                ((jc6) this.b).a();
                return;
            case 4:
                zg9 zg9 = (zg9) this.b;
                zg9.e = zg9.c.j();
                u93 u93 = zg9.d;
                ((t93) u93.e).m();
                u93.c();
                return;
            case 5:
                ((RecyclerAutofitGridView) this.b).F0();
                return;
            case 6:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.n((String) null);
                recyclerView.w1.g = true;
                recyclerView.k0(true);
                if (!recyclerView.w0.D()) {
                    recyclerView.requestLayout();
                    return;
                }
                return;
            case 8:
                ((ur3) this.b).s();
                return;
            default:
                return;
        }
    }

    public void b(int i, int i2) {
        switch (this.a) {
            case 2:
                a();
                return;
            case 3:
                ((jc6) this.b).a();
                return;
            case 4:
                zg9 zg9 = (zg9) this.b;
                u93 u93 = zg9.d;
                ((t93) u93.e).o(i + u93.d(zg9), i2, (Object) null);
                return;
            case 7:
                ((s16) this.b).invoke();
                return;
            case 8:
                ((ur3) this.b).s();
                return;
            default:
                return;
        }
    }

    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 2:
                a();
                return;
            case 3:
                ((jc6) this.b).a();
                return;
            case 4:
                zg9 zg9 = (zg9) this.b;
                u93 u93 = zg9.d;
                ((t93) u93.e).o(i + u93.d(zg9), i2, obj);
                return;
            case 6:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.n((String) null);
                b9 b9Var = recyclerView.w0;
                if (i2 < 1) {
                    b9Var.getClass();
                    return;
                }
                ArrayList arrayList = (ArrayList) b9Var.o;
                arrayList.add(b9Var.H(obj, 4, i, i2));
                b9Var.b |= 4;
                if (arrayList.size() == 1) {
                    h();
                    return;
                }
                return;
            case 7:
                ((s16) this.b).invoke();
                return;
            case 8:
                ((ur3) this.b).s();
                return;
            default:
                jw4.super.c(i, i2, obj);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b2, code lost:
        if (r5.r != null) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(int r6, int r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            int r2 = r5.a
            switch(r2) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x0073;
                case 2: goto L_0x006f;
                case 3: goto L_0x0067;
                case 4: goto L_0x0041;
                case 5: goto L_0x0007;
                case 6: goto L_0x0018;
                case 7: goto L_0x0010;
                case 8: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r5 = r5.b
            ur3 r5 = (ur3) r5
            r5.s()
            return
        L_0x0010:
            java.lang.Object r5 = r5.b
            s16 r5 = (s16) r5
            r5.invoke()
            return
        L_0x0018:
            java.lang.Object r2 = r5.b
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r2.n(r1)
            b9 r2 = r2.w0
            if (r7 >= r0) goto L_0x0027
            r2.getClass()
            goto L_0x0040
        L_0x0027:
            java.lang.Object r3 = r2.o
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            a9 r6 = r2.H(r1, r0, r6, r7)
            r3.add(r6)
            int r6 = r2.b
            r6 = r6 | r0
            r2.b = r6
            int r6 = r3.size()
            if (r6 != r0) goto L_0x0040
            r5.h()
        L_0x0040:
            return
        L_0x0041:
            java.lang.Object r5 = r5.b
            zg9 r5 = (zg9) r5
            int r0 = r5.e
            int r0 = r0 + r7
            r5.e = r0
            u93 r0 = r5.d
            int r1 = r0.d(r5)
            java.lang.Object r2 = r0.e
            t93 r2 = (t93) r2
            int r6 = r6 + r1
            r2.p(r6, r7)
            int r6 = r5.e
            if (r6 <= 0) goto L_0x0066
            f6c r5 = r5.c
            int r5 = r5.c
            r6 = 2
            if (r5 != r6) goto L_0x0066
            r0.c()
        L_0x0066:
            return
        L_0x0067:
            java.lang.Object r5 = r5.b
            jc6 r5 = (jc6) r5
            r5.a()
            return
        L_0x006f:
            r5.a()
            return
        L_0x0073:
            k77[] r6 = one.me.chats.search.ChatsListSearchScreen.N0
            java.lang.Object r5 = r5.b
            one.me.chats.search.ChatsListSearchScreen r5 = (one.me.chats.search.ChatsListSearchScreen) r5
            bt2 r6 = r5.m0()
            t0c r6 = r6.J0
            zqd r6 = r6.a
            java.lang.Object r6 = r6.getValue()
            js2 r6 = (js2) r6
            java.util.List r6 = r6.d
            int r6 = r6.size()
            if (r6 != r7) goto L_0x0092
            r5.p0()
        L_0x0092:
            k77[] r6 = one.me.chats.search.ChatsListSearchScreen.N0
            r1 = 3
            r6 = r6[r1]
            n0c r1 = r5.K0
            java.lang.Object r6 = r1.T0(r5, r6)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r6 = (one.me.sdk.lists.widgets.EndlessRecyclerView2) r6
            if (r7 <= 0) goto L_0x00b5
            bt2 r5 = r5.m0()
            vs7 r5 = r5.o
            pn1 r7 = r5.k
            boolean r7 = defpackage.tic.c(r7)
            if (r7 != 0) goto L_0x00b0
            goto L_0x00b6
        L_0x00b0:
            java.lang.String r5 = r5.r
            if (r5 == 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            r6.setRefreshingNext(r0)
            return
        L_0x00ba:
            java.lang.Class<jw4> r6 = defpackage.jw4.class
            java.lang.String r7 = r6.getName()
            java.lang.Object r0 = r5.b
            one.me.sdk.lists.widgets.EmptyRecyclerView r0 = (one.me.sdk.lists.widgets.EmptyRecyclerView) r0
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x00c9
            goto L_0x00de
        L_0x00c9:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x00de
            tn7 r3 = defpackage.tn7.X
            boolean r0 = r0.Z()
            java.lang.String r4 = "onItemRangeInserted start. isComputingLayout:"
            java.lang.String r0 = defpackage.us8.k(r4, r0)
            r2.d(r3, r7, r0, r1)
        L_0x00de:
            java.lang.Object r7 = r5.b
            one.me.sdk.lists.widgets.EmptyRecyclerView r7 = (one.me.sdk.lists.widgets.EmptyRecyclerView) r7
            r7.F0()
            java.lang.String r6 = r6.getName()
            java.lang.Object r5 = r5.b
            one.me.sdk.lists.widgets.EmptyRecyclerView r5 = (one.me.sdk.lists.widgets.EmptyRecyclerView) r5
            fn6 r7 = udd.e
            if (r7 != 0) goto L_0x00f2
            goto L_0x0107
        L_0x00f2:
            boolean r0 = r7.c()
            if (r0 == 0) goto L_0x0107
            tn7 r0 = defpackage.tn7.X
            boolean r5 = r5.Z()
            java.lang.String r2 = "onItemRangeInserted end. isComputingLayout:"
            java.lang.String r5 = defpackage.us8.k(r2, r5)
            r7.d(r0, r6, r5, r1)
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw4.d(int, int):void");
    }

    public void e(int i, int i2) {
        switch (this.a) {
            case 2:
                a();
                return;
            case 3:
                ((jc6) this.b).a();
                return;
            case 4:
                zg9 zg9 = (zg9) this.b;
                u93 u93 = zg9.d;
                int d = u93.d(zg9);
                ((t93) u93.e).n(i + d, i2 + d);
                return;
            case 6:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.n((String) null);
                b9 b9Var = recyclerView.w0;
                b9Var.getClass();
                if (i != i2) {
                    ArrayList arrayList = (ArrayList) b9Var.o;
                    arrayList.add(b9Var.H((Object) null, 8, i, i2));
                    b9Var.b |= 8;
                    if (arrayList.size() == 1) {
                        h();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((s16) this.b).invoke();
                return;
            case 8:
                ((ur3) this.b).s();
                return;
            default:
                return;
        }
    }

    public void f(int i, int i2) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ((EmptyRecyclerView) obj).F0();
                return;
            case 1:
                k77[] k77Arr = ChatsListSearchScreen.N0;
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) obj;
                if (((js2) chatsListSearchScreen.m0().J0.a.getValue()).d.isEmpty()) {
                    ((EndlessRecyclerView2) chatsListSearchScreen.K0.T0(chatsListSearchScreen, ChatsListSearchScreen.N0[3])).setRefreshingNext(false);
                    return;
                }
                return;
            case 2:
                a();
                return;
            case 3:
                ((jc6) obj).a();
                return;
            case 4:
                zg9 zg9 = (zg9) obj;
                zg9.e -= i2;
                u93 u93 = zg9.d;
                ((t93) u93.e).a.f(i + u93.d(zg9), i2);
                if (zg9.e < 1 && zg9.c.c == 2) {
                    u93.c();
                    return;
                }
                return;
            case 6:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.n((String) null);
                b9 b9Var = recyclerView.w0;
                if (i2 < 1) {
                    b9Var.getClass();
                    return;
                }
                ArrayList arrayList = (ArrayList) b9Var.o;
                arrayList.add(b9Var.H((Object) null, 2, i, i2));
                b9Var.b |= 2;
                if (arrayList.size() == 1) {
                    h();
                    return;
                }
                return;
            case 7:
                ((s16) obj).invoke();
                return;
            case 8:
                ((ur3) obj).s();
                return;
            default:
                return;
        }
    }

    public void g() {
        f6c f6c;
        switch (this.a) {
            case 4:
                ((zg9) this.b).d.c();
                return;
            case 6:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.o != null && (f6c = recyclerView.E0) != null) {
                    int t = hr1.t(f6c.c);
                    if (t != 1) {
                        if (t == 2) {
                            return;
                        }
                    } else if (f6c.j() <= 0) {
                        return;
                    }
                    recyclerView.requestLayout();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void h() {
        boolean z = RecyclerView.U1;
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!z || !recyclerView.L0 || !recyclerView.K0) {
            recyclerView.S0 = true;
            recyclerView.requestLayout();
            return;
        }
        WeakHashMap weakHashMap = eaf.a;
        recyclerView.postOnAnimation(recyclerView.A0);
    }
}

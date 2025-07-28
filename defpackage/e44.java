package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.login.inputphone.InputPhoneScreen;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;

/* renamed from: e44  reason: default package */
public final /* synthetic */ class e44 implements lh7, k75, bid, x4e, tb4, ub4, j26, hx9, kh7, of3, x1b, x7a, uw9, fa7, i83, m48, y48 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e44(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public nsf M(View view, nsf nsf) {
        return (nsf) ((k26) this.b).invoke(view, nsf, (Rect) this.c);
    }

    public e75[] a() {
        n94 n94 = (n94) this.b;
        s1e s1e = n94.c;
        xu5 xu5 = (xu5) this.c;
        return new e75[]{s1e.b(xu5) ? new m1e(n94.c.d(xu5), xu5) : new l94(xu5)};
    }

    public void accept(Object obj) {
        Object obj2 = this.c;
        int i = 0;
        Object obj3 = this.b;
        switch (this.a) {
            case 12:
                FrgAttachView frgAttachView = (FrgAttachView) obj3;
                frgAttachView.G1 = (xm8) obj;
                while (true) {
                    if (i < frgAttachView.G1.a.D0.v()) {
                        o10 u = frgAttachView.G1.a.D0.u(i);
                        if (u.q.equals(frgAttachView.H1.q)) {
                            frgAttachView.H1 = u;
                        } else {
                            if (u.g()) {
                                f10 f10 = u.g;
                                if (f10.g.q.equals(frgAttachView.H1.q)) {
                                    frgAttachView.H1 = f10.g;
                                }
                            }
                            i++;
                        }
                    }
                }
                if (frgAttachView.v1() != null) {
                    frgAttachView.v1().m0(frgAttachView.G1);
                }
                ((j6) obj2).run();
                return;
            default:
                cl7 cl7 = (cl7) obj3;
                cl7.getClass();
                if (((Boolean) obj).booleanValue()) {
                    cl7.d(0, (String) obj2);
                    return;
                }
                pwc pwc = cl7.b;
                tk7 tk7 = cl7.X;
                kpa e = pwc.e(tk7);
                Uri uri = e != null ? e.X : null;
                pl7 pl7 = cl7.a;
                pl7.O(tk7, (Uri) null, 0, uri);
                udd.n("cl7", "requestThumbnail " + tk7);
                long j = tk7.b;
                if (j == j) {
                    Uri x = at7.x(tk7.c);
                    if (x == null) {
                        pl7.O(tk7, (Uri) null, 0, (Uri) null);
                        return;
                    } else {
                        cl7.d(0, x.toString());
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    /* renamed from: apply  reason: collision with other method in class */
    public boolean m16apply(Object obj) {
        ((fq6) this.b).getClass();
        String c2 = ((ov0) obj).c();
        int i = 0;
        while (true) {
            List list = (List) this.c;
            if (i >= list.size()) {
                return true;
            }
            if (!TextUtils.isEmpty(c2) && c2.startsWith((String) list.get(i))) {
                return false;
            }
            i++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: fza} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(defpackage.o48 r11) {
        /*
            r10 = this;
            boolean r0 = r11.isConnected()
            if (r0 != 0) goto L_0x0008
            goto L_0x00ab
        L_0x0008:
            fza r0 = r11.z
            java.lang.Object r1 = r10.b
            fza r1 = (defpackage.fza) r1
            java.lang.Object r10 = r10.c
            dza r10 = (defpackage.dza) r10
            if (r0 == 0) goto L_0x0027
            dza r2 = r11.A
            if (r2 == 0) goto L_0x0027
            eya r3 = r11.t
            android.util.Pair r10 = defpackage.am7.w(r0, r2, r1, r10, r3)
            java.lang.Object r0 = r10.first
            r1 = r0
            fza r1 = (defpackage.fza) r1
            java.lang.Object r10 = r10.second
            dza r10 = (defpackage.dza) r10
        L_0x0027:
            r0 = 0
            r11.z = r0
            r11.A = r0
            bs r2 = r11.j
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x003a
            r11.z = r1
            r11.A = r10
            goto L_0x00ab
        L_0x003a:
            fza r4 = r11.n
            dza r2 = defpackage.dza.c
            eya r3 = r11.t
            android.util.Pair r10 = defpackage.am7.w(r4, r2, r1, r10, r3)
            java.lang.Object r10 = r10.first
            r5 = r10
            fza r5 = (defpackage.fza) r5
            r11.n = r5
            jya r10 = r4.d
            jya r2 = r1.d
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0062
            jya r10 = r4.e
            jya r1 = r1.e
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r8 = r0
            goto L_0x0069
        L_0x0062:
            int r10 = r5.f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8 = r10
        L_0x0069:
            l68 r10 = r4.s()
            l68 r1 = r5.s()
            boolean r10 = defpackage.oze.a(r10, r1)
            if (r10 != 0) goto L_0x007f
            int r10 = r5.b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9 = r10
            goto L_0x0080
        L_0x007f:
            r9 = r0
        L_0x0080:
            vje r10 = r4.j
            vje r1 = r5.j
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x0092
            int r10 = r5.k
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6 = r10
            goto L_0x0093
        L_0x0092:
            r6 = r0
        L_0x0093:
            int r10 = r4.u
            int r1 = r5.u
            if (r10 != r1) goto L_0x00a2
            boolean r10 = r4.t
            boolean r2 = r5.t
            if (r10 == r2) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r7 = r0
            goto L_0x00a7
        L_0x00a2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x00a0
        L_0x00a7:
            r3 = r11
            r3.W0(r4, r5, r6, r7, r8, r9)
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e44.c(o48):void");
    }

    public String e(String str, String str2) {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 14:
                k77[] k77Arr = InputPhoneScreen.I0;
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) obj2;
                return gt0.u((loa) inputPhoneScreen.C0.getValue(), ((y7a) obj).getCode(), str2, str, ((iv3) inputPhoneScreen.p0().B0.a.getValue()).b);
            default:
                k77[] k77Arr2 = InviteByPhoneScreen.F0;
                InviteByPhoneScreen inviteByPhoneScreen = (InviteByPhoneScreen) obj2;
                return gt0.u((loa) inviteByPhoneScreen.B0.getValue(), ((y7a) obj).getCode(), str2, str, ((iv3) inviteByPhoneScreen.o0().z0.a.getValue()).b);
        }
    }

    public void f(nn6 nn6, int i) {
        switch (this.a) {
            case 21:
                o48 o48 = (o48) this.b;
                o48.getClass();
                nn6.u0(o48.c, i, ((z78) this.c).c());
                return;
            case 22:
                nn6.i0(((o48) this.b).c, i, (Surface) this.c);
                return;
            case 23:
                nn6.B(((o48) this.b).c, i, ((mpe) this.c).c());
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                o48 o482 = (o48) this.b;
                o482.getClass();
                nn6.d0(o482.c, i, ((l68) this.c).d(true));
                return;
            case 25:
                o48 o483 = (o48) this.b;
                o483.getClass();
                wxa wxa = (wxa) this.c;
                wxa.getClass();
                Bundle bundle = new Bundle();
                bundle.putFloat(wxa.e, wxa.a);
                bundle.putFloat(wxa.f, wxa.b);
                nn6.o0(o483.c, i, bundle);
                return;
            default:
                o48 o484 = (o48) this.b;
                o484.getClass();
                ts6 i2 = ws6.i();
                int i3 = 0;
                while (true) {
                    List list = (List) this.c;
                    if (i3 < list.size()) {
                        i2.a(((l68) list.get(i3)).d(true));
                        i3++;
                    } else {
                        nn6.Q(o484.c, i, new it0(i2.j()));
                        return;
                    }
                }
        }
    }

    public void g(cb0 cb0) {
        bb4 bb4 = (bb4) this.b;
        bb4.getClass();
        t36 t36 = t36.b;
        if (((y4e) this.c).c.a() && cb0.d) {
            t36 = t36.c;
        }
        vj4 vj4 = bb4.a;
        w36.d((AtomicBoolean) vj4.c, true);
        w36.c((Thread) vj4.e);
        if (((t36) vj4.n) != t36) {
            vj4.n = t36;
            vj4.v(vj4.b);
        }
    }

    public Object h(uwb uwb) {
        return new u90((String) this.b, ((yc5) this.c).g((Context) uwb.a(Context.class)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.e8c i(int r17, defpackage.toe r18, int[] r19) {
        /*
            r16 = this;
            r0 = r16
            r8 = r18
            int r1 = r0.a
            switch(r1) {
                case 4: goto L_0x0035;
                default: goto L_0x0009;
            }
        L_0x0009:
            ts6 r9 = defpackage.ws6.i()
            r1 = 0
            r10 = r1
        L_0x000f:
            int r1 = r8.a
            if (r10 >= r1) goto L_0x0030
            rb4 r11 = new rb4
            r6 = r19[r10]
            java.lang.Object r1 = r0.b
            r5 = r1
            mb4 r5 = (defpackage.mb4) r5
            java.lang.Object r1 = r0.c
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r1 = r11
            r2 = r17
            r3 = r18
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9.a(r11)
            int r10 = r10 + 1
            goto L_0x000f
        L_0x0030:
            e8c r0 = r9.j()
            return r0
        L_0x0035:
            java.lang.Object r1 = r0.c
            int[] r1 = (int[]) r1
            r9 = r1[r17]
            java.lang.Object r0 = r0.b
            r10 = r0
            mb4 r10 = (defpackage.mb4) r10
            int r0 = r10.x0
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            if (r0 == r12) goto L_0x00ac
            int r1 = r10.y0
            if (r1 != r12) goto L_0x004e
            goto L_0x00ac
        L_0x004e:
            r3 = r12
            r2 = r13
        L_0x0050:
            int r4 = r8.a
            if (r2 >= r4) goto L_0x00aa
            vu5[] r4 = r8.c
            r4 = r4[r2]
            int r5 = r4.F0
            if (r5 <= 0) goto L_0x00a7
            int r6 = r4.G0
            if (r6 <= 0) goto L_0x00a7
            boolean r7 = r10.z0
            if (r7 == 0) goto L_0x0073
            if (r5 <= r6) goto L_0x0068
            r7 = 1
            goto L_0x0069
        L_0x0068:
            r7 = r13
        L_0x0069:
            if (r0 <= r1) goto L_0x006d
            r14 = 1
            goto L_0x006e
        L_0x006d:
            r14 = r13
        L_0x006e:
            if (r7 == r14) goto L_0x0073
            r7 = r0
            r14 = r1
            goto L_0x0075
        L_0x0073:
            r14 = r0
            r7 = r1
        L_0x0075:
            int r15 = r5 * r7
            int r11 = r6 * r14
            if (r15 < r11) goto L_0x0085
            android.graphics.Point r7 = new android.graphics.Point
            int r5 = defpackage.mze.g(r11, r5)
            r7.<init>(r14, r5)
            goto L_0x008f
        L_0x0085:
            android.graphics.Point r5 = new android.graphics.Point
            int r11 = defpackage.mze.g(r15, r6)
            r5.<init>(r11, r7)
            r7 = r5
        L_0x008f:
            int r4 = r4.F0
            int r5 = r4 * r6
            int r11 = r7.x
            float r11 = (float) r11
            r14 = 1065017672(0x3f7ae148, float:0.98)
            float r11 = r11 * r14
            int r11 = (int) r11
            if (r4 < r11) goto L_0x00a7
            int r4 = r7.y
            float r4 = (float) r4
            float r4 = r4 * r14
            int r4 = (int) r4
            if (r6 < r4) goto L_0x00a7
            if (r5 >= r3) goto L_0x00a7
            r3 = r5
        L_0x00a7:
            int r2 = r2 + 1
            goto L_0x0050
        L_0x00aa:
            r11 = r3
            goto L_0x00ad
        L_0x00ac:
            r11 = r12
        L_0x00ad:
            ts6 r14 = defpackage.ws6.i()
            r15 = r13
        L_0x00b2:
            int r0 = r8.a
            if (r15 >= r0) goto L_0x00e2
            vu5[] r0 = r8.c
            r0 = r0[r15]
            int r0 = r0.b()
            if (r11 == r12) goto L_0x00c8
            r1 = -1
            if (r0 == r1) goto L_0x00c6
            if (r0 > r11) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r7 = r13
            goto L_0x00c9
        L_0x00c8:
            r7 = 1
        L_0x00c9:
            yb4 r6 = new yb4
            r5 = r19[r15]
            r0 = r6
            r1 = r17
            r2 = r18
            r3 = r15
            r4 = r10
            r12 = r6
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.a(r12)
            int r15 = r15 + 1
            r12 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00b2
        L_0x00e2:
            e8c r0 = r14.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e44.i(int, toe, int[]):e8c");
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((hd) obj).B0((gd) this.b, (Exception) this.c);
                return;
            case 10:
                ((gya) obj).I(((txa) this.b).h, (epe) this.c);
                return;
            case 26:
                ((hya) obj).H(((Integer) this.c).intValue(), (l68) this.b);
                return;
            default:
                ((hya) obj).H(((Integer) this.c).intValue(), ((fza) ((yd3) this.b).a).s());
                return;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:27|28|(2:30|31)|32|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00d5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(defpackage.ihd r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            java.lang.Object r1 = r9.b
            int r9 = r9.a
            switch(r9) {
                case 2: goto L_0x0095;
                default: goto L_0x0009;
            }
        L_0x0009:
            st7 r1 = (st7) r1
            r1.getClass()
            st7.a()
            cbe r9 = r1.f
            r9.getClass()
            int r2 = zhc.D
            r9.b()
            android.content.Context r0 = (android.content.Context) r0
            android.graphics.Bitmap r2 = defpackage.at7.U(r0, r2)
            int r3 = r2.getWidth()
            double r3 = (double) r3
            r5 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r3 = r3 * r5
            int r3 = (int) r3
            int r4 = r2.getHeight()
            double r7 = (double) r4
            double r7 = r7 * r5
            int r4 = (int) r7
            android.graphics.Bitmap r3 = defpackage.at7.P(r3, r4, r2)
            java.util.concurrent.ConcurrentHashMap r4 = r1.e
            rt7 r7 = rt7.a
            qr4 r8 = r1.g
            r8.getClass()
            om0 r8 = defpackage.qr4.p(r2)
            r4.put(r7, r8)
            boolean r1 = r1.h
            if (r1 == 0) goto L_0x004c
            r2.recycle()
        L_0x004c:
            rt7 r2 = rt7.b
            om0 r7 = defpackage.qr4.p(r3)
            r4.put(r2, r7)
            if (r1 == 0) goto L_0x005a
            r3.recycle()
        L_0x005a:
            int r2 = zhc.E
            r9.b()
            android.graphics.Bitmap r9 = defpackage.at7.U(r0, r2)
            int r0 = r9.getWidth()
            double r2 = (double) r0
            double r2 = r2 * r5
            int r0 = (int) r2
            int r2 = r9.getHeight()
            double r2 = (double) r2
            double r2 = r2 * r5
            int r2 = (int) r2
            android.graphics.Bitmap r0 = defpackage.at7.P(r0, r2, r9)
            rt7 r2 = rt7.c
            om0 r3 = defpackage.qr4.p(r9)
            r4.put(r2, r3)
            if (r1 == 0) goto L_0x0083
            r9.recycle()
        L_0x0083:
            rt7 r9 = rt7.o
            om0 r2 = defpackage.qr4.p(r0)
            r4.put(r9, r2)
            if (r1 == 0) goto L_0x0091
            r0.recycle()
        L_0x0091:
            r10.a(r4)
            return
        L_0x0095:
            java.lang.String r9 = "aa4"
            pib r0 = (pib) r0
            aa4 r1 = (aa4) r1
            r1.getClass()
            boolean r1 = r10.h()     // Catch:{ Exception -> 0x00bc }
            if (r1 != 0) goto L_0x00df
            cd3 r1 = r0.f     // Catch:{ Exception -> 0x00bc }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00bc }
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch:{ Exception -> 0x00bc }
            java.lang.String r2 = "start connect to host: %s"
            defpackage.udd.p(r9, r2, r1)     // Catch:{ Exception -> 0x00bc }
            r0.e = r10     // Catch:{ Exception -> 0x00be }
            r0.connect()     // Catch:{ Exception -> 0x00be }
            r10.a(r0)     // Catch:{ Exception -> 0x00bc }
            goto L_0x00df
        L_0x00bc:
            r9 = move-exception
            goto L_0x00d6
        L_0x00be:
            r1 = move-exception
            cd3 r2 = r0.f     // Catch:{ Exception -> 0x00bc }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00bc }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ Exception -> 0x00bc }
            java.lang.String r3 = "close socket for host: %s"
            defpackage.udd.p(r9, r3, r2)     // Catch:{ Exception -> 0x00bc }
            java.net.Socket r9 = r0.d     // Catch:{ Exception -> 0x00bc }
            if (r9 == 0) goto L_0x00d5
            r9.close()     // Catch:{ Exception -> 0x00d5 }
        L_0x00d5:
            throw r1     // Catch:{ Exception -> 0x00bc }
        L_0x00d6:
            boolean r0 = r10.h()
            if (r0 != 0) goto L_0x00df
            r10.onError(r9)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e44.j(ihd):void");
    }

    public void l(Task task) {
        ((zy4) this.b).a((Intent) this.c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.e8c m(int r17, defpackage.uoe r18, int[] r19) {
        /*
            r16 = this;
            r0 = r16
            r8 = r18
            int r1 = r0.a
            switch(r1) {
                case 5: goto L_0x0035;
                default: goto L_0x0009;
            }
        L_0x0009:
            ts6 r9 = defpackage.ws6.i()
            r1 = 0
            r10 = r1
        L_0x000f:
            int r1 = r8.a
            if (r10 >= r1) goto L_0x0030
            sb4 r11 = new sb4
            r6 = r19[r10]
            java.lang.Object r1 = r0.b
            r5 = r1
            nb4 r5 = (defpackage.nb4) r5
            java.lang.Object r1 = r0.c
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r1 = r11
            r2 = r17
            r3 = r18
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9.a(r11)
            int r10 = r10 + 1
            goto L_0x000f
        L_0x0030:
            e8c r0 = r9.j()
            return r0
        L_0x0035:
            java.lang.Object r1 = r0.c
            int[] r1 = (int[]) r1
            r9 = r1[r17]
            java.lang.Object r0 = r0.b
            r10 = r0
            nb4 r10 = (defpackage.nb4) r10
            int r0 = r10.i
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            if (r0 == r12) goto L_0x00ac
            int r1 = r10.j
            if (r1 != r12) goto L_0x004e
            goto L_0x00ac
        L_0x004e:
            r3 = r12
            r2 = r13
        L_0x0050:
            int r4 = r8.a
            if (r2 >= r4) goto L_0x00aa
            xu5[] r4 = r8.d
            r4 = r4[r2]
            int r5 = r4.t
            if (r5 <= 0) goto L_0x00a7
            int r6 = r4.u
            if (r6 <= 0) goto L_0x00a7
            boolean r7 = r10.k
            if (r7 == 0) goto L_0x0073
            if (r5 <= r6) goto L_0x0068
            r7 = 1
            goto L_0x0069
        L_0x0068:
            r7 = r13
        L_0x0069:
            if (r0 <= r1) goto L_0x006d
            r14 = 1
            goto L_0x006e
        L_0x006d:
            r14 = r13
        L_0x006e:
            if (r7 == r14) goto L_0x0073
            r7 = r0
            r14 = r1
            goto L_0x0075
        L_0x0073:
            r14 = r0
            r7 = r1
        L_0x0075:
            int r15 = r5 * r7
            int r11 = r6 * r14
            if (r15 < r11) goto L_0x0085
            android.graphics.Point r7 = new android.graphics.Point
            int r5 = defpackage.oze.g(r11, r5)
            r7.<init>(r14, r5)
            goto L_0x008f
        L_0x0085:
            android.graphics.Point r5 = new android.graphics.Point
            int r11 = defpackage.oze.g(r15, r6)
            r5.<init>(r11, r7)
            r7 = r5
        L_0x008f:
            int r4 = r4.t
            int r5 = r4 * r6
            int r11 = r7.x
            float r11 = (float) r11
            r14 = 1065017672(0x3f7ae148, float:0.98)
            float r11 = r11 * r14
            int r11 = (int) r11
            if (r4 < r11) goto L_0x00a7
            int r4 = r7.y
            float r4 = (float) r4
            float r4 = r4 * r14
            int r4 = (int) r4
            if (r6 < r4) goto L_0x00a7
            if (r5 >= r3) goto L_0x00a7
            r3 = r5
        L_0x00a7:
            int r2 = r2 + 1
            goto L_0x0050
        L_0x00aa:
            r11 = r3
            goto L_0x00ad
        L_0x00ac:
            r11 = r12
        L_0x00ad:
            ts6 r14 = defpackage.ws6.i()
            r15 = r13
        L_0x00b2:
            int r0 = r8.a
            if (r15 >= r0) goto L_0x00e2
            xu5[] r0 = r8.d
            r0 = r0[r15]
            int r0 = r0.b()
            if (r11 == r12) goto L_0x00c8
            r1 = -1
            if (r0 == r1) goto L_0x00c6
            if (r0 > r11) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r7 = r13
            goto L_0x00c9
        L_0x00c8:
            r7 = 1
        L_0x00c9:
            zb4 r6 = new zb4
            r5 = r19[r15]
            r0 = r6
            r1 = r17
            r2 = r18
            r3 = r15
            r4 = r10
            r12 = r6
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.a(r12)
            int r15 = r15 + 1
            r12 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00b2
        L_0x00e2:
            e8c r0 = r14.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e44.m(int, uoe, int[]):e8c");
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 8:
                mu4 mu4 = (mu4) this.b;
                mu4.getClass();
                gt4 gt4 = (gt4) this.c;
                int i = gt4.a;
                CharSequence e = mu4.c.e(gt4.c);
                return new gt4(i, gt4.b, e, (List) obj, gt4.e, gt4.f, gt4.g);
            default:
                ad5 ad5 = (ad5) this.b;
                ad5.getClass();
                for (xm8 xm8 : (List) obj) {
                    vo8 vo8 = xm8.a;
                    j10 j10 = j10.y0;
                    if (vo8.l(j10)) {
                        vo8 vo82 = xm8.a;
                        o10 x = vo82.D0.x(j10);
                        if (x != null) {
                            if (((String) this.c).equals(x.q)) {
                                sk7 m = ad5.b.m();
                                m.getClass();
                                return sk7.b(m, vo82.b, false, 26);
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return dhd.f(new IllegalStateException("no message found on screen"));
        }
    }
}

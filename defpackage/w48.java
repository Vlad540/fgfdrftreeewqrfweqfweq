package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: w48  reason: default package */
public final /* synthetic */ class w48 implements y48, ld8, nf3, le8, xz2, of3, syb, bid, mr6, otc, uw9, tn1, j26, cr3, ou9, vic {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w48(ck5 ck5) {
        this.a = 26;
        this.b = bw4.a;
        this.c = ck5;
    }

    public nsf M(View view, nsf nsf) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = e87.a;
            boolean b2 = e87.b(e87.c);
            k40 k40 = (k40) this.b;
            Context context = (Context) this.c;
            if (b2) {
                int a2 = e87.a(context);
                int i2 = marginLayoutParams.bottomMargin;
                marginLayoutParams.bottomMargin = i2 >= a2 ? ((fca) k40.o).X.c : a2 + i2;
                z = true;
            } else {
                if (!k40.b || marginLayoutParams.bottomMargin < e87.a(context)) {
                    marginLayoutParams.bottomMargin = Math.max(marginLayoutParams.bottomMargin, nsf.a.f(7).d);
                } else {
                    marginLayoutParams.bottomMargin -= e87.a(context);
                }
                z = false;
            }
            k40.b = z;
            view.setLayoutParams(marginLayoutParams);
            return nsf;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                qza qza = (qza) obj;
                me8 me8 = (me8) this.b;
                me8.getClass();
                mpe mpe = (mpe) this.c;
                if (!mpe.A.isEmpty()) {
                    kpe c2 = mpe.a().c();
                    rue g = mpe.A.values().iterator();
                    while (g.hasNext()) {
                        fpe fpe = (fpe) g.next();
                        uoe uoe = (uoe) me8.g.x0.get(fpe.a.b);
                        if (uoe == null || fpe.a.a != uoe.a) {
                            c2.a(fpe);
                        } else {
                            c2.a(new fpe(uoe, fpe.b));
                        }
                    }
                    mpe = c2.b();
                }
                qza.Q(mpe);
                return;
            case 4:
                qza qza2 = (qza) obj;
                cd8 cd8 = (cd8) ((me8) this.b).c.get();
                if (cd8 != null && !cd8.i()) {
                    cd8.g((ic8) this.c, false);
                    return;
                }
                return;
            case 8:
                urd.N((p10) obj, (String) this.b, (of3) this.c);
                return;
            case 9:
                urd.O((m00) obj, (g10) this.c, ((to8) this.b).c.a.m());
                return;
            default:
                urd.N((p10) obj, (String) this.b, new xp(4, (u16) this.c));
                return;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00aa A[Catch:{ all -> 0x0132 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.a
            switch(r0) {
                case 23: goto L_0x0149;
                case 24: goto L_0x0137;
                default: goto L_0x0005;
            }
        L_0x0005:
            r1 = r13
            android.database.sqlite.SQLiteDatabase r1 = (android.database.sqlite.SQLiteDatabase) r1
            java.lang.Object r13 = r12.b
            xic r13 = (defpackage.xic) r13
            j90 r0 = r13.o
            int r2 = r0.b
            java.lang.Object r12 = r12.c
            hb0 r12 = (defpackage.hb0) r12
            java.util.ArrayList r9 = r13.S(r1, r12, r2)
            t3b[] r2 = defpackage.t3b.values()
            int r3 = r2.length
            r10 = 0
            r4 = r10
        L_0x001f:
            if (r4 >= r3) goto L_0x0059
            r5 = r2[r4]
            t3b r6 = r12.c
            if (r5 != r6) goto L_0x0028
            goto L_0x004e
        L_0x0028:
            int r6 = r9.size()
            int r7 = r0.b
            int r7 = r7 - r6
            if (r7 > 0) goto L_0x0032
            goto L_0x0059
        L_0x0032:
            ydc r6 = defpackage.hb0.a()
            java.lang.String r8 = r12.a
            r6.I(r8)
            if (r5 == 0) goto L_0x0051
            r6.o = r5
            byte[] r5 = r12.b
            r6.c = r5
            hb0 r5 = r6.r()
            java.util.ArrayList r5 = r13.S(r1, r5, r7)
            r9.addAll(r5)
        L_0x004e:
            int r4 = r4 + 1
            goto L_0x001f
        L_0x0051:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r13 = "Null priority"
            r12.<init>(r13)
            throw r12
        L_0x0059:
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "event_id IN ("
            r13.<init>(r0)
            r0 = r10
        L_0x0066:
            int r2 = r9.size()
            r11 = 1
            if (r0 >= r2) goto L_0x0087
            java.lang.Object r2 = r9.get(r0)
            fa0 r2 = (defpackage.fa0) r2
            long r2 = r2.a
            r13.append(r2)
            int r2 = r9.size()
            int r2 = r2 - r11
            if (r0 >= r2) goto L_0x0084
            r2 = 44
            r13.append(r2)
        L_0x0084:
            int r0 = r0 + 1
            goto L_0x0066
        L_0x0087:
            r0 = 41
            r13.append(r0)
            java.lang.String r0 = "value"
            java.lang.String r2 = "event_id"
            java.lang.String r3 = "name"
            java.lang.String[] r3 = new java.lang.String[]{r2, r3, r0}
            java.lang.String r4 = r13.toString()
            r7 = 0
            r8 = 0
            java.lang.String r2 = "event_metadata"
            r5 = 0
            r6 = 0
            android.database.Cursor r13 = r1.query(r2, r3, r4, r5, r6, r7, r8)
        L_0x00a4:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x00d8
            long r0 = r13.getLong(r10)     // Catch:{ all -> 0x0132 }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0132 }
            java.lang.Object r2 = r12.get(r2)     // Catch:{ all -> 0x0132 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x0132 }
            if (r2 != 0) goto L_0x00c6
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0132 }
            r2.<init>()     // Catch:{ all -> 0x0132 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0132 }
            r12.put(r0, r2)     // Catch:{ all -> 0x0132 }
        L_0x00c6:
            wic r0 = new wic     // Catch:{ all -> 0x0132 }
            java.lang.String r1 = r13.getString(r11)     // Catch:{ all -> 0x0132 }
            r3 = 2
            java.lang.String r3 = r13.getString(r3)     // Catch:{ all -> 0x0132 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0132 }
            r2.add(r0)     // Catch:{ all -> 0x0132 }
            goto L_0x00a4
        L_0x00d8:
            r13.close()
            java.util.ListIterator r13 = r9.listIterator()
        L_0x00df:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0131
            java.lang.Object r0 = r13.next()
            fa0 r0 = (defpackage.fa0) r0
            long r1 = r0.a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r1 = r12.containsKey(r1)
            if (r1 != 0) goto L_0x00f8
            goto L_0x00df
        L_0x00f8:
            i90 r1 = r0.c
            yd3 r1 = r1.c()
            long r2 = r0.a
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.Object r4 = r12.get(r4)
            java.util.Set r4 = (java.util.Set) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x010e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0122
            java.lang.Object r5 = r4.next()
            wic r5 = (defpackage.wic) r5
            java.lang.String r6 = r5.a
            java.lang.String r5 = r5.b
            r1.a(r6, r5)
            goto L_0x010e
        L_0x0122:
            i90 r1 = r1.c()
            fa0 r4 = new fa0
            hb0 r0 = r0.b
            r4.<init>(r2, r0, r1)
            r13.set(r4)
            goto L_0x00df
        L_0x0131:
            return r9
        L_0x0132:
            r12 = move-exception
            r13.close()
            throw r12
        L_0x0137:
            f2c r13 = (f2c) r13
            java.lang.Object r0 = r12.b
            n2c r0 = (n2c) r0
            r0.getClass()
            java.lang.Object r12 = r12.c
            b2c r12 = (b2c) r12
            ox7 r12 = n2c.d(r12, r13)
            return r12
        L_0x0149:
            b2c r13 = (b2c) r13
            java.lang.Object r0 = r12.b
            n2c r0 = (n2c) r0
            r0.getClass()
            java.lang.Object r12 = r12.c
            f2c r12 = (f2c) r12
            ox7 r12 = n2c.d(r13, r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w48.apply(java.lang.Object):java.lang.Object");
    }

    public void b(ic8 ic8) {
        switch (this.a) {
            case 1:
                Bundle bundle = (Bundle) this.c;
                md8 md8 = (md8) this.b;
                if (bundle == null) {
                    md8.getClass();
                    Bundle bundle2 = Bundle.EMPTY;
                }
                md8.f.m(ic8);
                return;
            default:
                md8 md82 = (md8) this.b;
                md82.getClass();
                String str = ((c58) this.c).a;
                if (TextUtils.isEmpty(str)) {
                    ez3.j0("onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                qza qza = md82.f.s;
                if (!qza.t1(17)) {
                    ez3.j0("Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                vje x0 = qza.x0();
                tje tje = new tje();
                for (int i = 0; i < x0.p(); i++) {
                    if (TextUtils.equals(x0.n(i, tje, 0).c.a, str)) {
                        qza.S(i);
                        return;
                    }
                }
                return;
        }
    }

    public void c(o48 o48) {
        boolean z;
        if (o48.isConnected()) {
            eya eya = o48.r;
            eya eya2 = (eya) this.c;
            boolean z2 = !oze.a(eya, eya2);
            w1d w1d = o48.q;
            w1d w1d2 = (w1d) this.b;
            boolean z3 = !oze.a(w1d, w1d2);
            if (z2 || z3) {
                o48.q = w1d2;
                boolean z4 = false;
                if (z2) {
                    o48.r = eya2;
                    eya eya3 = o48.t;
                    eya i = o48.i(eya2, o48.s);
                    o48.t = i;
                    z = !i.equals(eya3);
                } else {
                    z = false;
                }
                if (z3 || z) {
                    e8c e8c = o48.p;
                    e8c a2 = t33.a(o48.o, w1d2, o48.t);
                    o48.p = a2;
                    z4 = !a2.equals(e8c);
                }
                if (z) {
                    o48.h.f(13, new b48(o48, 16));
                }
                r38 r38 = o48.a;
                if (z3) {
                    r38.o(new b48(o48, w1d2));
                }
                if (z4) {
                    r38.o(new b48(o48, 18));
                }
            }
        }
    }

    public void d(at9 at9) {
        switch (this.a) {
            case 26:
                bj4.d(at9, new bw1((Object) new lic(xs7.D(ha6.a, oi4.b.plus((hu3) this.b), ru3.c, new pic((pj5) this.c, at9, (Continuation) null)))));
                return;
            default:
                wu3 wu3 = new wu3((String[]) this.b, at9, 2);
                OneMeRoomDatabase oneMeRoomDatabase = (aec) this.c;
                oneMeRoomDatabase.e.a(wu3);
                bj4.d(at9, new a7(0, new sz(oneMeRoomDatabase, 10, wu3)));
                at9.c(js.c);
                return;
        }
    }

    public boolean e(ClickableSpan clickableSpan, int i, int i2, String str, sf7 sf7, MotionEvent motionEvent) {
        int i3;
        g37 g37;
        sf7 sf72 = sf7;
        ao8 ao8 = (ao8) this.c;
        long j = ao8.N0;
        k77[] k77Arr = MessagesListWidget.b1;
        MessagesListWidget messagesListWidget = ((qn8) this.b).a;
        messagesListWidget.getClass();
        k77[] k77Arr2 = MessagesListWidget.b1;
        k77 k77 = k77Arr2[1];
        long[] jArr = (long[]) messagesListWidget.c.a(messagesListWidget);
        e3 e3Var = messagesListWidget.N0;
        if (jArr == null || ((g37 = (g37) e3Var.T0(messagesListWidget, k77Arr2[7])) != null && !g37.isActive())) {
            if (messagesListWidget.t0().A().d()) {
                messagesListWidget.t0().A().e(j);
            } else {
                sf7 sf73 = sf7.a;
                View view = ao8.M0;
                if (sf72 == sf73 || sf72 == sf7.Y) {
                    int i4 = bm3.u(str) ? 3 : bm3.v(str) ? 2 : 1;
                    js8 v = messagesListWidget.t0().v();
                    if (v != null) {
                        bo8 bo8 = (bo8) messagesListWidget.A0.getValue();
                        int t = hr1.t(i4);
                        if (t == 0) {
                            i3 = 1;
                        } else if (t == 1) {
                            i3 = 3;
                        } else if (t == 2) {
                            i3 = 2;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        bo8.a(j, i3, v, 1);
                    }
                    e3Var.o1(messagesListWidget, k77Arr2[7], xs7.E(messagesListWidget.getViewLifecycleScope(), (hu3) null, ru3.b, new i09(j, str, motionEvent, messagesListWidget, i4, sf7, (ViewGroup) view, (Continuation) null), 1));
                    return true;
                }
                messagesListWidget.v0(j, view);
            }
        }
        return true;
    }

    public void f(nr6 nr6) {
        switch (this.a) {
            case 13:
                qe4 qe4 = (qe4) this.b;
                qe4.getClass();
                ((mr6) this.c).f(qe4);
                return;
            default:
                yic yic = (yic) this.b;
                yic.getClass();
                ((mr6) this.c).f(yic);
                return;
        }
    }

    public Object h(cd8 cd8, ic8 ic8, int i) {
        switch (this.a) {
            case 5:
                return cd8.i() ? swb.A(new p2d(-100)) : oze.g0((ch7) ((le8) this.b).h(cd8, ic8, i), new xz(cd8, ic8, (be8) this.c, 18));
            default:
                return cd8.i() ? swb.A(new p2d(-100)) : oze.g0((ch7) ((le8) this.b).h(cd8, ic8, i), new xz(cd8, ic8, (ke8) this.c, 19));
        }
    }

    /* JADX WARNING: type inference failed for: r11v19, types: [mr5, ig7] */
    public int i(int i) {
        int i2 = 4;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 14:
                k77[] k77Arr = NotificationsSettingsScreen.z0;
                f6c adapter = ((EndlessRecyclerView2) obj2).getAdapter();
                t93 t93 = adapter instanceof t93 ? (t93) adapter : null;
                if (t93 == null) {
                    return 0;
                }
                Pair E = t93.E(i);
                Integer num = E.first instanceof g7d ? (Integer) E.second : -1;
                g7d g7d = ((NotificationsSettingsScreen) obj).X;
                int j = g7d.j();
                int intValue = num.intValue();
                if (intValue < 0 || intValue >= j) {
                    return 0;
                }
                e7d e7d = (pg7) g7d.C(num.intValue());
                if (!(e7d.u() == 0 || num.intValue() == g7d.j() - 1)) {
                    i2 = e7d.u() != ((pg7) g7d.C(num.intValue() - 1)).u() ? 1 : e7d.u() != ((pg7) g7d.C(num.intValue() + 1)).u() ? 3 : 2;
                }
                return i2;
            case 18:
                int l = ((pg7) ((ProfileEditAdminPermissionsWidget) obj2).Z.C(i)).l();
                if (((ub9) obj).c(l & 536870911)) {
                    return 0;
                }
                if (jjd.t(l)) {
                    i2 = 1;
                } else if (jjd.v(l)) {
                    i2 = 2;
                } else if (jjd.u(l)) {
                    i2 = 3;
                }
                return i2;
            case 19:
                int l2 = ((pg7) ((ProfileEditScreen) obj2).X.C(i)).l();
                if (((ub9) obj).c(l2 & 536870911)) {
                    return 0;
                }
                if (jjd.t(l2)) {
                    i2 = 1;
                } else if (jjd.v(l2)) {
                    i2 = 2;
                } else if (jjd.u(l2)) {
                    i2 = 3;
                }
                return i2;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                int l3 = ((pg7) ((ProfileInviteScreen) obj2).o.C(i)).l();
                if (((ub9) obj).c(l3 & 536870911)) {
                    return 0;
                }
                if ((l3 & 536870912) != 0) {
                    i2 = 1;
                } else if ((l3 & 1073741824) != 0) {
                    i2 = 2;
                } else if ((l3 & Integer.MIN_VALUE) != 0) {
                    i2 = 3;
                }
                return i2;
            case 21:
                int l4 = ((pg7) ((ProfileMemberPermissionsScreen) obj2).c.C(i)).l();
                if (((ub9) obj).c(l4 & 536870911)) {
                    return 0;
                }
                if (jjd.t(l4)) {
                    i2 = 1;
                } else if (jjd.v(l4)) {
                    i2 = 2;
                } else if (jjd.u(l4)) {
                    i2 = 3;
                }
                return i2;
            default:
                k77[] k77Arr2 = ProfileScreen.H0;
                int l5 = ((pg7) ((EndlessRecyclerView2) obj2).getAdapter().C(i)).l();
                if (((ub9) obj).c(l5 & 536870911)) {
                    return 0;
                }
                if ((l5 & 536870912) != 0) {
                    i2 = 1;
                } else if ((l5 & 1073741824) != 0) {
                    i2 = 2;
                } else if ((l5 & Integer.MIN_VALUE) != 0) {
                    i2 = 3;
                }
                return i2;
        }
    }

    public void j(ihd ihd) {
        bse y79;
        f3f f3f;
        xd9 xd9 = (xd9) this.b;
        pwc pwc = xd9.X;
        tk7 tk7 = (tk7) this.c;
        rwc h = pwc.h(tk7);
        hi5 V = x87.V(xd9.o, Uri.parse(tk7.a()));
        Point point = (Point) V.f;
        if (h == null || (f3f = h.b) == null) {
            y79 = new y79(0, V.c, Collections.singletonList(new w79(point.x, tk7.a(), point.y, V.d)), false);
        } else {
            String a2 = tk7.a();
            int i = point.x;
            int i2 = point.y;
            f3f f3f2 = h.b;
            float f = f3f2.b;
            float f2 = (float) V.c;
            y79 = new bse(a2, i, i2, V.d, (long) (f * f2), (long) (f3f2.c * f2), f3f.d);
        }
        ihd.a(y79);
    }

    public Object l(Task task) {
        j1c j1c = (j1c) this.b;
        String str = (String) this.c;
        synchronized (j1c) {
            ((yr) j1c.c).remove(str);
        }
        return task;
    }

    public String z(sn1 sn1) {
        switch (this.a) {
            case 16:
                e3 e3Var = (e3) this.b;
                yia yia = (yia) e3Var.a;
                if (yia != null) {
                    sn1 sn12 = (sn1) yia.a;
                    Objects.requireNonNull(sn12);
                    sn12.c();
                }
                Object obj = this.c;
                e3Var.a = new yia(sn1, obj);
                return "PendingValue " + obj;
            default:
                hv1 hv1 = (hv1) this.c;
                synchronized (((e4b) this.b).a) {
                    j36 a2 = j36.a(as6.c);
                    xp xpVar = new xp(6, new c0(5, hv1));
                    mh4 j = pa2.j();
                    a2.getClass();
                    ct0.a(ct0.N(a2, xpVar, j), new d4b(sn1, 0, hv1), pa2.j());
                }
                return "ProcessCameraProvider-initializeCameraX";
        }
    }

    public /* synthetic */ w48(md8 md8, v1d v1d, Bundle bundle) {
        this.a = 1;
        this.b = md8;
        this.c = bundle;
    }

    public /* synthetic */ w48(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}

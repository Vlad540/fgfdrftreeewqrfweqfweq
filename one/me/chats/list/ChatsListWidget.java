package one.me.chats.list;

import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.b;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/chats/list/ChatsListWidget;", "Lone/me/sdk/arch/Widget;", "Ltq3;", "Llc3;", "Lsn3;", "Lb85;", "Lw07;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "(Ljava/lang/String;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
public final class ChatsListWidget extends Widget implements tq3, lc3, sn3, b85, w07 {
    public static final /* synthetic */ k77[] O0;
    public final nl0 A0;
    public final r7e B0;
    public b C0;
    public final fv4 D0;
    public final mr5 E0;
    public final cpf F0;
    public final cpf G0;
    public final i41 H0;
    public final ur5 I0;
    public final t93 J0;
    public final e3 K0;
    public final t97 L0;
    public final nl0 M0;
    public final xr7 N0;
    public final r7e X;
    public final t97 Y;
    public final t97 Z;
    public final String a;
    public final String b;
    public final jr c;
    public final jr o;
    public final t97 w0;
    public kme x0;
    public final ExecutorService y0;
    public final n0c z0;

    static {
        Class<ChatsListWidget> cls = ChatsListWidget.class;
        O0 = new k77[]{new hc9(cls, "selectedChatIdForAction", "getSelectedChatIdForAction()Ljava/lang/Long;"), c3d.g(m7c.a, cls, "selectedContactIdForAction", "getSelectedContactIdForAction()Ljava/lang/Long;"), new khb(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new khb(cls, "emptyView", "getEmptyView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0), new hc9(cls, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), new khb(cls, "chatsListRecyclerViewAnalyticsListener", "getChatsListRecyclerViewAnalyticsListener()Lone/me/chats/list/ChatsListRecyclerViewAnalyticsListener;", 0)};
    }

    public ChatsListWidget(String str) {
        this(jjd.j(new wia("folder.id.key", str)));
    }

    public static final void l0(ChatsListWidget chatsListWidget, mq3 mq3) {
        chatsListWidget.getClass();
        float f = (float) -6;
        mq3.c(new Rect(a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(f * dh4.c().getDisplayMetrics().density), 0), 0.0f);
    }

    public final void A(s07 s07) {
        int ordinal = s07.ordinal();
        if (ordinal == 0) {
            zu2.c.P1().b(":invite/phone", (Bundle) null);
        } else if (ordinal == 1) {
            zu2.c.P1().b(":invite/qr", (Bundle) null);
        } else if (ordinal == 2) {
            ((ak3) this.B0.getValue()).a(requireActivity());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void i(int i, Bundle bundle) {
        boolean z = false;
        if (i == xob.oneme_saved_messages_clear_history) {
            fu2 o0 = o0();
            t52 t = o0.t();
            t.getClass();
            i22 i22 = (i22) t.e0((String) null, new e52(t, 1));
            if (i22 != null) {
                ((luf) o0.I0.getValue()).a(new f0d(i22.a, false));
            }
        } else if (i != aic.a) {
            Long valueOf = bundle != null ? Long.valueOf(bundle.getLong("selected.chatId.Action")) : null;
            boolean z2 = (valueOf == null || valueOf.longValue() != 0) && valueOf != null;
            Long valueOf2 = bundle != null ? Long.valueOf(bundle.getLong("selected.contactId.Action")) : null;
            if ((valueOf2 == null || valueOf2.longValue() != 0) && valueOf2 != null) {
                z = true;
            }
            if (z2) {
                fu2 o02 = o0();
                if (valueOf != null) {
                    taf.n(o02, o02.Y.a(), (ru3) null, new ht2(i, o02, valueOf.longValue(), (Continuation) null), 2);
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            } else if (z) {
                kl3 kl3 = (kl3) this.Y.getValue();
                if (valueOf2 != null) {
                    kl3.q(i, valueOf2.longValue());
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }

    public final p4a m0() {
        k77 k77 = O0[3];
        return (p4a) this.A0.getValue();
    }

    public final EndlessRecyclerView2 n0() {
        return (EndlessRecyclerView2) this.z0.T0(this, O0[2]);
    }

    public final fu2 o0() {
        return (fu2) this.Z.getValue();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.chats.list.ChatsListWidget] */
    public final void onAttach(View view) {
        ChatsListWidget.super.onAttach(view);
        o0().u();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(layoutInflater.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(f2a.k);
        endlessRecyclerView2.setTag(xob.oneme_folder_tag, this.b);
        endlessRecyclerView2.setHasFixedSize(true);
        frameLayout.addView(endlessRecyclerView2);
        frameLayout.addView(m0(), -1, -1);
        urd.B(new ql2(3, (Continuation) null, 2), frameLayout);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        String str = this.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, us8.k("ONEME-6453|chats_list_lf | list view destroy. Scope isActive: ", n1g.A(getLifecycleScope())), (Throwable) null);
        }
        EndlessRecyclerView2 n0 = n0();
        k77 k77 = O0[5];
        n0.q0((sr2) this.M0.getValue());
        kme kme = this.x0;
        if (kme != null) {
            kme.B(n0);
        }
        n0.setDelegate((py4) null);
        n0.setPager((ny4) null);
        n0.setAdapter((f6c) null);
    }

    public final void onDismiss() {
        k77[] k77Arr = O0;
        k77 k77 = k77Arr[0];
        this.c.b(this, (Object) null);
        k77 k772 = k77Arr[1];
        this.o.b(this, (Object) null);
        g37 g37 = (g37) this.K0.T0(this, k77Arr[4]);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            jrf jrf = new jrf(this, 1);
            String[] strArr2 = qna.e;
            int i2 = cic.O1;
            int i3 = cic.U1;
            ((qna) this.w0.getValue()).getClass();
            qna.k(jrf, strArr, iArr, strArr2, i2, i3);
        }
    }

    public final void onViewCreated(View view) {
        String str = this.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, us8.k("ONEME-6453|chats_list_lf | list view created. Scope isActive: ", n1g.A(getLifecycleScope())), (Throwable) null);
        }
        EndlessRecyclerView2 n0 = n0();
        t93 t93 = this.J0;
        k77 k77 = O0[5];
        n0.k((sr2) this.M0.getValue());
        n0.getContext();
        n0.setLayoutManager(new LinearLayoutManager());
        if (n0.getAdapter() == null || t93 != n0.getAdapter()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                yqd s = gp0.s(n0);
                int i = v9a.a;
                n0.setTag(i, (Object) null);
                if (s != null) {
                    n0.removeOnAttachStateChangeListener(s.d);
                }
                if (t93 == null) {
                    b recycledViewPool = n0.getRecycledViewPool();
                    n0.setRecycledViewPool((b) null);
                    n0.setAdapter((f6c) null);
                    n0.setRecycledViewPool(recycledViewPool);
                } else {
                    e7c e7c = new e7c(0);
                    n0.setTag(i, new yqd(t93, e7c));
                    n0.addOnAttachStateChangeListener(e7c);
                    e7c.onViewAttachedToWindow(n0);
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        this.x0 = gp0.l(n0);
        n0.setHasFixedSize(true);
        n0.setPager(new t61(this, 2));
        if (hhd.f(this.b, "all.chat.folder")) {
            n0.setDelegate(this.H0);
        }
        n0.setEmptyView(m0());
        n0.setClipToPadding(false);
        n0.setClipChildren(false);
        n0.setClipToOutline(false);
        n0.setThreshold(10);
        n0.setIgnoreRefreshingFlagsForScrollEvent(true);
        b bVar = this.C0;
        if (bVar != null) {
            n0.setRecycledViewPool(bVar);
        }
        k6c itemAnimator = n0.getItemAnimator();
        w84 w84 = itemAnimator instanceof w84 ? (w84) itemAnimator : null;
        if (w84 != null) {
            w84.g = false;
        }
        n0.j(new iq(3));
        s59 s59 = km4.y0;
        n0.j(new oi8(1, s59.r(n0)));
        n0.j(new es5(new jj7((Object) this, (Object) getContext().getString(cic.O), (Object) n0)));
        n0.j(new hk3(new hj2(4, new ka(this, 8, new lk3(0, BuildConfig.FLAVOR, (String) null, (List) null, (CharSequence) null, (CharSequence) null, (Uri) null, false, false, BuildConfig.FLAVOR, false, (boa) null, 0, false, 31744))), s59.r(n0), (gk3) null));
        if (t93.j() > 0) {
            n0.measure(View.MeasureSpec.makeMeasureSpec(n0.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(n0.getContext().getResources().getDisplayMetrics().heightPixels, 1073741824));
        }
        n0().setRefreshingNext(((hq2) o0().K0.a.getValue()).b);
        l05 l05 = o0().Q0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(l05, getViewLifecycleOwner().R(), ob7), new mu2((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(new zi1(o0().R0, 20), getViewLifecycleOwner().R(), ob7), new nu2((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(o0().P0, getViewLifecycleOwner().R(), ob7), new ou2((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(((kl3) this.Y.getValue()).D0, getViewLifecycleOwner().R(), ob7), new pu2((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(new zi1(((kl3) this.Y.getValue()).E0, 21), getViewLifecycleOwner().R(), ob7), new qu2((Continuation) null, this), 5), getViewLifecycleScope());
        this.D0.Y = new l(26, this);
        ez3.N(new ck5(wx3.e(o0().X0, getViewLifecycleOwner().R(), ob7), new ru2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void p0() {
        fu2 o0 = o0();
        qod qod = o0.Y0;
        if (qod == null || !qod.isActive()) {
            o0.Y0 = taf.n(o0, o0.Y.c(), (ru3) null, new jt2(o0, (Continuation) null), 2);
        }
    }

    public final void q0(long j, View view) {
        k77[] k77Arr = O0;
        k77 k77 = k77Arr[1];
        if (((Long) this.o.a(this)) == null) {
            k77 k772 = k77Arr[4];
            e3 e3Var = this.K0;
            g37 g37 = (g37) e3Var.T0(this, k772);
            if (g37 == null || !g37.isActive()) {
                e3Var.o1(this, k77Arr[4], xs7.E(getViewLifecycleScope(), (hu3) null, ru3.b, new lu2(this, j, view, (Continuation) null), 1));
            }
        }
    }

    public final void t() {
        ((qna) this.w0.getValue()).f(new jrf(this, 1), qna.e, 156);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [rr3, one.me.sdk.arch.Widget, one.me.chats.list.ChatsListWidget] */
    public final void w(int i) {
        if (ju2.$EnumSwitchMapping$0[hr1.t(i)] != 1) {
            t();
        } else if (Build.VERSION.SDK_INT >= 33) {
            jrf jrf = new jrf(this, 1);
            t97 t97 = this.w0;
            String[] strArr = qna.k;
            ((qna) t97.getValue()).getClass();
            if (qna.i(jrf, strArr)) {
                ((qna) t97.getValue()).f(jrf, strArr, 177);
            } else {
                startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", getContext().getPackageName(), (String) null)));
            }
        }
    }

    public final void y(int i, Bundle bundle) {
        k77[] k77Arr = O0;
        k77 k77 = k77Arr[0];
        jr jrVar = this.c;
        Long l = (Long) jrVar.a(this);
        if (l != null) {
            long longValue = l.longValue();
            k77 k772 = k77Arr[0];
            jrVar.b(this, (Object) null);
            fu2 o0 = o0();
            taf.n(o0, o0.Y.a(), (ru3) null, new ht2(i, o0, longValue, (Continuation) null), 2);
            return;
        }
        k77 k773 = k77Arr[1];
        Long l2 = (Long) this.o.a(this);
        if (l2 != null) {
            ((kl3) this.Y.getValue()).q(i, l2.longValue());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: f6c[]} */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChatsListWidget(android.os.Bundle r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 1
            r3 = 8
            r4 = 5
            r5 = 4
            r6 = 6
            r7 = 3
            r8 = 0
            r9 = 2
            r10 = 0
            r0.<init>(r1, r8, r9, r10)
            java.lang.Class<one.me.chats.list.ChatsListWidget> r11 = one.me.chats.list.ChatsListWidget.class
            java.lang.String r11 = r11.getName()
            r0.a = r11
            java.lang.String r12 = "folder.id.key"
            java.lang.String r1 = r1.getString(r12)
            if (r1 == 0) goto L_0x01a6
            r0.b = r1
            jr r1 = new jr
            java.lang.String r12 = "selected.chatId.Action"
            java.lang.Class<java.lang.Long> r13 = java.lang.Long.class
            r1.<init>(r13, r10, r12)
            r0.c = r1
            jr r1 = new jr
            java.lang.String r12 = "selected.contactId.Action"
            r1.<init>(r13, r10, r12)
            r0.o = r1
            gu2 r1 = new gu2
            r1.<init>(r0, r8)
            r7e r12 = new r7e
            r12.<init>(r1)
            r0.X = r12
            hk2 r1 = new hk2
            r12 = 10
            r1.<init>(r12)
            rh2 r12 = new rh2
            r13 = 16
            r12.<init>(r13, r1)
            java.lang.Class<kl3> r1 = defpackage.kl3.class
            t97 r1 = r0.createViewModelLazy(r1, r12)
            r0.Y = r1
            gu2 r1 = new gu2
            r1.<init>(r0, r5)
            rh2 r12 = new rh2
            r13 = 17
            r12.<init>(r13, r1)
            java.lang.Class<fu2> r1 = defpackage.fu2.class
            t97 r1 = r0.createViewModelLazy(r1, r12)
            r0.Z = r1
            gu2 r1 = new gu2
            r1.<init>(r0, r4)
            rh2 r12 = new rh2
            r13 = 18
            r12.<init>(r13, r1)
            java.lang.Class<xf0> r1 = defpackage.xf0.class
            t97 r1 = r0.createViewModelLazy(r1, r12)
            zf0 r12 = defpackage.zf0.a
            w4 r12 = r12.getAccessor()
            java.lang.Class<qna> r13 = qna.class
            r7e r12 = r12.d(r13)
            r0.w0 = r12
            tp2 r12 = defpackage.tp2.a
            x4a r13 = r12.c()
            java.util.concurrent.ExecutorService r13 = r13.a()
            r0.y0 = r13
            int r14 = defpackage.f2a.k
            n0c r14 = r0.viewBinding(r14)
            r0.z0 = r14
            gu2 r14 = new gu2
            r14.<init>(r0, r6)
            nl0 r14 = r0.binding(r14)
            r0.A0 = r14
            hk2 r14 = new hk2
            r15 = 11
            r14.<init>(r15)
            r7e r15 = new r7e
            r15.<init>(r14)
            r0.B0 = r15
            fv4 r14 = new fv4
            ku2 r15 = new ku2
            r15.<init>(r0)
            r14.<init>((defpackage.ku2) r15, (java.util.concurrent.ExecutorService) r13)
            r0.D0 = r14
            mr5 r15 = new mr5
            r15.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r13, (int) r7)
            r0.E0 = r15
            cpf r10 = new cpf
            r10.<init>(r0, r13, r6)
            r0.F0 = r10
            cpf r4 = new cpf
            r4.<init>(r0, r13, r3)
            r0.G0 = r4
            i41 r3 = new i41
            r3.<init>(r13, r2)
            r0.H0 = r3
            ur5 r5 = new ur5
            zx1 r7 = new zx1
            r2 = 14
            r7.<init>((int) r2, (java.lang.Object) r0)
            gu2 r2 = new gu2
            r6 = 7
            r2.<init>(r0, r6)
            r5.<init>(r13, r7, r2)
            r0.I0 = r5
            t93 r2 = new t93
            s93 r6 = new s93
            r6.<init>((boolean) r8, (int) r9)
            r7 = 6
            f6c[] r7 = new defpackage.f6c[r7]
            r7[r8] = r15
            r8 = 1
            r7[r8] = r5
            r7[r9] = r14
            r5 = 3
            r7[r5] = r3
            r3 = 4
            r7[r3] = r10
            r3 = 5
            r7[r3] = r4
            r2.<init>(r6, r7)
            r0.J0 = r2
            e3 r2 = defpackage.hwf.t()
            r0.K0 = r2
            gu2 r2 = new gu2
            r3 = 8
            r2.<init>(r0, r3)
            t97 r2 = defpackage.ez3.O(r5, r2)
            r0.L0 = r2
            gu2 r2 = new gu2
            r3 = 9
            r2.<init>(r0, r3)
            nl0 r2 = r0.binding(r2)
            r0.M0 = r2
            xr7 r2 = r12.b()
            r0.N0 = r2
            r2.getClass()
            nma r3 = new nma
            oma r4 = oma.Z
            long r5 = android.os.SystemClock.elapsedRealtime()
            r3.<init>(r4, r5)
            jc9 r2 = r2.e
            r2.k(r4, r3)
            fu2 r2 = r16.o0()
            kr2 r2 = r2.X
            r2.e()
            fn6 r2 = defpackage.udd.e
            if (r2 != 0) goto L_0x015c
            goto L_0x0176
        L_0x015c:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0176
            tn7 r3 = tn7.X
            yb7 r4 = r16.getLifecycleScope()
            boolean r4 = defpackage.n1g.A(r4)
            java.lang.String r5 = "ONEME-6453|chats_list_lf | list subscribe on new data. Scope isActive: "
            java.lang.String r4 = us8.k(r5, r4)
            r5 = 0
            r2.d(r3, r11, r4, r5)
        L_0x0176:
            fu2 r2 = r16.o0()
            t0c r2 = r2.K0
            java.lang.Object r1 = r1.getValue()
            xf0 r1 = (defpackage.xf0) r1
            t0c r1 = r1.w0
            fu2 r3 = r16.o0()
            t0c r3 = r3.N0
            java.util.List r4 = defpackage.ete.t()
            tj5 r5 = new tj5
            r6 = 3
            r5.<init>(r6, r4)
            iu2 r4 = new iu2
            r6 = 0
            r4.<init>(r6, r0)
            bc r1 = defpackage.ez3.r(r2, r1, r3, r5, r4)
            yb7 r0 = r16.getLifecycleScope()
            defpackage.ez3.N(r1, r0)
            return
        L_0x01a6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chats.list.ChatsListWidget.<init>(android.os.Bundle):void");
    }
}

package one.me.chats.tab;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/chats/tab/ChatsTabWidget;", "Lone/me/sdk/arch/Widget;", "Lqg9;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "(Ljava/lang/String;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatsTabWidget extends Widget implements qg9 {
    public static final /* synthetic */ k77[] F0;
    public ox3 A0;
    public final a30 B0;
    public final int C0;
    public final qs5 D0;
    public g37 E0;
    public final t97 X;
    public final n0c Y;
    public final n0c Z;
    public final sy6 a;
    public final String b;
    public cr5 c;
    public final t97 o;
    public final n0c w0;
    public final n0c x0;
    public final t97 y0;
    public final t97 z0;

    static {
        Class<ChatsTabWidget> cls = ChatsTabWidget.class;
        khb khb = new khb(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        n7c n7c = m7c.a;
        F0 = new k77[]{khb, wn6.e(n7c, cls, "foldersTabs", "getFoldersTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), wn6.f(cls, "foldersViewPager", "getFoldersViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0, n7c), wn6.f(cls, "pinbarsContainer", "getPinbarsContainer()Landroid/view/ViewGroup;", 0, n7c)};
    }

    public ChatsTabWidget(String str) {
        this(jjd.j(new wia("folder_id", str)));
    }

    public final sy6 getInsetsConfig() {
        return this.a;
    }

    public final hda l0() {
        return (hda) this.Z.T0(this, F0[1]);
    }

    public final ViewPager2 m0() {
        return (ViewPager2) this.w0.T0(this, F0[2]);
    }

    public final nea n0() {
        return (nea) this.Y.T0(this, F0[0]);
    }

    public final qt5 o0() {
        return (qt5) this.y0.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChangeEnded(defpackage.wr3 r12, defpackage.xr3 r13) {
        /*
            r11 = this;
            boolean r12 = r13.b
            if (r12 == 0) goto L_0x010e
            qt5 r12 = r11.o0()
            boolean r12 = r12.B0
            r13 = 1
            t97 r0 = r11.o
            r1 = 0
            if (r12 != 0) goto L_0x00b4
            java.lang.Object r12 = r0.getValue()
            qna r12 = (qna) r12
            x0f r12 = r12.b
            boolean r2 = r12.a
            if (r2 == 0) goto L_0x0081
            hvf r12 = r12.b
            android.content.Context r12 = r12.a
            java.lang.String r2 = "appops"
            java.lang.Object r2 = r12.getSystemService(r2)     // Catch:{ all -> 0x005d }
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2     // Catch:{ all -> 0x005d }
            java.lang.Class<android.app.AppOpsManager> r3 = android.app.AppOpsManager.class
            java.lang.String r4 = "checkOpNoThrow"
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x005d }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r5, r6}     // Catch:{ all -> 0x005d }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ all -> 0x005d }
            r4 = 10020(0x2724, float:1.4041E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x005d }
            int r5 = android.os.Process.myUid()     // Catch:{ all -> 0x005d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x005d }
            java.lang.String r12 = r12.getPackageName()     // Catch:{ all -> 0x005d }
            java.lang.Object[] r12 = new java.lang.Object[]{r4, r5, r12}     // Catch:{ all -> 0x005d }
            java.lang.Object r12 = r3.invoke(r2, r12)     // Catch:{ all -> 0x005d }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x005d }
            int r12 = r12.intValue()     // Catch:{ all -> 0x005d }
            if (r12 != 0) goto L_0x005b
            goto L_0x008e
        L_0x005b:
            r12 = r1
            goto L_0x008f
        L_0x005d:
            r12 = move-exception
            kcc r2 = new kcc
            r2.<init>(r12)
            java.lang.Throwable r12 = defpackage.mcc.a(r2)
            if (r12 == 0) goto L_0x008e
            java.lang.Class<hvf> r2 = hvf.class
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Permission check error "
            r3.<init>(r4)
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            defpackage.udd.p(r2, r12, new java.lang.Object[0])
            goto L_0x008e
        L_0x0081:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r2 < r3) goto L_0x008e
            android.app.NotificationManager r12 = r12.c
            boolean r12 = r12.canUseFullScreenIntent()
            goto L_0x008f
        L_0x008e:
            r12 = r13
        L_0x008f:
            if (r12 != 0) goto L_0x00b4
            qt5 r12 = r11.o0()
            r12.B0 = r13
            java.lang.Object r12 = r0.getValue()
            qna r12 = (qna) r12
            jrf r0 = new jrf
            r13 = 1
            r0.<init>(r11, r13)
            r12.getClass()
            int r3 = iub.permission_fsi_request
            int r4 = iub.permission_fsi_request_rationale
            int r5 = iub.permissions_fsi_request_positive_button
            java.lang.String[] r1 = qna.o
            r2 = 180(0xb4, float:2.52E-43)
            r0.c(r1, r2, r3, r4, r5)
            goto L_0x010e
        L_0x00b4:
            java.lang.Object r12 = r0.getValue()
            qna r12 = (qna) r12
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 < r3) goto L_0x00c7
            java.lang.String[] r4 = qna.k
            boolean r12 = r12.b(r4)
            goto L_0x00cb
        L_0x00c7:
            r12.getClass()
            r12 = r13
        L_0x00cb:
            if (r12 != 0) goto L_0x010e
            t97 r12 = r11.X
            java.lang.Object r4 = r12.getValue()
            f03 r4 = (f03) r4
            lqc r4 = (lqc) r4
            i03 r4 = (i03) r4
            x97 r4 = r4.g
            java.lang.String r5 = "app.pushNotificationsRequested"
            boolean r1 = r4.getBoolean(r5, r1)
            if (r1 != 0) goto L_0x010e
            java.lang.Object r12 = r12.getValue()
            f03 r12 = (f03) r12
            lqc r12 = (lqc) r12
            r12.i(r5, r13)
            java.lang.Object r12 = r0.getValue()
            r4 = r12
            qna r4 = (qna) r4
            jrf r5 = new jrf
            r12 = 1
            r5.<init>(r11, r12)
            if (r2 < r3) goto L_0x010b
            java.lang.String[] r6 = qna.k
            int r8 = iub.permissions_post_notification_request_rationale
            int r9 = iub.permissions_post_notification_request_title
            int r10 = iub.permissions_post_notification_request_positive_button
            r7 = 177(0xb1, float:2.48E-43)
            r4.d(r5, r6, r7, r8, r9, r10)
            goto L_0x010e
        L_0x010b:
            r4.getClass()
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chats.tab.ChatsTabWidget.onChangeEnded(wr3, xr3):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, oaa] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(f2a.c);
        nea nea = new nea(constraintLayout.getContext(), 6);
        int i = f2a.j;
        nea.setId(i);
        nea.setTransitionName(nea.getContext().getString(h2a.q));
        nea.setForm(fea.b);
        re3 re3 = new re3(-1, -2);
        re3.i = 0;
        int i2 = f2a.e;
        re3.k = i2;
        re3.e = 0;
        re3.h = 0;
        nea.setLayoutParams(re3);
        nea.setTitle(h2a.p);
        nea.setRightActions(new aea(new iea(new Object()), new hea(phc.M0, 0, new hd1(28), 14)));
        raa searchView = nea.getSearchView();
        if (searchView != null) {
            searchView.setExpandable(false);
        }
        constraintLayout.addView(nea);
        hda hda = new hda(constraintLayout.getContext(), (AttributeSet) null);
        hda.setId(i2);
        hda.setTabMode(0);
        re3 re32 = new re3(0, -2);
        re32.j = i;
        int i3 = f2a.f;
        re32.k = i3;
        re32.e = 0;
        re32.h = 0;
        hda.setLayoutParams(re32);
        constraintLayout.addView(hda);
        az1 b2 = x87.b(constraintLayout.getContext());
        b2.setId(i3);
        re3 re33 = new re3(0, -2);
        re33.j = i2;
        int i4 = f2a.d;
        re33.k = i4;
        re33.e = 0;
        re33.h = 0;
        constraintLayout.addView(b2, re33);
        ViewPager2 viewPager2 = new ViewPager2(constraintLayout.getContext());
        viewPager2.setId(i4);
        re3 re34 = new re3(0, 0);
        re34.I = 1.0f;
        re34.j = i3;
        re34.l = 0;
        re34.e = 0;
        re34.h = 0;
        viewPager2.setLayoutParams(re34);
        swb.r(viewPager2);
        constraintLayout.addView(viewPager2);
        return constraintLayout;
    }

    public final void onDestroyView(View view) {
        String str = this.b;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, us8.k("ONEME-6453|chats_list_lf | tabs view destroy. Scope isActive: ", n1g.A(getLifecycleScope())), (Throwable) null);
        }
        ox3 ox3 = this.A0;
        if (ox3 != null) {
            ox3.c();
        }
        this.A0 = null;
        this.c = null;
    }

    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        ChatsTabWidget.super.onUpdateArgs(bundle, bundle2);
        o0().q(bundle2.getString("folder_id"));
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [rr3, java.lang.Object, one.me.chats.tab.ChatsTabWidget] */
    /* JADX WARNING: type inference failed for: r1v1, types: [qs5, f6c] */
    public final void onViewCreated(View view) {
        String str = this.b;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, us8.k("ONEME-6453|chats_list_lf | tabs view created. Scope isActive: ", n1g.A(getLifecycleScope())), (Throwable) null);
        }
        m0().setAdapter(this.D0);
        qs5 qs5 = this.D0;
        qs5.Z = 0;
        while (((uq7) qs5.y0).h() > qs5.Z) {
            ((uq7) qs5.y0).g(((Number) qs5.Y.remove(0)).longValue());
        }
        m0().setOffscreenPageLimit(this.C0);
        ox3 b2 = this.B0.b(l0(), m0(), new gw2(0, this), new zv(2, this, ChatsTabWidget.class, "handleLongClickOnFolderTab", "handleLongClickOnFolderTab(Landroid/view/View;Lone/me/common/tablayout/model/OneMeBaseTabItemModel;)V", 0, 12));
        b2.a();
        this.A0 = b2;
        ez3.N(new ck5(o0().x0, new jw2((Continuation) null, this), 5), getViewLifecycleScope());
        ViewPager2 m0 = m0();
        View childAt = m0.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator((k6c) null);
            recyclerView.setHasFixedSize(true);
        }
        m0.b(new hg0(4, this));
        if (this.D0.D0.size() > 0) {
            m0.measure(View.MeasureSpec.makeMeasureSpec(m0.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(m0.getContext().getResources().getDisplayMetrics().heightPixels, 1073741824));
            if (this.D0.D0.size() > 1) {
                p0(1);
            }
        }
        sgc childRouter = getChildRouter((ViewGroup) this.x0.T0(this, F0[3]));
        childRouter.e = 1;
        childRouter.Q(false);
        if (!childRouter.n()) {
            PinBarsWidget pinBarsWidget = new PinBarsWidget((Bundle) null, 1, (x54) null);
            pinBarsWidget.setRetainViewMode(getRetainViewMode());
            childRouter.R(n06.f(pinBarsWidget, (wr3) null, (wr3) null));
        }
        view.addOnAttachStateChangeListener(new ck(2, this));
        o0().q(getArgs().getString("folder_id"));
        ez3.N(new ck5(wx3.e(o0().z0, getViewLifecycleOwner().R(), ob7.X), new iw2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    /* JADX WARNING: type inference failed for: r11v4, types: [rr3, one.me.chats.list.ChatsListWidget] */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r11v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r11 = (defpackage.vgc) defpackage.o23.X(r11.e());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p0(int r11) {
        /*
            r10 = this;
            qs5 r0 = r10.D0
            android.util.SparseArray r0 = r0.w0
            java.lang.Object r11 = r0.get(r11)
            sgc r11 = (defpackage.sgc) r11
            r0 = 0
            if (r11 == 0) goto L_0x001c
            java.util.ArrayList r11 = r11.e()
            java.lang.Object r11 = defpackage.o23.X(r11)
            vgc r11 = (defpackage.vgc) r11
            if (r11 == 0) goto L_0x001c
            rr3 r11 = r11.a
            goto L_0x001d
        L_0x001c:
            r11 = r0
        L_0x001d:
            boolean r1 = r11 instanceof one.me.chats.list.ChatsListWidget
            if (r1 == 0) goto L_0x0024
            one.me.chats.list.ChatsListWidget r11 = (one.me.chats.list.ChatsListWidget) r11
            goto L_0x0025
        L_0x0024:
            r11 = r0
        L_0x0025:
            if (r11 != 0) goto L_0x0028
            return
        L_0x0028:
            java.lang.String r10 = r10.b
            fn6 r1 = defpackage.udd.e
            if (r1 != 0) goto L_0x002f
            goto L_0x0070
        L_0x002f:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0070
            tn7 r2 = tn7.X
            android.view.View r3 = r11.getView()
            if (r3 == 0) goto L_0x0046
            int r3 = r3.getMeasuredWidth()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0047
        L_0x0046:
            r3 = r0
        L_0x0047:
            android.view.View r4 = r11.getView()
            if (r4 == 0) goto L_0x0056
            int r4 = r4.getMeasuredHeight()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0057
        L_0x0056:
            r4 = r0
        L_0x0057:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "ONEME-6873|chats_list_page_state | root width:"
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = ", root height:"
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            r1.d(r2, r10, r3, r0)
        L_0x0070:
            android.view.View r10 = r11.getView()
            if (r10 == 0) goto L_0x0113
            java.lang.String r10 = r11.b
            java.lang.String r1 = "all.chat.folder"
            boolean r10 = defpackage.hhd.f(r10, r1)
            if (r10 == 0) goto L_0x0082
            goto L_0x0113
        L_0x0082:
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r10 = r11.n0()
            int r10 = r10.getMeasuredWidth()
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r11.n0()
            int r1 = r1.getMeasuredHeight()
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r2 = r11.n0()
            f6c r2 = r2.getAdapter()
            if (r2 == 0) goto L_0x00a5
            int r2 = r2.j()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x00a6
        L_0x00a5:
            r2 = r0
        L_0x00a6:
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r3 = r11.n0()
            int r3 = r3.getChildCount()
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r4 = r11.n0()
            r5 = 0
            r6 = r5
        L_0x00b4:
            int r7 = r4.getChildCount()
            if (r6 >= r7) goto L_0x00d2
            int r7 = r6 + 1
            android.view.View r6 = r4.getChildAt(r6)
            if (r6 == 0) goto L_0x00cc
            boolean r6 = r6.isAttachedToWindow()
            if (r6 == 0) goto L_0x00ca
            r5 = 1
            goto L_0x00d2
        L_0x00ca:
            r6 = r7
            goto L_0x00b4
        L_0x00cc:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException
            r10.<init>()
            throw r10
        L_0x00d2:
            java.lang.String r4 = r11.a
            fn6 r6 = defpackage.udd.e
            if (r6 != 0) goto L_0x00d9
            goto L_0x0113
        L_0x00d9:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x0113
            tn7 r7 = tn7.X
            java.lang.String r11 = r11.b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "ONEME-6873|chats_list_page_state | chats list state. folderId:"
            r8.<init>(r9)
            r8.append(r11)
            java.lang.String r11 = " | width:"
            r8.append(r11)
            r8.append(r10)
            java.lang.String r10 = "|height:"
            r8.append(r10)
            java.lang.String r10 = " | child:"
            java.lang.String r11 = "|childAttached:"
            th2.l(r8, r1, r10, r3, r11)
            r8.append(r5)
            java.lang.String r10 = "|adapterCount:"
            r8.append(r10)
            r8.append(r2)
            java.lang.String r10 = r8.toString()
            r6.d(r7, r4, r10, r0)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chats.tab.ChatsTabWidget.p0(int):void");
    }

    public final eja q0() {
        return new eja(uld.Y, Long.valueOf(m0().getCurrentItem() == 0 ? 1 : 2), 3);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [rr3, one.me.sdk.arch.Widget, one.me.chats.tab.ChatsTabWidget] */
    public ChatsTabWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = sy6.d;
        String name = ChatsTabWidget.class.getName();
        this.b = name;
        this.o = zf0.a.getAccessor().d(qna.class);
        tp2 tp2 = tp2.a;
        this.X = tp2.getAccessor().d(f03.class);
        this.Y = viewBinding(f2a.j);
        this.Z = viewBinding(f2a.e);
        this.w0 = viewBinding(f2a.d);
        this.x0 = viewBinding(f2a.f);
        this.y0 = createViewModelLazy(qt5.class, new rh2(19, new hk2(14)));
        this.z0 = tp2.getAccessor().d(xg9.class);
        this.B0 = new a30(tp2.c().a(), 5);
        this.C0 = 3;
        b bVar = new b();
        bVar.setMaxRecycledViews(qp2.a, 30);
        bVar.setMaxRecycledViews(qp2.b, 15);
        double d = ((double) 10) * 1.5d;
        bVar.setMaxRecycledViews(f2a.u, a24.W(d));
        bVar.setMaxRecycledViews(f2a.v, a24.W(d));
        bVar.setMaxRecycledViews(u5a.c, 3);
        this.D0 = new qs5(this, bVar, qs5.E0);
        xr7 b2 = tp2.b();
        b2.getClass();
        oma oma = oma.Y;
        b2.e.k(oma, new nma(oma, SystemClock.elapsedRealtime()));
        qod E = xs7.E(b2.d, (hu3) null, (ru3) null, new wr7(b2, (Continuation) null), 3);
        b2.f.put(lma.c, E);
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, name, us8.k("ONEME-6453|chats_list_lf | tabs subscribe on new data. Scope isActive: ", n1g.A(getLifecycleScope())), (Throwable) null);
        }
        ez3.N(new ck5(o0().x0, new hw2((Continuation) null, this), 5), getLifecycleScope());
    }
}

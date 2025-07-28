package ru.ok.messages.media.attaches;

import android.content.Intent;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;
import ru.ok.messages.media.chat.FrgChatMediaLoader;
import ru.ok.messages.messages.widgets.Chronometer;
import ru.ok.messages.secret.widgets.TimerView;

public class ActAttachesView extends s5 implements v06, ad2, yle, r98 {
    public static final HashSet D1 = new HashSet(Arrays.asList(new j10[]{j10.c, j10.o}));
    public q98 A1;
    public bd B1;
    public wf8 C1;
    public final ArrayList Z0 = new ArrayList();
    public v10 a1;
    public View b1;
    public TextView c1;
    public TextView d1;
    public ImageButton e1;
    public boolean f1 = false;
    public boolean g1 = false;
    public boolean h1 = false;
    public boolean i1 = false;
    public ViewPager j1;
    public String k1;
    public String l1;
    public FrgChatMediaLoader m1;
    public View n1;
    public TextView o1;
    public RelativeLayout p1;
    public og0 q1;
    public FrameLayout r1;
    public TimerView s1;
    public Chronometer t1;
    public mif u1;
    public int v1;
    public View w1;
    public View x1;
    public tg y1;
    public q98 z1;

    /* JADX WARNING: type inference failed for: r3v0, types: [androidx.fragment.app.b, r5, ru.ok.messages.media.attaches.ActAttachesView, android.app.Activity] */
    public final void U() {
        super.U();
        if (this.g1) {
            a D = P().D(yqb.act_attachments_view__fl_transition);
            nr8 nr8 = (nr8) getIntent().getParcelableExtra("ru.ok.tamtam.extra.START_MESSAGE");
            j0(D, nr8 != null ? nr8.a : null);
        }
    }

    public final String Z() {
        return "MEDIA_VIEWER";
    }

    public final mif a() {
        return this.u1;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [r5, ru.ok.messages.media.attaches.ActAttachesView, android.app.Activity] */
    public final q98 b() {
        if (this.z1 == null) {
            s98 k = ((k93) this.O0.b).k();
            getIntent().getBooleanExtra("ru.ok.tamtam.extra.CAST_ENABLED", true);
            this.z1 = k.m(t98.c, new z40(true, false, true));
        }
        return this.z1;
    }

    public final void c(boolean z, boolean z2, boolean z3) {
        this.f1 = z;
        if (z) {
            g0((View.OnSystemUiVisibilityChangeListener) null);
        } else {
            b0((View.OnSystemUiVisibilityChangeListener) null);
        }
        s0(z2, z3);
    }

    public final void c0(int i, int i2, Intent intent) {
        og0 og0 = this.q1;
        if (i == og0.b) {
            og0.getClass();
        }
    }

    public final void e() {
        boolean z = !this.f1;
        this.f1 = z;
        c(z, true, false);
    }

    public final boolean f() {
        return this.f1;
    }

    public final q98 i() {
        if (this.A1 == null) {
            this.A1 = ((k93) this.O0.b).k().m(t98.a, new z40(false, true, true));
        }
        return this.A1;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [androidx.fragment.app.b, r5, ru.ok.messages.media.attaches.ActAttachesView, im, android.app.Activity] */
    public final void j0(a aVar, xm8 xm8) {
        udd.q("ru.ok.messages.media.attaches.ActAttachesView", "endTransition: start");
        if (isFinishing() || !this.T0) {
            this.g1 = true;
            return;
        }
        findViewById(yqb.act_attachments_view__fl_transition).setVisibility(8);
        if (aVar != null) {
            vx5 P = P();
            P.getClass();
            hd0 hd0 = new hd0(P);
            hd0.h(aVar);
            hd0.d(false);
        }
        udd.q("ru.ok.messages.media.attaches.ActAttachesView", "endTransition: setPagerVisibility");
        this.j1.setVisibility(0);
        FrgChatMediaLoader frgChatMediaLoader = this.m1;
        if (frgChatMediaLoader != null) {
            ArrayList arrayList = frgChatMediaLoader.F1.d;
            if (arrayList.size() > 0) {
                l0(arrayList);
            } else {
                l0(Collections.singletonList(xm8));
            }
        }
        s0(true, false);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [ru.ok.messages.media.attaches.ActAttachesView, android.app.Activity] */
    public final long k0() {
        return getIntent().getLongExtra("ru.ok.tamtam.extra.CHAT_ID", 0);
    }

    public final void l0(List list) {
        udd.n("ru.ok.messages.media.attaches.ActAttachesView", "onLoadInitial: count=" + list.size());
        if (this.j1.getVisibility() == 0) {
            o0(list);
        }
    }

    public final void m0(xm8 xm8) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Z0;
            if (i >= arrayList.size()) {
                break;
            } else if (((xm8) arrayList.get(i)).a.b == xm8.a.b) {
                arrayList.set(i, xm8);
                break;
            } else {
                i++;
            }
        }
        q0();
    }

    public final void n0() {
        if (this.z1 != null) {
            ((k93) this.O0.b).k().r(this.z1);
            this.z1 = null;
        }
        if (this.A1 != null) {
            ((k93) this.O0.b).k().r(this.A1);
            this.A1 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [androidx.fragment.app.b, ru.ok.messages.media.attaches.ActAttachesView, android.app.Activity] */
    public final void o0(List list) {
        int indexOf;
        if (!getIntent().getBooleanExtra("ru.ok.tamtam.extra.SINGLE_ATTACH", false)) {
            list = FrgChatMediaLoader.s1(list, D1);
        }
        if (this.a1 == null) {
            v10 v10 = new v10(P(), this.Z0, this, getIntent().getBooleanExtra("ru.ok.tamtam.extra.START_WITH_LOW_RES", false), getIntent().getBooleanExtra("ru.ok.tamtam.extra.COMPAT_MODE", false));
            this.a1 = v10;
            String str = this.l1;
            if (str != null) {
                v10.q = str;
                this.l1 = null;
            }
            this.j1.setAdapter(v10);
        }
        if (getIntent().getBooleanExtra("ru.ok.tamtam.extra.EXTRA_WITH_TRANSITION", false) || getIntent().getBooleanExtra("ru.ok.tamtam.extra.SINGLE_ATTACH", false) || getIntent().getBooleanExtra("ru.ok.tamtam.extra.START_COMPAT_VIDEO", false)) {
            this.a1.p = this.k1;
        }
        v10 v102 = this.a1;
        v102.k.clear();
        v102.j.clear();
        this.a1.j(list, true);
        this.a1.d();
        v10 v103 = this.a1;
        if (v103 != null && (indexOf = v103.j.indexOf(this.k1)) != -1) {
            ViewPager viewPager = this.j1;
            viewPager.N0 = false;
            viewPager.v(indexOf, 0, false, false);
            q0();
        }
    }

    public final void onBackPressed() {
        n0();
        super.onBackPressed();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, ru.ok.messages.media.attaches.ActAttachesView, im, java.lang.Object] */
    public final void onConfigurationChanged(Configuration configuration) {
        int indexOf;
        Toolbar toolbar;
        ActAttachesView.super.onConfigurationChanged(configuration);
        int i = this.v1;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.B1.d(i2, "ATTACHES_SCREEN_ORIENTATION_CHANGED");
        }
        this.v1 = configuration.orientation;
        this.h1 = true;
        mif mif = this.u1;
        if (!(mif == null || (toolbar = (Toolbar) mif.b) == null)) {
            mn mnVar = (mn) mif.a;
            if (mnVar.M() != null) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = dh4.a(mnVar.M());
                toolbar.setLayoutParams(layoutParams);
            }
        }
        ViewGroup.LayoutParams layoutParams2 = this.p1.getLayoutParams();
        layoutParams2.height = dh4.a(this);
        this.p1.setLayoutParams(layoutParams2);
        v10 v10 = this.a1;
        if (!(v10 == null || (indexOf = v10.j.indexOf(this.k1)) == -1)) {
            ViewPager viewPager = this.j1;
            viewPager.N0 = false;
            viewPager.v(indexOf, 0, false, false);
            q0();
        }
        at7.Q(new b(2, (Object) this), 300);
        r0();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: im} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = 1
            r4 = 0
            super.onCreate(r17)
            android.view.Window r5 = r16.getWindow()
            android.view.WindowManager$LayoutParams r5 = r5.getAttributes()
            r5.layoutInDisplayCutoutMode = r3
            q98 r5 = r16.b()
            r0.z1 = r5
            q98 r5 = r16.i()
            r0.A1 = r5
            if (r1 == 0) goto L_0x006b
            q98 r5 = r0.z1
            al7 r5 = (defpackage.al7) r5
            java.lang.String r6 = "MediaPlayerController.Volume"
            java.lang.String r7 = r5.b(r6)
            float r7 = r1.getFloat(r7)
            r5.h = r7
            java.lang.String r7 = "MediaPlayerController.Looping"
            java.lang.String r8 = r5.b(r7)
            boolean r8 = r1.getBoolean(r8)
            r5.i = r8
            java.lang.String r8 = "MediaPlayerController.PlayWhenReady"
            java.lang.String r9 = r5.b(r8)
            boolean r9 = r1.getBoolean(r9)
            r5.j = r9
            q98 r5 = r0.A1
            al7 r5 = (defpackage.al7) r5
            java.lang.String r6 = r5.b(r6)
            float r6 = r1.getFloat(r6)
            r5.h = r6
            java.lang.String r6 = r5.b(r7)
            boolean r6 = r1.getBoolean(r6)
            r5.i = r6
            java.lang.String r6 = r5.b(r8)
            boolean r6 = r1.getBoolean(r6)
            r5.j = r6
        L_0x006b:
            v2b r5 = r0.O0
            java.lang.Object r5 = r5.b
            k93 r5 = (defpackage.k93) r5
            o2a r5 = (o2a) r5
            tg r5 = r5.c()
            r0.y1 = r5
            v2b r5 = r0.O0
            java.lang.Object r5 = r5.b
            k93 r5 = (defpackage.k93) r5
            o2a r5 = (o2a) r5
            bd r5 = r5.b()
            r0.B1 = r5
            android.content.res.Resources r5 = r16.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.orientation
            r0.v1 = r5
            int r5 = defpackage.zrb.act_attachments_view
            mif r5 = r0.i0(r5)
            r0.u1 = r5
            int r5 = defpackage.yqb.act_attachments_view__fl_root
            r0.findViewById(r5)
            mn r5 = new mn
            r5.<init>(r0)
            int r6 = defpackage.yqb.toolbar
            android.view.View r6 = r0.findViewById(r6)
            androidx.appcompat.widget.Toolbar r6 = (androidx.appcompat.widget.Toolbar) r6
            ci9 r7 = new ci9
            r7.<init>(r5, r6)
            wce r5 = r16.t()
            r7.c = r5
            mif r5 = new mif
            r5.<init>(r7)
            r0.u1 = r5
            d5 r6 = new d5
            r6.<init>((int) r4, (java.lang.Object) r0)
            java.lang.Object r5 = r5.b
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
            if (r5 == 0) goto L_0x00cd
            r5.setNavigationOnClickListener(r6)
        L_0x00cd:
            mif r5 = r0.u1
            int r6 = defpackage.zhc.j
            java.lang.Object r7 = r5.c
            wce r7 = (defpackage.wce) r7
            int r7 = r7.w
            java.lang.Object r5 = r5.b
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
            if (r5 == 0) goto L_0x00e9
            r5.setNavigationIcon(r6)
            android.graphics.drawable.Drawable r5 = r5.getNavigationIcon()
            if (r5 == 0) goto L_0x00e9
            js.D(r5, r7)
        L_0x00e9:
            mif r5 = r0.u1
            v2b r6 = r0.O0
            java.lang.Object r6 = r6.c
            zg4 r6 = (defpackage.zg4) r6
            int r6 = r6.a
            java.lang.Object r5 = r5.b
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
            if (r5 == 0) goto L_0x00ff
            float r6 = (float) r6
            java.util.WeakHashMap r7 = eaf.a
            t9f.s(r5, r6)
        L_0x00ff:
            int r5 = defpackage.yqb.act_attachments_view__vp_pager
            android.view.View r5 = r0.findViewById(r5)
            androidx.viewpager.widget.ViewPager r5 = (androidx.viewpager.widget.ViewPager) r5
            r0.j1 = r5
            j5 r6 = new j5
            r6.<init>(r0, r4)
            r5.b(r6)
            int r5 = defpackage.yqb.act_attachments_view__rl_info
            android.view.View r5 = r0.findViewById(r5)
            r0.b1 = r5
            int r5 = defpackage.yqb.act_attachments_view__info_separator
            android.view.View r5 = r0.findViewById(r5)
            r0.x1 = r5
            android.view.View r5 = r0.b1
            int r6 = defpackage.yqb.act_attachments_view__rl_author
            android.view.View r5 = r5.findViewById(r6)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            r0.p1 = r5
            int r5 = defpackage.yqb.act_attachments_view__tv_author
            android.view.View r5 = r0.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.c1 = r5
            int r5 = defpackage.yqb.act_attachments_view__tv_date
            android.view.View r5 = r0.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.d1 = r5
            int r5 = defpackage.yqb.act_attachments_view__iv_forward
            android.view.View r5 = r0.findViewById(r5)
            android.widget.ImageButton r5 = (android.widget.ImageButton) r5
            r0.e1 = r5
            f5 r6 = new f5
            r6.<init>(r4, r0)
            at7.i(r5, r6)
            int r5 = defpackage.yqb.act_attachments_view__fl_caption
            android.view.View r5 = r0.findViewById(r5)
            r0.n1 = r5
            int r5 = defpackage.yqb.act_attachments_view__tv_caption
            android.view.View r5 = r0.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.o1 = r5
            int r5 = defpackage.yqb.act_attachments_view__caption_divider
            android.view.View r5 = r0.findViewById(r5)
            r0.w1 = r5
            int r5 = defpackage.yqb.act_attachments_view__fl_timer
            android.view.View r5 = r0.findViewById(r5)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r0.r1 = r5
            int r5 = defpackage.yqb.act_attachments_view__timer
            android.view.View r5 = r0.findViewById(r5)
            ru.ok.messages.secret.widgets.TimerView r5 = (ru.ok.messages.secret.widgets.TimerView) r5
            r0.s1 = r5
            int r5 = defpackage.yqb.act_attachments_view__chrono
            android.view.View r5 = r0.findViewById(r5)
            ru.ok.messages.messages.widgets.Chronometer r5 = (ru.ok.messages.messages.widgets.Chronometer) r5
            r0.t1 = r5
            android.view.View r5 = r0.b1
            wf8 r6 = r0.C1
            int r6 = r6.m
            r5.setBackgroundColor(r6)
            android.widget.ImageButton r5 = r0.e1
            wf8 r6 = r0.C1
            int r6 = r6.w
            r5.setColorFilter(r6)
            android.widget.ImageButton r5 = r0.e1
            wf8 r6 = r0.C1
            android.graphics.drawable.RippleDrawable r6 = r6.a()
            r5.setBackground(r6)
            wf8 r5 = r0.C1
            int r5 = r5.F
            android.widget.TextView r6 = r0.o1
            r6.setTextColor(r5)
            android.view.View r6 = r0.w1
            wf8 r7 = r0.C1
            int r7 = r7.K
            r6.setBackgroundColor(r7)
            android.widget.TextView r6 = r0.c1
            r6.setTextColor(r5)
            android.widget.TextView r6 = r0.d1
            r6.setTextColor(r5)
            mif r5 = r0.u1
            wf8 r6 = r0.C1
            r5.c = r6
            java.lang.Object r7 = r5.b
            androidx.appcompat.widget.Toolbar r7 = (androidx.appcompat.widget.Toolbar) r7
            android.view.Menu r7 = r7.getMenu()
            r12 = 0
            js.b(r6, r7, r12)
            java.lang.Object r7 = r5.o
            r8 = r7
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.Object r7 = r5.X
            r9 = r7
            android.widget.TextView r9 = (android.widget.TextView) r9
            int r10 = r6.F
            int r11 = r6.M
            java.lang.Object r5 = r5.b
            r7 = r5
            androidx.appcompat.widget.Toolbar r7 = (androidx.appcompat.widget.Toolbar) r7
            js.d(r6, r7, r8, r9, r10, r11)
            wce r5 = r16.t()
            int r5 = r5.L
            r0.f0(r5)
            android.view.View r5 = r0.x1
            wf8 r6 = r0.C1
            int r6 = r6.K
            r5.setBackgroundColor(r6)
            android.view.View r5 = r0.b1
            e5 r6 = new e5
            r6.<init>(r0)
            java.util.WeakHashMap r7 = eaf.a
            t9f.u(r5, r6)
            android.view.View r5 = r0.b1
            r9f.c(r5)
            android.content.Intent r5 = r16.getIntent()
            java.lang.String r6 = "ru.ok.tamtam.extra.START_MESSAGE"
            android.os.Parcelable r5 = r5.getParcelableExtra(r6)
            nr8 r5 = (defpackage.nr8) r5
            if (r5 == 0) goto L_0x0220
            xm8 r5 = r5.a
            goto L_0x0221
        L_0x0220:
            r5 = r12
        L_0x0221:
            if (r5 != 0) goto L_0x0227
            r16.finish()
            return
        L_0x0227:
            long r6 = r16.k0()
            android.content.Intent r8 = r16.getIntent()
            java.lang.String r9 = "ru.ok.tamtam.extra.SINGLE_ATTACH"
            boolean r8 = r8.getBooleanExtra(r9, r4)
            vo8 r9 = r5.a
            if (r8 == 0) goto L_0x023a
            goto L_0x02aa
        L_0x023a:
            vx5 r8 = r16.P()
            java.lang.String r10 = "photo_video"
            androidx.fragment.app.a r8 = r8.E(r10)
            ru.ok.messages.media.chat.FrgChatMediaLoader r8 = (ru.ok.messages.media.chat.FrgChatMediaLoader) r8
            r0.m1 = r8
            if (r8 != 0) goto L_0x02aa
            long r13 = r9.b
            java.lang.Long r8 = java.lang.Long.valueOf(r13)
            java.util.HashSet r11 = defpackage.kg8.d
            android.content.Intent r15 = r16.getIntent()
            java.lang.String r12 = "ru.ok.tamtam.extra.DESC_ORDER"
            boolean r15 = r15.getBooleanExtra(r12, r4)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r8, r3}
            java.lang.String r3 = "ru.ok.messages.media.chat.FrgChatMediaLoader"
            java.lang.String r8 = "newInstance: chatId = %d, initialMessageId = %d, descOrder = %b"
            udd.p(r3, r8, r2)
            ru.ok.messages.media.chat.FrgChatMediaLoader r2 = new ru.ok.messages.media.chat.FrgChatMediaLoader
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r8 = "ru.ok.tamtam.extra.CHAT_ID"
            r3.putLong(r8, r6)
            r3.putBoolean(r12, r15)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r11)
            java.lang.String r7 = "ru.ok.tamtam.extra.TYPES"
            r3.putIntegerArrayList(r7, r6)
            java.lang.String r6 = "ru.ok.tamtam.extra.INITIAL_MESSAGE_ID"
            r3.putLong(r6, r13)
            r2.Y0(r3)
            r0.m1 = r2
            vx5 r2 = r16.P()
            ru.ok.messages.media.chat.FrgChatMediaLoader r3 = r0.m1
            r2.getClass()
            hd0 r6 = new hd0
            r6.<init>(r2)
            r2 = 1
            r6.f(r4, r3, r10, r2)
            r6.d(r4)
        L_0x02aa:
            java.lang.String r2 = "ru.ok.tamtam.extra.START_LOCAL_ID"
            if (r1 != 0) goto L_0x0439
            java.lang.String r1 = "ru.ok.messages.media.attaches.ActAttachesView"
            java.lang.String r3 = "onCreate: savedInstanceState == null"
            udd.q(r1, r3)
            android.content.Intent r1 = r16.getIntent()
            java.lang.String r1 = r1.getStringExtra(r2)
            r0.k1 = r1
            android.content.Intent r1 = r16.getIntent()
            java.lang.String r3 = "ru.ok.tamtam.extra.PLAY_VIDEO_ID"
            java.lang.String r1 = r1.getStringExtra(r3)
            r0.l1 = r1
            android.content.Intent r1 = r16.getIntent()
            java.lang.String r3 = "ru.ok.tamtam.extra.EXTRA_WITH_TRANSITION"
            boolean r1 = r1.getBooleanExtra(r3, r4)
            if (r1 == 0) goto L_0x0452
            jj7 r1 = r9.D0
            r3 = r4
            r12 = 0
        L_0x02db:
            int r6 = r1.v()
            if (r3 >= r6) goto L_0x02fd
            o10 r6 = r1.u(r3)
            java.lang.String r6 = r6.q
            android.content.Intent r7 = r16.getIntent()
            java.lang.String r7 = r7.getStringExtra(r2)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x02fa
            o10 r6 = r1.u(r3)
            r12 = r6
        L_0x02fa:
            r6 = 1
            int r3 = r3 + r6
            goto L_0x02db
        L_0x02fd:
            if (r12 != 0) goto L_0x0303
            o10 r12 = r1.u(r4)
        L_0x0303:
            boolean r1 = r12.g()
            if (r1 == 0) goto L_0x0313
            f10 r1 = r12.g
            boolean r2 = r1.a()
            if (r2 == 0) goto L_0x0313
            o10 r12 = r1.g
        L_0x0313:
            boolean r1 = ete.J(r12)
            boolean r2 = r12.f()
            if (r2 != 0) goto L_0x0333
            if (r1 == 0) goto L_0x0320
            goto L_0x0333
        L_0x0320:
            r3 = 1
            android.os.Bundle r6 = ru.ok.messages.media.attaches.fragments.FrgAttachView.t1(r12, r5, r3, r4, r4)
            java.lang.String r3 = "ru.ok.tamtam.extra.PLAY_AT_START"
            r6.putBoolean(r3, r4)
            ru.ok.messages.media.attaches.fragments.FrgAttachVideo r3 = new ru.ok.messages.media.attaches.fragments.FrgAttachVideo
            r3.<init>()
            r3.Y0(r6)
            goto L_0x034b
        L_0x0333:
            android.content.Intent r3 = r16.getIntent()
            java.lang.String r6 = "ru.ok.tamtam.extra.START_WITH_LOW_RES"
            boolean r3 = r3.getBooleanExtra(r6, r4)
            r6 = 1
            android.os.Bundle r3 = ru.ok.messages.media.attaches.fragments.FrgAttachView.t1(r12, r5, r6, r4, r3)
            ru.ok.messages.media.attaches.fragments.FrgAttachPhoto r6 = new ru.ok.messages.media.attaches.fragments.FrgAttachPhoto
            r6.<init>()
            r6.Y0(r3)
            r3 = r6
        L_0x034b:
            android.os.Bundle r6 = r3.Z
            android.content.Intent r7 = r16.getIntent()
            java.lang.String r8 = "ru.ok.tamtam.extra.COMPAT_MODE"
            boolean r7 = r7.getBooleanExtra(r8, r4)
            r6.putBoolean(r8, r7)
            vx5 r6 = r16.P()
            int r7 = defpackage.yqb.act_attachments_view__fl_transition
            java.lang.String r8 = "ru.ok.messages.media.attaches.fragments.FrgAttachPhoto"
            kjd.c(r6, r7, r3, r8)
            androidx.viewpager.widget.ViewPager r6 = r0.j1
            r7 = 8
            r6.setVisibility(r7)
            android.view.View r6 = r0.b1
            r6.setVisibility(r7)
            mif r6 = r0.u1
            java.lang.Object r6 = r6.b
            androidx.appcompat.widget.Toolbar r6 = (androidx.appcompat.widget.Toolbar) r6
            if (r6 == 0) goto L_0x037c
            r6.setVisibility(r7)
        L_0x037c:
            android.content.Intent r6 = r16.getIntent()
            java.lang.String r7 = "ru.ok.tamtam.extra.EXTRA_TRANSITION_RECT"
            android.os.Parcelable r6 = r6.getParcelableExtra(r7)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            jlc r8 = jlc.j
            jlc r10 = jlc.g
            if (r2 != 0) goto L_0x039f
            if (r1 == 0) goto L_0x0391
            goto L_0x039f
        L_0x0391:
            android.transition.TransitionSet r1 = new android.transition.TransitionSet
            r1.<init>()
            android.transition.ChangeBounds r11 = new android.transition.ChangeBounds
            r11.<init>()
            r1.addTransition(r11)
            goto L_0x03ac
        L_0x039f:
            boolean r1 = r12.i()
            if (r1 == 0) goto L_0x03a7
            r1 = r10
            goto L_0x03a8
        L_0x03a7:
            r1 = r8
        L_0x03a8:
            android.transition.TransitionSet r1 = nn4.b(r10, r1)
        L_0x03ac:
            if (r6 == 0) goto L_0x03b8
            l03 r11 = new l03
            r13 = 1
            r11.<init>(r6, r13)
            r1.addTransition(r11)
            goto L_0x03b9
        L_0x03b8:
            r13 = 1
        L_0x03b9:
            if (r2 == 0) goto L_0x03c6
            a10 r2 = r12.b
            java.lang.String r2 = r2.x0
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x03c6
            goto L_0x03c7
        L_0x03c6:
            r13 = r4
        L_0x03c7:
            android.content.Intent r2 = r16.getIntent()
            java.lang.String r11 = "ru.ok.tamtam.extra.EXTRA_TRANSITION_CORNERS"
            float[] r2 = r2.getFloatArrayExtra(r11)
            if (r2 == 0) goto L_0x03df
            if (r13 != 0) goto L_0x03df
            in4 r12 = new in4
            float[] r13 = defpackage.in4.o
            r12.<init>(r2, r13)
            r1.addTransition(r12)
        L_0x03df:
            h5 r2 = new h5
            r2.<init>(r0, r3, r5)
            r1.addListener(r2)
            i5 r2 = new i5
            r2.<init>(r6)
            r0.setEnterSharedElementCallback(r2)
            r2 = 200(0xc8, double:9.9E-322)
            r1.setDuration(r2)
            android.view.Window r6 = r16.getWindow()
            r6.setSharedElementEnterTransition(r1)
            boolean r1 = r9.C()
            if (r1 == 0) goto L_0x0402
            r8 = r10
        L_0x0402:
            android.transition.TransitionSet r1 = nn4.b(r8, r10)
            android.content.Intent r6 = r16.getIntent()
            android.os.Parcelable r6 = r6.getParcelableExtra(r7)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            if (r6 == 0) goto L_0x041a
            l03 r7 = new l03
            r7.<init>(r6, r4)
            r1.addTransition(r7)
        L_0x041a:
            android.content.Intent r6 = r16.getIntent()
            float[] r6 = r6.getFloatArrayExtra(r11)
            if (r6 == 0) goto L_0x042e
            in4 r7 = new in4
            float[] r8 = defpackage.in4.o
            r7.<init>(r8, r6)
            r1.addTransition(r7)
        L_0x042e:
            r1.setDuration(r2)
            android.view.Window r2 = r16.getWindow()
            r2.setSharedElementReturnTransition(r1)
            goto L_0x0452
        L_0x0439:
            java.lang.String r2 = r1.getString(r2)
            r0.k1 = r2
            java.lang.String r2 = "ru.ok.tamtam.extra.UI_STATE"
            boolean r2 = r1.getBoolean(r2)
            r0.f1 = r2
            java.lang.String r2 = "ru.ok.tamtam.extra.EXTRA_FINISH_TRANSITION_ON_RESUME"
            boolean r1 = r1.getBoolean(r2)
            r0.g1 = r1
            r0.s0(r4, r4)
        L_0x0452:
            ru.ok.messages.media.chat.FrgChatMediaLoader r1 = r0.m1
            if (r1 != 0) goto L_0x04a0
            java.util.List r1 = java.util.Collections.singletonList(r5)
            r0.o0(r1)
            r0.p0(r4)
            v2b r1 = r0.O0
            java.lang.Object r1 = r1.b
            k93 r1 = (defpackage.k93) r1
            o2a r1 = (o2a) r1
            r1.getClass()
            nqc r1 = defpackage.nqc.a
            sk7 r1 = r1.m()
            long r2 = r9.b
            r1.getClass()
            r5 = 2
            mv9 r1 = defpackage.sk7.b(r1, r2, r4, r5)
            qmc r2 = cnc.b()
            yhd r1 = r1.m(r2)
            qmc r2 = de.a()
            yhd r1 = r1.i(r2)
            e5 r2 = new e5
            r2.<init>(r0)
            pv0 r3 = new pv0
            r5 = 11
            r3.<init>(r5)
            pn1 r5 = new pn1
            r6 = 2
            r5.<init>(r2, r6, r3)
            r1.k(r5)
        L_0x04a0:
            og0 r1 = new og0
            r2 = 987(0x3db, float:1.383E-42)
            r1.<init>(r2)
            r0.q1 = r1
            r0.c(r4, r4, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.ActAttachesView.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        super.onDestroy();
        n0();
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [android.content.Context, r5, ru.ok.messages.media.attaches.ActAttachesView, android.app.Activity] */
    @a1e
    public void onEvent(l89 l89) {
        List list;
        boolean z;
        xm8 xm8;
        Object obj;
        if (this.T0 && l89.b == k0() && (list = l89.X) != null) {
            if (this.m1 == null) {
                int i = 0;
                while (i < this.a1.j.size()) {
                    yia l = this.a1.l(i);
                    if (l == null || (obj = l.b) == null || !list.contains(Long.valueOf(((xm8) obj).a.b))) {
                        i++;
                    } else {
                        a06.H(0, this, getString(cic.x1));
                        overridePendingTransition(0, 0);
                        finish();
                        return;
                    }
                }
                return;
            }
            int currentItem = this.j1.getCurrentItem();
            Iterator it = list.iterator();
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Long l2 = (Long) it.next();
                FrgChatMediaLoader frgChatMediaLoader = this.m1;
                long longValue = l2.longValue();
                Iterator it2 = frgChatMediaLoader.F1.d.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        xm8 = null;
                        break;
                    }
                    xm8 = (xm8) it2.next();
                    if (xm8.a.b == longValue) {
                        break;
                    }
                }
                if (xm8 != null) {
                    if (xm8.a.c == 0) {
                        z2 = true;
                        z3 = true;
                    } else {
                        z2 = true;
                    }
                }
                FrgChatMediaLoader frgChatMediaLoader2 = this.m1;
                long longValue2 = l2.longValue();
                bd2 bd2 = frgChatMediaLoader2.F1;
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = bd2.d;
                    if (i2 >= arrayList.size()) {
                        break;
                    } else if (((xm8) arrayList.get(i2)).a.b == longValue2) {
                        arrayList.remove(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (z2) {
                if (this.m1.F1.d.size() > 0) {
                    o0(this.m1.F1.d);
                    if (currentItem >= this.a1.j.size()) {
                        currentItem = this.a1.j.size() - 1;
                    }
                    yia l3 = this.a1.l(currentItem);
                    if (l3 != null) {
                        String str = ((o10) l3.a).q;
                        this.k1 = str;
                        p0(currentItem);
                        ViewPager viewPager = this.j1;
                        viewPager.N0 = false;
                        viewPager.v(currentItem, 0, false, false);
                        z = !TextUtils.equals(str, this.k1);
                    } else {
                        z = false;
                    }
                } else {
                    overridePendingTransition(0, 0);
                    finish();
                }
                if (z) {
                    a06.H(0, this, getString(z3 ? cic.e3 : cic.x1));
                }
            }
        }
    }

    public final void onPause() {
        super.onPause();
        FrgChatMediaLoader frgChatMediaLoader = this.m1;
        if (frgChatMediaLoader != null) {
            frgChatMediaLoader.F1.o.remove(this);
        }
        if (this.z1 != null) {
            ((k93) this.O0.b).k().n(this.z1);
        }
        if (this.A1 != null) {
            ((k93) this.O0.b).k().n(this.A1);
        }
    }

    public final void onResume() {
        super.onResume();
        FrgChatMediaLoader frgChatMediaLoader = this.m1;
        if (frgChatMediaLoader != null) {
            if (!this.h1 && frgChatMediaLoader.F1.d.size() > 0 && this.m1.F1.d.size() != this.Z0.size()) {
                l0(this.m1.F1.d);
            }
            this.h1 = false;
            this.m1.F1.o.add(this);
            if (this.m1.F1.k) {
                q0();
            }
        }
        v10 v10 = this.a1;
        if (v10 != null) {
            if (v10.k.size() != 0) {
                v10 v102 = this.a1;
                FrgAttachVideo frgAttachVideo = (a) v102.g.get(v102.h(this.j1.getCurrentItem()));
                if (frgAttachVideo instanceof FrgAttachVideo) {
                    frgAttachVideo.G1();
                }
            }
            if (this.z1 != null) {
                ((k93) this.O0.b).k().k(this.z1);
            }
            if (this.A1 != null) {
                ((k93) this.O0.b).k().k(this.A1);
            }
            c(this.f1, false, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r0 = r6.a1.l(r6.j1.getCurrentItem());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSaveInstanceState(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onSaveInstanceState(r7)
            java.lang.String r0 = "ru.ok.tamtam.extra.UI_STATE"
            boolean r1 = r6.f1
            r7.putBoolean(r0, r1)
            v10 r0 = r6.a1
            if (r0 == 0) goto L_0x002c
            java.util.List r0 = r0.k
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0017
            goto L_0x002c
        L_0x0017:
            v10 r0 = r6.a1
            androidx.viewpager.widget.ViewPager r1 = r6.j1
            int r1 = r1.getCurrentItem()
            yia r0 = r0.l(r1)
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r0.a
            o10 r0 = (defpackage.o10) r0
            java.lang.String r0 = r0.q
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            java.lang.String r1 = "ru.ok.tamtam.extra.START_LOCAL_ID"
            r7.putString(r1, r0)
            java.lang.String r0 = "ru.ok.tamtam.extra.EXTRA_FINISH_TRANSITION_ON_RESUME"
            boolean r1 = r6.g1
            r7.putBoolean(r0, r1)
            q98 r0 = r6.z1
            java.lang.String r1 = "MediaPlayerController.PlayWhenReady"
            java.lang.String r2 = "MediaPlayerController.Looping"
            java.lang.String r3 = "MediaPlayerController.Volume"
            if (r0 == 0) goto L_0x0060
            al7 r0 = (defpackage.al7) r0
            java.lang.String r4 = r0.b(r3)
            float r5 = r0.h
            r7.putFloat(r4, r5)
            java.lang.String r4 = r0.b(r2)
            boolean r5 = r0.i
            r7.putBoolean(r4, r5)
            java.lang.String r4 = r0.b(r1)
            boolean r0 = r0.j
            r7.putBoolean(r4, r0)
        L_0x0060:
            q98 r6 = r6.A1
            if (r6 == 0) goto L_0x0081
            al7 r6 = (defpackage.al7) r6
            java.lang.String r0 = r6.b(r3)
            float r3 = r6.h
            r7.putFloat(r0, r3)
            java.lang.String r0 = r6.b(r2)
            boolean r2 = r6.i
            r7.putBoolean(r0, r2)
            java.lang.String r0 = r6.b(r1)
            boolean r6 = r6.j
            r7.putBoolean(r0, r6)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.ActAttachesView.onSaveInstanceState(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ru.ok.messages.media.attaches.ActAttachesView, android.app.Activity] */
    public final void onWindowFocusChanged(boolean z) {
        ActAttachesView.super.onWindowFocusChanged(z);
        v10 v10 = this.a1;
        if (v10 != null) {
            for (WeakReference weakReference : v10.o.values()) {
                FrgAttachView frgAttachView = (FrgAttachView) weakReference.get();
                if (frgAttachView != null) {
                    frgAttachView.y1(z);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.content.Context, r5, ru.ok.messages.media.attaches.ActAttachesView] */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0255, code lost:
        if (defpackage.ir8.c(r0, r3) != false) goto L_0x0259;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p0(int r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 1
            v10 r3 = r0.a1
            if (r3 == 0) goto L_0x025c
            yia r3 = r3.l(r1)
            if (r3 == 0) goto L_0x025c
            java.lang.Object r4 = r3.b
            xm8 r4 = (defpackage.xm8) r4
            java.lang.Object r3 = r3.a
            o10 r3 = (defpackage.o10) r3
            boolean r5 = r0.i1
            if (r5 == 0) goto L_0x001d
            goto L_0x025c
        L_0x001d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "updateAttachInfo: position: "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ru.ok.messages.media.attaches.ActAttachesView"
            udd.q(r6, r5)
            ru.ok.messages.media.chat.FrgChatMediaLoader r5 = r0.m1
            j10 r6 = defpackage.j10.o
            if (r5 == 0) goto L_0x003c
            bd2 r5 = r5.F1
            boolean r5 = r5.k
            if (r5 != 0) goto L_0x0046
        L_0x003c:
            vo8 r5 = r4.a
            jj7 r5 = r5.D0
            int r5 = r5.v()
            if (r5 <= r2) goto L_0x0075
        L_0x0046:
            mif r5 = r0.u1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r1 = r1 + r2
            r7.append(r1)
            java.lang.String r1 = " "
            r7.append(r1)
            int r8 = defpackage.whc.B
            java.lang.String r8 = r0.getString(r8)
            r7.append(r8)
            r7.append(r1)
            v10 r1 = r0.a1
            java.util.ArrayList r1 = r1.j
            int r1 = r1.size()
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            r5.l(r1)
            goto L_0x00a4
        L_0x0075:
            j10 r1 = r3.a
            j10 r5 = defpackage.j10.c
            if (r1 != r5) goto L_0x0087
            mif r1 = r0.u1
            int r5 = defpackage.cic.o2
            java.lang.String r5 = r0.getString(r5)
            r1.l(r5)
            goto L_0x00a4
        L_0x0087:
            if (r1 != r6) goto L_0x0095
            mif r1 = r0.u1
            int r5 = defpackage.cic.k3
            java.lang.String r5 = r0.getString(r5)
            r1.l(r5)
            goto L_0x00a4
        L_0x0095:
            j10 r5 = defpackage.j10.y0
            if (r1 != r5) goto L_0x00a4
            mif r1 = r0.u1
            int r5 = defpackage.cic.e
            java.lang.String r5 = r0.getString(r5)
            r1.l(r5)
        L_0x00a4:
            v2b r1 = r0.O0
            java.lang.Object r1 = r1.b
            k93 r1 = (defpackage.k93) r1
            j10 r5 = r3.a
            r7 = 0
            r8 = 8
            if (r5 == r6) goto L_0x010d
            vo8 r5 = r4.a
            java.lang.String r5 = r5.w0
            boolean r5 = r1g.p(r5)
            if (r5 != 0) goto L_0x010d
            android.view.View r5 = r0.n1
            r5.setVisibility(r7)
            r5 = r1
            o2a r5 = (o2a) r5
            t52 r5 = r5.e()
            long r9 = r20.k0()
            i22 r5 = r5.B(r9)
            o1b r9 = r4.X
            r9.f = r5
            w6a r10 = r9.a
            int r11 = r10.f()
            int r10 = r10.e()
            r9.i(r5, r11, r10)
            java.lang.CharSequence r5 = r9.g
            android.text.SpannableStringBuilder r5 = android.text.SpannableStringBuilder.valueOf(r5)
            java.lang.String[] r9 = defpackage.dhe.b
            boolean r9 = r5 instanceof android.text.Spannable
            if (r9 == 0) goto L_0x0107
            boolean r9 = r1g.p(r5)
            if (r9 != 0) goto L_0x0107
            int r9 = r5.length()
            java.lang.Class<android.text.style.URLSpan> r10 = android.text.style.URLSpan.class
            java.lang.Object[] r9 = r5.getSpans(r7, r9, r10)
            int r10 = r9.length
            r11 = r7
        L_0x00fe:
            if (r11 >= r10) goto L_0x0107
            r12 = r9[r11]
            r5.removeSpan(r12)
            int r11 = r11 + r2
            goto L_0x00fe
        L_0x0107:
            android.widget.TextView r9 = r0.o1
            r9.setText(r5)
            goto L_0x0112
        L_0x010d:
            android.view.View r5 = r0.n1
            r5.setVisibility(r8)
        L_0x0112:
            j10 r5 = r3.a
            r9 = 0
            if (r5 != r6) goto L_0x015e
            g10 r5 = r3.n
            boolean r5 = r5.d()
            if (r5 == 0) goto L_0x015e
            n10 r5 = r3.d
            long r5 = r5.a
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x015e
            long r5 = r3.t
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x014d
            android.widget.TextView r1 = r0.c1
            int r11 = defpackage.cic.h3
            java.lang.String r11 = r0.getString(r11)
            long r12 = r3.u
            r3 = 0
            java.lang.String r12 = defpackage.dhe.w(r12, r7, r3)
            java.lang.String r3 = defpackage.dhe.w(r5, r7, r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r12, r3}
            java.lang.String r3 = java.lang.String.format(r11, r3)
            r1.setText(r3)
            goto L_0x0158
        L_0x014d:
            android.widget.TextView r1 = r0.c1
            int r3 = defpackage.cic.i3
            java.lang.String r3 = r0.getString(r3)
            r1.setText(r3)
        L_0x0158:
            android.widget.TextView r1 = r0.d1
            r1.setVisibility(r8)
            goto L_0x01ac
        L_0x015e:
            o2a r1 = (o2a) r1
            t52 r3 = r1.e()
            long r5 = r20.k0()
            i22 r3 = r3.B(r5)
            if (r3 == 0) goto L_0x0173
            java.lang.String r3 = r4.c(r3)
            goto L_0x0179
        L_0x0173:
            int r3 = defpackage.whc.E
            java.lang.String r3 = r0.getString(r3)
        L_0x0179:
            android.widget.TextView r5 = r0.c1
            w4 r6 = r1.getAccessor()
            java.lang.Class<w6a> r11 = w6a.class
            java.lang.Object r6 = r6.c(r11)
            w6a r6 = (w6a) r6
            nu4 r6 = r6.j
            java.lang.CharSequence r3 = r6.e(r3)
            r5.setText(r3)
            android.widget.TextView r3 = r0.d1
            r3.setVisibility(r7)
            android.widget.TextView r3 = r0.d1
            w4 r1 = r1.getAccessor()
            java.lang.Object r1 = r1.c(r11)
            w6a r1 = (w6a) r1
            vo8 r5 = r4.a
            long r5 = r5.o
            java.lang.String r1 = r1.d(r5)
            r3.setText(r1)
        L_0x01ac:
            vo8 r1 = r4.a
            boolean r1 = r1.r()
            vo8 r3 = r4.a
            if (r1 == 0) goto L_0x020f
            android.widget.FrameLayout r1 = r0.r1
            int r1 = r1.getVisibility()
            if (r1 != r8) goto L_0x01c4
            android.widget.FrameLayout r1 = r0.r1
            r5 = 4
            r1.setVisibility(r5)
        L_0x01c4:
            long r5 = r3.R0
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            int r11 = r3.Q0
            long r11 = (long) r11
            long r11 = r1.toMillis(r11)
            long r16 = r11 + r5
            long r5 = r3.R0
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x01da
            r18 = r9
            goto L_0x01e8
        L_0x01da:
            vl r1 = defpackage.vl.o
            j2b r1 = r1.a()
            i03 r1 = r1.a
            long r5 = r1.m()
            r18 = r5
        L_0x01e8:
            ru.ok.messages.messages.widgets.Chronometer r1 = r0.t1
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r11 = r16 - r18
            long r11 = r11 + r5
            r1.setBase(r11)
            long r14 = r3.R0
            int r1 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0207
            ru.ok.messages.secret.widgets.TimerView r13 = r0.s1
            r13.a(r14, r16, r18)
            ru.ok.messages.messages.widgets.Chronometer r1 = r0.t1
            r1.A0 = r2
            r1.j()
            goto L_0x022a
        L_0x0207:
            ru.ok.messages.messages.widgets.Chronometer r1 = r0.t1
            r1.A0 = r7
            r1.j()
            goto L_0x022a
        L_0x020f:
            android.widget.FrameLayout r1 = r0.r1
            r1.setVisibility(r8)
            ru.ok.messages.secret.widgets.TimerView r1 = r0.s1
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.b(r2)
            r5 = -1
            r1.y0 = r5
            r1.z0 = r5
            r1.A0 = r5
            ru.ok.messages.messages.widgets.Chronometer r1 = r0.t1
            r1.A0 = r7
            r1.j()
        L_0x022a:
            android.content.Intent r1 = r20.getIntent()
            java.lang.String r2 = "ru.ok.tamtam.extra.COMPAT_MODE"
            boolean r1 = r1.getBooleanExtra(r2, r7)
            android.widget.ImageButton r2 = r0.e1
            if (r1 != 0) goto L_0x0258
            v2b r1 = r0.O0
            java.lang.Object r1 = r1.b
            k93 r1 = (defpackage.k93) r1
            o2a r1 = (o2a) r1
            t52 r1 = r1.e()
            long r5 = r20.k0()
            i22 r0 = r1.B(r5)
            ir8 r1 = r4.Y
            r1.getClass()
            boolean r0 = defpackage.ir8.c(r0, r3)
            if (r0 == 0) goto L_0x0258
            goto L_0x0259
        L_0x0258:
            r7 = r8
        L_0x0259:
            r2.setVisibility(r7)
        L_0x025c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.ActAttachesView.p0(int):void");
    }

    public final void q0() {
        int indexOf;
        v10 v10 = this.a1;
        if (v10 != null && (indexOf = v10.j.indexOf(this.k1)) != -1) {
            p0(indexOf);
        }
    }

    public final void r0() {
        fd9 fd9;
        v10 v10 = this.a1;
        if (v10 != null) {
            FrgAttachView k = v10.k(this.k1);
            if ((k instanceof FrgAttachVideo) && (fd9 = ((FrgAttachVideo) k).R1) != null) {
                View u12 = fd9.u1();
                u12.post(new mg(u12, 5));
            }
        }
    }

    public final void s0(boolean z, boolean z2) {
        if (this.f1) {
            this.y1.j((Toolbar) this.u1.b);
            this.y1.j(this.b1);
            this.y1.j(this.x1);
        } else {
            this.y1.g((Toolbar) this.u1.b);
            this.y1.g(this.b1);
            this.y1.g(this.x1);
        }
        boolean z3 = this.f1;
        if (this.r1.getVisibility() != 8) {
            if (z3) {
                if (z) {
                    this.r1.animate().alpha(1.0f).setListener(new k5(this, 0));
                } else {
                    this.r1.animate().cancel();
                    this.r1.setVisibility(0);
                    this.r1.setAlpha(1.0f);
                }
            } else if (z) {
                this.r1.animate().alpha(0.0f).setListener(new k5(this, 1));
            } else {
                this.r1.animate().cancel();
                this.r1.setVisibility(4);
                this.r1.setAlpha(0.0f);
            }
        }
        v10 v10 = this.a1;
        if (v10 != null) {
            for (WeakReference weakReference : v10.o.values()) {
                FrgAttachView frgAttachView = (FrgAttachView) weakReference.get();
                if (frgAttachView != null) {
                    frgAttachView.D1();
                }
            }
        }
    }

    public final wce t() {
        if (this.C1 == null) {
            this.C1 = wf8.e0;
        }
        return this.C1;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, r5, ru.ok.messages.media.attaches.ActAttachesView] */
    @a1e
    public void onEvent(bk4 bk4) {
        yia l;
        v10 v10 = this.a1;
        if (v10 != null && this.T0 && (l = v10.l(this.j1.getCurrentItem())) != null) {
            o10 o10 = (o10) l.a;
            if (o10.d != null) {
                if (o10.q.equals(bk4.o)) {
                    this.c1.setText(getString(cic.g3));
                    this.d1.setVisibility(8);
                    this.i1 = true;
                }
            }
        }
    }
}

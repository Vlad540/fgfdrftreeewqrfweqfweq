package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class d extends uc {
    public static final int D1 = ((int) TimeUnit.SECONDS.toMillis(30));
    public int A0;
    public final Interpolator A1;
    public Button B0;
    public final AccessibilityManager B1;
    public Button C0;
    public final vp6 C1 = new vp6(11, this);
    public ImageButton D0;
    public MediaRouteExpandCollapseButton E0;
    public FrameLayout F0;
    public LinearLayout G0;
    public FrameLayout H0;
    public ImageView I0;
    public TextView J0;
    public TextView K0;
    public TextView L0;
    public final boolean M0 = true;
    public final boolean N0;
    public LinearLayout O0;
    public RelativeLayout P0;
    public LinearLayout Q0;
    public View R0;
    public OverlayListView S0;
    public c T0;
    public ArrayList U0;
    public HashSet V0;
    public HashSet W0;
    public HashSet X0;
    public SeekBar Y0;
    public final yb8 Z;
    public rq0 Z0;
    public xb8 a1;
    public int b1;
    public int c1;
    public int d1;
    public final int e1;
    public HashMap f1;
    public MediaControllerCompat g1;
    public final sa8 h1;
    public PlaybackStateCompat i1;
    public MediaDescriptionCompat j1;
    public ra8 k1;
    public Bitmap l1;
    public Uri m1;
    public boolean n1;
    public Bitmap o1;
    public int p1;
    public boolean q1;
    public boolean r1;
    public boolean s1;
    public boolean t1;
    public boolean u1;
    public int v1;
    public final ga8 w0;
    public int w1;
    public final xb8 x0;
    public int x1;
    public final Context y0;
    public Interpolator y1;
    public boolean z0;
    public final Interpolator z1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(android.content.Context r4) {
        /*
            r3 = this;
            r0 = 1
            android.view.ContextThemeWrapper r4 = defpackage.fc8.a(r4, r0)
            int r1 = defpackage.fc8.b(r4)
            r3.<init>(r4, r1)
            r3.M0 = r0
            vp6 r1 = new vp6
            r2 = 11
            r1.<init>(r2, r3)
            r3.C1 = r1
            android.content.Context r1 = r3.getContext()
            r3.y0 = r1
            sa8 r2 = new sa8
            r2.<init>(r3)
            r3.h1 = r2
            yb8 r2 = defpackage.yb8.d(r1)
            r3.Z = r2
            ub8 r2 = defpackage.yb8.d
            if (r2 != 0) goto L_0x0030
            r0 = 0
            goto L_0x0037
        L_0x0030:
            ub8 r2 = defpackage.yb8.c()
            r2.getClass()
        L_0x0037:
            r3.N0 = r0
            ga8 r0 = new ga8
            r2 = 2
            r0.<init>(r3, r2)
            r3.w0 = r0
            defpackage.yb8.b()
            ub8 r0 = defpackage.yb8.c()
            xb8 r0 = r0.f()
            r3.x0 = r0
            r3.p()
            android.content.res.Resources r0 = r1.getResources()
            int r2 = defpackage.tmb.mr_controller_volume_group_list_padding_top
            int r0 = r0.getDimensionPixelSize(r2)
            r3.e1 = r0
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r3.B1 = r0
            int r0 = defpackage.nrb.mr_linear_out_slow_in
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r4, r0)
            r3.z1 = r0
            int r0 = defpackage.nrb.mr_fast_out_slow_in
            android.view.animation.Interpolator r4 = android.view.animation.AnimationUtils.loadInterpolator(r4, r0)
            r3.A1 = r4
            android.view.animation.AccelerateDecelerateInterpolator r3 = new android.view.animation.AccelerateDecelerateInterpolator
            r3.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.d.<init>(android.content.Context):void");
    }

    public static void o(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public final void h(View view, int i) {
        pa8 pa8 = new pa8(view, view.getLayoutParams().height, i, 0);
        pa8.setDuration((long) this.v1);
        pa8.setInterpolator(this.y1);
        view.startAnimation(pa8);
    }

    public final boolean i() {
        return (this.j1 == null && this.i1 == null) ? false : true;
    }

    public final void j(boolean z) {
        HashSet hashSet;
        int firstVisiblePosition = this.S0.getFirstVisiblePosition();
        for (int i = 0; i < this.S0.getChildCount(); i++) {
            View childAt = this.S0.getChildAt(i);
            xb8 xb8 = (xb8) this.T0.getItem(firstVisiblePosition + i);
            if (!z || (hashSet = this.V0) == null || !hashSet.contains(xb8)) {
                ((LinearLayout) childAt.findViewById(gob.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        Iterator it = this.S0.a.iterator();
        while (it.hasNext()) {
            oha oha = (oha) it.next();
            oha.k = true;
            oha.l = true;
            afc afc = oha.m;
            if (afc != null) {
                d dVar = (d) afc.b;
                dVar.X0.remove((xb8) afc.a);
                dVar.T0.notifyDataSetChanged();
            }
        }
        if (!z) {
            k(false);
        }
    }

    public final void k(boolean z) {
        this.V0 = null;
        this.W0 = null;
        this.t1 = false;
        if (this.u1) {
            this.u1 = false;
            t(z);
        }
        this.S0.setEnabled(true);
    }

    public final int l(int i, int i2) {
        float f;
        float f2;
        if (i >= i2) {
            f = ((float) this.A0) * ((float) i2);
            f2 = (float) i;
        } else {
            f = ((float) this.A0) * 9.0f;
            f2 = 16.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    public final int m(boolean z) {
        if (!z && this.Q0.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.O0.getPaddingBottom() + this.O0.getPaddingTop();
        if (z) {
            paddingBottom += this.P0.getMeasuredHeight();
        }
        int measuredHeight = this.Q0.getVisibility() == 0 ? this.Q0.getMeasuredHeight() + paddingBottom : paddingBottom;
        return (!z || this.Q0.getVisibility() != 0) ? measuredHeight : this.R0.getMeasuredHeight() + measuredHeight;
    }

    public final boolean n() {
        xb8 xb8 = this.x0;
        return xb8.e() && Collections.unmodifiableList(xb8.u).size() > 1;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Z.a(qb8.c, this.w0, 2);
        boolean z = yb8.c;
        p();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(17170445);
        setContentView(trb.mr_controller_material_dialog_b);
        findViewById(16908315).setVisibility(8);
        qa8 qa8 = new qa8(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(gob.mr_expandable_area);
        this.F0 = frameLayout;
        frameLayout.setOnClickListener(new ma8(this, 0));
        LinearLayout linearLayout = (LinearLayout) findViewById(gob.mr_dialog_area);
        this.G0 = linearLayout;
        linearLayout.setOnClickListener(new Object());
        int i = ylb.colorPrimary;
        Context context = this.y0;
        int g = fc8.g(context, i);
        if (j33.c(g, fc8.g(context, 16842801)) < 3.0d) {
            g = fc8.g(context, ylb.colorAccent);
        }
        Button button = (Button) findViewById(16908314);
        this.B0 = button;
        button.setText(nub.mr_controller_disconnect);
        this.B0.setTextColor(g);
        this.B0.setOnClickListener(qa8);
        Button button2 = (Button) findViewById(16908313);
        this.C0 = button2;
        button2.setText(nub.mr_controller_stop_casting);
        this.C0.setTextColor(g);
        this.C0.setOnClickListener(qa8);
        this.L0 = (TextView) findViewById(gob.mr_name);
        ((ImageButton) findViewById(gob.mr_close)).setOnClickListener(qa8);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(gob.mr_custom_control);
        this.H0 = (FrameLayout) findViewById(gob.mr_default_control);
        ma8 ma8 = new ma8(this, 1);
        ImageView imageView = (ImageView) findViewById(gob.mr_art);
        this.I0 = imageView;
        imageView.setOnClickListener(ma8);
        findViewById(gob.mr_control_title_container).setOnClickListener(ma8);
        this.O0 = (LinearLayout) findViewById(gob.mr_media_main_control);
        this.R0 = findViewById(gob.mr_control_divider);
        this.P0 = (RelativeLayout) findViewById(gob.mr_playback_control);
        this.J0 = (TextView) findViewById(gob.mr_control_title);
        this.K0 = (TextView) findViewById(gob.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(gob.mr_control_playback_ctrl);
        this.D0 = imageButton;
        imageButton.setOnClickListener(qa8);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(gob.mr_volume_control);
        this.Q0 = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(gob.mr_volume_slider);
        this.Y0 = seekBar;
        xb8 xb8 = this.x0;
        seekBar.setTag(xb8);
        rq0 rq0 = new rq0(this);
        this.Z0 = rq0;
        this.Y0.setOnSeekBarChangeListener(rq0);
        this.S0 = (OverlayListView) findViewById(gob.mr_volume_group_list);
        this.U0 = new ArrayList();
        c cVar = new c(this, this.S0.getContext(), this.U0);
        this.T0 = cVar;
        this.S0.setAdapter(cVar);
        this.X0 = new HashSet();
        LinearLayout linearLayout3 = this.O0;
        OverlayListView overlayListView = this.S0;
        boolean n = n();
        int g2 = fc8.g(context, ylb.colorPrimary);
        int g3 = fc8.g(context, ylb.colorPrimaryDark);
        if (n && fc8.c(context) == -570425344) {
            g3 = g2;
            g2 = -1;
        }
        linearLayout3.setBackgroundColor(g2);
        overlayListView.setBackgroundColor(g3);
        linearLayout3.setTag(Integer.valueOf(g2));
        overlayListView.setTag(Integer.valueOf(g3));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.Y0;
        LinearLayout linearLayout4 = this.O0;
        int c = fc8.c(context);
        if (Color.alpha(c) != 255) {
            c = j33.f(c, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(c, c);
        HashMap hashMap = new HashMap();
        this.f1 = hashMap;
        hashMap.put(xb8, this.Y0);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(gob.mr_group_expand_collapse);
        this.E0 = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.A0 = new ma8(this, 2);
        this.y1 = this.s1 ? this.z1 : this.A1;
        this.v1 = context.getResources().getInteger(jrb.mr_controller_volume_group_list_animation_duration_ms);
        this.w1 = context.getResources().getInteger(jrb.mr_controller_volume_group_list_fade_in_duration_ms);
        this.x1 = context.getResources().getInteger(jrb.mr_controller_volume_group_list_fade_out_duration_ms);
        this.z0 = true;
        s();
    }

    public final void onDetachedFromWindow() {
        this.Z.f(this.w0);
        p();
        super.onDetachedFromWindow();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.N0 || !this.s1) {
            this.x0.k(i == 25 ? -1 : 1);
        }
        return true;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final void p() {
        MediaControllerCompat mediaControllerCompat = this.g1;
        sa8 sa8 = this.h1;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(sa8);
            this.g1 = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(boolean r13) {
        /*
            r12 = this;
            xb8 r0 = r12.a1
            r1 = 1
            if (r0 == 0) goto L_0x000d
            r12.q1 = r1
            boolean r0 = r12.r1
            r13 = r13 | r0
            r12.r1 = r13
            return
        L_0x000d:
            r0 = 0
            r12.q1 = r0
            r12.r1 = r0
            xb8 r2 = r12.x0
            boolean r3 = r2.g()
            if (r3 == 0) goto L_0x01d8
            boolean r3 = r2.d()
            if (r3 == 0) goto L_0x0022
            goto L_0x01d8
        L_0x0022:
            boolean r3 = r12.z0
            if (r3 != 0) goto L_0x0027
            return
        L_0x0027:
            android.widget.TextView r3 = r12.L0
            java.lang.String r4 = r2.d
            r3.setText(r4)
            android.widget.Button r3 = r12.B0
            boolean r4 = r2.i
            r5 = 8
            if (r4 == 0) goto L_0x0038
            r4 = r0
            goto L_0x0039
        L_0x0038:
            r4 = r5
        L_0x0039:
            r3.setVisibility(r4)
            boolean r3 = r12.n1
            r4 = 0
            if (r3 == 0) goto L_0x0065
            android.graphics.Bitmap r3 = r12.o1
            if (r3 == 0) goto L_0x0051
            boolean r3 = r3.isRecycled()
            if (r3 == 0) goto L_0x0051
            android.graphics.Bitmap r3 = r12.o1
            java.util.Objects.toString(r3)
            goto L_0x005f
        L_0x0051:
            android.widget.ImageView r3 = r12.I0
            android.graphics.Bitmap r6 = r12.o1
            r3.setImageBitmap(r6)
            android.widget.ImageView r3 = r12.I0
            int r6 = r12.p1
            r3.setBackgroundColor(r6)
        L_0x005f:
            r12.n1 = r0
            r12.o1 = r4
            r12.p1 = r0
        L_0x0065:
            boolean r3 = r12.N0
            if (r3 != 0) goto L_0x008a
            boolean r6 = r12.n()
            if (r6 == 0) goto L_0x008a
            android.widget.LinearLayout r3 = r12.Q0
            r3.setVisibility(r5)
            r12.s1 = r1
            androidx.mediarouter.app.OverlayListView r3 = r12.S0
            r3.setVisibility(r0)
            boolean r3 = r12.s1
            if (r3 == 0) goto L_0x0082
            android.view.animation.Interpolator r3 = r12.z1
            goto L_0x0084
        L_0x0082:
            android.view.animation.Interpolator r3 = r12.A1
        L_0x0084:
            r12.y1 = r3
            r12.t(r0)
            goto L_0x00da
        L_0x008a:
            boolean r6 = r12.s1
            if (r6 == 0) goto L_0x0090
            if (r3 == 0) goto L_0x00d5
        L_0x0090:
            boolean r3 = r12.M0
            if (r3 == 0) goto L_0x00d5
            boolean r3 = r2.e()
            if (r3 == 0) goto L_0x00a7
            ub8 r3 = defpackage.yb8.d
            if (r3 != 0) goto L_0x00a0
            r3 = r0
            goto L_0x00a9
        L_0x00a0:
            ub8 r3 = defpackage.yb8.c()
            r3.getClass()
        L_0x00a7:
            int r3 = r2.n
        L_0x00a9:
            if (r3 != r1) goto L_0x00d5
            android.widget.LinearLayout r3 = r12.Q0
            int r3 = r3.getVisibility()
            if (r3 != r5) goto L_0x00da
            android.widget.LinearLayout r3 = r12.Q0
            r3.setVisibility(r0)
            android.widget.SeekBar r3 = r12.Y0
            int r6 = r2.p
            r3.setMax(r6)
            android.widget.SeekBar r3 = r12.Y0
            int r6 = r2.o
            r3.setProgress(r6)
            androidx.mediarouter.app.MediaRouteExpandCollapseButton r3 = r12.E0
            boolean r6 = r12.n()
            if (r6 == 0) goto L_0x00d0
            r6 = r0
            goto L_0x00d1
        L_0x00d0:
            r6 = r5
        L_0x00d1:
            r3.setVisibility(r6)
            goto L_0x00da
        L_0x00d5:
            android.widget.LinearLayout r3 = r12.Q0
            r3.setVisibility(r5)
        L_0x00da:
            boolean r3 = r12.i()
            if (r3 == 0) goto L_0x01d4
            android.support.v4.media.MediaDescriptionCompat r3 = r12.j1
            if (r3 != 0) goto L_0x00e6
            r3 = r4
            goto L_0x00ea
        L_0x00e6:
            java.lang.CharSequence r3 = r3.getTitle()
        L_0x00ea:
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            r6 = r6 ^ r1
            android.support.v4.media.MediaDescriptionCompat r7 = r12.j1
            if (r7 != 0) goto L_0x00f4
            goto L_0x00f8
        L_0x00f4:
            java.lang.CharSequence r4 = r7.getSubtitle()
        L_0x00f8:
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            r7 = r7 ^ r1
            int r2 = r2.q
            r8 = -1
            if (r2 == r8) goto L_0x010c
            android.widget.TextView r2 = r12.J0
            int r3 = defpackage.nub.mr_controller_casting_screen
            r2.setText(r3)
        L_0x0109:
            r3 = r0
            r2 = r1
            goto L_0x0140
        L_0x010c:
            android.support.v4.media.session.PlaybackStateCompat r2 = r12.i1
            if (r2 == 0) goto L_0x0138
            int r2 = r2.getState()
            if (r2 != 0) goto L_0x0117
            goto L_0x0138
        L_0x0117:
            if (r6 != 0) goto L_0x0123
            if (r7 != 0) goto L_0x0123
            android.widget.TextView r2 = r12.J0
            int r3 = defpackage.nub.mr_controller_no_info_available
            r2.setText(r3)
            goto L_0x0109
        L_0x0123:
            if (r6 == 0) goto L_0x012c
            android.widget.TextView r2 = r12.J0
            r2.setText(r3)
            r2 = r1
            goto L_0x012d
        L_0x012c:
            r2 = r0
        L_0x012d:
            if (r7 == 0) goto L_0x0136
            android.widget.TextView r3 = r12.K0
            r3.setText(r4)
            r3 = r1
            goto L_0x0140
        L_0x0136:
            r3 = r0
            goto L_0x0140
        L_0x0138:
            android.widget.TextView r2 = r12.J0
            int r3 = defpackage.nub.mr_controller_no_media_selected
            r2.setText(r3)
            goto L_0x0109
        L_0x0140:
            android.widget.TextView r4 = r12.J0
            if (r2 == 0) goto L_0x0146
            r2 = r0
            goto L_0x0147
        L_0x0146:
            r2 = r5
        L_0x0147:
            r4.setVisibility(r2)
            android.widget.TextView r2 = r12.K0
            if (r3 == 0) goto L_0x0150
            r3 = r0
            goto L_0x0151
        L_0x0150:
            r3 = r5
        L_0x0151:
            r2.setVisibility(r3)
            android.support.v4.media.session.PlaybackStateCompat r2 = r12.i1
            if (r2 == 0) goto L_0x01d4
            int r2 = r2.getState()
            r3 = 6
            if (r2 == r3) goto L_0x016b
            android.support.v4.media.session.PlaybackStateCompat r2 = r12.i1
            int r2 = r2.getState()
            r3 = 3
            if (r2 != r3) goto L_0x0169
            goto L_0x016b
        L_0x0169:
            r2 = r0
            goto L_0x016c
        L_0x016b:
            r2 = r1
        L_0x016c:
            android.widget.ImageButton r3 = r12.D0
            android.content.Context r3 = r3.getContext()
            r6 = 0
            if (r2 == 0) goto L_0x0188
            android.support.v4.media.session.PlaybackStateCompat r4 = r12.i1
            long r8 = r4.getActions()
            r10 = 514(0x202, double:2.54E-321)
            long r8 = r8 & r10
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0188
            int r2 = defpackage.tlb.mediaRoutePauseDrawable
            int r4 = defpackage.nub.mr_controller_pause
            goto L_0x01b3
        L_0x0188:
            if (r2 == 0) goto L_0x019c
            android.support.v4.media.session.PlaybackStateCompat r4 = r12.i1
            long r8 = r4.getActions()
            r10 = 1
            long r8 = r8 & r10
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x019c
            int r2 = defpackage.tlb.mediaRouteStopDrawable
            int r4 = defpackage.nub.mr_controller_stop
            goto L_0x01b3
        L_0x019c:
            if (r2 != 0) goto L_0x01b0
            android.support.v4.media.session.PlaybackStateCompat r2 = r12.i1
            long r8 = r2.getActions()
            r10 = 516(0x204, double:2.55E-321)
            long r8 = r8 & r10
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x01b0
            int r2 = defpackage.tlb.mediaRoutePlayDrawable
            int r4 = defpackage.nub.mr_controller_play
            goto L_0x01b3
        L_0x01b0:
            r1 = r0
            r2 = r1
            r4 = r2
        L_0x01b3:
            android.widget.ImageButton r6 = r12.D0
            if (r1 == 0) goto L_0x01b8
            goto L_0x01b9
        L_0x01b8:
            r0 = r5
        L_0x01b9:
            r6.setVisibility(r0)
            if (r1 == 0) goto L_0x01d4
            android.widget.ImageButton r0 = r12.D0
            int r1 = defpackage.fc8.h(r3, r2)
            r0.setImageResource(r1)
            android.widget.ImageButton r0 = r12.D0
            android.content.res.Resources r1 = r3.getResources()
            java.lang.CharSequence r1 = r1.getText(r4)
            r0.setContentDescription(r1)
        L_0x01d4:
            r12.t(r13)
            return
        L_0x01d8:
            r12.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.d.q(boolean):void");
    }

    public final void r() {
        MediaDescriptionCompat mediaDescriptionCompat = this.j1;
        Uri uri = null;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.j1;
        if (mediaDescriptionCompat2 != null) {
            uri = mediaDescriptionCompat2.getIconUri();
        }
        ra8 ra8 = this.k1;
        Bitmap bitmap = ra8 == null ? this.l1 : ra8.a;
        Uri uri2 = ra8 == null ? this.m1 : ra8.b;
        if (bitmap == iconBitmap) {
            if (bitmap != null) {
                return;
            }
            if (uri2 != null && uri2.equals(uri)) {
                return;
            }
            if (uri2 == null && uri == null) {
                return;
            }
        }
        if (!n() || this.N0) {
            ra8 ra82 = this.k1;
            if (ra82 != null) {
                ra82.cancel(true);
            }
            ra8 ra83 = new ra8(this);
            this.k1 = ra83;
            ra83.execute(new Void[0]);
        }
    }

    public final void s() {
        Context context = this.y0;
        int p = pfa.p(context);
        getWindow().setLayout(p, -2);
        View decorView = getWindow().getDecorView();
        this.A0 = (p - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.b1 = resources.getDimensionPixelSize(tmb.mr_controller_volume_group_list_item_icon_size);
        this.c1 = resources.getDimensionPixelSize(tmb.mr_controller_volume_group_list_item_height);
        this.d1 = resources.getDimensionPixelSize(tmb.mr_controller_volume_group_list_max_height);
        this.l1 = null;
        this.m1 = null;
        r();
        q(false);
    }

    public final void t(boolean z) {
        this.H0.requestLayout();
        this.H0.getViewTreeObserver().addOnGlobalLayoutListener(new oa8(this, z));
    }

    public final void u(boolean z) {
        int i = 0;
        this.R0.setVisibility((this.Q0.getVisibility() != 0 || !z) ? 8 : 0);
        LinearLayout linearLayout = this.O0;
        if (this.Q0.getVisibility() == 8 && !z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }
}

package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;
import ru.ok.messages.video.widgets.VideoPlayerSeekBar;
import ru.ok.messages.views.widgets.VideoInfoTextView;

/* renamed from: uy  reason: default package */
public final class uy {
    public static final int w = ((int) vl.o.getResources().getDimension(mmb.attach_drawable));
    public static final Drawable x = vl.o.getResources().getDrawable(zhc.v);
    public static final Drawable y = vl.o.getResources().getDrawable(phc.B0);
    public static final Drawable z = vl.o.getResources().getDrawable(zhc.U);
    public final u10 a = new u10(vl.o);
    public final u10 b;
    public final u10 c;
    public final k93 d;
    public final r10 e;
    public final zg4 f;
    public final Context g;
    public final ty h;
    public o10 i;
    public xm8 j;
    public boolean k;
    public boolean l;
    public VideoInfoTextView m;
    public VideoPlayerSeekBar n;
    public boolean o;
    public final GradientDrawable p;
    public final wce q;
    public boolean r;
    public LiveVideoPlaceHolderView s;
    public c97 t;
    public float[] u;
    public i22 v;

    public uy(View view, ty tyVar) {
        u10 u10 = new u10(vl.o);
        this.b = u10;
        u10 u102 = new u10(vl.o, zhc.U);
        this.c = u102;
        this.k = false;
        this.o = true;
        o2a b2 = vl.b();
        this.d = b2;
        this.g = view.getContext();
        this.e = b2.d();
        this.f = zg4.b();
        this.h = tyVar;
        u10.setCallback(view);
        u102.setCallback(view);
        Context context = view.getContext();
        r7e r7e = wce.a0;
        wce E = fja.E(context);
        this.q = E;
        this.p = swb.H(Integer.valueOf(E.r), (Integer) null, (Integer) null);
        Drawable drawable = x;
        int i2 = E.t;
        js.D(drawable, i2);
        js.D(z, i2);
        js.D(y, i2);
    }

    public final void a(y66 y66, fja fja) {
        boolean J = ete.J(this.i);
        o10 o10 = this.i;
        boolean z2 = false;
        if (o10.a == j10.c || J) {
            a10 a10 = J ? o10.j.d.b : o10.b;
            boolean z3 = o10.n.a() || this.i.n.b();
            if (a10.w0 == 0 || a10.X || (z3 && !h(a10))) {
                y66.i((Drawable) null, 3);
            } else {
                y66.i(this.a, 3);
            }
        } else {
            y66.i((Drawable) null, 3);
        }
        if (this.v != null && ete.T(this.i, this.j)) {
            z2 = true;
        }
        BitmapDrawable b2 = this.e.b(this.i, z2);
        if (b2 != null) {
            y66.i(new glc(b2, fja), 1);
        } else {
            y66.i((Drawable) null, 1);
        }
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [ru.ok.messages.video.widgets.LiveVideoPlaceHolderView, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v12, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v13, types: [ru.ok.messages.views.widgets.VideoInfoTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r5v30, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.view.View] */
    /* JADX WARNING: type inference failed for: r5v31, types: [ru.ok.messages.views.widgets.VideoInfoTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v20, types: [ru.ok.messages.views.widgets.VideoInfoTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r5v34, types: [ru.ok.messages.views.widgets.VideoInfoTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r6v21, types: [ru.ok.messages.views.widgets.VideoInfoTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r5v39, types: [ru.ok.messages.views.widgets.VideoInfoTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r6v23, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v28, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v30, types: [ru.ok.messages.video.widgets.LiveVideoPlaceHolderView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01fd, code lost:
        if (r1g.c((r5.F0 == null || (r5 = r5.J0) == null) ? null : r5.q, r0.i.q) != false) goto L_0x01ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x027c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.graphics.Canvas r18, android.graphics.Rect r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            o10 r3 = r0.i
            j10 r4 = r3.a
            j10 r5 = defpackage.j10.c
            ls8 r6 = defpackage.ls8.EDITED
            android.graphics.drawable.GradientDrawable r7 = r0.p
            u10 r9 = r0.b
            android.graphics.drawable.Drawable r10 = x
            r11 = 0
            int r13 = w
            if (r4 == r5) goto L_0x0020
            boolean r3 = ete.J(r3)
            if (r3 == 0) goto L_0x0024
        L_0x0020:
            r5 = r6
            r4 = r9
            goto L_0x02e0
        L_0x0024:
            o10 r3 = r0.i
            j10 r4 = r3.a
            j10 r5 = defpackage.j10.o
            if (r4 == r5) goto L_0x0032
            boolean r3 = ete.L(r3)
            if (r3 == 0) goto L_0x0498
        L_0x0032:
            int r3 = r19.centerX()
            int r4 = r19.centerY()
            o10 r5 = r0.i
            boolean r5 = ete.L(r5)
            if (r5 == 0) goto L_0x004b
            o10 r5 = r0.i
            v00 r5 = r5.j
            o10 r5 = r5.d
            n10 r5 = r5.d
            goto L_0x004f
        L_0x004b:
            o10 r5 = r0.i
            n10 r5 = r5.d
        L_0x004f:
            o10 r8 = r0.i
            boolean r8 = ete.L(r8)
            android.graphics.drawable.Drawable r14 = z
            if (r8 != 0) goto L_0x018e
            o10 r8 = r0.i
            n10 r15 = r8.d
            r20 = r5
            r16 = r6
            long r5 = r15.a
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x0069
            goto L_0x0190
        L_0x0069:
            boolean r5 = ete.Q(r8)
            if (r5 != 0) goto L_0x0159
            o10 r5 = r0.i
            n10 r6 = r5.d
            r15 = r9
            long r8 = r6.a
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0084
            g10 r5 = r5.n
            boolean r5 = r5.b()
            if (r5 != 0) goto L_0x0084
            goto L_0x015a
        L_0x0084:
            o10 r5 = r0.i
            g10 r5 = r5.n
            boolean r5 = r5.b()
            if (r5 == 0) goto L_0x00cc
            o10 r5 = r0.i
            n10 r5 = r5.d
            long r5 = r5.a
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x00cc
            int r5 = r10.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r3 - r5
            int r6 = r10.getIntrinsicHeight()
            int r6 = r6 / 2
            int r6 = r4 - r6
            int r8 = r10.getIntrinsicWidth()
            int r8 = r8 / 2
            int r8 = r8 + r3
            int r9 = r10.getIntrinsicHeight()
            int r9 = r9 / 2
            int r9 = r9 + r4
            r10.setBounds(r5, r6, r8, r9)
            int r13 = r13 / 2
            int r5 = r3 - r13
            int r6 = r4 - r13
            int r3 = r3 + r13
            int r13 = r13 + r4
            r7.setBounds(r5, r6, r3, r13)
            r7.draw(r1)
            r10.draw(r1)
            goto L_0x0231
        L_0x00cc:
            o10 r5 = r0.i
            g10 r5 = r5.n
            boolean r5 = r5.c()
            if (r5 != 0) goto L_0x0125
            o10 r5 = r0.i
            g10 r5 = r5.n
            boolean r5 = r5.b()
            if (r5 != 0) goto L_0x0125
            o10 r5 = r0.i
            n10 r5 = r5.d
            boolean r6 = r5.g
            if (r6 != 0) goto L_0x0125
            java.lang.String r5 = r5.h
            boolean r5 = r1g.p(r5)
            if (r5 != 0) goto L_0x00f1
            goto L_0x0125
        L_0x00f1:
            int r5 = r10.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r3 - r5
            int r6 = r10.getIntrinsicHeight()
            int r6 = r6 / 2
            int r6 = r4 - r6
            int r8 = r10.getIntrinsicWidth()
            int r8 = r8 / 2
            int r8 = r8 + r3
            int r9 = r10.getIntrinsicHeight()
            int r9 = r9 / 2
            int r9 = r9 + r4
            r10.setBounds(r5, r6, r8, r9)
            int r13 = r13 / 2
            int r5 = r3 - r13
            int r6 = r4 - r13
            int r3 = r3 + r13
            int r13 = r13 + r4
            r7.setBounds(r5, r6, r3, r13)
            r7.draw(r1)
            r10.draw(r1)
            goto L_0x0231
        L_0x0125:
            int r5 = r14.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r3 - r5
            int r6 = r14.getIntrinsicHeight()
            int r6 = r6 / 2
            int r6 = r4 - r6
            int r8 = r14.getIntrinsicWidth()
            int r8 = r8 / 2
            int r8 = r8 + r3
            int r9 = r14.getIntrinsicHeight()
            int r9 = r9 / 2
            int r9 = r9 + r4
            r14.setBounds(r5, r6, r8, r9)
            int r13 = r13 / 2
            int r5 = r3 - r13
            int r6 = r4 - r13
            int r3 = r3 + r13
            int r13 = r13 + r4
            r7.setBounds(r5, r6, r3, r13)
            r7.draw(r1)
            r14.draw(r1)
            goto L_0x0231
        L_0x0159:
            r15 = r9
        L_0x015a:
            int r13 = r13 / 2
            int r5 = r3 - r13
            int r6 = r4 - r13
            int r3 = r3 + r13
            int r13 = r13 + r4
            r4 = r15
            r4.setBounds(r5, r6, r3, r13)
            o10 r3 = r0.i
            float r3 = r3.p
            r5 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r5
            int r3 = (int) r3
            r0.g(r3)
            o10 r3 = r0.i
            n10 r3 = r3.d
            long r5 = r3.a
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x0188
            xm8 r3 = r0.j
            vo8 r3 = r3.a
            ls8 r3 = r3.z0
            r5 = r16
            if (r3 == r5) goto L_0x0186
            goto L_0x0188
        L_0x0186:
            r8 = 0
            goto L_0x0189
        L_0x0188:
            r8 = 1
        L_0x0189:
            r4.b(r1, r8)
            goto L_0x0231
        L_0x018e:
            r20 = r5
        L_0x0190:
            boolean r5 = r0.o
            if (r5 == 0) goto L_0x0231
            o10 r5 = r0.i
            boolean r5 = ete.Q(r5)
            if (r5 == 0) goto L_0x01c1
            o10 r5 = r0.i
            boolean r5 = ete.L(r5)
            if (r5 != 0) goto L_0x01c1
            int r13 = r13 / 2
            int r5 = r3 - r13
            int r6 = r4 - r13
            int r3 = r3 + r13
            int r13 = r13 + r4
            u10 r4 = r0.c
            r4.setBounds(r5, r6, r3, r13)
            o10 r3 = r0.i
            float r3 = r3.p
            r5 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r5
            int r3 = (int) r3
            r4.setLevel(r3)
            r3 = 1
            r4.b(r1, r3)
            goto L_0x0231
        L_0x01c1:
            r5 = r20
            boolean r5 = r5.o
            if (r5 != 0) goto L_0x01ff
            k93 r5 = r0.d
            o2a r5 = (o2a) r5
            s98 r6 = r5.k()
            boolean r6 = r6.p()
            if (r6 == 0) goto L_0x01ff
            xm8 r6 = r0.j
            if (r6 == 0) goto L_0x01ff
            vo8 r6 = r6.a
            int r6 = r6.b()
            r8 = 1
            if (r6 != r8) goto L_0x01ff
            s98 r5 = r5.k()
            jwa r5 = r5.y0
            fd9 r6 = r5.F0
            if (r6 == 0) goto L_0x01f4
            o10 r5 = r5.J0
            if (r5 != 0) goto L_0x01f1
            goto L_0x01f4
        L_0x01f1:
            java.lang.String r5 = r5.q
            goto L_0x01f5
        L_0x01f4:
            r5 = 0
        L_0x01f5:
            o10 r6 = r0.i
            java.lang.String r6 = r6.q
            boolean r5 = r1g.c(r5, r6)
            if (r5 == 0) goto L_0x0231
        L_0x01ff:
            int r5 = r14.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r3 - r5
            int r6 = r14.getIntrinsicHeight()
            int r6 = r6 / 2
            int r6 = r4 - r6
            int r8 = r14.getIntrinsicWidth()
            int r8 = r8 / 2
            int r8 = r8 + r3
            int r9 = r14.getIntrinsicHeight()
            int r9 = r9 / 2
            int r9 = r9 + r4
            r14.setBounds(r5, r6, r8, r9)
            int r13 = r13 / 2
            int r5 = r3 - r13
            int r6 = r4 - r13
            int r3 = r3 + r13
            int r13 = r13 + r4
            r7.setBounds(r5, r6, r3, r13)
            r7.draw(r1)
            r14.draw(r1)
        L_0x0231:
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r3 = r0.s
            if (r3 == 0) goto L_0x0240
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0240
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r3 = r0.s
            r3.draw(r1)
        L_0x0240:
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r3 = r0.n
            zg4 r4 = r0.f
            if (r3 == 0) goto L_0x0272
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0272
            o10 r3 = r0.i
            boolean r3 = ete.u(r3)
            if (r3 == 0) goto L_0x0272
            r18.save()
            int r3 = r2.left
            int r5 = r4.e
            int r3 = r3 + r5
            float r3 = (float) r3
            int r5 = r2.bottom
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r6 = r0.n
            int r6 = r6.getMeasuredHeight()
            int r5 = r5 - r6
            float r5 = (float) r5
            r1.translate(r3, r5)
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r3 = r0.n
            r3.draw(r1)
            r18.restore()
        L_0x0272:
            ru.ok.messages.views.widgets.VideoInfoTextView r3 = r0.m
            if (r3 == 0) goto L_0x0498
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0498
            r18.save()
            r4.getClass()
            r3 = 1073741824(0x40000000, float:2.0)
            int r3 = (int) r3
            int r4 = defpackage.dh4.b(r3)
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r5 = r0.n
            if (r5 == 0) goto L_0x029a
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x029a
            r4 = 1086324736(0x40c00000, float:6.0)
            int r4 = (int) r4
            int r4 = defpackage.dh4.b(r4)
        L_0x029a:
            ru.ok.messages.views.widgets.VideoInfoTextView r5 = r0.m
            boolean r5 = xy6.w(r5)
            if (r5 == 0) goto L_0x02c0
            int r5 = r2.right
            ru.ok.messages.views.widgets.VideoInfoTextView r6 = r0.m
            int r6 = r6.getMeasuredWidth()
            int r5 = r5 - r6
            int r3 = defpackage.dh4.b(r3)
            int r5 = r5 - r3
            float r3 = (float) r5
            int r2 = r2.bottom
            ru.ok.messages.views.widgets.VideoInfoTextView r5 = r0.m
            int r5 = r5.getMeasuredHeight()
            int r2 = r2 - r5
            int r2 = r2 - r4
            float r2 = (float) r2
            r1.translate(r3, r2)
            goto L_0x02d6
        L_0x02c0:
            int r5 = r2.left
            int r3 = defpackage.dh4.b(r3)
            int r3 = r3 + r5
            float r3 = (float) r3
            int r2 = r2.bottom
            ru.ok.messages.views.widgets.VideoInfoTextView r5 = r0.m
            int r5 = r5.getMeasuredHeight()
            int r2 = r2 - r5
            int r2 = r2 - r4
            float r2 = (float) r2
            r1.translate(r3, r2)
        L_0x02d6:
            ru.ok.messages.views.widgets.VideoInfoTextView r0 = r0.m
            r0.draw(r1)
            r18.restore()
            goto L_0x0498
        L_0x02e0:
            int r3 = r19.centerX()
            int r2 = r19.centerY()
            o10 r6 = r0.i
            boolean r6 = ete.J(r6)
            if (r6 == 0) goto L_0x02f9
            o10 r8 = r0.i
            v00 r8 = r8.j
            o10 r8 = r8.d
            a10 r8 = r8.b
            goto L_0x02fd
        L_0x02f9:
            o10 r8 = r0.i
            a10 r8 = r8.b
        L_0x02fd:
            long r14 = r8.w0
            int r9 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x033d
            o10 r9 = r0.i
            g10 r9 = r9.n
            boolean r9 = r9.b()
            if (r9 != 0) goto L_0x033d
            o10 r9 = r0.i
            g10 r9 = r9.n
            boolean r9 = r9.c()
            if (r9 != 0) goto L_0x033d
            o10 r6 = r0.i
            float r6 = r6.p
            r7 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 * r7
            int r6 = (int) r6
            r0.g(r6)
            int r13 = r13 / 2
            int r6 = r3 - r13
            int r7 = r2 - r13
            int r3 = r3 + r13
            int r13 = r13 + r2
            r4.setBounds(r6, r7, r3, r13)
            xm8 r0 = r0.j
            vo8 r0 = r0.a
            ls8 r0 = r0.z0
            if (r0 == r5) goto L_0x0337
            r8 = 1
            goto L_0x0338
        L_0x0337:
            r8 = 0
        L_0x0338:
            r4.b(r1, r8)
            goto L_0x0498
        L_0x033d:
            o10 r5 = r0.i
            g10 r5 = r5.n
            boolean r5 = r5.d()
            if (r5 == 0) goto L_0x036b
            java.lang.String r5 = r8.x0
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x036b
            o10 r5 = r0.i
            float r5 = r5.p
            r6 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 * r6
            int r5 = (int) r5
            r0.g(r5)
            int r13 = r13 / 2
            int r0 = r3 - r13
            int r5 = r2 - r13
            int r3 = r3 + r13
            int r13 = r13 + r2
            r4.setBounds(r0, r5, r3, r13)
            r0 = 1
            r4.b(r1, r0)
            goto L_0x0498
        L_0x036b:
            if (r6 != 0) goto L_0x03ab
            o10 r4 = r0.i
            g10 r4 = r4.n
            boolean r4 = r4.a()
            if (r4 == 0) goto L_0x03ab
            int r0 = r10.getIntrinsicWidth()
            int r0 = r0 / 2
            int r0 = r3 - r0
            int r4 = r10.getIntrinsicHeight()
            int r4 = r4 / 2
            int r4 = r2 - r4
            int r5 = r10.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r5 + r3
            int r6 = r10.getIntrinsicHeight()
            int r6 = r6 / 2
            int r6 = r6 + r2
            r10.setBounds(r0, r4, r5, r6)
            int r13 = r13 / 2
            int r0 = r3 - r13
            int r4 = r2 - r13
            int r3 = r3 + r13
            int r13 = r13 + r2
            r7.setBounds(r0, r4, r3, r13)
            r7.draw(r1)
            r10.draw(r1)
            goto L_0x0498
        L_0x03ab:
            if (r6 != 0) goto L_0x03f7
            o10 r4 = r0.i
            g10 r4 = r4.n
            boolean r4 = r4.b()
            if (r4 == 0) goto L_0x03f7
            boolean r4 = r0.h(r8)
            if (r4 != 0) goto L_0x03f7
            long r4 = r8.w0
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x03f7
            int r0 = r10.getIntrinsicWidth()
            int r0 = r0 / 2
            int r0 = r3 - r0
            int r4 = r10.getIntrinsicHeight()
            int r4 = r4 / 2
            int r4 = r2 - r4
            int r5 = r10.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r5 + r3
            int r6 = r10.getIntrinsicHeight()
            int r6 = r6 / 2
            int r6 = r6 + r2
            r10.setBounds(r0, r4, r5, r6)
            int r13 = r13 / 2
            int r0 = r3 - r13
            int r4 = r2 - r13
            int r3 = r3 + r13
            int r13 = r13 + r2
            r7.setBounds(r0, r4, r3, r13)
            r7.draw(r1)
            r10.draw(r1)
            goto L_0x0498
        L_0x03f7:
            o10 r4 = r0.i
            g10 r4 = r4.n
            boolean r4 = r4.b()
            if (r4 != 0) goto L_0x045c
            o10 r4 = r0.i
            g10 r4 = r4.n
            boolean r4 = r4.a()
            if (r4 != 0) goto L_0x045c
            o10 r4 = r0.i
            g10 r4 = r4.n
            boolean r4 = r4.d()
            if (r4 != 0) goto L_0x045c
            boolean r4 = r8.X
            if (r4 == 0) goto L_0x045c
            ty r4 = r0.h
            if (r4 == 0) goto L_0x045c
            o10 r5 = r0.i
            boolean r4 = r4.k(r5)
            if (r4 != 0) goto L_0x045c
            if (r20 != 0) goto L_0x045c
            android.graphics.drawable.Drawable r0 = y
            int r4 = r0.getIntrinsicWidth()
            int r4 = r4 / 2
            int r4 = r3 - r4
            int r5 = r0.getIntrinsicHeight()
            int r5 = r5 / 2
            int r5 = r2 - r5
            int r6 = r0.getIntrinsicWidth()
            int r6 = r6 / 2
            int r6 = r6 + r3
            int r8 = r0.getIntrinsicHeight()
            int r8 = r8 / 2
            int r8 = r8 + r2
            r0.setBounds(r4, r5, r6, r8)
            int r13 = r13 / 2
            int r4 = r3 - r13
            int r5 = r2 - r13
            int r3 = r3 + r13
            int r13 = r13 + r2
            r7.setBounds(r4, r5, r3, r13)
            r7.draw(r1)
            r0.draw(r1)
            goto L_0x0498
        L_0x045c:
            if (r6 == 0) goto L_0x0462
            boolean r4 = r0.l
            if (r4 == 0) goto L_0x0498
        L_0x0462:
            boolean r0 = r0.k
            if (r0 == 0) goto L_0x0498
            int r0 = r10.getIntrinsicWidth()
            int r0 = r0 / 2
            int r0 = r3 - r0
            int r4 = r10.getIntrinsicHeight()
            int r4 = r4 / 2
            int r4 = r2 - r4
            int r5 = r10.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r5 + r3
            int r6 = r10.getIntrinsicHeight()
            int r6 = r6 / 2
            int r6 = r6 + r2
            r10.setBounds(r0, r4, r5, r6)
            int r13 = r13 / 2
            int r0 = r3 - r13
            int r4 = r2 - r13
            int r3 = r3 + r13
            int r13 = r13 + r2
            r7.setBounds(r0, r4, r3, r13)
            r7.draw(r1)
            r10.draw(r1)
        L_0x0498:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy.b(android.graphics.Canvas, android.graphics.Rect, boolean):void");
    }

    public final ywa c(gn4 gn4, boolean z2, boolean z3, boolean z4) {
        ywa a2 = a06.a.a();
        o10 o10 = this.i;
        j10 j10 = o10.a;
        j10 j102 = j10.c;
        a10 a10 = o10.b;
        boolean z5 = false;
        a2.j = j10 == j102 && a10.X;
        this.l = false;
        String str = o10.r;
        k93 k93 = this.d;
        tr6 tr6 = null;
        if (j10 != j102) {
            j10 j103 = j10.o;
            r10 r10 = this.e;
            if (j10 == j103) {
                Uri a3 = r10.a(o10);
                if (a3 != null) {
                    a2.e = tr6.a(a3);
                }
            } else if (j10 == j10.Y) {
                a2.e = tr6.a(mg5.r(o10.f.b));
                a2.j = true;
            } else if (j10 == j10.y0) {
                if (ete.L(o10)) {
                    Uri a4 = r10.a(this.i);
                    if (a4 != null) {
                        a2.e = tr6.a(a4);
                    } else {
                        a2.e = null;
                    }
                } else if (ete.J(this.i)) {
                    if (!z2 && this.k && !this.i.n.c()) {
                        z5 = true;
                    }
                    Uri a5 = r10.a(this.i);
                    if (a5 != null) {
                        ur6 d2 = ur6.d(a5);
                        d2.b = z5 ? sr6.c : sr6.b;
                        if (z5) {
                            d2.n = new sy(this);
                        }
                        tr6 = d2.a();
                    }
                    if (r1g.p(str) || str.toLowerCase().endsWith(".heic")) {
                        a2.e = tr6;
                    } else {
                        ur6 d3 = ur6.d(at7.x(str));
                        if (z3) {
                            d3.d = z3d.A(this.g, this.i, true);
                        }
                        if (z4) {
                            d3.l = k93.a(9, 10);
                        }
                        a2.e = d3.a();
                        a2.f = tr6;
                    }
                }
            }
        } else if (a10.w0 <= 0 || (!o10.n.a() && ((z2 || !this.k || this.i.n.c()) && (!this.i.n.b() || h(this.i.b))))) {
            o10 o102 = this.i;
            if (o102.b.X) {
                mg5 h2 = vl.b().h();
                a10 a102 = o102.b;
                File l2 = !r1g.p(a102.y0) ? h2.l(a102.y0) : (r1g.p(a102.x0) || !r1g.p(o102.r)) ? h2.l(o102.q) : h2.l(String.valueOf(a102.w0));
                if (l2.exists()) {
                    a2.f = tr6.a(Uri.fromFile(l2));
                }
                if (!r1g.p(str)) {
                    int i2 = lp.i;
                    if (!str.endsWith(".mp4")) {
                        a2.e = ur6.d(mg5.r(at7.y(str))).a();
                    }
                }
                if (z4) {
                    po0 a6 = vl.b().a(9, 10);
                    tr6 tr62 = (tr6) a2.e;
                    if (tr62 != null) {
                        ur6 b2 = ur6.b(tr62);
                        b2.l = a6;
                        a2.e = b2.a();
                    }
                    tr6 tr63 = (tr6) a2.f;
                    if (tr63 != null) {
                        ur6 b3 = ur6.b(tr63);
                        b3.l = k93.a(9, 10);
                        a2.f = b3.a();
                    }
                }
                return a2;
            }
            if (!r1g.p(str)) {
                File file = new File(str);
                if (file.exists()) {
                    Uri uri = fye.a;
                    a2.e = tr6.a(Uri.fromFile(file));
                }
            }
            if ((!this.i.f() || r1g.p(this.i.b.a)) && r1g.p(this.i.b.b)) {
                udd.t("uy", "failed to build controller for photo attach, local id=", new Object[]{this.i.q});
                a2.e = null;
            } else {
                a2.e = ur6.d(mg5.r(at7.y(this.i.b.a()))).a();
            }
        } else {
            a2.e = null;
        }
        if (z4) {
            po0 a7 = vl.b().a(9, 10);
            tr6 tr64 = (tr6) a2.e;
            if (tr64 != null) {
                ur6 b4 = ur6.b(tr64);
                b4.l = a7;
                a2.e = b4.a();
            }
        }
        a2.k = true;
        a2.l = gn4;
        return a2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.messages.views.widgets.VideoInfoTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v1, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v2, types: [ru.ok.messages.video.widgets.LiveVideoPlaceHolderView, android.view.View] */
    /* JADX WARNING: type inference failed for: r6v2, types: [ru.ok.messages.video.widgets.LiveVideoPlaceHolderView, android.view.View] */
    /* JADX WARNING: type inference failed for: r5v1, types: [ru.ok.messages.video.widgets.LiveVideoPlaceHolderView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v3, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.view.View] */
    /* JADX WARNING: type inference failed for: r4v4, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v4, types: [ru.ok.messages.views.widgets.VideoInfoTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v6, types: [ru.ok.messages.views.widgets.VideoInfoTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v5, types: [ru.ok.messages.views.widgets.VideoInfoTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v7, types: [ru.ok.messages.views.widgets.VideoInfoTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v7, types: [ru.ok.messages.views.widgets.VideoInfoTextView, android.view.View] */
    public final void d(int i2, int i3) {
        ? r0 = this.m;
        if (r0 != 0) {
            r0.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
            if (xy6.w(this.m)) {
                ? r02 = this.m;
                r02.layout(i2 - r02.getMeasuredWidth(), 0, i2, this.m.getMeasuredHeight());
            } else {
                ? r03 = this.m;
                r03.layout(0, 0, r03.getMeasuredWidth(), this.m.getMeasuredHeight());
            }
        }
        ? r04 = this.n;
        if (r04 != 0) {
            zg4 zg4 = this.f;
            r04.measure(View.MeasureSpec.makeMeasureSpec(i2 - (zg4.e * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(zg4.d, 1073741824));
            ? r05 = this.n;
            r05.layout(0, 0, r05.getMeasuredWidth(), this.n.getMeasuredHeight());
        }
        ? r06 = this.s;
        if (r06 != 0) {
            r06.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            ? r6 = this.s;
            r6.layout(0, 0, r6.getMeasuredWidth(), this.s.getMeasuredHeight());
        }
    }

    public final boolean e(int i2, int i3, MotionEvent motionEvent) {
        ty tyVar = this.h;
        if (tyVar == null) {
            return false;
        }
        if (this.i.a == j10.a) {
            return true;
        }
        boolean z2 = Math.sqrt(Math.pow(((double) i3) - ((double) motionEvent.getY()), 2.0d) + Math.pow(((double) i2) - ((double) motionEvent.getX()), 2.0d)) <= ((double) (w / 2));
        o10 o10 = this.i;
        j10 j10 = o10.a;
        j10 j102 = j10.o;
        ls8 ls8 = ls8.EDITED;
        if (j10 == j102 || ete.L(o10)) {
            boolean L = ete.L(this.i);
            o10 o102 = this.i;
            if (L) {
                o102 = o102.j.d;
            }
            n10 n10 = o102.d;
            if (n10.a == 0 && this.i.n.b()) {
                return false;
            }
            if (!this.i.n.d() || n10.a != 0 || L) {
                if (!z2) {
                    return false;
                }
                tyVar.d(this.i);
            } else if (z2) {
                xm8 xm8 = this.j;
                if (xm8.a.z0 != ls8) {
                    tyVar.e(this.i, xm8);
                }
            }
            return true;
        }
        o10 o103 = this.i;
        if (o103.a != j10.c && !ete.J(o103)) {
            return false;
        }
        a10 a10 = ete.J(this.i) ? this.i.j.d.b : this.i.b;
        if (a10.w0 == 0 && this.i.n.b()) {
            return false;
        }
        boolean z3 = a10.X;
        if (z3 && this.i.n.c()) {
            tyVar.b(this.i);
        } else if (!z2) {
            return false;
        } else {
            if (a10.w0 == 0 && (this.i.n.d() || this.i.n.e())) {
                xm8 xm82 = this.j;
                if (xm82.a.z0 != ls8) {
                    tyVar.e(this.i, xm82);
                }
            } else if (!z3) {
                if (this.k) {
                    this.k = false;
                    tyVar.c(this.i);
                } else if (this.i.n.e() || (this.i.n.b() && h(a10))) {
                    tyVar.a(this.i);
                } else if (!this.i.n.a() && (!this.i.n.b() || h(a10))) {
                    return false;
                } else {
                    tyVar.c(this.i);
                }
            } else if (this.i.n.d()) {
                tyVar.a(this.i);
            } else {
                tyVar.b(this.i);
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.view.View] */
    /* JADX WARNING: type inference failed for: r12v2, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.widget.ProgressBar] */
    /* JADX WARNING: type inference failed for: r14v11, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.view.View] */
    /* JADX WARNING: type inference failed for: r14v12, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.view.View] */
    /* JADX WARNING: type inference failed for: r15v13, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.widget.ProgressBar] */
    /* JADX WARNING: type inference failed for: r14v17, types: [ru.ok.messages.video.widgets.LiveVideoPlaceHolderView, android.view.View] */
    /* JADX WARNING: type inference failed for: r13v19, types: [ru.ok.messages.views.widgets.VideoInfoTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r13v20, types: [ru.ok.messages.views.widgets.VideoInfoTextView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1g.c(r0.q, r13.q) == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.o10 r13, defpackage.xm8 r14, defpackage.i22 r15) {
        /*
            r12 = this;
            o10 r0 = r12.i
            r1 = 1
            if (r0 == 0) goto L_0x000f
            java.lang.String r2 = r13.q
            java.lang.String r0 = r0.q
            boolean r0 = r1g.c(r0, r2)
            if (r0 != 0) goto L_0x0011
        L_0x000f:
            r12.r = r1
        L_0x0011:
            r12.v = r15
            r12.i = r13
            r12.j = r14
            k93 r13 = r12.d
            o2a r13 = (o2a) r13
            oae r13 = r13.p()
            r13.getClass()
            kae r13 = defpackage.oae.b()
            o10 r14 = r12.i
            boolean r14 = ete.L(r14)
            o10 r15 = r12.i
            boolean r15 = ete.J(r15)
            o10 r0 = r12.i
            boolean r0 = r0.f()
            r2 = 0
            if (r0 != 0) goto L_0x0041
            if (r15 == 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            r12.k = r2
            goto L_0x0076
        L_0x0041:
            if (r15 == 0) goto L_0x004c
            o10 r15 = r12.i
            v00 r15 = r15.j
            o10 r15 = r15.d
            a10 r15 = r15.b
            goto L_0x0050
        L_0x004c:
            o10 r15 = r12.i
            a10 r15 = r15.b
        L_0x0050:
            boolean r15 = r15.X
            if (r15 != 0) goto L_0x0073
            o10 r15 = r12.i
            g10 r15 = r15.n
            boolean r15 = r15.e()
            if (r15 == 0) goto L_0x0073
            nqc r13 = (defpackage.nqc) r13
            w4 r13 = r13.getAccessor()
            java.lang.Class<hb2> r15 = defpackage.hb2.class
            java.lang.Object r13 = r13.c(r15)
            hb2 r13 = (defpackage.hb2) r13
            boolean r13 = r13.d()
            if (r13 != 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r1 = r2
        L_0x0074:
            r12.k = r1
        L_0x0076:
            o10 r13 = r12.i
            j10 r13 = r13.a
            j10 r15 = defpackage.j10.o
            if (r13 == r15) goto L_0x0088
            if (r14 == 0) goto L_0x0081
            goto L_0x0088
        L_0x0081:
            c97 r12 = r12.t
            defpackage.tic.b(r12)
            goto L_0x01f6
        L_0x0088:
            ru.ok.messages.views.widgets.VideoInfoTextView r13 = r12.m
            r15 = 6
            android.content.Context r0 = r12.g
            r1 = 0
            if (r13 != 0) goto L_0x00a5
            ru.ok.messages.views.widgets.VideoInfoTextView r13 = new ru.ok.messages.views.widgets.VideoInfoTextView
            r13.<init>(r0, r1, r15)
            r12.m = r13
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r4 = -2
            r3.<init>(r4, r4)
            r13.setLayoutParams(r3)
            ru.ok.messages.views.widgets.VideoInfoTextView r13 = r12.m
            xy6.c(r13)
        L_0x00a5:
            if (r14 == 0) goto L_0x00b0
            o10 r13 = r12.i
            v00 r13 = r13.j
            o10 r13 = r13.d
            n10 r13 = r13.d
            goto L_0x00b4
        L_0x00b0:
            o10 r13 = r12.i
            n10 r13 = r13.d
        L_0x00b4:
            k93 r14 = defpackage.vl.b()
            o2a r14 = (o2a) r14
            j2b r14 = r14.n()
            boolean r14 = ete.Z(r14, r13)
            r3 = 8
            if (r14 == 0) goto L_0x00e6
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r14 = r12.s
            if (r14 != 0) goto L_0x00d4
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r14 = new ru.ok.messages.video.widgets.LiveVideoPlaceHolderView
            r14.<init>(r0)
            r14.w()
            r12.s = r14
        L_0x00d4:
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r14 = r12.s
            r14.P0 = r13
            r14.x()
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r14 = r12.s
            float[] r4 = r12.u
            r14.setCorners(r4)
            r12.i()
            goto L_0x00f2
        L_0x00e6:
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r14 = r12.s
            if (r14 == 0) goto L_0x00ed
            r14.setVisibility(r3)
        L_0x00ed:
            c97 r14 = r12.t
            defpackage.tic.b(r14)
        L_0x00f2:
            ru.ok.messages.views.widgets.VideoInfoTextView r14 = r12.m
            r14.getClass()
            boolean r4 = r13.g
            long r5 = r13.c
            if (r4 == 0) goto L_0x0121
            android.content.Context r4 = r14.getContext()
            int r7 = defpackage.cic.l3
            java.lang.String r4 = r4.getString(r7)
            r14.setText(r4)
            android.content.Context r4 = r14.getContext()
            int r7 = defpackage.zhc.w0
            r8 = -1
            if (r7 == r8) goto L_0x0118
            android.graphics.drawable.Drawable r4 = gq3.b(r4, r7)     // Catch:{ NotFoundException -> 0x011d }
            goto L_0x0119
        L_0x0118:
            r4 = r1
        L_0x0119:
            defpackage.gp0.D(r4, r1, r1, r1, r14)     // Catch:{ NotFoundException -> 0x011d }
            goto L_0x0175
        L_0x011d:
            r14.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r1, r1, r1)
            goto L_0x0175
        L_0x0121:
            java.lang.String r4 = r13.h
            int r7 = r4.length()
            r8 = 0
            if (r7 <= 0) goto L_0x0143
            long r10 = r13.a
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0143
            java.lang.String r7 = r13.i
            int r8 = r7.length()
            if (r8 <= 0) goto L_0x013a
            goto L_0x0150
        L_0x013a:
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r7 = r4.getHost()
            goto L_0x0150
        L_0x0143:
            int r4 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x014e
            java.lang.String[] r4 = defpackage.dhe.b
            java.lang.String r7 = d8.a(r5)
            goto L_0x0150
        L_0x014e:
            java.lang.String r7 = ""
        L_0x0150:
            r14.setText(r7)
            android.content.Context r4 = r14.getContext()
            int r7 = defpackage.zhc.s0
            boolean r8 = r14.isInEditMode()
            if (r8 == 0) goto L_0x0162
            db4 r8 = defpackage.db4.e0
            goto L_0x016c
        L_0x0162:
            android.content.Context r8 = r14.getContext()
            r7e r9 = defpackage.wce.a0
            wce r8 = fja.E(r8)
        L_0x016c:
            int r8 = r8.t
            android.graphics.drawable.Drawable r4 = js.q(r7, r8, r4)
            defpackage.gp0.D(r4, r1, r1, r1, r14)
        L_0x0175:
            java.lang.CharSequence r4 = r14.getText()
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0181
            r4 = 4
            goto L_0x0182
        L_0x0181:
            r4 = r2
        L_0x0182:
            r14.setVisibility(r4)
            o10 r14 = r12.i
            boolean r14 = ete.u(r14)
            if (r14 == 0) goto L_0x01ef
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r14 = r12.n
            if (r14 != 0) goto L_0x01e0
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r14 = new ru.ok.messages.video.widgets.VideoPlayerSeekBar
            r14.<init>(r0, r1, r15)
            r12.n = r14
            xy6.c(r14)
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r14 = r12.n
            r14.setPadding(r2, r2, r2, r2)
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r14 = r12.n
            r14.setSeekBarEnable(r2)
            android.content.res.Resources r14 = r0.getResources()
            int r15 = defpackage.zhc.O0
            android.graphics.drawable.Drawable r14 = r14.getDrawable(r15)
            android.graphics.drawable.LayerDrawable r14 = (android.graphics.drawable.LayerDrawable) r14
            r15 = 16908288(0x1020000, float:2.387723E-38)
            android.graphics.drawable.Drawable r15 = r14.findDrawableByLayerId(r15)
            wce r0 = r12.q
            int r1 = r0.r
            js.D(r15, r1)
            r15 = 16908301(0x102000d, float:2.3877265E-38)
            android.graphics.drawable.Drawable r15 = r14.findDrawableByLayerId(r15)
            int r0 = r0.t
            js.D(r15, r0)
            r15 = 16908303(0x102000f, float:2.387727E-38)
            android.graphics.drawable.Drawable r15 = r14.findDrawableByLayerId(r15)
            r1 = 1050253722(0x3e99999a, float:0.3)
            int r0 = n1g.c0(r0, r1)
            js.D(r15, r0)
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r15 = r12.n
            r15.setProgressDrawable(r14)
        L_0x01e0:
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r12 = r12.n
            long r13 = r13.k
            int r13 = (int) r13
            long r13 = (long) r13
            int r15 = (int) r5
            r12.setMax(r15)
            int r13 = (int) r13
            r12.setProgress(r13)
            goto L_0x01f6
        L_0x01ef:
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r12 = r12.n
            if (r12 == 0) goto L_0x01f6
            r12.setVisibility(r3)
        L_0x01f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy.f(o10, xm8, i22):void");
    }

    public final void g(int i2) {
        boolean z2 = this.r;
        u10 u10 = this.b;
        if (z2) {
            this.r = false;
            if (u10.getLevel() == i2) {
                u10.onLevelChange(i2);
                return;
            }
        }
        u10.setLevel(i2);
    }

    public final boolean h(a10 a10) {
        return !a10.X && this.i.n.b() && !this.k && this.d.n().a.m() - this.i.o > 60000;
    }

    public final void i() {
        boolean z2;
        tic.b(this.t);
        if (this.h != null) {
            j2b n2 = vl.b().n();
            o10 o10 = this.i;
            if (o10 == null) {
                z2 = false;
            } else {
                z2 = ete.O(n2, ete.L(o10) ? o10.j.d.d : o10.d);
            }
            if (z2) {
                nu9 n3 = ms9.l(1, TimeUnit.SECONDS).n(de.a());
                c97 c97 = new c97(new rgc(3, this), new pv0(22), z3d.i);
                n3.a(c97);
                this.t = c97;
            }
        }
    }
}

package ru.ok.messages.media.attaches.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.upstream.FileDataSource;
import java.io.File;
import java.util.ArrayList;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.AttachPhotoView;
import ru.ok.messages.views.dialogs.ProgressDialog;

public class FrgAttachPhoto extends FrgAttachView implements uz, ee9 {
    public FrameLayout M1;
    public AttachPhotoView N1;
    public kd9 O1;
    public int P1 = 0;
    public j8e Q1;
    public int R1;

    public final void E1(int i) {
        ProgressDialog r1 = r1();
        if (r1 != null) {
            r1.J1 = new hy5(1, this);
            j8e a = ((ry) vl.b().getAccessor().c(ry.class)).a(this.H1);
            this.Q1 = a;
            this.R1 = i;
            a.G(new o06(this, i, 0), new o06(this, i, 1));
        }
    }

    public final void F1(boolean z) {
        if (z) {
            to8 l = ((k93) this.t1.b).l();
            vo8 vo8 = this.G1.a;
            o10 o10 = this.H1;
            l.getClass();
            l.t(vo8, o10.q, new cz0());
        } else if (s1() != null) {
            ((ActAttachesView) s1()).e();
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [tde, java.lang.Object] */
    public final void G1(boolean z) {
        File file;
        if (this.H1.f()) {
            o10 o10 = this.H1;
            if (o10.b.X && !ete.T(o10, this.G1)) {
                if (!TextUtils.isEmpty(this.H1.b.y0)) {
                    file = ((mg5) this.u1.j()).n(this.H1.b.y0);
                } else {
                    file = null;
                }
                if (file == null || !file.exists()) {
                    file = ((mg5) this.u1.j()).k(this.H1.b.w0);
                }
                if (this.H1.n.c() && file.exists()) {
                    udd.q("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "onGifPlayClicked: gif exists start play");
                    H1();
                } else if ((z || ((hb2) this.u1.getAccessor().c(hb2.class)).b(true)) && !this.H1.n.d()) {
                    udd.q("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "onGifPlayClicked: gif not exists start download");
                    this.u1.n().u(this.G1.a, this.H1.q, g10.X);
                    o10 o102 = this.H1;
                    long j = this.G1.a.b;
                    ? obj = new Object();
                    obj.a = j;
                    obj.b = o102.q;
                    a10 a10 = o102.b;
                    obj.e = a10.w0;
                    obj.g = a10.x0;
                    obj.h = true;
                    ((jc5) this.u1.getAccessor().c(jc5.class)).a(new ude(obj));
                } else {
                    udd.q("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "onGifPlayClicked: gif not exists, do nothing, autoload disabled or loading in progress");
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [r5, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (r0.endsWith(".mp4") == false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean H0(android.view.MenuItem r6) {
        /*
            r5 = this;
            int r6 = r6.getItemId()
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            r1 = 1
            if (r6 != r0) goto L_0x0035
            ru.ok.messages.media.attaches.AttachPhotoView r6 = r5.N1
            bwf r6 = r6.getZoomableController()
            r6.reset()
            boolean r6 = r5.J1
            if (r6 == 0) goto L_0x0030
            ru.ok.messages.media.attaches.AttachPhotoView r6 = r5.N1
            r6.setWrapContentMeasure(r1)
            r5 r5 = r5.h1()
            boolean r6 = r5 instanceof ru.ok.messages.media.attaches.ActAttachesView
            if (r6 == 0) goto L_0x0029
            r5.onBackPressed()
            goto L_0x0114
        L_0x0029:
            if (r5 == 0) goto L_0x0114
            y7.a(r5)
            goto L_0x0114
        L_0x0030:
            r5.f1()
            goto L_0x0114
        L_0x0035:
            int r0 = defpackage.yqb.menu_attachments__save_to_gallery
            if (r6 != r0) goto L_0x0085
            r5 r6 = r5.h1()
            if (r6 == 0) goto L_0x0114
            o10 r6 = r5.H1
            java.lang.String r0 = r6.r
            a10 r6 = r6.b
            java.lang.String r6 = r6.a()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x005a
            int r2 = lp.i
            java.lang.String r2 = ".mp4"
            boolean r2 = r0.endsWith(r2)
            if (r2 != 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r0 = r6
        L_0x005b:
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 == 0) goto L_0x0070
            android.content.Context r6 = r5.e0()
            int r0 = defpackage.cic.r2
            java.lang.String r5 = r5.i0(r0)
            r0 = 0
            a06.H(r0, r6, r5)
            return r1
        L_0x0070:
            o10 r6 = r5.H1
            a10 r6 = r6.b
            boolean r6 = r6.X
            ru.ok.messages.views.dialogs.SaveToGalleryDialog r6 = ru.ok.messages.views.dialogs.SaveToGalleryDialog.o1(r0, r6)
            androidx.fragment.app.c r5 = r5.g0()
            java.lang.String r0 = "ru.ok.messages.views.dialogs.SaveToGalleryDialog"
            r6.l1(r5, r0)
            goto L_0x0114
        L_0x0085:
            int r0 = defpackage.yqb.menu_attachments__open_in
            if (r6 != r0) goto L_0x008f
            r6 = 3
            r5.E1(r6)
            goto L_0x0114
        L_0x008f:
            int r0 = defpackage.yqb.menu_attachments__forward
            r2 = 0
            if (r6 != r0) goto L_0x00a6
            v06 r6 = r5.s1()
            if (r6 == 0) goto L_0x0114
            xm8 r5 = r5.G1
            ru.ok.messages.media.attaches.ActAttachesView r6 = (ru.ok.messages.media.attaches.ActAttachesView) r6
            og0 r6 = r6.q1
            r6.s(r5, r2)
            goto L_0x0114
        L_0x00a6:
            int r0 = defpackage.yqb.menu_attachments__open_all_media
            if (r6 != r0) goto L_0x00ce
            androidx.fragment.app.b r6 = r5.c0()
            xm8 r0 = r5.G1
            vo8 r0 = r0.a
            long r2 = r0.x0
            int r0 = defpackage.s5.Y0
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<s5> r4 = defpackage.s5.class
            r0.<init>(r6, r4)
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r4)
            java.lang.String r4 = "ru.ok.tamtam.extra.CHAT_ID"
            r0.putExtra(r4, r2)
            r6.startActivity(r0)
            r5.f1()
            goto L_0x0114
        L_0x00ce:
            int r0 = defpackage.yqb.menu_attachments__share
            if (r6 != r0) goto L_0x00d7
            r6 = 2
            r5.E1(r6)
            goto L_0x0114
        L_0x00d7:
            int r0 = defpackage.yqb.menu_attachments__go_to_message
            if (r6 != r0) goto L_0x00dc
            goto L_0x0114
        L_0x00dc:
            int r0 = defpackage.yqb.menu_attachments__rotate_screen
            if (r6 != r0) goto L_0x00e4
            r5.C1()
            goto L_0x0114
        L_0x00e4:
            int r0 = defpackage.yqb.menu_attachments__send_photo
            if (r6 != r0) goto L_0x0114
            v06 r6 = r5.s1()
            if (r6 == 0) goto L_0x0114
            o10 r0 = r5.H1
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x00fd
            o10 r0 = r5.H1
            a10 r0 = r0.b
            long r2 = r0.w0
            goto L_0x010b
        L_0x00fd:
            o10 r0 = r5.H1
            boolean r0 = ete.J(r0)
            if (r0 == 0) goto L_0x010b
            o10 r0 = r5.H1
            v00 r0 = r0.j
            long r2 = r0.a
        L_0x010b:
            xm8 r5 = r5.G1
            ru.ok.messages.media.attaches.ActAttachesView r6 = (ru.ok.messages.media.attaches.ActAttachesView) r6
            og0 r6 = r6.q1
            r6.s(r5, r2)
        L_0x0114:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.fragments.FrgAttachPhoto.H0(android.view.MenuItem):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.content.Context, r5] */
    public final void H1() {
        udd.q("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "playGif");
        ? h1 = h1();
        if (h1 != 0) {
            kd9 kd9 = this.O1;
            if (kd9 != null) {
                kd9.l1(false);
                this.O1 = null;
            }
            q98 i = c0().i();
            bf9 bf9 = new bf9(h1, (float[]) null);
            this.O1 = new kd9(bf9, i, ((k93) this.t1.b).h(), this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            this.M1.addView((View) bf9.c, layoutParams);
            kd9 kd92 = this.O1;
            d96 d96 = new d96(kd92.o, this.H1);
            kd92.Y = d96;
            ((al7) kd92.c).r(d96, kd92);
            ((lf9) ((ge9) kd92.b)).b(kd92);
        }
    }

    public final void I0() {
        super.I0();
        j8e j8e = this.Q1;
        if (j8e != null) {
            tic.b((c97) j8e.o);
        }
    }

    public final void L0() {
        super.L0();
        int i = this.R1;
        j8e j8e = this.Q1;
        if (j8e != null) {
            this.R1 = i;
            j8e.G(new o06(this, i, 0), new o06(this, i, 1));
        }
    }

    public final void M0(Bundle bundle) {
        String str;
        super.M0(bundle);
        bundle.putInt("ru.ok.tamtam.extra.GIF_ERRORS_COUNT", this.P1);
        j8e j8e = this.Q1;
        if (j8e != null) {
            bundle.putStringArrayList("ru.ok.tamtam.extra.ATTACH_DOWNLOAD_OBSERVER", (ArrayList) j8e.c);
        }
        int i = this.R1;
        if (i != 0) {
            if (i == 1) {
                str = "SET_AS_BG";
            } else if (i == 2) {
                str = "SHARE";
            } else if (i == 3) {
                str = "OPEN";
            } else {
                throw null;
            }
            bundle.putString("ru.ok.tamtam.extra.DOWNLOAD_ACTION", str);
        }
    }

    public final void N(int i) {
        this.N1.setWrapContentMeasure(true);
        super.N(i);
    }

    public final void T() {
        F1(false);
    }

    public final void X() {
    }

    public final void Y(Throwable th) {
        if (th.getCause() != null && (th.getCause() instanceof FileDataSource.FileDataSourceException)) {
            int i = this.P1 + 1;
            this.P1 = i;
            View view = this.Y0;
            if (view != null) {
                if (i > 2) {
                    view.post(new q06(this, 0));
                    return;
                }
                File k = ((mg5) this.u1.j()).k(this.H1.b.w0);
                File n = ((mg5) this.u1.j()).n(this.H1.b.y0);
                if (k.delete() || n.delete()) {
                    view.post(new q06(this, 1));
                }
            }
        }
    }

    public final void m1(int i, int i2, Intent intent) {
    }

    public final boolean o1() {
        this.N1.getZoomableController().reset();
        this.N1.setWrapContentMeasure(true);
        return false;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.W0 = true;
        this.N1.getZoomableController().reset();
    }

    @a1e
    public void onEvent(bk4 bk4) {
        if (this.s1 && this.a1 && this.H1.f() && TextUtils.equals(this.H1.b.x0, bk4.b)) {
            H1();
        }
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        A1();
    }

    public final void x0(Menu menu, MenuInflater menuInflater) {
        if (!this.G1.a.r() && !this.Z.getBoolean("ru.ok.tamtam.extra.COMPAT_MODE", false)) {
            menu.clear();
            menuInflater.inflate(bsb.menu_attach_photo, menu);
            js.b(this.v1, menu, (Integer) null);
            boolean w = this.G1.a.w();
            boolean A = this.G1.a.A();
            boolean z = true;
            boolean z2 = this.H1.f() && this.H1.b.X;
            i22 u1 = u1();
            mif w1 = w1();
            if (w1 != null) {
                MenuItem g = w1.g(yqb.menu_attachments__open_in);
                if (g != null && !w) {
                    g.setVisible(false);
                }
                MenuItem g2 = w1.g(yqb.menu_attachments__save_to_gallery);
                if (g2 != null && w) {
                    g2.setVisible(false);
                }
                MenuItem g3 = w1.g(yqb.menu_attachments__open_all_media);
                if (g3 != null && (A || w || u1 == null)) {
                    g3.setVisible(false);
                }
                MenuItem g4 = w1.g(yqb.menu_attachments__go_to_message);
                if (g4 != null) {
                    if (u1 == null) {
                        z = false;
                    }
                    g4.setVisible(z);
                }
                MenuItem g5 = w1.g(yqb.menu_attachments__rotate_screen);
                if (g5 != null) {
                    Context e0 = e0();
                    if (e0 != null) {
                        Settings.System.getInt(e0.getContentResolver(), "accelerometer_rotation", 0);
                    }
                    g5.setVisible(false);
                }
                MenuItem g6 = w1.g(yqb.menu_attachments__send_photo);
                if (z2) {
                    g6.setTitle(cic.x2);
                } else {
                    g6.setTitle(cic.H2);
                }
            }
            super.x0(menu, menuInflater);
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [ru.ok.messages.media.attaches.AttachPhotoView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0020, code lost:
        r9 = r7.G1.a.D0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View y0(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            r7 = this;
            int r0 = defpackage.zrb.frg_photo_view
            r1 = 0
            android.view.View r8 = r8.inflate(r0, r9, r1)
            int r9 = defpackage.yqb.frg_photo_view__fl_photo
            android.view.View r9 = r8.findViewById(r9)
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            r7.M1 = r9
            int r9 = defpackage.yqb.frg_photo_view__iv_photo
            android.view.View r9 = r8.findViewById(r9)
            ru.ok.messages.media.attaches.AttachPhotoView r9 = (ru.ok.messages.media.attaches.AttachPhotoView) r9
            r7.N1 = r9
            boolean r9 = r7.I1
            r0 = 1
            if (r9 == 0) goto L_0x003b
            xm8 r9 = r7.G1
            vo8 r9 = r9.a
            jj7 r9 = r9.D0
            if (r9 != 0) goto L_0x0029
            goto L_0x003b
        L_0x0029:
            int r9 = r9.v()
            if (r9 > r0) goto L_0x0039
            vl r9 = defpackage.vl.o
            vf4 r9 = defpackage.swb.D(r9)
            vf4 r2 = defpackage.vf4.c
            if (r9 != r2) goto L_0x003b
        L_0x0039:
            r9 = r0
            goto L_0x003c
        L_0x003b:
            r9 = r1
        L_0x003c:
            ru.ok.messages.media.attaches.AttachPhotoView r2 = r7.N1
            i22 r3 = r7.u1()
            o10 r4 = r7.H1
            xm8 r5 = r7.G1
            boolean r6 = r7.K1
            r2.R0 = r6
            r2.S0 = r9
            r2.V0 = r3
            r2.r(r4, r5)
            ru.ok.messages.media.attaches.AttachPhotoView r9 = r7.N1
            r9.setListener(r7)
            ru.ok.messages.media.attaches.AttachPhotoView r9 = r7.N1
            r9.setZoomEnabled(r0)
            r9 = r8
            ru.ok.messages.views.widgets.SlideOutLayout r9 = (ru.ok.messages.views.widgets.SlideOutLayout) r9
            ru.ok.messages.media.attaches.AttachPhotoView r2 = r7.N1
            r7.B1(r9, r2)
            boolean r9 = r7.I1
            if (r9 == 0) goto L_0x006c
            ru.ok.messages.media.attaches.AttachPhotoView r9 = r7.N1
            r9.setWrapContentMeasure(r0)
        L_0x006c:
            if (r10 == 0) goto L_0x00d2
            java.lang.String r9 = "ru.ok.tamtam.extra.GIF_ERRORS_COUNT"
            int r9 = r10.getInt(r9, r1)
            r7.P1 = r9
            k93 r9 = defpackage.vl.b()
            o2a r9 = (o2a) r9
            w4 r9 = r9.getAccessor()
            java.lang.Class<ry> r0 = defpackage.ry.class
            java.lang.Object r9 = r9.c(r0)
            ry r9 = (defpackage.ry) r9
            java.lang.String r0 = "ru.ok.tamtam.extra.ATTACH_DOWNLOAD_OBSERVER"
            j8e r9 = hhd.N(r9, r10, r0)
            r7.Q1 = r9
            java.lang.String r9 = "ru.ok.tamtam.extra.DOWNLOAD_ACTION"
            boolean r0 = r10.containsKey(r9)
            if (r0 == 0) goto L_0x00d2
            java.lang.String r9 = r10.getString(r9)
            if (r9 == 0) goto L_0x00ca
            java.lang.String r10 = "SET_AS_BG"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x00a8
            r9 = 1
            goto L_0x00bb
        L_0x00a8:
            java.lang.String r10 = "SHARE"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x00b2
            r9 = 2
            goto L_0x00bb
        L_0x00b2:
            java.lang.String r10 = "OPEN"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x00be
            r9 = 3
        L_0x00bb:
            r7.R1 = r9
            goto L_0x00d2
        L_0x00be:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "No enum constant ru.ok.messages.media.attaches.fragments.FrgAttachPhoto.DownloadAction."
            java.lang.String r8 = r8.concat(r9)
            r7.<init>(r8)
            throw r7
        L_0x00ca:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "Name is null"
            r7.<init>(r8)
            throw r7
        L_0x00d2:
            p06 r9 = new p06
            r10 = 1
            r9.<init>(r7, r10)
            at7.i(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.fragments.FrgAttachPhoto.y0(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void z0() {
        super.z0();
        kd9 kd9 = this.O1;
        if (kd9 != null) {
            kd9.l1(false);
            this.O1 = null;
        }
    }

    public final void z1(boolean z) {
        if (!this.I1) {
            udd.n("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "setUserVisibleHintExtended: " + z);
            if (z) {
                G1(false);
            }
        }
    }

    @a1e
    public void onEvent(ove ove) {
        if (this.s1 && ove.c == this.G1.a.b) {
            x1(ove, new p06(this, 0));
        }
    }
}

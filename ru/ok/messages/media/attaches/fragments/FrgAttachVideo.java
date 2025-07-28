package ru.ok.messages.media.attaches.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import androidx.fragment.app.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpStatus;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.video.widgets.PinchToZoomVideoViewWrapper;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.messages.views.dialogs.FrgDlgAudioTracksPicker;
import ru.ok.messages.views.dialogs.VideoQualityPickerDialog;
import ru.ok.messages.views.widgets.VideoThumbnailView;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.util.HandledException;

public class FrgAttachVideo extends FrgAttachView implements ed9 {
    public Map M1;
    public ImageButton N1;
    public u10 O1;
    public q98 P1;
    public se9 Q1;
    public fd9 R1;
    public VideoThumbnailView S1;
    public j8e T1;
    public bd U1;
    public ad5 V1;

    public final void D1() {
        L1();
    }

    public final void E1() {
        if (this.H1.i()) {
            this.u1.n().t(this.G1.a, this.H1.q, new be8(14));
        }
        r1().J1 = new s06(this, 3);
        j8e a = ((ry) vl.b().getAccessor().c(ry.class)).a(this.H1);
        this.T1 = a;
        a.G(new s06(this, 1), new s06(this, 2));
    }

    public final void F1(boolean z) {
        if (z) {
            a06.H(0, e0(), i0(cic.j3));
        } else if (!urd.k(e0())) {
            urd.I(this, urd.v(), 110);
        } else {
            E1();
        }
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [ru.ok.messages.views.widgets.VideoThumbnailView, android.view.View] */
    public final void G1() {
        K1();
        H1();
        if (!ete.Q(this.H1)) {
            se9 se9 = this.Q1;
            q98 q98 = this.P1;
            o2a o2a = (k93) this.t1.b;
            l8f s = o2a.s();
            mbe q = o2a.q();
            oa7 oa7 = (oa7) o2a.getAccessor().c(oa7.class);
            r10 d = o2a.d();
            to8 l = o2a.l();
            j2b n = o2a.n();
            g15 g = o2a.g();
            tf4 f = o2a.f();
            v06 v1 = s1();
            this.R1 = new fd9(se9, q98, s, q, oa7, d, l, n, this, g, f, v1 == null ? true : ((ActAttachesView) v1).f1, false);
            ((View) this.Q1.c).setVisibility(0);
            ? r0 = this.S1;
            if (r0 != 0) {
                r0.setVisibility(8);
            }
            i22 u1 = u1();
            long j = u1 != null ? u1.b.a : 0;
            udd.p("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "Bind %s", new Object[]{this.H1.q});
            this.R1.Z1(this.H1, j, this.G1.a, 4, false);
        }
    }

    public final void H() {
    }

    public final boolean H0(MenuItem menuItem) {
        v06 v1;
        MenuItem g;
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            o1();
        } else if (itemId != yqb.menu_attachments__open_all_media) {
            long j = 0;
            if (itemId == yqb.menu_attachments__forward) {
                v06 v12 = s1();
                if (v12 != null) {
                    ((ActAttachesView) v12).q1.s(this.G1, 0);
                }
            } else if (itemId == yqb.menu_attachments__share) {
                if (this.s1) {
                    if (this.H1.i()) {
                        duf n = xs7.n(this.H1);
                        String str = (String) n.a;
                        if (str != null) {
                            swb.O(e0(), str);
                        } else {
                            File file = (File) n.b;
                            if (file == null) {
                                Boolean bool = (Boolean) n.c;
                                if (bool != null) {
                                    F1(bool.booleanValue());
                                }
                            } else if (!urd.k(e0())) {
                                urd.I(this, urd.v(), 112);
                            } else {
                                swb.P(c0(), file, ((k93) this.t1.b).h());
                            }
                        }
                    } else if (ete.L(this.H1)) {
                        F1(false);
                    }
                }
            } else if (itemId == yqb.menu_attach_video__download) {
                J1();
            } else if (itemId == yqb.menu_attach_video__download_cancel) {
                this.u1.n().u(this.G1.a, this.H1.q, g10.b);
                M1();
            } else if (itemId == yqb.menu_attachments__to_pip_mode) {
                Context e0 = e0();
                String[] strArr = urd.c;
                if (e0 == null ? false : Settings.canDrawOverlays(e0)) {
                    I1(false);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", cic.N1);
                    bundle.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", cic.X1);
                    bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", cic.V1);
                    ConfirmationDialog confirmationDialog = new ConfirmationDialog();
                    confirmationDialog.Y0(bundle);
                    confirmationDialog.c1(HttpStatus.SC_SWITCHING_PROTOCOLS, this);
                    confirmationDialog.l1(this.J0, "ru.ok.messages.views.dialogs.ConfirmationDialog");
                }
            } else if (itemId == yqb.menu_attachments__open_in) {
                if (ete.L(this.H1)) {
                    this.V1.b(this.G1, this.H1, this, true, false, 4);
                } else if (this.H1.i()) {
                    swb.I(c0(), this.H1.d.h);
                }
            } else if (itemId != yqb.menu_attach_video__go_to_message) {
                if (itemId == yqb.menu_attachments__rotate_screen) {
                    C1();
                } else if (itemId == yqb.menu_attach_video__audio_tracks) {
                    udd.q("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "Open audio tracks");
                    fd9 fd9 = this.R1;
                    if (fd9 != null) {
                        List a2 = fd9.a2();
                        if (a2.size() < 2) {
                            ((k93) this.t1.b).g().c(new HandledException(new IllegalStateException("Audio tracks count less then 2")), true);
                            mif w1 = w1();
                            if (!(w1 == null || (g = w1.g(yqb.menu_attach_video__audio_tracks)) == null)) {
                                g.setVisible(false);
                            }
                        } else {
                            this.U1.d(a2.size(), "OPEN_AUDIO_TRACKS_DIALOG");
                            this.R1.l2();
                            ooe d = ((al7) this.R1.c).d();
                            ArrayList arrayList = new ArrayList(a2);
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelableArrayList("ru.ok.tamtam.extra.AUDIO_TRACKS", arrayList);
                            bundle2.putParcelable("ru.ok.tamtam.extra.CURRENT_AUDIO_TRACK", d);
                            FrgDlgAudioTracksPicker frgDlgAudioTracksPicker = new FrgDlgAudioTracksPicker();
                            frgDlgAudioTracksPicker.Y0(bundle2);
                            frgDlgAudioTracksPicker.l1(d0(), "ru.ok.messages.views.dialogs.FrgDlgAudioTracksPicker");
                        }
                    }
                } else if (itemId == yqb.menu_attach_video__send_video && (v1 = s1()) != null) {
                    if (this.H1.i()) {
                        j = this.H1.d.a;
                    } else if (ete.L(this.H1)) {
                        j = this.H1.j.a;
                    }
                    ((ActAttachesView) v1).q1.s(this.G1, j);
                }
            }
        } else if (h1() != null) {
            b c0 = c0();
            long j2 = this.G1.a.x0;
            int i = s5.Y0;
            Intent intent = new Intent(c0, s5.class);
            intent.addFlags(67108864);
            intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", j2);
            c0.startActivity(intent);
            f1();
        }
        return true;
    }

    public final void H1() {
        if (this.R1 != null) {
            udd.p("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "Release %s", new Object[]{this.H1.q});
            this.R1.l1(false);
            this.R1 = null;
        }
    }

    public final void I0() {
        super.I0();
        j8e j8e = this.T1;
        if (j8e != null) {
            tic.b((c97) j8e.o);
        }
        H1();
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [ru.ok.messages.views.widgets.VideoThumbnailView, android.view.View] */
    public final void I1(boolean z) {
        VideoView videoView = this.Q1.Y;
        Rect rect = mcf.a;
        mcf.d(rect, videoView);
        fd9 fd9 = this.R1;
        if (fd9 != null) {
            fd9.F1();
            m00 j = this.H1.j();
            urd.K(j, this.R1.k(), this.R1.c(), this.R1.c0());
            this.H1 = j.a();
        }
        H1();
        ((k93) this.t1.b).k().y0.d(e0(), u1(), this.G1, this.H1, rect, !z);
        if (z) {
            b c0 = c0();
            if (c0 != null) {
                c0.finish();
                c0.overridePendingTransition(0, hlb.fullscreen_to_pip);
                return;
            }
            return;
        }
        if (((k93) this.t1.b).c().h()) {
            if (this.S1 != null) {
                ((k93) this.t1.b).c().g(this.S1);
            }
            se9 se9 = this.Q1;
            if (!(se9 == null || ((View) se9.c) == null)) {
                ((k93) this.t1.b).c().g((View) this.Q1.c);
            }
        }
        at7.Q(new r06(this, 2), 400);
    }

    public final void J1() {
        if (this.H1.i()) {
            if (!urd.k(e0())) {
                urd.I(this, urd.v(), 111);
                return;
            }
            ((k93) this.t1.b).b().f("EXO_VIDEO_DOWNLOAD");
            this.u1.n().t(this.G1.a, this.H1.q, new be8(14));
            this.u1.n().u(this.G1.a, this.H1.q, g10.X);
            i22 u1 = u1();
            pk c = this.u1.c();
            o10 o10 = this.H1;
            n10 n10 = o10.d;
            long j = n10.a;
            long j2 = u1.b.a;
            vo8 vo8 = this.G1.a;
            ((gy9) c).M(true, j, j2, vo8.c, vo8.b, o10.q, true, true, n10.m);
            M1();
        }
    }

    public final void K() {
        M1();
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [ru.ok.messages.views.widgets.VideoThumbnailView, android.view.View] */
    public final void K1() {
        if (!ete.Q(this.H1) || this.I1) {
            this.N1.setVisibility(8);
            return;
        }
        this.O1.setLevel((int) (this.H1.p * 100.0f));
        this.N1.setVisibility(0);
        ? r0 = this.S1;
        if (r0 != 0) {
            r0.setVisibility(0);
        }
        fd9 fd9 = this.R1;
        if (fd9 != null && fd9.a()) {
            this.R1.pause();
        }
    }

    public final void L0() {
        super.L0();
        j8e j8e = this.T1;
        if (j8e != null) {
            j8e.G(new s06(this, 1), new s06(this, 2));
        }
        L1();
    }

    public final void L1() {
        if (this.R1 != null) {
            if (s1() != null) {
                v06 v1 = s1();
                if ((v1 == null ? true : ((ActAttachesView) v1).f1) && !ete.Q(this.H1)) {
                    this.R1.k1(true);
                    return;
                }
            }
            this.R1.k1(false);
        }
    }

    public final void M() {
        fd9 fd9 = this.R1;
        if (fd9 != null) {
            fd9.l2();
            al7 al7 = (al7) this.R1.c;
            List<poe> emptyList = al7.f == null ? Collections.emptyList() : (List) al7.b.b.o;
            al7 al72 = (al7) this.R1.c;
            poe j = al72.f == null ? poe.c : al72.b.b.j();
            HashMap hashMap = new HashMap();
            for (poe poe : emptyList) {
                ooe ooe = poe.a;
                qjb W = ete.W(ooe.o, ooe.X);
                hashMap.put(poe, new rjb(W, W.c, W.o, W.X, 0, false));
            }
            this.M1 = new kgd(0);
            for (Map.Entry entry : hashMap.entrySet()) {
                this.M1.put((poe) entry.getKey(), (rjb) entry.getValue());
            }
            qjb qjb = j != poe.c ? ((rjb) this.M1.get(j)).a : null;
            u2f u2f = ((al7) this.R1.c).f;
            if (u2f != null && !(u2f instanceof xy3)) {
                boolean z = u2f instanceof uj6;
            }
            VideoQualityPickerDialog.o1(new ArrayList(this.M1.values()), qjb, false).l1(d0(), "ru.ok.messages.media.attaches.fragments.FrgAttachVideo");
            d0().f0("VideoQualityPickerDialog:result:request", this, new o2f(new qzf(4), new u06(this, hashMap), 1));
        }
    }

    public final void M0(Bundle bundle) {
        super.M0(bundle);
        j8e j8e = this.T1;
        if (j8e != null) {
            bundle.putStringArrayList("ru.ok.tamtam.extra.SHARE_DOWNLOAD_OBSERVER", (ArrayList) j8e.c);
        }
        ad5 ad5 = this.V1;
        if (ad5 != null) {
            long j = ad5.h;
            if (j != 0) {
                bundle.putLong("ru.ok.tamtam.extra.FILE_DOWNLOAD_REQUEST_ID", j);
            }
            if (!r1g.p(ad5.j)) {
                bundle.putString("ru.ok.tamtam.extra.FILE_TO_OPEN_FILE_ATTACH_ID", ad5.j);
                bundle.putBoolean("ru.ok.tamtam.extra.TO_OPEN_FILE_ON_FINISH_DOWNLOAD", ad5.k);
            }
            int i = ad5.l;
            if (i != 0) {
                bundle.putInt("ru.ok.tamtam.extra.FILE_TO_OPEN_CLICK_SOURCE", i);
            }
            long j2 = ad5.i;
            if (j2 != 0) {
                bundle.putLong("ru.ok.tamtam.extra.SHARED_FILE_MESSAGE_ID", j2);
            }
            if (ad5.m) {
                bundle.putBoolean("ru.ok.tamtam.extra.FILE_TO_OPEN_IN_APP", true);
            }
        }
        if (this.M1 != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : this.M1.entrySet()) {
                arrayList.add((poe) entry.getKey());
                arrayList2.add(new ujb((rjb) entry.getValue()));
            }
            bundle.putParcelableArrayList("ru.ok.tamtam.extra.VIDEO_FORMATS", arrayList);
            bundle.putParcelableArrayList("ru.ok.tamtam.extra.QUALITIES", arrayList2);
        }
    }

    public final void M1() {
        mif w1;
        boolean z = true;
        if (this.a1 && (w1 = w1()) != null) {
            MenuItem g = w1.g(yqb.menu_attach_video__download);
            MenuItem g2 = w1.g(yqb.menu_attach_video__download_cancel);
            MenuItem g3 = w1.g(yqb.menu_attachments__share);
            MenuItem g4 = w1.g(yqb.menu_attachments__to_pip_mode);
            MenuItem g5 = w1.g(yqb.menu_attachments__open_in);
            MenuItem g6 = w1.g(yqb.menu_attachments__rotate_screen);
            MenuItem g7 = w1.g(yqb.menu_attach_video__go_to_message);
            MenuItem g8 = w1.g(yqb.menu_attach_video__audio_tracks);
            if (g != null && g2 != null && g3 != null && g4 != null && g5 != null && g6 != null && g7 != null && g8 != null) {
                if (u1() == null) {
                    g.setVisible(false);
                    g2.setVisible(false);
                    g3.setVisible(false);
                    g4.setVisible(false);
                    g5.setVisible(false);
                    g6.setVisible(false);
                    g7.setVisible(false);
                    g8.setVisible(false);
                    return;
                }
                n10 n10 = ete.L(this.H1) ? this.H1.j.d.d : this.H1.d;
                boolean O = ete.O(((k93) this.t1.b).n(), n10);
                g3.setVisible(true);
                g4.setVisible(!O);
                if (n10 == null) {
                    g.setVisible(false);
                    g2.setVisible(false);
                    g3.setVisible(true);
                    g5.setVisible(!TextUtils.isEmpty(this.H1.r));
                    MenuItem g9 = w1.g(yqb.menu_attachments__open_all_media);
                    if (g9 != null) {
                        g9.setVisible(false);
                    }
                    g6.setVisible(false);
                    g8.setVisible(false);
                } else {
                    String str = n10.h;
                    g5.setVisible(!O && !TextUtils.isEmpty(str));
                    if (n10.a == 0) {
                        g.setVisible(false);
                        g2.setVisible(false);
                    } else if (this.H1.n.d()) {
                        g2.setVisible(true);
                        g.setVisible(false);
                    } else {
                        g2.setVisible(false);
                        j2b n = ((k93) this.t1.b).n();
                        if (r1g.p(str) && !n10.g) {
                            yzc yzc = n.b;
                            yzc.getClass();
                            long o = yzc.o(PmsKey.f71maxvideodurationdownload, 1200) * 1000;
                            if (o == 0 || n10.c <= o) {
                                duf n2 = xs7.n(this.H1);
                                if (!TextUtils.isEmpty((String) n2.a) || ((File) n2.b) != null) {
                                    g.setVisible(false);
                                } else {
                                    g.setVisible(true);
                                }
                            }
                        }
                        g.setVisible(false);
                        g3.setVisible(false);
                    }
                    Context e0 = e0();
                    if (e0 != null) {
                        Settings.System.getInt(e0.getContentResolver(), "accelerometer_rotation", 0);
                    }
                    g6.setVisible(false);
                    fd9 fd9 = this.R1;
                    g8.setVisible(fd9 != null && fd9.a2().size() > 1);
                }
                if (u1() == null) {
                    z = false;
                }
                g7.setVisible(z);
            }
        }
    }

    public final void N(int i) {
        at7.Q(new r06(this, 1), 500);
        super.N(i);
    }

    public final void T() {
        v06 v1 = s1();
        if (v1 != null) {
            ((ActAttachesView) v1).e();
        }
    }

    public final void X() {
        v06 v1 = s1();
        if (v1 != null) {
            ((ActAttachesView) v1).c(true, true, false);
        }
    }

    public final void Y(Throwable th) {
        Context e0 = e0();
        if (e0 != null) {
            a06.H(0, e0, che.b(e0, th));
        }
    }

    public final void g(String str) {
    }

    public final void j1() {
        fd9 fd9 = this.R1;
        if (fd9 != null) {
            ge9 ge9 = (ge9) fd9.b;
            if (ge9 instanceof xhe) {
                ((xhe) ge9).c();
            }
        }
    }

    public final boolean l1() {
        return this.s1;
    }

    public final void m() {
    }

    public final void m1(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 101) {
                String[] strArr = urd.c;
                e1(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + e0().getPackageName())), HttpStatus.SC_PROCESSING, (Bundle) null);
            } else if (i == 102) {
                I1(true);
            }
        } else if (i == 102) {
            Context e0 = e0();
            String[] strArr2 = urd.c;
            if (e0 == null ? false : Settings.canDrawOverlays(e0)) {
                I1(true);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [r5, android.app.Activity] */
    public final boolean o1() {
        ? h1 = h1();
        if (h1 == 0) {
            return false;
        }
        at7.Q(new r06(this, 1), 400);
        if (this.J1) {
            y7.a(h1);
            return true;
        }
        h1.finish();
        return true;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.W0 = true;
        PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.Q1.Z;
        pinchToZoomVideoViewWrapper.c = kva.b;
        pinchToZoomVideoViewWrapper.w0 = 1.0f;
    }

    @a1e
    public void onEvent(ove ove) {
        if (ove.c == this.G1.a.b) {
            x1(ove, new t06(this, 0));
        }
    }

    public final void p1(int i, String[] strArr, int[] iArr) {
        if (i == 110) {
            if (urd.S(this, strArr, iArr, urd.v(), cic.g2, cic.d2)) {
                View view = this.Y0;
                if (view != null) {
                    view.post(new r06(this, 0));
                }
                E1();
            }
        } else if (i == 111) {
            if (urd.S(this, strArr, iArr, urd.v(), cic.f2, cic.d2)) {
                J1();
            }
        } else if (i == 112) {
            if (urd.S(this, strArr, iArr, urd.v(), cic.g2, cic.d2)) {
                duf n = xs7.n(this.H1);
                swb.P(c0(), (File) n.b, ((k93) this.t1.b).h());
            }
        }
    }

    public final void q(boolean z) {
        v06 v1 = s1();
        if (v1 != null) {
            ((ActAttachesView) v1).c(z, true, false);
        }
    }

    public final void r() {
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        A1();
        if (ete.L(this.H1)) {
            bd b = this.u1.b();
            luf u = this.u1.u();
            mg5 mg5 = (mg5) this.u1.j();
            Context e0 = e0();
            if (this.B1 == null) {
                this.B1 = new ajb();
            }
            ad5 ad5 = new ad5(b, u, mg5, e0, this, this.B1, ((k93) this.t1.b).l());
            this.V1 = ad5;
            ((nqc) ad5.b).e().d(ad5);
            if (bundle != null) {
                ad5.h = bundle.getLong("ru.ok.tamtam.extra.FILE_DOWNLOAD_REQUEST_ID", 0);
                ad5.j = bundle.getString("ru.ok.tamtam.extra.FILE_TO_OPEN_FILE_ATTACH_ID", (String) null);
                ad5.k = bundle.getBoolean("ru.ok.tamtam.extra.TO_OPEN_FILE_ON_FINISH_DOWNLOAD", false);
                ad5.l = bundle.getInt("ru.ok.tamtam.extra.FILE_TO_OPEN_CLICK_SOURCE", 0);
                ad5.m = bundle.getBoolean("ru.ok.tamtam.extra.FILE_TO_OPEN_IN_APP", false);
                ad5.i = bundle.getLong("ru.ok.tamtam.extra.SHARED_FILE_MESSAGE_ID", 0);
            }
            this.V1.d = this;
        }
        this.U1 = ((k93) this.t1.b).b();
    }

    public final void x0(Menu menu, MenuInflater menuInflater) {
        MenuItem g;
        if (!this.G1.a.r() && !this.Z.getBoolean("ru.ok.tamtam.extra.COMPAT_MODE", false)) {
            menu.clear();
            menuInflater.inflate(bsb.menu_attach_video, menu);
            js.b(this.v1, menu, (Integer) null);
            M1();
            mif w1 = w1();
            i22 u1 = u1();
            if (!((!this.G1.a.A() && u1 != null) || w1 == null || (g = w1.g(yqb.menu_attachments__open_all_media)) == null)) {
                g.setVisible(false);
            }
            super.x0(menu, menuInflater);
        }
    }

    /* JADX WARNING: type inference failed for: r0v27, types: [ru.ok.messages.views.widgets.VideoThumbnailView] */
    /* JADX WARNING: type inference failed for: r0v51, types: [ru.ok.messages.views.widgets.VideoThumbnailView] */
    /* JADX WARNING: type inference failed for: r0v53, types: [ru.ok.messages.video.widgets.LiveVideoPlaceHolderView] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View y0(android.view.LayoutInflater r23, android.view.ViewGroup r24, android.os.Bundle r25) {
        /*
            r22 = this;
            r14 = r22
            r15 = r25
            int r0 = defpackage.zrb.frg_video_view
            r13 = 0
            r1 = r23
            r2 = r24
            android.view.View r12 = r1.inflate(r0, r2, r13)
            int r0 = defpackage.yqb.frg_video_view__rl_root
            android.view.View r0 = r12.findViewById(r0)
            t06 r1 = new t06
            r11 = 1
            r1.<init>(r14, r11)
            at7.i(r0, r1)
            xy6.c(r12)
            v2b r0 = r14.t1
            java.lang.Object r0 = r0.b
            k93 r0 = (defpackage.k93) r0
            androidx.fragment.app.b r1 = r22.c0()
            r98 r1 = (defpackage.r98) r1
            q98 r1 = r1.b()
            r14.P1 = r1
            se9 r1 = new se9
            android.content.Context r2 = r22.e0()
            int r3 = defpackage.yqb.frg_video_view__player
            android.view.View r3 = r12.findViewById(r3)
            r16 = r0
            o2a r16 = (o2a) r16
            tg r0 = r16.c()
            bd r4 = r16.b()
            r1.<init>(r2, r3, r0, r4)
            r14.Q1 = r1
            boolean r0 = r14.J1
            if (r0 == 0) goto L_0x00f6
            if (r15 != 0) goto L_0x00f6
            o10 r0 = r14.H1
            boolean r0 = ete.Q(r0)
            if (r0 != 0) goto L_0x00f6
            fd9 r10 = new fd9
            se9 r1 = r14.Q1
            q98 r2 = r14.P1
            l8f r3 = r16.s()
            mbe r4 = r16.q()
            w4 r0 = r16.getAccessor()
            java.lang.Class<oa7> r5 = oa7.class
            java.lang.Object r0 = r0.c(r5)
            r5 = r0
            oa7 r5 = (oa7) r5
            r10 r6 = r16.d()
            to8 r7 = r16.l()
            j2b r8 = r16.n()
            g15 r17 = r16.g()
            tf4 r18 = r16.f()
            v06 r0 = r22.s1()
            if (r0 != 0) goto L_0x0096
            r19 = r11
            goto L_0x009c
        L_0x0096:
            ru.ok.messages.media.attaches.ActAttachesView r0 = (ru.ok.messages.media.attaches.ActAttachesView) r0
            boolean r0 = r0.f1
            r19 = r0
        L_0x009c:
            r20 = 0
            r0 = r10
            r9 = r22
            r21 = r10
            r10 = r17
            r17 = r11
            r11 = r18
            r15 = r12
            r12 = r19
            r13 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = r21
            r14.R1 = r0
            i22 r0 = r22.u1()
            if (r0 == 0) goto L_0x00c1
            o62 r0 = r0.b
            long r0 = r0.a
        L_0x00bf:
            r4 = r0
            goto L_0x00c4
        L_0x00c1:
            r0 = 0
            goto L_0x00bf
        L_0x00c4:
            fd9 r2 = r14.R1
            o10 r3 = r14.H1
            xm8 r0 = r14.G1
            vo8 r6 = r0.a
            r7 = 4
            r8 = 1
            r2.Z1(r3, r4, r6, r7, r8)
            o10 r0 = r14.H1
            java.lang.String r0 = r0.q
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "ru.ok.messages.media.attaches.fragments.FrgAttachVideo"
            java.lang.String r2 = "Bind %s"
            udd.p(r1, r2, r0)
            j2b r0 = r16.n()
            o10 r1 = r14.H1
            boolean r0 = ete.a0(r0, r1)
            if (r0 == 0) goto L_0x00f1
            se9 r0 = r14.Q1
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r0 = r0.H0
            goto L_0x0134
        L_0x00f1:
            se9 r0 = r14.Q1
            ru.ok.messages.views.widgets.VideoThumbnailView r0 = r0.A0
            goto L_0x0134
        L_0x00f6:
            r17 = r11
            r15 = r12
            int r0 = defpackage.yqb.frg_video_view__player
            android.view.View r0 = r15.findViewById(r0)
            r1 = 8
            r0.setVisibility(r1)
            int r0 = defpackage.yqb.frg_video_view__vt_transition
            android.view.View r0 = r15.findViewById(r0)
            ru.ok.messages.views.widgets.VideoThumbnailView r0 = (ru.ok.messages.views.widgets.VideoThumbnailView) r0
            r14.S1 = r0
            o10 r0 = r14.H1
            boolean r0 = ete.L(r0)
            if (r0 == 0) goto L_0x011f
            o10 r0 = r14.H1
            v00 r0 = r0.j
            o10 r0 = r0.d
            n10 r0 = r0.d
            goto L_0x0123
        L_0x011f:
            o10 r0 = r14.H1
            n10 r0 = r0.d
        L_0x0123:
            ru.ok.messages.views.widgets.VideoThumbnailView r1 = r14.S1
            r10 r2 = r16.d()
            o10 r3 = r14.H1
            android.net.Uri r2 = r2.a(r3)
            r1.o(r0, r2)
            ru.ok.messages.views.widgets.VideoThumbnailView r0 = r14.S1
        L_0x0134:
            r12 = r15
            ru.ok.messages.views.widgets.SlideOutLayout r12 = (ru.ok.messages.views.widgets.SlideOutLayout) r12
            r14.B1(r12, r0)
            int r0 = defpackage.yqb.frg_video_view__btn_cancel
            android.view.View r0 = r15.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r14.N1 = r0
            u10 r0 = new u10
            android.content.Context r1 = r22.e0()
            r0.<init>(r1)
            r14.O1 = r0
            android.widget.ImageButton r1 = r14.N1
            r1.setImageDrawable(r0)
            android.widget.ImageButton r0 = r14.N1
            t06 r1 = new t06
            r2 = 2
            r1.<init>(r14, r2)
            at7.i(r0, r1)
            r0 = r25
            r1 = r15
            if (r0 == 0) goto L_0x0178
            w4 r2 = r16.getAccessor()
            java.lang.Class<ry> r3 = defpackage.ry.class
            java.lang.Object r2 = r2.c(r3)
            ry r2 = (defpackage.ry) r2
            java.lang.String r3 = "ru.ok.tamtam.extra.SHARE_DOWNLOAD_OBSERVER"
            j8e r2 = hhd.N(r2, r0, r3)
            r14.T1 = r2
        L_0x0178:
            if (r0 == 0) goto L_0x01b2
            java.util.Map r2 = r14.M1
            if (r2 != 0) goto L_0x01b2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r14.M1 = r2
            java.lang.String r2 = "ru.ok.tamtam.extra.VIDEO_FORMATS"
            java.util.ArrayList r2 = r0.getParcelableArrayList(r2)
            java.lang.String r3 = "ru.ok.tamtam.extra.QUALITIES"
            java.util.ArrayList r0 = r0.getParcelableArrayList(r3)
            if (r2 == 0) goto L_0x01b2
            if (r0 == 0) goto L_0x01b2
            r13 = 0
        L_0x0196:
            int r3 = r2.size()
            if (r13 >= r3) goto L_0x01b2
            java.util.Map r3 = r14.M1
            java.lang.Object r4 = r2.get(r13)
            poe r4 = (defpackage.poe) r4
            java.lang.Object r5 = r0.get(r13)
            ujb r5 = (defpackage.ujb) r5
            rjb r5 = r5.a
            r3.put(r4, r5)
            int r13 = r13 + 1
            goto L_0x0196
        L_0x01b2:
            boolean r0 = r14.I1
            if (r0 != 0) goto L_0x01ca
            s06 r0 = new s06
            r2 = 0
            r0.<init>(r14, r2)
            java.util.WeakHashMap r2 = eaf.a
            t9f.u(r1, r0)
            mg r0 = new mg
            r2 = 4
            r0.<init>(r1, r2)
            r1.post(r0)
        L_0x01ca:
            r22.K1()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.fragments.FrgAttachVideo.y0(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void y1(boolean z) {
        fd9 fd9 = this.R1;
        if (fd9 != null) {
            if (!z) {
                fd9.l2();
            } else if (fd9.a()) {
                this.R1.j2();
            }
        }
    }

    public final void z0() {
        super.z0();
        ad5 ad5 = this.V1;
        if (ad5 != null) {
            ad5.d = null;
            ((nqc) ad5.b).e().f(ad5);
            tic.b(ad5.n);
            tic.b(ad5.o);
        }
        H1();
    }

    public final void z1(boolean z) {
    }
}

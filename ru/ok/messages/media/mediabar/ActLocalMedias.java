package ru.ok.messages.media.mediabar;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import ru.ok.messages.media.crop.ActTamCropImage;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

public class ActLocalMedias extends s5 implements i16, f16, yle, lz7, View.OnSystemUiVisibilityChangeListener, q87, nwc, lwc, nd9, r98, ty7 {
    public static final /* synthetic */ int w1 = 0;
    public final ArrayList Z0 = new ArrayList();
    public int a1 = 0;
    public String b1;
    public qk7 c1;
    public o88 d1;
    public boolean e1 = true;
    public boolean f1 = true;
    public ViewPager2 g1;
    public mif h1;
    public View i1;
    public MediaBarPreviewLayout j1;
    public s87 k1;
    public xi4 l1;
    public vd9 m1;
    public ze9 n1;
    public q98 o1;
    public q98 p1;
    public Toast q1;
    public boolean r1 = true;
    public wf8 s1;
    public o3 t1 = null;
    public final r7e u1 = new r7e(new c6(0, this));
    public final d6 v1 = new d6(this, 0);

    public final void B1(Set set) {
        s0();
    }

    public final String Z() {
        return "LOCAL_MEDIA_VIEWER";
    }

    public final mif a() {
        return this.h1;
    }

    public final q98 b() {
        if (this.o1 == null) {
            this.o1 = ((k93) this.O0.b).k().m(t98.c, new z40(true, false, false));
        }
        return this.o1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [r5, android.view.View$OnSystemUiVisibilityChangeListener, android.app.Activity, ru.ok.messages.media.mediabar.ActLocalMedias] */
    public final void c(boolean z, boolean z2, boolean z3) {
        this.e1 = z;
        xi4 xi4 = this.l1;
        if (xi4 != null && !xi4.h()) {
            this.l1.f();
            this.l1 = null;
        }
        if (!z) {
            u0(z3);
            vx3.y(this);
            this.l1 = at7.Q(new z5(this, 4), 100);
        } else if (!this.f1) {
            g0(this);
            getWindow().getDecorView().post(new z5(this, 3));
            if (p0e.M(Build.BRAND, "meizu", true)) {
                u0(z3);
            }
        } else {
            u0(z3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: mif} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: mif} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: mif} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: mif} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: mif} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: mif} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c0(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            java.util.ArrayList r0 = r7.Z0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            int r1 = r7.a1
            java.lang.Object r1 = r0.get(r1)
            tk7 r1 = (defpackage.tk7) r1
            r2 = 1
            r3 = -1
            if (r8 != r2) goto L_0x0090
            if (r9 != r3) goto L_0x018f
            java.lang.String r8 = "ru.ok.tamtam.extra.START_POSITION"
            r2 = 0
            long r8 = r10.getLongExtra(r8, r2)
            java.lang.String r0 = "ru.ok.tamtam.extra.END_POSITION"
            long r2 = r10.getLongExtra(r0, r2)
            java.lang.String r0 = "ru.ok.tamtam.extra.THUMBNAIL_URI"
            java.lang.String r10 = r10.getStringExtra(r0)
            vd9 r0 = r7.m1
            f3f r4 = r0.x0
            l10 r4 = r4.a()
            float r8 = (float) r8
            long r5 = r0.w0
            float r9 = (float) r5
            float r8 = r8 / r9
            r4.b = r8
            float r8 = (float) r2
            float r8 = r8 / r9
            r4.c = r8
            f3f r8 = new f3f
            r8.<init>(r4)
            r0.x0 = r8
            r0.e2()
            tk7 r8 = r0.X
            pwc r9 = r0.A0
            java.util.concurrent.CopyOnWriteArraySet r0 = r9.a
            int r0 = r0.size()
            r9.a(r8, r0)
            rwc r8 = r9.h(r8)
            if (r8 != 0) goto L_0x005c
            goto L_0x0074
        L_0x005c:
            r8.d = r10
            java.util.Set r9 = r9.g
            java.util.Iterator r9 = r9.iterator()
        L_0x0064:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r9.next()
            lwc r0 = (defpackage.lwc) r0
            r0.j(r8)
            goto L_0x0064
        L_0x0074:
            if (r1 == 0) goto L_0x018f
            o88 r8 = r7.d1
            long r2 = r1.b
            ru.ok.messages.media.mediabar.FrgLocalMedia r8 = r8.F(r2)
            boolean r9 = r8 instanceof ru.ok.messages.media.mediabar.FrgLocalVideo
            if (r9 == 0) goto L_0x0087
            ru.ok.messages.media.mediabar.FrgLocalVideo r8 = (ru.ok.messages.media.mediabar.FrgLocalVideo) r8
            r8.w1()
        L_0x0087:
            xz1 r8 = new xz1
            r8.<init>(r1, r10)
            r7.t1 = r8
            goto L_0x018f
        L_0x0090:
            r4 = 2
            if (r8 != r4) goto L_0x014b
            if (r9 != r3) goto L_0x018f
            java.lang.String r8 = "ru.ok.tamtam.extra.RESULT_URI"
            android.os.Parcelable r8 = r10.getParcelableExtra(r8)
            android.net.Uri r8 = (android.net.Uri) r8
            java.lang.String r9 = "ru.ok.tamtam.extra.ADDITIONAL_RESULT_URI"
            android.os.Parcelable r9 = r10.getParcelableExtra(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.String r1 = "ru.ok.tamtam.extra.CROP_STATE"
            android.os.Parcelable r10 = r10.getParcelableExtra(r1)
            jw3 r10 = (jw3) r10
            if (r8 == 0) goto L_0x0128
            vd9 r1 = r7.m1
            kpa r2 = r1.y0
            if (r2 == 0) goto L_0x00ba
            mif r2 = r2.c()
            goto L_0x00bf
        L_0x00ba:
            mif r2 = new mif
            r2.<init>()
        L_0x00bf:
            kpa r3 = r1.y0
            r4 = 0
            if (r3 == 0) goto L_0x00ce
            android.net.Uri r3 = r3.X
            if (r3 != 0) goto L_0x00c9
            goto L_0x00ce
        L_0x00c9:
            r2.X = r4
            r2.c = r4
            goto L_0x00d0
        L_0x00ce:
            r2.c = r10
        L_0x00d0:
            if (r9 == 0) goto L_0x00d7
            r2.b = r9
            r2.Y = r8
            goto L_0x00d9
        L_0x00d7:
            r2.b = r8
        L_0x00d9:
            if (r10 != 0) goto L_0x00dd
            r2.b = r4
        L_0x00dd:
            kpa r9 = r2.d()
            r1.y0 = r9
            r1.d2()
            tk7 r9 = r1.X
            pwc r10 = r1.A0
            boolean r9 = r10.j(r9)
            boolean r2 = r1.E0
            if (r9 != 0) goto L_0x00f7
            if (r2 == 0) goto L_0x00f7
            r1.c2()
        L_0x00f7:
            tk7 r9 = r1.X
            boolean r9 = r10.j(r9)
            if (r9 == 0) goto L_0x0104
            if (r2 != 0) goto L_0x0104
            r1.c2()
        L_0x0104:
            od9 r9 = new od9
            r10 = 5
            r9.<init>(r1, r10)
            r1.f2(r9)
            od9 r9 = new od9
            r10 = 4
            r9.<init>(r1, r10)
            r1.f2(r9)
            int r9 = r7.a1
            java.lang.Object r9 = r0.get(r9)
            tk7 r9 = (defpackage.tk7) r9
            if (r9 == 0) goto L_0x018f
            vz1 r10 = new vz1
            r10.<init>(r9, r8)
            r7.t1 = r10
            goto L_0x018f
        L_0x0128:
            ru.ok.tamtam.util.HandledException r8 = new ru.ok.tamtam.util.HandledException
            java.lang.String r9 = "no crop result data"
            r8.<init>(r9)
            java.lang.String r8 = r8.getMessage()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r9 = "ru.ok.messages.media.mediabar.ActLocalMedias"
            java.lang.String r10 = "crop"
            udd.t(r9, r10, r8)
            int r8 = defpackage.cic.i
            java.lang.String r8 = r7.getString(r8)
            a06.H(r2, r7, r8)
            r7.finish()
            goto L_0x018f
        L_0x014b:
            r0 = 3
            if (r8 != r0) goto L_0x018f
            if (r9 != r3) goto L_0x018f
            java.lang.String r8 = "photo_editor:result_uri"
            android.os.Parcelable r8 = r10.getParcelableExtra(r8)
            android.net.Uri r8 = (android.net.Uri) r8
            java.lang.String r9 = "photo_editor:editor_state"
            android.os.Parcelable r9 = r10.getParcelableExtra(r9)
            js4 r9 = (defpackage.js4) r9
            vd9 r10 = r7.m1
            kpa r0 = r10.y0
            if (r0 == 0) goto L_0x016b
            mif r0 = r0.c()
            goto L_0x0170
        L_0x016b:
            mif r0 = new mif
            r0.<init>()
        L_0x0170:
            r0.X = r8
            r0.o = r9
            kpa r9 = r0.d()
            r10.y0 = r9
            r10.d2()
            od9 r9 = new od9
            r0 = 0
            r9.<init>(r10, r0)
            r10.f2(r9)
            if (r1 == 0) goto L_0x018f
            wz1 r9 = new wz1
            r9.<init>(r1, r8)
            r7.t1 = r9
        L_0x018f:
            r7.s0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.mediabar.ActLocalMedias.c0(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [r5, android.app.Activity, ru.ok.messages.media.mediabar.ActLocalMedias] */
    public final void d0() {
        Intent intent = getIntent();
        if (intent != null && !intent.getBooleanExtra("ru.ok.tamtam.extra.PROFILE_CREATION", false)) {
            super.d0();
        }
    }

    public final void e() {
        c(!this.e1, true, false);
    }

    public final boolean f() {
        return this.e1;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [r5, android.app.Activity, ru.ok.messages.media.mediabar.ActLocalMedias] */
    public final void finish() {
        ((k93) this.O0.b).m().f(mnc.CHAT_ATTACH_PICKER, eja.e);
        pwc pwc = l0().f;
        pwc.getClass();
        Iterator it = new ArrayList(pwc.a).iterator();
        while (it.hasNext()) {
            ((rwc) it.next()).e = false;
        }
        MediaBarPreviewLayout mediaBarPreviewLayout = this.j1;
        Pair<Integer, Integer> scrollPosition = mediaBarPreviewLayout != null ? mediaBarPreviewLayout.getScrollPosition() : new Pair<>(0, 0);
        Intent intent = new Intent();
        intent.putExtra("ru.ok.tamtam.extra.PREVIEW_LAYOUT_SCROLL_POSITION", (Serializable) scrollPosition.first);
        intent.putExtra("ru.ok.tamtam.extra.PREVIEW_LAYOUT_SCROLL_OFFSET", (Serializable) scrollPosition.second);
        intent.putExtra("ru.ok.tamtam.extra.EXTRA_CHANGE_LOCAL_MEDIA_RESULT", this.t1);
        setResult(0, intent);
        super.finish();
    }

    public final q98 i() {
        if (this.p1 == null) {
            this.p1 = ((k93) this.O0.b).k().m(t98.a, new z40(false, true, true));
        }
        return this.p1;
    }

    public final void j(rwc rwc) {
        s0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ru.ok.messages.media.mediabar.FrgLocalMedia j0() {
        /*
            r4 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r4.g1
            r1 = 0
            if (r0 != 0) goto L_0x0007
        L_0x0005:
            r0 = r1
            goto L_0x001d
        L_0x0007:
            int r0 = r0.getCurrentItem()
            if (r0 < 0) goto L_0x0005
            java.util.ArrayList r2 = r4.Z0
            int r3 = r2.size()
            int r3 = r3 + -1
            if (r0 > r3) goto L_0x0005
            java.lang.Object r0 = r2.get(r0)
            tk7 r0 = (defpackage.tk7) r0
        L_0x001d:
            if (r0 == 0) goto L_0x0028
            o88 r4 = r4.d1
            long r0 = r0.b
            ru.ok.messages.media.mediabar.FrgLocalMedia r4 = r4.F(r0)
            return r4
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.mediabar.ActLocalMedias.j0():ru.ok.messages.media.mediabar.FrgLocalMedia");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [ru.ok.messages.media.mediabar.MediaBarPreviewLayout, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v11, types: [ru.ok.messages.media.mediabar.MediaBarPreviewLayout, android.view.View] */
    public final void k0() {
        udd.q("ru.ok.messages.media.mediabar.ActLocalMedias", "endTransition: onStart");
        if (this.j1.getVisibility() != 0) {
            udd.q("ru.ok.messages.media.mediabar.ActLocalMedias", "endTransition: bottom visible");
            if (this.c1.a) {
                ? r12 = this.j1;
                r12.Z0.h();
                r12.setTranslationY(0.0f);
                r12.setVisibility(0);
            }
            q0();
        }
        if (((Toolbar) this.h1.b).getVisibility() != 0) {
            udd.q("ru.ok.messages.media.mediabar.ActLocalMedias", "endTransition: top visible");
            Toolbar toolbar = (Toolbar) this.h1.b;
            if (toolbar != null) {
                toolbar.setVisibility(0);
            }
        }
    }

    public final wk7 l0() {
        return ((k93) this.O0.b).j();
    }

    public final void m0() {
        ArrayList arrayList = this.Z0;
        if (arrayList.size() != 0) {
            int max = Math.max(this.a1, 0);
            this.a1 = max;
            if (max >= arrayList.size()) {
                this.a1 = arrayList.size() - 1;
            }
            this.m1.a2((tk7) arrayList.get(this.a1));
        }
    }

    public final void n0() {
        int ordinal = ((mi2) this.u1.getValue()).ordinal();
        if (ordinal == 0) {
            p0((nd4) null);
        } else if (ordinal == 1) {
            ScheduledSendPickerDialogFragment.q1("ru.ok.messages.media.mediabar.ActLocalMedias", P(), this, new a6(0, this));
            ScheduledSendPickerDialogFragment.r1("ru.ok.messages.media.mediabar.ActLocalMedias", P());
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, ru.ok.messages.media.mediabar.ActLocalMedias] */
    public final void o0(boolean z, boolean z2) {
        if (z) {
            ((al7) this.o1).s(1.0f);
            if (z2) {
                int i = cic.G2;
                Toast toast = this.q1;
                if (toast != null) {
                    toast.cancel();
                }
                Toast makeText = Toast.makeText(this, i, 0);
                this.q1 = makeText;
                makeText.show();
                return;
            }
            return;
        }
        ((al7) this.o1).u();
        if (z2) {
            int i2 = cic.E2;
            Toast toast2 = this.q1;
            if (toast2 != null) {
                toast2.cancel();
            }
            Toast makeText2 = Toast.makeText(this, i2, 0);
            this.q1 = makeText2;
            makeText2.show();
        }
    }

    public final void onBackPressed() {
        if (!this.c1.y0) {
            pwc pwc = l0().f;
            pwc.a.clear();
            pwc.n();
            pwc.b.clear();
            if (((kp) pwc.h).g.getBoolean("app.send.media.as.collage", true)) {
                pwc.l = 3;
            } else {
                pwc.l = 1;
            }
        }
        super.onBackPressed();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        Toolbar toolbar;
        ActLocalMedias.super.onConfigurationChanged(configuration);
        mif mif = this.h1;
        if (!(mif == null || (toolbar = (Toolbar) mif.b) == null)) {
            mn mnVar = (mn) mif.a;
            if (mnVar.M() != null) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = dh4.a(mnVar.M());
                toolbar.setLayoutParams(layoutParams);
            }
        }
        q0();
        s87 s87 = this.k1;
        s87.getClass();
        int i = configuration.orientation;
        if (i != s87.c) {
            s87.c = i;
            s87.b.o = 0;
        }
        at7.Q(new z5(this, 0), 300);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [e83, q87, android.content.Context, s5, androidx.fragment.app.b, r5, im, lz7, java.lang.Object, android.app.Activity, ru.ok.messages.media.mediabar.ActLocalMedias] */
    /* JADX WARNING: type inference failed for: r0v54, types: [ru.ok.messages.media.mediabar.MediaBarPreviewLayout, android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r11 = r18
            r0 = r19
            r12 = 0
            r13 = 2
            r14 = 1
            super.onCreate(r19)
            android.view.Window r1 = r18.getWindow()
            android.view.WindowManager$LayoutParams r1 = r1.getAttributes()
            r1.layoutInDisplayCutoutMode = r14
            q98 r1 = r18.b()
            r11.o1 = r1
            q98 r1 = r18.i()
            r11.p1 = r1
            if (r0 == 0) goto L_0x006c
            q98 r1 = r11.o1
            al7 r1 = (defpackage.al7) r1
            java.lang.String r2 = "MediaPlayerController.Volume"
            java.lang.String r3 = r1.b(r2)
            float r3 = r0.getFloat(r3)
            r1.h = r3
            java.lang.String r3 = "MediaPlayerController.Looping"
            java.lang.String r4 = r1.b(r3)
            boolean r4 = r0.getBoolean(r4)
            r1.i = r4
            java.lang.String r4 = "MediaPlayerController.PlayWhenReady"
            java.lang.String r5 = r1.b(r4)
            boolean r5 = r0.getBoolean(r5)
            r1.j = r5
            q98 r1 = r11.p1
            al7 r1 = (defpackage.al7) r1
            java.lang.String r2 = r1.b(r2)
            float r2 = r0.getFloat(r2)
            r1.h = r2
            java.lang.String r2 = r1.b(r3)
            boolean r2 = r0.getBoolean(r2)
            r1.i = r2
            java.lang.String r2 = r1.b(r4)
            boolean r2 = r0.getBoolean(r2)
            r1.j = r2
        L_0x006c:
            int r1 = defpackage.zrb.act_local_medias
            mif r1 = r11.i0(r1)
            r11.h1 = r1
            boolean r1 = urd.k(r18)
            if (r1 != 0) goto L_0x007e
            r18.finish()
            return
        L_0x007e:
            s87 r1 = new s87
            android.view.Window r2 = r18.getWindow()
            android.view.View r2 = r2.getDecorView()
            r1.<init>(r2, r11)
            r11.k1 = r1
            pc7 r2 = r11.a
            r2.a(r1)
            android.content.Intent r1 = r18.getIntent()
            java.lang.String r2 = "ru.ok.tamtam.extra.OPTIONS"
            android.os.Parcelable r1 = r1.getParcelableExtra(r2)
            qk7 r1 = (defpackage.qk7) r1
            r11.c1 = r1
            wce r1 = r18.t()
            int r1 = r1.L
            r11.f0(r1)
            mif r1 = r11.h1
            d5 r2 = new d5
            r2.<init>((int) r13, (java.lang.Object) r11)
            java.lang.Object r1 = r1.b
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            if (r1 == 0) goto L_0x00b9
            r1.setNavigationOnClickListener(r2)
        L_0x00b9:
            mif r1 = r11.h1
            int r2 = defpackage.zhc.j
            java.lang.Object r3 = r1.c
            wce r3 = (defpackage.wce) r3
            int r3 = r3.w
            java.lang.Object r1 = r1.b
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            if (r1 == 0) goto L_0x00d5
            r1.setNavigationIcon(r2)
            android.graphics.drawable.Drawable r1 = r1.getNavigationIcon()
            if (r1 == 0) goto L_0x00d5
            js.D(r1, r3)
        L_0x00d5:
            mif r1 = r11.h1
            wf8 r2 = r11.s1
            int r2 = r2.w
            java.lang.Object r1 = r1.b
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            android.graphics.drawable.Drawable r1 = r1.getNavigationIcon()
            if (r1 == 0) goto L_0x00e8
            js.D(r1, r2)
        L_0x00e8:
            mif r1 = r11.h1
            wf8 r2 = r11.s1
            int r2 = r2.N
            java.lang.Object r1 = r1.b
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            if (r1 == 0) goto L_0x00f7
            r1.setBackgroundColor(r2)
        L_0x00f7:
            mif r1 = r11.h1
            wf8 r2 = r11.s1
            int r2 = r2.F
            java.lang.Object r1 = r1.o
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0106
            r1.setTextColor(r2)
        L_0x0106:
            mif r1 = r11.h1
            v2b r2 = r11.O0
            java.lang.Object r2 = r2.c
            zg4 r2 = (defpackage.zg4) r2
            int r2 = r2.a
            java.lang.Object r1 = r1.b
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            if (r1 == 0) goto L_0x011c
            float r2 = (float) r2
            java.util.WeakHashMap r3 = eaf.a
            t9f.s(r1, r2)
        L_0x011c:
            qk7 r1 = r11.c1
            java.lang.String r2 = r1.X
            r11.b1 = r2
            if (r0 != 0) goto L_0x0129
            int r0 = r1.Z
            r11.a1 = r0
            goto L_0x0139
        L_0x0129:
            java.lang.String r1 = "ru.ok.tamtam.extra.SELECTED_POS"
            int r1 = r0.getInt(r1, r12)
            r11.a1 = r1
            java.lang.String r1 = "ru.ok.tamtam.extra.UI_VISIBILITY"
            boolean r0 = r0.getBoolean(r1, r14)
            r11.e1 = r0
        L_0x0139:
            java.util.ArrayList r15 = r11.Z0
            wk7 r0 = r18.l0()
            java.lang.String r1 = r11.b1
            java.util.List r0 = r0.a(r1)
            r15.addAll(r0)
            int r0 = defpackage.yqb.act_local_medias__preview
            android.view.View r0 = r11.findViewById(r0)
            ru.ok.messages.media.mediabar.MediaBarPreviewLayout r0 = (ru.ok.messages.media.mediabar.MediaBarPreviewLayout) r0
            r11.j1 = r0
            java.lang.String r1 = r11.b1
            java.lang.String r10 = "SELECTED_MEDIA_ALBUM"
            boolean r1 = hhd.f(r1, r10)
            r0.setShouldApplyHighlight(r1)
            ru.ok.messages.media.mediabar.MediaBarPreviewLayout r0 = r11.j1
            qk7 r1 = r11.c1
            boolean r1 = r1.b
            r0.setMessageEdit(r1)
            ru.ok.messages.media.mediabar.MediaBarPreviewLayout r0 = r11.j1
            r0.setFullScreen(r14)
            ru.ok.messages.media.mediabar.MediaBarPreviewLayout r0 = r11.j1
            r0.setListener(r11)
            ru.ok.messages.media.mediabar.MediaBarPreviewLayout r0 = r11.j1
            android.view.View r0 = r0.N0
            r1 = 8
            r0.setVisibility(r1)
            ru.ok.messages.media.mediabar.MediaBarPreviewLayout r0 = r11.j1
            r7e r2 = r11.u1
            java.lang.Object r2 = r2.getValue()
            mi2 r2 = (defpackage.mi2) r2
            r0.setChatMode(r2)
            ru.ok.messages.media.mediabar.MediaBarPreviewLayout r0 = r11.j1
            v2b r2 = r11.O0
            java.lang.Object r2 = r2.b
            k93 r2 = (defpackage.k93) r2
            o2a r2 = (o2a) r2
            j2b r2 = r2.n()
            yzc r2 = r2.b
            r2.getClass()
            java.util.Set r2 = java.util.Collections.emptySet()
            r3 = 3
            boolean r2 = a06.s(r3, r2)
            r0.setAnimojisEnabled(r2)
            qk7 r0 = r11.c1
            boolean r0 = r0.a
            if (r0 != 0) goto L_0x01b0
            ru.ok.messages.media.mediabar.MediaBarPreviewLayout r0 = r11.j1
            r0.setVisibility(r1)
        L_0x01b0:
            int r0 = defpackage.yqb.act_local_medias__fl_root
            android.view.View r0 = r11.findViewById(r0)
            int r1 = defpackage.yqb.act_local_medias__vs_toolbox
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            ze9 r2 = new ze9
            android.content.Context r0 = r0.getContext()
            v2b r3 = r11.O0
            java.lang.Object r3 = r3.b
            k93 r3 = (defpackage.k93) r3
            o2a r3 = (o2a) r3
            tg r3 = r3.c()
            r2.<init>(r0, r1, r3)
            r11.n1 = r2
            v2b r0 = r11.O0
            java.lang.Object r0 = r0.b
            k93 r0 = (defpackage.k93) r0
            vd9 r9 = new vd9
            ze9 r1 = r11.n1
            qk7 r2 = r11.c1
            boolean r3 = r2.a
            o2a r0 = (o2a) r0
            bd r5 = r0.b()
            wk7 r4 = r0.j()
            pwc r6 = r4.f
            mg5 r7 = r0.h()
            f94 r8 = new f94
            r8.<init>(r11)
            g15 r16 = r0.g()
            j2b r0 = r0.n()
            kp r0 = r0.c
            n2f r17 = r0.p()
            boolean r4 = r2.c
            r0 = r9
            r2 = r18
            r12 = r9
            r9 = r16
            r14 = r10
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.m1 = r12
            int r0 = defpackage.yqb.act_local_medias__vs_toolbox
            android.view.View r0 = r11.findViewById(r0)
            r11.i1 = r0
            r18.s0()
            r18.m0()
            int r0 = defpackage.yqb.act_local_medias__view_pager
            android.view.View r0 = r11.findViewById(r0)
            androidx.viewpager2.widget.ViewPager2 r0 = (androidx.viewpager2.widget.ViewPager2) r0
            r11.g1 = r0
            o88 r0 = new o88
            qk7 r1 = r11.c1
            r0.<init>(r11, r15, r1)
            r11.d1 = r0
            androidx.viewpager2.widget.ViewPager2 r0 = r11.g1
            d6 r1 = r11.v1
            r0.b(r1)
            androidx.viewpager2.widget.ViewPager2 r0 = r11.g1
            r0.setOffscreenPageLimit(r13)
            androidx.viewpager2.widget.ViewPager2 r0 = r11.g1
            o88 r1 = r11.d1
            r0.setAdapter(r1)
            java.lang.String r0 = r11.b1
            boolean r0 = r1g.c(r0, r14)
            if (r0 != 0) goto L_0x0253
            goto L_0x026e
        L_0x0253:
            androidx.viewpager2.widget.ViewPager2 r0 = r11.g1
            d6 r1 = new d6
            r2 = 1
            r1.<init>(r11, r2)
            r0.b(r1)
            wk7 r0 = r18.l0()
            pwc r0 = r0.f
            int r1 = r11.a1
            rwc r0 = r0.i(r1)
            if (r0 == 0) goto L_0x026e
            r0.e = r2
        L_0x026e:
            androidx.viewpager2.widget.ViewPager2 r0 = r11.g1
            int r1 = r11.a1
            r2 = 0
            r0.e(r1, r2)
            int r0 = r11.a1
            r11.t0(r0)
            r18.s0()
            ru.ok.messages.media.mediabar.MediaBarPreviewLayout r0 = r11.j1
            qk7 r1 = r11.c1
            int r2 = r1.z0
            androidx.recyclerview.widget.RecyclerView r0 = r0.O0
            androidx.recyclerview.widget.a r3 = r0.getLayoutManager()
            boolean r3 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r3 == 0) goto L_0x0299
            androidx.recyclerview.widget.a r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r1 = r1.A0
            r0.n1(r2, r1)
        L_0x0299:
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r1 = "ru.ok.tamtam.extra.WITH_TRANSITION"
            r2 = 0
            boolean r0 = r0.getBooleanExtra(r1, r2)
            if (r0 == 0) goto L_0x0341
            mif r0 = r11.h1
            java.lang.Object r0 = r0.b
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            if (r0 == 0) goto L_0x02b2
            r1 = 4
            r0.setVisibility(r1)
        L_0x02b2:
            jlc r0 = jlc.g
            jlc r1 = jlc.j
            android.transition.TransitionSet r2 = nn4.b(r0, r1)
            qk7 r3 = r11.c1
            android.graphics.Rect r3 = r3.w0
            if (r3 == 0) goto L_0x02c9
            l03 r4 = new l03
            r5 = 1
            r4.<init>(r3, r5)
            r2.addTransition(r4)
        L_0x02c9:
            nn4 r4 = new nn4
            r4.<init>(r0, r1)
            r2.addTransition(r4)
            e6 r4 = new e6
            r4.<init>(r11, r3)
            r11.setEnterSharedElementCallback(r4)
            f6 r4 = new f6
            r5 = 0
            r4.<init>(r5, r11)
            r2.addListener(r4)
            v2b r4 = r11.O0
            java.lang.Object r4 = r4.b
            k93 r4 = (defpackage.k93) r4
            o2a r4 = (o2a) r4
            tg r4 = r4.c()
            lg r4 = r4.a
            long r4 = r4.b()
            r2.setDuration(r4)
            android.view.Window r4 = r18.getWindow()
            r4.setSharedElementEnterTransition(r2)
            r18.postponeEnterTransition()
            androidx.viewpager2.widget.ViewPager2 r2 = r11.g1
            z5 r4 = new z5
            r5 = 1
            r4.<init>(r11, r5)
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            wcf r5 = new wcf
            r5.<init>(r2, r4)
            r2.addOnPreDrawListener(r5)
            android.transition.TransitionSet r0 = nn4.b(r1, r0)
            if (r3 == 0) goto L_0x0324
            l03 r1 = new l03
            r2 = 0
            r1.<init>(r3, r2)
            r0.addTransition(r1)
        L_0x0324:
            v2b r1 = r11.O0
            java.lang.Object r1 = r1.b
            k93 r1 = (defpackage.k93) r1
            o2a r1 = (o2a) r1
            tg r1 = r1.c()
            lg r1 = r1.a
            long r1 = r1.b()
            r0.setDuration(r1)
            android.view.Window r1 = r18.getWindow()
            r1.setSharedElementReturnTransition(r0)
            goto L_0x0344
        L_0x0341:
            r18.k0()
        L_0x0344:
            r0 = 0
            r11.g0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.mediabar.ActLocalMedias.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.o1 != null) {
            ((k93) this.O0.b).k().r(this.o1);
        }
        if (this.p1 != null) {
            ((k93) this.O0.b).k().r(this.p1);
        }
        ViewPager2 viewPager2 = this.g1;
        if (viewPager2 != null) {
            viewPager2.g(this.v1);
        }
        Toast toast = this.q1;
        if (toast != null) {
            toast.cancel();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        if (r10 != -1) goto L_0x00a5;
     */
    @a1e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onEvent(defpackage.xk7 r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.b
            java.lang.String r1 = r9.b1
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b4
            boolean r0 = r9.T0
            r1 = 1
            if (r0 != 0) goto L_0x0015
            java.util.HashSet r9 = r9.U0
            wx3.C(r9, r10, r1)
            return
        L_0x0015:
            wk7 r10 = r9.l0()
            java.lang.String r0 = r9.b1
            java.util.List r10 = r10.a(r0)
            int r0 = r10.size()
            if (r0 != 0) goto L_0x0029
            r9.finish()
            return
        L_0x0029:
            java.util.ArrayList r0 = r9.Z0
            int r2 = r0.size()
            int r3 = r10.size()
            if (r3 != r2) goto L_0x0036
            return
        L_0x0036:
            r9.s0()
            int r2 = r9.a1
            int r3 = r0.size()
            if (r2 < r3) goto L_0x0043
            goto L_0x00b4
        L_0x0043:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            r0.clear()
            r0.addAll(r10)
            o88 r3 = new o88
            qk7 r4 = r9.c1
            r3.<init>(r9, r0, r4)
            r9.d1 = r3
            androidx.viewpager2.widget.ViewPager2 r0 = r9.g1
            r0.setAdapter(r3)
            int r0 = r9.a1
            int r3 = r10.size()
            if (r0 < r3) goto L_0x006a
            int r10 = r10.size()
            int r10 = r10 - r1
            goto L_0x00a5
        L_0x006a:
            int r3 = r2.size()
            int r3 = r3 + r1
            int r4 = r10.size()
            if (r3 != r4) goto L_0x0078
            int r10 = r0 + 1
            goto L_0x00a5
        L_0x0078:
            java.lang.Object r0 = o23.Y(r0, r2)
            tk7 r0 = (defpackage.tk7) r0
            r1 = 0
            if (r0 != 0) goto L_0x0083
        L_0x0081:
            r10 = r1
            goto L_0x00a5
        L_0x0083:
            java.util.Iterator r10 = r10.iterator()
            r2 = r1
        L_0x0088:
            boolean r3 = r10.hasNext()
            r4 = -1
            if (r3 == 0) goto L_0x00a2
            java.lang.Object r3 = r10.next()
            tk7 r3 = (defpackage.tk7) r3
            long r5 = r3.b
            long r7 = r0.b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x009f
            r10 = r2
            goto L_0x00a3
        L_0x009f:
            int r2 = r2 + 1
            goto L_0x0088
        L_0x00a2:
            r10 = r4
        L_0x00a3:
            if (r10 == r4) goto L_0x0081
        L_0x00a5:
            r9.a1 = r10
            androidx.viewpager2.widget.ViewPager2 r0 = r9.g1
            r0.setCurrentItem(r10)
            r9.m0()
            int r10 = r9.a1
            r9.t0(r10)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.mediabar.ActLocalMedias.onEvent(xk7):void");
    }

    public final void onPause() {
        super.onPause();
        if (this.o1 != null) {
            ((k93) this.O0.b).k().n(this.o1);
        }
        if (this.p1 != null) {
            ((k93) this.O0.b).k().n(this.p1);
        }
    }

    public final void onResume() {
        tk7 tk7;
        super.onResume();
        ((k93) this.O0.b).m().f(mnc.CHAT_ATTACH_PICKER_MEDIA_VIEWER, eja.e);
        q0();
        if (this.o1 != null) {
            ((k93) this.O0.b).k().k(this.o1);
        }
        if (this.p1 != null) {
            ((k93) this.O0.b).k().k(this.p1);
        }
        if (!this.r1) {
            c(this.e1, false, false);
        }
        this.r1 = false;
        ArrayList arrayList = this.Z0;
        if (arrayList.size() != 0 && (tk7 = (tk7) arrayList.get(this.a1)) != null) {
            FrgLocalMedia F = this.d1.F(tk7.b);
            if (F instanceof FrgLocalVideo) {
                ((FrgLocalVideo) F).w1();
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ru.ok.tamtam.extra.SELECTED_POS", this.a1);
        bundle.putBoolean("ru.ok.tamtam.extra.UI_VISIBILITY", this.e1);
        q98 q98 = this.o1;
        if (q98 != null) {
            al7 al7 = (al7) q98;
            bundle.putFloat(al7.b("MediaPlayerController.Volume"), al7.h);
            bundle.putBoolean(al7.b("MediaPlayerController.Looping"), al7.i);
            bundle.putBoolean(al7.b("MediaPlayerController.PlayWhenReady"), al7.j);
        }
        q98 q982 = this.p1;
        if (q982 != null) {
            al7 al72 = (al7) q982;
            bundle.putFloat(al72.b("MediaPlayerController.Volume"), al72.h);
            bundle.putBoolean(al72.b("MediaPlayerController.Looping"), al72.i);
            bundle.putBoolean(al72.b("MediaPlayerController.PlayWhenReady"), al72.j);
        }
    }

    public final void onStart() {
        super.onStart();
        pwc pwc = l0().f;
        pwc.c.add(this);
        pwc.g.add(this);
        vd9 vd9 = this.m1;
        tk7 tk7 = vd9.X;
        if (tk7 != null) {
            vd9.a2(tk7);
        }
        pwc pwc2 = vd9.A0;
        pwc2.c.add(vd9);
        pwc2.d.add(vd9);
        pwc2.f.add(vd9);
    }

    public final void onStop() {
        super.onStop();
        pwc pwc = l0().f;
        pwc.c.remove(this);
        pwc.g.remove(this);
        vd9 vd9 = this.m1;
        pwc pwc2 = vd9.A0;
        pwc2.c.remove(vd9);
        pwc2.d.remove(vd9);
        pwc2.f.remove(vd9);
        tic.b(vd9.G0);
        tic.b(vd9.H0);
    }

    public final void onSystemUiVisibilityChange(int i) {
        boolean z = i == 0 || i == 2;
        this.f1 = z;
        if (this.e1 && z) {
            this.l1 = at7.Q(new z5(this, 2), 100);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [r5, android.app.Activity, ru.ok.messages.media.mediabar.ActLocalMedias] */
    public final void p0(nd4 nd4) {
        ArrayList arrayList = this.Z0;
        if (!arrayList.isEmpty()) {
            if (l0().f.b() == 0 && !this.c1.b && j0() != null) {
                this.m1.c2();
            }
            Intent intent = new Intent();
            intent.putExtra("act:local_medias:send_result", (Parcelable) arrayList.get(this.a1));
            intent.putExtra("act:local_medias:delayed_attrs", nd4);
            setResult(-1, intent);
            if (this.c1.a) {
                pwc pwc = l0().f;
                pwc.getClass();
                Iterator it = new ArrayList(pwc.a).iterator();
                while (it.hasNext()) {
                    ((rwc) it.next()).e = false;
                }
                super.finish();
                return;
            }
            Y();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.messages.media.mediabar.MediaBarPreviewLayout, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v2, types: [ru.ok.messages.media.mediabar.MediaBarPreviewLayout, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v3, types: [ru.ok.messages.media.mediabar.MediaBarPreviewLayout, android.view.View] */
    public final void q0() {
        ? r0 = this.j1;
        if (r0 == 0) {
            return;
        }
        if (this.c1.a) {
            b6 b6Var = new b6(this, 0);
            WeakHashMap weakHashMap = eaf.a;
            t9f.u(r0, b6Var);
            this.j1.post(new z5(this, 5));
            return;
        }
        View view = this.i1;
        b6 b6Var2 = new b6(this, 1);
        WeakHashMap weakHashMap2 = eaf.a;
        t9f.u(view, b6Var2);
        this.j1.post(new z5(this, 6));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, android.app.Activity, ru.ok.messages.media.mediabar.ActLocalMedias] */
    public final void r0(Uri uri, File file, Uri uri2, File file2, jw3 jw3) {
        Uri fromFile = Uri.fromFile(file);
        Uri fromFile2 = file2 != null ? Uri.fromFile(file2) : null;
        Intent intent = new Intent(this, ActTamCropImage.class);
        intent.putExtra("ru.ok.tamtam.extra.SOURCE_URI", uri);
        intent.putExtra("ru.ok.tamtam.extra.RESULT_URI", fromFile);
        intent.putExtra("ru.ok.tamtam.extra.ADDITIONAL_SOURCE_URI", uri2);
        intent.putExtra("ru.ok.tamtam.extra.ADDITIONAL_RESULT_URI", fromFile2);
        intent.putExtra("ru.ok.tamtam.extra.CROP_STATE", jw3);
        intent.putExtra("ru.ok.tamtam.extra.SAVE_AS_PNG", false);
        startActivityForResult(intent, 2);
    }

    public final void s0() {
        this.j1.A();
        q0();
    }

    public final wce t() {
        if (this.s1 == null) {
            this.s1 = wf8.e0;
        }
        return this.s1;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, ru.ok.messages.media.mediabar.ActLocalMedias] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        r5 = (defpackage.o46) r3.g.get(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t0(int r6) {
        /*
            r5 = this;
            mif r0 = r5.h1
            java.util.Locale r1 = java.util.Locale.getDefault()
            int r6 = r6 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r2 = defpackage.whc.B
            java.lang.String r2 = r5.getString(r2)
            java.lang.String r3 = r5.b1
            java.lang.String r4 = "SELECTED_MEDIA_ALBUM"
            boolean r3 = hhd.f(r3, r4)
            if (r3 == 0) goto L_0x0025
            o88 r5 = r5.d1
            java.util.List r5 = r5.B0
            int r5 = r5.size()
            goto L_0x004d
        L_0x0025:
            wk7 r3 = r5.l0()
            java.lang.String r5 = r5.b1
            r3.getClass()
            boolean r4 = hhd.f(r5, r4)
            if (r4 == 0) goto L_0x003b
            pwc r5 = r3.f
            int r5 = r5.b()
            goto L_0x004d
        L_0x003b:
            r4 = 0
            if (r5 != 0) goto L_0x0040
        L_0x003e:
            r5 = r4
            goto L_0x004d
        L_0x0040:
            java.util.Map r3 = r3.g
            java.lang.Object r5 = r3.get(r5)
            o46 r5 = (defpackage.o46) r5
            if (r5 != 0) goto L_0x004b
            goto L_0x003e
        L_0x004b:
            int r5 = r5.b
        L_0x004d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r2, r5}
            java.lang.String r6 = "%d %s %d"
            java.lang.String r5 = java.lang.String.format(r1, r6, r5)
            r0.l(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.mediabar.ActLocalMedias.t0(int):void");
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [ru.ok.messages.media.mediabar.MediaBarPreviewLayout, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v8, types: [ru.ok.messages.media.mediabar.MediaBarPreviewLayout, android.view.View] */
    public final void u0(boolean z) {
        tg c = ((k93) this.O0.b).c();
        mif mif = this.h1;
        boolean z2 = this.e1;
        Toolbar toolbar = (Toolbar) mif.b;
        if (toolbar != null) {
            if (z2) {
                c.j(toolbar);
            } else {
                c.g(toolbar);
            }
        }
        if (this.e1) {
            ze9 ze9 = (ze9) ((ge9) this.m1.b);
            zbf a = eaf.a((View) ze9.c);
            ve9 ve9 = new ve9(ze9, 1);
            WeakReference weakReference = a.a;
            View view = (View) weakReference.get();
            if (view != null) {
                view.animate().withStartAction(ve9);
            }
            a.a(1.0f);
            ve9 ve92 = new ve9(ze9, 0);
            View view2 = (View) weakReference.get();
            if (view2 != null) {
                view2.animate().withEndAction(ve92);
            }
            a.c(ze9.o.a.b());
            View view3 = (View) weakReference.get();
            if (view3 != null) {
                view3.animate().start();
            }
        } else {
            ze9 ze92 = (ze9) ((ge9) this.m1.b);
            ze92.B((View) ze92.c, false);
        }
        if (this.c1.a) {
            if (this.e1) {
                c.j(this.j1);
            } else {
                c.g(this.j1);
            }
        }
        o88 o88 = this.d1;
        if (o88 != null) {
            for (WeakReference weakReference2 : o88.D0.values()) {
                FrgLocalMedia frgLocalMedia = (FrgLocalMedia) weakReference2.get();
                if (frgLocalMedia != null) {
                    frgLocalMedia.u1();
                }
            }
        }
    }
}

package one.me.android;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.main.MainScreen;
import ru.ok.tamtam.logout.a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lone/me/android/MainActivity;", "Lr5;", "Lefc;", "Ln8;", "<init>", "()V", "smc", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
public final class MainActivity extends r5 implements efc, n8 {
    public static final /* synthetic */ int e1 = 0;
    public sgc Y0;
    public final boolean Z0 = true;
    public w71 a1;
    public final fu4 b1;
    public final xr7 c1;
    public g37 d1;

    public MainActivity() {
        o2a o2a = o2a.a;
        this.b1 = (fu4) o2a.getAccessor().c(fu4.class);
        xr7 xr7 = (xr7) o2a.getAccessor().c(xr7.class);
        this.c1 = xr7;
        xr7.getClass();
        oma oma = oma.X;
        xr7.e.k(oma, new nma(oma, SystemClock.elapsedRealtime()));
        xr7.h = true;
    }

    public final String Z() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [one.me.android.MainActivity, android.content.Context, android.app.Activity] */
    public final void c0(int i, int i2, Intent intent) {
        if (i == 102 && i2 != 0) {
            ((noa) o2a.a.getAccessor().c(noa.class)).c();
            a06.F(this, new fca(new vba(phc.n), d8.u(this, ysb.oneme_contact_saved_snackbar_title), (String) null, new pba(0, 0, 7)));
        }
    }

    public final void d0() {
    }

    public final sgc g() {
        sgc sgc = this.Y0;
        if (sgc != null) {
            return sgc;
        }
        return null;
    }

    public final boolean h() {
        return this.Z0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: android.content.Context} */
    /* JADX WARNING: type inference failed for: r1v1, types: [xhd, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i0() {
        /*
            r8 = this;
            o2a r0 = defpackage.o2a.a
            w4 r0 = r0.getAccessor()
            java.lang.Class<xt6> r1 = defpackage.xt6.class
            java.lang.Object r0 = r0.c(r1)
            xt6 r0 = (defpackage.xt6) r0
            r0.getClass()
            wt6 r0 = defpackage.xt6.b
            if (r0 == 0) goto L_0x00d5
            xhd r1 = new xhd
            r1.<init>()
            r0.a = r8
            r0.d = r1
            android.content.Context r1 = r8.getApplicationContext()
            if (r1 == 0) goto L_0x0025
            r8 = r1
        L_0x0025:
            d4b r1 = new d4b
            g4g r2 = new g4g
            r2.<init>(r8)
            r1.<init>((defpackage.g4g) r2)
            r0.b = r1
            java.lang.Object r8 = r1.b
            g4g r8 = (defpackage.g4g) r8
            java.lang.String r1 = r8.b
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            mj4 r2 = defpackage.g4g.c
            java.lang.String r3 = "requestInAppReview (%s)"
            r2.b(r3, r1)
            f6g r1 = r8.a
            if (r1 != 0) goto L_0x00b2
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r1 = 6
            java.lang.String r3 = "PlayCore"
            boolean r1 = android.util.Log.isLoggable(r3, r1)
            if (r1 == 0) goto L_0x0059
            java.lang.String r1 = r2.a
            java.lang.String r2 = "Play Store app is either not installed or not the official version"
            defpackage.mj4.d(r1, r2, r8)
        L_0x0059:
            com.google.android.play.core.review.ReviewException r8 = new com.google.android.play.core.review.ReviewException
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            java.util.Locale r2 = java.util.Locale.getDefault()
            r3 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r5 = defpackage.u0g.a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r7 = r5.containsKey(r6)
            if (r7 != 0) goto L_0x0075
            java.lang.String r5 = ""
            goto L_0x009c
        L_0x0075:
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            java.util.HashMap r7 = defpackage.u0g.b
            java.lang.Object r6 = r7.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#"
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = ")"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
        L_0x009c:
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            java.lang.String r5 = "Review Error(%d): %s"
            java.lang.String r2 = java.lang.String.format(r2, r5, r4)
            r4 = 0
            r1.<init>(r3, r2, r4, r4)
            r8.<init>(r1)
            n6g r8 = defpackage.gwf.n(r8)
            goto L_0x00ca
        L_0x00b2:
            vde r2 = new vde
            r2.<init>()
            n3g r3 = new n3g
            r3.<init>(r8, r2, r2)
            a5g r8 = new a5g
            r8.<init>(r1, r2, r2, r3)
            android.os.Handler r1 = r1.a()
            r1.post(r8)
            n6g r8 = r2.a
        L_0x00ca:
            if (r8 == 0) goto L_0x00d5
            vt6 r1 = new vt6
            r2 = 0
            r1.<init>(r0, r2)
            r8.i(r1)
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.android.MainActivity.i0():void");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [one.me.android.MainActivity, android.content.Context, e83, r5, nc7, java.lang.Object, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        String name = MainActivity.class.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            Uri data = getIntent().getData();
            fn6.d(tn7, name, "@deep_link: onCreate: intent.data = " + data, (Throwable) null);
        }
        this.c1.d(getIntent());
        az1 b = x87.b(this);
        b.setId(nob.root);
        urd.B(new pf0((Object) this, (Continuation) null, 8), b);
        getWindow().setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        setContentView(b);
        lr4.a(this);
        MainActivity.super.onCreate(bundle);
        sgc c = bm3.c(this, b, bundle);
        c.e = 1;
        c.Q(false);
        this.Y0 = c;
        RootController t = a06.t(this);
        o2a o2a = o2a.a;
        o2a.o().g(new nya(this, 11, t));
        a06.G(this, (Intent) null);
        y0f y0f = y0f.a;
        y0f.b().getClass();
        y0f.b().getClass();
        w71 w71 = (w71) o2a.getAccessor().c(w71.class);
        E().a(this, w71.C0);
        udd.p("PipAppController", "CallIndicatorAppController attached", new Object[0]);
        w71.Z = this;
        w71.c().a((s71) w71.B0.getValue());
        w71.g(true);
        ((ep1) w71.a).d((r71) w71.A0.getValue());
        w71.o.d(w71);
        this.a1 = w71;
        ez3.N(new ck5(((uo7) o2a.getAccessor().c(uo7.class)).stream(), new pr7(this, (Continuation) null), 5), xs7.A(this));
        ez3.N(new ck5(wx3.e(((a) o2a.getAccessor().c(a.class)).c(xs7.A(this)), this.a, ob7.o), new qr7(this, (Continuation) null), 5), xs7.A(this));
        ez3.N(new ck5(this.b1.a(), new rr7(this, (Continuation) null), 5), xs7.A(this));
        setIntent((Intent) null);
        ik5 ik5 = new ik5(ez3.H(new ik5(new v11(am7.c(o2a.n().a.t()), new ik5(rf9.d, 2), new z9(3, (Continuation) null, 19), 4), 2), new nr7(this, (Continuation) null)), 18);
        MainScreen.Z.getClass();
        this.d1 = ez3.N(new ck5(new ik5(wx3.e(new v11(ik5, MainScreen.x0, new ah1(3, (Continuation) null, 2), 4), this.a, ob7.X), 2), new or7(this, (Continuation) null), 5), xs7.A(this));
    }

    public final void onDestroy() {
        MainActivity.super.onDestroy();
        w71 w71 = this.a1;
        if (w71 != null) {
            udd.p("PipAppController", "CallIndicatorAppController dettached", new Object[0]);
            w71.Z = null;
            w71.c().K((s71) w71.B0.getValue());
            ((ep1) w71.a).G.remove((r71) w71.A0.getValue());
            w71.o.c(w71);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        a61 a61 = (a61) ((w71) o2a.a.getAccessor().c(w71.class)).X.getValue();
        boolean r = ((ep1) ((so1) a61.a.getValue())).r();
        boolean z = keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25);
        if (!z || !r) {
            udd.p("HandleSilenceMode", "skip handle buttons, isIncoming=" + r + " isNeededAction=" + z, new Object[0]);
        } else {
            a61.a();
        }
        return MainActivity.super.onKeyDown(i, keyEvent);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [one.me.android.MainActivity, r5, java.lang.Object, android.app.Activity] */
    public final void onNewIntent(Intent intent) {
        String name = MainActivity.class.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            Uri data = intent.getData();
            fn6.d(tn7, name, "@deep_link: onNewIntent: intent.data = " + data, (Throwable) null);
        }
        this.c1.d(intent);
        MainActivity.super.onNewIntent(intent);
        a06.h(a06.t(this));
        o2a.a.o().g(new nya(this, 10, intent));
        a06.G(this, intent);
        setIntent((Intent) null);
    }

    public final void onPause() {
        MainActivity.super.onPause();
        kc9 kc9 = ty6.a;
        Object[] objArr = kc9.b;
        long[] jArr = kc9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((rrd) objArr[(i << 3) + i3]).g = true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [one.me.android.MainActivity, e83] */
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        w71 w71;
        Activity activity;
        MainActivity.super.onPictureInPictureModeChanged(z, configuration);
        if (!z && (w71 = this.a1) != null && (activity = w71.Z) != null) {
            udd.p("PipAppController", "hide global pip", new Object[0]);
            w71.i(false);
            sgc c = w71.c();
            vgc vgc = (vgc) o23.f0(c.e());
            if (!hhd.f(vgc != null ? vgc.b : null, ":call-pip")) {
                udd.p("PipAppController", "last screen wasn't pip, skip navigation to call.", new Object[0]);
            } else if (((ep1) w71.a).q() && !wp1.a(c)) {
                udd.p("PipAppController", "open active call after pip mode.", new Object[0]);
                sr7.c.P1().b(":call-active", (Bundle) null);
            }
            rr3 g = c.g(":call-pip");
            if (g != null) {
                c.B(g);
                if (!c.n()) {
                    activity.finish();
                }
            }
        }
    }

    public final void onResume() {
        tt6 i;
        MainActivity.super.onResume();
        o2a o2a = o2a.a;
        ((xt6) o2a.getAccessor().c(xt6.class)).getClass();
        wt6 wt6 = xt6.b;
        if (!(wt6 == null || (i = o2a.i()) == null)) {
            i.k = wt6.e;
        }
        ty6.a();
    }

    public final void onStart() {
        MainActivity.super.onStart();
        i0();
    }

    public final void onStop() {
        tt6 i;
        MainActivity.super.onStop();
        o2a o2a = o2a.a;
        ((xt6) o2a.getAccessor().c(xt6.class)).getClass();
        if (xt6.b != null && (i = o2a.i()) != null) {
            i.k = null;
        }
    }

    public final void onUserLeaveHint() {
        MainActivity.super.onUserLeaveHint();
        w71 w71 = this.a1;
        if (w71 != null) {
            w71.h();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [one.me.android.MainActivity, android.app.Activity] */
    public final void onWindowFocusChanged(boolean z) {
        MainActivity.super.onWindowFocusChanged(z);
        if (z) {
            ty6.a();
        }
    }
}

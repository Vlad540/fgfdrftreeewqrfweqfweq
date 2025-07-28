package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import one.me.android.MainActivity;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: r5  reason: default package */
public abstract class r5 extends im implements the {
    public v2b O0;
    public g8 P0;
    public sna Q0;
    public wce R0;
    public int S0;
    public boolean T0;
    public final HashSet U0 = new HashSet();
    public q5 V0;
    public long W0 = 0;
    public HashMap X0;

    public static void X(wce wce, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FrgBase frgBase = (a) it.next();
            if (frgBase instanceof FrgBase) {
                FrgBase frgBase2 = frgBase;
                frgBase2.v1 = wce;
                View view = frgBase2.Y0;
                if (frgBase2 instanceof ade) {
                    ((ade) frgBase2).z(wce);
                } else if (view != null) {
                    frgBase2.j1();
                }
            } else if (frgBase instanceof ade) {
                frgBase.z(wce);
            }
            X(wce, frgBase.d0().c.f());
        }
    }

    public final Object H() {
        return this.X0;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.fragment.app.b, r5, java.lang.Object, android.app.Activity] */
    public void U() {
        r5.super.U();
        udd.q("r5", "onResumeFragments: " + getLocalClassName() + "@" + hashCode());
        this.T0 = true;
        if (((zy9) ((k93) this.O0.b).getAccessor().c(zy9.class)).d()) {
            zs7 r = ((k93) this.O0.b).r();
            HashSet hashSet = this.U0;
            int i = wx3.h;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                r.c((kh0) it.next());
            }
            hashSet.clear();
        } else {
            d0();
        }
        if (this.Q0 != null) {
            this.Q0 = null;
        }
        g8 g8Var = this.P0;
        if (g8Var != null) {
            c0(g8Var.a, g8Var.b, g8Var.c);
            this.P0 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [r5, android.app.Activity] */
    public final void Y() {
        r5.super.finish();
        if (((k93) this.O0.b).n().c.s()) {
            overridePendingTransition(0, 17432577);
        }
    }

    public abstract String Z();

    public void a0() {
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e0();
        r5.super.addContentView(view, layoutParams);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [r5, android.view.ContextThemeWrapper, android.content.ContextWrapper] */
    public final void applyOverrideConfiguration(Configuration configuration) {
        if (configuration != null) {
            String q = vl.b().n().a.q();
            if (!TextUtils.isEmpty(q)) {
                Context baseContext = getBaseContext();
                int i = fja.d;
                configuration.setTo(baseContext.getResources().getConfiguration());
                Locale locale = new Locale(q);
                Locale.setDefault(locale);
                configuration.fontScale = 0.0f;
                configuration.setLocale(locale);
            }
        }
        r5.super.applyOverrideConfiguration(configuration);
    }

    public final void attachBaseContext(Context context) {
        String q = vl.b().n().a.q();
        if (!TextUtils.isEmpty(q)) {
            int i = fja.d;
            if (!r1g.p(q)) {
                Locale locale = new Locale(q);
                Locale.setDefault(locale);
                Configuration configuration = new Configuration();
                configuration.fontScale = 0.0f;
                configuration.setLocale(locale);
                configuration.setLayoutDirection(locale);
                context = context.createConfigurationContext(configuration);
            }
            r5.super.attachBaseContext(context);
            return;
        }
        r5.super.attachBaseContext(context);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [r5, android.app.Activity] */
    public final void b0(View.OnSystemUiVisibilityChangeListener onSystemUiVisibilityChangeListener) {
        View decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(onSystemUiVisibilityChangeListener);
        decorView.setSystemUiVisibility(t().c ? 3846 : 3862);
    }

    public void c0(int i, int i2, Intent intent) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [r5, android.app.Activity] */
    public void d0() {
        udd.n("r5", "onLogout " + getLocalClassName());
        setResult(0);
        finishAffinity();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [r5, nc7, zkc, java.lang.Object, android.app.Activity] */
    public final void e0() {
        xie.G(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(frb.view_tree_view_model_store_owner, this);
        ete.X(getWindow().getDecorView(), this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [r5, android.app.Activity] */
    public final void f0(int i) {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [r5, android.app.Activity] */
    public void finish() {
        r5.super.finish();
        if (!((k93) this.O0.b).n().c.s()) {
            overridePendingTransition(0, 0);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [r5, android.app.Activity] */
    public final void g0(View.OnSystemUiVisibilityChangeListener onSystemUiVisibilityChangeListener) {
        View decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(onSystemUiVisibilityChangeListener);
        decorView.setSystemUiVisibility(t().c ? 1792 : 1808);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, r5] */
    public final Resources.Theme getTheme() {
        int i;
        Resources.Theme theme = r5.super.getTheme();
        wce t = t();
        if (!(t == null || !t.c || (i = this.S0) == dic.c || i == dic.d || i == dic.e || i == dic.f || i == dic.b)) {
            theme.applyStyle(dic.a, true);
        }
        return theme;
    }

    public boolean h0() {
        return this instanceof MainActivity;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        r5.super.onActivityResult(i, i2, intent);
        if (this.T0) {
            c0(i, i2, intent);
        } else {
            this.P0 = new g8(i, i2, intent);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [r5, android.view.ContextThemeWrapper] */
    public final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        this.S0 = i;
        r5.super.onApplyThemeResource(theme, i, z);
    }

    public void onBackPressed() {
        View view;
        if (this.T0) {
            for (FrgBase frgBase : P().c.f()) {
                if (frgBase != null && frgBase.p0() && !frgBase.q0() && (view = frgBase.Y0) != null && view.getWindowToken() != null && frgBase.Y0.getVisibility() == 0 && (frgBase instanceof FrgBase) && frgBase.o1()) {
                    return;
                }
            }
            r5.super.onBackPressed();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [androidx.fragment.app.b, r5, java.lang.Object, android.app.Activity] */
    public void onCreate(Bundle bundle) {
        gtf gtf = (gtf) vl.b().getAccessor().c(gtf.class);
        gtf.getClass();
        udd.q("gtf", "enableWorkManager");
        gtf.b.d();
        a83 a83 = (a83) getLastNonConfigurationInstance();
        Object obj = a83 != null ? a83.a : null;
        if (obj == null || !(obj instanceof Map)) {
            this.X0 = new HashMap();
        } else {
            this.X0 = (HashMap) obj;
        }
        this.O0 = new v2b(vl.b());
        this.R0 = ((xce) vl.b().getAccessor().c(xce.class)).c();
        P().p.add(new p5(this));
        if (((k93) this.O0.b).n().c.g.getBoolean("app.pinLock.screenshotEnabled", true)) {
            getWindow().clearFlags(8192);
        } else {
            getWindow().addFlags(8192);
        }
        r5.super.onCreate(bundle);
        udd.q("r5", "onCreate: " + getLocalClassName() + "@" + hashCode());
        if (!((k93) this.O0.b).n().c.s()) {
            overridePendingTransition(0, 0);
        }
        if (bundle != null) {
            wx3.z(bundle, this.U0);
        }
        ((k93) this.O0.b).r().d(this);
        this.V0 = new q5(this);
        ((k93) this.O0.b).r().d(this.V0);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [r5, im, java.lang.Object, android.app.Activity] */
    public void onDestroy() {
        r5.super.onDestroy();
        try {
            ((k93) this.O0.b).r().f(this);
            ((k93) this.O0.b).r().f(this.V0);
        } catch (Exception unused) {
        }
        udd.q("r5", "onDestroy: " + getLocalClassName() + "@" + hashCode());
        if (!isChangingConfigurations()) {
            for (Object next : this.X0.values()) {
                if (next instanceof yj4) {
                    ((yj4) next).c = 0;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [androidx.fragment.app.b, r5, android.app.Activity] */
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        for (q77 q77 : P().c.f()) {
            if (q77 instanceof q77) {
                q77.B0(i, keyEvent);
            }
        }
        return r5.super.onKeyDown(i, keyEvent);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e83, r5, java.lang.Object, android.app.Activity] */
    public void onNewIntent(Intent intent) {
        udd.n("r5", "onNewIntent: intent =" + intent + " " + getLocalClassName() + "@" + hashCode());
        r5.super.onNewIntent(intent);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.fragment.app.b, r5, java.lang.Object, android.app.Activity] */
    public void onPause() {
        r5.super.onPause();
        udd.q("r5", "onPause: " + getLocalClassName() + "@" + hashCode());
        this.T0 = false;
        if (!TextUtils.isEmpty(Z())) {
            ((k93) this.O0.b).b().l(SystemClock.elapsedRealtime() - this.W0, Z());
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, androidx.fragment.app.b, r5] */
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        r5.super.onRequestPermissionsResult(i, strArr, iArr);
        urd.A(this, strArr, iArr);
        if (!this.T0) {
            this.Q0 = new sna(i, strArr, iArr);
        }
        if (Arrays.asList(strArr).contains("android.permission.READ_CONTACTS") && urd.j(this, urd.d)) {
            ((k93) this.O0.b).p().getClass();
            ((voa) ((noa) ((nqc) oae.b()).getAccessor().c(noa.class))).c();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [androidx.fragment.app.b, r5, java.lang.Object, android.app.Activity] */
    public void onResume() {
        r5.super.onResume();
        this.W0 = SystemClock.elapsedRealtime();
        udd.q("r5", "onResume: " + getLocalClassName() + "@" + hashCode());
        if (!TextUtils.isEmpty(Z())) {
            udd.q("r5", "sendScreen: onResume " + Z());
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        r5.super.onSaveInstanceState(bundle);
        HashSet hashSet = this.U0;
        int i = wx3.h;
        udd.n("wx3", "onSaveInstanceState");
        bundle.putSerializable("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS", new ArrayList(hashSet));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [r5, im, java.lang.Object, android.app.Activity] */
    public void onStart() {
        r5.super.onStart();
        udd.n("r5", "onStart: " + getLocalClassName() + "@" + hashCode());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [r5, im, java.lang.Object, android.app.Activity] */
    public void onStop() {
        r5.super.onStop();
        udd.n("r5", "onStop: " + getLocalClassName() + "@" + hashCode());
    }

    public void onUserLeaveHint() {
        for (FrgBase frgBase : P().c.f()) {
            if (frgBase instanceof FrgBase) {
                frgBase.getClass();
            }
        }
        r5.super.onUserLeaveHint();
    }

    public final void setContentView(int i) {
        e0();
        r5.super.setContentView(i);
    }

    public wce t() {
        return this.R0;
    }

    public void setContentView(View view) {
        e0();
        r5.super.setContentView(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e0();
        r5.super.setContentView(view, layoutParams);
    }
}

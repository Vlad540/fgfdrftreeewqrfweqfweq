package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.b;
import java.util.ArrayList;

/* renamed from: im  reason: default package */
public abstract class im extends b implements km {
    public dn N0;

    public im() {
        ((mm) this.o.o).f("androidx:appcompat", new gm(this));
        z(new hm(this));
    }

    public final rm V() {
        if (this.N0 == null) {
            qm qmVar = rm.a;
            this.N0 = new dn(this, (Window) null, this, this);
        }
        return this.N0;
    }

    public final void W() {
        xie.G(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(frb.view_tree_view_model_store_owner, this);
        ete.X(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(hrb.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        dn dnVar = (dn) V();
        dnVar.v();
        ((ViewGroup) dnVar.P0.findViewById(16908290)).addView(view, layoutParams);
        dnVar.B0.a(dnVar.A0.getCallback());
    }

    public void attachBaseContext(Context context) {
        dn dnVar = (dn) V();
        dnVar.d1 = true;
        int i = dnVar.h1;
        if (i == -100) {
            i = rm.b;
        }
        int B = dnVar.B(context, i);
        if (rm.b(context) && rm.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (rm.x0) {
                    try {
                        xl7 xl7 = rm.c;
                        if (xl7 == null) {
                            if (rm.o == null) {
                                rm.o = xl7.a(pa2.G(context));
                            }
                            if (!rm.o.a.a.isEmpty()) {
                                rm.c = rm.o;
                            }
                        } else if (!xl7.equals(rm.o)) {
                            xl7 xl72 = rm.c;
                            rm.o = xl72;
                            pa2.F(context, xl72.a.a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!rm.Y) {
                rm.a.execute(new nm(context, 0));
            }
        }
        xl7 n = dn.n(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(dn.s(context, B, n, (Configuration) null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof ar3) {
            try {
                ((ar3) context).a(dn.s(context, B, n, (Configuration) null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (dn.y1) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    vm.a(configuration3, configuration4, configuration);
                    int i6 = configuration3.touchscreen;
                    int i7 = configuration4.touchscreen;
                    if (i6 != i7) {
                        configuration.touchscreen = i7;
                    }
                    int i8 = configuration3.keyboard;
                    int i9 = configuration4.keyboard;
                    if (i8 != i9) {
                        configuration.keyboard = i9;
                    }
                    int i10 = configuration3.keyboardHidden;
                    int i11 = configuration4.keyboardHidden;
                    if (i10 != i11) {
                        configuration.keyboardHidden = i11;
                    }
                    int i12 = configuration3.navigation;
                    int i13 = configuration4.navigation;
                    if (i12 != i13) {
                        configuration.navigation = i13;
                    }
                    int i14 = configuration3.navigationHidden;
                    int i15 = configuration4.navigationHidden;
                    if (i14 != i15) {
                        configuration.navigationHidden = i15;
                    }
                    int i16 = configuration3.orientation;
                    int i17 = configuration4.orientation;
                    if (i16 != i17) {
                        configuration.orientation = i17;
                    }
                    int i18 = configuration3.screenLayout & 15;
                    int i19 = configuration4.screenLayout & 15;
                    if (i18 != i19) {
                        configuration.screenLayout |= i19;
                    }
                    int i20 = configuration3.screenLayout & 192;
                    int i21 = configuration4.screenLayout & 192;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 48;
                    int i23 = configuration4.screenLayout & 48;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 768;
                    int i25 = configuration4.screenLayout & 768;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.colorMode & 3;
                    int i27 = configuration4.colorMode & 3;
                    if (i26 != i27) {
                        configuration.colorMode |= i27;
                    }
                    int i28 = configuration3.colorMode & 12;
                    int i29 = configuration4.colorMode & 12;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 15;
                    int i31 = configuration4.uiMode & 15;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.uiMode & 48;
                    int i33 = configuration4.uiMode & 48;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.screenWidthDp;
                    int i35 = configuration4.screenWidthDp;
                    if (i34 != i35) {
                        configuration.screenWidthDp = i35;
                    }
                    int i36 = configuration3.screenHeightDp;
                    int i37 = configuration4.screenHeightDp;
                    if (i36 != i37) {
                        configuration.screenHeightDp = i37;
                    }
                    int i38 = configuration3.smallestScreenWidthDp;
                    int i39 = configuration4.smallestScreenWidthDp;
                    if (i38 != i39) {
                        configuration.smallestScreenWidthDp = i39;
                    }
                    int i40 = configuration3.densityDpi;
                    int i41 = configuration4.densityDpi;
                    if (i40 != i41) {
                        configuration.densityDpi = i41;
                    }
                }
            }
            Configuration s = dn.s(context, B, n, configuration, true);
            ar3 ar3 = new ar3(context, qvb.Theme_AppCompat_Empty);
            ar3.a(s);
            try {
                if (context.getTheme() != null) {
                    tbc.a(ar3.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = ar3;
        }
        super.attachBaseContext(context);
    }

    public final void closeOptionsMenu() {
        dn dnVar = (dn) V();
        dnVar.z();
        n1g n1g = dnVar.D0;
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (n1g == null || !n1g.d()) {
            super.closeOptionsMenu();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        dn dnVar = (dn) V();
        dnVar.z();
        n1g n1g = dnVar.D0;
        if (keyCode != 82 || n1g == null || !n1g.K(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final View findViewById(int i) {
        dn dnVar = (dn) V();
        dnVar.v();
        return dnVar.A0.findViewById(i);
    }

    public final MenuInflater getMenuInflater() {
        dn dnVar = (dn) V();
        if (dnVar.E0 == null) {
            dnVar.z();
            n1g n1g = dnVar.D0;
            dnVar.E0 = new a4e(n1g != null ? n1g.w() : dnVar.z0);
        }
        return dnVar.E0;
    }

    public final Resources getResources() {
        int i = r0f.a;
        return super.getResources();
    }

    public final void invalidateOptionsMenu() {
        V().a();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dn dnVar = (dn) V();
        if (dnVar.U0 && dnVar.O0) {
            dnVar.z();
            n1g n1g = dnVar.D0;
            if (n1g != null) {
                n1g.H();
            }
        }
        gn a = gn.a();
        Context context = dnVar.z0;
        synchronized (a) {
            mbc mbc = a.a;
            synchronized (mbc) {
                uq7 uq7 = (uq7) mbc.b.get(context);
                if (uq7 != null) {
                    uq7.a();
                }
            }
        }
        dnVar.g1 = new Configuration(dnVar.z0.getResources().getConfiguration());
        dnVar.l(false, false);
    }

    public final void onContentChanged() {
    }

    public void onDestroy() {
        super.onDestroy();
        V().e();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        dn dnVar = (dn) V();
        dnVar.z();
        n1g n1g = dnVar.D0;
        if (menuItem.getItemId() != 16908332 || n1g == null || (n1g.q() & 4) == 0) {
            return false;
        }
        Intent K = a24.K(this);
        if (K == null) {
            return false;
        }
        if (shouldUpRecreateTask(K)) {
            ArrayList arrayList = new ArrayList();
            Intent K2 = a24.K(this);
            if (K2 == null) {
                K2 = a24.K(this);
            }
            if (K2 != null) {
                ComponentName component = K2.getComponent();
                if (component == null) {
                    component = K2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent L = a24.L(this, component);
                    while (L != null) {
                        arrayList.add(size, L);
                        L = a24.L(this, L.getComponent());
                    }
                    arrayList.add(K2);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                startActivities(intentArr, (Bundle) null);
                try {
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(K);
            return true;
        }
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((dn) V()).v();
    }

    public final void onPostResume() {
        super.onPostResume();
        dn dnVar = (dn) V();
        dnVar.z();
        n1g n1g = dnVar.D0;
        if (n1g != null) {
            n1g.W(true);
        }
    }

    public void onStart() {
        super.onStart();
        ((dn) V()).l(true, false);
    }

    public void onStop() {
        super.onStop();
        dn dnVar = (dn) V();
        dnVar.z();
        n1g n1g = dnVar.D0;
        if (n1g != null) {
            n1g.W(false);
        }
    }

    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        V().k(charSequence);
    }

    public final void openOptionsMenu() {
        dn dnVar = (dn) V();
        dnVar.z();
        n1g n1g = dnVar.D0;
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (n1g == null || !n1g.L()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        W();
        V().h(i);
    }

    public final void setTheme(int i) {
        super.setTheme(i);
        ((dn) V()).i1 = i;
    }

    public void setContentView(View view) {
        W();
        V().i(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        V().j(view, layoutParams);
    }
}

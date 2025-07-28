package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* renamed from: dn  reason: default package */
public final class dn extends rm implements nl8, LayoutInflater.Factory2 {
    public static final kgd w1 = new kgd(0);
    public static final int[] x1 = {16842836};
    public static final boolean y1 = (!"robolectric".equals(Build.FINGERPRINT));
    public Window A0;
    public ym B0;
    public final km C0;
    public n1g D0;
    public a4e E0;
    public CharSequence F0;
    public s24 G0;
    public u5g H0;
    public nfc I0;
    public n7 J0;
    public ActionBarContextView K0;
    public PopupWindow L0;
    public sm M0;
    public zbf N0 = null;
    public boolean O0;
    public ViewGroup P0;
    public TextView Q0;
    public View R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;
    public cn[] a1;
    public cn b1;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public Configuration g1;
    public final int h1 = -100;
    public int i1;
    public int j1;
    public boolean k1;
    public zm l1;
    public zm m1;
    public boolean n1;
    public int o1;
    public final sm p1 = new sm(this, 0);
    public boolean q1;
    public Rect r1;
    public Rect s1;
    public to t1;
    public OnBackInvokedDispatcher u1;
    public OnBackInvokedCallback v1;
    public final Object y0;
    public final Context z0;

    public dn(Context context, Window window, km kmVar, Object obj) {
        im imVar = null;
        this.z0 = context;
        this.C0 = kmVar;
        this.y0 = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof im)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        imVar = (im) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (imVar != null) {
                this.h1 = ((dn) imVar.V()).h1;
            }
        }
        if (this.h1 == -100) {
            kgd kgd = w1;
            Integer num = (Integer) kgd.get(this.y0.getClass().getName());
            if (num != null) {
                this.h1 = num.intValue();
                kgd.remove(this.y0.getClass().getName());
            }
        }
        if (window != null) {
            m(window);
        }
        gn.d();
    }

    public static xl7 n(Context context) {
        xl7 xl7;
        xl7 xl72;
        if (Build.VERSION.SDK_INT >= 33 || (xl7 = rm.c) == null) {
            return null;
        }
        xl7 b = vm.b(context.getApplicationContext().getResources().getConfiguration());
        yl7 yl7 = xl7.a;
        if (yl7.a.isEmpty()) {
            xl72 = xl7.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                if (i >= b.a.a.size() + yl7.a.size()) {
                    break;
                }
                Locale locale = i < yl7.a.size() ? yl7.a.get(i) : b.a.a.get(i - yl7.a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            xl72 = new xl7(new yl7(wl7.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return xl72.a.a.isEmpty() ? b : xl72;
    }

    public static Configuration s(Context context, int i, xl7 xl7, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        if (xl7 != null) {
            vm.d(configuration2, xl7);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.o1 = (1 << i) | this.o1;
        if (!this.n1) {
            View decorView = this.A0.getDecorView();
            WeakHashMap weakHashMap = eaf.a;
            decorView.postOnAnimation(this.p1);
            this.n1 = true;
        }
    }

    public final int B(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        if (this.m1 == null) {
                            this.m1 = new zm(this, context);
                        }
                        return this.m1.D();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return x(context).D();
            }
        }
        return i;
    }

    public final boolean C() {
        boolean z = this.c1;
        this.c1 = false;
        cn y = y(0);
        if (y.m) {
            if (!z) {
                q(y, true);
            }
            return true;
        }
        n7 n7Var = this.J0;
        if (n7Var != null) {
            n7Var.a();
            return true;
        }
        z();
        n1g n1g = this.D0;
        return n1g != null && n1g.e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0153, code lost:
        if (r3 != null) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0173, code lost:
        if (r3.Z.getCount() > 0) goto L_0x0175;
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(defpackage.cn r18, android.view.KeyEvent r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1.m
            if (r2 != 0) goto L_0x01d7
            boolean r2 = r0.f1
            if (r2 == 0) goto L_0x000e
            goto L_0x01d7
        L_0x000e:
            int r2 = r1.a
            android.content.Context r3 = r0.z0
            if (r2 != 0) goto L_0x0024
            android.content.res.Resources r4 = r3.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.screenLayout
            r4 = r4 & 15
            r5 = 4
            if (r4 != r5) goto L_0x0024
            return
        L_0x0024:
            android.view.Window r4 = r0.A0
            android.view.Window$Callback r4 = r4.getCallback()
            r5 = 1
            if (r4 == 0) goto L_0x0039
            pl8 r6 = r1.h
            boolean r4 = r4.onMenuOpened(r2, r6)
            if (r4 != 0) goto L_0x0039
            r0.q(r1, r5)
            return
        L_0x0039:
            java.lang.String r4 = "window"
            java.lang.Object r4 = r3.getSystemService(r4)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 != 0) goto L_0x0044
            return
        L_0x0044:
            boolean r6 = r17.F(r18, r19)
            if (r6 != 0) goto L_0x004b
            return
        L_0x004b:
            bn r6 = r1.e
            r7 = 0
            r8 = -2
            if (r6 == 0) goto L_0x0068
            boolean r9 = r1.n
            if (r9 == 0) goto L_0x0056
            goto L_0x0068
        L_0x0056:
            android.view.View r3 = r1.g
            if (r3 == 0) goto L_0x01ae
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 == 0) goto L_0x01ae
            int r3 = r3.width
            r6 = -1
            if (r3 != r6) goto L_0x01ae
            r10 = r6
            goto L_0x01af
        L_0x0068:
            if (r6 != 0) goto L_0x00e2
            r17.z()
            n1g r6 = r0.D0
            if (r6 == 0) goto L_0x0076
            android.content.Context r6 = r6.w()
            goto L_0x0077
        L_0x0076:
            r6 = 0
        L_0x0077:
            if (r6 != 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r3 = r6
        L_0x007b:
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources r9 = r3.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            android.content.res.Resources$Theme r10 = r3.getTheme()
            r9.setTo(r10)
            int r10 = defpackage.ylb.actionBarPopupTheme
            r9.resolveAttribute(r10, r6, r5)
            int r10 = r6.resourceId
            if (r10 == 0) goto L_0x009b
            r9.applyStyle(r10, r5)
        L_0x009b:
            int r10 = defpackage.ylb.panelMenuListTheme
            r9.resolveAttribute(r10, r6, r5)
            int r6 = r6.resourceId
            if (r6 == 0) goto L_0x00a8
            r9.applyStyle(r6, r5)
            goto L_0x00ad
        L_0x00a8:
            int r6 = defpackage.qvb.Theme_AppCompat_CompactMenu
            r9.applyStyle(r6, r5)
        L_0x00ad:
            ar3 r6 = new ar3
            r6.<init>(r3, r7)
            android.content.res.Resources$Theme r3 = r6.getTheme()
            r3.setTo(r9)
            r1.j = r6
            int[] r3 = defpackage.nwb.AppCompatTheme
            android.content.res.TypedArray r3 = r6.obtainStyledAttributes(r3)
            int r6 = defpackage.nwb.AppCompatTheme_panelBackground
            int r6 = r3.getResourceId(r6, r7)
            r1.b = r6
            int r6 = defpackage.nwb.AppCompatTheme_android_windowAnimationStyle
            int r6 = r3.getResourceId(r6, r7)
            r1.d = r6
            r3.recycle()
            bn r3 = new bn
            ar3 r6 = r1.j
            r3.<init>(r0, r6)
            r1.e = r3
            r3 = 81
            r1.c = r3
            goto L_0x00f1
        L_0x00e2:
            boolean r3 = r1.n
            if (r3 == 0) goto L_0x00f1
            int r3 = r6.getChildCount()
            if (r3 <= 0) goto L_0x00f1
            bn r3 = r1.e
            r3.removeAllViews()
        L_0x00f1:
            android.view.View r3 = r1.g
            if (r3 == 0) goto L_0x00f8
            r1.f = r3
            goto L_0x0155
        L_0x00f8:
            pl8 r3 = r1.h
            if (r3 != 0) goto L_0x00fe
            goto L_0x01d5
        L_0x00fe:
            nfc r3 = r0.I0
            if (r3 != 0) goto L_0x010a
            nfc r3 = new nfc
            r6 = 3
            r3.<init>((int) r6, (java.lang.Object) r0)
            r0.I0 = r3
        L_0x010a:
            nfc r3 = r0.I0
            rg7 r6 = r1.i
            if (r6 != 0) goto L_0x0124
            rg7 r6 = new rg7
            ar3 r9 = r1.j
            int r10 = defpackage.asb.abc_list_menu_item_layout
            r6.<init>(r9, r10)
            r1.i = r6
            r6.Y = r3
            pl8 r3 = r1.h
            android.content.Context r9 = r3.a
            r3.b(r6, r9)
        L_0x0124:
            rg7 r3 = r1.i
            bn r6 = r1.e
            androidx.appcompat.view.menu.ExpandedMenuView r9 = r3.o
            if (r9 != 0) goto L_0x014f
            android.view.LayoutInflater r9 = r3.b
            int r10 = defpackage.asb.abc_expanded_menu_layout
            android.view.View r6 = r9.inflate(r10, r6, r7)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = (androidx.appcompat.view.menu.ExpandedMenuView) r6
            r3.o = r6
            qg7 r6 = r3.Z
            if (r6 != 0) goto L_0x0143
            qg7 r6 = new qg7
            r6.<init>(r3)
            r3.Z = r6
        L_0x0143:
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r3.o
            qg7 r9 = r3.Z
            r6.setAdapter(r9)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r3.o
            r6.setOnItemClickListener(r3)
        L_0x014f:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r3.o
            r1.f = r3
            if (r3 == 0) goto L_0x01d5
        L_0x0155:
            android.view.View r3 = r1.f
            if (r3 != 0) goto L_0x015b
            goto L_0x01d5
        L_0x015b:
            android.view.View r3 = r1.g
            if (r3 == 0) goto L_0x0160
            goto L_0x0175
        L_0x0160:
            rg7 r3 = r1.i
            qg7 r6 = r3.Z
            if (r6 != 0) goto L_0x016d
            qg7 r6 = new qg7
            r6.<init>(r3)
            r3.Z = r6
        L_0x016d:
            qg7 r3 = r3.Z
            int r3 = r3.getCount()
            if (r3 <= 0) goto L_0x01d5
        L_0x0175:
            android.view.View r3 = r1.f
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 != 0) goto L_0x0182
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r8, r8)
        L_0x0182:
            int r6 = r1.b
            bn r9 = r1.e
            r9.setBackgroundResource(r6)
            android.view.View r6 = r1.f
            android.view.ViewParent r6 = r6.getParent()
            boolean r9 = r6 instanceof android.view.ViewGroup
            if (r9 == 0) goto L_0x019a
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r9 = r1.f
            r6.removeView(r9)
        L_0x019a:
            bn r6 = r1.e
            android.view.View r9 = r1.f
            r6.addView(r9, r3)
            android.view.View r3 = r1.f
            boolean r3 = r3.hasFocus()
            if (r3 != 0) goto L_0x01ae
            android.view.View r3 = r1.f
            r3.requestFocus()
        L_0x01ae:
            r10 = r8
        L_0x01af:
            r1.l = r7
            android.view.WindowManager$LayoutParams r3 = new android.view.WindowManager$LayoutParams
            r13 = 0
            r14 = 1002(0x3ea, float:1.404E-42)
            r11 = -2
            r12 = 0
            r15 = 8519680(0x820000, float:1.1938615E-38)
            r16 = -3
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            int r6 = r1.c
            r3.gravity = r6
            int r6 = r1.d
            r3.windowAnimations = r6
            bn r6 = r1.e
            r4.addView(r6, r3)
            r1.m = r5
            if (r2 != 0) goto L_0x01d4
            r17.H()
        L_0x01d4:
            return
        L_0x01d5:
            r1.n = r5
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.D(cn, android.view.KeyEvent):void");
    }

    public final boolean E(cn cnVar, int i, KeyEvent keyEvent) {
        pl8 pl8;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((cnVar.k || F(cnVar, keyEvent)) && (pl8 = cnVar.h) != null) {
            return pl8.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(cn cnVar, KeyEvent keyEvent) {
        s24 s24;
        s24 s242;
        s24 s243;
        Resources.Theme theme;
        s24 s244;
        if (this.f1) {
            return false;
        }
        if (cnVar.k) {
            return true;
        }
        cn cnVar2 = this.b1;
        if (!(cnVar2 == null || cnVar2 == cnVar)) {
            q(cnVar2, false);
        }
        Window.Callback callback = this.A0.getCallback();
        int i = cnVar.a;
        if (callback != null) {
            cnVar.g = callback.onCreatePanelView(i);
        }
        boolean z = i == 0 || i == 108;
        if (z && (s244 = this.G0) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) s244;
            actionBarOverlayLayout.e();
            ((cme) actionBarOverlayLayout.w0).l = true;
        }
        if (cnVar.g == null && (!z || !(this.D0 instanceof wle))) {
            pl8 pl8 = cnVar.h;
            if (pl8 == null || cnVar.o) {
                if (pl8 == null) {
                    Context context = this.z0;
                    if ((i == 0 || i == 108) && this.G0 != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(ylb.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(ylb.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(ylb.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            ar3 ar3 = new ar3(context, 0);
                            ar3.getTheme().setTo(theme);
                            context = ar3;
                        }
                    }
                    pl8 pl82 = new pl8(context);
                    pl82.X = this;
                    pl8 pl83 = cnVar.h;
                    if (pl82 != pl83) {
                        if (pl83 != null) {
                            pl83.r(cnVar.i);
                        }
                        cnVar.h = pl82;
                        rg7 rg7 = cnVar.i;
                        if (rg7 != null) {
                            pl82.b(rg7, pl82.a);
                        }
                    }
                    if (cnVar.h == null) {
                        return false;
                    }
                }
                if (z && (s243 = this.G0) != null) {
                    if (this.H0 == null) {
                        this.H0 = new u5g(2, (Object) this);
                    }
                    ((ActionBarOverlayLayout) s243).f(cnVar.h, this.H0);
                }
                cnVar.h.w();
                if (!callback.onCreatePanelMenu(i, cnVar.h)) {
                    pl8 pl84 = cnVar.h;
                    if (pl84 != null) {
                        if (pl84 != null) {
                            pl84.r(cnVar.i);
                        }
                        cnVar.h = null;
                    }
                    if (z && (s242 = this.G0) != null) {
                        ((ActionBarOverlayLayout) s242).f((Menu) null, this.H0);
                    }
                    return false;
                }
                cnVar.o = false;
            }
            cnVar.h.w();
            Bundle bundle = cnVar.p;
            if (bundle != null) {
                cnVar.h.s(bundle);
                cnVar.p = null;
            }
            if (!callback.onPreparePanel(0, cnVar.g, cnVar.h)) {
                if (z && (s24 = this.G0) != null) {
                    ((ActionBarOverlayLayout) s24).f((Menu) null, this.H0);
                }
                cnVar.h.v();
                return false;
            }
            cnVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            cnVar.h.v();
        }
        cnVar.k = true;
        cnVar.l = false;
        this.b1 = cnVar;
        return true;
    }

    public final void G() {
        if (this.O0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.u1 != null && (y(0).m || this.J0 != null)) {
                z = true;
            }
            if (z && this.v1 == null) {
                this.v1 = xm.b(this.u1, this);
            } else if (!z && (onBackInvokedCallback = this.v1) != null) {
                xm.c(this.u1, onBackInvokedCallback);
                this.v1 = null;
            }
        }
    }

    public final void a() {
        if (this.D0 != null) {
            z();
            if (!this.D0.z()) {
                A(0);
            }
        }
    }

    public final void c() {
        String str;
        this.d1 = true;
        l(false, true);
        w();
        Object obj = this.y0;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                str = a24.M(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                n1g n1g = this.D0;
                if (n1g == null) {
                    this.q1 = true;
                } else {
                    n1g.V(true);
                }
            }
            synchronized (rm.w0) {
                rm.f(this);
                rm.Z.add(new WeakReference(this));
            }
        }
        this.g1 = new Configuration(this.z0.getResources().getConfiguration());
        this.e1 = true;
    }

    public final boolean d(pl8 pl8, MenuItem menuItem) {
        cn cnVar;
        Window.Callback callback = this.A0.getCallback();
        if (callback != null && !this.f1) {
            pl8 k = pl8.k();
            cn[] cnVarArr = this.a1;
            int length = cnVarArr != null ? cnVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    cnVar = cnVarArr[i];
                    if (cnVar != null && cnVar.h == k) {
                        break;
                    }
                    i++;
                } else {
                    cnVar = null;
                    break;
                }
            }
            if (cnVar != null) {
                return callback.onMenuItemSelected(cnVar.a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.y0
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = defpackage.rm.w0
            monitor-enter(r0)
            defpackage.rm.f(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r3
        L_0x0011:
            boolean r0 = r3.n1
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.A0
            android.view.View r0 = r0.getDecorView()
            sm r1 = r3.p1
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 1
            r3.f1 = r0
            int r0 = r3.h1
            r1 = -100
            if (r0 == r1) goto L_0x004d
            java.lang.Object r0 = r3.y0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x004d
            kgd r0 = w1
            java.lang.Object r1 = r3.y0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.h1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005c
        L_0x004d:
            kgd r0 = w1
            java.lang.Object r1 = r3.y0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005c:
            n1g r0 = r3.D0
            if (r0 == 0) goto L_0x0063
            r0.I()
        L_0x0063:
            zm r0 = r3.l1
            if (r0 == 0) goto L_0x006a
            r0.y()
        L_0x006a:
            zm r3 = r3.m1
            if (r3 == 0) goto L_0x0071
            r3.y()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.e():void");
    }

    public final boolean g(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.Y0 && i == 108) {
            return false;
        }
        if (this.U0 && i == 1) {
            this.U0 = false;
        }
        if (i == 1) {
            G();
            this.Y0 = true;
            return true;
        } else if (i == 2) {
            G();
            this.S0 = true;
            return true;
        } else if (i == 5) {
            G();
            this.T0 = true;
            return true;
        } else if (i == 10) {
            G();
            this.W0 = true;
            return true;
        } else if (i == 108) {
            G();
            this.U0 = true;
            return true;
        } else if (i != 109) {
            return this.A0.requestFeature(i);
        } else {
            G();
            this.V0 = true;
            return true;
        }
    }

    public final void h(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.P0.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.z0).inflate(i, viewGroup);
        this.B0.a(this.A0.getCallback());
    }

    public final void i(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.P0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.B0.a(this.A0.getCallback());
    }

    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.P0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.B0.a(this.A0.getCallback());
    }

    public final void k(CharSequence charSequence) {
        this.F0 = charSequence;
        s24 s24 = this.G0;
        if (s24 != null) {
            s24.setWindowTitle(charSequence);
            return;
        }
        n1g n1g = this.D0;
        if (n1g != null) {
            n1g.X(charSequence);
            return;
        }
        TextView textView = this.Q0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x016f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(boolean r13, boolean r14) {
        /*
            r12 = this;
            boolean r0 = r12.f1
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r12.h1
            r2 = -100
            if (r0 == r2) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            int r0 = defpackage.rm.b
        L_0x000f:
            android.content.Context r2 = r12.z0
            int r3 = r12.B(r2, r0)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            r6 = 0
            if (r4 >= r5) goto L_0x0021
            xl7 r4 = n(r2)
            goto L_0x0022
        L_0x0021:
            r4 = r6
        L_0x0022:
            if (r14 != 0) goto L_0x0032
            if (r4 == 0) goto L_0x0032
            android.content.res.Resources r14 = r2.getResources()
            android.content.res.Configuration r14 = r14.getConfiguration()
            xl7 r4 = defpackage.vm.b(r14)
        L_0x0032:
            android.content.res.Configuration r14 = s(r2, r3, r4, r6, r1)
            boolean r3 = r12.k1
            r5 = 1
            java.lang.Object r7 = r12.y0
            if (r3 != 0) goto L_0x0061
            boolean r3 = r7 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0061
            android.content.pm.PackageManager r3 = r2.getPackageManager()
            if (r3 != 0) goto L_0x0049
            r3 = r1
            goto L_0x0065
        L_0x0049:
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x005f }
            java.lang.Class r9 = r7.getClass()     // Catch:{ NameNotFoundException -> 0x005f }
            r8.<init>(r2, r9)     // Catch:{ NameNotFoundException -> 0x005f }
            r9 = 269221888(0x100c0000, float:2.7610132E-29)
            android.content.pm.ActivityInfo r3 = r3.getActivityInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x005f }
            if (r3 == 0) goto L_0x0061
            int r3 = r3.configChanges     // Catch:{ NameNotFoundException -> 0x005f }
            r12.j1 = r3     // Catch:{ NameNotFoundException -> 0x005f }
            goto L_0x0061
        L_0x005f:
            r12.j1 = r1
        L_0x0061:
            r12.k1 = r5
            int r3 = r12.j1
        L_0x0065:
            android.content.res.Configuration r8 = r12.g1
            if (r8 != 0) goto L_0x0071
            android.content.res.Resources r8 = r2.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
        L_0x0071:
            int r9 = r8.uiMode
            r9 = r9 & 48
            int r10 = r14.uiMode
            r10 = r10 & 48
            xl7 r8 = defpackage.vm.b(r8)
            if (r4 != 0) goto L_0x0081
            r4 = r6
            goto L_0x0085
        L_0x0081:
            xl7 r4 = defpackage.vm.b(r14)
        L_0x0085:
            if (r9 == r10) goto L_0x008a
            r9 = 512(0x200, float:7.175E-43)
            goto L_0x008b
        L_0x008a:
            r9 = r1
        L_0x008b:
            if (r4 == 0) goto L_0x0095
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x0095
            r9 = r9 | 8196(0x2004, float:1.1485E-41)
        L_0x0095:
            int r8 = ~r3
            r8 = r8 & r9
            if (r8 == 0) goto L_0x00d2
            if (r13 == 0) goto L_0x00d2
            boolean r13 = r12.d1
            if (r13 == 0) goto L_0x00d2
            boolean r13 = y1
            if (r13 != 0) goto L_0x00a7
            boolean r13 = r12.e1
            if (r13 == 0) goto L_0x00d2
        L_0x00a7:
            boolean r13 = r7 instanceof android.app.Activity
            if (r13 == 0) goto L_0x00d2
            r13 = r7
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r8 = r13.isChild()
            if (r8 != 0) goto L_0x00d2
            int r8 = android.os.Build.VERSION.SDK_INT
            r11 = 31
            if (r8 < r11) goto L_0x00cd
            r8 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x00cd
            android.view.Window r8 = r13.getWindow()
            android.view.View r8 = r8.getDecorView()
            int r14 = r14.getLayoutDirection()
            r8.setLayoutDirection(r14)
        L_0x00cd:
            r13.recreate()
            r13 = r5
            goto L_0x00d3
        L_0x00d2:
            r13 = r1
        L_0x00d3:
            if (r13 != 0) goto L_0x013a
            if (r9 == 0) goto L_0x013a
            r13 = r9 & r3
            if (r13 != r9) goto L_0x00dc
            r1 = r5
        L_0x00dc:
            android.content.res.Resources r13 = r2.getResources()
            android.content.res.Configuration r14 = new android.content.res.Configuration
            android.content.res.Configuration r3 = r13.getConfiguration()
            r14.<init>(r3)
            android.content.res.Configuration r3 = r13.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & -49
            r3 = r3 | r10
            r14.uiMode = r3
            if (r4 == 0) goto L_0x00f9
            defpackage.vm.d(r14, r4)
        L_0x00f9:
            r13.updateConfiguration(r14, r6)
            int r13 = r12.i1
            if (r13 == 0) goto L_0x010c
            r2.setTheme(r13)
            android.content.res.Resources$Theme r13 = r2.getTheme()
            int r3 = r12.i1
            r13.applyStyle(r3, r5)
        L_0x010c:
            if (r1 == 0) goto L_0x013b
            boolean r13 = r7 instanceof android.app.Activity
            if (r13 == 0) goto L_0x013b
            r13 = r7
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r1 = r13 instanceof defpackage.nc7
            if (r1 == 0) goto L_0x012e
            r1 = r13
            nc7 r1 = (defpackage.nc7) r1
            pc7 r1 = r1.R()
            ob7 r1 = r1.d
            ob7 r3 = defpackage.ob7.c
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L_0x013b
            r13.onConfigurationChanged(r14)
            goto L_0x013b
        L_0x012e:
            boolean r1 = r12.e1
            if (r1 == 0) goto L_0x013b
            boolean r1 = r12.f1
            if (r1 != 0) goto L_0x013b
            r13.onConfigurationChanged(r14)
            goto L_0x013b
        L_0x013a:
            r5 = r13
        L_0x013b:
            if (r5 == 0) goto L_0x0154
            boolean r13 = r7 instanceof defpackage.im
            if (r13 == 0) goto L_0x0154
            r13 = r9 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x014b
            r13 = r7
            im r13 = (defpackage.im) r13
            r13.getClass()
        L_0x014b:
            r13 = r9 & 4
            if (r13 == 0) goto L_0x0154
            im r7 = (defpackage.im) r7
            r7.getClass()
        L_0x0154:
            if (r4 == 0) goto L_0x0165
            android.content.res.Resources r13 = r2.getResources()
            android.content.res.Configuration r13 = r13.getConfiguration()
            xl7 r13 = defpackage.vm.b(r13)
            defpackage.vm.c(r13)
        L_0x0165:
            if (r0 != 0) goto L_0x016f
            ibe r13 = r12.x(r2)
            r13.d0()
            goto L_0x0176
        L_0x016f:
            zm r13 = r12.l1
            if (r13 == 0) goto L_0x0176
            r13.y()
        L_0x0176:
            r13 = 3
            if (r0 != r13) goto L_0x018a
            zm r13 = r12.m1
            if (r13 != 0) goto L_0x0184
            zm r13 = new zm
            r13.<init>((defpackage.dn) r12, (android.content.Context) r2)
            r12.m1 = r13
        L_0x0184:
            zm r12 = r12.m1
            r12.d0()
            goto L_0x0191
        L_0x018a:
            zm r12 = r12.m1
            if (r12 == 0) goto L_0x0191
            r12.y()
        L_0x0191:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.l(boolean, boolean):boolean");
    }

    public final void m(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.A0 == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof ym)) {
                ym ymVar = new ym(this, callback);
                this.B0 = ymVar;
                window.setCallback(ymVar);
                int[] iArr = x1;
                Context context = this.z0;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                    drawable = null;
                } else {
                    gn a = gn.a();
                    synchronized (a) {
                        drawable = a.a.e(resourceId, context, true);
                    }
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.A0 = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.u1) == null) {
                    if (!(onBackInvokedDispatcher == null || (onBackInvokedCallback = this.v1) == null)) {
                        xm.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.v1 = null;
                    }
                    Object obj = this.y0;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.u1 = xm.a(activity);
                            H();
                            return;
                        }
                    }
                    this.u1 = null;
                    H();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX INFO: finally extract failed */
    public final void o(int i, cn cnVar, pl8 pl8) {
        if (pl8 == null) {
            if (cnVar == null && i >= 0) {
                cn[] cnVarArr = this.a1;
                if (i < cnVarArr.length) {
                    cnVar = cnVarArr[i];
                }
            }
            if (cnVar != null) {
                pl8 = cnVar.h;
            }
        }
        if ((cnVar == null || cnVar.m) && !this.f1) {
            ym ymVar = this.B0;
            Window.Callback callback = this.A0.getCallback();
            ymVar.getClass();
            try {
                ymVar.X = true;
                callback.onPanelClosed(i, pl8);
                ymVar.X = false;
            } catch (Throwable th) {
                ymVar.X = false;
                throw th;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Class[], java.lang.Object[], java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r7 = this;
            r8 = 3
            r0 = -1
            r1 = 0
            r2 = 1
            to r3 = r7.t1
            r4 = 0
            if (r3 != 0) goto L_0x0040
            int[] r3 = defpackage.nwb.AppCompatTheme
            android.content.Context r5 = r7.z0
            android.content.res.TypedArray r3 = r5.obtainStyledAttributes(r3)
            int r6 = defpackage.nwb.AppCompatTheme_viewInflaterClass
            java.lang.String r6 = r3.getString(r6)
            r3.recycle()
            if (r6 != 0) goto L_0x0024
            to r3 = new to
            r3.<init>()
            r7.t1 = r3
            goto L_0x0040
        L_0x0024:
            java.lang.ClassLoader r3 = r5.getClassLoader()     // Catch:{ all -> 0x0039 }
            java.lang.Class r3 = r3.loadClass(r6)     // Catch:{ all -> 0x0039 }
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r4)     // Catch:{ all -> 0x0039 }
            java.lang.Object r3 = r3.newInstance(r4)     // Catch:{ all -> 0x0039 }
            to r3 = (defpackage.to) r3     // Catch:{ all -> 0x0039 }
            r7.t1 = r3     // Catch:{ all -> 0x0039 }
            goto L_0x0040
        L_0x0039:
            to r3 = new to
            r3.<init>()
            r7.t1 = r3
        L_0x0040:
            to r7 = r7.t1
            int r3 = defpackage.r0f.a
            r7.getClass()
            int[] r3 = defpackage.nwb.View
            android.content.res.TypedArray r3 = r10.obtainStyledAttributes(r11, r3, r1, r1)
            int r5 = defpackage.nwb.View_theme
            int r5 = r3.getResourceId(r5, r1)
            r3.recycle()
            if (r5 == 0) goto L_0x0069
            boolean r3 = r10 instanceof defpackage.ar3
            if (r3 == 0) goto L_0x0063
            r3 = r10
            ar3 r3 = (defpackage.ar3) r3
            int r3 = r3.a
            if (r3 == r5) goto L_0x0069
        L_0x0063:
            ar3 r3 = new ar3
            r3.<init>(r10, r5)
            goto L_0x006a
        L_0x0069:
            r3 = r10
        L_0x006a:
            r9.getClass()
            int r5 = r9.hashCode()
            switch(r5) {
                case -1946472170: goto L_0x0115;
                case -1455429095: goto L_0x0109;
                case -1346021293: goto L_0x00fd;
                case -938935918: goto L_0x00f1;
                case -937446323: goto L_0x00e6;
                case -658531749: goto L_0x00db;
                case -339785223: goto L_0x00d0;
                case 776382189: goto L_0x00c5;
                case 799298502: goto L_0x00b8;
                case 1125864064: goto L_0x00ab;
                case 1413872058: goto L_0x009e;
                case 1601505219: goto L_0x0091;
                case 1666676343: goto L_0x0084;
                case 2001146706: goto L_0x0077;
                default: goto L_0x0074;
            }
        L_0x0074:
            r5 = r0
            goto L_0x0120
        L_0x0077:
            java.lang.String r5 = "Button"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x0080
            goto L_0x0074
        L_0x0080:
            r5 = 13
            goto L_0x0120
        L_0x0084:
            java.lang.String r5 = "EditText"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x008d
            goto L_0x0074
        L_0x008d:
            r5 = 12
            goto L_0x0120
        L_0x0091:
            java.lang.String r5 = "CheckBox"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x009a
            goto L_0x0074
        L_0x009a:
            r5 = 11
            goto L_0x0120
        L_0x009e:
            java.lang.String r5 = "AutoCompleteTextView"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00a7
            goto L_0x0074
        L_0x00a7:
            r5 = 10
            goto L_0x0120
        L_0x00ab:
            java.lang.String r5 = "ImageView"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00b4
            goto L_0x0074
        L_0x00b4:
            r5 = 9
            goto L_0x0120
        L_0x00b8:
            java.lang.String r5 = "ToggleButton"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00c1
            goto L_0x0074
        L_0x00c1:
            r5 = 8
            goto L_0x0120
        L_0x00c5:
            java.lang.String r5 = "RadioButton"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00ce
            goto L_0x0074
        L_0x00ce:
            r5 = 7
            goto L_0x0120
        L_0x00d0:
            java.lang.String r5 = "Spinner"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00d9
            goto L_0x0074
        L_0x00d9:
            r5 = 6
            goto L_0x0120
        L_0x00db:
            java.lang.String r5 = "SeekBar"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00e4
            goto L_0x0074
        L_0x00e4:
            r5 = 5
            goto L_0x0120
        L_0x00e6:
            java.lang.String r5 = "ImageButton"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00ef
            goto L_0x0074
        L_0x00ef:
            r5 = 4
            goto L_0x0120
        L_0x00f1:
            java.lang.String r5 = "TextView"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00fb
            goto L_0x0074
        L_0x00fb:
            r5 = r8
            goto L_0x0120
        L_0x00fd:
            java.lang.String r5 = "MultiAutoCompleteTextView"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x0107
            goto L_0x0074
        L_0x0107:
            r5 = 2
            goto L_0x0120
        L_0x0109:
            java.lang.String r5 = "CheckedTextView"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x0113
            goto L_0x0074
        L_0x0113:
            r5 = r2
            goto L_0x0120
        L_0x0115:
            java.lang.String r5 = "RatingBar"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x011f
            goto L_0x0074
        L_0x011f:
            r5 = r1
        L_0x0120:
            switch(r5) {
                case 0: goto L_0x0170;
                case 1: goto L_0x0168;
                case 2: goto L_0x0162;
                case 3: goto L_0x015d;
                case 4: goto L_0x0157;
                case 5: goto L_0x0151;
                case 6: goto L_0x014b;
                case 7: goto L_0x0146;
                case 8: goto L_0x0140;
                case 9: goto L_0x013a;
                case 10: goto L_0x0135;
                case 11: goto L_0x0130;
                case 12: goto L_0x012a;
                case 13: goto L_0x0125;
                default: goto L_0x0123;
            }
        L_0x0123:
            r5 = r4
            goto L_0x0175
        L_0x0125:
            androidx.appcompat.widget.AppCompatButton r5 = r7.b(r3, r11)
            goto L_0x0175
        L_0x012a:
            androidx.appcompat.widget.AppCompatEditText r5 = new androidx.appcompat.widget.AppCompatEditText
            r5.<init>(r3, r11)
            goto L_0x0175
        L_0x0130:
            androidx.appcompat.widget.AppCompatCheckBox r5 = r7.c(r3, r11)
            goto L_0x0175
        L_0x0135:
            jm r5 = r7.a(r3, r11)
            goto L_0x0175
        L_0x013a:
            androidx.appcompat.widget.AppCompatImageView r5 = new androidx.appcompat.widget.AppCompatImageView
            r5.<init>(r3, r11)
            goto L_0x0175
        L_0x0140:
            ro r5 = new ro
            r5.<init>(r3, r11)
            goto L_0x0175
        L_0x0146:
            nn r5 = r7.d(r3, r11)
            goto L_0x0175
        L_0x014b:
            co r5 = new co
            r5.<init>(r3, r11)
            goto L_0x0175
        L_0x0151:
            qn r5 = new qn
            r5.<init>(r3, r11)
            goto L_0x0175
        L_0x0157:
            androidx.appcompat.widget.AppCompatImageButton r5 = new androidx.appcompat.widget.AppCompatImageButton
            r5.<init>(r3, r11)
            goto L_0x0175
        L_0x015d:
            androidx.appcompat.widget.AppCompatTextView r5 = r7.e(r3, r11)
            goto L_0x0175
        L_0x0162:
            kn r5 = new kn
            r5.<init>(r3, r11)
            goto L_0x0175
        L_0x0168:
            lm r5 = new lm
            int r6 = defpackage.ylb.checkedTextViewStyle
            r5.<init>(r3, r11, r6)
            goto L_0x0175
        L_0x0170:
            on r5 = new on
            r5.<init>(r3, r11)
        L_0x0175:
            if (r5 != 0) goto L_0x01c5
            if (r10 == r3) goto L_0x01c5
            java.lang.Object[] r10 = r7.a
            java.lang.String r5 = "view"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x0189
            java.lang.String r9 = "class"
            java.lang.String r9 = r11.getAttributeValue(r4, r9)
        L_0x0189:
            r10[r1] = r3     // Catch:{ Exception -> 0x01c0, all -> 0x01aa }
            r10[r2] = r11     // Catch:{ Exception -> 0x01c0, all -> 0x01aa }
            r5 = 46
            int r5 = r9.indexOf(r5)     // Catch:{ Exception -> 0x01c0, all -> 0x01aa }
            if (r0 != r5) goto L_0x01b1
            r0 = r1
        L_0x0196:
            java.lang.String[] r5 = defpackage.to.d     // Catch:{ Exception -> 0x01c0, all -> 0x01aa }
            if (r0 >= r8) goto L_0x01ac
            r5 = r5[r0]     // Catch:{ Exception -> 0x01c0, all -> 0x01aa }
            android.view.View r5 = r7.f(r3, r9, r5)     // Catch:{ Exception -> 0x01c0, all -> 0x01aa }
            if (r5 == 0) goto L_0x01a8
            r10[r1] = r4
            r10[r2] = r4
            r4 = r5
            goto L_0x01c4
        L_0x01a8:
            int r0 = r0 + r2
            goto L_0x0196
        L_0x01aa:
            r7 = move-exception
            goto L_0x01bb
        L_0x01ac:
            r10[r1] = r4
            r10[r2] = r4
            goto L_0x01c4
        L_0x01b1:
            android.view.View r7 = r7.f(r3, r9, r4)     // Catch:{ Exception -> 0x01c0, all -> 0x01aa }
            r10[r1] = r4
            r10[r2] = r4
            r4 = r7
            goto L_0x01c4
        L_0x01bb:
            r10[r1] = r4
            r10[r2] = r4
            throw r7
        L_0x01c0:
            r10[r1] = r4
            r10[r2] = r4
        L_0x01c4:
            r5 = r4
        L_0x01c5:
            if (r5 == 0) goto L_0x01ed
            android.content.Context r7 = r5.getContext()
            boolean r8 = r7 instanceof android.content.ContextWrapper
            if (r8 == 0) goto L_0x01ed
            boolean r8 = r5.hasOnClickListeners()
            if (r8 != 0) goto L_0x01d6
            goto L_0x01ed
        L_0x01d6:
            int[] r8 = defpackage.to.c
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r11, r8)
            java.lang.String r8 = r7.getString(r1)
            if (r8 == 0) goto L_0x01ea
            so r9 = new so
            r9.<init>(r5, r8)
            r5.setOnClickListener(r9)
        L_0x01ea:
            r7.recycle()
        L_0x01ed:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(pl8 pl8) {
        i7 i7Var;
        if (!this.Z0) {
            this.Z0 = true;
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.G0;
            actionBarOverlayLayout.e();
            ActionMenuView actionMenuView = ((cme) actionBarOverlayLayout.w0).a.a;
            if (!(actionMenuView == null || (i7Var = actionMenuView.w0) == null)) {
                i7Var.g();
                f7 f7Var = i7Var.I0;
                if (f7Var != null && f7Var.b()) {
                    f7Var.j.dismiss();
                }
            }
            Window.Callback callback = this.A0.getCallback();
            if (callback != null && !this.f1) {
                callback.onPanelClosed(108, pl8);
            }
            this.Z0 = false;
        }
    }

    public final void q(cn cnVar, boolean z) {
        bn bnVar;
        s24 s24;
        if (z && cnVar.a == 0 && (s24 = this.G0) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) s24;
            actionBarOverlayLayout.e();
            if (((cme) actionBarOverlayLayout.w0).a.p()) {
                p(cnVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.z0.getSystemService("window");
        if (!(windowManager == null || !cnVar.m || (bnVar = cnVar.e) == null)) {
            windowManager.removeView(bnVar);
            if (z) {
                o(cnVar.a, cnVar, (pl8) null);
            }
        }
        cnVar.k = false;
        cnVar.l = false;
        cnVar.m = false;
        cnVar.f = null;
        cnVar.n = true;
        if (this.b1 == cnVar) {
            this.b1 = null;
        }
        if (cnVar.a == 0) {
            H();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r6.j() != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(defpackage.pl8 r6) {
        /*
            r5 = this;
            s24 r6 = r5.G0
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x00d3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.e()
            t24 r6 = r6.w0
            cme r6 = (defpackage.cme) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto L_0x00d3
            androidx.appcompat.widget.ActionMenuView r6 = r6.a
            if (r6 == 0) goto L_0x00d3
            boolean r6 = r6.o
            if (r6 == 0) goto L_0x00d3
            android.content.Context r6 = r5.z0
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L_0x004a
            s24 r6 = r5.G0
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.e()
            t24 r6 = r6.w0
            cme r6 = (defpackage.cme) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            androidx.appcompat.widget.ActionMenuView r6 = r6.a
            if (r6 == 0) goto L_0x00d3
            i7 r6 = r6.w0
            if (r6 == 0) goto L_0x00d3
            q36 r2 = r6.J0
            if (r2 != 0) goto L_0x004a
            boolean r6 = r6.j()
            if (r6 == 0) goto L_0x00d3
        L_0x004a:
            android.view.Window r6 = r5.A0
            android.view.Window$Callback r6 = r6.getCallback()
            s24 r2 = r5.G0
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.e()
            t24 r2 = r2.w0
            cme r2 = (defpackage.cme) r2
            androidx.appcompat.widget.Toolbar r2 = r2.a
            boolean r2 = r2.p()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L_0x008c
            s24 r0 = r5.G0
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.e()
            t24 r0 = r0.w0
            cme r0 = (defpackage.cme) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.a
            if (r0 == 0) goto L_0x007e
            i7 r0 = r0.w0
            if (r0 == 0) goto L_0x007e
            boolean r0 = r0.g()
        L_0x007e:
            boolean r0 = r5.f1
            if (r0 != 0) goto L_0x00e0
            cn r5 = r5.y(r1)
            pl8 r5 = r5.h
            r6.onPanelClosed(r3, r5)
            goto L_0x00e0
        L_0x008c:
            if (r6 == 0) goto L_0x00e0
            boolean r2 = r5.f1
            if (r2 != 0) goto L_0x00e0
            boolean r2 = r5.n1
            if (r2 == 0) goto L_0x00a9
            int r2 = r5.o1
            r0 = r0 & r2
            if (r0 == 0) goto L_0x00a9
            android.view.Window r0 = r5.A0
            android.view.View r0 = r0.getDecorView()
            sm r2 = r5.p1
            r0.removeCallbacks(r2)
            r2.run()
        L_0x00a9:
            cn r0 = r5.y(r1)
            pl8 r2 = r0.h
            if (r2 == 0) goto L_0x00e0
            boolean r4 = r0.o
            if (r4 != 0) goto L_0x00e0
            android.view.View r4 = r0.g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto L_0x00e0
            pl8 r0 = r0.h
            r6.onMenuOpened(r3, r0)
            s24 r5 = r5.G0
            androidx.appcompat.widget.ActionBarOverlayLayout r5 = (androidx.appcompat.widget.ActionBarOverlayLayout) r5
            r5.e()
            t24 r5 = r5.w0
            cme r5 = (defpackage.cme) r5
            androidx.appcompat.widget.Toolbar r5 = r5.a
            r5.w()
            goto L_0x00e0
        L_0x00d3:
            cn r6 = r5.y(r1)
            r6.n = r0
            r5.q(r6, r1)
            r0 = 0
            r5.D(r6, r0)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.r(pl8):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ea, code lost:
        if (r6.g() != false) goto L_0x010b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.y0
            boolean r1 = r0 instanceof defpackage.p77
            if (r1 != 0) goto L_0x000a
            boolean r0 = r0 instanceof defpackage.fn
            if (r0 == 0) goto L_0x0014
        L_0x000a:
            android.view.Window r0 = r6.A0
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x0014
            java.util.WeakHashMap r0 = defpackage.eaf.a
        L_0x0014:
            int r0 = r7.getKeyCode()
            r1 = 1
            r2 = 0
            r3 = 82
            if (r0 != r3) goto L_0x0038
            ym r0 = r6.B0
            android.view.Window r4 = r6.A0
            android.view.Window$Callback r4 = r4.getCallback()
            r0.getClass()
            r0.o = r1     // Catch:{ all -> 0x0034 }
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch:{ all -> 0x0034 }
            r0.o = r2
            if (r4 == 0) goto L_0x0038
            return r1
        L_0x0034:
            r6 = move-exception
            r0.o = r2
            throw r6
        L_0x0038:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            r5 = 4
            if (r4 != 0) goto L_0x006a
            if (r0 == r5) goto L_0x005b
            if (r0 == r3) goto L_0x0048
            goto L_0x0067
        L_0x0048:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x012d
            cn r0 = r6.y(r2)
            boolean r2 = r0.m
            if (r2 != 0) goto L_0x012d
            r6.F(r0, r7)
            goto L_0x012d
        L_0x005b:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r1 = r2
        L_0x0065:
            r6.c1 = r1
        L_0x0067:
            r1 = r2
            goto L_0x012d
        L_0x006a:
            if (r0 == r5) goto L_0x0127
            if (r0 == r3) goto L_0x006f
            goto L_0x0067
        L_0x006f:
            n7 r0 = r6.J0
            if (r0 == 0) goto L_0x0075
            goto L_0x012d
        L_0x0075:
            cn r0 = r6.y(r2)
            s24 r3 = r6.G0
            android.content.Context r4 = r6.z0
            if (r3 == 0) goto L_0x00ed
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.e()
            t24 r3 = r3.w0
            cme r3 = (defpackage.cme) r3
            androidx.appcompat.widget.Toolbar r3 = r3.a
            int r5 = r3.getVisibility()
            if (r5 != 0) goto L_0x00ed
            androidx.appcompat.widget.ActionMenuView r3 = r3.a
            if (r3 == 0) goto L_0x00ed
            boolean r3 = r3.o
            if (r3 == 0) goto L_0x00ed
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r4)
            boolean r3 = r3.hasPermanentMenuKey()
            if (r3 != 0) goto L_0x00ed
            s24 r3 = r6.G0
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.e()
            t24 r3 = r3.w0
            cme r3 = (defpackage.cme) r3
            androidx.appcompat.widget.Toolbar r3 = r3.a
            boolean r3 = r3.p()
            if (r3 != 0) goto L_0x00d1
            boolean r3 = r6.f1
            if (r3 != 0) goto L_0x010d
            boolean r7 = r6.F(r0, r7)
            if (r7 == 0) goto L_0x010d
            s24 r6 = r6.G0
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.e()
            t24 r6 = r6.w0
            cme r6 = (defpackage.cme) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            boolean r6 = r6.w()
            goto L_0x0113
        L_0x00d1:
            s24 r6 = r6.G0
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.e()
            t24 r6 = r6.w0
            cme r6 = (defpackage.cme) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            androidx.appcompat.widget.ActionMenuView r6 = r6.a
            if (r6 == 0) goto L_0x010d
            i7 r6 = r6.w0
            if (r6 == 0) goto L_0x010d
            boolean r6 = r6.g()
            if (r6 == 0) goto L_0x010d
            goto L_0x010b
        L_0x00ed:
            boolean r3 = r0.m
            if (r3 != 0) goto L_0x010f
            boolean r5 = r0.l
            if (r5 == 0) goto L_0x00f6
            goto L_0x010f
        L_0x00f6:
            boolean r3 = r0.k
            if (r3 == 0) goto L_0x010d
            boolean r3 = r0.o
            if (r3 == 0) goto L_0x0105
            r0.k = r2
            boolean r3 = r6.F(r0, r7)
            goto L_0x0106
        L_0x0105:
            r3 = r1
        L_0x0106:
            if (r3 == 0) goto L_0x010d
            r6.D(r0, r7)
        L_0x010b:
            r6 = r1
            goto L_0x0113
        L_0x010d:
            r6 = r2
            goto L_0x0113
        L_0x010f:
            r6.q(r0, r1)
            r6 = r3
        L_0x0113:
            if (r6 == 0) goto L_0x012d
            android.content.Context r6 = r4.getApplicationContext()
            java.lang.String r7 = "audio"
            java.lang.Object r6 = r6.getSystemService(r7)
            android.media.AudioManager r6 = (android.media.AudioManager) r6
            if (r6 == 0) goto L_0x012d
            r6.playSoundEffect(r2)
            goto L_0x012d
        L_0x0127:
            boolean r6 = r6.C()
            if (r6 == 0) goto L_0x0067
        L_0x012d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.t(android.view.KeyEvent):boolean");
    }

    public final void u(int i) {
        cn y = y(i);
        if (y.h != null) {
            Bundle bundle = new Bundle();
            y.h.t(bundle);
            if (bundle.size() > 0) {
                y.p = bundle;
            }
            y.h.w();
            y.h.clear();
        }
        y.o = true;
        y.n = true;
        if ((i == 108 || i == 0) && this.G0 != null) {
            cn y2 = y(0);
            y2.k = false;
            F(y2, (KeyEvent) null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        if (!this.O0) {
            int[] iArr = nwb.AppCompatTheme;
            Context context = this.z0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(nwb.AppCompatTheme_windowActionBar)) {
                if (obtainStyledAttributes.getBoolean(nwb.AppCompatTheme_windowNoTitle, false)) {
                    g(1);
                } else if (obtainStyledAttributes.getBoolean(nwb.AppCompatTheme_windowActionBar, false)) {
                    g(108);
                }
                if (obtainStyledAttributes.getBoolean(nwb.AppCompatTheme_windowActionBarOverlay, false)) {
                    g(109);
                }
                if (obtainStyledAttributes.getBoolean(nwb.AppCompatTheme_windowActionModeOverlay, false)) {
                    g(10);
                }
                this.X0 = obtainStyledAttributes.getBoolean(nwb.AppCompatTheme_android_windowIsFloating, false);
                obtainStyledAttributes.recycle();
                w();
                this.A0.getDecorView();
                LayoutInflater from = LayoutInflater.from(context);
                if (this.Y0) {
                    viewGroup = this.W0 ? (ViewGroup) from.inflate(asb.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(asb.abc_screen_simple, (ViewGroup) null);
                } else if (this.X0) {
                    viewGroup = (ViewGroup) from.inflate(asb.abc_dialog_title_material, (ViewGroup) null);
                    this.V0 = false;
                    this.U0 = false;
                } else if (this.U0) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(ylb.actionBarTheme, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ar3(context, typedValue.resourceId) : context).inflate(asb.abc_screen_toolbar, (ViewGroup) null);
                    s24 s24 = (s24) viewGroup.findViewById(pob.decor_content_parent);
                    this.G0 = s24;
                    s24.setWindowCallback(this.A0.getCallback());
                    if (this.V0) {
                        ((ActionBarOverlayLayout) this.G0).d(109);
                    }
                    if (this.S0) {
                        ((ActionBarOverlayLayout) this.G0).d(2);
                    }
                    if (this.T0) {
                        ((ActionBarOverlayLayout) this.G0).d(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    gvf gvf = new gvf(2, (Object) this);
                    WeakHashMap weakHashMap = eaf.a;
                    t9f.u(viewGroup, gvf);
                    if (this.G0 == null) {
                        this.Q0 = (TextView) viewGroup.findViewById(pob.title);
                    }
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", (Class[]) null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, (Object[]) null);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(pob.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.A0.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.A0.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new c9(1, this));
                    this.P0 = viewGroup;
                    Object obj = this.y0;
                    CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.F0;
                    if (!TextUtils.isEmpty(title)) {
                        s24 s242 = this.G0;
                        if (s242 != null) {
                            s242.setWindowTitle(title);
                        } else {
                            n1g n1g = this.D0;
                            if (n1g != null) {
                                n1g.X(title);
                            } else {
                                TextView textView = this.Q0;
                                if (textView != null) {
                                    textView.setText(title);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.P0.findViewById(16908290);
                    View decorView = this.A0.getDecorView();
                    contentFrameLayout2.y0.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(nwb.AppCompatTheme);
                    obtainStyledAttributes2.getValue(nwb.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(nwb.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(nwb.AppCompatTheme_windowFixedWidthMajor)) {
                        obtainStyledAttributes2.getValue(nwb.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(nwb.AppCompatTheme_windowFixedWidthMinor)) {
                        obtainStyledAttributes2.getValue(nwb.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(nwb.AppCompatTheme_windowFixedHeightMajor)) {
                        obtainStyledAttributes2.getValue(nwb.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(nwb.AppCompatTheme_windowFixedHeightMinor)) {
                        obtainStyledAttributes2.getValue(nwb.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.O0 = true;
                    cn y = y(0);
                    if (!this.f1 && y.h == null) {
                        A(108);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
                sb.append(this.U0);
                sb.append(", windowActionBarOverlay: ");
                sb.append(this.V0);
                sb.append(", android:windowIsFloating: ");
                sb.append(this.X0);
                sb.append(", windowActionModeOverlay: ");
                sb.append(this.W0);
                sb.append(", windowNoTitle: ");
                throw new IllegalArgumentException(hr1.j(sb, this.Y0, " }"));
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void w() {
        if (this.A0 == null) {
            Object obj = this.y0;
            if (obj instanceof Activity) {
                m(((Activity) obj).getWindow());
            }
        }
        if (this.A0 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [it4, java.lang.Object] */
    public final ibe x(Context context) {
        if (this.l1 == null) {
            if (it4.X == null) {
                Context applicationContext = context.getApplicationContext();
                ? obj = new Object();
                obj.c = new Object();
                obj.a = applicationContext;
                obj.b = (LocationManager) applicationContext.getSystemService("location");
                it4.X = obj;
            }
            this.l1 = new zm(this, it4.X);
        }
        return this.l1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: cn[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: cn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: cn[]} */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, cn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.cn y(int r5) {
        /*
            r4 = this;
            cn[] r0 = r4.a1
            r1 = 0
            if (r0 == 0) goto L_0x0008
            int r2 = r0.length
            if (r2 > r5) goto L_0x0015
        L_0x0008:
            int r2 = r5 + 1
            cn[] r2 = new defpackage.cn[r2]
            if (r0 == 0) goto L_0x0012
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L_0x0012:
            r4.a1 = r2
            r0 = r2
        L_0x0015:
            r4 = r0[r5]
            if (r4 != 0) goto L_0x0024
            cn r4 = new cn
            r4.<init>()
            r4.a = r5
            r4.n = r1
            r0[r5] = r4
        L_0x0024:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.y(int):cn");
    }

    public final void z() {
        v();
        if (this.U0 && this.D0 == null) {
            Object obj = this.y0;
            if (obj instanceof Activity) {
                this.D0 = new trf((Activity) obj, this.V0);
            } else if (obj instanceof Dialog) {
                this.D0 = new trf((Dialog) obj);
            }
            n1g n1g = this.D0;
            if (n1g != null) {
                n1g.V(this.q1);
            }
        }
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}

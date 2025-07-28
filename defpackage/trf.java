package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: trf  reason: default package */
public final class trf extends n1g implements n6 {
    public static final AccelerateInterpolator D = new AccelerateInterpolator();
    public static final DecelerateInterpolator E = new DecelerateInterpolator();
    public final rrf A = new rrf(this, 0);
    public final rrf B = new rrf(this, 1);
    public final mv4 C = new mv4(29, this);
    public Context f;
    public Context g;
    public ActionBarOverlayLayout h;
    public ActionBarContainer i;
    public t24 j;
    public ActionBarContextView k;
    public final View l;
    public boolean m;
    public srf n;
    public srf o;
    public m7 p;
    public boolean q;
    public final ArrayList r = new ArrayList();
    public int s = 0;
    public boolean t = true;
    public boolean u;
    public boolean v;
    public boolean w = true;
    public acf x;
    public boolean y;
    public boolean z;

    public trf(Activity activity, boolean z2) {
        super(3);
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        h0(decorView);
        if (!z2) {
            this.l = decorView.findViewById(16908290);
        }
    }

    public final void H() {
        i0(this.f.getResources().getBoolean(dmb.abc_action_bar_embed_tabs));
    }

    public final boolean J(int i2, KeyEvent keyEvent) {
        pl8 pl8;
        srf srf = this.n;
        if (srf == null || (pl8 = srf.o) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        pl8.setQwertyMode(z2);
        return pl8.performShortcut(i2, keyEvent, 0);
    }

    public final void V(boolean z2) {
        if (!this.m) {
            int i2 = z2 ? 4 : 0;
            cme cme = (cme) this.j;
            int i3 = cme.b;
            this.m = true;
            cme.a((i2 & 4) | (i3 & -5));
        }
    }

    public final void W(boolean z2) {
        acf acf;
        this.y = z2;
        if (!z2 && (acf = this.x) != null) {
            acf.a();
        }
    }

    public final void X(CharSequence charSequence) {
        cme cme = (cme) this.j;
        if (!cme.g) {
            cme.h = charSequence;
            if ((cme.b & 8) != 0) {
                Toolbar toolbar = cme.a;
                toolbar.setTitle(charSequence);
                if (cme.g) {
                    eaf.k(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final n7 Y(b2b b2b) {
        srf srf = this.n;
        if (srf != null) {
            srf.a();
        }
        this.h.setHideOnContentScrollEnabled(false);
        this.k.e();
        srf srf2 = new srf(this, this.k.getContext(), b2b);
        pl8 pl8 = srf2.o;
        pl8.w();
        try {
            if (!srf2.X.k(srf2, pl8)) {
                return null;
            }
            this.n = srf2;
            srf2.h();
            this.k.c(srf2);
            g0(true);
            return srf2;
        } finally {
            pl8.v();
        }
    }

    public final boolean e() {
        rle rle;
        t24 t24 = this.j;
        if (t24 == null || (rle = ((cme) t24).a.e1) == null || rle.b == null) {
            return false;
        }
        rle rle2 = ((cme) t24).a.e1;
        ul8 ul8 = rle2 == null ? null : rle2.b;
        if (ul8 == null) {
            return true;
        }
        ul8.collapseActionView();
        return true;
    }

    public final void g0(boolean z2) {
        zbf zbf;
        zbf zbf2;
        if (z2) {
            if (!this.v) {
                this.v = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.h;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                j0(false);
            }
        } else if (this.v) {
            this.v = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.h;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            j0(false);
        }
        if (this.i.isLaidOut()) {
            if (z2) {
                cme cme = (cme) this.j;
                zbf2 = eaf.a(cme.a);
                zbf2.a(0.0f);
                zbf2.c(100);
                zbf2.d(new bme(cme, 4));
                zbf = this.k.i(0, 200);
            } else {
                cme cme2 = (cme) this.j;
                zbf a = eaf.a(cme2.a);
                a.a(1.0f);
                a.c(200);
                a.d(new bme(cme2, 0));
                zbf zbf3 = a;
                zbf2 = this.k.i(8, 100);
                zbf = zbf3;
            }
            acf acf = new acf();
            ArrayList arrayList = acf.a;
            arrayList.add(zbf2);
            View view = (View) zbf2.a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = (View) zbf.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            arrayList.add(zbf);
            acf.b();
        } else if (z2) {
            ((cme) this.j).a.setVisibility(4);
            this.k.setVisibility(0);
        } else {
            ((cme) this.j).a.setVisibility(0);
            this.k.setVisibility(8);
        }
    }

    public final void h0(View view) {
        t24 t24;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(pob.decor_content_parent);
        this.h = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(pob.action_bar);
        if (findViewById instanceof t24) {
            t24 = (t24) findViewById;
        } else if (findViewById instanceof Toolbar) {
            t24 = ((Toolbar) findViewById).getWrapper();
        } else {
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
        }
        this.j = t24;
        this.k = (ActionBarContextView) view.findViewById(pob.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(pob.action_bar_container);
        this.i = actionBarContainer;
        t24 t242 = this.j;
        if (t242 == null || this.k == null || actionBarContainer == null) {
            throw new IllegalStateException(trf.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((cme) t242).a.getContext();
        this.f = context;
        if ((((cme) this.j).b & 4) != 0) {
            this.m = true;
        }
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.j.getClass();
        i0(context.getResources().getBoolean(dmb.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f.obtainStyledAttributes((AttributeSet) null, nwb.ActionBar, ylb.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(nwb.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.h;
            if (actionBarOverlayLayout2.y0) {
                this.z = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(nwb.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.i;
            WeakHashMap weakHashMap = eaf.a;
            t9f.s(actionBarContainer2, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void i0(boolean z2) {
        if (!z2) {
            ((cme) this.j).getClass();
            this.i.setTabContainer((npc) null);
        } else {
            this.i.setTabContainer((npc) null);
            ((cme) this.j).getClass();
        }
        cme cme = (cme) this.j;
        cme.getClass();
        cme.a.setCollapsible(false);
        this.h.setHasNonEmbeddedTabs(false);
    }

    public final void j(boolean z2) {
        if (z2 != this.q) {
            this.q = z2;
            ArrayList arrayList = this.r;
            if (arrayList.size() > 0) {
                hr1.r(arrayList.get(0));
                throw null;
            }
        }
    }

    public final void j0(boolean z2) {
        boolean z3 = this.v || !this.u;
        View view = this.l;
        c00 c00 = null;
        mv4 mv4 = this.C;
        if (z3) {
            if (!this.w) {
                this.w = true;
                acf acf = this.x;
                if (acf != null) {
                    acf.a();
                }
                this.i.setVisibility(0);
                int i2 = this.s;
                rrf rrf = this.B;
                if (i2 != 0 || (!this.y && !z2)) {
                    this.i.setAlpha(1.0f);
                    this.i.setTranslationY(0.0f);
                    if (this.t && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    rrf.c();
                } else {
                    this.i.setTranslationY(0.0f);
                    float f2 = (float) (-this.i.getHeight());
                    if (z2) {
                        int[] iArr = {0, 0};
                        this.i.getLocationInWindow(iArr);
                        f2 -= (float) iArr[1];
                    }
                    this.i.setTranslationY(f2);
                    acf acf2 = new acf();
                    zbf a = eaf.a(this.i);
                    a.e(0.0f);
                    View view2 = (View) a.a.get();
                    if (view2 != null) {
                        if (mv4 != null) {
                            c00 = new c00(mv4, view2);
                        }
                        view2.animate().setUpdateListener(c00);
                    }
                    boolean z4 = acf2.e;
                    ArrayList arrayList = acf2.a;
                    if (!z4) {
                        arrayList.add(a);
                    }
                    if (this.t && view != null) {
                        view.setTranslationY(f2);
                        zbf a2 = eaf.a(view);
                        a2.e(0.0f);
                        if (!acf2.e) {
                            arrayList.add(a2);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = E;
                    boolean z5 = acf2.e;
                    if (!z5) {
                        acf2.c = decelerateInterpolator;
                    }
                    if (!z5) {
                        acf2.b = 250;
                    }
                    if (!z5) {
                        acf2.d = rrf;
                    }
                    this.x = acf2;
                    acf2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.h;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = eaf.a;
                    r9f.c(actionBarOverlayLayout);
                }
            }
        } else if (this.w) {
            this.w = false;
            acf acf3 = this.x;
            if (acf3 != null) {
                acf3.a();
            }
            int i3 = this.s;
            rrf rrf2 = this.A;
            if (i3 != 0 || (!this.y && !z2)) {
                rrf2.c();
                return;
            }
            this.i.setAlpha(1.0f);
            this.i.setTransitioning(true);
            acf acf4 = new acf();
            float f3 = (float) (-this.i.getHeight());
            if (z2) {
                int[] iArr2 = {0, 0};
                this.i.getLocationInWindow(iArr2);
                f3 -= (float) iArr2[1];
            }
            zbf a3 = eaf.a(this.i);
            a3.e(f3);
            View view3 = (View) a3.a.get();
            if (view3 != null) {
                if (mv4 != null) {
                    c00 = new c00(mv4, view3);
                }
                view3.animate().setUpdateListener(c00);
            }
            boolean z6 = acf4.e;
            ArrayList arrayList2 = acf4.a;
            if (!z6) {
                arrayList2.add(a3);
            }
            if (this.t && view != null) {
                zbf a4 = eaf.a(view);
                a4.e(f3);
                if (!acf4.e) {
                    arrayList2.add(a4);
                }
            }
            AccelerateInterpolator accelerateInterpolator = D;
            boolean z7 = acf4.e;
            if (!z7) {
                acf4.c = accelerateInterpolator;
            }
            if (!z7) {
                acf4.b = 250;
            }
            if (!z7) {
                acf4.d = rrf2;
            }
            this.x = acf4;
            acf4.b();
        }
    }

    public final int q() {
        return ((cme) this.j).b;
    }

    public final Context w() {
        if (this.g == null) {
            TypedValue typedValue = new TypedValue();
            this.f.getTheme().resolveAttribute(ylb.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.g = new ContextThemeWrapper(this.f, i2);
            } else {
                this.g = this.f;
            }
        }
        return this.g;
    }

    public trf(Dialog dialog) {
        super(3);
        new ArrayList();
        h0(dialog.getWindow().getDecorView());
    }
}

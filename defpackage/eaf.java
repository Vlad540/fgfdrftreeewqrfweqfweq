package defpackage;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: eaf  reason: default package */
public abstract class eaf {
    public static WeakHashMap a;
    public static final int[] b = {wpb.accessibility_custom_action_0, wpb.accessibility_custom_action_1, wpb.accessibility_custom_action_2, wpb.accessibility_custom_action_3, wpb.accessibility_custom_action_4, wpb.accessibility_custom_action_5, wpb.accessibility_custom_action_6, wpb.accessibility_custom_action_7, wpb.accessibility_custom_action_8, wpb.accessibility_custom_action_9, wpb.accessibility_custom_action_10, wpb.accessibility_custom_action_11, wpb.accessibility_custom_action_12, wpb.accessibility_custom_action_13, wpb.accessibility_custom_action_14, wpb.accessibility_custom_action_15, wpb.accessibility_custom_action_16, wpb.accessibility_custom_action_17, wpb.accessibility_custom_action_18, wpb.accessibility_custom_action_19, wpb.accessibility_custom_action_20, wpb.accessibility_custom_action_21, wpb.accessibility_custom_action_22, wpb.accessibility_custom_action_23, wpb.accessibility_custom_action_24, wpb.accessibility_custom_action_25, wpb.accessibility_custom_action_26, wpb.accessibility_custom_action_27, wpb.accessibility_custom_action_28, wpb.accessibility_custom_action_29, wpb.accessibility_custom_action_30, wpb.accessibility_custom_action_31};
    public static final o9f c = new Object();
    public static final q9f d = new q9f();

    public static zbf a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        zbf zbf = (zbf) a.get(view);
        if (zbf != null) {
            return zbf;
        }
        zbf zbf2 = new zbf(view);
        a.put(view, zbf2);
        return zbf2;
    }

    public static nsf b(View view, nsf nsf) {
        WindowInsets e = nsf.e();
        if (e != null) {
            WindowInsets a2 = r9f.a(view, e);
            if (!a2.equals(e)) {
                return nsf.f(view, a2);
            }
        }
        return nsf;
    }

    public static ArrayList c(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(wpb.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(wpb.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] d(View view) {
        return Build.VERSION.SDK_INT >= 31 ? baf.a(view) : (String[]) view.getTag(wpb.tag_on_receive_content_mime_types);
    }

    public static void e(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = y9f.b(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i2 = 32;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(y9f.b(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(y9f.b(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError unused) {
                    view.getParent().getClass();
                }
            }
        }
    }

    public static nsf f(View view, nsf nsf) {
        WindowInsets e = nsf.e();
        if (e != null) {
            WindowInsets b2 = r9f.b(view, e);
            if (!b2.equals(e)) {
                return nsf.f(view, b2);
            }
        }
        return nsf;
    }

    public static xp3 g(View view, xp3 xp3) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(xp3);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return baf.b(view, xp3);
        }
        rx9 rx9 = (rx9) view.getTag(wpb.tag_on_receive_content_listener);
        sx9 sx9 = c;
        if (rx9 != null) {
            xp3 a2 = rx9.a(view, xp3);
            if (a2 == null) {
                return null;
            }
            if (view instanceof sx9) {
                sx9 = (sx9) view;
            }
            return sx9.b(a2);
        }
        if (view instanceof sx9) {
            sx9 = (sx9) view;
        }
        return sx9.b(xp3);
    }

    public static void h(View view, int i) {
        ArrayList c2 = c(view);
        for (int i2 = 0; i2 < c2.size(); i2++) {
            if (((g4) c2.get(i2)).a() == i) {
                c2.remove(i2);
                return;
            }
        }
    }

    public static void i(View view, g4 g4Var, v4 v4Var) {
        if (v4Var == null) {
            h(view, g4Var.a());
            e(view, 0);
            return;
        }
        g4 g4Var2 = new g4((Object) null, g4Var.b, (String) null, v4Var, g4Var.c);
        View.AccessibilityDelegate a2 = z9f.a(view);
        b4 b4Var = a2 == null ? null : a2 instanceof a4 ? ((a4) a2).a : new b4(a2);
        if (b4Var == null) {
            b4Var = new b4();
        }
        j(view, b4Var);
        h(view, g4Var2.a());
        c(view).add(g4Var2);
        e(view, 0);
    }

    public static void j(View view, b4 b4Var) {
        if (b4Var == null && (z9f.a(view) instanceof a4)) {
            b4Var = new b4();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(b4Var == null ? null : b4Var.b);
    }

    public static void k(View view, CharSequence charSequence) {
        new p9f(wpb.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).g(view, charSequence);
        q9f q9f = d;
        if (charSequence != null) {
            q9f.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(q9f);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(q9f);
                return;
            }
            return;
        }
        q9f.a.remove(view);
        view.removeOnAttachStateChangeListener(q9f);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(q9f);
    }

    public static void l(View view, u12 u12) {
        xrf xrf = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (u12 != null) {
                xrf = new xrf(u12);
            }
            hia.s(view, xrf);
            return;
        }
        PathInterpolator pathInterpolator = wrf.e;
        Object tag = view.getTag(wpb.tag_on_apply_window_listener);
        if (u12 == null) {
            view.setTag(wpb.tag_window_insets_animation_callback, (Object) null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
                return;
            }
            return;
        }
        vrf vrf = new vrf(view, u12);
        view.setTag(wpb.tag_window_insets_animation_callback, vrf);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(vrf);
        }
    }
}

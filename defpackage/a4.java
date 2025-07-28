package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: a4  reason: default package */
public final class a4 extends View.AccessibilityDelegate {
    public final b4 a;

    public a4(b4 b4Var) {
        this.a = b4Var;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.a(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        n4 b = this.a.b(view);
        if (b != null) {
            return (AccessibilityNodeProvider) b.a;
        }
        return null;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.c(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object obj;
        l4 l4Var = new l4(accessibilityNodeInfo);
        WeakHashMap weakHashMap = eaf.a;
        accessibilityNodeInfo.setScreenReaderFocusable(Boolean.valueOf(y9f.d(view)).booleanValue());
        accessibilityNodeInfo.setHeading(Boolean.valueOf(y9f.c(view)).booleanValue());
        accessibilityNodeInfo.setPaneTitle(y9f.b(view));
        int i = wpb.tag_state_description;
        if (Build.VERSION.SDK_INT >= 30) {
            obj = aaf.b(view);
        } else {
            obj = view.getTag(i);
            if (!CharSequence.class.isInstance(obj)) {
                obj = null;
            }
        }
        CharSequence charSequence = (CharSequence) obj;
        if (Build.VERSION.SDK_INT >= 30) {
            h4.c(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.a.d(view, l4Var);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(wpb.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            l4Var.b((g4) list.get(i2));
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.e(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.f(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.g(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        this.a.h(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.i(view, accessibilityEvent);
    }
}

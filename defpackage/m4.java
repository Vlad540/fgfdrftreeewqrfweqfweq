package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: m4  reason: default package */
public final class m4 extends AccessibilityNodeProvider {
    public final n4 a;

    public m4(n4 n4Var) {
        this.a = n4Var;
    }

    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.a.getClass();
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        l4 a2 = this.a.a(i);
        if (a2 == null) {
            return null;
        }
        return a2.a;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.a.getClass();
        return null;
    }

    public final AccessibilityNodeInfo findFocus(int i) {
        l4 b = this.a.b(i);
        if (b == null) {
            return null;
        }
        return b.a;
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.c(i, i2, bundle);
    }
}

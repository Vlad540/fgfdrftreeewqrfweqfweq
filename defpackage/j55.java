package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* renamed from: j55  reason: default package */
public final class j55 extends n4 {
    public final /* synthetic */ k55 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j55(k55 k55) {
        super(0);
        this.b = k55;
    }

    public final l4 a(int i) {
        return new l4(AccessibilityNodeInfo.obtain(this.b.r(i).a));
    }

    public final l4 b(int i) {
        k55 k55 = this.b;
        int i2 = i == 2 ? k55.k : k55.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    public final boolean c(int i, int i2, Bundle bundle) {
        int i3;
        k55 k55 = this.b;
        View view = k55.i;
        if (i != -1) {
            boolean z = true;
            if (i2 == 1) {
                return k55.w(i);
            }
            if (i2 == 2) {
                return k55.j(i);
            }
            if (i2 == 64) {
                AccessibilityManager accessibilityManager = k55.h;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = k55.k) != i) {
                    if (i3 != Integer.MIN_VALUE) {
                        k55.k = Integer.MIN_VALUE;
                        k55.i.invalidate();
                        k55.x(i3, 65536);
                    }
                    k55.k = i;
                    view.invalidate();
                    k55.x(i, 32768);
                    return z;
                }
            } else if (i2 != 128) {
                return k55.s(i, i2, bundle);
            } else {
                if (k55.k == i) {
                    k55.k = Integer.MIN_VALUE;
                    view.invalidate();
                    k55.x(i, 65536);
                    return z;
                }
            }
            z = false;
            return z;
        }
        WeakHashMap weakHashMap = eaf.a;
        return view.performAccessibilityAction(i2, bundle);
    }
}

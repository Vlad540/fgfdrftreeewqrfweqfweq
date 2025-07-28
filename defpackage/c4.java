package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* renamed from: c4  reason: default package */
public final class c4 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final r34 a;

    public c4(r34 r34) {
        this.a = r34;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4)) {
            return false;
        }
        return this.a.equals(((c4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void onTouchExplorationStateChanged(boolean z) {
        kp4 kp4 = (kp4) this.a.b;
        AutoCompleteTextView autoCompleteTextView = kp4.h;
        if (autoCompleteTextView != null && !bm3.t(autoCompleteTextView)) {
            int i = z ? 2 : 1;
            WeakHashMap weakHashMap = eaf.a;
            kp4.d.setImportantForAccessibility(i);
        }
    }
}

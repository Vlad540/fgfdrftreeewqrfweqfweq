package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* renamed from: c7c  reason: default package */
public final class c7c extends b4 {
    public final d7c d;
    public final WeakHashMap e = new WeakHashMap();

    public c7c(d7c d7c) {
        this.d = d7c;
    }

    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        b4 b4Var = (b4) this.e.get(view);
        return b4Var != null ? b4Var.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final n4 b(View view) {
        b4 b4Var = (b4) this.e.get(view);
        return b4Var != null ? b4Var.b(view) : super.b(view);
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        b4 b4Var = (b4) this.e.get(view);
        if (b4Var != null) {
            b4Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    public final void d(View view, l4 l4Var) {
        d7c d7c = this.d;
        boolean X = d7c.d.X();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
        if (!X) {
            RecyclerView recyclerView = d7c.d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().c0(view, l4Var);
                b4 b4Var = (b4) this.e.get(view);
                if (b4Var != null) {
                    b4Var.d(view, l4Var);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        b4 b4Var = (b4) this.e.get(view);
        if (b4Var != null) {
            b4Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        b4 b4Var = (b4) this.e.get(viewGroup);
        return b4Var != null ? b4Var.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public final boolean g(View view, int i, Bundle bundle) {
        d7c d7c = this.d;
        if (!d7c.d.X()) {
            RecyclerView recyclerView = d7c.d;
            if (recyclerView.getLayoutManager() != null) {
                b4 b4Var = (b4) this.e.get(view);
                if (b4Var != null) {
                    if (b4Var.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                t6c t6c = recyclerView.getLayoutManager().b.c;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    public final void h(View view, int i) {
        b4 b4Var = (b4) this.e.get(view);
        if (b4Var != null) {
            b4Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        b4 b4Var = (b4) this.e.get(view);
        if (b4Var != null) {
            b4Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}

package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* renamed from: d7c  reason: default package */
public final class d7c extends b4 {
    public final RecyclerView d;
    public final c7c e;

    public d7c(RecyclerView recyclerView) {
        this.d = recyclerView;
        c7c c7c = this.e;
        if (c7c != null) {
            this.e = c7c;
        } else {
            this.e = new c7c(this);
        }
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.d.X()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().Z(accessibilityEvent);
            }
        }
    }

    public final void d(View view, l4 l4Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, l4Var.a);
        RecyclerView recyclerView = this.d;
        if (!recyclerView.X() && recyclerView.getLayoutManager() != null) {
            a layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            layoutManager.a0(recyclerView2.c, recyclerView2.w1, l4Var);
        }
    }

    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.X() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        a layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        return layoutManager.o0(recyclerView2.c, recyclerView2.w1, i, bundle);
    }
}

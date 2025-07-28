package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: u41  reason: default package */
public final class u41 {
    public RecyclerView a;

    public void a(int i) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.u(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}

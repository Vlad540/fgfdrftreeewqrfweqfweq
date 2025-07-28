package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.WeakHashMap;

/* renamed from: e7c  reason: default package */
public final class e7c implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;

    public /* synthetic */ e7c(int i) {
        this.a = i;
    }

    private final void a(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) view;
                yqd s = gp0.s(recyclerView);
                if (s != null) {
                    b recycledViewPool = recyclerView.getRecycledViewPool();
                    LinearLayoutManager linearLayoutManager = null;
                    recyclerView.setRecycledViewPool((b) null);
                    f6c adapter = recyclerView.getAdapter();
                    f6c f6c = s.a;
                    if (adapter != f6c) {
                        recyclerView.setAdapter(f6c);
                    }
                    recyclerView.setRecycledViewPool(recycledViewPool);
                    if (s.b != -1) {
                        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            linearLayoutManager = layoutManager;
                        }
                        if (linearLayoutManager != null) {
                            linearLayoutManager.n1(s.b, s.c);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = eaf.a;
                r9f.c(view);
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) view;
                yqd s = gp0.s(recyclerView);
                if (s != null) {
                    LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
                    if (linearLayoutManager != null) {
                        s.b = linearLayoutManager.W0();
                        int i = 0;
                        View childAt = recyclerView.getChildAt(0);
                        if (childAt != null) {
                            i = childAt.getTop();
                        }
                        s.c = i;
                    }
                    b recycledViewPool = recyclerView.getRecycledViewPool();
                    recyclerView.setRecycledViewPool((b) null);
                    recyclerView.setAdapter((f6c) null);
                    recyclerView.setRecycledViewPool(recycledViewPool);
                    return;
                }
                return;
            default:
                return;
        }
    }
}

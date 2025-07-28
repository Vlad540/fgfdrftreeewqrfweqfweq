package defpackage;

import android.view.View;
import one.me.sdk.lists.widgets.EmptyRecyclerView;

/* renamed from: kw4  reason: default package */
public final class kw4 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ EmptyRecyclerView o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kw4(EmptyRecyclerView emptyRecyclerView, int i) {
        super(9, (Object) null);
        this.c = i;
        this.o = emptyRecyclerView;
    }

    public final void L1(Object obj, Object obj2) {
        EmptyRecyclerView emptyRecyclerView = this.o;
        switch (this.c) {
            case 0:
                View view = (View) obj;
                if (((View) obj2) != null) {
                    k77[] k77Arr = EmptyRecyclerView.c2;
                    emptyRecyclerView.getClass();
                    emptyRecyclerView.a2 = new jw4(0, emptyRecyclerView);
                    f6c adapter = emptyRecyclerView.getAdapter();
                    if (adapter != null) {
                        EmptyRecyclerView.K0(adapter, emptyRecyclerView.a2);
                        return;
                    }
                    return;
                } else if (emptyRecyclerView.getAdapter() != null && emptyRecyclerView.a2 != null) {
                    f6c adapter2 = emptyRecyclerView.getAdapter();
                    if (adapter2 != null) {
                        EmptyRecyclerView.L0(adapter2, emptyRecyclerView.a2);
                    }
                    emptyRecyclerView.a2 = null;
                    return;
                } else {
                    return;
                }
            default:
                View view2 = (View) obj;
                if (((View) obj2) != null) {
                    k77[] k77Arr2 = EmptyRecyclerView.c2;
                    emptyRecyclerView.getClass();
                    emptyRecyclerView.a2 = new jw4(0, emptyRecyclerView);
                    f6c adapter3 = emptyRecyclerView.getAdapter();
                    if (adapter3 != null) {
                        EmptyRecyclerView.K0(adapter3, emptyRecyclerView.a2);
                        return;
                    }
                    return;
                } else if (emptyRecyclerView.getAdapter() != null && emptyRecyclerView.a2 != null) {
                    f6c adapter4 = emptyRecyclerView.getAdapter();
                    if (adapter4 != null) {
                        EmptyRecyclerView.L0(adapter4, emptyRecyclerView.a2);
                    }
                    emptyRecyclerView.a2 = null;
                    return;
                } else {
                    return;
                }
        }
    }
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import java.util.WeakHashMap;

/* renamed from: mt3  reason: default package */
public final class mt3 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mt3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onChildViewAdded(View view, View view2) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) obj).H0;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                    return;
                }
                return;
            case 1:
                int i = FastScroller.F0;
                ((FastScroller) obj).b();
                return;
            default:
                o4a o4a = (o4a) obj;
                o4a.getClass();
                boolean z = view2 instanceof TextView;
                WeakHashMap weakHashMap = o4a.b;
                zqd zqd = o4a.a;
                if (z) {
                    weakHashMap.put(view2, jue.a);
                    TextView textView = (TextView) view2;
                    yq4 yq4 = (yq4) zqd.getValue();
                    Object tag = textView.getTag(m9a.a);
                    nge nge = tag instanceof nge ? (nge) tag : null;
                    if (nge != null) {
                        nge.b(textView, yq4);
                        return;
                    }
                    return;
                } else if (view2 instanceof rt5) {
                    weakHashMap.get(view2);
                    ((rt5) view2).a((yq4) zqd.getValue());
                    return;
                } else {
                    return;
                }
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                coordinatorLayout.o(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.H0;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                    return;
                }
                return;
            case 1:
                int i = FastScroller.F0;
                ((FastScroller) obj).b();
                return;
            default:
                o4a o4a = (o4a) obj;
                o4a.getClass();
                if ((view2 instanceof TextView) || (view2 instanceof rt5)) {
                    o4a.b.remove(view2);
                    return;
                }
                return;
        }
    }
}

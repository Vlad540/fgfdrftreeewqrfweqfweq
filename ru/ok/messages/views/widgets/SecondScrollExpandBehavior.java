package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/messages/views/widgets/SecondScrollExpandBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class SecondScrollExpandBehavior extends AppBarLayout.Behavior {
    public boolean o = true;
    public int p;

    public SecondScrollExpandBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void E(CoordinatorLayout coordinatorLayout, fm fmVar, View view, int i, int i2, int[] iArr, int i3) {
        SecondScrollExpandBehavior.super.E(coordinatorLayout, fmVar, view, i, i2, iArr, i3);
        N(i2, fmVar, view, i3);
    }

    /* renamed from: F */
    public final void p(CoordinatorLayout coordinatorLayout, fm fmVar, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        SecondScrollExpandBehavior.super.F(coordinatorLayout, fmVar, view, i, i2, i3, i4, i5, iArr);
        N(i2, fmVar, view, i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r2.T0() != 0) goto L_0x0033;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean u(androidx.coordinatorlayout.widget.CoordinatorLayout r5, fm r6, android.view.View r7, android.view.View r8, int r9, int r10) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            if (r9 != r1) goto L_0x0005
            return r0
        L_0x0005:
            if (r10 != r1) goto L_0x0016
            int r2 = r4.p
            int r3 = r4.x()
            if (r2 != r3) goto L_0x0016
            int r2 = r4.x()
            if (r2 == 0) goto L_0x0016
            goto L_0x0033
        L_0x0016:
            boolean r2 = r8 instanceof opc
            if (r2 != 0) goto L_0x001b
            goto L_0x0033
        L_0x001b:
            boolean r2 = r8 instanceof androidx.recyclerview.widget.RecyclerView
            if (r2 == 0) goto L_0x0032
            r2 = r8
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            androidx.recyclerview.widget.a r2 = r2.getLayoutManager()
            boolean r3 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r3 == 0) goto L_0x0032
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            int r2 = r2.T0()
            if (r2 != 0) goto L_0x0033
        L_0x0032:
            r0 = r1
        L_0x0033:
            r4.o = r0
            int r0 = r4.x()
            r4.p = r0
            boolean r4 = ru.ok.messages.views.widgets.SecondScrollExpandBehavior.super.G(r5, r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.views.widgets.SecondScrollExpandBehavior.u(androidx.coordinatorlayout.widget.CoordinatorLayout, fm, android.view.View, android.view.View, int, int):boolean");
    }

    public final void N(int i, fm fmVar, View view, int i2) {
        if (i2 == 1) {
            int x = x();
            if ((i < 0 && x == this.p) || ((i > 0 && x == (-fmVar.getTotalScrollRange())) || (i < 0 && x == 0))) {
                WeakHashMap weakHashMap = eaf.a;
                if (view instanceof eh9) {
                    ((eh9) view).a(1);
                }
            }
        }
    }

    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        fm fmVar = (fm) view;
        SecondScrollExpandBehavior.super.E(coordinatorLayout, fmVar, view2, i, i2, iArr, i3);
        N(i2, fmVar, view2, i3);
    }

    public final void v(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        SecondScrollExpandBehavior.super.H(coordinatorLayout, (fm) view, view2, i);
    }

    public final boolean z(int i) {
        if (!this.o) {
            return false;
        }
        return SecondScrollExpandBehavior.super.z(i);
    }
}

package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.List;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;

/* renamed from: yq3  reason: default package */
public final class yq3 extends FrameLayout implements mhe {
    public final /* synthetic */ ContextMenuPopupWindow a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yq3(ContextMenuPopupWindow contextMenuPopupWindow, LayoutInflater layoutInflater, Context context) {
        super(context);
        boolean z;
        ContextMenuPopupWindow contextMenuPopupWindow2 = contextMenuPopupWindow;
        this.a = contextMenuPopupWindow2;
        boolean z2 = true;
        setClickable(true);
        a24.a0(this, new d5(24, (Object) contextMenuPopupWindow2));
        k77[] k77Arr = ContextMenuPopupWindow.y0;
        contextMenuPopupWindow.getClass();
        b1b b1b = new b1b(layoutInflater.getContext(), contextMenuPopupWindow.m0());
        b1b.setId(ContextMenuPopupWindow.z0);
        Bundle bundle = contextMenuPopupWindow.getArgs().getBundle("actions");
        List list = null;
        List f = bundle != null ? kjd.f(bundle) : null;
        List list2 = hw4.a;
        f = f == null ? list2 : f;
        if (!f.isEmpty()) {
            Iterator it = f.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((pq3) it.next()).d != null) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        mge mge = (mge) ((Parcelable) ek8.E(contextMenuPopupWindow.getArgs(), "header", mge.class));
        int i = -1;
        int i2 = -2;
        if (mge != null) {
            xq3 xq3 = new xq3(mge, contextMenuPopupWindow2, b1b.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            float f2 = (float) 12;
            layoutParams.topMargin = a24.X(dh4.c().getDisplayMetrics().density * f2);
            layoutParams.bottomMargin = a24.X(dh4.c().getDisplayMetrics().density * f2);
            layoutParams.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f2));
            layoutParams.setMarginEnd(a24.X(f2 * dh4.c().getDisplayMetrics().density));
            b1b.addView(xq3, layoutParams);
        }
        Bundle bundle2 = contextMenuPopupWindow.getArgs().getBundle("actions");
        list = bundle2 != null ? kjd.f(bundle2) : list;
        for (pq3 pq3 : list != null ? list : list2) {
            a1b a1b = new a1b(b1b.getContext(), contextMenuPopupWindow.m0());
            mge mge2 = pq3.b;
            Integer num = pq3.d;
            boolean z3 = num != null ? z2 : false;
            int i3 = i2;
            int i4 = i;
            a1b.c(a1b, mge2, pq3.c, z3, z);
            a1b.b(num, pq3.e);
            a24.a0(a1b, new ub((Object) contextMenuPopupWindow2, 21, (Object) pq3));
            b1b.addView(a1b, i4, i3);
            i2 = i3;
            i = i4;
            z2 = true;
        }
        addView(b1b, new FrameLayout.LayoutParams(a24.X(((float) 250) * dh4.c().getDisplayMetrics().density), i2, 51));
        onThemeChanged(ContextMenuPopupWindow.l0(contextMenuPopupWindow));
    }

    public final void onThemeChanged(pda pda) {
        ContextMenuPopupWindow contextMenuPopupWindow = this.a;
        if (contextMenuPopupWindow.getArgs().getBoolean("dim")) {
            setBackgroundColor(ContextMenuPopupWindow.l0(contextMenuPopupWindow).b().d);
        }
    }
}

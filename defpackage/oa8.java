package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.mediarouter.app.a;
import androidx.mediarouter.app.c;
import androidx.mediarouter.app.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: oa8  reason: default package */
public final class oa8 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d b;

    public oa8(d dVar, boolean z) {
        this.b = dVar;
        this.a = z;
    }

    public final void onGlobalLayout() {
        int i;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        d dVar = this.b;
        dVar.H0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (dVar.t1) {
            dVar.u1 = true;
            return;
        }
        int i2 = dVar.O0.getLayoutParams().height;
        d.o(dVar.O0, -1);
        dVar.u(dVar.i());
        View decorView = dVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(dVar.getWindow().getAttributes().width, 1073741824), 0);
        d.o(dVar.O0, i2);
        if (!(dVar.I0.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) dVar.I0.getDrawable()).getBitmap()) == null) {
            i = 0;
        } else {
            i = dVar.l(bitmap.getWidth(), bitmap.getHeight());
            dVar.I0.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int m = dVar.m(dVar.i());
        int size = dVar.U0.size();
        boolean n = dVar.n();
        xb8 xb8 = dVar.x0;
        int size2 = n ? Collections.unmodifiableList(xb8.u).size() * dVar.c1 : 0;
        if (size > 0) {
            size2 += dVar.e1;
        }
        int min = Math.min(size2, dVar.d1);
        if (!dVar.s1) {
            min = 0;
        }
        int max = Math.max(i, min) + m;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (dVar.G0.getMeasuredHeight() - dVar.H0.getMeasuredHeight());
        if (i <= 0 || max > height) {
            if (dVar.O0.getMeasuredHeight() + dVar.S0.getLayoutParams().height >= dVar.H0.getMeasuredHeight()) {
                dVar.I0.setVisibility(8);
            }
            max = min + m;
            i = 0;
        } else {
            dVar.I0.setVisibility(0);
            d.o(dVar.I0, i);
        }
        if (!dVar.i() || max > height) {
            dVar.P0.setVisibility(8);
        } else {
            dVar.P0.setVisibility(0);
        }
        dVar.u(dVar.P0.getVisibility() == 0);
        int m2 = dVar.m(dVar.P0.getVisibility() == 0);
        int max2 = Math.max(i, min) + m2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        dVar.O0.clearAnimation();
        dVar.S0.clearAnimation();
        dVar.H0.clearAnimation();
        boolean z = this.a;
        if (z) {
            dVar.h(dVar.O0, m2);
            dVar.h(dVar.S0, min);
            dVar.h(dVar.H0, height);
        } else {
            d.o(dVar.O0, m2);
            d.o(dVar.S0, min);
            d.o(dVar.H0, height);
        }
        d.o(dVar.F0, rect.height());
        List unmodifiableList = Collections.unmodifiableList(xb8.u);
        if (unmodifiableList.isEmpty()) {
            dVar.U0.clear();
            dVar.T0.notifyDataSetChanged();
        } else if (new HashSet(dVar.U0).equals(new HashSet(unmodifiableList))) {
            dVar.T0.notifyDataSetChanged();
        } else {
            if (z) {
                OverlayListView overlayListView = dVar.S0;
                c cVar = dVar.T0;
                hashMap = new HashMap();
                int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
                for (int i3 = 0; i3 < overlayListView.getChildCount(); i3++) {
                    Object item = cVar.getItem(firstVisiblePosition + i3);
                    View childAt = overlayListView.getChildAt(i3);
                    hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
                }
            } else {
                hashMap = null;
            }
            if (z) {
                OverlayListView overlayListView2 = dVar.S0;
                c cVar2 = dVar.T0;
                hashMap2 = new HashMap();
                int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
                for (int i4 = 0; i4 < overlayListView2.getChildCount(); i4++) {
                    Object item2 = cVar2.getItem(firstVisiblePosition2 + i4);
                    View childAt2 = overlayListView2.getChildAt(i4);
                    Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                    childAt2.draw(new Canvas(createBitmap));
                    hashMap2.put(item2, new BitmapDrawable(dVar.y0.getResources(), createBitmap));
                }
            } else {
                hashMap2 = null;
            }
            ArrayList arrayList = dVar.U0;
            HashSet hashSet = new HashSet(unmodifiableList);
            hashSet.removeAll(arrayList);
            dVar.V0 = hashSet;
            HashSet hashSet2 = new HashSet(dVar.U0);
            hashSet2.removeAll(unmodifiableList);
            dVar.W0 = hashSet2;
            dVar.U0.addAll(0, dVar.V0);
            dVar.U0.removeAll(dVar.W0);
            dVar.T0.notifyDataSetChanged();
            if (z && dVar.s1) {
                if (dVar.W0.size() + dVar.V0.size() > 0) {
                    dVar.S0.setEnabled(false);
                    dVar.S0.requestLayout();
                    dVar.t1 = true;
                    dVar.S0.getViewTreeObserver().addOnGlobalLayoutListener(new a(dVar, hashMap, hashMap2));
                    return;
                }
            }
            dVar.V0 = null;
            dVar.W0 = null;
        }
    }
}

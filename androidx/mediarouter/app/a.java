package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Map a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ d c;

    public a(d dVar, HashMap hashMap, HashMap hashMap2) {
        this.c = dVar;
        this.a = hashMap;
        this.b = hashMap2;
    }

    public final void onGlobalLayout() {
        Map map;
        Map map2;
        oha oha;
        xb8 xb8;
        d dVar = this.c;
        dVar.S0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = dVar.V0;
        if (hashSet != null && dVar.W0 != null) {
            int size = hashSet.size() - dVar.W0.size();
            b bVar = new b(dVar);
            int firstVisiblePosition = dVar.S0.getFirstVisiblePosition();
            int i = 0;
            boolean z = false;
            while (true) {
                int childCount = dVar.S0.getChildCount();
                map = this.a;
                map2 = this.b;
                if (i >= childCount) {
                    break;
                }
                View childAt = dVar.S0.getChildAt(i);
                xb8 xb82 = (xb8) dVar.T0.getItem(firstVisiblePosition + i);
                Rect rect = (Rect) map.get(xb82);
                int top = childAt.getTop();
                int i2 = rect != null ? rect.top : (dVar.c1 * size) + top;
                AnimationSet animationSet = new AnimationSet(true);
                HashSet hashSet2 = dVar.V0;
                if (hashSet2 == null || !hashSet2.contains(xb82)) {
                    xb8 = xb82;
                } else {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    xb8 = xb82;
                    alphaAnimation.setDuration((long) dVar.w1);
                    animationSet.addAnimation(alphaAnimation);
                    i2 = top;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (i2 - top), 0.0f);
                translateAnimation.setDuration((long) dVar.v1);
                animationSet.addAnimation(translateAnimation);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                animationSet.setInterpolator(dVar.y1);
                if (!z) {
                    animationSet.setAnimationListener(bVar);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
                xb8 xb83 = xb8;
                map.remove(xb83);
                map2.remove(xb83);
                i++;
            }
            for (Map.Entry entry : map2.entrySet()) {
                xb8 xb84 = (xb8) entry.getKey();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
                Rect rect2 = (Rect) map.get(xb84);
                if (dVar.W0.contains(xb84)) {
                    oha = new oha(bitmapDrawable, rect2);
                    oha.h = 1.0f;
                    oha.i = 0.0f;
                    oha.e = (long) dVar.x1;
                    oha.d = dVar.y1;
                } else {
                    oha oha2 = new oha(bitmapDrawable, rect2);
                    oha2.g = dVar.c1 * size;
                    oha2.e = (long) dVar.v1;
                    oha2.d = dVar.y1;
                    oha2.m = new afc(dVar, xb84, false);
                    dVar.X0.add(xb84);
                    oha = oha2;
                }
                dVar.S0.a.add(oha);
            }
        }
    }
}

package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: q84  reason: default package */
public final class q84 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ w84 c;

    public /* synthetic */ q84(w84 w84, ArrayList arrayList, int i) {
        this.a = i;
        this.c = w84;
        this.b = arrayList;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    w84 w84 = this.c;
                    if (hasNext) {
                        v84 v84 = (v84) it.next();
                        b7c b7c = v84.a;
                        w84.getClass();
                        View view = b7c.a;
                        int i = v84.d - v84.b;
                        int i2 = v84.e - v84.c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        w84.p.add(b7c);
                        animate.setDuration(w84.e).setListener(new s84(w84, b7c, i, view, i2, animate)).start();
                    } else {
                        arrayList.clear();
                        w84.m.remove(arrayList);
                        return;
                    }
                }
            default:
                ArrayList arrayList2 = this.b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    w84 w842 = this.c;
                    if (hasNext2) {
                        b7c b7c2 = (b7c) it2.next();
                        w842.getClass();
                        View view2 = b7c2.a;
                        ViewPropertyAnimator animate2 = view2.animate();
                        w842.o.add(b7c2);
                        animate2.alpha(1.0f).setDuration(w842.c).setListener(new r84(w842, b7c2, view2, animate2)).start();
                    } else {
                        arrayList2.clear();
                        w842.l.remove(arrayList2);
                        return;
                    }
                }
        }
    }
}

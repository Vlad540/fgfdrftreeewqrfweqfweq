package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: e6c  reason: default package */
public final class e6c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ e6c(RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = recyclerView;
    }

    public final void run() {
        RecyclerView recyclerView = this.b;
        switch (this.a) {
            case 0:
                if (recyclerView.M0 && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.K0) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.P0) {
                        recyclerView.O0 = true;
                        return;
                    } else {
                        recyclerView.s();
                        return;
                    }
                } else {
                    return;
                }
            default:
                k6c k6c = recyclerView.e1;
                if (k6c != null) {
                    w84 w84 = (w84) k6c;
                    ArrayList arrayList = w84.h;
                    boolean z = !arrayList.isEmpty();
                    ArrayList arrayList2 = w84.j;
                    boolean z2 = !arrayList2.isEmpty();
                    ArrayList arrayList3 = w84.k;
                    boolean z3 = !arrayList3.isEmpty();
                    ArrayList arrayList4 = w84.i;
                    boolean z4 = !arrayList4.isEmpty();
                    if (z || z2 || z4 || z3) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            b7c b7c = (b7c) it.next();
                            View view = b7c.a;
                            ViewPropertyAnimator animate = view.animate();
                            w84.q.add(b7c);
                            animate.setDuration(w84.d).alpha(0.0f).setListener(new r84(w84, b7c, animate, view)).start();
                            arrayList = arrayList;
                        }
                        arrayList.clear();
                        if (z2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            w84.m.add(arrayList5);
                            arrayList2.clear();
                            q84 q84 = new q84(w84, arrayList5, 0);
                            if (z) {
                                View view2 = ((v84) arrayList5.get(0)).a.a;
                                long j = w84.d;
                                WeakHashMap weakHashMap = eaf.a;
                                view2.postOnAnimationDelayed(q84, j);
                            } else {
                                q84.run();
                            }
                        }
                        if (z3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            w84.n.add(arrayList6);
                            arrayList3.clear();
                            p36 p36 = new p36((Object) w84, (Object) arrayList6, false, 4);
                            if (z) {
                                View view3 = ((u84) arrayList6.get(0)).a.a;
                                long j2 = w84.d;
                                WeakHashMap weakHashMap2 = eaf.a;
                                view3.postOnAnimationDelayed(p36, j2);
                            } else {
                                p36.run();
                            }
                        }
                        if (z4) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            w84.l.add(arrayList7);
                            arrayList4.clear();
                            q84 q842 = new q84(w84, arrayList7, 1);
                            if (z || z2 || z3) {
                                long j3 = 0;
                                long j4 = z ? w84.d : 0;
                                long j5 = z2 ? w84.e : 0;
                                if (z3) {
                                    j3 = w84.f;
                                }
                                View view4 = ((b7c) arrayList7.get(0)).a;
                                WeakHashMap weakHashMap3 = eaf.a;
                                view4.postOnAnimationDelayed(q842, Math.max(j5, j3) + j4);
                            } else {
                                q842.run();
                            }
                        }
                    }
                }
                recyclerView.C1 = false;
                return;
        }
    }
}

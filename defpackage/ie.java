package defpackage;

import android.graphics.Bitmap;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import one.me.rlottie.RLottie;

/* renamed from: ie  reason: default package */
public final /* synthetic */ class ie implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ ie(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    public final void run() {
        gi4 gi4;
        switch (this.a) {
            case 0:
                ((ScheduledExecutorService) ((r7e) ez3.e.f.b).getValue()).schedule(new ie(this.b, 1), 36, TimeUnit.MILLISECONDS);
                return;
            case 1:
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i < arrayList.size()) {
                        Bitmap bitmap = (Bitmap) ((WeakReference) arrayList.get(i)).get();
                        ((WeakReference) arrayList.get(i)).clear();
                        if (bitmap != null && !bitmap.isRecycled()) {
                            try {
                                bitmap.recycle();
                            } catch (Throwable th) {
                                RLottie.getLogger().o(th);
                            }
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            case 2:
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((Bitmap) it.next()).recycle();
                }
                return;
            case 3:
                ki4 ki4 = ki4.k;
                ki4.getClass();
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    if (i2 < arrayList2.size()) {
                        Runnable runnable = (Runnable) arrayList2.get(i2);
                        if (runnable != null) {
                            ArrayList arrayList3 = ki4.c;
                            boolean isEmpty = arrayList3.isEmpty();
                            ArrayList arrayList4 = ki4.a;
                            if (!isEmpty && (ki4.g / 2 <= arrayList3.size() || (arrayList4.isEmpty() && ki4.e >= ki4.d))) {
                                gi4 = (gi4) arrayList3.remove(0);
                            } else if (arrayList4.isEmpty()) {
                                gi4 = new gi4("rlottie-bg-pool" + ki4.f + "-" + ji4.j.nextInt());
                                gi4.setPriority(10);
                                ki4.e = ki4.e + 1;
                            } else {
                                gi4 = (gi4) arrayList4.remove(0);
                            }
                            if (!ki4.h) {
                                ((ScheduledExecutorService) ((r7e) ez3.e.f.b).getValue()).schedule(ki4.i, 30000, TimeUnit.MILLISECONDS);
                                ki4.h = true;
                            }
                            ki4.g++;
                            arrayList3.add(gi4);
                            SparseIntArray sparseIntArray = ki4.b;
                            sparseIntArray.put(gi4.o, sparseIntArray.get(gi4.o, 0) + 1);
                            if (gi4.getPriority() != 10) {
                                gi4.setPriority(10);
                            }
                            gi4.b(new g5((Object) ki4, (Object) runnable, (Object) gi4, 21));
                        }
                        i2++;
                    } else {
                        arrayList2.clear();
                        je.d(new ie(arrayList2, 4));
                        return;
                    }
                }
                break;
            default:
                ki4.l.add(this.b);
                return;
        }
    }
}

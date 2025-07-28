package defpackage;

import android.util.SparseIntArray;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Locale;
import java.util.NoSuchElementException;
import one.me.rlottie.RLottie;

/* renamed from: ji4  reason: default package */
public final class ji4 {
    public static final SecureRandom j = new SecureRandom();
    public final LinkedList a = new LinkedList();
    public final SparseIntArray b = new SparseIntArray();
    public final LinkedList c = new LinkedList();
    public final int d = 4;
    public int e;
    public final int f = j.nextInt();
    public int g;
    public boolean h;
    public final re i = new re(16, this);

    public final gi4 a() {
        gi4 gi4 = new gi4("rlottie-pool-" + this.f + "-" + j.nextInt());
        gi4.setPriority(10);
        return gi4;
    }

    public final void b(Runnable runnable) {
        gi4 gi4;
        LinkedList linkedList = this.c;
        boolean isEmpty = linkedList.isEmpty();
        LinkedList linkedList2 = this.a;
        int i2 = this.d;
        if (!isEmpty && (this.g / 2 <= linkedList.size() || (linkedList2.isEmpty() && this.e >= i2))) {
            try {
                gi4 = (gi4) linkedList.removeFirst();
            } catch (NoSuchElementException e2) {
                RLottie.getLogger().o(e2);
                gi4 = null;
            }
        } else if (linkedList2.isEmpty()) {
            gi4 = a();
            this.e++;
        } else {
            gi4 = (gi4) linkedList2.removeFirst();
        }
        if (!this.h) {
            je.e(this.i, 30000);
            this.h = true;
        }
        if (gi4 == null) {
            gg9 logger = RLottie.getLogger();
            Locale locale = Locale.US;
            int size = linkedList.size();
            int i3 = this.g;
            int size2 = linkedList2.size();
            int i4 = this.e;
            StringBuilder i5 = rf0.i("DispatchQueuePool: queue is null – busyQueues.size=", size, ", totalTasksCount=", i3, ", queues.size=");
            th2.l(i5, size2, ", createdCount=", i4, ", maxCount=");
            i5.append(i2);
            logger.j(i5.toString(), new IllegalStateException("queue is null"));
            gi4 = a();
            this.e++;
        }
        this.g++;
        linkedList.add(gi4);
        SparseIntArray sparseIntArray = this.b;
        int i6 = gi4.o;
        sparseIntArray.put(i6, sparseIntArray.get(i6, 0) + 1);
        if (gi4.getPriority() != 10) {
            gi4.setPriority(10);
        }
        gi4.b(new g5((Object) this, (Object) runnable, (Object) gi4, 20));
    }
}

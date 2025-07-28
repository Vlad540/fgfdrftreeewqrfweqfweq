package defpackage;

import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: kn4  reason: default package */
public final class kn4 {
    public static final kn4 b = new kn4();
    public static final boolean c = true;
    public final ArrayBlockingQueue a = new ArrayBlockingQueue(20);

    public final void a(jn4 jn4) {
        if (c) {
            int i = 5;
            while (true) {
                ArrayBlockingQueue arrayBlockingQueue = this.a;
                if (!arrayBlockingQueue.offer(jn4) && i > 0) {
                    arrayBlockingQueue.poll();
                    i--;
                } else {
                    return;
                }
            }
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}

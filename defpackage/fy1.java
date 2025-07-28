package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: fy1  reason: default package */
public abstract class fy1 implements j1e {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public by1 d;
    public long e;
    public long f;
    public long g;

    public fy1() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new n24(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            zx1 zx1 = new zx1(1, (Object) this);
            dy1 dy1 = new dy1();
            dy1.w0 = zx1;
            arrayDeque.add(dy1);
        }
        this.c = new PriorityQueue();
        this.g = -9223372036854775807L;
    }

    public final void a(long j) {
        this.e = j;
    }

    public final void b(long j) {
        this.g = j;
    }

    public final void d(o1e o1e) {
        oyb.d(o1e == this.d);
        by1 by1 = (by1) o1e;
        long j = this.g;
        if (j == -9223372036854775807L || by1.Z >= j) {
            long j2 = this.f;
            this.f = 1 + j2;
            by1.A0 = j2;
            this.c.add(by1);
        } else {
            by1.v();
            this.a.add(by1);
        }
        this.d = null;
    }

    public final Object e() {
        oyb.k(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        by1 by1 = (by1) arrayDeque.pollFirst();
        this.d = by1;
        return by1;
    }

    public abstract gy1 f();

    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0;
        this.e = 0;
        while (true) {
            PriorityQueue priorityQueue = this.c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            by1 by1 = (by1) priorityQueue.poll();
            int i = oze.a;
            by1.v();
            arrayDeque.add(by1);
        }
        by1 by12 = this.d;
        if (by12 != null) {
            by12.v();
            arrayDeque.add(by12);
            this.d = null;
        }
    }

    public abstract void g(by1 by1);

    /* renamed from: h */
    public q1e c() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.c;
            if (priorityQueue.isEmpty()) {
                break;
            }
            int i = oze.a;
            if (((by1) priorityQueue.peek()).Z > this.e) {
                break;
            }
            by1 by1 = (by1) priorityQueue.poll();
            boolean f2 = by1.f(4);
            ArrayDeque arrayDeque2 = this.a;
            if (f2) {
                q1e q1e = (q1e) arrayDeque.pollFirst();
                q1e.a(4);
                by1.v();
                arrayDeque2.add(by1);
                return q1e;
            }
            g(by1);
            if (i()) {
                gy1 f3 = f();
                q1e q1e2 = (q1e) arrayDeque.pollFirst();
                long j = by1.Z;
                q1e2.c = j;
                q1e2.X = f3;
                q1e2.Y = j;
                by1.v();
                arrayDeque2.add(by1);
                return q1e2;
            }
            by1.v();
            arrayDeque2.add(by1);
        }
        return null;
    }

    public abstract boolean i();

    public void release() {
    }
}

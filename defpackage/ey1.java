package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: ey1  reason: default package */
public abstract class ey1 implements i1e {
    public long X;
    public long Y;
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public ay1 o;

    public ey1() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new m24(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            zx1 zx1 = new zx1(0, (Object) this);
            cy1 cy1 = new cy1();
            cy1.Z = zx1;
            arrayDeque.add(cy1);
        }
        this.c = new PriorityQueue();
    }

    public final void a(long j) {
        this.X = j;
    }

    public abstract p87 b();

    public abstract void d(ay1 ay1);

    public final Object e() {
        swb.h(this.o == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        ay1 ay1 = (ay1) arrayDeque.pollFirst();
        this.o = ay1;
        return ay1;
    }

    /* renamed from: f */
    public p1e c() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.c;
            if (priorityQueue.isEmpty()) {
                break;
            }
            int i = mze.a;
            if (((ay1) priorityQueue.peek()).Y > this.X) {
                break;
            }
            ay1 ay1 = (ay1) priorityQueue.poll();
            boolean f = ay1.f(4);
            ArrayDeque arrayDeque2 = this.a;
            if (f) {
                p1e p1e = (p1e) arrayDeque.pollFirst();
                p1e.a(4);
                ay1.v();
                arrayDeque2.add(ay1);
                return p1e;
            }
            d(ay1);
            if (g()) {
                p87 b2 = b();
                p1e p1e2 = (p1e) arrayDeque.pollFirst();
                p1e2.w(ay1.Y, b2, Long.MAX_VALUE);
                ay1.v();
                arrayDeque2.add(ay1);
                return p1e2;
            }
            ay1.v();
            arrayDeque2.add(ay1);
        }
        return null;
    }

    public void flush() {
        ArrayDeque arrayDeque;
        this.Y = 0;
        this.X = 0;
        while (true) {
            PriorityQueue priorityQueue = this.c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            ay1 ay1 = (ay1) priorityQueue.poll();
            int i = mze.a;
            ay1.v();
            arrayDeque.add(ay1);
        }
        ay1 ay12 = this.o;
        if (ay12 != null) {
            ay12.v();
            arrayDeque.add(ay12);
            this.o = null;
        }
    }

    public abstract boolean g();

    public final void l(n1e n1e) {
        swb.e(n1e == this.o);
        ay1 ay1 = (ay1) n1e;
        if (ay1.f(Integer.MIN_VALUE)) {
            ay1.v();
            this.a.add(ay1);
        } else {
            long j = this.Y;
            this.Y = 1 + j;
            ay1.z0 = j;
            this.c.add(ay1);
        }
        this.o = null;
    }

    public void release() {
    }
}

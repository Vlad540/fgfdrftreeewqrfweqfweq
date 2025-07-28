package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: yk9  reason: default package */
public final class yk9 implements pp7 {
    public final r7e a;
    public final r7e b;
    public final xk9 c;

    public yk9(t97 t97, t97 t972, t97 t973) {
        this.a = new r7e(new qo1(t972, t973, 3));
        r7e r7e = new r7e(new zu4((Object) this, t97, 19));
        this.b = r7e;
        this.c = (xk9) r7e.getValue();
    }

    public final void a() {
        ((xk9) this.b.getValue()).a();
    }

    /* JADX INFO: finally extract failed */
    public final void b(long j) {
        vk9 vk9 = (vk9) ((xk9) this.b.getValue());
        if (vk9.e()) {
            ReentrantLock reentrantLock = vk9.f;
            reentrantLock.lock();
            try {
                vk9.e.a(j);
                reentrantLock.unlock();
                vk9.d();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void c(zb9 zb9) {
        vk9 vk9 = (vk9) ((xk9) this.b.getValue());
        vk9.getClass();
        if (!zb9.i() && vk9.e()) {
            ReentrantLock reentrantLock = vk9.f;
            reentrantLock.lock();
            try {
                long[] jArr = zb9.b;
                long[] jArr2 = zb9.a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr2[i];
                        if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    vk9.e.a(jArr[(i << 3) + i3]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                reentrantLock.unlock();
                vk9.d();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void d(Collection collection) {
        vk9 vk9 = (vk9) ((xk9) this.b.getValue());
        vk9.getClass();
        if (!collection.isEmpty() && vk9.e()) {
            ReentrantLock reentrantLock = vk9.f;
            reentrantLock.lock();
            try {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    vk9.e.a(((Number) it.next()).longValue());
                }
                reentrantLock.unlock();
                vk9.d();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }
}

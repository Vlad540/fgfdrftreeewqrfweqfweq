package defpackage;

import android.graphics.Color;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: cz3  reason: default package */
public final class cz3 extends Thread {
    public final AtomicInteger X;
    public ij Y;
    public int Z;
    public final h2d a;
    public final int b = 30;
    public az3 c;
    public final ConcurrentLinkedQueue o;
    public final ReentrantLock w0;
    public final Condition x0;
    public final ReentrantLock y0;
    public volatile boolean z0;

    public cz3(az3 az3, h2d h2d) {
        this.a = h2d;
        this.c = az3;
        this.o = new ConcurrentLinkedQueue();
        this.X = new AtomicInteger(0);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.w0 = reentrantLock;
        this.x0 = reentrantLock.newCondition();
        this.y0 = new ReentrantLock();
    }

    public final void run() {
        byte[] bArr;
        int i;
        int i2;
        float[] fArr;
        ReentrantLock reentrantLock;
        loop0:
        while (true) {
            boolean z = true;
            if (!(!this.z0)) {
                break;
            }
            ReentrantLock reentrantLock2 = this.y0;
            reentrantLock2.lock();
            try {
                az3 az3 = this.c;
                boolean z2 = az3 == null;
                long bufferedAmount = az3 != null ? az3.a.bufferedAmount() : 0;
                if (z2) {
                    break;
                }
                while (true) {
                    if ((!this.z0) && (bufferedAmount >= 8000000 || (this.Y == null && this.o.isEmpty()))) {
                        ReentrantLock reentrantLock3 = this.w0;
                        reentrantLock3.lock();
                        try {
                            this.x0.await(50, TimeUnit.MILLISECONDS);
                            reentrantLock3.unlock();
                            reentrantLock = this.y0;
                            reentrantLock.lock();
                            az3 az32 = this.c;
                            z2 = az32 == null;
                            bufferedAmount = az32 != null ? az32.a.bufferedAmount() : 0;
                            reentrantLock.unlock();
                            continue;
                        } catch (Throwable unused) {
                        }
                        if (z2) {
                            break loop0;
                        }
                    }
                }
                if (!(!this.z0)) {
                    break;
                }
                if (this.Y == null) {
                    ij ijVar = (ij) this.o.poll();
                    this.Y = ijVar;
                    if (ijVar == null) {
                        continue;
                    } else {
                        this.X.decrementAndGet();
                    }
                }
                ij ijVar2 = this.Y;
                if (ijVar2 != null) {
                    int i3 = this.Z;
                    this.Z = i3 + 1;
                    int i4 = ijVar2.b;
                    yh yhVar = ijVar2.c;
                    if (ijVar2.a == 1) {
                        boolean z3 = yhVar instanceof ai;
                        if (yhVar instanceof yh) {
                            fArr = null;
                            yhVar.getClass();
                        } else if (z3) {
                            fArr = new float[0];
                        } else if (yhVar instanceof zh) {
                            throw new IllegalStateException("Internal error AnimojiSendDataPackage");
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        bArr = new byte[((fArr.length * 4) + 10)];
                        ByteBuffer wrap = ByteBuffer.wrap(bArr);
                        byte b2 = z3 ? (byte) 1 : 0;
                        wrap.put((byte) 1);
                        wrap.putShort((short) i3);
                        wrap.putInt(i4);
                        wrap.putShort(0);
                        wrap.put(b2);
                        wrap.order(ByteOrder.LITTLE_ENDIAN);
                        for (float putFloat : fArr) {
                            wrap.putFloat(putFloat);
                        }
                    } else {
                        boolean z4 = yhVar instanceof yh;
                        if (!z4) {
                            if (yhVar instanceof zh) {
                                i = 3;
                            } else if (yhVar instanceof ai) {
                                i = 0;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            byte[] bArr2 = new byte[(i + 12)];
                            ByteBuffer wrap2 = ByteBuffer.wrap(bArr2);
                            if (z4) {
                                i2 = 0;
                            } else if (yhVar instanceof zh) {
                                i2 = 2;
                            } else if (yhVar instanceof ai) {
                                i2 = 1;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            wrap2.put((byte) 2);
                            wrap2.putShort((short) i3);
                            wrap2.putInt(i4);
                            wrap2.putInt(0);
                            wrap2.put((byte) i2);
                            wrap2.order(ByteOrder.LITTLE_ENDIAN);
                            if (!z4) {
                                if (yhVar instanceof zh) {
                                    zh zhVar = (zh) yhVar;
                                    wrap2.put((byte) Color.red(zhVar.f));
                                    wrap2.put((byte) Color.green(zhVar.f));
                                    wrap2.put((byte) Color.blue(zhVar.f));
                                } else {
                                    hhd.f(yhVar, ai.f);
                                }
                                bArr = bArr2;
                            } else {
                                yhVar.getClass();
                                throw null;
                            }
                        } else {
                            yhVar.getClass();
                            throw null;
                        }
                    }
                    ReentrantLock reentrantLock4 = this.y0;
                    reentrantLock4.lock();
                    try {
                        if (this.c != null) {
                            z = false;
                        }
                        ((AtomicInteger) this.a.a).addAndGet(bArr.length);
                        az3 az33 = this.c;
                        if (az33 != null) {
                            az33.e(2, bArr);
                        }
                        ((AtomicInteger) this.a.b).incrementAndGet();
                        this.Y = null;
                        reentrantLock4.unlock();
                        if (z) {
                            break;
                        }
                    } catch (Throwable th) {
                        reentrantLock4.unlock();
                        throw th;
                    }
                } else {
                    continue;
                }
            } finally {
                reentrantLock2.unlock();
            }
        }
        this.Y = null;
        this.o.clear();
    }
}

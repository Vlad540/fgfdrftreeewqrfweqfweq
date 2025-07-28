package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007j\u0002`\b2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR:\u0010\u000f\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007j\u0002`\b0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/internal/WeakMapCtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "<init>", "()V", "Ljava/lang/Class;", "", "key", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "get", "(Ljava/lang/Class;)Lu16;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "cacheLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/WeakHashMap;", "exceptionCtors", "Ljava/util/WeakHashMap;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
final class WeakMapCtorCache extends CtorCache {
    public static final WeakMapCtorCache INSTANCE = new WeakMapCtorCache();
    private static final ReentrantReadWriteLock cacheLock = new ReentrantReadWriteLock();
    private static final WeakHashMap<Class<? extends Throwable>, u16> exceptionCtors = new WeakHashMap<>();

    private WeakMapCtorCache() {
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public defpackage.u16 get(java.lang.Class<? extends java.lang.Throwable> r6) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = cacheLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r5.readLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, u16> r1 = exceptionCtors     // Catch:{ all -> 0x006e }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x006e }
            u16 r1 = (defpackage.u16) r1     // Catch:{ all -> 0x006e }
            r0.unlock()
            if (r1 == 0) goto L_0x0017
            return r1
        L_0x0017:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r5.readLock()
            int r1 = r5.getWriteHoldCount()
            r2 = 0
            if (r1 != 0) goto L_0x0027
            int r1 = r5.getReadHoldCount()
            goto L_0x0028
        L_0x0027:
            r1 = r2
        L_0x0028:
            r3 = r2
        L_0x0029:
            if (r3 >= r1) goto L_0x0031
            r0.unlock()
            int r3 = r3 + 1
            goto L_0x0029
        L_0x0031:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r5.writeLock()
            r5.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, u16> r3 = exceptionCtors     // Catch:{ all -> 0x0061 }
            java.lang.Object r4 = r3.get(r6)     // Catch:{ all -> 0x0061 }
            u16 r4 = (defpackage.u16) r4     // Catch:{ all -> 0x0061 }
            if (r4 == 0) goto L_0x004e
        L_0x0042:
            if (r2 >= r1) goto L_0x004a
            r0.lock()
            int r2 = r2 + 1
            goto L_0x0042
        L_0x004a:
            r5.unlock()
            return r4
        L_0x004e:
            u16 r4 = kotlinx.coroutines.internal.ExceptionsConstructorKt.createConstructor(r6)     // Catch:{ all -> 0x0061 }
            r3.put(r6, r4)     // Catch:{ all -> 0x0061 }
        L_0x0055:
            if (r2 >= r1) goto L_0x005d
            r0.lock()
            int r2 = r2 + 1
            goto L_0x0055
        L_0x005d:
            r5.unlock()
            return r4
        L_0x0061:
            r6 = move-exception
        L_0x0062:
            if (r2 >= r1) goto L_0x006a
            r0.lock()
            int r2 = r2 + 1
            goto L_0x0062
        L_0x006a:
            r5.unlock()
            throw r6
        L_0x006e:
            r5 = move-exception
            r0.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.WeakMapCtorCache.get(java.lang.Class):u16");
    }
}

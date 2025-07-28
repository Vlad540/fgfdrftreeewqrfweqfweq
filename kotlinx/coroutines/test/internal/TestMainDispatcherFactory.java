package kotlinx.coroutines.test.internal;

import kotlin.Metadata;
import kotlinx.coroutines.internal.MainDispatcherFactory;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/test/internal/TestMainDispatcherFactory;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "<init>", "()V", "", "allFactories", "Lzr7;", "createDispatcher", "(Ljava/util/List;)Lzr7;", "", "getLoadPriority", "()I", "loadPriority", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
public final class TestMainDispatcherFactory implements MainDispatcherFactory {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.internal.MainDispatcherFactory} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.zr7 createDispatcher(java.util.List r5) {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0009:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x001c
            java.lang.Object r1 = r5.next()
            r2 = r1
            kotlinx.coroutines.internal.MainDispatcherFactory r2 = (kotlinx.coroutines.internal.MainDispatcherFactory) r2
            if (r2 == r4) goto L_0x0009
            r0.add(r1)
            goto L_0x0009
        L_0x001c:
            java.util.Iterator r4 = r0.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L_0x0028
            r4 = 0
            goto L_0x0051
        L_0x0028:
            java.lang.Object r5 = r4.next()
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L_0x0034
        L_0x0032:
            r4 = r5
            goto L_0x0051
        L_0x0034:
            r1 = r5
            kotlinx.coroutines.internal.MainDispatcherFactory r1 = (kotlinx.coroutines.internal.MainDispatcherFactory) r1
            int r1 = r1.getLoadPriority()
        L_0x003b:
            java.lang.Object r2 = r4.next()
            r3 = r2
            kotlinx.coroutines.internal.MainDispatcherFactory r3 = (kotlinx.coroutines.internal.MainDispatcherFactory) r3
            int r3 = r3.getLoadPriority()
            if (r1 >= r3) goto L_0x004a
            r5 = r2
            r1 = r3
        L_0x004a:
            boolean r2 = r4.hasNext()
            if (r2 != 0) goto L_0x003b
            goto L_0x0032
        L_0x0051:
            kotlinx.coroutines.internal.MainDispatcherFactory r4 = (kotlinx.coroutines.internal.MainDispatcherFactory) r4
            if (r4 != 0) goto L_0x0057
            kotlinx.coroutines.internal.MissingMainCoroutineDispatcherFactory r4 = kotlinx.coroutines.internal.MissingMainCoroutineDispatcherFactory.INSTANCE
        L_0x0057:
            zr7 r4 = kotlinx.coroutines.internal.MainDispatchersKt.tryCreateDispatcher(r4, r0)
            vee r5 = new vee
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.test.internal.TestMainDispatcherFactory.createDispatcher(java.util.List):zr7");
    }

    public int getLoadPriority() {
        return Integer.MAX_VALUE;
    }

    public String hintOnError() {
        return MainDispatcherFactory.DefaultImpls.hintOnError(this);
    }
}

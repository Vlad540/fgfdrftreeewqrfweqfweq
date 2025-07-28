package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherLoader;", "", "<init>", "()V", "Lzr7;", "loadMainDispatcher", "()Lzr7;", "", "FAST_SERVICE_LOADER_ENABLED", "Z", "dispatcher", "Lzr7;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
public final class MainDispatcherLoader {
    private static final boolean FAST_SERVICE_LOADER_ENABLED = false;
    public static final MainDispatcherLoader INSTANCE;
    public static final zr7 dispatcher;

    static {
        MainDispatcherLoader mainDispatcherLoader = new MainDispatcherLoader();
        INSTANCE = mainDispatcherLoader;
        SystemPropsKt.systemProp("kotlinx.coroutines.fast.service.loader", true);
        dispatcher = mainDispatcherLoader.loadMainDispatcher();
    }

    private MainDispatcherLoader() {
    }

    private final zr7 loadMainDispatcher() {
        Object obj;
        Class<MainDispatcherFactory> cls = MainDispatcherFactory.class;
        try {
            List U = myc.U(new le3(new es(7, ServiceLoader.load(cls, cls.getClassLoader()).iterator())));
            Iterator it = U.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) obj).getLoadPriority();
                    do {
                        Object next = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            obj = next;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) obj;
            if (mainDispatcherFactory != null) {
                zr7 tryCreateDispatcher = MainDispatchersKt.tryCreateDispatcher(mainDispatcherFactory, U);
                if (tryCreateDispatcher != null) {
                    return tryCreateDispatcher;
                }
            }
            return MainDispatchersKt.createMissingDispatcher$default((Throwable) null, (String) null, 3, (Object) null);
        } catch (Throwable th) {
            return MainDispatchersKt.createMissingDispatcher$default(th, (String) null, 2, (Object) null);
        }
    }
}

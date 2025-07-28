package defpackage;

import bolts.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: kde  reason: default package */
public final class kde implements dr3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kde(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                jde jde = (jde) this.b;
                jde.getClass();
                boolean isCancelled = task.isCancelled();
                wde wde = jde.b;
                if (isCancelled) {
                    wde.a();
                    return null;
                } else if (task.isFaulted()) {
                    wde.b(task.getError());
                    return null;
                } else {
                    wde.c(task.getResult());
                    return null;
                }
            default:
                Collection<Task> collection = (Collection) this.b;
                if (collection.size() == 0) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (Task result : collection) {
                    arrayList.add(result.getResult());
                }
                return arrayList;
        }
    }
}

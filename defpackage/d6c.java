package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: d6c  reason: default package */
public final class d6c implements dc7 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ d6c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void m(nc7 nc7, nb7 nb7) {
        View view;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                if (nb7 == nb7.ON_CREATE) {
                    nc7.R().f(this);
                    zkc zkc = (zkc) obj;
                    Bundle c = zkc.y().c("androidx.savedstate.Restarter");
                    if (c != null) {
                        ArrayList<String> stringArrayList = c.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            for (String next : stringArrayList) {
                                try {
                                    Class<? extends U> asSubclass = Class.forName(next, false, d6c.class.getClassLoader()).asSubclass(xkc.class);
                                    try {
                                        Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor((Class[]) null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            xkc xkc = (xkc) declaredConstructor.newInstance((Object[]) null);
                                            if (zkc instanceof cbf) {
                                                bbf v = ((cbf) zkc).v();
                                                mm y = zkc.y();
                                                v.getClass();
                                                LinkedHashMap linkedHashMap = v.a;
                                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                                while (it.hasNext()) {
                                                    pc7 R = zkc.R();
                                                    ukc ukc = (ukc) ((uaf) linkedHashMap.get((String) it.next())).c("androidx.lifecycle.savedstate.vm.tag");
                                                    if (ukc != null && !ukc.c) {
                                                        ukc.a(y, R);
                                                        a06.K(y, R);
                                                    }
                                                }
                                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                                    y.g();
                                                }
                                            } else {
                                                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                                            }
                                        } catch (Exception e) {
                                            throw new RuntimeException(rf0.h("Failed to instantiate ", next), e);
                                        }
                                    } catch (NoSuchMethodException e2) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                                    }
                                } catch (ClassNotFoundException e3) {
                                    throw new RuntimeException(wn6.i("Class ", next, " wasn't found"), e3);
                                }
                            }
                            return;
                        }
                        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    }
                    return;
                }
                throw new AssertionError("Next event must be ON_CREATE");
            case 1:
                e83 e83 = (e83) obj;
                if (e83.X == null) {
                    a83 a83 = (a83) e83.getLastNonConfigurationInstance();
                    if (a83 != null) {
                        e83.X = a83.b;
                    }
                    if (e83.X == null) {
                        e83.X = new bbf();
                    }
                }
                e83.a.f(this);
                return;
            case 2:
                new HashMap();
                s66[] s66Arr = (s66[]) obj;
                if (s66Arr.length > 0) {
                    s66 s66 = s66Arr[0];
                    throw null;
                } else if (s66Arr.length > 0) {
                    s66 s662 = s66Arr[0];
                    throw null;
                } else {
                    return;
                }
            case 3:
                if (nb7 == nb7.ON_DESTROY) {
                    b75 b75 = (b75) obj;
                    b75.a = null;
                    LinkedList<a75> linkedList = b75.b;
                    for (a75 a75 : linkedList) {
                        a75.b.invoke();
                    }
                    linkedList.clear();
                    return;
                }
                return;
            case 4:
                if (nb7 == nb7.ON_STOP && (view = ((a) obj).Y0) != null) {
                    view.cancelPendingInputEvents();
                    return;
                }
                return;
            case 5:
                ((mu7) obj).b(false);
                return;
            case 6:
                udd.p("ez2", "onStateChanged: new event = " + nb7, new Object[0]);
                if (nb7 == nb7.ON_RESUME) {
                    ez2 ez2 = (ez2) obj;
                    g37 g37 = (g37) ez2.X;
                    if (g37 != null) {
                        g37.cancel((CancellationException) null);
                    }
                    int i = ((bv6) ((nfc) ez2.c).b).D0.get();
                    udd.p("ez2", "onStateChanged: prevAllMediaCount = " + i, new Object[0]);
                    ez2.X = xs7.E((ou3) ez2.a, (ku3) ez2.b, (ru3) null, new bt7(ez2, i, (Continuation) null), 2);
                    return;
                }
                return;
            default:
                if (nb7 == nb7.ON_CREATE) {
                    nc7.R().f(this);
                    ((wkc) obj).b();
                    return;
                }
                throw new IllegalStateException(("Next event must be ON_CREATE, it was " + nb7).toString());
        }
    }
}

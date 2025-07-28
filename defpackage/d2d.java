package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: d2d  reason: default package */
public final class d2d {
    public final SessionConfiguration a;

    public d2d(int i, ArrayList arrayList, Executor executor, ys1 ys1) {
        fha fha;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((OutputConfiguration) ((fha) it.next()).a.c());
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(i, arrayList2, executor, ys1);
        this.a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList3 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration next : outputConfigurations) {
            if (next == null) {
                fha = null;
            } else {
                fha = new fha(Build.VERSION.SDK_INT >= 33 ? new hha(next) : new hha(new gha(next)));
            }
            arrayList3.add(fha);
        }
        Collections.unmodifiableList(arrayList3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d2d)) {
            return false;
        }
        return Objects.equals(this.a, ((d2d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

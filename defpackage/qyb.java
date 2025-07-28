package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Set;

/* renamed from: qyb  reason: default package */
public interface qyb {
    static void a(ol olVar, uae uae) {
        pl plVar = olVar.c;
        if (plVar == null) {
            plVar = null;
        }
        if (((Set) ((vqc) ((xzc) plVar.d.getValue())).j.getValue()).contains(uae.b)) {
            udd.R(olVar.getClass().getName(), (IOException) null, "detect common reaction error, call onMaxFailCount() for task", Arrays.copyOf(new Object[]{uae}, 1));
            ((tna) olVar).f();
        }
    }
}

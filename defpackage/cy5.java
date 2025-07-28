package defpackage;

import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.strictmode.Violation;

/* renamed from: cy5  reason: default package */
public abstract class cy5 {
    public static final by5 a = by5.a;

    public static by5 a(a aVar) {
        while (aVar != null) {
            if (aVar.p0()) {
                aVar.g0();
            }
            aVar = aVar.M0;
        }
        return a;
    }

    public static void b(Violation violation) {
        if (Log.isLoggable("FragmentManager", 3)) {
            violation.a.getClass();
        }
    }

    public static final void c(a aVar, String str) {
        b(new Violation(aVar, "Attempting to reuse fragment " + aVar + " with previous ID " + str));
        a(aVar).getClass();
    }
}

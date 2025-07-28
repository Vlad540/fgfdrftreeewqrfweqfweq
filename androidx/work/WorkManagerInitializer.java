package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer implements tw6 {
    public static final String a = a24.e0("WrkMgrInitializer");

    public final List a() {
        return Collections.emptyList();
    }

    public final Object b(Context context) {
        a24.B().t(a, "Initializing WorkManager with default configuration.");
        itf.e(context, new sa3(new di9()));
        return itf.d(context);
    }
}

package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class EmojiCompatInitializer implements tw6 {
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    public final /* bridge */ /* synthetic */ Object b(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object obj;
        tt5 tt5 = new tt5(new gvf(context));
        tt5.g = 1;
        pt4.c(tt5);
        jj7 A = jj7.A(context);
        Class<ProcessLifecycleInitializer> cls = ProcessLifecycleInitializer.class;
        A.getClass();
        synchronized (jj7.w0) {
            try {
                obj = ((HashMap) A.a).get(cls);
                if (obj == null) {
                    obj = A.s(cls, new HashSet());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        pc7 R = ((nc7) obj).R();
        R.a(new rt4(this, R));
    }
}

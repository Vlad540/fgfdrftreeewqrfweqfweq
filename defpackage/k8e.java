package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* renamed from: k8e  reason: default package */
public final class k8e {
    public static final String b = a24.e0("SystemJobInfoConverter");
    public final ComponentName a;

    public k8e(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}

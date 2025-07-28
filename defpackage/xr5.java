package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;

/* renamed from: xr5  reason: default package */
public final class xr5 extends RecyclerView {
    public final mr5 Z1;

    /* JADX WARNING: type inference failed for: r3v1, types: [mr5, f6c] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, q6c] */
    public xr5(Context context, ExecutorService executorService) {
        super(context, (AttributeSet) null);
        ? mr5 = new mr5(executorService);
        this.Z1 = mr5;
        ? obj = new Object();
        setHasFixedSize(true);
        setLayoutManager(new LinearLayoutManager(0, false));
        l(obj);
        setAdapter(mr5);
        j(new vi2(a24.X(((float) 12) * dh4.c().getDisplayMetrics().density), a24.X(((float) 8) * dh4.c().getDisplayMetrics().density), 2));
    }

    public final void setListener(vr5 vr5) {
        this.Z1.Y = vr5;
    }
}

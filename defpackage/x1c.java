package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: x1c  reason: default package */
public final class x1c extends RecyclerView {
    public final mr5 Z1;
    public final GradientDrawable a2;

    /* JADX WARNING: type inference failed for: r1v0, types: [mr5, f6c] */
    public x1c(Context context, ur2 ur2) {
        super(context, (AttributeSet) null);
        ? mr5 = new mr5((Object) ur2, nqc.a.p().a(), 12);
        this.Z1 = mr5;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setSize(a24.X(((float) 1) * dh4.c().getDisplayMetrics().density), a24.W(((double) dh4.c().getDisplayMetrics().density) * 0.5d));
        this.a2 = gradientDrawable;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setLayoutManager(new LinearLayoutManager(0, false));
        setAdapter(mr5);
        setItemAnimator((k6c) null);
        j(new iq(8));
        jj4 jj4 = new jj4(context);
        jj4.c = gradientDrawable;
        j(jj4);
        urd.B(new wua(3, (Continuation) null, 7), this);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [mr5, ig7] */
    public final void setContacts(List<t1c> list) {
        this.Z1.E(list);
    }
}
